package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGIN=2, END=3, READ=4, PRINT=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		NUMBER_=10, STRING_=11, TRUE=12, FALSE=13, FLOAT_=14, PI_=15, RAIZ=16, 
		COSENO=17, SENO=18, LOGARITMO=19, CORCHETE1=20, CORCHETE2=21, PARENTESIS1=22, 
		PARENTESIS2=23, LLAVE1=24, LLAVE2=25, SUMA=26, RESTA=27, DIVISION=28, 
		MULTIPLICACION=29, Y=30, O=31, OLOGICO=32, EQUAL=33, IGUAL=34, ID=35, 
		NUMBER=36, FLOAT=37, STRING=38, WS=39, PI=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_declare = 3, 
		RULE_assign = 4, RULE_condition_block = 5, RULE_content_block = 6, RULE_operation = 7, 
		RULE_for_operation = 8, RULE_read = 9, RULE_print = 10, RULE_while_block = 11, 
		RULE_for_block = 12, RULE_if_block = 13;
	public static final String[] ruleNames = {
		"program", "statement", "block", "declare", "assign", "condition_block", 
		"content_block", "operation", "for_operation", "read", "print", "while_block", 
		"for_block", "if_block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'Commence'", "'Endo'", "'read'", "'print'", "'if'", "'else'", 
		"'for'", "'while'", "'nat'", "'string'", "'true'", "'false'", "'float'", 
		"'pi'", "'sqrt'", "'cos'", "'sen'", "'log'", "'['", "']'", "'('", "')'", 
		"'{'", "'}'", "'+'", "'-'", "'/'", "'*'", "'YY'", "'OO'", null, "'==='", 
		"'='", null, null, null, null, null, "'3.14'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BEGIN", "END", "READ", "PRINT", "IF", "ELSE", "FOR", "WHILE", 
		"NUMBER_", "STRING_", "TRUE", "FALSE", "FLOAT_", "PI_", "RAIZ", "COSENO", 
		"SENO", "LOGARITMO", "CORCHETE1", "CORCHETE2", "PARENTESIS1", "PARENTESIS2", 
		"LLAVE1", "LLAVE2", "SUMA", "RESTA", "DIVISION", "MULTIPLICACION", "Y", 
		"O", "OLOGICO", "EQUAL", "IGUAL", "ID", "NUMBER", "FLOAT", "STRING", "WS", 
		"PI"
	};
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
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode EOF() { return getToken(ParserTParser.EOF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(BEGIN);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER_) | (1L << STRING_) | (1L << FLOAT_) | (1L << RAIZ) | (1L << COSENO) | (1L << SENO) | (1L << LOGARITMO) | (1L << PARENTESIS1) | (1L << LLAVE1) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
			setState(34);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Content_blockContext content_block() {
			return getRuleContext(Content_blockContext.class,0);
		}
		public For_operationContext for_operation() {
			return getRuleContext(For_operationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				while_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				condition_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				operation(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				content_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				for_operation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				read();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(44);
				for_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(45);
				if_block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(46);
				declare();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << NUMBER_) | (1L << STRING_) | (1L << FLOAT_) | (1L << RAIZ) | (1L << COSENO) | (1L << SENO) | (1L << LOGARITMO) | (1L << PARENTESIS1) | (1L << LLAVE1) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
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

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(ParserTParser.NUMBER_, 0); }
		public TerminalNode STRING_() { return getToken(ParserTParser.STRING_, 0); }
		public TerminalNode FLOAT_() { return getToken(ParserTParser.FLOAT_, 0); }
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_) | (1L << STRING_) | (1L << FLOAT_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55);
				match(ID);
				}
				break;
			case 2:
				{
				setState(56);
				assign();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(IGUAL);
			setState(61);
			operation(0);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(PARENTESIS1);
			setState(64);
			operation(0);
			setState(65);
			match(PARENTESIS2);
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

	public static class Content_blockContext extends ParserRuleContext {
		public TerminalNode LLAVE1() { return getToken(ParserTParser.LLAVE1, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LLAVE2() { return getToken(ParserTParser.LLAVE2, 0); }
		public Content_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitContent_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Content_blockContext content_block() throws RecognitionException {
		Content_blockContext _localctx = new Content_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LLAVE1);
			setState(68);
			block();
			setState(69);
			match(LLAVE2);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public TerminalNode RAIZ() { return getToken(ParserTParser.RAIZ, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
		public TerminalNode LOGARITMO() { return getToken(ParserTParser.LOGARITMO, 0); }
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode Y() { return getToken(ParserTParser.Y, 0); }
		public TerminalNode O() { return getToken(ParserTParser.O, 0); }
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public TerminalNode DIVISION() { return getToken(ParserTParser.DIVISION, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(ParserTParser.MULTIPLICACION, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
			case FLOAT:
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RAIZ:
				{
				setState(73);
				match(RAIZ);
				setState(74);
				match(PARENTESIS1);
				setState(75);
				operation(0);
				setState(76);
				match(PARENTESIS2);
				}
				break;
			case COSENO:
				{
				setState(78);
				match(COSENO);
				setState(79);
				match(PARENTESIS1);
				setState(80);
				operation(0);
				setState(81);
				match(PARENTESIS2);
				}
				break;
			case SENO:
				{
				setState(83);
				match(SENO);
				setState(84);
				match(PARENTESIS1);
				setState(85);
				operation(0);
				setState(86);
				match(PARENTESIS2);
				}
				break;
			case LOGARITMO:
				{
				setState(88);
				match(LOGARITMO);
				setState(89);
				match(PARENTESIS1);
				setState(90);
				operation(0);
				setState(91);
				match(PARENTESIS2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(95);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(96);
						match(EQUAL);
						setState(97);
						operation(12);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(98);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(99);
						match(Y);
						setState(100);
						operation(11);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(101);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(102);
						match(O);
						setState(103);
						operation(10);
						}
						break;
					case 4:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(104);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(105);
						match(SUMA);
						setState(106);
						operation(9);
						}
						break;
					case 5:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(107);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(108);
						match(RESTA);
						setState(109);
						operation(8);
						}
						break;
					case 6:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						match(DIVISION);
						setState(112);
						operation(7);
						}
						break;
					case 7:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						match(MULTIPLICACION);
						setState(115);
						operation(6);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class For_operationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserTParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public For_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFor_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_operationContext for_operation() throws RecognitionException {
		For_operationContext _localctx = new For_operationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(EQUAL);
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ParserTParser.READ, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(READ);
			setState(126);
			match(PARENTESIS1);
			{
			setState(127);
			match(ID);
			}
			setState(128);
			match(PARENTESIS2);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(PRINT);
			setState(131);
			match(PARENTESIS1);
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(PARENTESIS2);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public Content_blockContext content_block() {
			return getRuleContext(Content_blockContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(136);
			condition_block();
			setState(137);
			content_block();
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public For_operationContext for_operation() {
			return getRuleContext(For_operationContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public Content_blockContext content_block() {
			return getRuleContext(Content_blockContext.class,0);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FOR);
			setState(140);
			match(PARENTESIS1);
			setState(141);
			match(ID);
			setState(142);
			match(T__0);
			setState(143);
			for_operation();
			setState(144);
			match(PARENTESIS2);
			setState(145);
			content_block();
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public List<Content_blockContext> content_block() {
			return getRuleContexts(Content_blockContext.class);
		}
		public Content_blockContext content_block(int i) {
			return getRuleContext(Content_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserTParser.ELSE, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			condition_block();
			setState(149);
			content_block();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(150);
				match(ELSE);
				setState(151);
				content_block();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\6\4"+
		"\65\n\4\r\4\16\4\66\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tw\n\t"+
		"\f\t\16\tz\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u009b\n\17\3\17\2\3\20\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\5\4\2\f\r\20\20\3\2%\'\3\2%(\2\u00a7\2\36\3\2\2\2\4"+
		"\61\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\n=\3\2\2\2\fA\3\2\2\2\16E\3\2\2\2"+
		"\20_\3\2\2\2\22{\3\2\2\2\24\177\3\2\2\2\26\u0084\3\2\2\2\30\u0089\3\2"+
		"\2\2\32\u008d\3\2\2\2\34\u0095\3\2\2\2\36 \7\4\2\2\37!\5\4\3\2 \37\3\2"+
		"\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&"+
		"\62\5\26\f\2\'\62\5\30\r\2(\62\5\f\7\2)\62\5\20\t\2*\62\5\16\b\2+\62\5"+
		"\22\n\2,\62\5\n\6\2-\62\5\24\13\2.\62\5\32\16\2/\62\5\34\17\2\60\62\5"+
		"\b\5\2\61&\3\2\2\2\61\'\3\2\2\2\61(\3\2\2\2\61)\3\2\2\2\61*\3\2\2\2\61"+
		"+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2"+
		"\2\62\5\3\2\2\2\63\65\5\4\3\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\7\3\2\2\28;\t\2\2\29<\7%\2\2:<\5\n\6\2;9\3\2\2\2;"+
		":\3\2\2\2<\t\3\2\2\2=>\7%\2\2>?\7$\2\2?@\5\20\t\2@\13\3\2\2\2AB\7\30\2"+
		"\2BC\5\20\t\2CD\7\31\2\2D\r\3\2\2\2EF\7\32\2\2FG\5\6\4\2GH\7\33\2\2H\17"+
		"\3\2\2\2IJ\b\t\1\2J`\t\3\2\2KL\7\22\2\2LM\7\30\2\2MN\5\20\t\2NO\7\31\2"+
		"\2O`\3\2\2\2PQ\7\23\2\2QR\7\30\2\2RS\5\20\t\2ST\7\31\2\2T`\3\2\2\2UV\7"+
		"\24\2\2VW\7\30\2\2WX\5\20\t\2XY\7\31\2\2Y`\3\2\2\2Z[\7\25\2\2[\\\7\30"+
		"\2\2\\]\5\20\t\2]^\7\31\2\2^`\3\2\2\2_I\3\2\2\2_K\3\2\2\2_P\3\2\2\2_U"+
		"\3\2\2\2_Z\3\2\2\2`x\3\2\2\2ab\f\r\2\2bc\7#\2\2cw\5\20\t\16de\f\f\2\2"+
		"ef\7 \2\2fw\5\20\t\rgh\f\13\2\2hi\7!\2\2iw\5\20\t\fjk\f\n\2\2kl\7\34\2"+
		"\2lw\5\20\t\13mn\f\t\2\2no\7\35\2\2ow\5\20\t\npq\f\b\2\2qr\7\36\2\2rw"+
		"\5\20\t\tst\f\7\2\2tu\7\37\2\2uw\5\20\t\bva\3\2\2\2vd\3\2\2\2vg\3\2\2"+
		"\2vj\3\2\2\2vm\3\2\2\2vp\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y\21\3\2\2\2zx\3\2\2\2{|\7%\2\2|}\7#\2\2}~\t\3\2\2~\23\3\2\2\2\177\u0080"+
		"\7\6\2\2\u0080\u0081\7\30\2\2\u0081\u0082\7%\2\2\u0082\u0083\7\31\2\2"+
		"\u0083\25\3\2\2\2\u0084\u0085\7\7\2\2\u0085\u0086\7\30\2\2\u0086\u0087"+
		"\t\4\2\2\u0087\u0088\7\31\2\2\u0088\27\3\2\2\2\u0089\u008a\7\13\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008c\5\16\b\2\u008c\31\3\2\2\2\u008d\u008e\7\n\2"+
		"\2\u008e\u008f\7\30\2\2\u008f\u0090\7%\2\2\u0090\u0091\7\3\2\2\u0091\u0092"+
		"\5\22\n\2\u0092\u0093\7\31\2\2\u0093\u0094\5\16\b\2\u0094\33\3\2\2\2\u0095"+
		"\u0096\7\b\2\2\u0096\u0097\5\f\7\2\u0097\u009a\5\16\b\2\u0098\u0099\7"+
		"\t\2\2\u0099\u009b\5\16\b\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\35\3\2\2\2\n\"\61\66;_vx\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}