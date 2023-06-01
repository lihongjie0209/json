// Generated from D:/code/json/src/main/resources\Json.g4 by ANTLR 4.12.0
package cn.lihongjie.json;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "WS"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

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
		"\u0004\u0000\f|\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0005\tC\b\t\n\t\f\tF\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\nM\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0003\rX\b\r\u0001"+
		"\r\u0001\r\u0003\r\\\b\r\u0001\r\u0003\r_\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\re\b\r\u0003\rg\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000el\b\u000e\n\u000e\f\u000eo\t\u000e\u0003\u000eq\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000fu\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u000b\u001d"+
		"\u0000\u001f\u0000!\f\u0001\u0000\b\u0002\u0000\"\"\\\\\b\u0000\"\"//"+
		"\\\\bbffnnrrtt\u0003\u000009AFaf\u0001\u000019\u0001\u000009\u0002\u0000"+
		"EEee\u0002\u0000++--\u0003\u0000\t\n\r\r  \u0081\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%"+
		"\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001"+
		"\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000"+
		"\u0000\r/\u0001\u0000\u0000\u0000\u000f4\u0001\u0000\u0000\u0000\u0011"+
		":\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015I\u0001"+
		"\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000"+
		"\u0000\u001bf\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001f"+
		"r\u0001\u0000\u0000\u0000!x\u0001\u0000\u0000\u0000#$\u0005{\u0000\u0000"+
		"$\u0002\u0001\u0000\u0000\u0000%&\u0005,\u0000\u0000&\u0004\u0001\u0000"+
		"\u0000\u0000\'(\u0005}\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005"+
		":\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005[\u0000\u0000,\n\u0001"+
		"\u0000\u0000\u0000-.\u0005]\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005"+
		"t\u0000\u000001\u0005r\u0000\u000012\u0005u\u0000\u000023\u0005e\u0000"+
		"\u00003\u000e\u0001\u0000\u0000\u000045\u0005f\u0000\u000056\u0005a\u0000"+
		"\u000067\u0005l\u0000\u000078\u0005s\u0000\u000089\u0005e\u0000\u0000"+
		"9\u0010\u0001\u0000\u0000\u0000:;\u0005n\u0000\u0000;<\u0005u\u0000\u0000"+
		"<=\u0005l\u0000\u0000=>\u0005l\u0000\u0000>\u0012\u0001\u0000\u0000\u0000"+
		"?D\u0005\"\u0000\u0000@C\u0003\u0015\n\u0000AC\b\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GH\u0005\"\u0000\u0000H\u0014\u0001\u0000"+
		"\u0000\u0000IL\u0005\\\u0000\u0000JM\u0007\u0001\u0000\u0000KM\u0003\u0017"+
		"\u000b\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0016"+
		"\u0001\u0000\u0000\u0000NO\u0005u\u0000\u0000OP\u0003\u0019\f\u0000PQ"+
		"\u0003\u0019\f\u0000QR\u0003\u0019\f\u0000RS\u0003\u0019\f\u0000S\u0018"+
		"\u0001\u0000\u0000\u0000TU\u0007\u0002\u0000\u0000U\u001a\u0001\u0000"+
		"\u0000\u0000VX\u0005-\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0003\u001d\u000e\u0000Z\\\u0003"+
		"\u001f\u000f\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\g\u0001\u0000\u0000\u0000]_\u0005-\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0003\u001d\u000e"+
		"\u0000ab\u0005.\u0000\u0000bd\u0003\u001d\u000e\u0000ce\u0003\u001f\u000f"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fW\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000g\u001c"+
		"\u0001\u0000\u0000\u0000hq\u00050\u0000\u0000im\u0007\u0003\u0000\u0000"+
		"jl\u0007\u0004\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pi\u0001"+
		"\u0000\u0000\u0000q\u001e\u0001\u0000\u0000\u0000rt\u0007\u0005\u0000"+
		"\u0000su\u0007\u0006\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0003\u001d\u000e\u0000w \u0001"+
		"\u0000\u0000\u0000xy\u0007\u0007\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0006\u0010\u0000\u0000{\"\u0001\u0000\u0000\u0000\f\u0000BDLW[^df"+
		"mpt\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}