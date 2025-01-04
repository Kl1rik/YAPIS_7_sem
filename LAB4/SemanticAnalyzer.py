from gen.MyLanguageParserVisitor import MyLanguageParserVisitor as MyLanguageVisitor


class SemanticAnalyzer(MyLanguageVisitor):
    def __init__(self):
        self.symbols = {}


    def visitProgram(self, ctx):
        for func_decl in ctx.functionDecl():
            self.visit(func_decl)

        self.visit(ctx.block())


    def visitFunctionDecl(self, ctx):
        func_name = ctx.ID().getText()
        if func_name in self.symbols:
            raise Exception(f"Error: Function '{func_name}' already declared")

        param_types = []
        if ctx.paramList():
            for param in ctx.paramList().param():
                param_types.append(param.type_().getText() if param.type_() else "int")


        self.symbols[func_name] = {"type": "function", "return_type": ctx.type_().getText(), "params": param_types}
        self.visit(ctx.block())
        return


    def visitVarDecl(self, ctx):
        var_name = ctx.ID().getText()

        if var_name in self.symbols:
            raise Exception(f"Error: Variable '{var_name}' already declared in this scope")


        if ctx.type_():
            var_type = ctx.type_().getText()
        else:
            assigned_id = ctx.ID()
            if assigned_id:
                assigned_id_text = assigned_id.getText()
                if assigned_id_text in self.symbols:
                    var_type = self.symbols[assigned_id_text]["type"]
                else:
                    raise Exception(f"Error: Variable '{assigned_id_text}' used before declaration")
            elif ctx.functionCall():
                function_name = ctx.functionCall().ID().getText()
                if function_name not in self.symbols:
                    raise Exception(f"Error: Function '{function_name}' is not declared")
                var_type = self.symbols[function_name]["return_type"]
            else:
                raise Exception(f"Error: Type inference failed for '{var_name}'")

        self.symbols[var_name] = {"type": var_type}
        return



    def visitAssignment(self, ctx):
        var_name = ctx.ID(0).getText()
        if var_name not in self.symbols:
            raise Exception(f"Error: Variable '{var_name}' not declared")

        self.visit(ctx.expr())
        return


    def visitFunctionCall(self, ctx):
        func_name = ctx.ID().getText()

        if func_name not in self.symbols:
            raise Exception(f"Error: Function '{func_name}' is not declared")


        if self.symbols[func_name].get("type") != "function":
             raise Exception(f"Error: '{func_name}' is not a function")


        declared_params = self.symbols[func_name]["params"]
        passed_args = ctx.exprList().expr() if ctx.exprList() else []

        if len(declared_params) != len(passed_args):
            raise Exception(f"Error: Function '{func_name}' expects {len(declared_params)} arguments, but got {len(passed_args)}")


        return
