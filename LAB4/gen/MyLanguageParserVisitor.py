# Generated from /home/yottso/Projects/MyLanguage/MyLanguageParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MyLanguageParserParser import MyLanguageParserParser
else:
    from MyLanguageParserParser import MyLanguageParserParser

# This class defines a complete generic visitor for a parse tree produced by MyLanguageParserParser.

class MyLanguageParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyLanguageParserParser#program.
    def visitProgram(self, ctx:MyLanguageParserParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#block.
    def visitBlock(self, ctx:MyLanguageParserParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#statement.
    def visitStatement(self, ctx:MyLanguageParserParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#varDecl.
    def visitVarDecl(self, ctx:MyLanguageParserParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#assignment.
    def visitAssignment(self, ctx:MyLanguageParserParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#ifStatement.
    def visitIfStatement(self, ctx:MyLanguageParserParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#functionDecl.
    def visitFunctionDecl(self, ctx:MyLanguageParserParser.FunctionDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#functionCall.
    def visitFunctionCall(self, ctx:MyLanguageParserParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#paramList.
    def visitParamList(self, ctx:MyLanguageParserParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#param.
    def visitParam(self, ctx:MyLanguageParserParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#exprList.
    def visitExprList(self, ctx:MyLanguageParserParser.ExprListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#expr.
    def visitExpr(self, ctx:MyLanguageParserParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#type.
    def visitType(self, ctx:MyLanguageParserParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLanguageParserParser#operand.
    def visitOperand(self, ctx:MyLanguageParserParser.OperandContext):
        return self.visitChildren(ctx)



del MyLanguageParserParser