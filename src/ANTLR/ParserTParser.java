package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, BEGIN=3, END=4, READ=5, PRINT=6, IF=7, ELSE=8, FOR=9, 
		WHILE=10, NUMBER_=11, STRING_=12, TRUE=13, FALSE=14, FLOAT_=15, PI_=16, 
		SUMA=17, RESTA=18, DIVISION=19, MULTIPLICACION=20, RAIZ=21, COSENO=22, 
		SENO=23, LOGARITMO=24, CORCHETE1=25, CORCHETE2=26, PARENTESIS1=27, PARENTESIS2=28, 
		LLAVE1=29, LLAVE2=30, OMATEMATICO=31, Y=32, O=33, OLOGICO=34, EQUAL=35, 
		ID=36, NUMBER=37, FLOAT=38, STRING=39, WS=40, PI=41;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'='", "'Commence'", "'Endo'", "'read'", "'print'", 
		"'if'", "'else'", "'for'", "'while'", "'nat'", "'string'", "'true'", "'false'", 
		"'float'", "'pi'", "'sum'", "'minus'", "'div'", "'prod'", "'sqrt'", "'cos'", 
		"'sen'", "'log'", "'['", "']'", "'('", "')'", "'{'", "'}'", "OMATEMATICO", 
		"'YY'", "'OO'", "OLOGICO", "'==='", "ID", "NUMBER", "FLOAT", "STRING", 
		"WS", "'3.14'"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_assign = 3, 
		RULE_condition_block = 4, RULE_content_block = 5, RULE_operation = 6, 
		RULE_for_operation = 7, RULE_read = 8, RULE_print = 9, RULE_while_block = 10, 
		RULE_for_block = 11, RULE_if_block = 12, RULE_suma = 13, RULE_resta = 14, 
		RULE_div = 15, RULE_mult = 16, RULE_raiz = 17, RULE_cos = 18, RULE_sen = 19, 
		RULE_log = 20;
	public static final String[] ruleNames = {
		"program", "statement", "block", "assign", "condition_block", "content_block", 
		"operation", "for_operation", "read", "print", "while_block", "for_block", 
		"if_block", "suma", "resta", "div", "mult", "raiz", "cos", "sen", "log"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(42); match(BEGIN);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43); statement();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << WHILE) | (1L << PARENTESIS1) | (1L << LLAVE1) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(48); match(END);
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
		public Content_blockContext content_block() {
			return getRuleContext(Content_blockContext.class,0);
		}
		public For_operationContext for_operation() {
			return getRuleContext(For_operationContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); while_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); condition_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); operation(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54); content_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55); for_operation();
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58); statement();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << WHILE) | (1L << PARENTESIS1) | (1L << LLAVE1) | (1L << ID) | (1L << NUMBER))) != 0) );
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
		public List<TerminalNode> ID() { return getTokens(ParserTParser.ID); }
		public TerminalNode STRING_() { return getToken(ParserTParser.STRING_, 0); }
		public TerminalNode NUMBER_() { return getToken(ParserTParser.NUMBER_, 0); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public TerminalNode FLOAT_() { return getToken(ParserTParser.FLOAT_, 0); }
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
		enterRule(_localctx, 6, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_) | (1L << STRING_) | (1L << FLOAT_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(64); match(ID);
			setState(65); match(T__0);
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
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
		enterRule(_localctx, 8, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(PARENTESIS1);
			setState(69); operation(0);
			setState(70); match(PARENTESIS2);
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
		public TerminalNode LLAVE2() { return getToken(ParserTParser.LLAVE2, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_content_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(LLAVE1);
			setState(73); block();
			setState(74); match(LLAVE2);
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
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode OLOGICO() { return getToken(ParserTParser.OLOGICO, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operation);
					setState(79);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(80); match(EQUAL);
					setState(81); operation(0);
					setState(84);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(82); match(OLOGICO);
						setState(83); operation(0);
						}
						break;
					}
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
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
		enterRule(_localctx, 14, RULE_for_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(ID);
			setState(92); match(EQUAL);
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode READ() { return getToken(ParserTParser.READ, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
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
		enterRule(_localctx, 16, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(READ);
			setState(96); match(PARENTESIS1);
			{
			setState(97); match(ID);
			}
			setState(98); match(PARENTESIS2);
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
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
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
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(PRINT);
			setState(101); match(PARENTESIS1);
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(103); match(PARENTESIS2);
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
		public Content_blockContext content_block() {
			return getRuleContext(Content_blockContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
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
		enterRule(_localctx, 20, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(WHILE);
			setState(106); condition_block();
			setState(107); content_block();
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
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public For_operationContext for_operation() {
			return getRuleContext(For_operationContext.class,0);
		}
		public Content_blockContext content_block() {
			return getRuleContext(Content_blockContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
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
		enterRule(_localctx, 22, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(FOR);
			setState(110); match(PARENTESIS1);
			setState(111); match(ID);
			setState(112); match(T__1);
			setState(113); for_operation();
			setState(114); match(PARENTESIS2);
			setState(115); content_block();
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
		public TerminalNode ELSE() { return getToken(ParserTParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public Content_blockContext content_block(int i) {
			return getRuleContext(Content_blockContext.class,i);
		}
		public List<Content_blockContext> content_block() {
			return getRuleContexts(Content_blockContext.class);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(IF);
			setState(118); condition_block();
			setState(119); content_block();
			setState(122);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(120); match(ELSE);
				setState(121); content_block();
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

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserTParser.ID); }
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(SUMA);
			setState(125); match(ID);
			setState(126); match(PARENTESIS1);
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(128); match(PARENTESIS2);
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

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserTParser.ID); }
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_resta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(RESTA);
			setState(131); match(ID);
			setState(132); match(PARENTESIS1);
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(134); match(PARENTESIS2);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(ParserTParser.DIVISION, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserTParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(DIVISION);
			setState(137); match(ID);
			setState(138); match(PARENTESIS1);
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(140); match(PARENTESIS2);
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

	public static class MultContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserTParser.ID); }
		public TerminalNode MULTIPLICACION() { return getToken(ParserTParser.MULTIPLICACION, 0); }
		public TerminalNode ID(int i) {
			return getToken(ParserTParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(MULTIPLICACION);
			setState(143); match(ID);
			setState(144); match(PARENTESIS1);
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(146); match(PARENTESIS2);
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

	public static class RaizContext extends ParserRuleContext {
		public TerminalNode RAIZ() { return getToken(ParserTParser.RAIZ, 0); }
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_raiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(RAIZ);
			setState(149); match(PARENTESIS1);
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(151); match(PARENTESIS2);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(COSENO);
			setState(154); match(PARENTESIS1);
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(156); match(PARENTESIS2);
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

	public static class SenContext extends ParserRuleContext {
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public SenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(SENO);
			setState(159); match(PARENTESIS1);
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(161); match(PARENTESIS2);
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserTParser.ID, 0); }
		public TerminalNode LOGARITMO() { return getToken(ParserTParser.LOGARITMO, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PARENTESIS1() { return getToken(ParserTParser.PARENTESIS1, 0); }
		public TerminalNode PARENTESIS2() { return getToken(ParserTParser.PARENTESIS2, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(LOGARITMO);
			setState(164); match(PARENTESIS1);
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(166); match(PARENTESIS2);
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
		case 6: return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\6\4>\n\4\r\4\16\4?\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bW\n\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16}\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\2\3\16"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\4\2\r\16\21\21\3"+
		"\2&)\3\2&\'\3\2&(\u009f\2,\3\2\2\2\4:\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\n"+
		"F\3\2\2\2\fJ\3\2\2\2\16N\3\2\2\2\20]\3\2\2\2\22a\3\2\2\2\24f\3\2\2\2\26"+
		"k\3\2\2\2\30o\3\2\2\2\32w\3\2\2\2\34~\3\2\2\2\36\u0084\3\2\2\2 \u008a"+
		"\3\2\2\2\"\u0090\3\2\2\2$\u0096\3\2\2\2&\u009b\3\2\2\2(\u00a0\3\2\2\2"+
		"*\u00a5\3\2\2\2,.\7\5\2\2-/\5\4\3\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\6\2\2\63\3\3\2\2\2\64;\5\24\13\2"+
		"\65;\5\26\f\2\66;\5\n\6\2\67;\5\16\b\28;\5\f\7\29;\5\20\t\2:\64\3\2\2"+
		"\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2"+
		"<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2AB\t\2\2"+
		"\2BC\7&\2\2CD\7\4\2\2DE\t\3\2\2E\t\3\2\2\2FG\7\35\2\2GH\5\16\b\2HI\7\36"+
		"\2\2I\13\3\2\2\2JK\7\37\2\2KL\5\6\4\2LM\7 \2\2M\r\3\2\2\2NO\b\b\1\2OP"+
		"\t\4\2\2PZ\3\2\2\2QR\f\3\2\2RS\7%\2\2SV\5\16\b\2TU\7$\2\2UW\5\16\b\2V"+
		"T\3\2\2\2VW\3\2\2\2WY\3\2\2\2XQ\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\17\3\2\2\2\\Z\3\2\2\2]^\7&\2\2^_\7%\2\2_`\t\5\2\2`\21\3\2\2\2ab\7\7"+
		"\2\2bc\7\35\2\2cd\7&\2\2de\7\36\2\2e\23\3\2\2\2fg\7\b\2\2gh\7\35\2\2h"+
		"i\t\3\2\2ij\7\36\2\2j\25\3\2\2\2kl\7\f\2\2lm\5\n\6\2mn\5\f\7\2n\27\3\2"+
		"\2\2op\7\13\2\2pq\7\35\2\2qr\7&\2\2rs\7\3\2\2st\5\20\t\2tu\7\36\2\2uv"+
		"\5\f\7\2v\31\3\2\2\2wx\7\t\2\2xy\5\n\6\2y|\5\f\7\2z{\7\n\2\2{}\5\f\7\2"+
		"|z\3\2\2\2|}\3\2\2\2}\33\3\2\2\2~\177\7\23\2\2\177\u0080\7&\2\2\u0080"+
		"\u0081\7\35\2\2\u0081\u0082\t\5\2\2\u0082\u0083\7\36\2\2\u0083\35\3\2"+
		"\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7&\2\2\u0086\u0087\7\35\2\2\u0087"+
		"\u0088\t\5\2\2\u0088\u0089\7\36\2\2\u0089\37\3\2\2\2\u008a\u008b\7\25"+
		"\2\2\u008b\u008c\7&\2\2\u008c\u008d\7\35\2\2\u008d\u008e\t\5\2\2\u008e"+
		"\u008f\7\36\2\2\u008f!\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0092\7&\2\2"+
		"\u0092\u0093\7\35\2\2\u0093\u0094\t\5\2\2\u0094\u0095\7\36\2\2\u0095#"+
		"\3\2\2\2\u0096\u0097\7\27\2\2\u0097\u0098\7\35\2\2\u0098\u0099\t\5\2\2"+
		"\u0099\u009a\7\36\2\2\u009a%\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u009d"+
		"\7\35\2\2\u009d\u009e\t\5\2\2\u009e\u009f\7\36\2\2\u009f\'\3\2\2\2\u00a0"+
		"\u00a1\7\31\2\2\u00a1\u00a2\7\35\2\2\u00a2\u00a3\t\5\2\2\u00a3\u00a4\7"+
		"\36\2\2\u00a4)\3\2\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7\35\2\2\u00a7"+
		"\u00a8\t\5\2\2\u00a8\u00a9\7\36\2\2\u00a9+\3\2\2\2\b\60:?VZ|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}