# Generated from /home/yottso/Projects/MyLanguage/MyLanguageParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MyLanguageParserParser import MyLanguageParserParser
else:
    from MyLanguageParserParser import MyLanguageParserParser

# This class defines a complete listener for a parse tree produced by MyLanguageParserParser.
class MyLanguageParserListener(ParseTreeListener):

    # Enter a parse tree produced by MyLanguageParserParser#program.
    def enterProgram(self, ctx:MyLanguageParserParser.ProgramContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#program.
    def exitProgram(self, ctx:MyLanguageParserParser.ProgramContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#block.
    def enterBlock(self, ctx:MyLanguageParserParser.BlockContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#block.
    def exitBlock(self, ctx:MyLanguageParserParser.BlockContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#statement.
    def enterStatement(self, ctx:MyLanguageParserParser.StatementContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#statement.
    def exitStatement(self, ctx:MyLanguageParserParser.StatementContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#varDecl.
    def enterVarDecl(self, ctx:MyLanguageParserParser.VarDeclContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#varDecl.
    def exitVarDecl(self, ctx:MyLanguageParserParser.VarDeclContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#assignment.
    def enterAssignment(self, ctx:MyLanguageParserParser.AssignmentContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#assignment.
    def exitAssignment(self, ctx:MyLanguageParserParser.AssignmentContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#ifStatement.
    def enterIfStatement(self, ctx:MyLanguageParserParser.IfStatementContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#ifStatement.
    def exitIfStatement(self, ctx:MyLanguageParserParser.IfStatementContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#functionDecl.
    def enterFunctionDecl(self, ctx:MyLanguageParserParser.FunctionDeclContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#functionDecl.
    def exitFunctionDecl(self, ctx:MyLanguageParserParser.FunctionDeclContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#functionCall.
    def enterFunctionCall(self, ctx:MyLanguageParserParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#functionCall.
    def exitFunctionCall(self, ctx:MyLanguageParserParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#paramList.
    def enterParamList(self, ctx:MyLanguageParserParser.ParamListContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#paramList.
    def exitParamList(self, ctx:MyLanguageParserParser.ParamListContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#param.
    def enterParam(self, ctx:MyLanguageParserParser.ParamContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#param.
    def exitParam(self, ctx:MyLanguageParserParser.ParamContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#exprList.
    def enterExprList(self, ctx:MyLanguageParserParser.ExprListContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#exprList.
    def exitExprList(self, ctx:MyLanguageParserParser.ExprListContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#expr.
    def enterExpr(self, ctx:MyLanguageParserParser.ExprContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#expr.
    def exitExpr(self, ctx:MyLanguageParserParser.ExprContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#type.
    def enterType(self, ctx:MyLanguageParserParser.TypeContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#type.
    def exitType(self, ctx:MyLanguageParserParser.TypeContext):
        pass


    # Enter a parse tree produced by MyLanguageParserParser#operand.
    def enterOperand(self, ctx:MyLanguageParserParser.OperandContext):
        pass

    # Exit a parse tree produced by MyLanguageParserParser#operand.
    def exitOperand(self, ctx:MyLanguageParserParser.OperandContext):
        pass



del MyLanguageParserParser