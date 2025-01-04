import sys
from antlr4 import *
from MathLangLexer import MathLangLexer
from MathLangParser import MathLangParser
from antlr4.tree.Tree import ParseTreeWalker
from add_func import write_to_file
from semantic_analysis import MySemanticListener
llvm_code = "; Module Declaration\n"
llvm_code += "declare i32 @printf(i8*, ...)\n\n"
llvm_code += "define i32 @main() {\n"

temp_var_count = 0
variables = {}

def generate_temp_var():
    global temp_var_count
    temp_var_count += 1
    return f"%tmp{temp_var_count}"

def compile_expression(ctx):
    if ctx.ADD():
        left = compile_expression(ctx.getChild(0))  
        right = compile_expression(ctx.getChild(2))
        result = generate_temp_var()
        llvm_code += f"  {result} = add i32 {left}, {right}\n"
        return result
    elif ctx.SUB():
        left = compile_expression(ctx.getChild(0))  
        right = compile_expression(ctx.getChild(2))
        result = generate_temp_var()
        llvm_code += f"  {result} = sub i32 {left}, {right}\n"
        return result
    elif ctx.MUL():
        left = compile_expression(ctx.getChild(0))  
        right = compile_expression(ctx.getChild(2))
        result = generate_temp_var()
        llvm_code += f"  {result} = mul i32 {left}, {right}\n"
        return result
    elif ctx.DIV():
        left = compile_expression(ctx.getChild(0))  
        right = compile_expression(ctx.getChild(2))
        result = generate_temp_var()
        llvm_code += f"  {result} = sdiv i32 {left}, {right}\n"
        return result
    elif ctx.ID():
        
        return f"@{ctx.ID().getText()}"
    elif ctx.INT():
        
        return ctx.INT().getText()
    return "0"  

def enter_if_statement(ctx):
    condition = compile_expression(ctx.expression())
    llvm_code += f"  ; if statement\n"
    llvm_code += f"  %cond = icmp ne i32 {condition}, 0\n"  
    llvm_code += f"  br i1 %cond, label %then, label %else\n"
    llvm_code += "then:\n"

def exit_if_statement(ctx):
    llvm_code += "  ; end of if statement\n"
    llvm_code += "  br label %end_if\n"
    llvm_code += "else:\n"
    llvm_code += "  ; else statement\n"
    llvm_code += "end_if:\n"

def enter_func_decl(ctx):
    func_name = ctx.ID().getText()
    params = ", ".join(f"i32 %{param.getText()}" for param in ctx.paramList().ID())
    llvm_code += f"define i32 @{func_name}({params}) {{\n"

def exit_func_decl(ctx):
    llvm_code += "}\n\n"

def exit_return_statement(ctx):
    expr = compile_expression(ctx.expression())
    llvm_code += f"  ret i32 {expr}\n"

def enter_assignment_statement(ctx):
    var_name = ctx.ID().getText()
    expr_value = compile_expression(ctx.expression())
    llvm_code += f"  store i32 {expr_value}, i32* @{var_name}\n"

def main(input_text):
    global llvm_code
    input_stream = InputStream(input_text)
    lexer = MathLangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MathLangParser(stream)
    listener = MySemanticListener()
    walker = ParseTreeWalker()
    
    
    tree = parser.program()
    


    for statement in tree.children:
        if isinstance(statement, MathLangParser.FunctionCallContext):
            enter_func_decl(statement)
        elif isinstance(statement, MathLangParser.ReturnStatementContext):
            exit_return_statement(statement)
        elif isinstance(statement, MathLangParser.IfStatementContext):
            enter_if_statement(statement)
            exit_if_statement(statement)
        elif isinstance(statement, MathLangParser.AssignmentContext):
            enter_assignment_statement(statement)

    llvm_code += "  ret i32 0\n"  # Возврат 0 из main
    llvm_code += "}\n"

    

    print("Generate LLVM IR")
    

    write_to_file(llvm_code)

if __name__ == '__main__':
    
    example_code = """
    a = 3;
    b = 4;

    func myFunc(a, b) {
        return a + b;
    };

    if (a > b) {
        a = a - b;
    } else {
        a = a - 2;
    };

    myFunc(a,b);
    """
    main(example_code)
