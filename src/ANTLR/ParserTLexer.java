package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "BEGIN", "END", "READ", "PRINT", "IF", "ELSE", "FOR", 
		"WHILE", "NUMBER_", "STRING_", "TRUE", "FALSE", "FLOAT_", "PI_", "SUMA", 
		"RESTA", "DIVISION", "MULTIPLICACION", "RAIZ", "COSENO", "SENO", "LOGARITMO", 
		"CORCHETE1", "CORCHETE2", "PARENTESIS1", "PARENTESIS2", "LLAVE1", "LLAVE2", 
		"OMATEMATICO", "Y", "O", "OLOGICO", "EQUAL", "ID", "NUMBER", "FLOAT", 
		"STRING", "WS", "PI"
	};


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\5#\u00de\n#\3$\3$\3$\3$\3"+
		"%\6%\u00e5\n%\r%\16%\u00e6\3&\6&\u00ea\n&\r&\16&\u00eb\3\'\6\'\u00ef\n"+
		"\'\r\'\16\'\u00f0\3\'\3\'\6\'\u00f5\n\'\r\'\16\'\u00f6\3(\3(\7(\u00fb"+
		"\n(\f(\16(\u00fe\13(\3(\3(\3)\6)\u0103\n)\r)\16)\u0104\3)\3)\3*\3*\3*"+
		"\3*\3*\3\u00fc\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\5\2,-//\61\61\3\2c|"+
		"\3\2\62;\5\2\13\f\17\17\"\"\u0113\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\tb\3"+
		"\2\2\2\13g\3\2\2\2\rl\3\2\2\2\17r\3\2\2\2\21u\3\2\2\2\23z\3\2\2\2\25~"+
		"\3\2\2\2\27\u0084\3\2\2\2\31\u0088\3\2\2\2\33\u008f\3\2\2\2\35\u0094\3"+
		"\2\2\2\37\u009a\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%\u00a7\3\2\2\2\'"+
		"\u00ad\3\2\2\2)\u00b1\3\2\2\2+\u00b6\3\2\2\2-\u00bb\3\2\2\2/\u00bf\3\2"+
		"\2\2\61\u00c3\3\2\2\2\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2"+
		"\29\u00cd\3\2\2\2;\u00cf\3\2\2\2=\u00d1\3\2\2\2?\u00d3\3\2\2\2A\u00d5"+
		"\3\2\2\2C\u00d8\3\2\2\2E\u00dd\3\2\2\2G\u00df\3\2\2\2I\u00e4\3\2\2\2K"+
		"\u00e9\3\2\2\2M\u00ee\3\2\2\2O\u00f8\3\2\2\2Q\u0102\3\2\2\2S\u0108\3\2"+
		"\2\2UV\7=\2\2V\4\3\2\2\2WX\7?\2\2X\6\3\2\2\2YZ\7E\2\2Z[\7q\2\2[\\\7o\2"+
		"\2\\]\7o\2\2]^\7g\2\2^_\7p\2\2_`\7e\2\2`a\7g\2\2a\b\3\2\2\2bc\7G\2\2c"+
		"d\7p\2\2de\7f\2\2ef\7q\2\2f\n\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2jk\7f"+
		"\2\2k\f\3\2\2\2lm\7r\2\2mn\7t\2\2no\7k\2\2op\7p\2\2pq\7v\2\2q\16\3\2\2"+
		"\2rs\7k\2\2st\7h\2\2t\20\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y"+
		"\22\3\2\2\2z{\7h\2\2{|\7q\2\2|}\7t\2\2}\24\3\2\2\2~\177\7y\2\2\177\u0080"+
		"\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083"+
		"\26\3\2\2\2\u0084\u0085\7p\2\2\u0085\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7i\2\2\u008e\32\3\2\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2"+
		"\u0093\34\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7"+
		"n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\36\3\2\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7v\2\2\u009f \3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\"\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7o\2\2\u00a6"+
		"$\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7w\2\2\u00ab\u00ac\7u\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7x\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7f\2\2\u00b5*\3\2\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7s\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba,\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7u\2"+
		"\2\u00be.\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7"+
		"p\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7i\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8\64\3\2\2\2\u00c9\u00ca"+
		"\7_\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc8\3\2\2\2\u00cd\u00ce"+
		"\7+\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7"+
		"\177\2\2\u00d2>\3\2\2\2\u00d3\u00d4\t\2\2\2\u00d4@\3\2\2\2\u00d5\u00d6"+
		"\7[\2\2\u00d6\u00d7\7[\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da"+
		"\7Q\2\2\u00daD\3\2\2\2\u00db\u00de\5A!\2\u00dc\u00de\5C\"\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00dc\3\2\2\2\u00deF\3\2\2\2\u00df\u00e0\7?\2\2\u00e0\u00e1"+
		"\7?\2\2\u00e1\u00e2\7?\2\2\u00e2H\3\2\2\2\u00e3\u00e5\t\3\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"J\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecL\3\2\2\2\u00ed\u00ef\t"+
		"\4\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7\60\2\2\u00f3\u00f5\t"+
		"\4\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7N\3\2\2\2\u00f8\u00fc\7$\2\2\u00f9\u00fb\13\2\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7$\2\2\u0100"+
		"P\3\2\2\2\u0101\u0103\t\5\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107"+
		"\b)\2\2\u0107R\3\2\2\2\u0108\u0109\7\65\2\2\u0109\u010a\7\60\2\2\u010a"+
		"\u010b\7\63\2\2\u010b\u010c\7\66\2\2\u010cT\3\2\2\2\n\2\u00dd\u00e6\u00eb"+
		"\u00f0\u00f6\u00fc\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}