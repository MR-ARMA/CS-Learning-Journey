// Generated from c://Users//admin//Desktop//CS-Learning-Journey//Compiler Design//quiz//quiz1_update//operation.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class operationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Id=8, INT=9, FLOAT=10, 
		String=11, WS=12, NEWLINE=13, RELOP=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Id", "INT", 
			"FLOAT", "String", "DIGIT", "LETTER", "ESC", "WS", "NEWLINE", "RELOP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, null, null, 
			null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Id", "INT", "FLOAT", 
			"String", "WS", "NEWLINE", "RELOP"
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


	public operationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "operation.g4"; }

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
		"\u0004\u0000\u000es\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u00076\b\u0007\n\u0007"+
		"\f\u00079\t\u0007\u0001\b\u0004\b<\b\b\u000b\b\f\b=\u0001\t\u0004\tA\b"+
		"\t\u000b\t\f\tB\u0001\t\u0001\t\u0005\tG\b\t\n\t\f\tJ\t\t\u0001\t\u0001"+
		"\t\u0004\tN\b\t\u000b\t\f\tO\u0003\tR\b\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\nW\b\n\n\n\f\nZ\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\rd\b\r\u0001\u000e\u0004\u000eg\b\u000e\u000b"+
		"\u000e\f\u000eh\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010r\b\u0010\u0001X\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\u0000\u001b"+
		"\u0000\u001d\f\u001f\r!\u000e\u0001\u0000\u0003\u0001\u000009\u0002\u0000"+
		"AZaz\u0003\u0000\t\t\r\r  {\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000"+
		"\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000"+
		"\u0005(\u0001\u0000\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001"+
		"\u0000\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000"+
		"\u0000\u000f2\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000\u0000\u0013"+
		"Q\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017[\u0001"+
		"\u0000\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000"+
		"\u0000\u001df\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!"+
		"q\u0001\u0000\u0000\u0000#$\u0005:\u0000\u0000$%\u0005=\u0000\u0000%\u0002"+
		"\u0001\u0000\u0000\u0000&\'\u0005+\u0000\u0000\'\u0004\u0001\u0000\u0000"+
		"\u0000()\u0005-\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005*\u0000"+
		"\u0000+\b\u0001\u0000\u0000\u0000,-\u0005/\u0000\u0000-\n\u0001\u0000"+
		"\u0000\u0000./\u0005(\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005)"+
		"\u0000\u00001\u000e\u0001\u0000\u0000\u000027\u0003\u0019\f\u000036\u0003"+
		"\u0019\f\u000046\u0003\u0017\u000b\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008\u0010\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:<\u0003\u0017\u000b\u0000;:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">\u0012\u0001\u0000\u0000\u0000?A\u0003\u0017\u000b\u0000@?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DH\u0005.\u0000\u0000EG\u0003"+
		"\u0017\u000b\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IR\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000KM\u0005.\u0000\u0000LN\u0003\u0017\u000b"+
		"\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000Q@\u0001"+
		"\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000R\u0014\u0001\u0000\u0000"+
		"\u0000SX\u0005\"\u0000\u0000TW\u0003\u001b\r\u0000UW\t\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\u0016\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0007\u0000\u0000\u0000"+
		"\\\u0018\u0001\u0000\u0000\u0000]^\u0007\u0001\u0000\u0000^\u001a\u0001"+
		"\u0000\u0000\u0000_`\u0005\\\u0000\u0000`d\u0005\"\u0000\u0000ab\u0005"+
		"\\\u0000\u0000bd\u0005\\\u0000\u0000c_\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000d\u001c\u0001\u0000\u0000\u0000eg\u0007\u0002\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0006"+
		"\u000e\u0000\u0000k\u001e\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000"+
		"m \u0001\u0000\u0000\u0000no\u0005<\u0000\u0000or\u0005=\u0000\u0000p"+
		"r\u0005<\u0000\u0000qn\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"r\"\u0001\u0000\u0000\u0000\r\u000057=BHOQVXchq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}