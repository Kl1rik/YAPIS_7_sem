// Generated from /home/kl1rik/YAPIS_7_sem/lab_3/MathLangParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MathLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, MOD=5, POW=6, ASSIGN=7, LPAREN=8, RPAREN=9, 
		LBRACE=10, RBRACE=11, COLON=12, COMMA=13, SEMI=14, FUNC=15, RETURN=16, 
		GT=17, LT=18, EQ=19, NEQ=20, GTE=21, LTE=22, IF=23, ELSE=24, SWITCH=25, 
		CASE=26, DEFAULT=27, FOR=28, WHILE=29, ID=30, INT_LITERAL=31, FLOAT_LITERAL=32, 
		WS=33, NEWLINE=34;
	public static final int
		RULE_program = 0, RULE_function_definition = 1, RULE_parameters = 2, RULE_block = 3, 
		RULE_expr = 4, RULE_if_statement = 5, RULE_switch_statement = 6, RULE_case_block = 7, 
		RULE_update = 8, RULE_for_statement = 9, RULE_while_statement = 10, RULE_function_call = 11, 
		RULE_argument_list = 12, RULE_assignment = 13, RULE_return_statement = 14, 
		RULE_statement = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function_definition", "parameters", "block", "expr", "if_statement", 
			"switch_statement", "case_block", "update", "for_statement", "while_statement", 
			"function_call", "argument_list", "assignment", "return_statement", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", "'('", "')'", 
			"'{'", "'}'", "':'", "','", "';'", "'func'", "'return'", "'>'", "'<'", 
			"'=='", "'!='", "'>='", "'<='", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "ASSIGN", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "COLON", "COMMA", "SEMI", "FUNC", "RETURN", 
			"GT", "LT", "EQ", "NEQ", "GTE", "LTE", "IF", "ELSE", "SWITCH", "CASE", 
			"DEFAULT", "FOR", "WHILE", "ID", "INT_LITERAL", "FLOAT_LITERAL", "WS", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "MathLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(32);
					function_definition();
					}
					break;
				case LPAREN:
				case RETURN:
				case IF:
				case SWITCH:
				case FOR:
				case WHILE:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
					{
					setState(33);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8363540736L) != 0) );
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
	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MathLangParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(MathLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MathLangParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MathLangParser.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(FUNC);
			setState(39);
			match(ID);
			setState(40);
			match(LPAREN);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(41);
				parameters();
				}
			}

			setState(44);
			match(RPAREN);
			setState(45);
			match(LBRACE);
			setState(46);
			block();
			setState(47);
			match(RBRACE);
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
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParametersContext {
		public List<TerminalNode> ID() { return getTokens(MathLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MathLangParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathLangParser.COMMA, i);
		}
		public ParameterListContext(ParametersContext ctx) { copyFrom(ctx); }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			_localctx = new ParameterListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				match(ID);
				}
				}
				setState(56);
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends BlockContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			_localctx = new BlockStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8363507968L) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MathLangParser.MULT, 0); }
		public MultiplyExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends ExprContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(MathLangParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MathLangParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MathLangParser.PLUS, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GTExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(MathLangParser.GT, 0); }
		public GTExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ExprContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileStatementContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LTExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(MathLangParser.LT, 0); }
		public LTExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LTEExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTE() { return getToken(MathLangParser.LTE, 0); }
		public LTEExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MathLangParser.DIV, 0); }
		public DivideExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ExprContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ExprContext {
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public SwitchStatementContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GTEExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GTE() { return getToken(MathLangParser.GTE, 0); }
		public GTEExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EQExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MathLangParser.EQ, 0); }
		public EQExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NEQExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(MathLangParser.NEQ, 0); }
		public NEQExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MathLangParser.ID, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode INT_LITERAL() { return getToken(MathLangParser.INT_LITERAL, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MathLangParser.MINUS, 0); }
		public SubtractExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(MathLangParser.MOD, 0); }
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ExprContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForStatementContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(LPAREN);
				setState(65);
				expr(0);
				setState(66);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				function_call();
				}
				break;
			case 3:
				{
				_localctx = new IfStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				if_statement();
				}
				break;
			case 4:
				{
				_localctx = new SwitchStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				switch_statement();
				}
				break;
			case 5:
				{
				_localctx = new ForStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				for_statement();
				}
				break;
			case 6:
				{
				_localctx = new WhileStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				while_statement();
				}
				break;
			case 7:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(INT_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(FLOAT_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(79);
						match(PLUS);
						setState(80);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(82);
						match(MINUS);
						setState(83);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(85);
						match(MULT);
						setState(86);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(88);
						match(DIV);
						setState(89);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(91);
						match(MOD);
						setState(92);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(94);
						match(POW);
						setState(95);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new GTExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(97);
						match(GT);
						setState(98);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new LTExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(100);
						match(LT);
						setState(101);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new EQExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(103);
						match(EQ);
						setState(104);
						expr(14);
						}
						break;
					case 10:
						{
						_localctx = new NEQExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(106);
						match(NEQ);
						setState(107);
						expr(13);
						}
						break;
					case 11:
						{
						_localctx = new GTEExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						match(GTE);
						setState(110);
						expr(12);
						}
						break;
					case 12:
						{
						_localctx = new LTEExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(112);
						match(LTE);
						setState(113);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatementContext extends If_statementContext {
		public TerminalNode IF() { return getToken(MathLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(MathLangParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MathLangParser.LBRACE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(MathLangParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MathLangParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(MathLangParser.ELSE, 0); }
		public IfElseStatementContext(If_statementContext ctx) { copyFrom(ctx); }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		try {
			_localctx = new IfElseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(120);
			match(LPAREN);
			setState(121);
			expr(0);
			setState(122);
			match(RPAREN);
			setState(123);
			match(LBRACE);
			setState(124);
			block();
			setState(125);
			match(RBRACE);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(126);
				match(ELSE);
				setState(127);
				match(LBRACE);
				setState(128);
				block();
				setState(129);
				match(RBRACE);
				}
				break;
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
	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(MathLangParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MathLangParser.LBRACE, 0); }
		public Case_blockContext case_block() {
			return getRuleContext(Case_blockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MathLangParser.RBRACE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SWITCH);
			setState(134);
			match(LPAREN);
			setState(135);
			expr(0);
			setState(136);
			match(RPAREN);
			setState(137);
			match(LBRACE);
			setState(138);
			case_block();
			setState(139);
			match(RBRACE);
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
	public static class Case_blockContext extends ParserRuleContext {
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
	 
		public Case_blockContext() { }
		public void copyFrom(Case_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlockContext extends Case_blockContext {
		public List<TerminalNode> CASE() { return getTokens(MathLangParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(MathLangParser.CASE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(MathLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MathLangParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(MathLangParser.DEFAULT, 0); }
		public CaseBlockContext(Case_blockContext ctx) { copyFrom(ctx); }
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case_block);
		int _la;
		try {
			_localctx = new CaseBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(141);
				match(CASE);
				setState(142);
				expr(0);
				setState(143);
				match(COLON);
				setState(144);
				block();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(151);
				match(DEFAULT);
				setState(152);
				match(COLON);
				setState(153);
				block();
				}
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
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MathLangParser.ID, 0); }
		public List<TerminalNode> PLUS() { return getTokens(MathLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MathLangParser.PLUS, i);
		}
		public TerminalNode EQ() { return getToken(MathLangParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(MathLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MathLangParser.MINUS, i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(157);
				match(PLUS);
				setState(158);
				match(EQ);
				setState(159);
				expr(0);
				}
				break;
			case 2:
				{
				setState(160);
				match(MINUS);
				setState(161);
				match(EQ);
				setState(162);
				expr(0);
				}
				break;
			case 3:
				{
				setState(163);
				match(PLUS);
				setState(164);
				match(PLUS);
				}
				break;
			case 4:
				{
				setState(165);
				match(MINUS);
				setState(166);
				match(MINUS);
				}
				break;
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
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MathLangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MathLangParser.SEMI, 0); }
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MathLangParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MathLangParser.RBRACE, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(FOR);
			setState(170);
			match(LPAREN);
			setState(171);
			assignment();
			setState(172);
			expr(0);
			setState(173);
			match(SEMI);
			setState(174);
			update();
			setState(175);
			match(RPAREN);
			setState(176);
			match(LBRACE);
			setState(177);
			block();
			setState(178);
			match(RBRACE);
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MathLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MathLangParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MathLangParser.RBRACE, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			match(LPAREN);
			setState(182);
			expr(0);
			setState(183);
			match(RPAREN);
			setState(184);
			match(LBRACE);
			setState(185);
			block();
			setState(186);
			match(RBRACE);
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
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode ID() { return getToken(MathLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(LPAREN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8363442432L) != 0)) {
				{
				setState(190);
				argument_list();
				}
			}

			setState(193);
			match(RPAREN);
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
	public static class Argument_listContext extends ParserRuleContext {
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	 
		public Argument_listContext() { }
		public void copyFrom(Argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends Argument_listContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathLangParser.COMMA, i);
		}
		public ArgumentListContext(Argument_listContext ctx) { copyFrom(ctx); }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument_list);
		int _la;
		try {
			_localctx = new ArgumentListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			expr(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				expr(0);
				}
				}
				setState(202);
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(MathLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MathLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MathLangParser.SEMI, 0); }
		public AssignmentStmtContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			_localctx = new AssignmentStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(204);
			match(ASSIGN);
			setState(205);
			expr(0);
			setState(206);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MathLangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MathLangParser.SEMI, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(RETURN);
			setState(209);
			expr(0);
			setState(210);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MathLangParser.SEMI, 0); }
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				expr(0);
				setState(214);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				return_statement();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000$\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0001"+
		"\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004M\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004s\b\u0004\n\u0004\f\u0004v\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0084\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0093\b\u0007\n\u0007\f\u0007"+
		"\u0096\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009b\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00a8\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00c0\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00c7\b\f\n\f\f\f\u00ca\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00da"+
		"\b\u000f\u0001\u000f\u0000\u0001\b\u0010\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u00ef"+
		"\u0000\"\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004"+
		"1\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\bL\u0001\u0000"+
		"\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000"+
		"\u0012\u00a9\u0001\u0000\u0000\u0000\u0014\u00b4\u0001\u0000\u0000\u0000"+
		"\u0016\u00bc\u0001\u0000\u0000\u0000\u0018\u00c3\u0001\u0000\u0000\u0000"+
		"\u001a\u00cb\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000\u0000"+
		"\u001e\u00d9\u0001\u0000\u0000\u0000 #\u0003\u0002\u0001\u0000!#\u0003"+
		"\u001e\u000f\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u000f\u0000\u0000\'(\u0005"+
		"\u001e\u0000\u0000(*\u0005\b\u0000\u0000)+\u0003\u0004\u0002\u0000*)\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",-\u0005\t\u0000\u0000-.\u0005\n\u0000\u0000./\u0003\u0006\u0003\u0000"+
		"/0\u0005\u000b\u0000\u00000\u0003\u0001\u0000\u0000\u000016\u0005\u001e"+
		"\u0000\u000023\u0005\r\u0000\u000035\u0005\u001e\u0000\u000042\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009;\u0003\u001e\u000f\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0007"+
		"\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0006\u0004\uffff"+
		"\uffff\u0000@A\u0005\b\u0000\u0000AB\u0003\b\u0004\u0000BC\u0005\t\u0000"+
		"\u0000CM\u0001\u0000\u0000\u0000DM\u0003\u0016\u000b\u0000EM\u0003\n\u0005"+
		"\u0000FM\u0003\f\u0006\u0000GM\u0003\u0012\t\u0000HM\u0003\u0014\n\u0000"+
		"IM\u0005\u001f\u0000\u0000JM\u0005 \u0000\u0000KM\u0005\u001e\u0000\u0000"+
		"L?\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000"+
		"\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000"+
		"\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000Mt\u0001\u0000\u0000\u0000NO\n\u0015\u0000\u0000OP\u0005"+
		"\u0001\u0000\u0000Ps\u0003\b\u0004\u0016QR\n\u0014\u0000\u0000RS\u0005"+
		"\u0002\u0000\u0000Ss\u0003\b\u0004\u0015TU\n\u0013\u0000\u0000UV\u0005"+
		"\u0003\u0000\u0000Vs\u0003\b\u0004\u0014WX\n\u0012\u0000\u0000XY\u0005"+
		"\u0004\u0000\u0000Ys\u0003\b\u0004\u0013Z[\n\u0011\u0000\u0000[\\\u0005"+
		"\u0005\u0000\u0000\\s\u0003\b\u0004\u0012]^\n\u0010\u0000\u0000^_\u0005"+
		"\u0006\u0000\u0000_s\u0003\b\u0004\u0011`a\n\u000f\u0000\u0000ab\u0005"+
		"\u0011\u0000\u0000bs\u0003\b\u0004\u0010cd\n\u000e\u0000\u0000de\u0005"+
		"\u0012\u0000\u0000es\u0003\b\u0004\u000ffg\n\r\u0000\u0000gh\u0005\u0013"+
		"\u0000\u0000hs\u0003\b\u0004\u000eij\n\f\u0000\u0000jk\u0005\u0014\u0000"+
		"\u0000ks\u0003\b\u0004\rlm\n\u000b\u0000\u0000mn\u0005\u0015\u0000\u0000"+
		"ns\u0003\b\u0004\fop\n\n\u0000\u0000pq\u0005\u0016\u0000\u0000qs\u0003"+
		"\b\u0004\u000brN\u0001\u0000\u0000\u0000rQ\u0001\u0000\u0000\u0000rT\u0001"+
		"\u0000\u0000\u0000rW\u0001\u0000\u0000\u0000rZ\u0001\u0000\u0000\u0000"+
		"r]\u0001\u0000\u0000\u0000r`\u0001\u0000\u0000\u0000rc\u0001\u0000\u0000"+
		"\u0000rf\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000\u0000rl\u0001\u0000"+
		"\u0000\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\t\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0005\u0017\u0000\u0000xy\u0005\b\u0000\u0000"+
		"yz\u0003\b\u0004\u0000z{\u0005\t\u0000\u0000{|\u0005\n\u0000\u0000|}\u0003"+
		"\u0006\u0003\u0000}\u0083\u0005\u000b\u0000\u0000~\u007f\u0005\u0018\u0000"+
		"\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0003\u0006\u0003\u0000"+
		"\u0081\u0082\u0005\u000b\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000"+
		"\u0083~\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u000b\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0019\u0000\u0000\u0086"+
		"\u0087\u0005\b\u0000\u0000\u0087\u0088\u0003\b\u0004\u0000\u0088\u0089"+
		"\u0005\t\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a\u008b\u0003"+
		"\u000e\u0007\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\r\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\u001a\u0000\u0000\u008e\u008f\u0003\b\u0004"+
		"\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0003\u0006\u0003\u0000"+
		"\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u009a\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u001b\u0000\u0000"+
		"\u0098\u0099\u0005\f\u0000\u0000\u0099\u009b\u0003\u0006\u0003\u0000\u009a"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u000f\u0001\u0000\u0000\u0000\u009c\u00a7\u0005\u001e\u0000\u0000\u009d"+
		"\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0005\u0013\u0000\u0000\u009f"+
		"\u00a8\u0003\b\u0004\u0000\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0013\u0000\u0000\u00a2\u00a8\u0003\b\u0004\u0000\u00a3\u00a4\u0005"+
		"\u0001\u0000\u0000\u00a4\u00a8\u0005\u0001\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0002\u0000\u0000\u00a6\u00a8\u0005\u0002\u0000\u0000\u00a7\u009d\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u0011\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u001c\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab\u00ac\u0003\u001a"+
		"\r\u0000\u00ac\u00ad\u0003\b\u0004\u0000\u00ad\u00ae\u0005\u000e\u0000"+
		"\u0000\u00ae\u00af\u0003\u0010\b\u0000\u00af\u00b0\u0005\t\u0000\u0000"+
		"\u00b0\u00b1\u0005\n\u0000\u0000\u00b1\u00b2\u0003\u0006\u0003\u0000\u00b2"+
		"\u00b3\u0005\u000b\u0000\u0000\u00b3\u0013\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\u001d\u0000\u0000\u00b5\u00b6\u0005\b\u0000\u0000\u00b6\u00b7"+
		"\u0003\b\u0004\u0000\u00b7\u00b8\u0005\t\u0000\u0000\u00b8\u00b9\u0005"+
		"\n\u0000\u0000\u00b9\u00ba\u0003\u0006\u0003\u0000\u00ba\u00bb\u0005\u000b"+
		"\u0000\u0000\u00bb\u0015\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u001e"+
		"\u0000\u0000\u00bd\u00bf\u0005\b\u0000\u0000\u00be\u00c0\u0003\u0018\f"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\t\u0000\u0000"+
		"\u00c2\u0017\u0001\u0000\u0000\u0000\u00c3\u00c8\u0003\b\u0004\u0000\u00c4"+
		"\u00c5\u0005\r\u0000\u0000\u00c5\u00c7\u0003\b\u0004\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u0019"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u001e\u0000\u0000\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd\u00ce"+
		"\u0003\b\u0004\u0000\u00ce\u00cf\u0005\u000e\u0000\u0000\u00cf\u001b\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\u0010\u0000\u0000\u00d1\u00d2\u0003"+
		"\b\u0004\u0000\u00d2\u00d3\u0005\u000e\u0000\u0000\u00d3\u001d\u0001\u0000"+
		"\u0000\u0000\u00d4\u00da\u0003\u001a\r\u0000\u00d5\u00d6\u0003\b\u0004"+
		"\u0000\u00d6\u00d7\u0005\u000e\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"+
		"\u0000\u00d8\u00da\u0003\u001c\u000e\u0000\u00d9\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u001f\u0001\u0000\u0000\u0000\u000f\"$*6<Lrt\u0083\u0094"+
		"\u009a\u00a7\u00bf\u00c8\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}