// Generated from MCDocument/mcdocParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mcdocParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, WS=66, NewLine=67, 
		At=68, LogicalOR=69, Comma=70, DoubleColon=71, ColonMark=72, DoubleDot=73, 
		StringKeyType=74, BooleanKeyType=75, ByteKeyType=76, ShortKeyType=77, 
		IntKeyType=78, FloatKeyType=79, DoubleKeyType=80, LongKeyType=81, Use=82, 
		DocFilePath=83, FieldValue=84, Commentary=85, RegexPattern=86, DoubleQuotes=87, 
		Integer=88, FloatExponent=89, Float=90, String=91, VersionString=92, DispatcherKeyString=93, 
		DispatcherValue=94, Number=95, PositiveInteger=96, ResourceLocationChar=97, 
		ResourceLocation=98, IdentContinue=99, IdentStart=100, Identifier=101, 
		TypedNumber=102, PathSegment=103, Path=104, AccessorKey=105, Accessor=106, 
		DynamicIndex=107, StaticIndexKey=108;
	public static final int
		RULE_logicalOR = 0, RULE_baseDataType = 1, RULE_keywordType = 2, RULE_booleanType = 3, 
		RULE_booleanKeyType = 4, RULE_questionMark = 5, RULE_integerRange = 6, 
		RULE_floatRange = 7, RULE_integer = 8, RULE_float = 9, RULE_versionString = 10, 
		RULE_positiveInteger = 11, RULE_identifier = 12, RULE_commentary = 13, 
		RULE_fieldValue = 14, RULE_stringType = 15, RULE_literalType = 16, RULE_numericType = 17, 
		RULE_listType = 18, RULE_tupleType = 19, RULE_prelim = 20, RULE_enumType = 21, 
		RULE_enumValue = 22, RULE_enumField = 23, RULE_enumBlock = 24, RULE_enum = 25, 
		RULE_referenceType = 26, RULE_dispatcherType = 27, RULE_unionType = 28, 
		RULE_index = 29, RULE_indexBody = 30, RULE_indexOnAType = 31, RULE_typeArgBlock = 32, 
		RULE_unAttributedType = 33, RULE_type = 34, RULE_documentAttributeSet = 35, 
		RULE_arrayLength = 36, RULE_primitiveArrayType = 37, RULE_dataType = 38, 
		RULE_canonical = 39, RULE_color = 40, RULE_commandSlashOptions = 41, RULE_commandMacroOptions = 42, 
		RULE_commandEmptyOptions = 43, RULE_commandMaxLength = 44, RULE_commandParameters = 45, 
		RULE_command = 46, RULE_deprecated = 47, RULE_dispatcher_key = 48, RULE_divisible_by = 49, 
		RULE_entityAmount = 50, RULE_entityType = 51, RULE_entityParameters = 52, 
		RULE_entity = 53, RULE_gameRuleParameter = 54, RULE_gameRule = 55, RULE_idRegistry = 56, 
		RULE_idTags = 57, RULE_idParameters = 58, RULE_id = 59, RULE_match_regex = 60, 
		RULE_nbt = 61, RULE_nbt_path = 62, RULE_objective = 63, RULE_regex_pattern = 64, 
		RULE_score_holder = 65, RULE_since = 66, RULE_until = 67, RULE_tag = 68, 
		RULE_team = 69, RULE_text_component = 70, RULE_uuid = 71, RULE_usefilePath = 72, 
		RULE_useSentence = 73, RULE_documentAttribute = 74, RULE_field = 75, RULE_fields = 76, 
		RULE_structReference = 77, RULE_superInvoke = 78, RULE_structContent = 79, 
		RULE_structName = 80, RULE_structSentence = 81, RULE_document = 82;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicalOR", "baseDataType", "keywordType", "booleanType", "booleanKeyType", 
			"questionMark", "integerRange", "floatRange", "integer", "float", "versionString", 
			"positiveInteger", "identifier", "commentary", "fieldValue", "stringType", 
			"literalType", "numericType", "listType", "tupleType", "prelim", "enumType", 
			"enumValue", "enumField", "enumBlock", "enum", "referenceType", "dispatcherType", 
			"unionType", "index", "indexBody", "indexOnAType", "typeArgBlock", "unAttributedType", 
			"type", "documentAttributeSet", "arrayLength", "primitiveArrayType", 
			"dataType", "canonical", "color", "commandSlashOptions", "commandMacroOptions", 
			"commandEmptyOptions", "commandMaxLength", "commandParameters", "command", 
			"deprecated", "dispatcher_key", "divisible_by", "entityAmount", "entityType", 
			"entityParameters", "entity", "gameRuleParameter", "gameRule", "idRegistry", 
			"idTags", "idParameters", "id", "match_regex", "nbt", "nbt_path", "objective", 
			"regex_pattern", "score_holder", "since", "until", "tag", "team", "text_component", 
			"uuid", "usefilePath", "useSentence", "documentAttribute", "field", "fields", 
			"structReference", "superInvoke", "structContent", "structName", "structSentence", 
			"document"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'any'", "'true'", "'false'", "'?'", "'@'", "'['", "']'", "',]'", 
			"'='", "'{'", "'}'", "'enum'", "'('", "')'", "'<'", "'>'", "'<,'", "'[]'", 
			"'#[canonical]'", "'#[color='", "'slash='", "'macro='", "'empty='", "'max_length='", 
			"'#[command('", "') string'", "'#[deprecated='", "'#[dispatcher_key='", 
			"'] string'", "'#[divisible_by='", "'amount='", "'multiple'", "'single'", 
			"'type='", "'entities'", "'players'", "'#[entity('", "'\"boolean\"'", 
			"'\"int\"'", "'#[game_rule('", "')]'", "'registry='", "'tags='", "'allowed'", 
			"'implicit'", "'required'", "'#[id('", "')] string'", "'#[match_regex=\"'", 
			"'\"] string'", "'#[nbt=ItemStack] string'", "'#[nbt_path] string'", 
			"'#[objective] string'", "'#[regex_pattern] string'", "'#[score_holder] string'", 
			"'#[since=\"'", "'\"]'", "'#[until=\"'", "'#[tag] string'", "'#[team] string'", 
			"'#[text_component] string'", "'#[uuid]'", "'...'", "'...super::'", "'struct'", 
			null, "'\\n'", "'@ '", "'|'", "','", "'::'", "':'", "'..'", "'string'", 
			"'boolean'", "'byte'", "'short'", "'int'", "'float'", "'double'", "'long'", 
			"'use'", null, null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "NewLine", "At", "LogicalOR", 
			"Comma", "DoubleColon", "ColonMark", "DoubleDot", "StringKeyType", "BooleanKeyType", 
			"ByteKeyType", "ShortKeyType", "IntKeyType", "FloatKeyType", "DoubleKeyType", 
			"LongKeyType", "Use", "DocFilePath", "FieldValue", "Commentary", "RegexPattern", 
			"DoubleQuotes", "Integer", "FloatExponent", "Float", "String", "VersionString", 
			"DispatcherKeyString", "DispatcherValue", "Number", "PositiveInteger", 
			"ResourceLocationChar", "ResourceLocation", "IdentContinue", "IdentStart", 
			"Identifier", "TypedNumber", "PathSegment", "Path", "AccessorKey", "Accessor", 
			"DynamicIndex", "StaticIndexKey"
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
	public String getGrammarFileName() { return "mcdocParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mcdocParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalORContext extends ParserRuleContext {
		public TerminalNode LogicalOR() { return getToken(mcdocParserParser.LogicalOR, 0); }
		public LogicalORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterLogicalOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitLogicalOR(this);
		}
	}

	public final LogicalORContext logicalOR() throws RecognitionException {
		LogicalORContext _localctx = new LogicalORContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logicalOR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LogicalOR);
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
	public static class BaseDataTypeContext extends ParserRuleContext {
		public TerminalNode StringKeyType() { return getToken(mcdocParserParser.StringKeyType, 0); }
		public TerminalNode BooleanKeyType() { return getToken(mcdocParserParser.BooleanKeyType, 0); }
		public TerminalNode ByteKeyType() { return getToken(mcdocParserParser.ByteKeyType, 0); }
		public TerminalNode ShortKeyType() { return getToken(mcdocParserParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParserParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParserParser.DoubleKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParserParser.LongKeyType, 0); }
		public BaseDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterBaseDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitBaseDataType(this);
		}
	}

	public final BaseDataTypeContext baseDataType() throws RecognitionException {
		BaseDataTypeContext _localctx = new BaseDataTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_baseDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 255L) != 0)) ) {
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
	public static class KeywordTypeContext extends ParserRuleContext {
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public KeywordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterKeywordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitKeywordType(this);
		}
	}

	public final KeywordTypeContext keywordType() throws RecognitionException {
		KeywordTypeContext _localctx = new KeywordTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keywordType);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__0);
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				booleanType();
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
	public static class BooleanTypeContext extends ParserRuleContext {
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitBooleanType(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
	public static class BooleanKeyTypeContext extends ParserRuleContext {
		public TerminalNode BooleanKeyType() { return getToken(mcdocParserParser.BooleanKeyType, 0); }
		public BooleanKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanKeyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterBooleanKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitBooleanKeyType(this);
		}
	}

	public final BooleanKeyTypeContext booleanKeyType() throws RecognitionException {
		BooleanKeyTypeContext _localctx = new BooleanKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_booleanKeyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BooleanKeyType);
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
	public static class QuestionMarkContext extends ParserRuleContext {
		public QuestionMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterQuestionMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitQuestionMark(this);
		}
	}

	public final QuestionMarkContext questionMark() throws RecognitionException {
		QuestionMarkContext _localctx = new QuestionMarkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_questionMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__3);
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
	public static class IntegerRangeContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode DoubleDot() { return getToken(mcdocParserParser.DoubleDot, 0); }
		public IntegerRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIntegerRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIntegerRange(this);
		}
	}

	public final IntegerRangeContext integerRange() throws RecognitionException {
		IntegerRangeContext _localctx = new IntegerRangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerRange);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleDot) {
					{
					setState(180);
					match(DoubleDot);
					}
				}

				setState(183);
				integer();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(184);
				integer();
				setState(185);
				match(DoubleDot);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Integer) {
					{
					setState(186);
					integer();
					}
				}

				}
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
	public static class FloatRangeContext extends ParserRuleContext {
		public List<FloatContext> float_() {
			return getRuleContexts(FloatContext.class);
		}
		public FloatContext float_(int i) {
			return getRuleContext(FloatContext.class,i);
		}
		public TerminalNode DoubleDot() { return getToken(mcdocParserParser.DoubleDot, 0); }
		public FloatRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterFloatRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitFloatRange(this);
		}
	}

	public final FloatRangeContext floatRange() throws RecognitionException {
		FloatRangeContext _localctx = new FloatRangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatRange);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleDot) {
					{
					setState(191);
					match(DoubleDot);
					}
				}

				setState(194);
				float_();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(195);
				float_();
				setState(196);
				match(DoubleDot);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Float) {
					{
					setState(197);
					float_();
					}
				}

				}
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
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(mcdocParserParser.Integer, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Integer);
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
	public static class FloatContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(mcdocParserParser.Float, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitFloat(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Float);
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
	public static class VersionStringContext extends ParserRuleContext {
		public TerminalNode VersionString() { return getToken(mcdocParserParser.VersionString, 0); }
		public VersionStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterVersionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitVersionString(this);
		}
	}

	public final VersionStringContext versionString() throws RecognitionException {
		VersionStringContext _localctx = new VersionStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_versionString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(VersionString);
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
	public static class PositiveIntegerContext extends ParserRuleContext {
		public TerminalNode PositiveInteger() { return getToken(mcdocParserParser.PositiveInteger, 0); }
		public PositiveIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positiveInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterPositiveInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitPositiveInteger(this);
		}
	}

	public final PositiveIntegerContext positiveInteger() throws RecognitionException {
		PositiveIntegerContext _localctx = new PositiveIntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_positiveInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(PositiveInteger);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Identifier);
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
	public static class CommentaryContext extends ParserRuleContext {
		public TerminalNode Commentary() { return getToken(mcdocParserParser.Commentary, 0); }
		public CommentaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommentary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommentary(this);
		}
	}

	public final CommentaryContext commentary() throws RecognitionException {
		CommentaryContext _localctx = new CommentaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Commentary);
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
	public static class FieldValueContext extends ParserRuleContext {
		public TerminalNode FieldValue() { return getToken(mcdocParserParser.FieldValue, 0); }
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitFieldValue(this);
		}
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(FieldValue);
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
	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode StringKeyType() { return getToken(mcdocParserParser.StringKeyType, 0); }
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStringType(this);
		}
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(StringKeyType);
			setState(217);
			integerRange();
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
	public static class LiteralTypeContext extends ParserRuleContext {
		public TerminalNode TypedNumber() { return getToken(mcdocParserParser.TypedNumber, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2 || _la==String || _la==TypedNumber) ) {
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
	public static class NumericTypeContext extends ParserRuleContext {
		public TerminalNode ByteKeyType() { return getToken(mcdocParserParser.ByteKeyType, 0); }
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
		public TerminalNode ShortKeyType() { return getToken(mcdocParserParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParserParser.LongKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParserParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParserParser.DoubleKeyType, 0); }
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numericType);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ByteKeyType:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(221);
				match(ByteKeyType);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(222);
					match(T__4);
					setState(223);
					integerRange();
					}
				}

				}
				}
				break;
			case ShortKeyType:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(226);
				match(ShortKeyType);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(227);
					match(T__4);
					setState(228);
					integerRange();
					}
				}

				}
				}
				break;
			case IntKeyType:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(231);
				match(IntKeyType);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(232);
					match(T__4);
					setState(233);
					integerRange();
					}
				}

				}
				}
				break;
			case LongKeyType:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(236);
				match(LongKeyType);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(237);
					match(T__4);
					setState(238);
					integerRange();
					}
				}

				}
				}
				break;
			case FloatKeyType:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(241);
				match(FloatKeyType);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(242);
					match(T__4);
					setState(243);
					integerRange();
					}
				}

				}
				}
				break;
			case DoubleKeyType:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(246);
				match(DoubleKeyType);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(247);
					match(T__4);
					setState(248);
					integerRange();
					}
				}

				}
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
	public static class ListTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitListType(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__5);
			setState(254);
			type();
			setState(255);
			match(T__6);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(256);
				match(T__4);
				setState(257);
				integerRange();
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
	public static class TupleTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tupleType);
		int _la;
		try {
			int _alt;
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(260);
				match(T__5);
				setState(261);
				type();
				setState(262);
				match(T__7);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(264);
				match(T__5);
				setState(265);
				type();
				setState(268); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(266);
						match(Comma);
						setState(267);
						type();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(270); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(272);
					match(Comma);
					}
				}

				setState(275);
				match(T__6);
				}
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
	public static class PrelimContext extends ParserRuleContext {
		public CommentaryContext commentary() {
			return getRuleContext(CommentaryContext.class,0);
		}
		public PrelimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prelim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterPrelim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitPrelim(this);
		}
	}

	public final PrelimContext prelim() throws RecognitionException {
		PrelimContext _localctx = new PrelimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_prelim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			commentary();
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
	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode ByteKeyType() { return getToken(mcdocParserParser.ByteKeyType, 0); }
		public TerminalNode ShortKeyType() { return getToken(mcdocParserParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParserParser.LongKeyType, 0); }
		public TerminalNode StringKeyType() { return getToken(mcdocParserParser.StringKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParserParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParserParser.DoubleKeyType, 0); }
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnumType(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 253L) != 0)) ) {
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
	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode TypedNumber() { return getToken(mcdocParserParser.TypedNumber, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==String || _la==TypedNumber) ) {
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
	public static class EnumFieldContext extends ParserRuleContext {
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnumField(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			prelim();
			setState(286);
			identifier();
			setState(287);
			match(T__8);
			setState(288);
			enumValue();
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
	public static class EnumBlockContext extends ParserRuleContext {
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public EnumBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnumBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnumBlock(this);
		}
	}

	public final EnumBlockContext enumBlock() throws RecognitionException {
		EnumBlockContext _localctx = new EnumBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumBlock);
		int _la;
		try {
			int _alt;
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__9);
				setState(291);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(T__9);
				setState(293);
				enumField();
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(294);
						match(Comma);
						setState(295);
						enumField();
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(301);
					match(Comma);
					}
				}

				setState(304);
				match(T__10);
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
	public static class EnumContext extends ParserRuleContext {
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public EnumBlockContext enumBlock() {
			return getRuleContext(EnumBlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnum(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			prelim();
			setState(309);
			match(T__11);
			setState(310);
			match(T__12);
			setState(311);
			enumType();
			setState(312);
			match(T__13);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(313);
				identifier();
				}
			}

			setState(316);
			enumBlock();
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
	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode Path() { return getToken(mcdocParserParser.Path, 0); }
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Path);
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
	public static class DispatcherTypeContext extends ParserRuleContext {
		public TerminalNode ResourceLocation() { return getToken(mcdocParserParser.ResourceLocation, 0); }
		public IndexBodyContext indexBody() {
			return getRuleContext(IndexBodyContext.class,0);
		}
		public DispatcherTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatcherType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDispatcherType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDispatcherType(this);
		}
	}

	public final DispatcherTypeContext dispatcherType() throws RecognitionException {
		DispatcherTypeContext _localctx = new DispatcherTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dispatcherType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ResourceLocation);
			setState(321);
			indexBody();
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
	public static class UnionTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> LogicalOR() { return getTokens(mcdocParserParser.LogicalOR); }
		public TerminalNode LogicalOR(int i) {
			return getToken(mcdocParserParser.LogicalOR, i);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUnionType(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unionType);
		try {
			int _alt;
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(323);
				match(T__12);
				setState(324);
				match(T__13);
				}
				}
				break;
			case T__19:
			case T__26:
			case T__27:
			case T__29:
			case T__36:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(325);
				type();
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						match(LogicalOR);
						setState(327);
						type();
						}
						} 
					}
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(333);
					match(LogicalOR);
					}
					break;
				}
				}
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
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode StaticIndexKey() { return getToken(mcdocParserParser.StaticIndexKey, 0); }
		public TerminalNode DynamicIndex() { return getToken(mcdocParserParser.DynamicIndex, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==DynamicIndex || _la==StaticIndexKey) ) {
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
	public static class IndexBodyContext extends ParserRuleContext {
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public IndexBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexBody(this);
		}
	}

	public final IndexBodyContext indexBody() throws RecognitionException {
		IndexBodyContext _localctx = new IndexBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__5);
			setState(341);
			index();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DynamicIndex || _la==StaticIndexKey) {
				{
				{
				setState(342);
				index();
				setState(343);
				match(Comma);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(350);
				match(Comma);
				}
			}

			setState(353);
			match(T__6);
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
	public static class IndexOnATypeContext extends ParserRuleContext {
		public IndexBodyContext indexBody() {
			return getRuleContext(IndexBodyContext.class,0);
		}
		public IndexOnATypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOnAType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexOnAType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexOnAType(this);
		}
	}

	public final IndexOnATypeContext indexOnAType() throws RecognitionException {
		IndexOnATypeContext _localctx = new IndexOnATypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_indexOnAType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			indexBody();
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
	public static class TypeArgBlockContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode Comma() { return getToken(mcdocParserParser.Comma, 0); }
		public TypeArgBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeArgBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeArgBlock(this);
		}
	}

	public final TypeArgBlockContext typeArgBlock() throws RecognitionException {
		TypeArgBlockContext _localctx = new TypeArgBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeArgBlock);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(T__14);
				setState(358);
				match(T__15);
				}
				break;
			case T__19:
			case T__26:
			case T__27:
			case T__29:
			case T__36:
			case T__39:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				type();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077006287393259520L) != 0)) {
					{
					{
					setState(360);
					type();
					setState(361);
					match(T__16);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(368);
					match(Comma);
					}
				}

				setState(371);
				match(T__15);
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
	public static class UnAttributedTypeContext extends ParserRuleContext {
		public KeywordTypeContext keywordType() {
			return getRuleContext(KeywordTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveArrayTypeContext primitiveArrayType() {
			return getRuleContext(PrimitiveArrayTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public StructSentenceContext structSentence() {
			return getRuleContext(StructSentenceContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public DispatcherTypeContext dispatcherType() {
			return getRuleContext(DispatcherTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public IndexOnATypeContext indexOnAType() {
			return getRuleContext(IndexOnATypeContext.class,0);
		}
		public UnAttributedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unAttributedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUnAttributedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUnAttributedType(this);
		}
	}

	public final UnAttributedTypeContext unAttributedType() throws RecognitionException {
		UnAttributedTypeContext _localctx = new UnAttributedTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unAttributedType);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				keywordType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				stringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				literalType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				numericType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				primitiveArrayType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				listType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				tupleType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(382);
				enum_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(383);
				structSentence();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(384);
				referenceType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
				dispatcherType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(386);
				unionType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(387);
				indexOnAType();
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
	public static class TypeContext extends ParserRuleContext {
		public DocumentAttributeContext documentAttribute() {
			return getRuleContext(DocumentAttributeContext.class,0);
		}
		public UnAttributedTypeContext unAttributedType() {
			return getRuleContext(UnAttributedTypeContext.class,0);
		}
		public List<IndexBodyContext> indexBody() {
			return getRuleContexts(IndexBodyContext.class);
		}
		public IndexBodyContext indexBody(int i) {
			return getRuleContext(IndexBodyContext.class,i);
		}
		public List<TypeArgBlockContext> typeArgBlock() {
			return getRuleContexts(TypeArgBlockContext.class);
		}
		public TypeArgBlockContext typeArgBlock(int i) {
			return getRuleContext(TypeArgBlockContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			documentAttribute();
			setState(391);
			unAttributedType();
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(394);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(392);
						indexBody();
						}
						break;
					case T__14:
					case T__19:
					case T__26:
					case T__27:
					case T__29:
					case T__36:
					case T__39:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__57:
					case T__58:
					case T__59:
					case T__60:
					case T__61:
						{
						setState(393);
						typeArgBlock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class DocumentAttributeSetContext extends ParserRuleContext {
		public List<CommentaryContext> commentary() {
			return getRuleContexts(CommentaryContext.class);
		}
		public CommentaryContext commentary(int i) {
			return getRuleContext(CommentaryContext.class,i);
		}
		public List<DocumentAttributeContext> documentAttribute() {
			return getRuleContexts(DocumentAttributeContext.class);
		}
		public DocumentAttributeContext documentAttribute(int i) {
			return getRuleContext(DocumentAttributeContext.class,i);
		}
		public List<FieldValueContext> fieldValue() {
			return getRuleContexts(FieldValueContext.class);
		}
		public FieldValueContext fieldValue(int i) {
			return getRuleContext(FieldValueContext.class,i);
		}
		public DocumentAttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentAttributeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDocumentAttributeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDocumentAttributeSet(this);
		}
	}

	public final DocumentAttributeSetContext documentAttributeSet() throws RecognitionException {
		DocumentAttributeSetContext _localctx = new DocumentAttributeSetContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_documentAttributeSet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					commentary();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					documentAttribute();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					commentary();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					fieldValue();
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					commentary();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class ArrayLengthContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(mcdocParserParser.At, 0); }
		public TerminalNode PositiveInteger() { return getToken(mcdocParserParser.PositiveInteger, 0); }
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(At);
			setState(430);
			match(PositiveInteger);
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
	public static class PrimitiveArrayTypeContext extends ParserRuleContext {
		public TerminalNode ByteKeyType() { return getToken(mcdocParserParser.ByteKeyType, 0); }
		public TerminalNode ShortKeyType() { return getToken(mcdocParserParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParserParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParserParser.DoubleKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParserParser.LongKeyType, 0); }
		public TerminalNode At() { return getToken(mcdocParserParser.At, 0); }
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
		public PrimitiveArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterPrimitiveArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitPrimitiveArrayType(this);
		}
	}

	public final PrimitiveArrayTypeContext primitiveArrayType() throws RecognitionException {
		PrimitiveArrayTypeContext _localctx = new PrimitiveArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primitiveArrayType);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ByteKeyType:
			case ShortKeyType:
			case IntKeyType:
			case FloatKeyType:
			case DoubleKeyType:
			case LongKeyType:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(432);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(433);
					match(At);
					setState(434);
					integerRange();
					}
				}

				setState(437);
				match(T__17);
				}
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				{
				{
				setState(438);
				match(T__5);
				setState(439);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(440);
				match(T__6);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(442);
					match(At);
					setState(443);
					integerRange();
					}
				}

				}
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
	public static class DataTypeContext extends ParserRuleContext {
		public PrimitiveArrayTypeContext primitiveArrayType() {
			return getRuleContext(PrimitiveArrayTypeContext.class,0);
		}
		public BooleanKeyTypeContext booleanKeyType() {
			return getRuleContext(BooleanKeyTypeContext.class,0);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public DocumentAttributeSetContext documentAttributeSet() {
			return getRuleContext(DocumentAttributeSetContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dataType);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				primitiveArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				booleanKeyType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				numericType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				documentAttributeSet();
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
	public static class CanonicalContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CanonicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canonical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCanonical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCanonical(this);
		}
	}

	public final CanonicalContext canonical() throws RecognitionException {
		CanonicalContext _localctx = new CanonicalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_canonical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__18);
			setState(455);
			dataType();
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
	public static class ColorContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__19);
			setState(458);
			match(String);
			setState(459);
			match(T__6);
			setState(460);
			dataType();
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
	public static class CommandSlashOptionsContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public CommandSlashOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandSlashOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommandSlashOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommandSlashOptions(this);
		}
	}

	public final CommandSlashOptionsContext commandSlashOptions() throws RecognitionException {
		CommandSlashOptionsContext _localctx = new CommandSlashOptionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_commandSlashOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__20);
			setState(463);
			match(String);
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
	public static class CommandMacroOptionsContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public CommandMacroOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandMacroOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommandMacroOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommandMacroOptions(this);
		}
	}

	public final CommandMacroOptionsContext commandMacroOptions() throws RecognitionException {
		CommandMacroOptionsContext _localctx = new CommandMacroOptionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_commandMacroOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__21);
			setState(466);
			match(String);
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
	public static class CommandEmptyOptionsContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public CommandEmptyOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandEmptyOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommandEmptyOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommandEmptyOptions(this);
		}
	}

	public final CommandEmptyOptionsContext commandEmptyOptions() throws RecognitionException {
		CommandEmptyOptionsContext _localctx = new CommandEmptyOptionsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_commandEmptyOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__22);
			setState(469);
			match(String);
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
	public static class CommandMaxLengthContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public CommandMaxLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandMaxLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommandMaxLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommandMaxLength(this);
		}
	}

	public final CommandMaxLengthContext commandMaxLength() throws RecognitionException {
		CommandMaxLengthContext _localctx = new CommandMaxLengthContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_commandMaxLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__23);
			setState(472);
			integer();
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
	public static class CommandParametersContext extends ParserRuleContext {
		public CommandSlashOptionsContext commandSlashOptions() {
			return getRuleContext(CommandSlashOptionsContext.class,0);
		}
		public CommandMacroOptionsContext commandMacroOptions() {
			return getRuleContext(CommandMacroOptionsContext.class,0);
		}
		public CommandEmptyOptionsContext commandEmptyOptions() {
			return getRuleContext(CommandEmptyOptionsContext.class,0);
		}
		public CommandMaxLengthContext commandMaxLength() {
			return getRuleContext(CommandMaxLengthContext.class,0);
		}
		public CommandParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommandParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommandParameters(this);
		}
	}

	public final CommandParametersContext commandParameters() throws RecognitionException {
		CommandParametersContext _localctx = new CommandParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_commandParameters);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				commandSlashOptions();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				commandMacroOptions();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				commandEmptyOptions();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				commandMaxLength();
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
	public static class CommandContext extends ParserRuleContext {
		public List<CommandParametersContext> commandParameters() {
			return getRuleContexts(CommandParametersContext.class);
		}
		public CommandParametersContext commandParameters(int i) {
			return getRuleContext(CommandParametersContext.class,i);
		}
		public TerminalNode Comma() { return getToken(mcdocParserParser.Comma, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__24);
			{
			setState(481);
			commandParameters();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(482);
				match(Comma);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) {
					{
					{
					setState(483);
					commandParameters();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			setState(491);
			match(T__25);
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
	public static class DeprecatedContext extends ParserRuleContext {
		public VersionStringContext versionString() {
			return getRuleContext(VersionStringContext.class,0);
		}
		public DeprecatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deprecated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDeprecated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDeprecated(this);
		}
	}

	public final DeprecatedContext deprecated() throws RecognitionException {
		DeprecatedContext _localctx = new DeprecatedContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_deprecated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__26);
			setState(494);
			versionString();
			setState(495);
			match(T__6);
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
	public static class Dispatcher_keyContext extends ParserRuleContext {
		public TerminalNode DispatcherKeyString() { return getToken(mcdocParserParser.DispatcherKeyString, 0); }
		public Dispatcher_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatcher_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDispatcher_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDispatcher_key(this);
		}
	}

	public final Dispatcher_keyContext dispatcher_key() throws RecognitionException {
		Dispatcher_keyContext _localctx = new Dispatcher_keyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dispatcher_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__27);
			setState(498);
			match(DispatcherKeyString);
			setState(499);
			match(T__28);
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
	public static class Divisible_byContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public Divisible_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisible_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDivisible_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDivisible_by(this);
		}
	}

	public final Divisible_byContext divisible_by() throws RecognitionException {
		Divisible_byContext _localctx = new Divisible_byContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_divisible_by);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__29);
			setState(502);
			integer();
			setState(503);
			match(T__6);
			setState(504);
			match(IntKeyType);
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
	public static class EntityAmountContext extends ParserRuleContext {
		public EntityAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEntityAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEntityAmount(this);
		}
	}

	public final EntityAmountContext entityAmount() throws RecognitionException {
		EntityAmountContext _localctx = new EntityAmountContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_entityAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__30);
			setState(507);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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
	public static class EntityTypeContext extends ParserRuleContext {
		public EntityTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEntityType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEntityType(this);
		}
	}

	public final EntityTypeContext entityType() throws RecognitionException {
		EntityTypeContext _localctx = new EntityTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_entityType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__33);
			setState(510);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
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
	public static class EntityParametersContext extends ParserRuleContext {
		public EntityAmountContext entityAmount() {
			return getRuleContext(EntityAmountContext.class,0);
		}
		public EntityTypeContext entityType() {
			return getRuleContext(EntityTypeContext.class,0);
		}
		public EntityParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEntityParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEntityParameters(this);
		}
	}

	public final EntityParametersContext entityParameters() throws RecognitionException {
		EntityParametersContext _localctx = new EntityParametersContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_entityParameters);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				entityAmount();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				entityType();
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
	public static class EntityContext extends ParserRuleContext {
		public List<EntityParametersContext> entityParameters() {
			return getRuleContexts(EntityParametersContext.class);
		}
		public EntityParametersContext entityParameters(int i) {
			return getRuleContext(EntityParametersContext.class,i);
		}
		public TerminalNode Comma() { return getToken(mcdocParserParser.Comma, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__36);
			{
			setState(517);
			entityParameters();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(518);
				match(Comma);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30 || _la==T__33) {
					{
					{
					setState(519);
					entityParameters();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			setState(527);
			match(T__25);
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
	public static class GameRuleParameterContext extends ParserRuleContext {
		public GameRuleParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameRuleParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterGameRuleParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitGameRuleParameter(this);
		}
	}

	public final GameRuleParameterContext gameRuleParameter() throws RecognitionException {
		GameRuleParameterContext _localctx = new GameRuleParameterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gameRuleParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__33);
			setState(530);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
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
	public static class GameRuleContext extends ParserRuleContext {
		public GameRuleParameterContext gameRuleParameter() {
			return getRuleContext(GameRuleParameterContext.class,0);
		}
		public GameRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterGameRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitGameRule(this);
		}
	}

	public final GameRuleContext gameRule() throws RecognitionException {
		GameRuleContext _localctx = new GameRuleContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_gameRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(T__39);
			setState(533);
			gameRuleParameter();
			setState(534);
			match(T__40);
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
	public static class IdRegistryContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public IdRegistryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idRegistry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIdRegistry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIdRegistry(this);
		}
	}

	public final IdRegistryContext idRegistry() throws RecognitionException {
		IdRegistryContext _localctx = new IdRegistryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_idRegistry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__41);
			setState(537);
			match(String);
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
	public static class IdTagsContext extends ParserRuleContext {
		public IdTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIdTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIdTags(this);
		}
	}

	public final IdTagsContext idTags() throws RecognitionException {
		IdTagsContext _localctx = new IdTagsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_idTags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(T__42);
			setState(540);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) ) {
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
	public static class IdParametersContext extends ParserRuleContext {
		public IdRegistryContext idRegistry() {
			return getRuleContext(IdRegistryContext.class,0);
		}
		public IdTagsContext idTags() {
			return getRuleContext(IdTagsContext.class,0);
		}
		public IdParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIdParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIdParameters(this);
		}
	}

	public final IdParametersContext idParameters() throws RecognitionException {
		IdParametersContext _localctx = new IdParametersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_idParameters);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				idRegistry();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				idTags();
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
	public static class IdContext extends ParserRuleContext {
		public List<IdParametersContext> idParameters() {
			return getRuleContexts(IdParametersContext.class);
		}
		public IdParametersContext idParameters(int i) {
			return getRuleContext(IdParametersContext.class,i);
		}
		public TerminalNode Comma() { return getToken(mcdocParserParser.Comma, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(T__46);
			{
			setState(547);
			idParameters();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(548);
				match(Comma);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41 || _la==T__42) {
					{
					{
					setState(549);
					idParameters();
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			setState(557);
			match(T__47);
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
	public static class Match_regexContext extends ParserRuleContext {
		public TerminalNode RegexPattern() { return getToken(mcdocParserParser.RegexPattern, 0); }
		public Match_regexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterMatch_regex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitMatch_regex(this);
		}
	}

	public final Match_regexContext match_regex() throws RecognitionException {
		Match_regexContext _localctx = new Match_regexContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_match_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(T__48);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RegexPattern) {
				{
				setState(560);
				match(RegexPattern);
				}
			}

			setState(563);
			match(T__49);
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
	public static class NbtContext extends ParserRuleContext {
		public NbtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nbt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterNbt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitNbt(this);
		}
	}

	public final NbtContext nbt() throws RecognitionException {
		NbtContext _localctx = new NbtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_nbt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(T__50);
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
	public static class Nbt_pathContext extends ParserRuleContext {
		public Nbt_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nbt_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterNbt_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitNbt_path(this);
		}
	}

	public final Nbt_pathContext nbt_path() throws RecognitionException {
		Nbt_pathContext _localctx = new Nbt_pathContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_nbt_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T__51);
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
	public static class ObjectiveContext extends ParserRuleContext {
		public ObjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterObjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitObjective(this);
		}
	}

	public final ObjectiveContext objective() throws RecognitionException {
		ObjectiveContext _localctx = new ObjectiveContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_objective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(T__52);
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
	public static class Regex_patternContext extends ParserRuleContext {
		public Regex_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterRegex_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitRegex_pattern(this);
		}
	}

	public final Regex_patternContext regex_pattern() throws RecognitionException {
		Regex_patternContext _localctx = new Regex_patternContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_regex_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__53);
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
	public static class Score_holderContext extends ParserRuleContext {
		public Score_holderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score_holder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterScore_holder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitScore_holder(this);
		}
	}

	public final Score_holderContext score_holder() throws RecognitionException {
		Score_holderContext _localctx = new Score_holderContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_score_holder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__54);
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
	public static class SinceContext extends ParserRuleContext {
		public VersionStringContext versionString() {
			return getRuleContext(VersionStringContext.class,0);
		}
		public SinceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_since; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterSince(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitSince(this);
		}
	}

	public final SinceContext since() throws RecognitionException {
		SinceContext _localctx = new SinceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_since);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__55);
			setState(576);
			versionString();
			setState(577);
			match(T__56);
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
	public static class UntilContext extends ParserRuleContext {
		public VersionStringContext versionString() {
			return getRuleContext(VersionStringContext.class,0);
		}
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUntil(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__57);
			setState(580);
			versionString();
			setState(581);
			match(T__56);
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
	public static class TagContext extends ParserRuleContext {
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__58);
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
	public static class TeamContext extends ParserRuleContext {
		public TeamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_team; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTeam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTeam(this);
		}
	}

	public final TeamContext team() throws RecognitionException {
		TeamContext _localctx = new TeamContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_team);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__59);
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
	public static class Text_componentContext extends ParserRuleContext {
		public Text_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterText_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitText_component(this);
		}
	}

	public final Text_componentContext text_component() throws RecognitionException {
		Text_componentContext _localctx = new Text_componentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_text_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__60);
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
	public static class UuidContext extends ParserRuleContext {
		public UuidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uuid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUuid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUuid(this);
		}
	}

	public final UuidContext uuid() throws RecognitionException {
		UuidContext _localctx = new UuidContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_uuid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__61);
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
	public static class UsefilePathContext extends ParserRuleContext {
		public TerminalNode Path() { return getToken(mcdocParserParser.Path, 0); }
		public TerminalNode DoubleColon() { return getToken(mcdocParserParser.DoubleColon, 0); }
		public UsefilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usefilePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUsefilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUsefilePath(this);
		}
	}

	public final UsefilePathContext usefilePath() throws RecognitionException {
		UsefilePathContext _localctx = new UsefilePathContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_usefilePath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(591);
				match(DoubleColon);
				}
			}

			setState(594);
			match(Path);
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
	public static class UseSentenceContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(mcdocParserParser.Use, 0); }
		public UsefilePathContext usefilePath() {
			return getRuleContext(UsefilePathContext.class,0);
		}
		public UseSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUseSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUseSentence(this);
		}
	}

	public final UseSentenceContext useSentence() throws RecognitionException {
		UseSentenceContext _localctx = new UseSentenceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_useSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(Use);
			setState(597);
			usefilePath();
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
	public static class DocumentAttributeContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public DeprecatedContext deprecated() {
			return getRuleContext(DeprecatedContext.class,0);
		}
		public Dispatcher_keyContext dispatcher_key() {
			return getRuleContext(Dispatcher_keyContext.class,0);
		}
		public Divisible_byContext divisible_by() {
			return getRuleContext(Divisible_byContext.class,0);
		}
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public GameRuleContext gameRule() {
			return getRuleContext(GameRuleContext.class,0);
		}
		public NbtContext nbt() {
			return getRuleContext(NbtContext.class,0);
		}
		public Nbt_pathContext nbt_path() {
			return getRuleContext(Nbt_pathContext.class,0);
		}
		public ObjectiveContext objective() {
			return getRuleContext(ObjectiveContext.class,0);
		}
		public Regex_patternContext regex_pattern() {
			return getRuleContext(Regex_patternContext.class,0);
		}
		public Score_holderContext score_holder() {
			return getRuleContext(Score_holderContext.class,0);
		}
		public SinceContext since() {
			return getRuleContext(SinceContext.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TeamContext team() {
			return getRuleContext(TeamContext.class,0);
		}
		public Text_componentContext text_component() {
			return getRuleContext(Text_componentContext.class,0);
		}
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public UuidContext uuid() {
			return getRuleContext(UuidContext.class,0);
		}
		public DocumentAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDocumentAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDocumentAttribute(this);
		}
	}

	public final DocumentAttributeContext documentAttribute() throws RecognitionException {
		DocumentAttributeContext _localctx = new DocumentAttributeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_documentAttribute);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				color();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				deprecated();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				dispatcher_key();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				divisible_by();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				entity();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				gameRule();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				nbt();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				nbt_path();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				objective();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 10);
				{
				setState(608);
				regex_pattern();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 11);
				{
				setState(609);
				score_holder();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 12);
				{
				setState(610);
				since();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 13);
				{
				setState(611);
				tag();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 14);
				{
				setState(612);
				team();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 15);
				{
				setState(613);
				text_component();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 16);
				{
				setState(614);
				until();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 17);
				{
				setState(615);
				uuid();
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
	public static class FieldContext extends ParserRuleContext {
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public TerminalNode ColonMark() { return getToken(mcdocParserParser.ColonMark, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public QuestionMarkContext questionMark() {
			return getRuleContext(QuestionMarkContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			fieldValue();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(619);
				questionMark();
				}
			}

			setState(622);
			match(ColonMark);
			setState(623);
			dataType();
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
	public static class FieldsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public List<CommentaryContext> commentary() {
			return getRuleContexts(CommentaryContext.class);
		}
		public CommentaryContext commentary(int i) {
			return getRuleContext(CommentaryContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitFields(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_fields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			field();
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(626);
					match(Comma);
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Commentary) {
						{
						{
						setState(627);
						commentary();
						}
						}
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(633);
					field();
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(639);
				match(Comma);
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
	public static class StructReferenceContext extends ParserRuleContext {
		public TerminalNode FieldValue() { return getToken(mcdocParserParser.FieldValue, 0); }
		public StructReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructReference(this);
		}
	}

	public final StructReferenceContext structReference() throws RecognitionException {
		StructReferenceContext _localctx = new StructReferenceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_structReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__62);
			setState(643);
			match(FieldValue);
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
	public static class SuperInvokeContext extends ParserRuleContext {
		public TerminalNode FieldValue() { return getToken(mcdocParserParser.FieldValue, 0); }
		public SuperInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterSuperInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitSuperInvoke(this);
		}
	}

	public final SuperInvokeContext superInvoke() throws RecognitionException {
		SuperInvokeContext _localctx = new SuperInvokeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_superInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__63);
			setState(646);
			match(FieldValue);
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
	public static class StructContentContext extends ParserRuleContext {
		public List<CommentaryContext> commentary() {
			return getRuleContexts(CommentaryContext.class);
		}
		public CommentaryContext commentary(int i) {
			return getRuleContext(CommentaryContext.class,i);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public List<SuperInvokeContext> superInvoke() {
			return getRuleContexts(SuperInvokeContext.class);
		}
		public SuperInvokeContext superInvoke(int i) {
			return getRuleContext(SuperInvokeContext.class,i);
		}
		public List<StructReferenceContext> structReference() {
			return getRuleContexts(StructReferenceContext.class);
		}
		public StructReferenceContext structReference(int i) {
			return getRuleContext(StructReferenceContext.class,i);
		}
		public List<DocumentAttributeContext> documentAttribute() {
			return getRuleContexts(DocumentAttributeContext.class);
		}
		public DocumentAttributeContext documentAttribute(int i) {
			return getRuleContext(DocumentAttributeContext.class,i);
		}
		public StructContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructContent(this);
		}
	}

	public final StructContentContext structContent() throws RecognitionException {
		StructContentContext _localctx = new StructContentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_structContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -146365749461516288L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 3145729L) != 0)) {
				{
				setState(653);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Commentary:
					{
					setState(648);
					commentary();
					}
					break;
				case FieldValue:
					{
					setState(649);
					fields();
					}
					break;
				case T__63:
					{
					setState(650);
					superInvoke();
					}
					break;
				case T__62:
					{
					setState(651);
					structReference();
					}
					break;
				case T__19:
				case T__26:
				case T__27:
				case T__29:
				case T__36:
				case T__39:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
					{
					setState(652);
					documentAttribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(657);
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
	public static class StructNameContext extends ParserRuleContext {
		public TerminalNode FieldValue() { return getToken(mcdocParserParser.FieldValue, 0); }
		public StructNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructName(this);
		}
	}

	public final StructNameContext structName() throws RecognitionException {
		StructNameContext _localctx = new StructNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(FieldValue);
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
	public static class StructSentenceContext extends ParserRuleContext {
		public StructNameContext structName() {
			return getRuleContext(StructNameContext.class,0);
		}
		public StructContentContext structContent() {
			return getRuleContext(StructContentContext.class,0);
		}
		public StructSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructSentence(this);
		}
	}

	public final StructSentenceContext structSentence() throws RecognitionException {
		StructSentenceContext _localctx = new StructSentenceContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_structSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(T__64);
			setState(661);
			structName();
			setState(662);
			match(T__9);
			setState(663);
			structContent();
			setState(664);
			match(T__10);
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
	public static class DocumentContext extends ParserRuleContext {
		public StructSentenceContext structSentence() {
			return getRuleContext(StructSentenceContext.class,0);
		}
		public List<UseSentenceContext> useSentence() {
			return getRuleContexts(UseSentenceContext.class);
		}
		public UseSentenceContext useSentence(int i) {
			return getRuleContext(UseSentenceContext.class,i);
		}
		public List<CommentaryContext> commentary() {
			return getRuleContexts(CommentaryContext.class);
		}
		public CommentaryContext commentary(int i) {
			return getRuleContext(CommentaryContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Use) {
				{
				{
				setState(666);
				useSentence();
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Commentary) {
				{
				{
				setState(672);
				commentary();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			structSentence();
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
		"\u0004\u0001l\u02a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00ad\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00bc\b\u0006\u0003\u0006\u00be\b\u0006\u0001\u0007\u0003"+
		"\u0007\u00c1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00c7\b\u0007\u0003\u0007\u00c9\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00e1\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e6\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00eb\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f0\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00f5\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00fa\b\u0011\u0003\u0011\u00fc\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0103\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u010d\b\u0013\u000b\u0013\f\u0013"+
		"\u010e\u0001\u0013\u0003\u0013\u0112\b\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0116\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0129\b\u0018\n\u0018\f\u0018\u012c\t\u0018\u0001\u0018"+
		"\u0003\u0018\u012f\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0133\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u013b\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0149\b\u001c\n\u001c\f\u001c"+
		"\u014c\t\u001c\u0001\u001c\u0003\u001c\u014f\b\u001c\u0003\u001c\u0151"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u015a\b\u001e\n\u001e\f\u001e\u015d\t\u001e"+
		"\u0001\u001e\u0003\u001e\u0160\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u016c\b"+
		" \n \f \u016f\t \u0001 \u0003 \u0172\b \u0001 \u0001 \u0003 \u0176\b "+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0185\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u018b\b\"\n\"\f\"\u018e\t\"\u0001#\u0005#\u0191\b#\n#\f#\u0194"+
		"\t#\u0001#\u0005#\u0197\b#\n#\f#\u019a\t#\u0001#\u0005#\u019d\b#\n#\f"+
		"#\u01a0\t#\u0001#\u0005#\u01a3\b#\n#\f#\u01a6\t#\u0001#\u0005#\u01a9\b"+
		"#\n#\f#\u01ac\t#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u01b4"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01bd\b%\u0003"+
		"%\u01bf\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u01c5\b&\u0001\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u01df\b-\u0001.\u0001.\u0001.\u0001.\u0005.\u01e5"+
		"\b.\n.\f.\u01e8\t.\u0003.\u01ea\b.\u0001.\u0001.\u0001/\u0001/\u0001/"+
		"\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u00034\u0203"+
		"\b4\u00015\u00015\u00015\u00015\u00055\u0209\b5\n5\f5\u020c\t5\u00035"+
		"\u020e\b5\u00015\u00015\u00016\u00016\u00016\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00019\u00019\u00019\u0001:\u0001:\u0003:\u0221"+
		"\b:\u0001;\u0001;\u0001;\u0001;\u0005;\u0227\b;\n;\f;\u022a\t;\u0003;"+
		"\u022c\b;\u0001;\u0001;\u0001<\u0001<\u0003<\u0232\b<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001"+
		"E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0003H\u0251\bH\u0001H\u0001"+
		"H\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u0269\bJ\u0001K\u0001K\u0003K\u026d\bK\u0001K\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0005L\u0275\bL\nL\fL\u0278\tL\u0001L\u0005L\u027b\bL"+
		"\nL\fL\u027e\tL\u0001L\u0003L\u0281\bL\u0001M\u0001M\u0001M\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0005O\u028e\bO\nO\fO\u0291"+
		"\tO\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0005"+
		"R\u029c\bR\nR\fR\u029f\tR\u0001R\u0005R\u02a2\bR\nR\fR\u02a5\tR\u0001"+
		"R\u0001R\u0001R\u0000\u0000S\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u0000"+
		"\u000b\u0001\u0000JQ\u0001\u0000\u0002\u0003\u0003\u0000\u0002\u0003["+
		"[ff\u0002\u0000JJLQ\u0002\u0000[[ff\u0001\u0000kl\u0001\u0000LQ\u0001"+
		"\u0000 !\u0001\u0000#$\u0001\u0000&\'\u0001\u0000,.\u02b8\u0000\u00a6"+
		"\u0001\u0000\u0000\u0000\u0002\u00a8\u0001\u0000\u0000\u0000\u0004\u00ac"+
		"\u0001\u0000\u0000\u0000\u0006\u00ae\u0001\u0000\u0000\u0000\b\u00b0\u0001"+
		"\u0000\u0000\u0000\n\u00b2\u0001\u0000\u0000\u0000\f\u00bd\u0001\u0000"+
		"\u0000\u0000\u000e\u00c8\u0001\u0000\u0000\u0000\u0010\u00ca\u0001\u0000"+
		"\u0000\u0000\u0012\u00cc\u0001\u0000\u0000\u0000\u0014\u00ce\u0001\u0000"+
		"\u0000\u0000\u0016\u00d0\u0001\u0000\u0000\u0000\u0018\u00d2\u0001\u0000"+
		"\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000\u001c\u00d6\u0001\u0000"+
		"\u0000\u0000\u001e\u00d8\u0001\u0000\u0000\u0000 \u00db\u0001\u0000\u0000"+
		"\u0000\"\u00fb\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000\u0000"+
		"&\u0115\u0001\u0000\u0000\u0000(\u0117\u0001\u0000\u0000\u0000*\u0119"+
		"\u0001\u0000\u0000\u0000,\u011b\u0001\u0000\u0000\u0000.\u011d\u0001\u0000"+
		"\u0000\u00000\u0132\u0001\u0000\u0000\u00002\u0134\u0001\u0000\u0000\u0000"+
		"4\u013e\u0001\u0000\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u0150"+
		"\u0001\u0000\u0000\u0000:\u0152\u0001\u0000\u0000\u0000<\u0154\u0001\u0000"+
		"\u0000\u0000>\u0163\u0001\u0000\u0000\u0000@\u0175\u0001\u0000\u0000\u0000"+
		"B\u0184\u0001\u0000\u0000\u0000D\u0186\u0001\u0000\u0000\u0000F\u0192"+
		"\u0001\u0000\u0000\u0000H\u01ad\u0001\u0000\u0000\u0000J\u01be\u0001\u0000"+
		"\u0000\u0000L\u01c4\u0001\u0000\u0000\u0000N\u01c6\u0001\u0000\u0000\u0000"+
		"P\u01c9\u0001\u0000\u0000\u0000R\u01ce\u0001\u0000\u0000\u0000T\u01d1"+
		"\u0001\u0000\u0000\u0000V\u01d4\u0001\u0000\u0000\u0000X\u01d7\u0001\u0000"+
		"\u0000\u0000Z\u01de\u0001\u0000\u0000\u0000\\\u01e0\u0001\u0000\u0000"+
		"\u0000^\u01ed\u0001\u0000\u0000\u0000`\u01f1\u0001\u0000\u0000\u0000b"+
		"\u01f5\u0001\u0000\u0000\u0000d\u01fa\u0001\u0000\u0000\u0000f\u01fd\u0001"+
		"\u0000\u0000\u0000h\u0202\u0001\u0000\u0000\u0000j\u0204\u0001\u0000\u0000"+
		"\u0000l\u0211\u0001\u0000\u0000\u0000n\u0214\u0001\u0000\u0000\u0000p"+
		"\u0218\u0001\u0000\u0000\u0000r\u021b\u0001\u0000\u0000\u0000t\u0220\u0001"+
		"\u0000\u0000\u0000v\u0222\u0001\u0000\u0000\u0000x\u022f\u0001\u0000\u0000"+
		"\u0000z\u0235\u0001\u0000\u0000\u0000|\u0237\u0001\u0000\u0000\u0000~"+
		"\u0239\u0001\u0000\u0000\u0000\u0080\u023b\u0001\u0000\u0000\u0000\u0082"+
		"\u023d\u0001\u0000\u0000\u0000\u0084\u023f\u0001\u0000\u0000\u0000\u0086"+
		"\u0243\u0001\u0000\u0000\u0000\u0088\u0247\u0001\u0000\u0000\u0000\u008a"+
		"\u0249\u0001\u0000\u0000\u0000\u008c\u024b\u0001\u0000\u0000\u0000\u008e"+
		"\u024d\u0001\u0000\u0000\u0000\u0090\u0250\u0001\u0000\u0000\u0000\u0092"+
		"\u0254\u0001\u0000\u0000\u0000\u0094\u0268\u0001\u0000\u0000\u0000\u0096"+
		"\u026a\u0001\u0000\u0000\u0000\u0098\u0271\u0001\u0000\u0000\u0000\u009a"+
		"\u0282\u0001\u0000\u0000\u0000\u009c\u0285\u0001\u0000\u0000\u0000\u009e"+
		"\u028f\u0001\u0000\u0000\u0000\u00a0\u0292\u0001\u0000\u0000\u0000\u00a2"+
		"\u0294\u0001\u0000\u0000\u0000\u00a4\u029d\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005E\u0000\u0000\u00a7\u0001\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0007\u0000\u0000\u0000\u00a9\u0003\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0005\u0001\u0000\u0000\u00ab\u00ad\u0003\u0006\u0003\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0005"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0007\u0001\u0000\u0000\u00af\u0007"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005K\u0000\u0000\u00b1\t\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u000b\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0005I\u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00be\u0003\u0010\b\u0000\u00b8\u00b9\u0003\u0010\b"+
		"\u0000\u00b9\u00bb\u0005I\u0000\u0000\u00ba\u00bc\u0003\u0010\b\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b8\u0001\u0000\u0000\u0000\u00be\r\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0005I\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c9"+
		"\u0003\u0012\t\u0000\u00c3\u00c4\u0003\u0012\t\u0000\u00c4\u00c6\u0005"+
		"I\u0000\u0000\u00c5\u00c7\u0003\u0012\t\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c9\u000f\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005X\u0000"+
		"\u0000\u00cb\u0011\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005Z\u0000\u0000"+
		"\u00cd\u0013\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\\\u0000\u0000\u00cf"+
		"\u0015\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005`\u0000\u0000\u00d1\u0017"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3\u0019\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005U\u0000\u0000\u00d5\u001b\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005T\u0000\u0000\u00d7\u001d\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005J\u0000\u0000\u00d9\u00da\u0003\f\u0006\u0000"+
		"\u00da\u001f\u0001\u0000\u0000\u0000\u00db\u00dc\u0007\u0002\u0000\u0000"+
		"\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00e0\u0005L\u0000\u0000\u00de\u00df"+
		"\u0005\u0005\u0000\u0000\u00df\u00e1\u0003\f\u0006\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00fc\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e5\u0005M\u0000\u0000\u00e3\u00e4\u0005\u0005"+
		"\u0000\u0000\u00e4\u00e6\u0003\f\u0006\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00fc\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ea\u0005N\u0000\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000"+
		"\u00e9\u00eb\u0003\f\u0006\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00fc\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0005Q\u0000\u0000\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00f0"+
		"\u0003\f\u0006\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00fc\u0001\u0000\u0000\u0000\u00f1\u00f4\u0005"+
		"O\u0000\u0000\u00f2\u00f3\u0005\u0005\u0000\u0000\u00f3\u00f5\u0003\f"+
		"\u0006\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00fc\u0001\u0000\u0000\u0000\u00f6\u00f9\u0005P\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0005\u0000\u0000\u00f8\u00fa\u0003\f\u0006\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00dd\u0001\u0000\u0000\u0000"+
		"\u00fb\u00e2\u0001\u0000\u0000\u0000\u00fb\u00e7\u0001\u0000\u0000\u0000"+
		"\u00fb\u00ec\u0001\u0000\u0000\u0000\u00fb\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fc#\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\u0006\u0000\u0000\u00fe\u00ff\u0003D\"\u0000\u00ff\u0102"+
		"\u0005\u0007\u0000\u0000\u0100\u0101\u0005\u0005\u0000\u0000\u0101\u0103"+
		"\u0003\f\u0006\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0006"+
		"\u0000\u0000\u0105\u0106\u0003D\"\u0000\u0106\u0107\u0005\b\u0000\u0000"+
		"\u0107\u0116\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0006\u0000\u0000"+
		"\u0109\u010c\u0003D\"\u0000\u010a\u010b\u0005F\u0000\u0000\u010b\u010d"+
		"\u0003D\"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0112\u0005"+
		"F\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0007"+
		"\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0104\u0001\u0000"+
		"\u0000\u0000\u0115\u0108\u0001\u0000\u0000\u0000\u0116\'\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0003\u001a\r\u0000\u0118)\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0007\u0003\u0000\u0000\u011a+\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0007\u0004\u0000\u0000\u011c-\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0003(\u0014\u0000\u011e\u011f\u0003\u0018\f\u0000\u011f\u0120\u0005"+
		"\t\u0000\u0000\u0120\u0121\u0003,\u0016\u0000\u0121/\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005\n\u0000\u0000\u0123\u0133\u0005\u000b\u0000\u0000"+
		"\u0124\u0125\u0005\n\u0000\u0000\u0125\u012a\u0003.\u0017\u0000\u0126"+
		"\u0127\u0005F\u0000\u0000\u0127\u0129\u0003.\u0017\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012f\u0005"+
		"F\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u000b"+
		"\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0122\u0001\u0000"+
		"\u0000\u0000\u0132\u0124\u0001\u0000\u0000\u0000\u01331\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0003(\u0014\u0000\u0135\u0136\u0005\f\u0000\u0000"+
		"\u0136\u0137\u0005\r\u0000\u0000\u0137\u0138\u0003*\u0015\u0000\u0138"+
		"\u013a\u0005\u000e\u0000\u0000\u0139\u013b\u0003\u0018\f\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u00030\u0018\u0000\u013d3\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005h\u0000\u0000\u013f5\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0005b\u0000\u0000\u0141\u0142\u0003<\u001e\u0000\u01427"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0005\r\u0000\u0000\u0144\u0151\u0005"+
		"\u000e\u0000\u0000\u0145\u014a\u0003D\"\u0000\u0146\u0147\u0005E\u0000"+
		"\u0000\u0147\u0149\u0003D\"\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014f\u0005E\u0000\u0000\u014e"+
		"\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0151\u0001\u0000\u0000\u0000\u0150\u0143\u0001\u0000\u0000\u0000\u0150"+
		"\u0145\u0001\u0000\u0000\u0000\u01519\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0007\u0005\u0000\u0000\u0153;\u0001\u0000\u0000\u0000\u0154\u0155\u0005"+
		"\u0006\u0000\u0000\u0155\u015b\u0003:\u001d\u0000\u0156\u0157\u0003:\u001d"+
		"\u0000\u0157\u0158\u0005F\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u0156\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u0160\u0005F\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005\u0007\u0000\u0000\u0162=\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0003<\u001e\u0000\u0164?\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u000f"+
		"\u0000\u0000\u0166\u0176\u0005\u0010\u0000\u0000\u0167\u016d\u0003D\""+
		"\u0000\u0168\u0169\u0003D\"\u0000\u0169\u016a\u0005\u0011\u0000\u0000"+
		"\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000"+
		"\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0172\u0005F\u0000\u0000\u0171"+
		"\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0010\u0000\u0000\u0174"+
		"\u0176\u0001\u0000\u0000\u0000\u0175\u0165\u0001\u0000\u0000\u0000\u0175"+
		"\u0167\u0001\u0000\u0000\u0000\u0176A\u0001\u0000\u0000\u0000\u0177\u0185"+
		"\u0003\u0004\u0002\u0000\u0178\u0185\u0003\u001e\u000f\u0000\u0179\u0185"+
		"\u0003 \u0010\u0000\u017a\u0185\u0003\"\u0011\u0000\u017b\u0185\u0003"+
		"J%\u0000\u017c\u0185\u0003$\u0012\u0000\u017d\u0185\u0003&\u0013\u0000"+
		"\u017e\u0185\u00032\u0019\u0000\u017f\u0185\u0003\u00a2Q\u0000\u0180\u0185"+
		"\u00034\u001a\u0000\u0181\u0185\u00036\u001b\u0000\u0182\u0185\u00038"+
		"\u001c\u0000\u0183\u0185\u0003>\u001f\u0000\u0184\u0177\u0001\u0000\u0000"+
		"\u0000\u0184\u0178\u0001\u0000\u0000\u0000\u0184\u0179\u0001\u0000\u0000"+
		"\u0000\u0184\u017a\u0001\u0000\u0000\u0000\u0184\u017b\u0001\u0000\u0000"+
		"\u0000\u0184\u017c\u0001\u0000\u0000\u0000\u0184\u017d\u0001\u0000\u0000"+
		"\u0000\u0184\u017e\u0001\u0000\u0000\u0000\u0184\u017f\u0001\u0000\u0000"+
		"\u0000\u0184\u0180\u0001\u0000\u0000\u0000\u0184\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000"+
		"\u0000\u0185C\u0001\u0000\u0000\u0000\u0186\u0187\u0003\u0094J\u0000\u0187"+
		"\u018c\u0003B!\u0000\u0188\u018b\u0003<\u001e\u0000\u0189\u018b\u0003"+
		"@ \u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018dE\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0191\u0003\u001a\r\u0000\u0190"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u0198\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u0003\u0094J\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u019a"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u019e\u0001\u0000\u0000\u0000\u019a\u0198"+
		"\u0001\u0000\u0000\u0000\u019b\u019d\u0003\u001a\r\u0000\u019c\u019b\u0001"+
		"\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003"+
		"\u001c\u000e\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5\u01aa\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a9\u0003\u001a\r\u0000\u01a8\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01abG\u0001\u0000\u0000"+
		"\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005D\u0000\u0000"+
		"\u01ae\u01af\u0005`\u0000\u0000\u01afI\u0001\u0000\u0000\u0000\u01b0\u01b3"+
		"\u0007\u0006\u0000\u0000\u01b1\u01b2\u0005D\u0000\u0000\u01b2\u01b4\u0003"+
		"\f\u0006\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01bf\u0005\u0012"+
		"\u0000\u0000\u01b6\u01b7\u0005\u0006\u0000\u0000\u01b7\u01b8\u0007\u0006"+
		"\u0000\u0000\u01b8\u01b9\u0005\u0007\u0000\u0000\u01b9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0005D\u0000\u0000\u01bb\u01bd\u0003\f\u0006"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01b0\u0001\u0000\u0000"+
		"\u0000\u01be\u01b6\u0001\u0000\u0000\u0000\u01bfK\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c5\u0003J%\u0000\u01c1\u01c5\u0003\b\u0004\u0000\u01c2\u01c5"+
		"\u0003\"\u0011\u0000\u01c3\u01c5\u0003F#\u0000\u01c4\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5M\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0005\u0013\u0000\u0000\u01c7\u01c8\u0003L&\u0000\u01c8"+
		"O\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0014\u0000\u0000\u01ca\u01cb"+
		"\u0005[\u0000\u0000\u01cb\u01cc\u0005\u0007\u0000\u0000\u01cc\u01cd\u0003"+
		"L&\u0000\u01cdQ\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u0015\u0000"+
		"\u0000\u01cf\u01d0\u0005[\u0000\u0000\u01d0S\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0005\u0016\u0000\u0000\u01d2\u01d3\u0005[\u0000\u0000\u01d3U\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0005\u0017\u0000\u0000\u01d5\u01d6\u0005"+
		"[\u0000\u0000\u01d6W\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u0018\u0000"+
		"\u0000\u01d8\u01d9\u0003\u0010\b\u0000\u01d9Y\u0001\u0000\u0000\u0000"+
		"\u01da\u01df\u0003R)\u0000\u01db\u01df\u0003T*\u0000\u01dc\u01df\u0003"+
		"V+\u0000\u01dd\u01df\u0003X,\u0000\u01de\u01da\u0001\u0000\u0000\u0000"+
		"\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000"+
		"\u01de\u01dd\u0001\u0000\u0000\u0000\u01df[\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0005\u0019\u0000\u0000\u01e1\u01e9\u0003Z-\u0000\u01e2\u01e6\u0005"+
		"F\u0000\u0000\u01e3\u01e5\u0003Z-\u0000\u01e4\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0005\u001a\u0000\u0000\u01ec]\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005\u001b\u0000\u0000\u01ee\u01ef\u0003\u0014\n\u0000\u01ef"+
		"\u01f0\u0005\u0007\u0000\u0000\u01f0_\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005\u001c\u0000\u0000\u01f2\u01f3\u0005]\u0000\u0000\u01f3\u01f4\u0005"+
		"\u001d\u0000\u0000\u01f4a\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u001e"+
		"\u0000\u0000\u01f6\u01f7\u0003\u0010\b\u0000\u01f7\u01f8\u0005\u0007\u0000"+
		"\u0000\u01f8\u01f9\u0005N\u0000\u0000\u01f9c\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0005\u001f\u0000\u0000\u01fb\u01fc\u0007\u0007\u0000\u0000\u01fc"+
		"e\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\"\u0000\u0000\u01fe\u01ff"+
		"\u0007\b\u0000\u0000\u01ffg\u0001\u0000\u0000\u0000\u0200\u0203\u0003"+
		"d2\u0000\u0201\u0203\u0003f3\u0000\u0202\u0200\u0001\u0000\u0000\u0000"+
		"\u0202\u0201\u0001\u0000\u0000\u0000\u0203i\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0005%\u0000\u0000\u0205\u020d\u0003h4\u0000\u0206\u020a\u0005"+
		"F\u0000\u0000\u0207\u0209\u0003h4\u0000\u0208\u0207\u0001\u0000\u0000"+
		"\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000"+
		"\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0206\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0005\u001a\u0000\u0000\u0210k\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0005\"\u0000\u0000\u0212\u0213\u0007\t\u0000\u0000\u0213"+
		"m\u0001\u0000\u0000\u0000\u0214\u0215\u0005(\u0000\u0000\u0215\u0216\u0003"+
		"l6\u0000\u0216\u0217\u0005)\u0000\u0000\u0217o\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0005*\u0000\u0000\u0219\u021a\u0005[\u0000\u0000\u021aq"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0005+\u0000\u0000\u021c\u021d\u0007"+
		"\n\u0000\u0000\u021ds\u0001\u0000\u0000\u0000\u021e\u0221\u0003p8\u0000"+
		"\u021f\u0221\u0003r9\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u021f"+
		"\u0001\u0000\u0000\u0000\u0221u\u0001\u0000\u0000\u0000\u0222\u0223\u0005"+
		"/\u0000\u0000\u0223\u022b\u0003t:\u0000\u0224\u0228\u0005F\u0000\u0000"+
		"\u0225\u0227\u0003t:\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u022a"+
		"\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228"+
		"\u0001\u0000\u0000\u0000\u022b\u0224\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u00050\u0000\u0000\u022ew\u0001\u0000\u0000\u0000\u022f\u0231\u00051"+
		"\u0000\u0000\u0230\u0232\u0005V\u0000\u0000\u0231\u0230\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u00052\u0000\u0000\u0234y\u0001\u0000\u0000\u0000\u0235"+
		"\u0236\u00053\u0000\u0000\u0236{\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"4\u0000\u0000\u0238}\u0001\u0000\u0000\u0000\u0239\u023a\u00055\u0000"+
		"\u0000\u023a\u007f\u0001\u0000\u0000\u0000\u023b\u023c\u00056\u0000\u0000"+
		"\u023c\u0081\u0001\u0000\u0000\u0000\u023d\u023e\u00057\u0000\u0000\u023e"+
		"\u0083\u0001\u0000\u0000\u0000\u023f\u0240\u00058\u0000\u0000\u0240\u0241"+
		"\u0003\u0014\n\u0000\u0241\u0242\u00059\u0000\u0000\u0242\u0085\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0005:\u0000\u0000\u0244\u0245\u0003\u0014"+
		"\n\u0000\u0245\u0246\u00059\u0000\u0000\u0246\u0087\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0005;\u0000\u0000\u0248\u0089\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0005<\u0000\u0000\u024a\u008b\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005=\u0000\u0000\u024c\u008d\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0005>\u0000\u0000\u024e\u008f\u0001\u0000\u0000\u0000\u024f\u0251\u0005"+
		"G\u0000\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0005h\u0000"+
		"\u0000\u0253\u0091\u0001\u0000\u0000\u0000\u0254\u0255\u0005R\u0000\u0000"+
		"\u0255\u0256\u0003\u0090H\u0000\u0256\u0093\u0001\u0000\u0000\u0000\u0257"+
		"\u0269\u0003P(\u0000\u0258\u0269\u0003^/\u0000\u0259\u0269\u0003`0\u0000"+
		"\u025a\u0269\u0003b1\u0000\u025b\u0269\u0003j5\u0000\u025c\u0269\u0003"+
		"n7\u0000\u025d\u0269\u0003z=\u0000\u025e\u0269\u0003|>\u0000\u025f\u0269"+
		"\u0003~?\u0000\u0260\u0269\u0003\u0080@\u0000\u0261\u0269\u0003\u0082"+
		"A\u0000\u0262\u0269\u0003\u0084B\u0000\u0263\u0269\u0003\u0088D\u0000"+
		"\u0264\u0269\u0003\u008aE\u0000\u0265\u0269\u0003\u008cF\u0000\u0266\u0269"+
		"\u0003\u0086C\u0000\u0267\u0269\u0003\u008eG\u0000\u0268\u0257\u0001\u0000"+
		"\u0000\u0000\u0268\u0258\u0001\u0000\u0000\u0000\u0268\u0259\u0001\u0000"+
		"\u0000\u0000\u0268\u025a\u0001\u0000\u0000\u0000\u0268\u025b\u0001\u0000"+
		"\u0000\u0000\u0268\u025c\u0001\u0000\u0000\u0000\u0268\u025d\u0001\u0000"+
		"\u0000\u0000\u0268\u025e\u0001\u0000\u0000\u0000\u0268\u025f\u0001\u0000"+
		"\u0000\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268\u0261\u0001\u0000"+
		"\u0000\u0000\u0268\u0262\u0001\u0000\u0000\u0000\u0268\u0263\u0001\u0000"+
		"\u0000\u0000\u0268\u0264\u0001\u0000\u0000\u0000\u0268\u0265\u0001\u0000"+
		"\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0267\u0001\u0000"+
		"\u0000\u0000\u0269\u0095\u0001\u0000\u0000\u0000\u026a\u026c\u0003\u001c"+
		"\u000e\u0000\u026b\u026d\u0003\n\u0005\u0000\u026c\u026b\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0005H\u0000\u0000\u026f\u0270\u0003L&\u0000\u0270"+
		"\u0097\u0001\u0000\u0000\u0000\u0271\u027c\u0003\u0096K\u0000\u0272\u0276"+
		"\u0005F\u0000\u0000\u0273\u0275\u0003\u001a\r\u0000\u0274\u0273\u0001"+
		"\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0001"+
		"\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027b\u0003"+
		"\u0096K\u0000\u027a\u0272\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000"+
		"\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000"+
		"\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000"+
		"\u0000\u0000\u027f\u0281\u0005F\u0000\u0000\u0280\u027f\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0099\u0001\u0000\u0000"+
		"\u0000\u0282\u0283\u0005?\u0000\u0000\u0283\u0284\u0005T\u0000\u0000\u0284"+
		"\u009b\u0001\u0000\u0000\u0000\u0285\u0286\u0005@\u0000\u0000\u0286\u0287"+
		"\u0005T\u0000\u0000\u0287\u009d\u0001\u0000\u0000\u0000\u0288\u028e\u0003"+
		"\u001a\r\u0000\u0289\u028e\u0003\u0098L\u0000\u028a\u028e\u0003\u009c"+
		"N\u0000\u028b\u028e\u0003\u009aM\u0000\u028c\u028e\u0003\u0094J\u0000"+
		"\u028d\u0288\u0001\u0000\u0000\u0000\u028d\u0289\u0001\u0000\u0000\u0000"+
		"\u028d\u028a\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000"+
		"\u028d\u028c\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000"+
		"\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000"+
		"\u0290\u009f\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0005T\u0000\u0000\u0293\u00a1\u0001\u0000\u0000\u0000\u0294"+
		"\u0295\u0005A\u0000\u0000\u0295\u0296\u0003\u00a0P\u0000\u0296\u0297\u0005"+
		"\n\u0000\u0000\u0297\u0298\u0003\u009eO\u0000\u0298\u0299\u0005\u000b"+
		"\u0000\u0000\u0299\u00a3\u0001\u0000\u0000\u0000\u029a\u029c\u0003\u0092"+
		"I\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e\u02a3\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a2\u0003\u001a\r\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7\u0003\u00a2Q\u0000\u02a7"+
		"\u00a5\u0001\u0000\u0000\u0000>\u00ac\u00b5\u00bb\u00bd\u00c0\u00c6\u00c8"+
		"\u00e0\u00e5\u00ea\u00ef\u00f4\u00f9\u00fb\u0102\u010e\u0111\u0115\u012a"+
		"\u012e\u0132\u013a\u014a\u014e\u0150\u015b\u015f\u016d\u0171\u0175\u0184"+
		"\u018a\u018c\u0192\u0198\u019e\u01a4\u01aa\u01b3\u01bc\u01be\u01c4\u01de"+
		"\u01e6\u01e9\u0202\u020a\u020d\u0220\u0228\u022b\u0231\u0250\u0268\u026c"+
		"\u0276\u027c\u0280\u028d\u028f\u029d\u02a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}