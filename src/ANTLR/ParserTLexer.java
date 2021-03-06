package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "BEGIN", "END", "READ", "PRINT", "IF", "ELSE", "FOR", "WHILE", 
		"NUMBER_", "STRING_", "TRUE", "FALSE", "FLOAT_", "PI_", "RAIZ", "COSENO", 
		"SENO", "LOGARITMO", "CORCHETE1", "CORCHETE2", "PARENTESIS1", "PARENTESIS2", 
		"LLAVE1", "LLAVE2", "SUMA", "RESTA", "DIVISION", "MULTIPLICACION", "Y", 
		"O", "OLOGICO", "EQUAL", "IGUAL", "ID", "NUMBER", "FLOAT", "STRING", "WS", 
		"PI"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u00cd\n!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3$\6$\u00d6\n$\r$\16$\u00d7\3%\6%\u00db\n%\r%\16%\u00dc\3&\6&\u00e0\n"+
		"&\r&\16&\u00e1\3&\3&\6&\u00e6\n&\r&\16&\u00e7\3\'\3\'\7\'\u00ec\n\'\f"+
		"\'\16\'\u00ef\13\'\3\'\3\'\3(\6(\u00f4\n(\r(\16(\u00f5\3(\3(\3)\3)\3)"+
		"\3)\3)\3\u00ed\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\5\3\2c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3S\3\2\2\2\5U\3\2\2\2\7^\3\2\2\2\tc\3\2\2\2\13h\3\2\2\2\rn\3\2\2"+
		"\2\17q\3\2\2\2\21v\3\2\2\2\23z\3\2\2\2\25\u0080\3\2\2\2\27\u0084\3\2\2"+
		"\2\31\u008b\3\2\2\2\33\u0090\3\2\2\2\35\u0096\3\2\2\2\37\u009c\3\2\2\2"+
		"!\u009f\3\2\2\2#\u00a4\3\2\2\2%\u00a8\3\2\2\2\'\u00ac\3\2\2\2)\u00b0\3"+
		"\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00b6\3\2\2\2\61\u00b8\3\2\2\2\63"+
		"\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00c0\3\2\2\2;\u00c2"+
		"\3\2\2\2=\u00c4\3\2\2\2?\u00c7\3\2\2\2A\u00cc\3\2\2\2C\u00ce\3\2\2\2E"+
		"\u00d2\3\2\2\2G\u00d5\3\2\2\2I\u00da\3\2\2\2K\u00df\3\2\2\2M\u00e9\3\2"+
		"\2\2O\u00f3\3\2\2\2Q\u00f9\3\2\2\2ST\7=\2\2T\4\3\2\2\2UV\7E\2\2VW\7q\2"+
		"\2WX\7o\2\2XY\7o\2\2YZ\7g\2\2Z[\7p\2\2[\\\7e\2\2\\]\7g\2\2]\6\3\2\2\2"+
		"^_\7G\2\2_`\7p\2\2`a\7f\2\2ab\7q\2\2b\b\3\2\2\2cd\7t\2\2de\7g\2\2ef\7"+
		"c\2\2fg\7f\2\2g\n\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2"+
		"m\f\3\2\2\2no\7k\2\2op\7h\2\2p\16\3\2\2\2qr\7g\2\2rs\7n\2\2st\7u\2\2t"+
		"u\7g\2\2u\20\3\2\2\2vw\7h\2\2wx\7q\2\2xy\7t\2\2y\22\3\2\2\2z{\7y\2\2{"+
		"|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177\24\3\2\2\2\u0080\u0081\7p\2"+
		"\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083\26\3\2\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7i\2\2\u008a\30\3\2\2\2\u008b\u008c\7v\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7w\2\2\u008e\u008f\7g\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\7h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2"+
		"\u0094\u0095\7g\2\2\u0095\34\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7"+
		"n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b\36"+
		"\3\2\2\2\u009c\u009d\7r\2\2\u009d\u009e\7k\2\2\u009e \3\2\2\2\u009f\u00a0"+
		"\7u\2\2\u00a0\u00a1\7s\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\"\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"&\3\2\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7i\2\2\u00af"+
		"(\3\2\2\2\u00b0\u00b1\7]\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3,"+
		"\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7\60"+
		"\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb"+
		"\64\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7/\2\2\u00bf"+
		"8\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3"+
		"<\3\2\2\2\u00c4\u00c5\7[\2\2\u00c5\u00c6\7[\2\2\u00c6>\3\2\2\2\u00c7\u00c8"+
		"\7Q\2\2\u00c8\u00c9\7Q\2\2\u00c9@\3\2\2\2\u00ca\u00cd\5=\37\2\u00cb\u00cd"+
		"\5? \2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cdB\3\2\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7?\2\2\u00d1D\3\2\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3F\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8H\3\2\2\2\u00d9"+
		"\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00ddJ\3\2\2\2\u00de\u00e0\t\3\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\7\60\2\2\u00e4\u00e6\t\3\2\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"L\3\2\2\2\u00e9\u00ed\7$\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00ef\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7$\2\2\u00f1N\3\2\2\2\u00f2\u00f4"+
		"\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b(\2\2\u00f8P\3\2\2\2\u00f9"+
		"\u00fa\7\65\2\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\7\63\2\2\u00fc\u00fd"+
		"\7\66\2\2\u00fdR\3\2\2\2\n\2\u00cc\u00d7\u00dc\u00e1\u00e7\u00ed\u00f5"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}