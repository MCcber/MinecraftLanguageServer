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
public class mcdocParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, As=2, At=3, QuestionMark=4, Dot=5, TypeKey=6, StructKeyType=7, Inject=8, 
		Enum=9, Use=10, To=11, Dispatch=12, Fallback=13, None=14, Unknown=15, 
		Parent=16, Key=17, Plus=18, Remainder=19, Equal=20, Sharp=21, SquareBrackets=22, 
		LeftSquareBracket=23, RightSquareBracket=24, RoundBrackets=25, LeftRoundBracket=26, 
		RightRoundBracket=27, CurlyBrackets=28, LeftCurlyBracket=29, RightCurlyBracket=30, 
		AngleBrackets=31, LeftAngleBracket=32, RightAngleBracket=33, LogicalOR=34, 
		Comma=35, DoubleColon=36, ColonMark=37, TripleDot=38, DoubleDot=39, ByteKeyType=40, 
		IntKeyType=41, LongKeyType=42, StringKeyType=43, BooleanKeyType=44, ShortKeyType=45, 
		FloatKeyType=46, DoubleKeyType=47, Any=48, BoolValue=49, DocCommentary=50, 
		Commentary=51, DoubleQuotes=52, Integer=53, Float=54, PositiveInteger=55, 
		IntTypedUnit=56, FloatTypedUnit=57, IntegerRange=58, FloatRange=59, Identifier=60, 
		String=61, ResourceLocationChar=62, ResourceLocation=63, PathSegment=64, 
		Path=65;
	public static final int
		RULE_logicalOR = 0, RULE_path = 1, RULE_resourceLocation = 2, RULE_at = 3, 
		RULE_as = 4, RULE_dot = 5, RULE_baseDataType = 6, RULE_keywordType = 7, 
		RULE_questionMark = 8, RULE_typeKey = 9, RULE_structKeyType = 10, RULE_inject = 11, 
		RULE_enum = 12, RULE_use = 13, RULE_dispatch = 14, RULE_doubleDot = 15, 
		RULE_integer = 16, RULE_float = 17, RULE_string = 18, RULE_integerRange = 19, 
		RULE_identifier = 20, RULE_boolValue = 21, RULE_commentary = 22, RULE_docCommentary = 23, 
		RULE_typedNumber = 24, RULE_stringType = 25, RULE_literalType = 26, RULE_numericType = 27, 
		RULE_primitiveArrayType = 28, RULE_listType = 29, RULE_tupleType = 30, 
		RULE_enumMemberType = 31, RULE_enumValue = 32, RULE_enumField = 33, RULE_enumBlock = 34, 
		RULE_enumType = 35, RULE_prelim = 36, RULE_referenceType = 37, RULE_dispatcherType = 38, 
		RULE_unionType = 39, RULE_staticIndexKey = 40, RULE_accessor = 41, RULE_accessorKey = 42, 
		RULE_dynamicIndex = 43, RULE_index = 44, RULE_indexBody = 45, RULE_indexingOnAType = 46, 
		RULE_typeArgBlock = 47, RULE_unAttributedType = 48, RULE_typeSentence = 49, 
		RULE_positionalValues = 50, RULE_namedValue = 51, RULE_namedValues = 52, 
		RULE_treeBody = 53, RULE_treeValue = 54, RULE_value = 55, RULE_attribute = 56, 
		RULE_dispatchStatement = 57, RULE_structInjection = 58, RULE_enumInjection = 59, 
		RULE_injection = 60, RULE_useStatement = 61, RULE_typeParam = 62, RULE_typeParamBlock = 63, 
		RULE_typeAlias = 64, RULE_structKey = 65, RULE_structField = 66, RULE_structBlock = 67, 
		RULE_struct = 68, RULE_file = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicalOR", "path", "resourceLocation", "at", "as", "dot", "baseDataType", 
			"keywordType", "questionMark", "typeKey", "structKeyType", "inject", 
			"enum", "use", "dispatch", "doubleDot", "integer", "float", "string", 
			"integerRange", "identifier", "boolValue", "commentary", "docCommentary", 
			"typedNumber", "stringType", "literalType", "numericType", "primitiveArrayType", 
			"listType", "tupleType", "enumMemberType", "enumValue", "enumField", 
			"enumBlock", "enumType", "prelim", "referenceType", "dispatcherType", 
			"unionType", "staticIndexKey", "accessor", "accessorKey", "dynamicIndex", 
			"index", "indexBody", "indexingOnAType", "typeArgBlock", "unAttributedType", 
			"typeSentence", "positionalValues", "namedValue", "namedValues", "treeBody", 
			"treeValue", "value", "attribute", "dispatchStatement", "structInjection", 
			"enumInjection", "injection", "useStatement", "typeParam", "typeParamBlock", 
			"typeAlias", "structKey", "structField", "structBlock", "struct", "file"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'as'", "'@'", "'?'", "'.'", "'type '", "'struct'", "'inject'", 
			"'enum'", "'use'", "'to'", "'dispatch'", "'%fallback'", "'%none'", "'%unknown'", 
			"'%parent'", "'%key'", "'+'", "'%'", "'='", "'#'", "'[]'", "'['", "']'", 
			"'()'", "'('", "')'", "'{}'", "'{'", "'}'", "'<>'", "'<'", "'>'", "'|'", 
			"','", "'::'", "':'", "'...'", "'..'", "'byte'", "'int'", "'long'", "'string'", 
			"'boolean'", "'short'", "'float'", "'double'", "'any'", null, null, null, 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "As", "At", "QuestionMark", "Dot", "TypeKey", "StructKeyType", 
			"Inject", "Enum", "Use", "To", "Dispatch", "Fallback", "None", "Unknown", 
			"Parent", "Key", "Plus", "Remainder", "Equal", "Sharp", "SquareBrackets", 
			"LeftSquareBracket", "RightSquareBracket", "RoundBrackets", "LeftRoundBracket", 
			"RightRoundBracket", "CurlyBrackets", "LeftCurlyBracket", "RightCurlyBracket", 
			"AngleBrackets", "LeftAngleBracket", "RightAngleBracket", "LogicalOR", 
			"Comma", "DoubleColon", "ColonMark", "TripleDot", "DoubleDot", "ByteKeyType", 
			"IntKeyType", "LongKeyType", "StringKeyType", "BooleanKeyType", "ShortKeyType", 
			"FloatKeyType", "DoubleKeyType", "Any", "BoolValue", "DocCommentary", 
			"Commentary", "DoubleQuotes", "Integer", "Float", "PositiveInteger", 
			"IntTypedUnit", "FloatTypedUnit", "IntegerRange", "FloatRange", "Identifier", 
			"String", "ResourceLocationChar", "ResourceLocation", "PathSegment", 
			"Path"
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

	public mcdocParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalORContext extends ParserRuleContext {
		public TerminalNode LogicalOR() { return getToken(mcdocParser.LogicalOR, 0); }
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
			setState(140);
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
		public TerminalNode Path() { return getToken(mcdocParser.Path, 0); }
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
			setState(142);
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
		public TerminalNode ResourceLocation() { return getToken(mcdocParser.ResourceLocation, 0); }
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
			setState(144);
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
		public TerminalNode At() { return getToken(mcdocParser.At, 0); }
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
			setState(146);
			match(At);
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
	public static class AsContext extends ParserRuleContext {
		public TerminalNode As() { return getToken(mcdocParser.As, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitAs(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(As);
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
		public TerminalNode Dot() { return getToken(mcdocParser.Dot, 0); }
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
		enterRule(_localctx, 10, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public TerminalNode StringKeyType() { return getToken(mcdocParser.StringKeyType, 0); }
		public TerminalNode BooleanKeyType() { return getToken(mcdocParser.BooleanKeyType, 0); }
		public TerminalNode ByteKeyType() { return getToken(mcdocParser.ByteKeyType, 0); }
		public TerminalNode ShortKeyType() { return getToken(mcdocParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParser.IntKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParser.DoubleKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParser.LongKeyType, 0); }
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
		enterRule(_localctx, 12, RULE_baseDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 280375465082880L) != 0)) ) {
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
		public TerminalNode Any() { return getToken(mcdocParser.Any, 0); }
		public TerminalNode BoolValue() { return getToken(mcdocParser.BoolValue, 0); }
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
		enterRule(_localctx, 14, RULE_keywordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		public TerminalNode QuestionMark() { return getToken(mcdocParser.QuestionMark, 0); }
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
		enterRule(_localctx, 16, RULE_questionMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(QuestionMark);
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
	public static class TypeKeyContext extends ParserRuleContext {
		public TerminalNode TypeKey() { return getToken(mcdocParser.TypeKey, 0); }
		public TypeKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeKey(this);
		}
	}

	public final TypeKeyContext typeKey() throws RecognitionException {
		TypeKeyContext _localctx = new TypeKeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(TypeKey);
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
		public TerminalNode StructKeyType() { return getToken(mcdocParser.StructKeyType, 0); }
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
		enterRule(_localctx, 20, RULE_structKeyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(StructKeyType);
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
		public TerminalNode Inject() { return getToken(mcdocParser.Inject, 0); }
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
		enterRule(_localctx, 22, RULE_inject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(Inject);
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
		public TerminalNode Enum() { return getToken(mcdocParser.Enum, 0); }
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
		enterRule(_localctx, 24, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Enum);
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
		public TerminalNode Use() { return getToken(mcdocParser.Use, 0); }
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
		enterRule(_localctx, 26, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Use);
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
		public TerminalNode Dispatch() { return getToken(mcdocParser.Dispatch, 0); }
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
		enterRule(_localctx, 28, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Dispatch);
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
		public TerminalNode DoubleDot() { return getToken(mcdocParser.DoubleDot, 0); }
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
		enterRule(_localctx, 30, RULE_doubleDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		public TerminalNode Integer() { return getToken(mcdocParser.Integer, 0); }
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
		enterRule(_localctx, 32, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		public TerminalNode Float() { return getToken(mcdocParser.Float, 0); }
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
		enterRule(_localctx, 34, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(mcdocParser.String, 0); }
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
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
	public static class IntegerRangeContext extends ParserRuleContext {
		public TerminalNode IntegerRange() { return getToken(mcdocParser.IntegerRange, 0); }
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
		enterRule(_localctx, 38, RULE_integerRange);
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
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
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
		enterRule(_localctx, 40, RULE_identifier);
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
	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode BoolValue() { return getToken(mcdocParser.BoolValue, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitBoolValue(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_boolValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(BoolValue);
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
		public TerminalNode Commentary() { return getToken(mcdocParser.Commentary, 0); }
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
		enterRule(_localctx, 44, RULE_commentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		public TerminalNode DocCommentary() { return getToken(mcdocParser.DocCommentary, 0); }
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
		enterRule(_localctx, 46, RULE_docCommentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		public TerminalNode IntTypedUnit() { return getToken(mcdocParser.IntTypedUnit, 0); }
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public TerminalNode FloatTypedUnit() { return getToken(mcdocParser.FloatTypedUnit, 0); }
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
		enterRule(_localctx, 48, RULE_typedNumber);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(188);
				integer();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntTypedUnit) {
					{
					setState(189);
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
				setState(192);
				float_();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FloatTypedUnit) {
					{
					setState(193);
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
		public TerminalNode StringKeyType() { return getToken(mcdocParser.StringKeyType, 0); }
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
		public TerminalNode IntegerRange() { return getToken(mcdocParser.IntegerRange, 0); }
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
		enterRule(_localctx, 50, RULE_stringType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(StringKeyType);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(199);
				at();
				setState(200);
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
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TypedNumberContext typedNumber() {
			return getRuleContext(TypedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_literalType);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolValue:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				boolValue();
				}
				break;
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				typedNumber();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				string();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				identifier();
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 54, RULE_numericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			baseDataType();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(211);
				at();
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(212);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(213);
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
		public TerminalNode SquareBrackets() { return getToken(mcdocParser.SquareBrackets, 0); }
		public TerminalNode ByteKeyType() { return getToken(mcdocParser.ByteKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParser.IntKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParser.LongKeyType, 0); }
		public List<AtContext> at() {
			return getRuleContexts(AtContext.class);
		}
		public AtContext at(int i) {
			return getRuleContext(AtContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(mcdocParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(mcdocParser.WS, i);
		}
		public List<IntegerRangeContext> integerRange() {
			return getRuleContexts(IntegerRangeContext.class);
		}
		public IntegerRangeContext integerRange(int i) {
			return getRuleContext(IntegerRangeContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
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
		enterRule(_localctx, 56, RULE_primitiveArrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(219);
				at();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(220);
					match(WS);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(226);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(227);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(232);
			match(SquareBrackets);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(233);
				match(WS);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(239);
				at();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(240);
					match(WS);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(246);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(247);
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
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
		public IntegerRangeContext integerRange() {
			return getRuleContext(IntegerRangeContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		enterRule(_localctx, 58, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LeftSquareBracket);
			setState(253);
			typeSentence();
			setState(254);
			match(RightSquareBracket);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(255);
				at();
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(256);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(257);
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
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public List<TypeSentenceContext> typeSentence() {
			return getRuleContexts(TypeSentenceContext.class);
		}
		public TypeSentenceContext typeSentence(int i) {
			return getRuleContext(TypeSentenceContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
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
		enterRule(_localctx, 60, RULE_tupleType);
		int _la;
		try {
			int _alt;
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(262);
				match(LeftSquareBracket);
				setState(263);
				typeSentence();
				setState(264);
				match(Comma);
				setState(265);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(267);
				match(LeftSquareBracket);
				setState(268);
				typeSentence();
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(269);
						match(Comma);
						setState(270);
						typeSentence();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(275);
					match(Comma);
					}
				}

				setState(278);
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
		public TerminalNode StringKeyType() { return getToken(mcdocParser.StringKeyType, 0); }
		public TerminalNode ByteKeyType() { return getToken(mcdocParser.ByteKeyType, 0); }
		public TerminalNode ShortKeyType() { return getToken(mcdocParser.ShortKeyType, 0); }
		public TerminalNode IntKeyType() { return getToken(mcdocParser.IntKeyType, 0); }
		public TerminalNode LongKeyType() { return getToken(mcdocParser.LongKeyType, 0); }
		public TerminalNode FloatKeyType() { return getToken(mcdocParser.FloatKeyType, 0); }
		public TerminalNode DoubleKeyType() { return getToken(mcdocParser.DoubleKeyType, 0); }
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
		enterRule(_localctx, 62, RULE_enumMemberType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 262783279038464L) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_enumValue);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				typedNumber();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
		public TerminalNode Equal() { return getToken(mcdocParser.Equal, 0); }
		public EnumValueContext enumValue() {
			return getRuleContext(EnumValueContext.class,0);
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
		enterRule(_localctx, 66, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(288);
				prelim();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(294);
				attribute();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			identifier();
			setState(301);
			match(Equal);
			setState(302);
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
		public TerminalNode CurlyBrackets() { return getToken(mcdocParser.CurlyBrackets, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(mcdocParser.LeftCurlyBracket, 0); }
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public TerminalNode RightCurlyBracket() { return getToken(mcdocParser.RightCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 68, RULE_enumBlock);
		int _la;
		try {
			int _alt;
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(305);
				match(LeftCurlyBracket);
				setState(306);
				enumField();
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(Comma);
						setState(308);
						enumField();
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(314);
					match(Comma);
					}
				}

				setState(317);
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
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParser.LeftRoundBracket, 0); }
		public EnumMemberTypeContext enumMemberType() {
			return getRuleContext(EnumMemberTypeContext.class,0);
		}
		public TerminalNode RightRoundBracket() { return getToken(mcdocParser.RightRoundBracket, 0); }
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
		enterRule(_localctx, 70, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(321);
				prelim();
				}
			}

			setState(324);
			enum_();
			setState(325);
			match(LeftRoundBracket);
			setState(326);
			enumMemberType();
			setState(327);
			match(RightRoundBracket);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(328);
				identifier();
				}
			}

			setState(331);
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
		enterRule(_localctx, 72, RULE_prelim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DocCommentary:
				{
				setState(333);
				docCommentary();
				}
				break;
			case Commentary:
				{
				setState(334);
				commentary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(337);
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
		public TerminalNode Path() { return getToken(mcdocParser.Path, 0); }
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
		enterRule(_localctx, 74, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		enterRule(_localctx, 76, RULE_dispatcherType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			resourceLocation();
			setState(343);
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
		public TerminalNode RoundBrackets() { return getToken(mcdocParser.RoundBrackets, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParser.LeftRoundBracket, 0); }
		public List<TypeSentenceContext> typeSentence() {
			return getRuleContexts(TypeSentenceContext.class);
		}
		public TypeSentenceContext typeSentence(int i) {
			return getRuleContext(TypeSentenceContext.class,i);
		}
		public TerminalNode RightRoundBracket() { return getToken(mcdocParser.RightRoundBracket, 0); }
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
		enterRule(_localctx, 78, RULE_unionType);
		int _la;
		try {
			int _alt;
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RoundBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(RoundBrackets);
				}
				break;
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(346);
				match(LeftRoundBracket);
				setState(347);
				typeSentence();
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						logicalOR();
						setState(349);
						typeSentence();
						}
						} 
					}
					setState(355);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LogicalOR) {
					{
					setState(356);
					logicalOR();
					}
				}

				setState(359);
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
		public TerminalNode Fallback() { return getToken(mcdocParser.Fallback, 0); }
		public TerminalNode None() { return getToken(mcdocParser.None, 0); }
		public TerminalNode Unknown() { return getToken(mcdocParser.Unknown, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
		public TerminalNode String() { return getToken(mcdocParser.String, 0); }
		public TerminalNode ResourceLocation() { return getToken(mcdocParser.ResourceLocation, 0); }
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
		enterRule(_localctx, 80, RULE_staticIndexKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -5764607523034177536L) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_accessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			accessorKey();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764513820737536L) != 0)) {
				{
				{
				setState(366);
				accessorKey();
				}
				}
				setState(371);
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
		public TerminalNode Parent() { return getToken(mcdocParser.Parent, 0); }
		public TerminalNode Key() { return getToken(mcdocParser.Key, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
		public TerminalNode String() { return getToken(mcdocParser.String, 0); }
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
		enterRule(_localctx, 84, RULE_accessorKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764513820737536L) != 0)) ) {
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
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
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
		enterRule(_localctx, 86, RULE_dynamicIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LeftSquareBracket);
			setState(375);
			accessor();
			setState(376);
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
	public static class IndexContext extends ParserRuleContext {
		public StaticIndexKeyContext staticIndexKey() {
			return getRuleContext(StaticIndexKeyContext.class,0);
		}
		public DynamicIndexContext dynamicIndex() {
			return getRuleContext(DynamicIndexContext.class,0);
		}
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
		enterRule(_localctx, 88, RULE_index);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Fallback:
			case None:
			case Unknown:
			case Identifier:
			case String:
			case ResourceLocation:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				staticIndexKey();
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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
	public static class IndexBodyContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 90, RULE_indexBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(LeftSquareBracket);
			setState(383);
			index();
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(Comma);
					setState(385);
					index();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(391);
				match(Comma);
				}
			}

			setState(394);
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
		public IndexBodyContext indexBody() {
			return getRuleContext(IndexBodyContext.class,0);
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
		enterRule(_localctx, 92, RULE_indexingOnAType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		public TerminalNode AngleBrackets() { return getToken(mcdocParser.AngleBrackets, 0); }
		public TerminalNode LeftAngleBracket() { return getToken(mcdocParser.LeftAngleBracket, 0); }
		public List<TypeSentenceContext> typeSentence() {
			return getRuleContexts(TypeSentenceContext.class);
		}
		public TypeSentenceContext typeSentence(int i) {
			return getRuleContext(TypeSentenceContext.class,i);
		}
		public TerminalNode RightAngleBracket() { return getToken(mcdocParser.RightAngleBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 94, RULE_typeArgBlock);
		int _la;
		try {
			int _alt;
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(399);
				match(LeftAngleBracket);
				setState(400);
				typeSentence();
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(401);
						match(Comma);
						setState(402);
						typeSentence();
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(408);
					match(Comma);
					}
				}

				setState(411);
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
		public TerminalNode Comma() { return getToken(mcdocParser.Comma, 0); }
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
		enterRule(_localctx, 96, RULE_unAttributedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(415);
				keywordType();
				}
				break;
			case 2:
				{
				setState(416);
				stringType();
				}
				break;
			case 3:
				{
				setState(417);
				literalType();
				}
				break;
			case 4:
				{
				setState(418);
				numericType();
				}
				break;
			case 5:
				{
				setState(419);
				primitiveArrayType();
				}
				break;
			case 6:
				{
				setState(420);
				listType();
				}
				break;
			case 7:
				{
				setState(421);
				tupleType();
				}
				break;
			case 8:
				{
				setState(422);
				enumType();
				}
				break;
			case 9:
				{
				setState(423);
				struct();
				}
				break;
			case 10:
				{
				setState(424);
				referenceType();
				}
				break;
			case 11:
				{
				setState(425);
				dispatcherType();
				}
				break;
			case 12:
				{
				setState(426);
				unionType();
				}
				break;
			case 13:
				{
				setState(427);
				indexingOnAType();
				}
				break;
			}
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(430);
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
	public static class TypeSentenceContext extends ParserRuleContext {
		public UnAttributedTypeContext unAttributedType() {
			return getRuleContext(UnAttributedTypeContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
		public TypeSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).enterTypeSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcdocParserListener ) ((mcdocParserListener)listener).exitTypeSentence(this);
		}
	}

	public final TypeSentenceContext typeSentence() throws RecognitionException {
		TypeSentenceContext _localctx = new TypeSentenceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(433);
				attribute();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			unAttributedType();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6450839552L) != 0)) {
				{
				setState(442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftSquareBracket:
					{
					setState(440);
					indexBody();
					}
					break;
				case AngleBrackets:
				case LeftAngleBracket:
					{
					setState(441);
					typeArgBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(446);
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
	public static class PositionalValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 100, RULE_positionalValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			value();
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					match(Comma);
					setState(449);
					value();
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode Equal() { return getToken(mcdocParser.Equal, 0); }
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
		enterRule(_localctx, 102, RULE_namedValue);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(457);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(455);
					identifier();
					}
					break;
				case String:
					{
					setState(456);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(459);
				match(Equal);
				setState(460);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(462);
					identifier();
					}
					break;
				case String:
					{
					setState(463);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(466);
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
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 104, RULE_namedValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			namedValue();
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(471);
					match(Comma);
					setState(472);
					namedValue();
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 106, RULE_treeBody);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(478);
				positionalValues();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(479);
					match(Comma);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				namedValues();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(483);
					match(Comma);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				positionalValues();
				setState(487);
				match(Comma);
				setState(488);
				namedValues();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(489);
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
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParser.LeftRoundBracket, 0); }
		public TerminalNode RightRoundBracket() { return getToken(mcdocParser.RightRoundBracket, 0); }
		public TreeBodyContext treeBody() {
			return getRuleContext(TreeBodyContext.class,0);
		}
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(mcdocParser.LeftCurlyBracket, 0); }
		public TerminalNode RightCurlyBracket() { return getToken(mcdocParser.RightCurlyBracket, 0); }
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
		enterRule(_localctx, 108, RULE_treeValue);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(494);
				match(LeftRoundBracket);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 387555849973612549L) != 0)) {
					{
					setState(495);
					treeBody();
					}
				}

				setState(498);
				match(RightRoundBracket);
				}
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(499);
				match(LeftSquareBracket);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 387555849973612549L) != 0)) {
					{
					setState(500);
					treeBody();
					}
				}

				setState(503);
				match(RightSquareBracket);
				}
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(504);
				match(LeftCurlyBracket);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 387555849973612549L) != 0)) {
					{
					setState(505);
					treeBody();
					}
				}

				setState(508);
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
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
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
		enterRule(_localctx, 110, RULE_value);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				typeSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
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
		public TerminalNode Sharp() { return getToken(mcdocParser.Sharp, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
		public TerminalNode Equal() { return getToken(mcdocParser.Equal, 0); }
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
		enterRule(_localctx, 112, RULE_attribute);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(515);
				match(Sharp);
				setState(516);
				match(LeftSquareBracket);
				setState(517);
				identifier();
				setState(518);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(520);
				match(Sharp);
				setState(521);
				match(LeftSquareBracket);
				setState(522);
				identifier();
				setState(523);
				match(Equal);
				setState(524);
				value();
				setState(525);
				match(RightSquareBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(527);
				match(Sharp);
				setState(528);
				match(LeftSquareBracket);
				setState(529);
				identifier();
				setState(530);
				treeValue();
				setState(531);
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
		public IndexBodyContext indexBody() {
			return getRuleContext(IndexBodyContext.class,0);
		}
		public TerminalNode To() { return getToken(mcdocParser.To, 0); }
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
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
		enterRule(_localctx, 114, RULE_dispatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(535);
				prelim();
				}
			}

			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(538);
				attribute();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			dispatch();
			setState(545);
			resourceLocation();
			setState(546);
			indexBody();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(547);
				typeParamBlock();
				}
			}

			setState(550);
			match(To);
			setState(551);
			typeSentence();
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
		enterRule(_localctx, 116, RULE_structInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			structKeyType();
			setState(554);
			path();
			setState(555);
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
		public TerminalNode Enum() { return getToken(mcdocParser.Enum, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(mcdocParser.LeftRoundBracket, 0); }
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public TerminalNode RightRoundBracket() { return getToken(mcdocParser.RightRoundBracket, 0); }
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
		enterRule(_localctx, 118, RULE_enumInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(Enum);
			setState(558);
			match(LeftRoundBracket);
			setState(559);
			enumType();
			setState(560);
			match(RightRoundBracket);
			setState(561);
			path();
			setState(562);
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
		enterRule(_localctx, 120, RULE_injection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			inject();
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Enum:
				{
				setState(565);
				enumInjection();
				}
				break;
			case StructKeyType:
				{
				setState(566);
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
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
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
		enterRule(_localctx, 122, RULE_useStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			use();
			setState(570);
			path();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(571);
				as();
				setState(572);
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
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
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
		enterRule(_localctx, 124, RULE_typeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		public TerminalNode AngleBrackets() { return getToken(mcdocParser.AngleBrackets, 0); }
		public TerminalNode LeftAngleBracket() { return getToken(mcdocParser.LeftAngleBracket, 0); }
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public TerminalNode RightAngleBracket() { return getToken(mcdocParser.RightAngleBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 126, RULE_typeParamBlock);
		int _la;
		try {
			int _alt;
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(579);
				match(LeftAngleBracket);
				setState(580);
				typeParam();
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(581);
						match(Comma);
						setState(582);
						typeParam();
						}
						} 
					}
					setState(587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(588);
					match(Comma);
					}
				}

				setState(591);
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
		public TypeKeyContext typeKey() {
			return getRuleContext(TypeKeyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Equal() { return getToken(mcdocParser.Equal, 0); }
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
		}
		public List<PrelimContext> prelim() {
			return getRuleContexts(PrelimContext.class);
		}
		public PrelimContext prelim(int i) {
			return getRuleContext(PrelimContext.class,i);
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
		enterRule(_localctx, 128, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(595);
				prelim();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			typeKey();
			setState(602);
			identifier();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(603);
				typeParamBlock();
				}
			}

			setState(606);
			match(Equal);
			setState(607);
			typeSentence();
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
		public TerminalNode String() { return getToken(mcdocParser.String, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
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
		enterRule(_localctx, 130, RULE_structKey);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(String);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(Identifier);
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(611);
				match(LeftSquareBracket);
				setState(612);
				typeSentence();
				setState(613);
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
		public TerminalNode ColonMark() { return getToken(mcdocParser.ColonMark, 0); }
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
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
		public TerminalNode TripleDot() { return getToken(mcdocParser.TripleDot, 0); }
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
		enterRule(_localctx, 132, RULE_structField);
		int _la;
		try {
			int _alt;
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DocCommentary || _la==Commentary) {
					{
					{
					setState(617);
					prelim();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Sharp) {
					{
					{
					setState(623);
					attribute();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				structKey();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(630);
					questionMark();
					}
				}

				setState(633);
				match(ColonMark);
				setState(634);
				typeSentence();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(636);
						attribute();
						}
						} 
					}
					setState(641);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TripleDot) {
					{
					setState(642);
					match(TripleDot);
					}
				}

				setState(645);
				typeSentence();
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
		public TerminalNode CurlyBrackets() { return getToken(mcdocParser.CurlyBrackets, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(mcdocParser.LeftCurlyBracket, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public TerminalNode RightCurlyBracket() { return getToken(mcdocParser.RightCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
		enterRule(_localctx, 134, RULE_structBlock);
		int _la;
		try {
			int _alt;
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(649);
				match(LeftCurlyBracket);
				setState(650);
				structField();
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(651);
						match(Comma);
						setState(652);
						structField();
						}
						} 
					}
					setState(657);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(658);
					match(Comma);
					}
				}

				setState(661);
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
		public List<PrelimContext> prelim() {
			return getRuleContexts(PrelimContext.class);
		}
		public PrelimContext prelim(int i) {
			return getRuleContext(PrelimContext.class,i);
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
		enterRule(_localctx, 136, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(665);
				prelim();
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
			structKeyType();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(672);
				identifier();
				}
			}

			setState(675);
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
		enterRule(_localctx, 138, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699722631104L) != 0)) {
				{
				setState(683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(677);
					struct();
					}
					break;
				case 2:
					{
					setState(678);
					enumType();
					}
					break;
				case 3:
					{
					setState(679);
					typeAlias();
					}
					break;
				case 4:
					{
					setState(680);
					useStatement();
					}
					break;
				case 5:
					{
					setState(681);
					injection();
					}
					break;
				case 6:
					{
					setState(682);
					dispatchStatement();
					}
					break;
				}
				}
				setState(687);
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
		"\u0004\u0001A\u02b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00bf\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u00c3\b\u0018\u0003\u0018\u00c5\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00cb"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00d1"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00d7"+
		"\b\u001b\u0003\u001b\u00d9\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u00de\b\u001c\n\u001c\f\u001c\u00e1\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u00e5\b\u001c\u0003\u001c\u00e7\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u00eb\b\u001c\n\u001c\f\u001c\u00ee\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u00f2\b\u001c\n\u001c\f\u001c\u00f5\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u00f9\b\u001c\u0003\u001c\u00fb\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0103\b\u001d\u0003\u001d\u0105\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0004\u001e\u0110\b\u001e\u000b\u001e\f\u001e"+
		"\u0111\u0001\u001e\u0003\u001e\u0115\b\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0119\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u011f"+
		"\b \u0001!\u0005!\u0122\b!\n!\f!\u0125\t!\u0001!\u0005!\u0128\b!\n!\f"+
		"!\u012b\t!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0136\b\"\n\"\f\"\u0139\t\"\u0001\"\u0003\"\u013c\b\""+
		"\u0001\"\u0001\"\u0003\"\u0140\b\"\u0001#\u0003#\u0143\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u014a\b#\u0001#\u0001#\u0001$\u0001$\u0003"+
		"$\u0150\b$\u0001$\u0003$\u0153\b$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0160\b\'\n\'\f\'\u0163"+
		"\t\'\u0001\'\u0003\'\u0166\b\'\u0001\'\u0001\'\u0003\'\u016a\b\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0005)\u0170\b)\n)\f)\u0173\t)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0003,\u017d\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u0183\b-\n-\f-\u0186\t-\u0001-\u0003-\u0189\b-\u0001-"+
		"\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0194"+
		"\b/\n/\f/\u0197\t/\u0001/\u0003/\u019a\b/\u0001/\u0001/\u0003/\u019e\b"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u01ad\b0\u00010\u00030\u01b0\b0\u00011\u0005"+
		"1\u01b3\b1\n1\f1\u01b6\t1\u00011\u00011\u00011\u00051\u01bb\b1\n1\f1\u01be"+
		"\t1\u00012\u00012\u00012\u00052\u01c3\b2\n2\f2\u01c6\t2\u00013\u00013"+
		"\u00033\u01ca\b3\u00013\u00013\u00013\u00013\u00013\u00033\u01d1\b3\u0001"+
		"3\u00013\u00033\u01d5\b3\u00014\u00014\u00014\u00054\u01da\b4\n4\f4\u01dd"+
		"\t4\u00015\u00015\u00035\u01e1\b5\u00015\u00015\u00035\u01e5\b5\u0001"+
		"5\u00015\u00015\u00015\u00035\u01eb\b5\u00035\u01ed\b5\u00016\u00016\u0003"+
		"6\u01f1\b6\u00016\u00016\u00016\u00036\u01f6\b6\u00016\u00016\u00016\u0003"+
		"6\u01fb\b6\u00016\u00036\u01fe\b6\u00017\u00017\u00037\u0202\b7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0216\b8\u0001"+
		"9\u00039\u0219\b9\u00019\u00059\u021c\b9\n9\f9\u021f\t9\u00019\u00019"+
		"\u00019\u00019\u00039\u0225\b9\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0003<\u0238\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u023f"+
		"\b=\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0005?\u0248\b?\n"+
		"?\f?\u024b\t?\u0001?\u0003?\u024e\b?\u0001?\u0001?\u0003?\u0252\b?\u0001"+
		"@\u0005@\u0255\b@\n@\f@\u0258\t@\u0001@\u0001@\u0001@\u0003@\u025d\b@"+
		"\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003"+
		"A\u0268\bA\u0001B\u0005B\u026b\bB\nB\fB\u026e\tB\u0001B\u0005B\u0271\b"+
		"B\nB\fB\u0274\tB\u0001B\u0001B\u0003B\u0278\bB\u0001B\u0001B\u0001B\u0001"+
		"B\u0005B\u027e\bB\nB\fB\u0281\tB\u0001B\u0003B\u0284\bB\u0001B\u0003B"+
		"\u0287\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0005C\u028e\bC\nC\fC\u0291"+
		"\tC\u0001C\u0003C\u0294\bC\u0001C\u0001C\u0003C\u0298\bC\u0001D\u0005"+
		"D\u029b\bD\nD\fD\u029e\tD\u0001D\u0001D\u0003D\u02a2\bD\u0001D\u0001D"+
		"\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0005E\u02ac\bE\nE\fE\u02af"+
		"\tE\u0001E\u0000\u0000F\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u0000\u0006\u0001"+
		"\u0000(/\u0001\u000001\u0001\u0000(*\u0002\u0000(+-/\u0003\u0000\r\u000f"+
		"<=??\u0002\u0000\u0010\u0011<=\u02d2\u0000\u008c\u0001\u0000\u0000\u0000"+
		"\u0002\u008e\u0001\u0000\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000"+
		"\u0006\u0092\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000\u0000\u0000\n"+
		"\u0096\u0001\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u009a"+
		"\u0001\u0000\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u009e"+
		"\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a2"+
		"\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e\u00aa"+
		"\u0001\u0000\u0000\u0000 \u00ac\u0001\u0000\u0000\u0000\"\u00ae\u0001"+
		"\u0000\u0000\u0000$\u00b0\u0001\u0000\u0000\u0000&\u00b2\u0001\u0000\u0000"+
		"\u0000(\u00b4\u0001\u0000\u0000\u0000*\u00b6\u0001\u0000\u0000\u0000,"+
		"\u00b8\u0001\u0000\u0000\u0000.\u00ba\u0001\u0000\u0000\u00000\u00c4\u0001"+
		"\u0000\u0000\u00002\u00c6\u0001\u0000\u0000\u00004\u00d0\u0001\u0000\u0000"+
		"\u00006\u00d2\u0001\u0000\u0000\u00008\u00da\u0001\u0000\u0000\u0000:"+
		"\u00fc\u0001\u0000\u0000\u0000<\u0118\u0001\u0000\u0000\u0000>\u011a\u0001"+
		"\u0000\u0000\u0000@\u011e\u0001\u0000\u0000\u0000B\u0123\u0001\u0000\u0000"+
		"\u0000D\u013f\u0001\u0000\u0000\u0000F\u0142\u0001\u0000\u0000\u0000H"+
		"\u014f\u0001\u0000\u0000\u0000J\u0154\u0001\u0000\u0000\u0000L\u0156\u0001"+
		"\u0000\u0000\u0000N\u0169\u0001\u0000\u0000\u0000P\u016b\u0001\u0000\u0000"+
		"\u0000R\u016d\u0001\u0000\u0000\u0000T\u0174\u0001\u0000\u0000\u0000V"+
		"\u0176\u0001\u0000\u0000\u0000X\u017c\u0001\u0000\u0000\u0000Z\u017e\u0001"+
		"\u0000\u0000\u0000\\\u018c\u0001\u0000\u0000\u0000^\u019d\u0001\u0000"+
		"\u0000\u0000`\u01ac\u0001\u0000\u0000\u0000b\u01b4\u0001\u0000\u0000\u0000"+
		"d\u01bf\u0001\u0000\u0000\u0000f\u01d4\u0001\u0000\u0000\u0000h\u01d6"+
		"\u0001\u0000\u0000\u0000j\u01ec\u0001\u0000\u0000\u0000l\u01fd\u0001\u0000"+
		"\u0000\u0000n\u0201\u0001\u0000\u0000\u0000p\u0215\u0001\u0000\u0000\u0000"+
		"r\u0218\u0001\u0000\u0000\u0000t\u0229\u0001\u0000\u0000\u0000v\u022d"+
		"\u0001\u0000\u0000\u0000x\u0234\u0001\u0000\u0000\u0000z\u0239\u0001\u0000"+
		"\u0000\u0000|\u0240\u0001\u0000\u0000\u0000~\u0251\u0001\u0000\u0000\u0000"+
		"\u0080\u0256\u0001\u0000\u0000\u0000\u0082\u0267\u0001\u0000\u0000\u0000"+
		"\u0084\u0286\u0001\u0000\u0000\u0000\u0086\u0297\u0001\u0000\u0000\u0000"+
		"\u0088\u029c\u0001\u0000\u0000\u0000\u008a\u02ad\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\"\u0000\u0000\u008d\u0001\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005A\u0000\u0000\u008f\u0003\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005?\u0000\u0000\u0091\u0005\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0003\u0000\u0000\u0093\u0007\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u0002\u0000\u0000\u0095\t\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0005"+
		"\u0000\u0000\u0097\u000b\u0001\u0000\u0000\u0000\u0098\u0099\u0007\u0000"+
		"\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0001\u0000"+
		"\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0004\u0000"+
		"\u0000\u009d\u0011\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0006\u0000"+
		"\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0007\u0000"+
		"\u0000\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\b\u0000\u0000"+
		"\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\t\u0000\u0000\u00a5"+
		"\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u001b"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\f\u0000\u0000\u00a9\u001d\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\'\u0000\u0000\u00ab\u001f\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u00055\u0000\u0000\u00ad!\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u00056\u0000\u0000\u00af#\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005=\u0000\u0000\u00b1%\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005:"+
		"\u0000\u0000\u00b3\'\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005<\u0000"+
		"\u0000\u00b5)\u0001\u0000\u0000\u0000\u00b6\u00b7\u00051\u0000\u0000\u00b7"+
		"+\u0001\u0000\u0000\u0000\u00b8\u00b9\u00053\u0000\u0000\u00b9-\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u00052\u0000\u0000\u00bb/\u0001\u0000\u0000"+
		"\u0000\u00bc\u00be\u0003 \u0010\u0000\u00bd\u00bf\u00058\u0000\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\"\u0011\u0000\u00c1\u00c3"+
		"\u00059\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c51\u0001\u0000"+
		"\u0000\u0000\u00c6\u00ca\u0005+\u0000\u0000\u00c7\u00c8\u0003\u0006\u0003"+
		"\u0000\u00c8\u00c9\u0005:\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb3\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003*\u0015\u0000\u00cd\u00d1"+
		"\u00030\u0018\u0000\u00ce\u00d1\u0003$\u0012\u0000\u00cf\u00d1\u0003("+
		"\u0014\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d15\u0001\u0000\u0000\u0000\u00d2\u00d8\u0003\f\u0006"+
		"\u0000\u00d3\u00d6\u0003\u0006\u0003\u0000\u00d4\u00d7\u0003&\u0013\u0000"+
		"\u00d5\u00d7\u0003 \u0010\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"7\u0001\u0000\u0000\u0000\u00da\u00e6\u0007\u0002\u0000\u0000\u00db\u00df"+
		"\u0003\u0006\u0003\u0000\u00dc\u00de\u0005\u0001\u0000\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5"+
		"\u0003&\u0013\u0000\u00e3\u00e5\u0003 \u0010\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e6\u00db\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005\u0016"+
		"\u0000\u0000\u00e9\u00eb\u0005\u0001\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00fa\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f3\u0003\u0006"+
		"\u0003\u0000\u00f0\u00f2\u0005\u0001\u0000\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0003&\u0013"+
		"\u0000\u00f7\u00f9\u0003 \u0010\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00ef\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0017\u0000\u0000\u00fd"+
		"\u00fe\u0003b1\u0000\u00fe\u0104\u0005\u0018\u0000\u0000\u00ff\u0102\u0003"+
		"\u0006\u0003\u0000\u0100\u0103\u0003&\u0013\u0000\u0101\u0103\u0003 \u0010"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00ff\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105;\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0017\u0000\u0000\u0107\u0108\u0003b1\u0000\u0108\u0109"+
		"\u0005#\u0000\u0000\u0109\u010a\u0005\u0018\u0000\u0000\u010a\u0119\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005\u0017\u0000\u0000\u010c\u010f\u0003"+
		"b1\u0000\u010d\u010e\u0005#\u0000\u0000\u010e\u0110\u0003b1\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0114\u0001\u0000\u0000\u0000\u0113\u0115\u0005#\u0000\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0018\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u0106\u0001\u0000\u0000\u0000\u0118\u010b"+
		"\u0001\u0000\u0000\u0000\u0119=\u0001\u0000\u0000\u0000\u011a\u011b\u0007"+
		"\u0003\u0000\u0000\u011b?\u0001\u0000\u0000\u0000\u011c\u011f\u00030\u0018"+
		"\u0000\u011d\u011f\u0003$\u0012\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011fA\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0003H$\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0129\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0126\u0128\u0003p8\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0003(\u0014\u0000"+
		"\u012d\u012e\u0005\u0014\u0000\u0000\u012e\u012f\u0003@ \u0000\u012fC"+
		"\u0001\u0000\u0000\u0000\u0130\u0140\u0005\u001c\u0000\u0000\u0131\u0132"+
		"\u0005\u001d\u0000\u0000\u0132\u0137\u0003B!\u0000\u0133\u0134\u0005#"+
		"\u0000\u0000\u0134\u0136\u0003B!\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c\u0005#\u0000\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u001e\u0000\u0000\u013e"+
		"\u0140\u0001\u0000\u0000\u0000\u013f\u0130\u0001\u0000\u0000\u0000\u013f"+
		"\u0131\u0001\u0000\u0000\u0000\u0140E\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0003H$\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0003\u0018"+
		"\f\u0000\u0145\u0146\u0005\u001a\u0000\u0000\u0146\u0147\u0003>\u001f"+
		"\u0000\u0147\u0149\u0005\u001b\u0000\u0000\u0148\u014a\u0003(\u0014\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0003D\"\u0000\u014c"+
		"G\u0001\u0000\u0000\u0000\u014d\u0150\u0003.\u0017\u0000\u014e\u0150\u0003"+
		",\u0016\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u0153\u0003p8\u0000"+
		"\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153I\u0001\u0000\u0000\u0000\u0154\u0155\u0005A\u0000\u0000\u0155K"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0003\u0004\u0002\u0000\u0157\u0158"+
		"\u0003Z-\u0000\u0158M\u0001\u0000\u0000\u0000\u0159\u016a\u0005\u0019"+
		"\u0000\u0000\u015a\u015b\u0005\u001a\u0000\u0000\u015b\u0161\u0003b1\u0000"+
		"\u015c\u015d\u0003\u0000\u0000\u0000\u015d\u015e\u0003b1\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u0160\u0163"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161"+
		"\u0001\u0000\u0000\u0000\u0164\u0166\u0003\u0000\u0000\u0000\u0165\u0164"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u001b\u0000\u0000\u0168\u016a"+
		"\u0001\u0000\u0000\u0000\u0169\u0159\u0001\u0000\u0000\u0000\u0169\u015a"+
		"\u0001\u0000\u0000\u0000\u016aO\u0001\u0000\u0000\u0000\u016b\u016c\u0007"+
		"\u0004\u0000\u0000\u016cQ\u0001\u0000\u0000\u0000\u016d\u0171\u0003T*"+
		"\u0000\u016e\u0170\u0003T*\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172S\u0001\u0000\u0000\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0007\u0005\u0000\u0000\u0175U\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u0017\u0000\u0000\u0177\u0178\u0003"+
		"R)\u0000\u0178\u0179\u0005\u0018\u0000\u0000\u0179W\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u0003P(\u0000\u017b\u017d\u0003V+\u0000\u017c\u017a"+
		"\u0001\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017dY\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0005\u0017\u0000\u0000\u017f\u0184\u0003"+
		"X,\u0000\u0180\u0181\u0005#\u0000\u0000\u0181\u0183\u0003X,\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187"+
		"\u0189\u0005#\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0005\u0018\u0000\u0000\u018b[\u0001\u0000\u0000\u0000\u018c\u018d\u0003"+
		"Z-\u0000\u018d]\u0001\u0000\u0000\u0000\u018e\u019e\u0005\u001f\u0000"+
		"\u0000\u018f\u0190\u0005 \u0000\u0000\u0190\u0195\u0003b1\u0000\u0191"+
		"\u0192\u0005#\u0000\u0000\u0192\u0194\u0003b1\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0199\u0001"+
		"\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019a\u0005"+
		"#\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0005!\u0000"+
		"\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u018e\u0001\u0000\u0000"+
		"\u0000\u019d\u018f\u0001\u0000\u0000\u0000\u019e_\u0001\u0000\u0000\u0000"+
		"\u019f\u01ad\u0003\u000e\u0007\u0000\u01a0\u01ad\u00032\u0019\u0000\u01a1"+
		"\u01ad\u00034\u001a\u0000\u01a2\u01ad\u00036\u001b\u0000\u01a3\u01ad\u0003"+
		"8\u001c\u0000\u01a4\u01ad\u0003:\u001d\u0000\u01a5\u01ad\u0003<\u001e"+
		"\u0000\u01a6\u01ad\u0003F#\u0000\u01a7\u01ad\u0003\u0088D\u0000\u01a8"+
		"\u01ad\u0003J%\u0000\u01a9\u01ad\u0003L&\u0000\u01aa\u01ad\u0003N\'\u0000"+
		"\u01ab\u01ad\u0003\\.\u0000\u01ac\u019f\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a0\u0001\u0000\u0000\u0000\u01ac\u01a1\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a2\u0001\u0000\u0000\u0000\u01ac\u01a3\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a4\u0001\u0000\u0000\u0000\u01ac\u01a5\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a6\u0001\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005#\u0000\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0a\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b3\u0003p8\u0000\u01b2\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01bc\u0003`0\u0000\u01b8"+
		"\u01bb\u0003Z-\u0000\u01b9\u01bb\u0003^/\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bdc\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c4\u0003n7\u0000\u01c0\u01c1\u0005#\u0000\u0000\u01c1"+
		"\u01c3\u0003n7\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5e\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0003(\u0014\u0000\u01c8\u01ca\u0003$\u0012\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u0014\u0000\u0000"+
		"\u01cc\u01cd\u0003n7\u0000\u01cd\u01d5\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0003(\u0014\u0000\u01cf\u01d1\u0003$\u0012\u0000\u01d0\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0003l6\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d4\u01c9\u0001\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d5g\u0001\u0000\u0000\u0000\u01d6\u01db\u0003f3\u0000\u01d7\u01d8"+
		"\u0005#\u0000\u0000\u01d8\u01da\u0003f3\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dci\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e0\u0003d2\u0000\u01df"+
		"\u01e1\u0005#\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01ed\u0001\u0000\u0000\u0000\u01e2\u01e4"+
		"\u0003h4\u0000\u01e3\u01e5\u0005#\u0000\u0000\u01e4\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01ed\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0003d2\u0000\u01e7\u01e8\u0005#\u0000\u0000"+
		"\u01e8\u01ea\u0003h4\u0000\u01e9\u01eb\u0005#\u0000\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ec\u01de\u0001\u0000\u0000\u0000\u01ec\u01e2"+
		"\u0001\u0000\u0000\u0000\u01ec\u01e6\u0001\u0000\u0000\u0000\u01edk\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0005\u001a\u0000\u0000\u01ef\u01f1\u0003"+
		"j5\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01fe\u0005\u001b\u0000"+
		"\u0000\u01f3\u01f5\u0005\u0017\u0000\u0000\u01f4\u01f6\u0003j5\u0000\u01f5"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f7\u01fe\u0005\u0018\u0000\u0000\u01f8"+
		"\u01fa\u0005\u001d\u0000\u0000\u01f9\u01fb\u0003j5\u0000\u01fa\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fe\u0005\u001e\u0000\u0000\u01fd\u01ee\u0001"+
		"\u0000\u0000\u0000\u01fd\u01f3\u0001\u0000\u0000\u0000\u01fd\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fem\u0001\u0000\u0000\u0000\u01ff\u0202\u0003b1"+
		"\u0000\u0200\u0202\u0003l6\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0202o\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0005\u0015\u0000\u0000\u0204\u0205\u0005\u0017\u0000\u0000\u0205\u0206"+
		"\u0003(\u0014\u0000\u0206\u0207\u0005\u0018\u0000\u0000\u0207\u0216\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0005\u0015\u0000\u0000\u0209\u020a\u0005"+
		"\u0017\u0000\u0000\u020a\u020b\u0003(\u0014\u0000\u020b\u020c\u0005\u0014"+
		"\u0000\u0000\u020c\u020d\u0003n7\u0000\u020d\u020e\u0005\u0018\u0000\u0000"+
		"\u020e\u0216\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u0015\u0000\u0000"+
		"\u0210\u0211\u0005\u0017\u0000\u0000\u0211\u0212\u0003(\u0014\u0000\u0212"+
		"\u0213\u0003l6\u0000\u0213\u0214\u0005\u0018\u0000\u0000\u0214\u0216\u0001"+
		"\u0000\u0000\u0000\u0215\u0203\u0001\u0000\u0000\u0000\u0215\u0208\u0001"+
		"\u0000\u0000\u0000\u0215\u020f\u0001\u0000\u0000\u0000\u0216q\u0001\u0000"+
		"\u0000\u0000\u0217\u0219\u0003H$\u0000\u0218\u0217\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021d\u0001\u0000\u0000\u0000"+
		"\u021a\u021c\u0003p8\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c\u021f"+
		"\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0001\u0000\u0000\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u021d"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0003\u001c\u000e\u0000\u0221\u0222"+
		"\u0003\u0004\u0002\u0000\u0222\u0224\u0003Z-\u0000\u0223\u0225\u0003~"+
		"?\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u000b\u0000"+
		"\u0000\u0227\u0228\u0003b1\u0000\u0228s\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0003\u0014\n\u0000\u022a\u022b\u0003\u0002\u0001\u0000\u022b\u022c"+
		"\u0003\u0086C\u0000\u022cu\u0001\u0000\u0000\u0000\u022d\u022e\u0005\t"+
		"\u0000\u0000\u022e\u022f\u0005\u001a\u0000\u0000\u022f\u0230\u0003F#\u0000"+
		"\u0230\u0231\u0005\u001b\u0000\u0000\u0231\u0232\u0003\u0002\u0001\u0000"+
		"\u0232\u0233\u0003D\"\u0000\u0233w\u0001\u0000\u0000\u0000\u0234\u0237"+
		"\u0003\u0016\u000b\u0000\u0235\u0238\u0003v;\u0000\u0236\u0238\u0003t"+
		":\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0236\u0001\u0000\u0000"+
		"\u0000\u0238y\u0001\u0000\u0000\u0000\u0239\u023a\u0003\u001a\r\u0000"+
		"\u023a\u023e\u0003\u0002\u0001\u0000\u023b\u023c\u0003\b\u0004\u0000\u023c"+
		"\u023d\u0003(\u0014\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e\u023b"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f{\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0005<\u0000\u0000\u0241}\u0001\u0000\u0000"+
		"\u0000\u0242\u0252\u0005\u001f\u0000\u0000\u0243\u0244\u0005 \u0000\u0000"+
		"\u0244\u0249\u0003|>\u0000\u0245\u0246\u0005#\u0000\u0000\u0246\u0248"+
		"\u0003|>\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000"+
		"\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000"+
		"\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000"+
		"\u0000\u0000\u024c\u024e\u0005#\u0000\u0000\u024d\u024c\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0005!\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000"+
		"\u0251\u0242\u0001\u0000\u0000\u0000\u0251\u0243\u0001\u0000\u0000\u0000"+
		"\u0252\u007f\u0001\u0000\u0000\u0000\u0253\u0255\u0003H$\u0000\u0254\u0253"+
		"\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0259"+
		"\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0003\u0012\t\u0000\u025a\u025c\u0003(\u0014\u0000\u025b\u025d\u0003"+
		"~?\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u0014\u0000"+
		"\u0000\u025f\u0260\u0003b1\u0000\u0260\u0081\u0001\u0000\u0000\u0000\u0261"+
		"\u0268\u0005=\u0000\u0000\u0262\u0268\u0005<\u0000\u0000\u0263\u0264\u0005"+
		"\u0017\u0000\u0000\u0264\u0265\u0003b1\u0000\u0265\u0266\u0005\u0018\u0000"+
		"\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0261\u0001\u0000\u0000"+
		"\u0000\u0267\u0262\u0001\u0000\u0000\u0000\u0267\u0263\u0001\u0000\u0000"+
		"\u0000\u0268\u0083\u0001\u0000\u0000\u0000\u0269\u026b\u0003H$\u0000\u026a"+
		"\u0269\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c"+
		"\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d"+
		"\u0272\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f"+
		"\u0271\u0003p8\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0271\u0274\u0001"+
		"\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001"+
		"\u0000\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0272\u0001"+
		"\u0000\u0000\u0000\u0275\u0277\u0003\u0082A\u0000\u0276\u0278\u0003\u0010"+
		"\b\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0005%\u0000\u0000"+
		"\u027a\u027b\u0003b1\u0000\u027b\u0287\u0001\u0000\u0000\u0000\u027c\u027e"+
		"\u0003p8\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027e\u0281\u0001\u0000"+
		"\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280\u0283\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000"+
		"\u0000\u0000\u0282\u0284\u0005&\u0000\u0000\u0283\u0282\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000"+
		"\u0000\u0285\u0287\u0003b1\u0000\u0286\u026c\u0001\u0000\u0000\u0000\u0286"+
		"\u027f\u0001\u0000\u0000\u0000\u0287\u0085\u0001\u0000\u0000\u0000\u0288"+
		"\u0298\u0005\u001c\u0000\u0000\u0289\u028a\u0005\u001d\u0000\u0000\u028a"+
		"\u028f\u0003\u0084B\u0000\u028b\u028c\u0005#\u0000\u0000\u028c\u028e\u0003"+
		"\u0084B\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000"+
		"\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0292\u0294\u0005#\u0000\u0000\u0293\u0292\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0005\u001e\u0000\u0000\u0296\u0298\u0001\u0000\u0000"+
		"\u0000\u0297\u0288\u0001\u0000\u0000\u0000\u0297\u0289\u0001\u0000\u0000"+
		"\u0000\u0298\u0087\u0001\u0000\u0000\u0000\u0299\u029b\u0003H$\u0000\u029a"+
		"\u0299\u0001\u0000\u0000\u0000\u029b\u029e\u0001\u0000\u0000\u0000\u029c"+
		"\u029a\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d"+
		"\u029f\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029f"+
		"\u02a1\u0003\u0014\n\u0000\u02a0\u02a2\u0003(\u0014\u0000\u02a1\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a4\u0003\u0086C\u0000\u02a4\u0089\u0001"+
		"\u0000\u0000\u0000\u02a5\u02ac\u0003\u0088D\u0000\u02a6\u02ac\u0003F#"+
		"\u0000\u02a7\u02ac\u0003\u0080@\u0000\u02a8\u02ac\u0003z=\u0000\u02a9"+
		"\u02ac\u0003x<\u0000\u02aa\u02ac\u0003r9\u0000\u02ab\u02a5\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a6\u0001\u0000\u0000\u0000\u02ab\u02a7\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a8\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u008b\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000S\u00be\u00c2\u00c4\u00ca\u00d0\u00d6\u00d8\u00df\u00e4\u00e6"+
		"\u00ec\u00f3\u00f8\u00fa\u0102\u0104\u0111\u0114\u0118\u011e\u0123\u0129"+
		"\u0137\u013b\u013f\u0142\u0149\u014f\u0152\u0161\u0165\u0169\u0171\u017c"+
		"\u0184\u0188\u0195\u0199\u019d\u01ac\u01af\u01b4\u01ba\u01bc\u01c4\u01c9"+
		"\u01d0\u01d4\u01db\u01e0\u01e4\u01ea\u01ec\u01f0\u01f5\u01fa\u01fd\u0201"+
		"\u0215\u0218\u021d\u0224\u0237\u023e\u0249\u024d\u0251\u0256\u025c\u0267"+
		"\u026c\u0272\u0277\u027f\u0283\u0286\u028f\u0293\u0297\u029c\u02a1\u02ab"+
		"\u02ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}