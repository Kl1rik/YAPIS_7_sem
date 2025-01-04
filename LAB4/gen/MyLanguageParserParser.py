# Generated from /home/yottso/Projects/MyLanguage/MyLanguageParser.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,30,185,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        1,0,5,0,30,8,0,10,0,12,0,33,9,0,1,0,1,0,1,1,1,1,5,1,39,8,1,10,1,
        12,1,42,9,1,1,1,1,1,1,1,5,1,47,8,1,10,1,12,1,50,9,1,1,1,1,1,1,1,
        3,1,55,8,1,1,1,3,1,58,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,68,
        8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,
        3,3,85,8,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,99,
        8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,3,6,113,8,6,
        1,6,1,6,1,6,1,7,1,7,1,7,3,7,121,8,7,1,7,1,7,1,7,1,8,1,8,1,8,5,8,
        129,8,8,10,8,12,8,132,9,8,1,9,1,9,1,9,1,9,1,9,3,9,139,8,9,1,10,1,
        10,1,10,5,10,144,8,10,10,10,12,10,147,9,10,1,11,1,11,1,11,1,11,1,
        11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,
        11,1,11,1,11,1,11,3,11,170,8,11,1,11,1,11,1,11,1,11,5,11,176,8,11,
        10,11,12,11,179,9,11,1,12,1,12,1,13,1,13,1,13,0,1,22,14,0,2,4,6,
        8,10,12,14,16,18,20,22,24,26,0,2,2,0,1,3,11,11,1,0,14,19,197,0,31,
        1,0,0,0,2,57,1,0,0,0,4,67,1,0,0,0,6,84,1,0,0,0,8,98,1,0,0,0,10,100,
        1,0,0,0,12,107,1,0,0,0,14,117,1,0,0,0,16,125,1,0,0,0,18,138,1,0,
        0,0,20,140,1,0,0,0,22,169,1,0,0,0,24,180,1,0,0,0,26,182,1,0,0,0,
        28,30,3,12,6,0,29,28,1,0,0,0,30,33,1,0,0,0,31,29,1,0,0,0,31,32,1,
        0,0,0,32,34,1,0,0,0,33,31,1,0,0,0,34,35,3,2,1,0,35,1,1,0,0,0,36,
        40,5,8,0,0,37,39,3,4,2,0,38,37,1,0,0,0,39,42,1,0,0,0,40,38,1,0,0,
        0,40,41,1,0,0,0,41,43,1,0,0,0,42,40,1,0,0,0,43,58,5,9,0,0,44,48,
        5,22,0,0,45,47,3,4,2,0,46,45,1,0,0,0,47,50,1,0,0,0,48,46,1,0,0,0,
        48,49,1,0,0,0,49,51,1,0,0,0,50,48,1,0,0,0,51,58,5,23,0,0,52,54,5,
        20,0,0,53,55,3,20,10,0,54,53,1,0,0,0,54,55,1,0,0,0,55,56,1,0,0,0,
        56,58,5,21,0,0,57,36,1,0,0,0,57,44,1,0,0,0,57,52,1,0,0,0,58,3,1,
        0,0,0,59,68,3,6,3,0,60,68,3,8,4,0,61,68,3,10,5,0,62,68,3,14,7,0,
        63,64,5,10,0,0,64,65,3,22,11,0,65,66,5,24,0,0,66,68,1,0,0,0,67,59,
        1,0,0,0,67,60,1,0,0,0,67,61,1,0,0,0,67,62,1,0,0,0,67,63,1,0,0,0,
        68,5,1,0,0,0,69,70,3,24,12,0,70,71,5,26,0,0,71,72,5,13,0,0,72,73,
        5,27,0,0,73,74,5,24,0,0,74,85,1,0,0,0,75,76,3,24,12,0,76,77,5,26,
        0,0,77,78,5,24,0,0,78,85,1,0,0,0,79,80,3,24,12,0,80,81,5,26,0,0,
        81,82,5,13,0,0,82,83,3,14,7,0,83,85,1,0,0,0,84,69,1,0,0,0,84,75,
        1,0,0,0,84,79,1,0,0,0,85,7,1,0,0,0,86,87,5,26,0,0,87,88,5,13,0,0,
        88,89,3,22,11,0,89,90,5,24,0,0,90,99,1,0,0,0,91,92,5,26,0,0,92,93,
        5,13,0,0,93,94,5,26,0,0,94,99,5,24,0,0,95,96,5,26,0,0,96,97,5,13,
        0,0,97,99,3,14,7,0,98,86,1,0,0,0,98,91,1,0,0,0,98,95,1,0,0,0,99,
        9,1,0,0,0,100,101,5,5,0,0,101,102,3,22,11,0,102,103,5,6,0,0,103,
        104,3,2,1,0,104,105,5,7,0,0,105,106,3,2,1,0,106,11,1,0,0,0,107,108,
        5,4,0,0,108,109,3,24,12,0,109,110,5,26,0,0,110,112,5,20,0,0,111,
        113,3,16,8,0,112,111,1,0,0,0,112,113,1,0,0,0,113,114,1,0,0,0,114,
        115,5,21,0,0,115,116,3,2,1,0,116,13,1,0,0,0,117,118,5,26,0,0,118,
        120,5,20,0,0,119,121,3,20,10,0,120,119,1,0,0,0,120,121,1,0,0,0,121,
        122,1,0,0,0,122,123,5,21,0,0,123,124,5,24,0,0,124,15,1,0,0,0,125,
        130,3,18,9,0,126,127,5,25,0,0,127,129,3,18,9,0,128,126,1,0,0,0,129,
        132,1,0,0,0,130,128,1,0,0,0,130,131,1,0,0,0,131,17,1,0,0,0,132,130,
        1,0,0,0,133,134,3,24,12,0,134,135,5,26,0,0,135,139,1,0,0,0,136,139,
        5,26,0,0,137,139,5,27,0,0,138,133,1,0,0,0,138,136,1,0,0,0,138,137,
        1,0,0,0,139,19,1,0,0,0,140,145,3,22,11,0,141,142,5,25,0,0,142,144,
        3,22,11,0,143,141,1,0,0,0,144,147,1,0,0,0,145,143,1,0,0,0,145,146,
        1,0,0,0,146,21,1,0,0,0,147,145,1,0,0,0,148,149,6,11,-1,0,149,150,
        5,20,0,0,150,151,3,22,11,0,151,152,5,21,0,0,152,170,1,0,0,0,153,
        154,5,26,0,0,154,155,5,13,0,0,155,170,3,14,7,0,156,157,5,26,0,0,
        157,158,5,20,0,0,158,159,3,16,8,0,159,160,5,21,0,0,160,170,1,0,0,
        0,161,170,5,27,0,0,162,170,5,26,0,0,163,164,5,26,0,0,164,165,5,20,
        0,0,165,166,3,22,11,0,166,167,5,21,0,0,167,170,1,0,0,0,168,170,3,
        14,7,0,169,148,1,0,0,0,169,153,1,0,0,0,169,156,1,0,0,0,169,161,1,
        0,0,0,169,162,1,0,0,0,169,163,1,0,0,0,169,168,1,0,0,0,170,177,1,
        0,0,0,171,172,10,8,0,0,172,173,3,26,13,0,173,174,3,22,11,9,174,176,
        1,0,0,0,175,171,1,0,0,0,176,179,1,0,0,0,177,175,1,0,0,0,177,178,
        1,0,0,0,178,23,1,0,0,0,179,177,1,0,0,0,180,181,7,0,0,0,181,25,1,
        0,0,0,182,183,7,1,0,0,183,27,1,0,0,0,15,31,40,48,54,57,67,84,98,
        112,120,130,138,145,169,177
    ]

class MyLanguageParserParser ( Parser ):

    grammarFileName = "MyLanguageParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'document'", "'node'", "'attribute'", 
                     "'function'", "'if'", "'then'", "'else'", "'begin'", 
                     "'end'", "'return'", "'int'", "'str'", "'='", "'+'", 
                     "'-'", "'<'", "'>'", "'/'", "'*'", "'('", "')'", "'{'", 
                     "'}'", "';'", "','" ]

    symbolicNames = [ "<INVALID>", "DOCUMENT", "NODE", "ATTRIBUTE", "FUNCTION", 
                      "IF", "THEN", "ELSE", "BEGIN", "END", "RETURN", "INT", 
                      "STRING", "ASSIGN", "PLUS", "MINUS", "LS", "GT", "DIV", 
                      "MULT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
                      "COMMA", "ID", "INT_LIT", "STR_LIT", "WS", "LINE_COMMENT" ]

    RULE_program = 0
    RULE_block = 1
    RULE_statement = 2
    RULE_varDecl = 3
    RULE_assignment = 4
    RULE_ifStatement = 5
    RULE_functionDecl = 6
    RULE_functionCall = 7
    RULE_paramList = 8
    RULE_param = 9
    RULE_exprList = 10
    RULE_expr = 11
    RULE_type = 12
    RULE_operand = 13

    ruleNames =  [ "program", "block", "statement", "varDecl", "assignment", 
                   "ifStatement", "functionDecl", "functionCall", "paramList", 
                   "param", "exprList", "expr", "type", "operand" ]

    EOF = Token.EOF
    DOCUMENT=1
    NODE=2
    ATTRIBUTE=3
    FUNCTION=4
    IF=5
    THEN=6
    ELSE=7
    BEGIN=8
    END=9
    RETURN=10
    INT=11
    STRING=12
    ASSIGN=13
    PLUS=14
    MINUS=15
    LS=16
    GT=17
    DIV=18
    MULT=19
    LPAREN=20
    RPAREN=21
    LBRACE=22
    RBRACE=23
    SEMI=24
    COMMA=25
    ID=26
    INT_LIT=27
    STR_LIT=28
    WS=29
    LINE_COMMENT=30

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def block(self):
            return self.getTypedRuleContext(MyLanguageParserParser.BlockContext,0)


        def functionDecl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParserParser.FunctionDeclContext)
            else:
                return self.getTypedRuleContext(MyLanguageParserParser.FunctionDeclContext,i)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = MyLanguageParserParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 28
                self.functionDecl()
                self.state = 33
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 34
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BEGIN(self):
            return self.getToken(MyLanguageParserParser.BEGIN, 0)

        def END(self):
            return self.getToken(MyLanguageParserParser.END, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParserParser.StatementContext)
            else:
                return self.getTypedRuleContext(MyLanguageParserParser.StatementContext,i)


        def LBRACE(self):
            return self.getToken(MyLanguageParserParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(MyLanguageParserParser.RBRACE, 0)

        def LPAREN(self):
            return self.getToken(MyLanguageParserParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(MyLanguageParserParser.RPAREN, 0)

        def exprList(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ExprListContext,0)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)




    def block(self):

        localctx = MyLanguageParserParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_block)
        self._la = 0 # Token type
        try:
            self.state = 57
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 36
                self.match(MyLanguageParserParser.BEGIN)
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67111982) != 0):
                    self.state = 37
                    self.statement()
                    self.state = 42
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 43
                self.match(MyLanguageParserParser.END)
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 2)
                self.state = 44
                self.match(MyLanguageParserParser.LBRACE)
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67111982) != 0):
                    self.state = 45
                    self.statement()
                    self.state = 50
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 51
                self.match(MyLanguageParserParser.RBRACE)
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 3)
                self.state = 52
                self.match(MyLanguageParserParser.LPAREN)
                self.state = 54
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 202375168) != 0):
                    self.state = 53
                    self.exprList()


                self.state = 56
                self.match(MyLanguageParserParser.RPAREN)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varDecl(self):
            return self.getTypedRuleContext(MyLanguageParserParser.VarDeclContext,0)


        def assignment(self):
            return self.getTypedRuleContext(MyLanguageParserParser.AssignmentContext,0)


        def ifStatement(self):
            return self.getTypedRuleContext(MyLanguageParserParser.IfStatementContext,0)


        def functionCall(self):
            return self.getTypedRuleContext(MyLanguageParserParser.FunctionCallContext,0)


        def RETURN(self):
            return self.getToken(MyLanguageParserParser.RETURN, 0)

        def expr(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ExprContext,0)


        def SEMI(self):
            return self.getToken(MyLanguageParserParser.SEMI, 0)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = MyLanguageParserParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.state = 67
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 59
                self.varDecl()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 60
                self.assignment()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 61
                self.ifStatement()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 62
                self.functionCall()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 63
                self.match(MyLanguageParserParser.RETURN)
                self.state = 64
                self.expr(0)
                self.state = 65
                self.match(MyLanguageParserParser.SEMI)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MyLanguageParserParser.TypeContext,0)


        def ID(self):
            return self.getToken(MyLanguageParserParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(MyLanguageParserParser.ASSIGN, 0)

        def INT_LIT(self):
            return self.getToken(MyLanguageParserParser.INT_LIT, 0)

        def SEMI(self):
            return self.getToken(MyLanguageParserParser.SEMI, 0)

        def functionCall(self):
            return self.getTypedRuleContext(MyLanguageParserParser.FunctionCallContext,0)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_varDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarDecl" ):
                listener.enterVarDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarDecl" ):
                listener.exitVarDecl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVarDecl" ):
                return visitor.visitVarDecl(self)
            else:
                return visitor.visitChildren(self)




    def varDecl(self):

        localctx = MyLanguageParserParser.VarDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_varDecl)
        try:
            self.state = 84
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.type_()
                self.state = 70
                self.match(MyLanguageParserParser.ID)
                self.state = 71
                self.match(MyLanguageParserParser.ASSIGN)
                self.state = 72
                self.match(MyLanguageParserParser.INT_LIT)
                self.state = 73
                self.match(MyLanguageParserParser.SEMI)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 75
                self.type_()
                self.state = 76
                self.match(MyLanguageParserParser.ID)
                self.state = 77
                self.match(MyLanguageParserParser.SEMI)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 79
                self.type_()
                self.state = 80
                self.match(MyLanguageParserParser.ID)
                self.state = 81
                self.match(MyLanguageParserParser.ASSIGN)
                self.state = 82
                self.functionCall()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(MyLanguageParserParser.ID)
            else:
                return self.getToken(MyLanguageParserParser.ID, i)

        def ASSIGN(self):
            return self.getToken(MyLanguageParserParser.ASSIGN, 0)

        def expr(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ExprContext,0)


        def SEMI(self):
            return self.getToken(MyLanguageParserParser.SEMI, 0)

        def functionCall(self):
            return self.getTypedRuleContext(MyLanguageParserParser.FunctionCallContext,0)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)




    def assignment(self):

        localctx = MyLanguageParserParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_assignment)
        try:
            self.state = 98
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 86
                self.match(MyLanguageParserParser.ID)
                self.state = 87
                self.match(MyLanguageParserParser.ASSIGN)
                self.state = 88
                self.expr(0)
                self.state = 89
                self.match(MyLanguageParserParser.SEMI)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 91
                self.match(MyLanguageParserParser.ID)
                self.state = 92
                self.match(MyLanguageParserParser.ASSIGN)
                self.state = 93
                self.match(MyLanguageParserParser.ID)
                self.state = 94
                self.match(MyLanguageParserParser.SEMI)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 95
                self.match(MyLanguageParserParser.ID)
                self.state = 96
                self.match(MyLanguageParserParser.ASSIGN)
                self.state = 97
                self.functionCall()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(MyLanguageParserParser.IF, 0)

        def expr(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ExprContext,0)


        def THEN(self):
            return self.getToken(MyLanguageParserParser.THEN, 0)

        def block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParserParser.BlockContext)
            else:
                return self.getTypedRuleContext(MyLanguageParserParser.BlockContext,i)


        def ELSE(self):
            return self.getToken(MyLanguageParserParser.ELSE, 0)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_ifStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfStatement" ):
                listener.enterIfStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfStatement" ):
                listener.exitIfStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfStatement" ):
                return visitor.visitIfStatement(self)
            else:
                return visitor.visitChildren(self)




    def ifStatement(self):

        localctx = MyLanguageParserParser.IfStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_ifStatement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(MyLanguageParserParser.IF)
            self.state = 101
            self.expr(0)
            self.state = 102
            self.match(MyLanguageParserParser.THEN)
            self.state = 103
            self.block()
            self.state = 104
            self.match(MyLanguageParserParser.ELSE)
            self.state = 105
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION(self):
            return self.getToken(MyLanguageParserParser.FUNCTION, 0)

        def type_(self):
            return self.getTypedRuleContext(MyLanguageParserParser.TypeContext,0)


        def ID(self):
            return self.getToken(MyLanguageParserParser.ID, 0)

        def LPAREN(self):
            return self.getToken(MyLanguageParserParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(MyLanguageParserParser.RPAREN, 0)

        def block(self):
            return self.getTypedRuleContext(MyLanguageParserParser.BlockContext,0)


        def paramList(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ParamListContext,0)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_functionDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDecl" ):
                listener.enterFunctionDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDecl" ):
                listener.exitFunctionDecl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionDecl" ):
                return visitor.visitFunctionDecl(self)
            else:
                return visitor.visitChildren(self)




    def functionDecl(self):

        localctx = MyLanguageParserParser.FunctionDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_functionDecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.match(MyLanguageParserParser.FUNCTION)
            self.state = 108
            self.type_()
            self.state = 109
            self.match(MyLanguageParserParser.ID)
            self.state = 110
            self.match(MyLanguageParserParser.LPAREN)
            self.state = 112
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 201328654) != 0):
                self.state = 111
                self.paramList()


            self.state = 114
            self.match(MyLanguageParserParser.RPAREN)
            self.state = 115
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionCallContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(MyLanguageParserParser.ID, 0)

        def LPAREN(self):
            return self.getToken(MyLanguageParserParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(MyLanguageParserParser.RPAREN, 0)

        def SEMI(self):
            return self.getToken(MyLanguageParserParser.SEMI, 0)

        def exprList(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ExprListContext,0)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_functionCall

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionCall" ):
                listener.enterFunctionCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionCall" ):
                listener.exitFunctionCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionCall" ):
                return visitor.visitFunctionCall(self)
            else:
                return visitor.visitChildren(self)




    def functionCall(self):

        localctx = MyLanguageParserParser.FunctionCallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_functionCall)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 117
            self.match(MyLanguageParserParser.ID)
            self.state = 118
            self.match(MyLanguageParserParser.LPAREN)
            self.state = 120
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 202375168) != 0):
                self.state = 119
                self.exprList()


            self.state = 122
            self.match(MyLanguageParserParser.RPAREN)
            self.state = 123
            self.match(MyLanguageParserParser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def param(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParserParser.ParamContext)
            else:
                return self.getTypedRuleContext(MyLanguageParserParser.ParamContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MyLanguageParserParser.COMMA)
            else:
                return self.getToken(MyLanguageParserParser.COMMA, i)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_paramList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParamList" ):
                listener.enterParamList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParamList" ):
                listener.exitParamList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParamList" ):
                return visitor.visitParamList(self)
            else:
                return visitor.visitChildren(self)




    def paramList(self):

        localctx = MyLanguageParserParser.ParamListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_paramList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self.param()
            self.state = 130
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==25:
                self.state = 126
                self.match(MyLanguageParserParser.COMMA)
                self.state = 127
                self.param()
                self.state = 132
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MyLanguageParserParser.TypeContext,0)


        def ID(self):
            return self.getToken(MyLanguageParserParser.ID, 0)

        def INT_LIT(self):
            return self.getToken(MyLanguageParserParser.INT_LIT, 0)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_param

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParam" ):
                listener.enterParam(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParam" ):
                listener.exitParam(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParam" ):
                return visitor.visitParam(self)
            else:
                return visitor.visitChildren(self)




    def param(self):

        localctx = MyLanguageParserParser.ParamContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_param)
        try:
            self.state = 138
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 2, 3, 11]:
                self.enterOuterAlt(localctx, 1)
                self.state = 133
                self.type_()
                self.state = 134
                self.match(MyLanguageParserParser.ID)
                pass
            elif token in [26]:
                self.enterOuterAlt(localctx, 2)
                self.state = 136
                self.match(MyLanguageParserParser.ID)
                pass
            elif token in [27]:
                self.enterOuterAlt(localctx, 3)
                self.state = 137
                self.match(MyLanguageParserParser.INT_LIT)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParserParser.ExprContext)
            else:
                return self.getTypedRuleContext(MyLanguageParserParser.ExprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MyLanguageParserParser.COMMA)
            else:
                return self.getToken(MyLanguageParserParser.COMMA, i)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_exprList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprList" ):
                listener.enterExprList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprList" ):
                listener.exitExprList(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExprList" ):
                return visitor.visitExprList(self)
            else:
                return visitor.visitChildren(self)




    def exprList(self):

        localctx = MyLanguageParserParser.ExprListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_exprList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 140
            self.expr(0)
            self.state = 145
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==25:
                self.state = 141
                self.match(MyLanguageParserParser.COMMA)
                self.state = 142
                self.expr(0)
                self.state = 147
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LPAREN(self):
            return self.getToken(MyLanguageParserParser.LPAREN, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParserParser.ExprContext)
            else:
                return self.getTypedRuleContext(MyLanguageParserParser.ExprContext,i)


        def RPAREN(self):
            return self.getToken(MyLanguageParserParser.RPAREN, 0)

        def ID(self):
            return self.getToken(MyLanguageParserParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(MyLanguageParserParser.ASSIGN, 0)

        def functionCall(self):
            return self.getTypedRuleContext(MyLanguageParserParser.FunctionCallContext,0)


        def paramList(self):
            return self.getTypedRuleContext(MyLanguageParserParser.ParamListContext,0)


        def INT_LIT(self):
            return self.getToken(MyLanguageParserParser.INT_LIT, 0)

        def operand(self):
            return self.getTypedRuleContext(MyLanguageParserParser.OperandContext,0)


        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MyLanguageParserParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 22
        self.enterRecursionRule(localctx, 22, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 169
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 149
                self.match(MyLanguageParserParser.LPAREN)
                self.state = 150
                self.expr(0)
                self.state = 151
                self.match(MyLanguageParserParser.RPAREN)
                pass

            elif la_ == 2:
                self.state = 153
                self.match(MyLanguageParserParser.ID)
                self.state = 154
                self.match(MyLanguageParserParser.ASSIGN)
                self.state = 155
                self.functionCall()
                pass

            elif la_ == 3:
                self.state = 156
                self.match(MyLanguageParserParser.ID)
                self.state = 157
                self.match(MyLanguageParserParser.LPAREN)
                self.state = 158
                self.paramList()
                self.state = 159
                self.match(MyLanguageParserParser.RPAREN)
                pass

            elif la_ == 4:
                self.state = 161
                self.match(MyLanguageParserParser.INT_LIT)
                pass

            elif la_ == 5:
                self.state = 162
                self.match(MyLanguageParserParser.ID)
                pass

            elif la_ == 6:
                self.state = 163
                self.match(MyLanguageParserParser.ID)
                self.state = 164
                self.match(MyLanguageParserParser.LPAREN)
                self.state = 165
                self.expr(0)
                self.state = 166
                self.match(MyLanguageParserParser.RPAREN)
                pass

            elif la_ == 7:
                self.state = 168
                self.functionCall()
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 177
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,14,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MyLanguageParserParser.ExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                    self.state = 171
                    if not self.precpred(self._ctx, 8):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                    self.state = 172
                    self.operand()
                    self.state = 173
                    self.expr(9) 
                self.state = 179
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,14,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOCUMENT(self):
            return self.getToken(MyLanguageParserParser.DOCUMENT, 0)

        def NODE(self):
            return self.getToken(MyLanguageParserParser.NODE, 0)

        def ATTRIBUTE(self):
            return self.getToken(MyLanguageParserParser.ATTRIBUTE, 0)

        def INT(self):
            return self.getToken(MyLanguageParserParser.INT, 0)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = MyLanguageParserParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 2062) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PLUS(self):
            return self.getToken(MyLanguageParserParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(MyLanguageParserParser.MINUS, 0)

        def GT(self):
            return self.getToken(MyLanguageParserParser.GT, 0)

        def LS(self):
            return self.getToken(MyLanguageParserParser.LS, 0)

        def MULT(self):
            return self.getToken(MyLanguageParserParser.MULT, 0)

        def DIV(self):
            return self.getToken(MyLanguageParserParser.DIV, 0)

        def getRuleIndex(self):
            return MyLanguageParserParser.RULE_operand

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperand" ):
                listener.enterOperand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperand" ):
                listener.exitOperand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperand" ):
                return visitor.visitOperand(self)
            else:
                return visitor.visitChildren(self)




    def operand(self):

        localctx = MyLanguageParserParser.OperandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_operand)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 182
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1032192) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[11] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 8)
         




