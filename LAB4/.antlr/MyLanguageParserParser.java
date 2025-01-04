// Generated from /home/kl1rik/YAPIS_7_sem/LAB4/MyLanguageParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCUMENT=1, NODE=2, ATTRIBUTE=3, FUNCTION=4, IF=5, THEN=6, ELSE=7, BEGIN=8, 
		END=9, RETURN=10, INT=11, STRING=12, ASSIGN=13, PLUS=14, MINUS=15, LS=16, 
		GT=17, DIV=18, MULT=19, LPAREN=20, RPAREN=21, LBRACE=22, RBRACE=23, SEMI=24, 
		COMMA=25, ID=26, INT_LIT=27, STR_LIT=28, WS=29, LINE_COMMENT=30;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_varDecl = 3, 
		RULE_assignment = 4, RULE_ifStatement = 5, RULE_functionDecl = 6, RULE_functionCall = 7, 
		RULE_paramList = 8, RULE_param = 9, RULE_exprList = 10, RULE_expr = 11, 
		RULE_type = 12, RULE_operand = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "varDecl", "assignment", "ifStatement", 
			"functionDecl", "functionCall", "paramList", "param", "exprList", "expr", 
			"type", "operand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'document'", "'node'", "'attribute'", "'function'", "'if'", "'then'", 
			"'else'", "'begin'", "'end'", "'return'", "'int'", "'str'", "'='", "'+'", 
			"'-'", "'<'", "'>'", "'/'", "'*'", "'('", "')'", "'{'", "'}'", "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCUMENT", "NODE", "ATTRIBUTE", "FUNCTION", "IF", "THEN", "ELSE", 
			"BEGIN", "END", "RETURN", "INT", "STRING", "ASSIGN", "PLUS", "MINUS", 
			"LS", "GT", "DIV", "MULT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
			"COMMA", "ID", "INT_LIT", "STR_LIT", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguageParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(28);
				functionDecl();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MyLanguageParserParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MyLanguageParserParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(MyLanguageParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MyLanguageParserParser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageParserParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(BEGIN);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67111982L) != 0)) {
					{
					{
					setState(37);
					statement();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(END);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(LBRACE);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67111982L) != 0)) {
					{
					{
					setState(45);
					statement();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(RBRACE);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(LPAREN);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 202375168L) != 0)) {
					{
					setState(53);
					exprList();
					}
				}

				setState(56);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(MyLanguageParserParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MyLanguageParserParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(RETURN);
				setState(64);
				expr(0);
				setState(65);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyLanguageParserParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MyLanguageParserParser.ASSIGN, 0); }
		public TerminalNode INT_LIT() { return getToken(MyLanguageParserParser.INT_LIT, 0); }
		public TerminalNode SEMI() { return getToken(MyLanguageParserParser.SEMI, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				type();
				setState(70);
				match(ID);
				setState(71);
				match(ASSIGN);
				setState(72);
				match(INT_LIT);
				setState(73);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				type();
				setState(76);
				match(ID);
				setState(77);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				type();
				setState(80);
				match(ID);
				setState(81);
				match(ASSIGN);
				setState(82);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyLanguageParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLanguageParserParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(MyLanguageParserParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MyLanguageParserParser.SEMI, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				setState(87);
				match(ASSIGN);
				setState(88);
				expr(0);
				setState(89);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(ID);
				setState(92);
				match(ASSIGN);
				setState(93);
				match(ID);
				setState(94);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(ID);
				setState(96);
				match(ASSIGN);
				setState(97);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyLanguageParserParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MyLanguageParserParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyLanguageParserParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			expr(0);
			setState(102);
			match(THEN);
			setState(103);
			block();
			setState(104);
			match(ELSE);
			setState(105);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MyLanguageParserParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyLanguageParserParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageParserParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FUNCTION);
			setState(108);
			type();
			setState(109);
			match(ID);
			setState(110);
			match(LPAREN);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 201328654L) != 0)) {
				{
				setState(111);
				paramList();
				}
			}

			setState(114);
			match(RPAREN);
			setState(115);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParserParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageParserParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(MyLanguageParserParser.SEMI, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
			match(LPAREN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 202375168L) != 0)) {
				{
				setState(119);
				exprList();
				}
			}

			setState(122);
			match(RPAREN);
			setState(123);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParserParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			param();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				param();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyLanguageParserParser.ID, 0); }
		public TerminalNode INT_LIT() { return getToken(MyLanguageParserParser.INT_LIT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOCUMENT:
			case NODE:
			case ATTRIBUTE:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				type();
				setState(134);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ID);
				}
				break;
			case INT_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(INT_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MyLanguageParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MyLanguageParserParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				expr(0);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyLanguageParserParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MyLanguageParserParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParserParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MyLanguageParserParser.ASSIGN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode INT_LIT() { return getToken(MyLanguageParserParser.INT_LIT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(149);
				match(LPAREN);
				setState(150);
				expr(0);
				setState(151);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(153);
				match(ID);
				setState(154);
				match(ASSIGN);
				setState(155);
				functionCall();
				}
				break;
			case 3:
				{
				setState(156);
				match(ID);
				setState(157);
				match(LPAREN);
				setState(158);
				paramList();
				setState(159);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(161);
				match(INT_LIT);
				}
				break;
			case 5:
				{
				setState(162);
				match(ID);
				}
				break;
			case 6:
				{
				setState(163);
				match(ID);
				setState(164);
				match(LPAREN);
				setState(165);
				expr(0);
				setState(166);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(168);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(171);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(172);
					operand();
					setState(173);
					expr(9);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOCUMENT() { return getToken(MyLanguageParserParser.DOCUMENT, 0); }
		public TerminalNode NODE() { return getToken(MyLanguageParserParser.NODE, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(MyLanguageParserParser.ATTRIBUTE, 0); }
		public TerminalNode INT() { return getToken(MyLanguageParserParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2062L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MyLanguageParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyLanguageParserParser.MINUS, 0); }
		public TerminalNode GT() { return getToken(MyLanguageParserParser.GT, 0); }
		public TerminalNode LS() { return getToken(MyLanguageParserParser.LS, 0); }
		public TerminalNode MULT() { return getToken(MyLanguageParserParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MyLanguageParserParser.DIV, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001\u0003\u0001"+
		":\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006q\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0081\b\b\n\b\f\b\u0084\t"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008b\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00aa\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00b0\b\u000b\n\u000b\f\u000b\u00b3\t\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0001\u0016\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002"+
		"\u0002\u0000\u0001\u0003\u000b\u000b\u0001\u0000\u000e\u0013\u00c5\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004C\u0001"+
		"\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000"+
		"\u0000\nd\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000eu\u0001"+
		"\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000"+
		"\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000"+
		"\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00b6\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\f\u0006\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#\u0001\u0001\u0000\u0000"+
		"\u0000$(\u0005\b\u0000\u0000%\'\u0003\u0004\u0002\u0000&%\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+:\u0005\t\u0000\u0000,0\u0005\u0016\u0000\u0000-/\u0003\u0004\u0002\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u00003:\u0005\u0017\u0000\u000046\u0005\u0014\u0000\u000057\u0003"+
		"\u0014\n\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008:\u0005\u0015\u0000\u00009$\u0001\u0000\u0000\u0000"+
		"9,\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u0000:\u0003\u0001\u0000"+
		"\u0000\u0000;D\u0003\u0006\u0003\u0000<D\u0003\b\u0004\u0000=D\u0003\n"+
		"\u0005\u0000>D\u0003\u000e\u0007\u0000?@\u0005\n\u0000\u0000@A\u0003\u0016"+
		"\u000b\u0000AB\u0005\u0018\u0000\u0000BD\u0001\u0000\u0000\u0000C;\u0001"+
		"\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000"+
		"C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000D\u0005\u0001\u0000"+
		"\u0000\u0000EF\u0003\u0018\f\u0000FG\u0005\u001a\u0000\u0000GH\u0005\r"+
		"\u0000\u0000HI\u0005\u001b\u0000\u0000IJ\u0005\u0018\u0000\u0000JU\u0001"+
		"\u0000\u0000\u0000KL\u0003\u0018\f\u0000LM\u0005\u001a\u0000\u0000MN\u0005"+
		"\u0018\u0000\u0000NU\u0001\u0000\u0000\u0000OP\u0003\u0018\f\u0000PQ\u0005"+
		"\u001a\u0000\u0000QR\u0005\r\u0000\u0000RS\u0003\u000e\u0007\u0000SU\u0001"+
		"\u0000\u0000\u0000TE\u0001\u0000\u0000\u0000TK\u0001\u0000\u0000\u0000"+
		"TO\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\u001a"+
		"\u0000\u0000WX\u0005\r\u0000\u0000XY\u0003\u0016\u000b\u0000YZ\u0005\u0018"+
		"\u0000\u0000Zc\u0001\u0000\u0000\u0000[\\\u0005\u001a\u0000\u0000\\]\u0005"+
		"\r\u0000\u0000]^\u0005\u001a\u0000\u0000^c\u0005\u0018\u0000\u0000_`\u0005"+
		"\u001a\u0000\u0000`a\u0005\r\u0000\u0000ac\u0003\u000e\u0007\u0000bV\u0001"+
		"\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000"+
		"c\t\u0001\u0000\u0000\u0000de\u0005\u0005\u0000\u0000ef\u0003\u0016\u000b"+
		"\u0000fg\u0005\u0006\u0000\u0000gh\u0003\u0002\u0001\u0000hi\u0005\u0007"+
		"\u0000\u0000ij\u0003\u0002\u0001\u0000j\u000b\u0001\u0000\u0000\u0000"+
		"kl\u0005\u0004\u0000\u0000lm\u0003\u0018\f\u0000mn\u0005\u001a\u0000\u0000"+
		"np\u0005\u0014\u0000\u0000oq\u0003\u0010\b\u0000po\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0015\u0000"+
		"\u0000st\u0003\u0002\u0001\u0000t\r\u0001\u0000\u0000\u0000uv\u0005\u001a"+
		"\u0000\u0000vx\u0005\u0014\u0000\u0000wy\u0003\u0014\n\u0000xw\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0015\u0000\u0000{|\u0005\u0018\u0000\u0000|\u000f\u0001\u0000\u0000"+
		"\u0000}\u0082\u0003\u0012\t\u0000~\u007f\u0005\u0019\u0000\u0000\u007f"+
		"\u0081\u0003\u0012\t\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u0018\f\u0000\u0086\u0087\u0005"+
		"\u001a\u0000\u0000\u0087\u008b\u0001\u0000\u0000\u0000\u0088\u008b\u0005"+
		"\u001a\u0000\u0000\u0089\u008b\u0005\u001b\u0000\u0000\u008a\u0085\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u0091\u0003"+
		"\u0016\u000b\u0000\u008d\u008e\u0005\u0019\u0000\u0000\u008e\u0090\u0003"+
		"\u0016\u000b\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0006\u000b\uffff\uffff\u0000\u0095\u0096"+
		"\u0005\u0014\u0000\u0000\u0096\u0097\u0003\u0016\u000b\u0000\u0097\u0098"+
		"\u0005\u0015\u0000\u0000\u0098\u00aa\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u001a\u0000\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b\u00aa\u0003"+
		"\u000e\u0007\u0000\u009c\u009d\u0005\u001a\u0000\u0000\u009d\u009e\u0005"+
		"\u0014\u0000\u0000\u009e\u009f\u0003\u0010\b\u0000\u009f\u00a0\u0005\u0015"+
		"\u0000\u0000\u00a0\u00aa\u0001\u0000\u0000\u0000\u00a1\u00aa\u0005\u001b"+
		"\u0000\u0000\u00a2\u00aa\u0005\u001a\u0000\u0000\u00a3\u00a4\u0005\u001a"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0014\u0000\u0000\u00a5\u00a6\u0003\u0016"+
		"\u000b\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0003\u000e\u0007\u0000\u00a9\u0094\u0001\u0000"+
		"\u0000\u0000\u00a9\u0099\u0001\u0000\u0000\u0000\u00a9\u009c\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00b1\u0001\u0000\u0000\u0000\u00ab\u00ac\n\b\u0000"+
		"\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad\u00ae\u0003\u0016\u000b\t"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u0017\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000"+
		"\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0001\u0000\u0000"+
		"\u00b7\u001b\u0001\u0000\u0000\u0000\u000f\u001f(069CTbpx\u0082\u008a"+
		"\u0091\u00a9\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}