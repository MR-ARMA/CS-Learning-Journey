// Generated from c://Users//admin//Desktop//CS-Learning-Journey//Compiler Design//HWs//HW_3//InformationExtractor.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InformationExtractorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ID=6, DIGIT=7, WS=8;
	public static final int
		RULE_startRule = 0, RULE_nationalNumber = 1, RULE_email = 2, RULE_postalCode = 3, 
		RULE_decimalNumber = 4, RULE_softwareVersion = 5, RULE_websiteAddress = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "nationalNumber", "email", "postalCode", "decimalNumber", 
			"softwareVersion", "websiteAddress"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'http'", "'s'", "'://'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ID", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "InformationExtractor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InformationExtractorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InformationExtractorParser.EOF, 0); }
		public List<NationalNumberContext> nationalNumber() {
			return getRuleContexts(NationalNumberContext.class);
		}
		public NationalNumberContext nationalNumber(int i) {
			return getRuleContext(NationalNumberContext.class,i);
		}
		public List<EmailContext> email() {
			return getRuleContexts(EmailContext.class);
		}
		public EmailContext email(int i) {
			return getRuleContext(EmailContext.class,i);
		}
		public List<PostalCodeContext> postalCode() {
			return getRuleContexts(PostalCodeContext.class);
		}
		public PostalCodeContext postalCode(int i) {
			return getRuleContext(PostalCodeContext.class,i);
		}
		public List<DecimalNumberContext> decimalNumber() {
			return getRuleContexts(DecimalNumberContext.class);
		}
		public DecimalNumberContext decimalNumber(int i) {
			return getRuleContext(DecimalNumberContext.class,i);
		}
		public List<SoftwareVersionContext> softwareVersion() {
			return getRuleContexts(SoftwareVersionContext.class);
		}
		public SoftwareVersionContext softwareVersion(int i) {
			return getRuleContext(SoftwareVersionContext.class,i);
		}
		public List<WebsiteAddressContext> websiteAddress() {
			return getRuleContexts(WebsiteAddressContext.class);
		}
		public WebsiteAddressContext websiteAddress(int i) {
			return getRuleContext(WebsiteAddressContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					nationalNumber();
					}
					break;
				case 2:
					{
					setState(15);
					email();
					}
					break;
				case 3:
					{
					setState(16);
					postalCode();
					}
					break;
				case 4:
					{
					setState(17);
					decimalNumber();
					}
					break;
				case 5:
					{
					setState(18);
					softwareVersion();
					}
					break;
				case 6:
					{
					setState(19);
					websiteAddress();
					}
					break;
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 200L) != 0) );
			setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NationalNumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(InformationExtractorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(InformationExtractorParser.DIGIT, i);
		}
		public NationalNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nationalNumber; }
	}

	public final NationalNumberContext nationalNumber() throws RecognitionException {
		NationalNumberContext _localctx = new NationalNumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nationalNumber);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(26);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(29); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class EmailContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InformationExtractorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InformationExtractorParser.ID, i);
		}
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ID);
			setState(32);
			match(T__0);
			setState(33);
			match(ID);
			setState(34);
			match(T__1);
			setState(35);
			match(ID);
			setState(36);
			match(T__0);
			setState(37);
			match(ID);
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
	public static class PostalCodeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(InformationExtractorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(InformationExtractorParser.DIGIT, i);
		}
		public PostalCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postalCode; }
	}

	public final PostalCodeContext postalCode() throws RecognitionException {
		PostalCodeContext _localctx = new PostalCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_postalCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DIGIT);
			setState(40);
			match(DIGIT);
			setState(41);
			match(DIGIT);
			setState(42);
			match(DIGIT);
			setState(43);
			match(DIGIT);
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
	public static class DecimalNumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(InformationExtractorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(InformationExtractorParser.DIGIT, i);
		}
		public DecimalNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalNumber; }
	}

	public final DecimalNumberContext decimalNumber() throws RecognitionException {
		DecimalNumberContext _localctx = new DecimalNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decimalNumber);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(DIGIT);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(50);
			match(T__0);
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(51);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SoftwareVersionContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(InformationExtractorParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(InformationExtractorParser.DIGIT, i);
		}
		public SoftwareVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softwareVersion; }
	}

	public final SoftwareVersionContext softwareVersion() throws RecognitionException {
		SoftwareVersionContext _localctx = new SoftwareVersionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_softwareVersion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				match(DIGIT);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(61);
			match(T__0);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(DIGIT);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(67);
			match(T__0);
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class WebsiteAddressContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InformationExtractorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InformationExtractorParser.ID, i);
		}
		public WebsiteAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_websiteAddress; }
	}

	public final WebsiteAddressContext websiteAddress() throws RecognitionException {
		WebsiteAddressContext _localctx = new WebsiteAddressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_websiteAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			match(T__3);
			setState(75);
			match(T__4);
			setState(76);
			match(ID);
			setState(77);
			match(T__0);
			setState(78);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\bQ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001c"+
		"\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0004\u0004/\b\u0004\u000b\u0004\f\u00040\u0001\u0004\u0001\u0004\u0004"+
		"\u00045\b\u0004\u000b\u0004\f\u00046\u0001\u0005\u0004\u0005:\b\u0005"+
		"\u000b\u0005\f\u0005;\u0001\u0005\u0001\u0005\u0004\u0005@\b\u0005\u000b"+
		"\u0005\f\u0005A\u0001\u0005\u0001\u0005\u0004\u0005F\b\u0005\u000b\u0005"+
		"\f\u0005G\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0000U\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u001b"+
		"\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006\'\u0001"+
		"\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000"+
		"\fI\u0001\u0000\u0000\u0000\u000e\u0015\u0003\u0002\u0001\u0000\u000f"+
		"\u0015\u0003\u0004\u0002\u0000\u0010\u0015\u0003\u0006\u0003\u0000\u0011"+
		"\u0015\u0003\b\u0004\u0000\u0012\u0015\u0003\n\u0005\u0000\u0013\u0015"+
		"\u0003\f\u0006\u0000\u0014\u000e\u0001\u0000\u0000\u0000\u0014\u000f\u0001"+
		"\u0000\u0000\u0000\u0014\u0010\u0001\u0000\u0000\u0000\u0014\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0005\u0007\u0000\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0003\u0001"+
		"\u0000\u0000\u0000\u001f \u0005\u0006\u0000\u0000 !\u0005\u0001\u0000"+
		"\u0000!\"\u0005\u0006\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0005\u0006"+
		"\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0006\u0000\u0000&\u0005"+
		"\u0001\u0000\u0000\u0000\'(\u0005\u0007\u0000\u0000()\u0005\u0007\u0000"+
		"\u0000)*\u0005\u0007\u0000\u0000*+\u0005\u0007\u0000\u0000+,\u0005\u0007"+
		"\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-/\u0005\u0007\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0005\u0001"+
		"\u0000\u000035\u0005\u0007\u0000\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7\t\u0001\u0000\u0000\u00008:\u0005\u0007\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0005\u0001\u0000\u0000>@\u0005"+
		"\u0007\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0005\u0001\u0000\u0000DF\u0005\u0007\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000"+
		"\u0000JK\u0005\u0004\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0005\u0006"+
		"\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0005\u0006\u0000\u0000O\r\u0001"+
		"\u0000\u0000\u0000\b\u0014\u0016\u001d06;AG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}