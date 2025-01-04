from gen.MyLanguageParserVisitor import MyLanguageParserVisitor as MyLanguageVisitor

class MyLanguageCompiler(MyLanguageVisitor):
    def __init__(self):
        self.output_code = ""

    def visitProgram(self, ctx):
        self.output_code += "// Compiled MyLanguage code\n"
        for function in ctx.functionDecl():
            self.visit(function)

        self.output_code += self.visit(ctx.block())  # Visit the main block!

        return self.output_code

    def visitFunctionDecl(self, ctx):
        return_type = ctx.type_().getText()
        func_name = ctx.ID().getText()
        params = self.visit(ctx.paramList()) if ctx.paramList() else ""
        body = self.visit(ctx.block())
        self.output_code += f"{return_type} {func_name}({params}) {body}\n"
        return


    def visitParamList(self, ctx):
        params = []
        for param in ctx.param():
            ptype = param.type_().getText() if param.type_() else "int"
            pname = param.ID().getText() if param.ID() else str(param.INT_LIT())
            params.append(f"{ptype} {pname}")
        return ", ".join(params)


    def visitBlock(self, ctx):
        statements = []
        for statement in ctx.statement():
            statement_code = self.visit(statement)
            if statement_code:  # Check if statement_code is not None
                statements.append(statement_code)
        return "{\n" + "\n".join(statements) + "\n}\n"

    def visitStatement(self, ctx):
        if ctx.varDecl():
            return self.visit(ctx.varDecl())
        elif ctx.assignment():
            return self.visit(ctx.assignment())
        elif ctx.ifStatement():
            return self.visit(ctx.ifStatement())
        elif ctx.functionCall():
            return self.visit(ctx.functionCall())
        elif ctx.RETURN():  # Handle return statements
            return self.visitReturnStatement(ctx) # you forgot to implement return in previous compiler
        return None  # Or perhaps an empty string "" if that's more suitable



    def visitReturnStatement(self, ctx):
        expr = self.visit(ctx.expr())
        return f"return {expr};\n"


    def visitVarDecl(self, ctx):
        var_type = ctx.type_().getText() if ctx.type_() else ""  # Get type if declared
        var_name = ctx.ID().getText()
        assignment = ""

        if ctx.ASSIGN():  # Handle assignments in variable declarations
            if ctx.INT_LIT():
                assignment = f" = {ctx.INT_LIT().getText()}"
            elif ctx.functionCall():
                assignment = f" = {self.visit(ctx.functionCall())[:-2]}"  # Remove ;\n
            else: # it is second ID in "type ID ASSIGN ID SEMI"
                if len(ctx.ID()) > 1:
                    assignment = f" = {ctx.ID().getText()}"  # Get the assigned ID


        return f"{var_type} {var_name}{assignment};\n"





    def visitAssignment(self, ctx):
        var_name = ctx.ID(0).getText()

        if ctx.functionCall():
           value = self.visit(ctx.functionCall())[:-2] # visit functionCall and delete ";\n"


        elif ctx.ID(1):
            value = ctx.ID(1).getText()
        else:

            value = self.visit(ctx.expr())

        return f"{var_name} = {value};\n"

    def visitIfStatement(self, ctx):
        condition = self.visit(ctx.expr())
        then_block = self.visit(ctx.block(0))
        else_block = self.visit(ctx.block(1))
        return f"if ({condition}) {then_block} else {else_block}"




    def visitFunctionCall(self, ctx):
        func_name = ctx.ID().getText()
        args = self.visit(ctx.exprList()) if ctx.exprList() else ""
        return f"{func_name}({args});\n"



    def visitExprList(self, ctx):
        exprs = [self.visit(x) for x in ctx.expr()]
        return ", ".join(exprs)


    def visitExpr(self, ctx):

        if ctx.LPAREN():
            return "(" + self.visit(ctx.expr(0)) + ")"
        elif ctx.INT_LIT():
            return ctx.INT_LIT().getText()
        elif ctx.ID():
           return ctx.ID().getText()
        elif ctx.operand():
           left = self.visit(ctx.expr(0))
           op = ctx.operand().getText()
           right = self.visit(ctx.expr(1))
           return f"{left} {op} {right}"
        elif ctx.functionCall():
            return  self.visit(ctx.functionCall())[:-2] # visit functionCall and delete ";\n"
        return ""
