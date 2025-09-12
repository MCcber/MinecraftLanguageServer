// Generated from D:/C#Project/MinecraftLanguageServer/MCDocumentRule/mcdocParser.g4 by ANTLR 4.13.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, As=15, Dot=16, Minus=17, 
		Plus=18, Remainder=19, Equal=20, Sharp=21, SquareBrackets=22, LeftSquareBracket=23, 
		RightSquareBracket=24, RoundBrackets=25, LeftRoundBracket=26, RightRoundBracket=27, 
		CurlyBrackets=28, LeftCurlyBracket=29, RightCurlyBracket=30, AngleBrackets=31, 
		LeftAngleBracket=32, RightAngleBracket=33, LogicalOR=34, Comma=35, DoubleColon=36, 
		ColonMark=37, DoubleDot=38, TripleDot=39, EnumKeyType=40, StringKeyType=41, 
		BooleanKeyType=42, ByteKeyType=43, ShortKeyType=44, IntKeyType=45, FloatKeyType=46, 
		DoubleKeyType=47, LongKeyType=48, Any=49, BoolValue=50, DocCommentary=51, 
		Commentary=52, DoubleQuotes=53, TypedNumberLexer=54, Integer=55, FloatExponent=56, 
		Float=57, Number=58, PositiveInteger=59, IntTypedUnit=60, FloatTypedUnit=61, 
		IdentStart=62, IdentContinue=63, Identifier=64, SingleStringValue=65, 
		String=66, IntegerRange=67, FloatRange=68, ResourceLocationChar=69, ResourceLocation=70, 
		PathSegment=71, Path=72;
	public static final int
		RULE_logicalOR = 0, RULE_path = 1, RULE_resourceLocation = 2, RULE_at = 3, 
		RULE_dot = 4, RULE_baseDataType = 5, RULE_keywordType = 6, RULE_questionMark = 7, 
		RULE_structKeyType = 8, RULE_inject = 9, RULE_enum = 10, RULE_use = 11, 
		RULE_dispatch = 12, RULE_typeKeyType = 13, RULE_doubleDot = 14, RULE_integer = 15, 
		RULE_float = 16, RULE_integerRange = 17, RULE_identifier = 18, RULE_commentary = 19, 
		RULE_docCommentary = 20, RULE_typedNumber = 21, RULE_stringType = 22, 
		RULE_literalType = 23, RULE_numericType = 24, RULE_primitiveArrayType = 25, 
		RULE_listType = 26, RULE_tupleType = 27, RULE_enumMemberType = 28, RULE_enumValue = 29, 
		RULE_enumField = 30, RULE_enumBlock = 31, RULE_enumType = 32, RULE_prelim = 33, 
		RULE_referenceType = 34, RULE_dispatcherType = 35, RULE_unionType = 36, 
		RULE_staticIndexKey = 37, RULE_accessor = 38, RULE_accessorKey = 39, RULE_dynamicIndex = 40, 
		RULE_indexWithOutDynamic = 41, RULE_indexWithDynamic = 42, RULE_indexBodyWithOutDynamic = 43, 
		RULE_indexBodyWithDynamic = 44, RULE_indexingOnAType = 45, RULE_typeArgBlock = 46, 
		RULE_unAttributedType = 47, RULE_type = 48, RULE_attributeSet = 49, RULE_arrayLength = 50, 
		RULE_string = 51, RULE_positionalValues = 52, RULE_namedValue = 53, RULE_namedValues = 54, 
		RULE_treeBody = 55, RULE_treeValue = 56, RULE_value = 57, RULE_attribute = 58, 
		RULE_dispatchStatement = 59, RULE_structInjection = 60, RULE_enumInjection = 61, 
		RULE_injection = 62, RULE_useStatement = 63, RULE_typeParam = 64, RULE_typeParamBlock = 65, 
		RULE_typeAlias = 66, RULE_structKey = 67, RULE_structField = 68, RULE_structBlock = 69, 
		RULE_struct = 70, RULE_file = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicalOR", "path", "resourceLocation", "at", "dot", "baseDataType", 
			"keywordType", "questionMark", "structKeyType", "inject", "enum", "use", 
			"dispatch", "typeKeyType", "doubleDot", "integer", "float", "integerRange", 
			"identifier", "commentary", "docCommentary", "typedNumber", "stringType", 
			"literalType", "numericType", "primitiveArrayType", "listType", "tupleType", 
			"enumMemberType", "enumValue", "enumField", "enumBlock", "enumType", 
			"prelim", "referenceType", "dispatcherType", "unionType", "staticIndexKey", 
			"accessor", "accessorKey", "dynamicIndex", "indexWithOutDynamic", "indexWithDynamic", 
			"indexBodyWithOutDynamic", "indexBodyWithDynamic", "indexingOnAType", 
			"typeArgBlock", "unAttributedType", "type", "attributeSet", "arrayLength", 
			"string", "positionalValues", "namedValue", "namedValues", "treeBody", 
			"treeValue", "value", "attribute", "dispatchStatement", "structInjection", 
			"enumInjection", "injection", "useStatement", "typeParam", "typeParamBlock", 
			"typeAlias", "structKey", "structField", "structBlock", "struct", "file"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'?'", "'struct'", "'inject'", "'use'", "'dispatch'", "'type'", 
			"'%fallback'", "'%none'", "'%unknown'", "'%parent'", "'%key'", "'to'", 
			null, "'as'", "'.'", "'-'", "'+'", "'%'", "'='", "'#'", "'[]'", "'['", 
			"']'", "'()'", "'('", "')'", "'{}'", "'{'", "'}'", "'<>'", "'<'", "'>'", 
			"'|'", "','", "'::'", "':'", "'..'", "'...'", "'enum'", "'string'", "'boolean'", 
			"'byte'", "'short'", "'int'", "'float'", "'double'", "'long'", "'any'", 
			null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "As", "Dot", "Minus", "Plus", "Remainder", "Equal", 
			"Sharp", "SquareBrackets", "LeftSquareBracket", "RightSquareBracket", 
			"RoundBrackets", "LeftRoundBracket", "RightRoundBracket", "CurlyBrackets", 
			"LeftCurlyBracket", "RightCurlyBracket", "AngleBrackets", "LeftAngleBracket", 
			"RightAngleBracket", "LogicalOR", "Comma", "DoubleColon", "ColonMark", 
			"DoubleDot", "TripleDot", "EnumKeyType", "StringKeyType", "BooleanKeyType", 
			"ByteKeyType", "ShortKeyType", "IntKeyType", "FloatKeyType", "DoubleKeyType", 
			"LongKeyType", "Any", "BoolValue", "DocCommentary", "Commentary", "DoubleQuotes", 
			"TypedNumberLexer", "Integer", "FloatExponent", "Float", "Number", "PositiveInteger", 
			"IntTypedUnit", "FloatTypedUnit", "IdentStart", "IdentContinue", "Identifier", 
			"SingleStringValue", "String", "IntegerRange", "FloatRange", "ResourceLocationChar", 
			"ResourceLocation", "PathSegment", "Path"
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
			setState(144);
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
	public static class PathContext extends ParserRuleContext {
		public TerminalNode Path() { return getToken(mcdocParserParser.Path, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
	public static class ResourceLocationContext extends ParserRuleContext {
		public TerminalNode ResourceLocation() { return getToken(mcdocParserParser.ResourceLocation, 0); }
		public ResourceLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterResourceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitResourceLocation(this);
		}
	}

	public final ResourceLocationContext resourceLocation() throws RecognitionException {
		ResourceLocationContext _localctx = new ResourceLocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_resourceLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ResourceLocation);
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
	public static class AtContext extends ParserRuleContext {
		public AtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitAt(this);
		}
	}

	public final AtContext at() throws RecognitionException {
		AtContext _localctx = new AtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__0);
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
	public static class DotContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(mcdocParserParser.Dot, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Dot);
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
		enterRule(_localctx, 10, RULE_baseDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 560750930165760L) != 0)) ) {
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
		public TerminalNode Any() { return getToken(mcdocParserParser.Any, 0); }
		public TerminalNode BoolValue() { return getToken(mcdocParserParser.BoolValue, 0); }
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
		enterRule(_localctx, 12, RULE_keywordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==Any || _la==BoolValue) ) {
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
		enterRule(_localctx, 14, RULE_questionMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__1);
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
	public static class StructKeyTypeContext extends ParserRuleContext {
		public StructKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structKeyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructKeyType(this);
		}
	}

	public final StructKeyTypeContext structKeyType() throws RecognitionException {
		StructKeyTypeContext _localctx = new StructKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structKeyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__2);
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
	public static class InjectContext extends ParserRuleContext {
		public InjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterInject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitInject(this);
		}
	}

	public final InjectContext inject() throws RecognitionException {
		InjectContext _localctx = new InjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode EnumKeyType() { return getToken(mcdocParserParser.EnumKeyType, 0); }
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
		enterRule(_localctx, 20, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(EnumKeyType);
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
	public static class UseContext extends ParserRuleContext {
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__4);
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
	public static class DispatchContext extends ParserRuleContext {
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDispatch(this);
		}
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__5);
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
	public static class TypeKeyTypeContext extends ParserRuleContext {
		public TypeKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeKeyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeKeyType(this);
		}
	}

	public final TypeKeyTypeContext typeKeyType() throws RecognitionException {
		TypeKeyTypeContext _localctx = new TypeKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeKeyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
	public static class DoubleDotContext extends ParserRuleContext {
		public TerminalNode DoubleDot() { return getToken(mcdocParserParser.DoubleDot, 0); }
		public DoubleDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDoubleDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDoubleDot(this);
		}
	}

	public final DoubleDotContext doubleDot() throws RecognitionException {
		DoubleDotContext _localctx = new DoubleDotContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_doubleDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DoubleDot);
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
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 32, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
	public static class IntegerRangeContext extends ParserRuleContext {
		public TerminalNode IntegerRange() { return getToken(mcdocParserParser.IntegerRange, 0); }
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
		enterRule(_localctx, 34, RULE_integerRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IntegerRange);
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
		enterRule(_localctx, 36, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 38, RULE_commentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
	public static class DocCommentaryContext extends ParserRuleContext {
		public TerminalNode DocCommentary() { return getToken(mcdocParserParser.DocCommentary, 0); }
		public DocCommentaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docCommentary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDocCommentary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDocCommentary(this);
		}
	}

	public final DocCommentaryContext docCommentary() throws RecognitionException {
		DocCommentaryContext _localctx = new DocCommentaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_docCommentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(DocCommentary);
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
	public static class TypedNumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode IntTypedUnit() { return getToken(mcdocParserParser.IntTypedUnit, 0); }
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public TerminalNode FloatTypedUnit() { return getToken(mcdocParserParser.FloatTypedUnit, 0); }
		public TypedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypedNumber(this);
		}
	}

	public final TypedNumberContext typedNumber() throws RecognitionException {
		TypedNumberContext _localctx = new TypedNumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typedNumber);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(186);
				integer();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntTypedUnit) {
					{
					setState(187);
					match(IntTypedUnit);
					}
				}

				}
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(190);
				float_();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FloatTypedUnit) {
					{
					setState(191);
					match(FloatTypedUnit);
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
	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode StringKeyType() { return getToken(mcdocParserParser.StringKeyType, 0); }
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
		public TerminalNode IntegerRange() { return getToken(mcdocParserParser.IntegerRange, 0); }
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
		enterRule(_localctx, 44, RULE_stringType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(StringKeyType);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(197);
				at();
				setState(198);
				match(IntegerRange);
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
	public static class LiteralTypeContext extends ParserRuleContext {
		public TerminalNode BoolValue() { return getToken(mcdocParserParser.BoolValue, 0); }
		public TerminalNode TypedNumberLexer() { return getToken(mcdocParserParser.TypedNumberLexer, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
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
		enterRule(_localctx, 46, RULE_literalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 81937L) != 0)) ) {
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
		public BaseDataTypeContext baseDataType() {
			return getRuleContext(BaseDataTypeContext.class,0);
		}
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_numericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			baseDataType();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(205);
				at();
				setState(206);
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
	public static class PrimitiveArrayTypeContext extends ParserRuleContext {
		public TerminalNode SquareBrackets() { return getToken(mcdocParserParser.SquareBrackets, 0); }
		public TerminalNode ByteKeyType() { return getToken(mcdocParserParser.ByteKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParserParser.LongKeyType, 0); }
		public List<AtContext> at() {
			return getRuleContexts(AtContext.class);
		}
		public AtContext at(int i) {
			return getRuleContext(AtContext.class,i);
		}
		public List<IntegerRangeContext> integerRange() {
			return getRuleContexts(IntegerRangeContext.class);
		}
		public IntegerRangeContext integerRange(int i) {
			return getRuleContext(IntegerRangeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(mcdocParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(mcdocParserParser.WS, i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 50, RULE_primitiveArrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 325455441821696L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(211);
				at();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(212);
					match(WS);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				integerRange();
				}
			}

			setState(222);
			match(SquareBrackets);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(223);
				match(WS);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(229);
				at();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(230);
					match(WS);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(236);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(237);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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
	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
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
		enterRule(_localctx, 52, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LeftSquareBracket);
			setState(243);
			type();
			setState(244);
			match(RightSquareBracket);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(245);
				at();
				setState(246);
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
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
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
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
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
		enterRule(_localctx, 54, RULE_tupleType);
		int _la;
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(250);
				match(LeftSquareBracket);
				setState(251);
				type();
				setState(252);
				match(Comma);
				setState(253);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(255);
				match(LeftSquareBracket);
				setState(256);
				type();
				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(257);
						match(Comma);
						setState(258);
						type();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(263);
					match(Comma);
					}
				}

				setState(266);
				match(RightSquareBracket);
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
	public static class EnumMemberTypeContext extends ParserRuleContext {
		public TerminalNode ByteKeyType() { return getToken(mcdocParserParser.ByteKeyType, 0); }
		public TerminalNode ShortKeyType() { return getToken(mcdocParserParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParserParser.IntKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParserParser.LongKeyType, 0); }
		public TerminalNode StringKeyType() { return getToken(mcdocParserParser.StringKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParserParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParserParser.DoubleKeyType, 0); }
		public EnumMemberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMemberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnumMemberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnumMemberType(this);
		}
	}

	public final EnumMemberTypeContext enumMemberType() throws RecognitionException {
		EnumMemberTypeContext _localctx = new EnumMemberTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumMemberType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 556352883654656L) != 0)) ) {
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
		public TypedNumberContext typedNumber() {
			return getRuleContext(TypedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_enumValue);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				typedNumber();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				string();
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
	public static class EnumFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Equal() { return getToken(mcdocParserParser.Equal, 0); }
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
		}
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
		enterRule(_localctx, 60, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(276);
				prelim();
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(279);
				attribute();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			identifier();
			setState(286);
			match(Equal);
			setState(287);
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
		public TerminalNode CurlyBrackets() { return getToken(mcdocParserParser.CurlyBrackets, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(mcdocParserParser.LeftCurlyBracket, 0); }
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public TerminalNode RightCurlyBracket() { return getToken(mcdocParserParser.RightCurlyBracket, 0); }
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
		enterRule(_localctx, 62, RULE_enumBlock);
		int _la;
		try {
			int _alt;
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(290);
				match(LeftCurlyBracket);
				setState(291);
				enumField();
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						match(Comma);
						setState(293);
						enumField();
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(299);
					match(Comma);
					}
				}

				setState(302);
				match(RightCurlyBracket);
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
	public static class EnumTypeContext extends ParserRuleContext {
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParserParser.LeftRoundBracket, 0); }
		public EnumMemberTypeContext enumMemberType() {
			return getRuleContext(EnumMemberTypeContext.class,0);
		}
		public TerminalNode RightRoundBracket() { return getToken(mcdocParserParser.RightRoundBracket, 0); }
		public EnumBlockContext enumBlock() {
			return getRuleContext(EnumBlockContext.class,0);
		}
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(306);
				prelim();
				}
			}

			setState(309);
			enum_();
			setState(310);
			match(LeftRoundBracket);
			setState(311);
			enumMemberType();
			setState(312);
			match(RightRoundBracket);
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
	public static class PrelimContext extends ParserRuleContext {
		public DocCommentaryContext docCommentary() {
			return getRuleContext(DocCommentaryContext.class,0);
		}
		public CommentaryContext commentary() {
			return getRuleContext(CommentaryContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
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
		enterRule(_localctx, 66, RULE_prelim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DocCommentary:
				{
				setState(318);
				docCommentary();
				}
				break;
			case Commentary:
				{
				setState(319);
				commentary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(322);
				attribute();
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
		enterRule(_localctx, 68, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		public ResourceLocationContext resourceLocation() {
			return getRuleContext(ResourceLocationContext.class,0);
		}
		public IndexBodyWithDynamicContext indexBodyWithDynamic() {
			return getRuleContext(IndexBodyWithDynamicContext.class,0);
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
		enterRule(_localctx, 70, RULE_dispatcherType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			resourceLocation();
			setState(328);
			indexBodyWithDynamic();
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
		public TerminalNode RoundBrackets() { return getToken(mcdocParserParser.RoundBrackets, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParserParser.LeftRoundBracket, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RightRoundBracket() { return getToken(mcdocParserParser.RightRoundBracket, 0); }
		public List<LogicalORContext> logicalOR() {
			return getRuleContexts(LogicalORContext.class);
		}
		public LogicalORContext logicalOR(int i) {
			return getRuleContext(LogicalORContext.class,i);
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
		enterRule(_localctx, 72, RULE_unionType);
		int _la;
		try {
			int _alt;
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RoundBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(RoundBrackets);
				}
				break;
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(331);
				match(LeftRoundBracket);
				setState(332);
				type();
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(333);
						logicalOR();
						setState(334);
						type();
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LogicalOR) {
					{
					setState(341);
					logicalOR();
					}
				}

				setState(344);
				match(RightRoundBracket);
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
	public static class StaticIndexKeyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public TerminalNode ResourceLocation() { return getToken(mcdocParserParser.ResourceLocation, 0); }
		public StaticIndexKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticIndexKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStaticIndexKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStaticIndexKey(this);
		}
	}

	public final StaticIndexKeyContext staticIndexKey() throws RecognitionException {
		StaticIndexKeyContext _localctx = new StaticIndexKeyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_staticIndexKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 4971973988617027591L) != 0)) ) {
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
	public static class AccessorContext extends ParserRuleContext {
		public List<AccessorKeyContext> accessorKey() {
			return getRuleContexts(AccessorKeyContext.class);
		}
		public AccessorKeyContext accessorKey(int i) {
			return getRuleContext(AccessorKeyContext.class,i);
		}
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitAccessor(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_accessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			accessorKey();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 45035996273704963L) != 0)) {
				{
				{
				setState(351);
				accessorKey();
				}
				}
				setState(356);
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
	public static class AccessorKeyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public AccessorKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessorKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterAccessorKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitAccessorKey(this);
		}
	}

	public final AccessorKeyContext accessorKey() throws RecognitionException {
		AccessorKeyContext _localctx = new AccessorKeyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessorKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 45035996273704963L) != 0)) ) {
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
	public static class DynamicIndexContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public DynamicIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDynamicIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDynamicIndex(this);
		}
	}

	public final DynamicIndexContext dynamicIndex() throws RecognitionException {
		DynamicIndexContext _localctx = new DynamicIndexContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dynamicIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LeftSquareBracket);
			setState(360);
			accessor();
			setState(361);
			match(RightSquareBracket);
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
	public static class IndexWithOutDynamicContext extends ParserRuleContext {
		public StaticIndexKeyContext staticIndexKey() {
			return getRuleContext(StaticIndexKeyContext.class,0);
		}
		public IndexWithOutDynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithOutDynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexWithOutDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexWithOutDynamic(this);
		}
	}

	public final IndexWithOutDynamicContext indexWithOutDynamic() throws RecognitionException {
		IndexWithOutDynamicContext _localctx = new IndexWithOutDynamicContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexWithOutDynamic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			staticIndexKey();
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
	public static class IndexWithDynamicContext extends ParserRuleContext {
		public StaticIndexKeyContext staticIndexKey() {
			return getRuleContext(StaticIndexKeyContext.class,0);
		}
		public DynamicIndexContext dynamicIndex() {
			return getRuleContext(DynamicIndexContext.class,0);
		}
		public IndexWithDynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithDynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexWithDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexWithDynamic(this);
		}
	}

	public final IndexWithDynamicContext indexWithDynamic() throws RecognitionException {
		IndexWithDynamicContext _localctx = new IndexWithDynamicContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexWithDynamic);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case Identifier:
			case String:
			case ResourceLocation:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				staticIndexKey();
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				dynamicIndex();
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
	public static class IndexBodyWithOutDynamicContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public List<IndexWithOutDynamicContext> indexWithOutDynamic() {
			return getRuleContexts(IndexWithOutDynamicContext.class);
		}
		public IndexWithOutDynamicContext indexWithOutDynamic(int i) {
			return getRuleContext(IndexWithOutDynamicContext.class,i);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public IndexBodyWithOutDynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexBodyWithOutDynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexBodyWithOutDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexBodyWithOutDynamic(this);
		}
	}

	public final IndexBodyWithOutDynamicContext indexBodyWithOutDynamic() throws RecognitionException {
		IndexBodyWithOutDynamicContext _localctx = new IndexBodyWithOutDynamicContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_indexBodyWithOutDynamic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LeftSquareBracket);
			setState(370);
			indexWithOutDynamic();
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					match(Comma);
					setState(372);
					indexWithOutDynamic();
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(378);
				match(Comma);
				}
			}

			setState(381);
			match(RightSquareBracket);
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
	public static class IndexBodyWithDynamicContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public List<IndexWithDynamicContext> indexWithDynamic() {
			return getRuleContexts(IndexWithDynamicContext.class);
		}
		public IndexWithDynamicContext indexWithDynamic(int i) {
			return getRuleContext(IndexWithDynamicContext.class,i);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public IndexBodyWithDynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexBodyWithDynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexBodyWithDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexBodyWithDynamic(this);
		}
	}

	public final IndexBodyWithDynamicContext indexBodyWithDynamic() throws RecognitionException {
		IndexBodyWithDynamicContext _localctx = new IndexBodyWithDynamicContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indexBodyWithDynamic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LeftSquareBracket);
			setState(384);
			indexWithDynamic();
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					match(Comma);
					setState(386);
					indexWithDynamic();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(392);
				match(Comma);
				}
			}

			setState(395);
			match(RightSquareBracket);
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
	public static class IndexingOnATypeContext extends ParserRuleContext {
		public IndexBodyWithDynamicContext indexBodyWithDynamic() {
			return getRuleContext(IndexBodyWithDynamicContext.class,0);
		}
		public IndexingOnATypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingOnAType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterIndexingOnAType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitIndexingOnAType(this);
		}
	}

	public final IndexingOnATypeContext indexingOnAType() throws RecognitionException {
		IndexingOnATypeContext _localctx = new IndexingOnATypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indexingOnAType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			indexBodyWithDynamic();
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
		public TerminalNode AngleBrackets() { return getToken(mcdocParserParser.AngleBrackets, 0); }
		public TerminalNode LeftAngleBracket() { return getToken(mcdocParserParser.LeftAngleBracket, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RightAngleBracket() { return getToken(mcdocParserParser.RightAngleBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
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
		enterRule(_localctx, 92, RULE_typeArgBlock);
		int _la;
		try {
			int _alt;
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(400);
				match(LeftAngleBracket);
				setState(401);
				type();
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						match(Comma);
						setState(403);
						type();
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(409);
					match(Comma);
					}
				}

				setState(412);
				match(RightAngleBracket);
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
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
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
		public IndexingOnATypeContext indexingOnAType() {
			return getRuleContext(IndexingOnATypeContext.class,0);
		}
		public TerminalNode Comma() { return getToken(mcdocParserParser.Comma, 0); }
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
		enterRule(_localctx, 94, RULE_unAttributedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(416);
				keywordType();
				}
				break;
			case 2:
				{
				setState(417);
				stringType();
				}
				break;
			case 3:
				{
				setState(418);
				literalType();
				}
				break;
			case 4:
				{
				setState(419);
				numericType();
				}
				break;
			case 5:
				{
				setState(420);
				primitiveArrayType();
				}
				break;
			case 6:
				{
				setState(421);
				listType();
				}
				break;
			case 7:
				{
				setState(422);
				tupleType();
				}
				break;
			case 8:
				{
				setState(423);
				enumType();
				}
				break;
			case 9:
				{
				setState(424);
				struct();
				}
				break;
			case 10:
				{
				setState(425);
				referenceType();
				}
				break;
			case 11:
				{
				setState(426);
				dispatcherType();
				}
				break;
			case 12:
				{
				setState(427);
				unionType();
				}
				break;
			case 13:
				{
				setState(428);
				indexingOnAType();
				}
				break;
			}
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(431);
				match(Comma);
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
	public static class TypeContext extends ParserRuleContext {
		public UnAttributedTypeContext unAttributedType() {
			return getRuleContext(UnAttributedTypeContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<IndexBodyWithDynamicContext> indexBodyWithDynamic() {
			return getRuleContexts(IndexBodyWithDynamicContext.class);
		}
		public IndexBodyWithDynamicContext indexBodyWithDynamic(int i) {
			return getRuleContext(IndexBodyWithDynamicContext.class,i);
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
		enterRule(_localctx, 96, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(434);
				attribute();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			unAttributedType();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6450839552L) != 0)) {
				{
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftSquareBracket:
					{
					setState(441);
					indexBodyWithDynamic();
					}
					break;
				case AngleBrackets:
				case LeftAngleBracket:
					{
					setState(442);
					typeArgBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(447);
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
	public static class AttributeSetContext extends ParserRuleContext {
		public List<CommentaryContext> commentary() {
			return getRuleContexts(CommentaryContext.class);
		}
		public CommentaryContext commentary(int i) {
			return getRuleContext(CommentaryContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterAttributeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitAttributeSet(this);
		}
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_attributeSet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					commentary();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(454);
				attribute();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(460);
					commentary();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(466);
				identifier();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Commentary) {
				{
				{
				setState(472);
				commentary();
				}
				}
				setState(477);
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
	public static class ArrayLengthContext extends ParserRuleContext {
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
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
		enterRule(_localctx, 100, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			at();
			setState(479);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
	public static class PositionalValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public PositionalValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterPositionalValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitPositionalValues(this);
		}
	}

	public final PositionalValuesContext positionalValues() throws RecognitionException {
		PositionalValuesContext _localctx = new PositionalValuesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_positionalValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			value();
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					match(Comma);
					setState(485);
					value();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
	public static class NamedValueContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(mcdocParserParser.Equal, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TreeValueContext treeValue() {
			return getRuleContext(TreeValueContext.class,0);
		}
		public NamedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterNamedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitNamedValue(this);
		}
	}

	public final NamedValueContext namedValue() throws RecognitionException {
		NamedValueContext _localctx = new NamedValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_namedValue);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(493);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(491);
					identifier();
					}
					break;
				case String:
					{
					setState(492);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(495);
				match(Equal);
				setState(496);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(498);
					identifier();
					}
					break;
				case String:
					{
					setState(499);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(502);
				treeValue();
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
	public static class NamedValuesContext extends ParserRuleContext {
		public List<NamedValueContext> namedValue() {
			return getRuleContexts(NamedValueContext.class);
		}
		public NamedValueContext namedValue(int i) {
			return getRuleContext(NamedValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public NamedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterNamedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitNamedValues(this);
		}
	}

	public final NamedValuesContext namedValues() throws RecognitionException {
		NamedValuesContext _localctx = new NamedValuesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_namedValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			namedValue();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					match(Comma);
					setState(508);
					namedValue();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
	public static class TreeBodyContext extends ParserRuleContext {
		public PositionalValuesContext positionalValues() {
			return getRuleContext(PositionalValuesContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public NamedValuesContext namedValues() {
			return getRuleContext(NamedValuesContext.class,0);
		}
		public TreeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTreeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTreeBody(this);
		}
	}

	public final TreeBodyContext treeBody() throws RecognitionException {
		TreeBodyContext _localctx = new TreeBodyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_treeBody);
		int _la;
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(514);
				positionalValues();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(515);
					match(Comma);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				namedValues();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(519);
					match(Comma);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				positionalValues();
				setState(523);
				match(Comma);
				setState(524);
				namedValues();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(525);
					match(Comma);
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
	public static class TreeValueContext extends ParserRuleContext {
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParserParser.LeftRoundBracket, 0); }
		public TerminalNode RightRoundBracket() { return getToken(mcdocParserParser.RightRoundBracket, 0); }
		public TreeBodyContext treeBody() {
			return getRuleContext(TreeBodyContext.class,0);
		}
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(mcdocParserParser.LeftCurlyBracket, 0); }
		public TerminalNode RightCurlyBracket() { return getToken(mcdocParserParser.RightCurlyBracket, 0); }
		public TreeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTreeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTreeValue(this);
		}
	}

	public final TreeValueContext treeValue() throws RecognitionException {
		TreeValueContext _localctx = new TreeValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_treeValue);
		int _la;
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(530);
				match(LeftRoundBracket);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27020498900615176L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 325L) != 0)) {
					{
					setState(531);
					treeBody();
					}
				}

				setState(534);
				match(RightRoundBracket);
				}
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(535);
				match(LeftSquareBracket);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27020498900615176L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 325L) != 0)) {
					{
					setState(536);
					treeBody();
					}
				}

				setState(539);
				match(RightSquareBracket);
				}
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(540);
				match(LeftCurlyBracket);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27020498900615176L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 325L) != 0)) {
					{
					setState(541);
					treeBody();
					}
				}

				setState(544);
				match(RightCurlyBracket);
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
	public static class ValueContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TreeValueContext treeValue() {
			return getRuleContext(TreeValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_value);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				treeValue();
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Sharp() { return getToken(mcdocParserParser.Sharp, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public TerminalNode Equal() { return getToken(mcdocParserParser.Equal, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TreeValueContext treeValue() {
			return getRuleContext(TreeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_attribute);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(551);
				match(Sharp);
				setState(552);
				match(LeftSquareBracket);
				setState(553);
				identifier();
				setState(554);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(556);
				match(Sharp);
				setState(557);
				match(LeftSquareBracket);
				setState(558);
				identifier();
				setState(559);
				match(Equal);
				setState(560);
				value();
				setState(561);
				match(RightSquareBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(563);
				match(Sharp);
				setState(564);
				match(LeftSquareBracket);
				setState(565);
				identifier();
				setState(566);
				treeValue();
				setState(567);
				match(RightSquareBracket);
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
	public static class DispatchStatementContext extends ParserRuleContext {
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public ResourceLocationContext resourceLocation() {
			return getRuleContext(ResourceLocationContext.class,0);
		}
		public IndexBodyWithOutDynamicContext indexBodyWithOutDynamic() {
			return getRuleContext(IndexBodyWithOutDynamicContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public TypeParamBlockContext typeParamBlock() {
			return getRuleContext(TypeParamBlockContext.class,0);
		}
		public DispatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterDispatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitDispatchStatement(this);
		}
	}

	public final DispatchStatementContext dispatchStatement() throws RecognitionException {
		DispatchStatementContext _localctx = new DispatchStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dispatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(571);
				prelim();
				}
			}

			setState(574);
			dispatch();
			setState(575);
			resourceLocation();
			setState(576);
			indexBodyWithOutDynamic();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(577);
				typeParamBlock();
				}
			}

			setState(580);
			match(T__12);
			setState(581);
			type();
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
	public static class StructInjectionContext extends ParserRuleContext {
		public StructKeyTypeContext structKeyType() {
			return getRuleContext(StructKeyTypeContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StructBlockContext structBlock() {
			return getRuleContext(StructBlockContext.class,0);
		}
		public StructInjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructInjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructInjection(this);
		}
	}

	public final StructInjectionContext structInjection() throws RecognitionException {
		StructInjectionContext _localctx = new StructInjectionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_structInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			structKeyType();
			setState(584);
			path();
			setState(585);
			structBlock();
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
	public static class EnumInjectionContext extends ParserRuleContext {
		public TerminalNode EnumKeyType() { return getToken(mcdocParserParser.EnumKeyType, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParserParser.LeftRoundBracket, 0); }
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public TerminalNode RightRoundBracket() { return getToken(mcdocParserParser.RightRoundBracket, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public EnumBlockContext enumBlock() {
			return getRuleContext(EnumBlockContext.class,0);
		}
		public EnumInjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumInjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterEnumInjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitEnumInjection(this);
		}
	}

	public final EnumInjectionContext enumInjection() throws RecognitionException {
		EnumInjectionContext _localctx = new EnumInjectionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_enumInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(EnumKeyType);
			setState(588);
			match(LeftRoundBracket);
			setState(589);
			enumType();
			setState(590);
			match(RightRoundBracket);
			setState(591);
			path();
			setState(592);
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
	public static class InjectionContext extends ParserRuleContext {
		public InjectContext inject() {
			return getRuleContext(InjectContext.class,0);
		}
		public EnumInjectionContext enumInjection() {
			return getRuleContext(EnumInjectionContext.class,0);
		}
		public StructInjectionContext structInjection() {
			return getRuleContext(StructInjectionContext.class,0);
		}
		public InjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterInjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitInjection(this);
		}
	}

	public final InjectionContext injection() throws RecognitionException {
		InjectionContext _localctx = new InjectionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_injection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			inject();
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EnumKeyType:
				{
				setState(595);
				enumInjection();
				}
				break;
			case T__2:
				{
				setState(596);
				structInjection();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class UseStatementContext extends ParserRuleContext {
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode As() { return getToken(mcdocParserParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterUseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitUseStatement(this);
		}
	}

	public final UseStatementContext useStatement() throws RecognitionException {
		UseStatementContext _localctx = new UseStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_useStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			use();
			setState(600);
			path();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(601);
				match(As);
				setState(602);
				identifier();
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
	public static class TypeParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeParam(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
	public static class TypeParamBlockContext extends ParserRuleContext {
		public TerminalNode AngleBrackets() { return getToken(mcdocParserParser.AngleBrackets, 0); }
		public TerminalNode LeftAngleBracket() { return getToken(mcdocParserParser.LeftAngleBracket, 0); }
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public TerminalNode RightAngleBracket() { return getToken(mcdocParserParser.RightAngleBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public TypeParamBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeParamBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeParamBlock(this);
		}
	}

	public final TypeParamBlockContext typeParamBlock() throws RecognitionException {
		TypeParamBlockContext _localctx = new TypeParamBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeParamBlock);
		int _la;
		try {
			int _alt;
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(608);
				match(LeftAngleBracket);
				setState(609);
				typeParam();
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						match(Comma);
						setState(611);
						typeParam();
						}
						} 
					}
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(617);
					match(Comma);
					}
				}

				setState(620);
				match(RightAngleBracket);
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
	public static class TypeAliasContext extends ParserRuleContext {
		public TypeKeyTypeContext typeKeyType() {
			return getRuleContext(TypeKeyTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Equal() { return getToken(mcdocParserParser.Equal, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public TypeParamBlockContext typeParamBlock() {
			return getRuleContext(TypeParamBlockContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeAlias(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(624);
				prelim();
				}
			}

			setState(627);
			typeKeyType();
			setState(628);
			identifier();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(629);
				typeParamBlock();
				}
			}

			setState(632);
			match(Equal);
			setState(633);
			type();
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
	public static class StructKeyContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public StructKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructKey(this);
		}
	}

	public final StructKeyContext structKey() throws RecognitionException {
		StructKeyContext _localctx = new StructKeyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_structKey);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(String);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(Identifier);
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(637);
				match(LeftSquareBracket);
				setState(638);
				type();
				setState(639);
				match(RightSquareBracket);
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
	public static class StructFieldContext extends ParserRuleContext {
		public StructKeyContext structKey() {
			return getRuleContext(StructKeyContext.class,0);
		}
		public TerminalNode ColonMark() { return getToken(mcdocParserParser.ColonMark, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<PrelimContext> prelim() {
			return getRuleContexts(PrelimContext.class);
		}
		public PrelimContext prelim(int i) {
			return getRuleContext(PrelimContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public QuestionMarkContext questionMark() {
			return getRuleContext(QuestionMarkContext.class,0);
		}
		public TerminalNode TripleDot() { return getToken(mcdocParserParser.TripleDot, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructField(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_structField);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DocCommentary || _la==Commentary) {
					{
					{
					setState(643);
					prelim();
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Sharp) {
					{
					{
					setState(649);
					attribute();
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(655);
				structKey();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(656);
					questionMark();
					}
				}

				setState(659);
				match(ColonMark);
				setState(660);
				type();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(662);
					attribute();
					}
					break;
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TripleDot) {
					{
					setState(665);
					match(TripleDot);
					}
				}

				setState(668);
				type();
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
	public static class StructBlockContext extends ParserRuleContext {
		public TerminalNode CurlyBrackets() { return getToken(mcdocParserParser.CurlyBrackets, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(mcdocParserParser.LeftCurlyBracket, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public TerminalNode RightCurlyBracket() { return getToken(mcdocParserParser.RightCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParserParser.Comma, i);
		}
		public StructBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStructBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStructBlock(this);
		}
	}

	public final StructBlockContext structBlock() throws RecognitionException {
		StructBlockContext _localctx = new StructBlockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_structBlock);
		int _la;
		try {
			int _alt;
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(672);
				match(LeftCurlyBracket);
				setState(673);
				structField();
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(674);
						match(Comma);
						setState(675);
						structField();
						}
						} 
					}
					setState(680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(681);
					match(Comma);
					}
				}

				setState(684);
				match(RightCurlyBracket);
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
	public static class StructContext extends ParserRuleContext {
		public StructKeyTypeContext structKeyType() {
			return getRuleContext(StructKeyTypeContext.class,0);
		}
		public StructBlockContext structBlock() {
			return getRuleContext(StructBlockContext.class,0);
		}
		public PrelimContext prelim() {
			return getRuleContext(PrelimContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(688);
				prelim();
				}
			}

			setState(691);
			structKeyType();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(692);
				identifier();
				}
			}

			setState(695);
			structBlock();
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
	public static class FileContext extends ParserRuleContext {
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<EnumTypeContext> enumType() {
			return getRuleContexts(EnumTypeContext.class);
		}
		public EnumTypeContext enumType(int i) {
			return getRuleContext(EnumTypeContext.class,i);
		}
		public List<TypeAliasContext> typeAlias() {
			return getRuleContexts(TypeAliasContext.class);
		}
		public TypeAliasContext typeAlias(int i) {
			return getRuleContext(TypeAliasContext.class,i);
		}
		public List<UseStatementContext> useStatement() {
			return getRuleContexts(UseStatementContext.class);
		}
		public UseStatementContext useStatement(int i) {
			return getRuleContext(UseStatementContext.class,i);
		}
		public List<InjectionContext> injection() {
			return getRuleContexts(InjectionContext.class);
		}
		public InjectionContext injection(int i) {
			return getRuleContext(InjectionContext.class,i);
		}
		public List<DispatchStatementContext> dispatchStatement() {
			return getRuleContexts(DispatchStatementContext.class);
		}
		public DispatchStatementContext dispatchStatement(int i) {
			return getRuleContext(DispatchStatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6756498952683768L) != 0)) {
				{
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(697);
					struct();
					}
					break;
				case 2:
					{
					setState(698);
					enumType();
					}
					break;
				case 3:
					{
					setState(699);
					typeAlias();
					}
					break;
				case 4:
					{
					setState(700);
					useStatement();
					}
					break;
				case 5:
					{
					setState(701);
					injection();
					}
					break;
				case 6:
					{
					setState(702);
					dispatchStatement();
					}
					break;
				}
				}
				setState(707);
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

	public static final String _serializedATN =
		"\u0004\u0001H\u02c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00bd\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00c1"+
		"\b\u0015\u0003\u0015\u00c3\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00c9\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00d1\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u00d6\b\u0019\n\u0019\f\u0019\u00d9"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00dd\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u00e1\b\u0019\n\u0019\f\u0019\u00e4\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00e8\b\u0019\n\u0019\f\u0019\u00eb\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00ef\b\u0019\u0003\u0019\u00f1\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00f9\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u0104\b\u001b\u000b\u001b\f\u001b\u0105\u0001\u001b\u0003\u001b"+
		"\u0109\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u010d\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0113\b\u001d\u0001"+
		"\u001e\u0003\u001e\u0116\b\u001e\u0001\u001e\u0005\u001e\u0119\b\u001e"+
		"\n\u001e\f\u001e\u011c\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0127\b\u001f\n\u001f\f\u001f\u012a\t\u001f\u0001\u001f\u0003\u001f"+
		"\u012d\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0131\b\u001f\u0001"+
		" \u0003 \u0134\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u013b\b \u0001"+
		" \u0001 \u0001!\u0001!\u0003!\u0141\b!\u0001!\u0003!\u0144\b!\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u0151\b$\n$\f$\u0154\t$\u0001$\u0003$\u0157\b$\u0001$\u0001$"+
		"\u0003$\u015b\b$\u0001%\u0001%\u0001&\u0001&\u0005&\u0161\b&\n&\f&\u0164"+
		"\t&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0003*\u0170\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u0176\b+\n+\f+\u0179"+
		"\t+\u0001+\u0003+\u017c\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0184\b,\n,\f,\u0187\t,\u0001,\u0003,\u018a\b,\u0001,\u0001,\u0001-"+
		"\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u0195\b.\n.\f.\u0198"+
		"\t.\u0001.\u0003.\u019b\b.\u0001.\u0001.\u0003.\u019f\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u01ae\b/\u0001/\u0003/\u01b1\b/\u00010\u00050\u01b4\b"+
		"0\n0\f0\u01b7\t0\u00010\u00010\u00010\u00050\u01bc\b0\n0\f0\u01bf\t0\u0001"+
		"1\u00051\u01c2\b1\n1\f1\u01c5\t1\u00011\u00051\u01c8\b1\n1\f1\u01cb\t"+
		"1\u00011\u00051\u01ce\b1\n1\f1\u01d1\t1\u00011\u00051\u01d4\b1\n1\f1\u01d7"+
		"\t1\u00011\u00051\u01da\b1\n1\f1\u01dd\t1\u00012\u00012\u00012\u00013"+
		"\u00013\u00014\u00014\u00014\u00054\u01e7\b4\n4\f4\u01ea\t4\u00015\u0001"+
		"5\u00035\u01ee\b5\u00015\u00015\u00015\u00015\u00015\u00035\u01f5\b5\u0001"+
		"5\u00015\u00035\u01f9\b5\u00016\u00016\u00016\u00056\u01fe\b6\n6\f6\u0201"+
		"\t6\u00017\u00017\u00037\u0205\b7\u00017\u00017\u00037\u0209\b7\u0001"+
		"7\u00017\u00017\u00017\u00037\u020f\b7\u00037\u0211\b7\u00018\u00018\u0003"+
		"8\u0215\b8\u00018\u00018\u00018\u00038\u021a\b8\u00018\u00018\u00018\u0003"+
		"8\u021f\b8\u00018\u00038\u0222\b8\u00019\u00019\u00039\u0226\b9\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u023a\b:\u0001"+
		";\u0003;\u023d\b;\u0001;\u0001;\u0001;\u0001;\u0003;\u0243\b;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0003>\u0256\b>\u0001?\u0001?\u0001"+
		"?\u0001?\u0003?\u025c\b?\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0005A\u0265\bA\nA\fA\u0268\tA\u0001A\u0003A\u026b\bA\u0001A\u0001A"+
		"\u0003A\u026f\bA\u0001B\u0003B\u0272\bB\u0001B\u0001B\u0001B\u0003B\u0277"+
		"\bB\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u0282\bC\u0001D\u0005D\u0285\bD\nD\fD\u0288\tD\u0001D\u0005D\u028b\b"+
		"D\nD\fD\u028e\tD\u0001D\u0001D\u0003D\u0292\bD\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0298\bD\u0001D\u0003D\u029b\bD\u0001D\u0003D\u029e\bD\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0005E\u02a5\bE\nE\fE\u02a8\tE\u0001E\u0003"+
		"E\u02ab\bE\u0001E\u0001E\u0003E\u02af\bE\u0001F\u0003F\u02b2\bF\u0001"+
		"F\u0001F\u0003F\u02b6\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0005G\u02c0\bG\nG\fG\u02c3\tG\u0001G\u0000\u0000H\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0000\u0007\u0001\u0000)0\u0001\u000012\u0004"+
		"\u00002266@@BB\u0003\u0000++--00\u0002\u0000))+0\u0004\u0000\b\n@@BBF"+
		"F\u0003\u0000\u000b\f@@BB\u02e4\u0000\u0090\u0001\u0000\u0000\u0000\u0002"+
		"\u0092\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000\u0006"+
		"\u0096\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000\u0000\u0000\n\u009a"+
		"\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000\u0000\u000e\u009e\u0001"+
		"\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000\u0000\u0012\u00a2\u0001"+
		"\u0000\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00a6\u0001"+
		"\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00aa\u0001"+
		"\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00ae\u0001"+
		"\u0000\u0000\u0000 \u00b0\u0001\u0000\u0000\u0000\"\u00b2\u0001\u0000"+
		"\u0000\u0000$\u00b4\u0001\u0000\u0000\u0000&\u00b6\u0001\u0000\u0000\u0000"+
		"(\u00b8\u0001\u0000\u0000\u0000*\u00c2\u0001\u0000\u0000\u0000,\u00c4"+
		"\u0001\u0000\u0000\u0000.\u00ca\u0001\u0000\u0000\u00000\u00cc\u0001\u0000"+
		"\u0000\u00002\u00d2\u0001\u0000\u0000\u00004\u00f2\u0001\u0000\u0000\u0000"+
		"6\u010c\u0001\u0000\u0000\u00008\u010e\u0001\u0000\u0000\u0000:\u0112"+
		"\u0001\u0000\u0000\u0000<\u0115\u0001\u0000\u0000\u0000>\u0130\u0001\u0000"+
		"\u0000\u0000@\u0133\u0001\u0000\u0000\u0000B\u0140\u0001\u0000\u0000\u0000"+
		"D\u0145\u0001\u0000\u0000\u0000F\u0147\u0001\u0000\u0000\u0000H\u015a"+
		"\u0001\u0000\u0000\u0000J\u015c\u0001\u0000\u0000\u0000L\u015e\u0001\u0000"+
		"\u0000\u0000N\u0165\u0001\u0000\u0000\u0000P\u0167\u0001\u0000\u0000\u0000"+
		"R\u016b\u0001\u0000\u0000\u0000T\u016f\u0001\u0000\u0000\u0000V\u0171"+
		"\u0001\u0000\u0000\u0000X\u017f\u0001\u0000\u0000\u0000Z\u018d\u0001\u0000"+
		"\u0000\u0000\\\u019e\u0001\u0000\u0000\u0000^\u01ad\u0001\u0000\u0000"+
		"\u0000`\u01b5\u0001\u0000\u0000\u0000b\u01c3\u0001\u0000\u0000\u0000d"+
		"\u01de\u0001\u0000\u0000\u0000f\u01e1\u0001\u0000\u0000\u0000h\u01e3\u0001"+
		"\u0000\u0000\u0000j\u01f8\u0001\u0000\u0000\u0000l\u01fa\u0001\u0000\u0000"+
		"\u0000n\u0210\u0001\u0000\u0000\u0000p\u0221\u0001\u0000\u0000\u0000r"+
		"\u0225\u0001\u0000\u0000\u0000t\u0239\u0001\u0000\u0000\u0000v\u023c\u0001"+
		"\u0000\u0000\u0000x\u0247\u0001\u0000\u0000\u0000z\u024b\u0001\u0000\u0000"+
		"\u0000|\u0252\u0001\u0000\u0000\u0000~\u0257\u0001\u0000\u0000\u0000\u0080"+
		"\u025d\u0001\u0000\u0000\u0000\u0082\u026e\u0001\u0000\u0000\u0000\u0084"+
		"\u0271\u0001\u0000\u0000\u0000\u0086\u0281\u0001\u0000\u0000\u0000\u0088"+
		"\u029d\u0001\u0000\u0000\u0000\u008a\u02ae\u0001\u0000\u0000\u0000\u008c"+
		"\u02b1\u0001\u0000\u0000\u0000\u008e\u02c1\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\"\u0000\u0000\u0091\u0001\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005H\u0000\u0000\u0093\u0003\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"F\u0000\u0000\u0095\u0005\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0001"+
		"\u0000\u0000\u0097\u0007\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0010"+
		"\u0000\u0000\u0099\t\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0000\u0000"+
		"\u0000\u009b\u000b\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0001\u0000"+
		"\u0000\u009d\r\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000"+
		"\u009f\u000f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000"+
		"\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000"+
		"\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005(\u0000\u0000\u00a5"+
		"\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7"+
		"\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9"+
		"\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab"+
		"\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005&\u0000\u0000\u00ad\u001d"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u00057\u0000\u0000\u00af\u001f\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u00059\u0000\u0000\u00b1!\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005C\u0000\u0000\u00b3#\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005@\u0000\u0000\u00b5%\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"4\u0000\u0000\u00b7\'\u0001\u0000\u0000\u0000\u00b8\u00b9\u00053\u0000"+
		"\u0000\u00b9)\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u001e\u000f\u0000"+
		"\u00bb\u00bd\u0005<\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c3\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0003 \u0010\u0000\u00bf\u00c1\u0005=\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00be\u0001"+
		"\u0000\u0000\u0000\u00c3+\u0001\u0000\u0000\u0000\u00c4\u00c8\u0005)\u0000"+
		"\u0000\u00c5\u00c6\u0003\u0006\u0003\u0000\u00c6\u00c7\u0005C\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9-\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0007\u0002\u0000\u0000\u00cb/\u0001\u0000\u0000\u0000\u00cc\u00d0"+
		"\u0003\n\u0005\u0000\u00cd\u00ce\u0003\u0006\u0003\u0000\u00ce\u00cf\u0003"+
		"\"\u0011\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d11\u0001\u0000\u0000"+
		"\u0000\u00d2\u00dc\u0007\u0003\u0000\u0000\u00d3\u00d7\u0003\u0006\u0003"+
		"\u0000\u00d4\u00d6\u0005\u000e\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0003\"\u0011\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d3\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00e2\u0005\u0016\u0000\u0000\u00df\u00e1\u0005\u000e\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00f0\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e9\u0003\u0006\u0003\u0000\u00e6\u00e8\u0005\u000e\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ee\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0003\"\u0011\u0000\u00ed\u00ef\u0003\u001e\u000f\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e5\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f13\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005\u0017\u0000\u0000\u00f3\u00f4\u0003`0\u0000\u00f4\u00f8\u0005\u0018"+
		"\u0000\u0000\u00f5\u00f6\u0003\u0006\u0003\u0000\u00f6\u00f7\u0003\"\u0011"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f95\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0017\u0000\u0000\u00fb\u00fc\u0003`0\u0000\u00fc\u00fd"+
		"\u0005#\u0000\u0000\u00fd\u00fe\u0005\u0018\u0000\u0000\u00fe\u010d\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0017\u0000\u0000\u0100\u0103\u0003"+
		"`0\u0000\u0101\u0102\u0005#\u0000\u0000\u0102\u0104\u0003`0\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u0001\u0000\u0000\u0000\u0107\u0109\u0005#\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0018\u0000\u0000\u010b\u010d"+
		"\u0001\u0000\u0000\u0000\u010c\u00fa\u0001\u0000\u0000\u0000\u010c\u00ff"+
		"\u0001\u0000\u0000\u0000\u010d7\u0001\u0000\u0000\u0000\u010e\u010f\u0007"+
		"\u0004\u0000\u0000\u010f9\u0001\u0000\u0000\u0000\u0110\u0113\u0003*\u0015"+
		"\u0000\u0111\u0113\u0003f3\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0113;\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0003B!\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u011a\u0001\u0000\u0000\u0000\u0117\u0119\u0003t:\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0003$\u0012\u0000\u011e\u011f\u0005\u0014\u0000\u0000\u011f"+
		"\u0120\u0003:\u001d\u0000\u0120=\u0001\u0000\u0000\u0000\u0121\u0131\u0005"+
		"\u001c\u0000\u0000\u0122\u0123\u0005\u001d\u0000\u0000\u0123\u0128\u0003"+
		"<\u001e\u0000\u0124\u0125\u0005#\u0000\u0000\u0125\u0127\u0003<\u001e"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012b\u012d\u0005#\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\u001e\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000"+
		"\u0130\u0121\u0001\u0000\u0000\u0000\u0130\u0122\u0001\u0000\u0000\u0000"+
		"\u0131?\u0001\u0000\u0000\u0000\u0132\u0134\u0003B!\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u0014\n\u0000\u0136\u0137\u0005"+
		"\u001a\u0000\u0000\u0137\u0138\u00038\u001c\u0000\u0138\u013a\u0005\u001b"+
		"\u0000\u0000\u0139\u013b\u0003$\u0012\u0000\u013a\u0139\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0003>\u001f\u0000\u013dA\u0001\u0000\u0000\u0000\u013e"+
		"\u0141\u0003(\u0014\u0000\u013f\u0141\u0003&\u0013\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0143\u0001"+
		"\u0000\u0000\u0000\u0142\u0144\u0003t:\u0000\u0143\u0142\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144C\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0005H\u0000\u0000\u0146E\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0003\u0004\u0002\u0000\u0148\u0149\u0003X,\u0000\u0149G\u0001\u0000"+
		"\u0000\u0000\u014a\u015b\u0005\u0019\u0000\u0000\u014b\u014c\u0005\u001a"+
		"\u0000\u0000\u014c\u0152\u0003`0\u0000\u014d\u014e\u0003\u0000\u0000\u0000"+
		"\u014e\u014f\u0003`0\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014d"+
		"\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0003\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005\u001b\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u014a"+
		"\u0001\u0000\u0000\u0000\u015a\u014b\u0001\u0000\u0000\u0000\u015bI\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0007\u0005\u0000\u0000\u015dK\u0001\u0000"+
		"\u0000\u0000\u015e\u0162\u0003N\'\u0000\u015f\u0161\u0003N\'\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"M\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0007\u0006\u0000\u0000\u0166O\u0001\u0000\u0000\u0000\u0167\u0168\u0005"+
		"\u0017\u0000\u0000\u0168\u0169\u0003L&\u0000\u0169\u016a\u0005\u0018\u0000"+
		"\u0000\u016aQ\u0001\u0000\u0000\u0000\u016b\u016c\u0003J%\u0000\u016c"+
		"S\u0001\u0000\u0000\u0000\u016d\u0170\u0003J%\u0000\u016e\u0170\u0003"+
		"P(\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000"+
		"\u0000\u0170U\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0017\u0000\u0000"+
		"\u0172\u0177\u0003R)\u0000\u0173\u0174\u0005#\u0000\u0000\u0174\u0176"+
		"\u0003R)\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0005#\u0000\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005\u0018\u0000\u0000\u017eW\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\u0017\u0000\u0000\u0180\u0185\u0003T*\u0000\u0181\u0182"+
		"\u0005#\u0000\u0000\u0182\u0184\u0003T*\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018a\u0005#\u0000"+
		"\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0018\u0000"+
		"\u0000\u018cY\u0001\u0000\u0000\u0000\u018d\u018e\u0003X,\u0000\u018e"+
		"[\u0001\u0000\u0000\u0000\u018f\u019f\u0005\u001f\u0000\u0000\u0190\u0191"+
		"\u0005 \u0000\u0000\u0191\u0196\u0003`0\u0000\u0192\u0193\u0005#\u0000"+
		"\u0000\u0193\u0195\u0003`0\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0199\u019b\u0005#\u0000\u0000\u019a\u0199"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0005!\u0000\u0000\u019d\u019f\u0001"+
		"\u0000\u0000\u0000\u019e\u018f\u0001\u0000\u0000\u0000\u019e\u0190\u0001"+
		"\u0000\u0000\u0000\u019f]\u0001\u0000\u0000\u0000\u01a0\u01ae\u0003\f"+
		"\u0006\u0000\u01a1\u01ae\u0003,\u0016\u0000\u01a2\u01ae\u0003.\u0017\u0000"+
		"\u01a3\u01ae\u00030\u0018\u0000\u01a4\u01ae\u00032\u0019\u0000\u01a5\u01ae"+
		"\u00034\u001a\u0000\u01a6\u01ae\u00036\u001b\u0000\u01a7\u01ae\u0003@"+
		" \u0000\u01a8\u01ae\u0003\u008cF\u0000\u01a9\u01ae\u0003D\"\u0000\u01aa"+
		"\u01ae\u0003F#\u0000\u01ab\u01ae\u0003H$\u0000\u01ac\u01ae\u0003Z-\u0000"+
		"\u01ad\u01a0\u0001\u0000\u0000\u0000\u01ad\u01a1\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a2\u0001\u0000\u0000\u0000\u01ad\u01a3\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a4\u0001\u0000\u0000\u0000\u01ad\u01a5\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a6\u0001\u0000\u0000\u0000\u01ad\u01a7\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a8\u0001\u0000\u0000\u0000\u01ad\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000"+
		"\u01af\u01b1\u0005#\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b1_\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0003t:\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b8\u01bd\u0003^/\u0000\u01b9\u01bc\u0003X,\u0000\u01ba"+
		"\u01bc\u0003\\.\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01bea\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c2\u0003"+
		"&\u0013\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c9\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c8\u0003t:\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ce\u0003&\u0013\u0000\u01cd"+
		"\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d4\u0003$\u0012\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01db\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d8\u01da\u0003&\u0013\u0000\u01d9\u01d8\u0001"+
		"\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dcc\u0001\u0000"+
		"\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01df\u0003\u0006"+
		"\u0003\u0000\u01df\u01e0\u0005;\u0000\u0000\u01e0e\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0005B\u0000\u0000\u01e2g\u0001\u0000\u0000\u0000\u01e3\u01e8"+
		"\u0003r9\u0000\u01e4\u01e5\u0005#\u0000\u0000\u01e5\u01e7\u0003r9\u0000"+
		"\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9i\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ee\u0003$\u0012\u0000\u01ec\u01ee\u0003f3\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0005\u0014\u0000\u0000\u01f0\u01f1\u0003"+
		"r9\u0000\u01f1\u01f9\u0001\u0000\u0000\u0000\u01f2\u01f5\u0003$\u0012"+
		"\u0000\u01f3\u01f5\u0003f3\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0003p8\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f9k\u0001\u0000"+
		"\u0000\u0000\u01fa\u01ff\u0003j5\u0000\u01fb\u01fc\u0005#\u0000\u0000"+
		"\u01fc\u01fe\u0003j5\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u0200m\u0001\u0000\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0202\u0204\u0003h4\u0000\u0203\u0205\u0005#\u0000"+
		"\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000"+
		"\u0000\u0205\u0211\u0001\u0000\u0000\u0000\u0206\u0208\u0003l6\u0000\u0207"+
		"\u0209\u0005#\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u0211\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0003h4\u0000\u020b\u020c\u0005#\u0000\u0000\u020c\u020e\u0003l6\u0000"+
		"\u020d\u020f\u0005#\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210"+
		"\u0202\u0001\u0000\u0000\u0000\u0210\u0206\u0001\u0000\u0000\u0000\u0210"+
		"\u020a\u0001\u0000\u0000\u0000\u0211o\u0001\u0000\u0000\u0000\u0212\u0214"+
		"\u0005\u001a\u0000\u0000\u0213\u0215\u0003n7\u0000\u0214\u0213\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0222\u0005\u001b\u0000\u0000\u0217\u0219\u0005\u0017"+
		"\u0000\u0000\u0218\u021a\u0003n7\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000"+
		"\u021b\u0222\u0005\u0018\u0000\u0000\u021c\u021e\u0005\u001d\u0000\u0000"+
		"\u021d\u021f\u0003n7\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0222"+
		"\u0005\u001e\u0000\u0000\u0221\u0212\u0001\u0000\u0000\u0000\u0221\u0217"+
		"\u0001\u0000\u0000\u0000\u0221\u021c\u0001\u0000\u0000\u0000\u0222q\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0003`0\u0000\u0224\u0226\u0003p8\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000"+
		"\u0226s\u0001\u0000\u0000\u0000\u0227\u0228\u0005\u0015\u0000\u0000\u0228"+
		"\u0229\u0005\u0017\u0000\u0000\u0229\u022a\u0003$\u0012\u0000\u022a\u022b"+
		"\u0005\u0018\u0000\u0000\u022b\u023a\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0005\u0015\u0000\u0000\u022d\u022e\u0005\u0017\u0000\u0000\u022e\u022f"+
		"\u0003$\u0012\u0000\u022f\u0230\u0005\u0014\u0000\u0000\u0230\u0231\u0003"+
		"r9\u0000\u0231\u0232\u0005\u0018\u0000\u0000\u0232\u023a\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0005\u0015\u0000\u0000\u0234\u0235\u0005\u0017\u0000"+
		"\u0000\u0235\u0236\u0003$\u0012\u0000\u0236\u0237\u0003p8\u0000\u0237"+
		"\u0238\u0005\u0018\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239"+
		"\u0227\u0001\u0000\u0000\u0000\u0239\u022c\u0001\u0000\u0000\u0000\u0239"+
		"\u0233\u0001\u0000\u0000\u0000\u023au\u0001\u0000\u0000\u0000\u023b\u023d"+
		"\u0003B!\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0003\u0018"+
		"\f\u0000\u023f\u0240\u0003\u0004\u0002\u0000\u0240\u0242\u0003V+\u0000"+
		"\u0241\u0243\u0003\u0082A\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0005\r\u0000\u0000\u0245\u0246\u0003`0\u0000\u0246w\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0003\u0010\b\u0000\u0248\u0249\u0003\u0002\u0001"+
		"\u0000\u0249\u024a\u0003\u008aE\u0000\u024ay\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005(\u0000\u0000\u024c\u024d\u0005\u001a\u0000\u0000\u024d\u024e"+
		"\u0003@ \u0000\u024e\u024f\u0005\u001b\u0000\u0000\u024f\u0250\u0003\u0002"+
		"\u0001\u0000\u0250\u0251\u0003>\u001f\u0000\u0251{\u0001\u0000\u0000\u0000"+
		"\u0252\u0255\u0003\u0012\t\u0000\u0253\u0256\u0003z=\u0000\u0254\u0256"+
		"\u0003x<\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0254\u0001\u0000"+
		"\u0000\u0000\u0256}\u0001\u0000\u0000\u0000\u0257\u0258\u0003\u0016\u000b"+
		"\u0000\u0258\u025b\u0003\u0002\u0001\u0000\u0259\u025a\u0005\u000f\u0000"+
		"\u0000\u025a\u025c\u0003$\u0012\u0000\u025b\u0259\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u007f\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0005@\u0000\u0000\u025e\u0081\u0001\u0000\u0000\u0000\u025f"+
		"\u026f\u0005\u001f\u0000\u0000\u0260\u0261\u0005 \u0000\u0000\u0261\u0266"+
		"\u0003\u0080@\u0000\u0262\u0263\u0005#\u0000\u0000\u0263\u0265\u0003\u0080"+
		"@\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000"+
		"\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000"+
		"\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0269\u026b\u0005#\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0005!\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000\u026e"+
		"\u025f\u0001\u0000\u0000\u0000\u026e\u0260\u0001\u0000\u0000\u0000\u026f"+
		"\u0083\u0001\u0000\u0000\u0000\u0270\u0272\u0003B!\u0000\u0271\u0270\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\u0003\u001a\r\u0000\u0274\u0276\u0003$"+
		"\u0012\u0000\u0275\u0277\u0003\u0082A\u0000\u0276\u0275\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0005\u0014\u0000\u0000\u0279\u027a\u0003`0\u0000\u027a"+
		"\u0085\u0001\u0000\u0000\u0000\u027b\u0282\u0005B\u0000\u0000\u027c\u0282"+
		"\u0005@\u0000\u0000\u027d\u027e\u0005\u0017\u0000\u0000\u027e\u027f\u0003"+
		"`0\u0000\u027f\u0280\u0005\u0018\u0000\u0000\u0280\u0282\u0001\u0000\u0000"+
		"\u0000\u0281\u027b\u0001\u0000\u0000\u0000\u0281\u027c\u0001\u0000\u0000"+
		"\u0000\u0281\u027d\u0001\u0000\u0000\u0000\u0282\u0087\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\u0003B!\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0285"+
		"\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u028c\u0001\u0000\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0289\u028b\u0003t:\u0000\u028a\u0289\u0001"+
		"\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a\u0001"+
		"\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028f\u0001"+
		"\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0291\u0003"+
		"\u0086C\u0000\u0290\u0292\u0003\u000e\u0007\u0000\u0291\u0290\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000"+
		"\u0000\u0000\u0293\u0294\u0005%\u0000\u0000\u0294\u0295\u0003`0\u0000"+
		"\u0295\u029e\u0001\u0000\u0000\u0000\u0296\u0298\u0003t:\u0000\u0297\u0296"+
		"\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u029a"+
		"\u0001\u0000\u0000\u0000\u0299\u029b\u0005\'\u0000\u0000\u029a\u0299\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0001"+
		"\u0000\u0000\u0000\u029c\u029e\u0003`0\u0000\u029d\u0286\u0001\u0000\u0000"+
		"\u0000\u029d\u0297\u0001\u0000\u0000\u0000\u029e\u0089\u0001\u0000\u0000"+
		"\u0000\u029f\u02af\u0005\u001c\u0000\u0000\u02a0\u02a1\u0005\u001d\u0000"+
		"\u0000\u02a1\u02a6\u0003\u0088D\u0000\u02a2\u02a3\u0005#\u0000\u0000\u02a3"+
		"\u02a5\u0003\u0088D\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005#\u0000\u0000\u02aa\u02a9\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0005\u001e\u0000\u0000\u02ad\u02af\u0001"+
		"\u0000\u0000\u0000\u02ae\u029f\u0001\u0000\u0000\u0000\u02ae\u02a0\u0001"+
		"\u0000\u0000\u0000\u02af\u008b\u0001\u0000\u0000\u0000\u02b0\u02b2\u0003"+
		"B!\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b5\u0003\u0010\b\u0000"+
		"\u02b4\u02b6\u0003$\u0012\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0003\u008aE\u0000\u02b8\u008d\u0001\u0000\u0000\u0000\u02b9\u02c0"+
		"\u0003\u008cF\u0000\u02ba\u02c0\u0003@ \u0000\u02bb\u02c0\u0003\u0084"+
		"B\u0000\u02bc\u02c0\u0003~?\u0000\u02bd\u02c0\u0003|>\u0000\u02be\u02c0"+
		"\u0003v;\u0000\u02bf\u02b9\u0001\u0000\u0000\u0000\u02bf\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bf\u02bb\u0001\u0000\u0000\u0000\u02bf\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02be\u0001\u0000"+
		"\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u008f\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000U\u00bc\u00c0\u00c2\u00c8"+
		"\u00d0\u00d7\u00dc\u00e2\u00e9\u00ee\u00f0\u00f8\u0105\u0108\u010c\u0112"+
		"\u0115\u011a\u0128\u012c\u0130\u0133\u013a\u0140\u0143\u0152\u0156\u015a"+
		"\u0162\u016f\u0177\u017b\u0185\u0189\u0196\u019a\u019e\u01ad\u01b0\u01b5"+
		"\u01bb\u01bd\u01c3\u01c9\u01cf\u01d5\u01db\u01e8\u01ed\u01f4\u01f8\u01ff"+
		"\u0204\u0208\u020e\u0210\u0214\u0219\u021e\u0221\u0225\u0239\u023c\u0242"+
		"\u0255\u025b\u0266\u026a\u026e\u0271\u0276\u0281\u0286\u028c\u0291\u0297"+
		"\u029a\u029d\u02a6\u02aa\u02ae\u02b1\u02b5\u02bf\u02c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}