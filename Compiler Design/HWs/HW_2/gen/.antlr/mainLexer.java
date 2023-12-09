// Generated from c://Users//admin//Desktop//CS-Learning-Journey//Compiler Design//HWs//HW_2//gen//main.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, BComment=2, OP=3, CP=4, Plus=5, MINUS=6, MUL=7, DIVIDE=8, ASSIGN=9, 
		Id=10, Number=11, Newline=12, Whitespace=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Comment", "BComment", "OP", "CP", "Plus", "MINUS", "MUL", "DIVIDE", 
			"ASSIGN", "Id", "Number", "COMMENT", "BLOCK_COMMENT", "IDENTIFIER", "NUMBER", 
			"Newline", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", null, 
			null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "BComment", "OP", "CP", "Plus", "MINUS", "MUL", "DIVIDE", 
			"ASSIGN", "Id", "Number", "Newline", "Whitespace"
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


	public mainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "main.g4"; }

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
		"\u0004\u0000\ru\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bB\b\u000b\n\u000b\f\u000bE\t\u000b\u0001"+
		"\u000b\u0003\u000bH\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\fP\b\f\n\f\f\fS\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\rZ\b\r\n\r\f\r]\t\r\u0001\r\u0004\r`\b\r\u000b\r\f\ra\u0003\r"+
		"d\b\r\u0001\u000e\u0004\u000eg\b\u000e\u000b\u000e\f\u000eh\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010p\b\u0010"+
		"\u000b\u0010\f\u0010q\u0001\u0010\u0001\u0010\u0002CQ\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\u0000\u001b\u0000"+
		"\u001d\u0000\u001f\f!\r\u0001\u0000\u0004\u0002\u0000AZaz\u0002\u0000"+
		"**??\u0001\u000009\u0003\u0000\t\t\r\r  x\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001"+
		"\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005+\u0001\u0000"+
		"\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000"+
		"\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001"+
		"\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u00139\u0001\u0000\u0000"+
		"\u0000\u0015;\u0001\u0000\u0000\u0000\u0017=\u0001\u0000\u0000\u0000\u0019"+
		"K\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001df\u0001"+
		"\u0000\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!o\u0001\u0000\u0000"+
		"\u0000#$\u0003\u0017\u000b\u0000$%\u0001\u0000\u0000\u0000%&\u0006\u0000"+
		"\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0003\u0019\f\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0006\u0001\u0000\u0000*\u0004\u0001\u0000\u0000"+
		"\u0000+,\u0005(\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005)\u0000"+
		"\u0000.\b\u0001\u0000\u0000\u0000/0\u0005+\u0000\u00000\n\u0001\u0000"+
		"\u0000\u000012\u0005-\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005*"+
		"\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005/\u0000\u00006\u0010"+
		"\u0001\u0000\u0000\u000078\u0005=\u0000\u00008\u0012\u0001\u0000\u0000"+
		"\u00009:\u0003\u001b\r\u0000:\u0014\u0001\u0000\u0000\u0000;<\u0003\u001d"+
		"\u000e\u0000<\u0016\u0001\u0000\u0000\u0000=>\u0005/\u0000\u0000>?\u0005"+
		"/\u0000\u0000?C\u0001\u0000\u0000\u0000@B\t\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FH\u0005\r\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\n\u0000\u0000J\u0018\u0001\u0000"+
		"\u0000\u0000KL\u0005/\u0000\u0000LM\u0005*\u0000\u0000MQ\u0001\u0000\u0000"+
		"\u0000NP\t\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RT\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005*\u0000\u0000UV\u0005/\u0000"+
		"\u0000V\u001a\u0001\u0000\u0000\u0000W[\u0007\u0000\u0000\u0000XZ\u0007"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\d\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^`\u0007\u0001\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000cW\u0001\u0000\u0000\u0000"+
		"c_\u0001\u0000\u0000\u0000d\u001c\u0001\u0000\u0000\u0000eg\u0007\u0002"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u001e\u0001\u0000\u0000"+
		"\u0000jk\u0005\n\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0006\u000f\u0000"+
		"\u0000m \u0001\u0000\u0000\u0000np\u0007\u0003\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\u0010\u0000\u0000"+
		"t\"\u0001\u0000\u0000\u0000\t\u0000CGQ[achq\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}