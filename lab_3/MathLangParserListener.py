# Generated from MathLangParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MathLangParser import MathLangParser
else:
    from MathLangParser import MathLangParser

# This class defines a complete listener for a parse tree produced by MathLangParser.
class MathLangParserListener(ParseTreeListener):

    # Enter a parse tree produced by MathLangParser#program.
    def enterProgram(self, ctx:MathLangParser.ProgramContext):
        pass

    # Exit a parse tree produced by MathLangParser#program.
    def exitProgram(self, ctx:MathLangParser.ProgramContext):
        
        pass


    # Enter a parse tree produced by MathLangParser#function_definition.
    def enterFunction_definition(self, ctx:MathLangParser.Function_definitionContext):
        pass

    # Exit a parse tree produced by MathLangParser#function_definition.
    def exitFunction_definition(self, ctx:MathLangParser.Function_definitionContext):
        pass


    # Enter a parse tree produced by MathLangParser#ParameterList.
    def enterParameterList(self, ctx:MathLangParser.ParameterListContext):
        pass

    # Exit a parse tree produced by MathLangParser#ParameterList.
    def exitParameterList(self, ctx:MathLangParser.ParameterListContext):
        pass


    # Enter a parse tree produced by MathLangParser#BlockStatement.
    def enterBlockStatement(self, ctx:MathLangParser.BlockStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#BlockStatement.
    def exitBlockStatement(self, ctx:MathLangParser.BlockStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#MultiplyExpr.
    def enterMultiplyExpr(self, ctx:MathLangParser.MultiplyExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#MultiplyExpr.
    def exitMultiplyExpr(self, ctx:MathLangParser.MultiplyExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#FloatLiteral.
    def enterFloatLiteral(self, ctx:MathLangParser.FloatLiteralContext):
        pass

    # Exit a parse tree produced by MathLangParser#FloatLiteral.
    def exitFloatLiteral(self, ctx:MathLangParser.FloatLiteralContext):
        pass


    # Enter a parse tree produced by MathLangParser#PowExpr.
    def enterPowExpr(self, ctx:MathLangParser.PowExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#PowExpr.
    def exitPowExpr(self, ctx:MathLangParser.PowExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#AddExpr.
    def enterAddExpr(self, ctx:MathLangParser.AddExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#AddExpr.
    def exitAddExpr(self, ctx:MathLangParser.AddExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#GTExpr.
    def enterGTExpr(self, ctx:MathLangParser.GTExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#GTExpr.
    def exitGTExpr(self, ctx:MathLangParser.GTExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#WhileStatement.
    def enterWhileStatement(self, ctx:MathLangParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#WhileStatement.
    def exitWhileStatement(self, ctx:MathLangParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#LTExpr.
    def enterLTExpr(self, ctx:MathLangParser.LTExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#LTExpr.
    def exitLTExpr(self, ctx:MathLangParser.LTExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#LTEExpr.
    def enterLTEExpr(self, ctx:MathLangParser.LTEExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#LTEExpr.
    def exitLTEExpr(self, ctx:MathLangParser.LTEExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#DivideExpr.
    def enterDivideExpr(self, ctx:MathLangParser.DivideExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#DivideExpr.
    def exitDivideExpr(self, ctx:MathLangParser.DivideExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#IfStatement.
    def enterIfStatement(self, ctx:MathLangParser.IfStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#IfStatement.
    def exitIfStatement(self, ctx:MathLangParser.IfStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#SwitchStatement.
    def enterSwitchStatement(self, ctx:MathLangParser.SwitchStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#SwitchStatement.
    def exitSwitchStatement(self, ctx:MathLangParser.SwitchStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#GTEExpr.
    def enterGTEExpr(self, ctx:MathLangParser.GTEExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#GTEExpr.
    def exitGTEExpr(self, ctx:MathLangParser.GTEExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#FunctionCallExpr.
    def enterFunctionCallExpr(self, ctx:MathLangParser.FunctionCallExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#FunctionCallExpr.
    def exitFunctionCallExpr(self, ctx:MathLangParser.FunctionCallExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#EQExpr.
    def enterEQExpr(self, ctx:MathLangParser.EQExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#EQExpr.
    def exitEQExpr(self, ctx:MathLangParser.EQExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#NEQExpr.
    def enterNEQExpr(self, ctx:MathLangParser.NEQExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#NEQExpr.
    def exitNEQExpr(self, ctx:MathLangParser.NEQExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#VarExpr.
    def enterVarExpr(self, ctx:MathLangParser.VarExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#VarExpr.
    def exitVarExpr(self, ctx:MathLangParser.VarExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#IntLiteral.
    def enterIntLiteral(self, ctx:MathLangParser.IntLiteralContext):
        pass

    # Exit a parse tree produced by MathLangParser#IntLiteral.
    def exitIntLiteral(self, ctx:MathLangParser.IntLiteralContext):
        pass


    # Enter a parse tree produced by MathLangParser#SubtractExpr.
    def enterSubtractExpr(self, ctx:MathLangParser.SubtractExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#SubtractExpr.
    def exitSubtractExpr(self, ctx:MathLangParser.SubtractExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#ModExpr.
    def enterModExpr(self, ctx:MathLangParser.ModExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#ModExpr.
    def exitModExpr(self, ctx:MathLangParser.ModExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#ParenExpr.
    def enterParenExpr(self, ctx:MathLangParser.ParenExprContext):
        pass

    # Exit a parse tree produced by MathLangParser#ParenExpr.
    def exitParenExpr(self, ctx:MathLangParser.ParenExprContext):
        pass


    # Enter a parse tree produced by MathLangParser#ForStatement.
    def enterForStatement(self, ctx:MathLangParser.ForStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#ForStatement.
    def exitForStatement(self, ctx:MathLangParser.ForStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#IfElseStatement.
    def enterIfElseStatement(self, ctx:MathLangParser.IfElseStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#IfElseStatement.
    def exitIfElseStatement(self, ctx:MathLangParser.IfElseStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#switch_statement.
    def enterSwitch_statement(self, ctx:MathLangParser.Switch_statementContext):
        pass

    # Exit a parse tree produced by MathLangParser#switch_statement.
    def exitSwitch_statement(self, ctx:MathLangParser.Switch_statementContext):
        pass


    # Enter a parse tree produced by MathLangParser#CaseBlock.
    def enterCaseBlock(self, ctx:MathLangParser.CaseBlockContext):
        pass

    # Exit a parse tree produced by MathLangParser#CaseBlock.
    def exitCaseBlock(self, ctx:MathLangParser.CaseBlockContext):
        pass


    # Enter a parse tree produced by MathLangParser#update.
    def enterUpdate(self, ctx:MathLangParser.UpdateContext):
        pass

    # Exit a parse tree produced by MathLangParser#update.
    def exitUpdate(self, ctx:MathLangParser.UpdateContext):
        pass


    # Enter a parse tree produced by MathLangParser#for_statement.
    def enterFor_statement(self, ctx:MathLangParser.For_statementContext):
        pass

    # Exit a parse tree produced by MathLangParser#for_statement.
    def exitFor_statement(self, ctx:MathLangParser.For_statementContext):
        pass


    # Enter a parse tree produced by MathLangParser#while_statement.
    def enterWhile_statement(self, ctx:MathLangParser.While_statementContext):
        pass

    # Exit a parse tree produced by MathLangParser#while_statement.
    def exitWhile_statement(self, ctx:MathLangParser.While_statementContext):
        pass


    # Enter a parse tree produced by MathLangParser#FunctionCall.
    def enterFunctionCall(self, ctx:MathLangParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by MathLangParser#FunctionCall.
    def exitFunctionCall(self, ctx:MathLangParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by MathLangParser#ArgumentList.
    def enterArgumentList(self, ctx:MathLangParser.ArgumentListContext):
        pass

    # Exit a parse tree produced by MathLangParser#ArgumentList.
    def exitArgumentList(self, ctx:MathLangParser.ArgumentListContext):
        pass


    # Enter a parse tree produced by MathLangParser#AssignmentStmt.
    def enterAssignmentStmt(self, ctx:MathLangParser.AssignmentStmtContext):
        pass

    # Exit a parse tree produced by MathLangParser#AssignmentStmt.
    def exitAssignmentStmt(self, ctx:MathLangParser.AssignmentStmtContext):
        pass


    # Enter a parse tree produced by MathLangParser#return_statement.
    def enterReturn_statement(self, ctx:MathLangParser.Return_statementContext):
        pass

    # Exit a parse tree produced by MathLangParser#return_statement.
    def exitReturn_statement(self, ctx:MathLangParser.Return_statementContext):
        pass


    # Enter a parse tree produced by MathLangParser#AssignmentStatement.
    def enterAssignmentStatement(self, ctx:MathLangParser.AssignmentStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#AssignmentStatement.
    def exitAssignmentStatement(self, ctx:MathLangParser.AssignmentStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#ExpressionStatement.
    def enterExpressionStatement(self, ctx:MathLangParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#ExpressionStatement.
    def exitExpressionStatement(self, ctx:MathLangParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by MathLangParser#ReturnStatement.
    def enterReturnStatement(self, ctx:MathLangParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by MathLangParser#ReturnStatement.
    def exitReturnStatement(self, ctx:MathLangParser.ReturnStatementContext):
        pass



del MathLangParser