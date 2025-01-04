from antlr4 import *
from MathLangLexer import MathLangLexer
from MathLangParser import MathLangParser
from MathLangParserListener import ParseTreeListener


class MySemanticListener(ParseTreeListener):
    def __init__(self):
        self.symbol_table = {}

    def exitAssignment(self, ctx:MathLangParser.AssignmentContext):
        var_name = ctx.ID().getText()
        print(var_name)
        value = self.eval_expr(ctx.expr())
        self.symbol_table[var_name] = value
        print(f"Variable '{var_name}' assigned value: {value}")

    def eval_expr(self, ctx):
        if ctx.INT():
            return int(ctx.INT().getText())
        elif ctx.ID():
            var_name = ctx.ID().getText()
            print(var_name)
            if var_name in self.symbol_table:
                return self.symbol_table[var_name]
            else:
                print(f"Error: Variable '{var_name}' is not defined")
                return 0 
        elif ctx.MulExpr():
            left = self.eval_expr(ctx.expr(0))
            right = self.eval_expr(ctx.expr(1))
            return left * right
        elif ctx.AddExpr():
            left = self.eval_expr(ctx.expr(0))
            right = self.eval_expr(ctx.expr(1))
            return left + right
        else:
            return 0


input_stream = InputStream(input_str)
lexer = MathLangLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = MathLangParser(stream)
tree = parser.program()
listener = MySemanticListener()
walker = ParseTreeWalker()
walker.walk(listener, tree)

test_cases = [
    """func(a);
"""
]

