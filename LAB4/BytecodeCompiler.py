from gen.MyLanguageParserVisitor import MyLanguageParserVisitor as MyLanguageVisitor

class MyLanguageBytecodeCompiler(MyLanguageVisitor):
    def __init__(self):
        self.bytecode = []
        self.variables = {}

    def compile(self, ctx):
        self.visit(ctx)
        return self.bytecode

    def visitProgram(self, ctx):
        for function in ctx.functionDecl():
            self.visit(function)
        self.visit(ctx.block())

    def visitFunctionDecl(self, ctx):
        func_name = ctx.ID().getText()


    def visitBlock(self, ctx):
        for statement in ctx.statement():
            self.visit(statement)

    def visitVarDecl(self, ctx):

        var_name = ctx.ID().getText()
        self.variables[var_name] = None

        if ctx.ASSIGN():
            if ctx.INT_LIT():

                value = int(ctx.INT_LIT().getText())

            elif ctx.functionCall():
                value = self.visit(ctx.functionCall())
            elif len(ctx.ID()) > 1:
                value = self.variables.get(ctx.ID()[1].getText())


            else:
                value = self.visit(ctx.expr())

            self.variables[var_name] = value
            self.bytecode.append((f"STORE_NAME", var_name, value))
        else:
            self.bytecode.append((f"STORE_NAME", var_name, None))

    def visitAssignment(self, ctx):

        var_name = ctx.ID(0).getText()
        if ctx.functionCall():
            value = self.visit(ctx.functionCall())


        elif len(ctx.ID()) > 1:
            value = self.variables.get(ctx.ID(1).getText())
        else:

            value = self.visit(ctx.expr())
        self.variables[var_name] = value

        self.bytecode.append((f"STORE_NAME", var_name, value))

    def visitIfStatement(self, ctx):
        condition = self.visit(ctx.expr())
        if condition:
            self.visit(ctx.block(0))
        else:
            self.visit(ctx.block(1))

    def visitReturnStatement(self, ctx):

        expr = self.visit(ctx.expr())
        self.bytecode.append((f"RETURN_VALUE", expr))

    def visitFunctionCall(self, ctx):
        return "function_call"

    def visitExprList(self, ctx):
        values = []
        for expr_ctx in ctx.expr():
            value = self.visit(expr_ctx)

            values.append(value)

        return values

    def visitExpr(self, ctx):
        if ctx.INT_LIT():
            return int(ctx.INT_LIT().getText())
        elif ctx.ID():
            value = self.variables.get(ctx.ID().getText())
            if type(value) == 'int':
                return int(value) if value is not None else None

        elif ctx.LPAREN():
            return self.visit(ctx.expr(0))

        elif ctx.operand():
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            op = ctx.operand().getText()
            try:
                left = int(left)
                right = int(right)
            except (ValueError, TypeError) as e:

                return None

            if op == "+":
                return left + right
            elif op == "-":
                return left - right
            elif op == "*":
                return left * right
            elif op == "/":
                return left / right
            elif op == ">":
                return left > right
            elif op == "<":
                return left < right
            else:
                return None
        elif ctx.functionCall():
            return self.visit(ctx.functionCall())

        return None



