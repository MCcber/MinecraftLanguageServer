// Generated from d:/C#Project/MinecraftLanguageServer/MCDocumentRule/mcdocParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mcdocParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, As=2, At=3, QuestionMark=4, Dot=5, TypeKey=6, StructKeyType=7, Minus=8, 
		Inject=9, Enum=10, Use=11, To=12, Dispatch=13, Fallback=14, None=15, Unknown=16, 
		Parent=17, Key=18, BaseDataType=19, Plus=20, Remainder=21, Equal=22, Sharp=23, 
		SquareBrackets=24, LeftSquareBracket=25, RightSquareBracket=26, RoundBrackets=27, 
		LeftRoundBracket=28, RightRoundBracket=29, CurlyBrackets=30, LeftCurlyBracket=31, 
		RightCurlyBracket=32, AngleBrackets=33, LeftAngleBracket=34, RightAngleBracket=35, 
		LogicalOR=36, Comma=37, DoubleColon=38, ColonMark=39, DoubleDot=40, TripleDot=41, 
		StringKeyType=42, BooleanKeyType=43, ByteKeyType=44, ShortKeyType=45, 
		IntKeyType=46, FloatKeyType=47, DoubleKeyType=48, LongKeyType=49, Any=50, 
		BoolValue=51, DocCommentary=52, Commentary=53, DoubleQuotes=54, TypedNumberLexer=55, 
		Integer=56, FloatExponent=57, Float=58, Number=59, PositiveInteger=60, 
		IntTypedUnit=61, FloatTypedUnit=62, IdentStart=63, IdentContinue=64, Identifier=65, 
		SingleStringValue=66, String=67, IntegerRange=68, FloatRange=69, ResourceLocationChar=70, 
		ResourceLocation=71, PathSegment=72, Path=73;
	public static final int
		RULE_logicalOR = 0, RULE_path = 1, RULE_resourceLocation = 2, RULE_at = 3, 
		RULE_as = 4, RULE_dot = 5, RULE_baseDataType = 6, RULE_keywordType = 7, 
		RULE_questionMark = 8, RULE_typeKey = 9, RULE_structKeyType = 10, RULE_inject = 11, 
		RULE_enum = 12, RULE_use = 13, RULE_dispatch = 14, RULE_doubleDot = 15, 
		RULE_integer = 16, RULE_float = 17, RULE_integerRange = 18, RULE_identifier = 19, 
		RULE_commentary = 20, RULE_docCommentary = 21, RULE_typedNumber = 22, 
		RULE_stringType = 23, RULE_literalType = 24, RULE_numericType = 25, RULE_primitiveArrayType = 26, 
		RULE_listType = 27, RULE_tupleType = 28, RULE_enumMemberType = 29, RULE_enumValue = 30, 
		RULE_enumField = 31, RULE_enumBlock = 32, RULE_enumType = 33, RULE_prelim = 34, 
		RULE_referenceType = 35, RULE_dispatcherType = 36, RULE_unionType = 37, 
		RULE_staticIndexKey = 38, RULE_accessor = 39, RULE_accessorKey = 40, RULE_dynamicIndex = 41, 
		RULE_indexWithOutDynamic = 42, RULE_indexWithDynamic = 43, RULE_indexBodyWithOutDynamic = 44, 
		RULE_indexBodyWithDynamic = 45, RULE_indexingOnAType = 46, RULE_typeArgBlock = 47, 
		RULE_unAttributedType = 48, RULE_typeSentence = 49, RULE_attributeSet = 50, 
		RULE_arrayLength = 51, RULE_string = 52, RULE_positionalValues = 53, RULE_namedValue = 54, 
		RULE_namedValues = 55, RULE_treeBody = 56, RULE_treeValue = 57, RULE_value = 58, 
		RULE_attribute = 59, RULE_dispatchStatement = 60, RULE_structInjection = 61, 
		RULE_enumInjection = 62, RULE_injection = 63, RULE_useStatement = 64, 
		RULE_typeParam = 65, RULE_typeParamBlock = 66, RULE_typeAlias = 67, RULE_structKey = 68, 
		RULE_structField = 69, RULE_structBlock = 70, RULE_struct = 71, RULE_file = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicalOR", "path", "resourceLocation", "at", "as", "dot", "baseDataType", 
			"keywordType", "questionMark", "typeKey", "structKeyType", "inject", 
			"enum", "use", "dispatch", "doubleDot", "integer", "float", "integerRange", 
			"identifier", "commentary", "docCommentary", "typedNumber", "stringType", 
			"literalType", "numericType", "primitiveArrayType", "listType", "tupleType", 
			"enumMemberType", "enumValue", "enumField", "enumBlock", "enumType", 
			"prelim", "referenceType", "dispatcherType", "unionType", "staticIndexKey", 
			"accessor", "accessorKey", "dynamicIndex", "indexWithOutDynamic", "indexWithDynamic", 
			"indexBodyWithOutDynamic", "indexBodyWithDynamic", "indexingOnAType", 
			"typeArgBlock", "unAttributedType", "typeSentence", "attributeSet", "arrayLength", 
			"string", "positionalValues", "namedValue", "namedValues", "treeBody", 
			"treeValue", "value", "attribute", "dispatchStatement", "structInjection", 
			"enumInjection", "injection", "useStatement", "typeParam", "typeParamBlock", 
			"typeAlias", "structKey", "structField", "structBlock", "struct", "file"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'as'", "'@'", "'?'", "'.'", "'type '", "'struct'", "'-'", 
			"'inject'", "'enum'", "'use'", "'to'", "'dispatch'", "'%fallback'", "'%none'", 
			"'%unknown'", "'%parent'", "'%key'", null, "'+'", "'%'", "'='", "'#'", 
			"'[]'", "'['", "']'", "'()'", "'('", "')'", "'{}'", "'{'", "'}'", "'<>'", 
			"'<'", "'>'", "'|'", "','", "'::'", "':'", "'..'", "'...'", "'string'", 
			"'boolean'", "'byte'", "'short'", "'int'", "'float'", "'double'", "'long'", 
			"'any'", null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "As", "At", "QuestionMark", "Dot", "TypeKey", "StructKeyType", 
			"Minus", "Inject", "Enum", "Use", "To", "Dispatch", "Fallback", "None", 
			"Unknown", "Parent", "Key", "BaseDataType", "Plus", "Remainder", "Equal", 
			"Sharp", "SquareBrackets", "LeftSquareBracket", "RightSquareBracket", 
			"RoundBrackets", "LeftRoundBracket", "RightRoundBracket", "CurlyBrackets", 
			"LeftCurlyBracket", "RightCurlyBracket", "AngleBrackets", "LeftAngleBracket", 
			"RightAngleBracket", "LogicalOR", "Comma", "DoubleColon", "ColonMark", 
			"DoubleDot", "TripleDot", "StringKeyType", "BooleanKeyType", "ByteKeyType", 
			"ShortKeyType", "IntKeyType", "FloatKeyType", "DoubleKeyType", "LongKeyType", 
			"Any", "BoolValue", "DocCommentary", "Commentary", "DoubleQuotes", "TypedNumberLexer", 
			"Integer", "FloatExponent", "Float", "Number", "PositiveInteger", "IntTypedUnit", 
			"FloatTypedUnit", "IdentStart", "IdentContinue", "Identifier", "SingleStringValue", 
			"String", "IntegerRange", "FloatRange", "ResourceLocationChar", "ResourceLocation", 
			"PathSegment", "Path"
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
	}

	public final LogicalORContext logicalOR() throws RecognitionException {
		LogicalORContext _localctx = new LogicalORContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logicalOR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
	}

	public final ResourceLocationContext resourceLocation() throws RecognitionException {
		ResourceLocationContext _localctx = new ResourceLocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_resourceLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public TerminalNode At() { return getToken(mcdocParserParser.At, 0); }
		public AtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at; }
	}

	public final AtContext at() throws RecognitionException {
		AtContext _localctx = new AtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		public TerminalNode As() { return getToken(mcdocParserParser.As, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		public TerminalNode Dot() { return getToken(mcdocParserParser.Dot, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		public TerminalNode BaseDataType() { return getToken(mcdocParserParser.BaseDataType, 0); }
		public BaseDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDataType; }
	}

	public final BaseDataTypeContext baseDataType() throws RecognitionException {
		BaseDataTypeContext _localctx = new BaseDataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_baseDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(BaseDataType);
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
	}

	public final KeywordTypeContext keywordType() throws RecognitionException {
		KeywordTypeContext _localctx = new KeywordTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_keywordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		public TerminalNode QuestionMark() { return getToken(mcdocParserParser.QuestionMark, 0); }
		public QuestionMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionMark; }
	}

	public final QuestionMarkContext questionMark() throws RecognitionException {
		QuestionMarkContext _localctx = new QuestionMarkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questionMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public TerminalNode TypeKey() { return getToken(mcdocParserParser.TypeKey, 0); }
		public TypeKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeKey; }
	}

	public final TypeKeyContext typeKey() throws RecognitionException {
		TypeKeyContext _localctx = new TypeKeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		public TerminalNode StructKeyType() { return getToken(mcdocParserParser.StructKeyType, 0); }
		public StructKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structKeyType; }
	}

	public final StructKeyTypeContext structKeyType() throws RecognitionException {
		StructKeyTypeContext _localctx = new StructKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structKeyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		public TerminalNode Inject() { return getToken(mcdocParserParser.Inject, 0); }
		public InjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inject; }
	}

	public final InjectContext inject() throws RecognitionException {
		InjectContext _localctx = new InjectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		public TerminalNode Enum() { return getToken(mcdocParserParser.Enum, 0); }
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		public TerminalNode Use() { return getToken(mcdocParserParser.Use, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		public TerminalNode Dispatch() { return getToken(mcdocParserParser.Dispatch, 0); }
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		public TerminalNode DoubleDot() { return getToken(mcdocParserParser.DoubleDot, 0); }
		public DoubleDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDot; }
	}

	public final DoubleDotContext doubleDot() throws RecognitionException {
		DoubleDotContext _localctx = new DoubleDotContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doubleDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
	}

	public final IntegerRangeContext integerRange() throws RecognitionException {
		IntegerRangeContext _localctx = new IntegerRangeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integerRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
	}

	public final CommentaryContext commentary() throws RecognitionException {
		CommentaryContext _localctx = new CommentaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
	}

	public final DocCommentaryContext docCommentary() throws RecognitionException {
		DocCommentaryContext _localctx = new DocCommentaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_docCommentary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
	}

	public final TypedNumberContext typedNumber() throws RecognitionException {
		TypedNumberContext _localctx = new TypedNumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typedNumber);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(190);
				integer();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntTypedUnit) {
					{
					setState(191);
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
				setState(194);
				float_();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FloatTypedUnit) {
					{
					setState(195);
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
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stringType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(StringKeyType);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(201);
				at();
				setState(202);
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
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 81937L) != 0)) ) {
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
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			baseDataType();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(209);
				at();
				setState(210);
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
	}

	public final PrimitiveArrayTypeContext primitiveArrayType() throws RecognitionException {
		PrimitiveArrayTypeContext _localctx = new PrimitiveArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveArrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 650910883643392L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(215);
				at();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(216);
					match(WS);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				integerRange();
				}
			}

			setState(226);
			match(SquareBrackets);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(227);
				match(WS);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(233);
				at();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(234);
					match(WS);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(240);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(241);
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
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
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
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(LeftSquareBracket);
			setState(247);
			typeSentence();
			setState(248);
			match(RightSquareBracket);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(249);
				at();
				setState(250);
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
		public List<TypeSentenceContext> typeSentence() {
			return getRuleContexts(TypeSentenceContext.class);
		}
		public TypeSentenceContext typeSentence(int i) {
			return getRuleContext(TypeSentenceContext.class,i);
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
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tupleType);
		int _la;
		try {
			int _alt;
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(254);
				match(LeftSquareBracket);
				setState(255);
				typeSentence();
				setState(256);
				match(Comma);
				setState(257);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(259);
				match(LeftSquareBracket);
				setState(260);
				typeSentence();
				setState(263); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(261);
						match(Comma);
						setState(262);
						typeSentence();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(267);
					match(Comma);
					}
				}

				setState(270);
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
	}

	public final EnumMemberTypeContext enumMemberType() throws RecognitionException {
		EnumMemberTypeContext _localctx = new EnumMemberTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumMemberType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1112705767309312L) != 0)) ) {
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
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumValue);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				typedNumber();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
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
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(280);
				prelim();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(286);
				attribute();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			identifier();
			setState(293);
			match(Equal);
			setState(294);
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
	}

	public final EnumBlockContext enumBlock() throws RecognitionException {
		EnumBlockContext _localctx = new EnumBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumBlock);
		int _la;
		try {
			int _alt;
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(297);
				match(LeftCurlyBracket);
				setState(298);
				enumField();
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						match(Comma);
						setState(300);
						enumField();
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(306);
					match(Comma);
					}
				}

				setState(309);
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
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(313);
				prelim();
				}
			}

			setState(316);
			enum_();
			setState(317);
			match(LeftRoundBracket);
			setState(318);
			enumMemberType();
			setState(319);
			match(RightRoundBracket);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(320);
				identifier();
				}
			}

			setState(323);
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
	}

	public final PrelimContext prelim() throws RecognitionException {
		PrelimContext _localctx = new PrelimContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_prelim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DocCommentary:
				{
				setState(325);
				docCommentary();
				}
				break;
			case Commentary:
				{
				setState(326);
				commentary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(329);
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
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
	}

	public final DispatcherTypeContext dispatcherType() throws RecognitionException {
		DispatcherTypeContext _localctx = new DispatcherTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dispatcherType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			resourceLocation();
			setState(335);
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
		public List<TypeSentenceContext> typeSentence() {
			return getRuleContexts(TypeSentenceContext.class);
		}
		public TypeSentenceContext typeSentence(int i) {
			return getRuleContext(TypeSentenceContext.class,i);
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
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unionType);
		int _la;
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RoundBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(RoundBrackets);
				}
				break;
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(338);
				match(LeftRoundBracket);
				setState(339);
				typeSentence();
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(340);
						logicalOR();
						setState(341);
						typeSentence();
						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LogicalOR) {
					{
					setState(348);
					logicalOR();
					}
				}

				setState(351);
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
		public TerminalNode Fallback() { return getToken(mcdocParserParser.Fallback, 0); }
		public TerminalNode None() { return getToken(mcdocParserParser.None, 0); }
		public TerminalNode Unknown() { return getToken(mcdocParserParser.Unknown, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public TerminalNode ResourceLocation() { return getToken(mcdocParserParser.ResourceLocation, 0); }
		public StaticIndexKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticIndexKey; }
	}

	public final StaticIndexKeyContext staticIndexKey() throws RecognitionException {
		StaticIndexKeyContext _localctx = new StaticIndexKeyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticIndexKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 155374187144282119L) != 0)) ) {
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
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			accessorKey();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 1407374883553283L) != 0)) {
				{
				{
				setState(358);
				accessorKey();
				}
				}
				setState(363);
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
		public TerminalNode Parent() { return getToken(mcdocParserParser.Parent, 0); }
		public TerminalNode Key() { return getToken(mcdocParserParser.Key, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public AccessorKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessorKey; }
	}

	public final AccessorKeyContext accessorKey() throws RecognitionException {
		AccessorKeyContext _localctx = new AccessorKeyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_accessorKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 1407374883553283L) != 0)) ) {
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
	}

	public final DynamicIndexContext dynamicIndex() throws RecognitionException {
		DynamicIndexContext _localctx = new DynamicIndexContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dynamicIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LeftSquareBracket);
			setState(367);
			accessor();
			setState(368);
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
	}

	public final IndexWithOutDynamicContext indexWithOutDynamic() throws RecognitionException {
		IndexWithOutDynamicContext _localctx = new IndexWithOutDynamicContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexWithOutDynamic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
	}

	public final IndexWithDynamicContext indexWithDynamic() throws RecognitionException {
		IndexWithDynamicContext _localctx = new IndexWithDynamicContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_indexWithDynamic);
		try {
			setState(374);
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
				setState(372);
				staticIndexKey();
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
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
	}

	public final IndexBodyWithOutDynamicContext indexBodyWithOutDynamic() throws RecognitionException {
		IndexBodyWithOutDynamicContext _localctx = new IndexBodyWithOutDynamicContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_indexBodyWithOutDynamic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(LeftSquareBracket);
			setState(377);
			indexWithOutDynamic();
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					match(Comma);
					setState(379);
					indexWithOutDynamic();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(385);
				match(Comma);
				}
			}

			setState(388);
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
	}

	public final IndexBodyWithDynamicContext indexBodyWithDynamic() throws RecognitionException {
		IndexBodyWithDynamicContext _localctx = new IndexBodyWithDynamicContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indexBodyWithDynamic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LeftSquareBracket);
			setState(391);
			indexWithDynamic();
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					match(Comma);
					setState(393);
					indexWithDynamic();
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(399);
				match(Comma);
				}
			}

			setState(402);
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
	}

	public final IndexingOnATypeContext indexingOnAType() throws RecognitionException {
		IndexingOnATypeContext _localctx = new IndexingOnATypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_indexingOnAType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		public List<TypeSentenceContext> typeSentence() {
			return getRuleContexts(TypeSentenceContext.class);
		}
		public TypeSentenceContext typeSentence(int i) {
			return getRuleContext(TypeSentenceContext.class,i);
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
	}

	public final TypeArgBlockContext typeArgBlock() throws RecognitionException {
		TypeArgBlockContext _localctx = new TypeArgBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeArgBlock);
		int _la;
		try {
			int _alt;
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(407);
				match(LeftAngleBracket);
				setState(408);
				typeSentence();
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						match(Comma);
						setState(410);
						typeSentence();
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(416);
					match(Comma);
					}
				}

				setState(419);
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
	}

	public final UnAttributedTypeContext unAttributedType() throws RecognitionException {
		UnAttributedTypeContext _localctx = new UnAttributedTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unAttributedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(423);
				keywordType();
				}
				break;
			case 2:
				{
				setState(424);
				stringType();
				}
				break;
			case 3:
				{
				setState(425);
				literalType();
				}
				break;
			case 4:
				{
				setState(426);
				numericType();
				}
				break;
			case 5:
				{
				setState(427);
				primitiveArrayType();
				}
				break;
			case 6:
				{
				setState(428);
				listType();
				}
				break;
			case 7:
				{
				setState(429);
				tupleType();
				}
				break;
			case 8:
				{
				setState(430);
				enumType();
				}
				break;
			case 9:
				{
				setState(431);
				struct();
				}
				break;
			case 10:
				{
				setState(432);
				referenceType();
				}
				break;
			case 11:
				{
				setState(433);
				dispatcherType();
				}
				break;
			case 12:
				{
				setState(434);
				unionType();
				}
				break;
			case 13:
				{
				setState(435);
				indexingOnAType();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(438);
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
		public TypeSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSentence; }
	}

	public final TypeSentenceContext typeSentence() throws RecognitionException {
		TypeSentenceContext _localctx = new TypeSentenceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(441);
				attribute();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			unAttributedType();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25803358208L) != 0)) {
				{
				setState(450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftSquareBracket:
					{
					setState(448);
					indexBodyWithDynamic();
					}
					break;
				case AngleBrackets:
				case LeftAngleBracket:
					{
					setState(449);
					typeArgBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(454);
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
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_attributeSet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					commentary();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(461);
				attribute();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					commentary();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(473);
				identifier();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Commentary) {
				{
				{
				setState(479);
				commentary();
				}
				}
				setState(484);
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
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			at();
			setState(486);
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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
	}

	public final PositionalValuesContext positionalValues() throws RecognitionException {
		PositionalValuesContext _localctx = new PositionalValuesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_positionalValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			value();
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(491);
					match(Comma);
					setState(492);
					value();
					}
					} 
				}
				setState(497);
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
	}

	public final NamedValueContext namedValue() throws RecognitionException {
		NamedValueContext _localctx = new NamedValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_namedValue);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				match(Equal);
				setState(503);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(507);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(505);
					identifier();
					}
					break;
				case String:
					{
					setState(506);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509);
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
	}

	public final NamedValuesContext namedValues() throws RecognitionException {
		NamedValuesContext _localctx = new NamedValuesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_namedValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			namedValue();
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					match(Comma);
					setState(515);
					namedValue();
					}
					} 
				}
				setState(520);
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
	}

	public final TreeBodyContext treeBody() throws RecognitionException {
		TreeBodyContext _localctx = new TreeBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_treeBody);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(521);
				positionalValues();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(522);
					match(Comma);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				namedValues();
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(526);
					match(Comma);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				positionalValues();
				setState(530);
				match(Comma);
				setState(531);
				namedValues();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(532);
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
	}

	public final TreeValueContext treeValue() throws RecognitionException {
		TreeValueContext _localctx = new TreeValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_treeValue);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(537);
				match(LeftRoundBracket);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53572607144363136L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 325L) != 0)) {
					{
					setState(538);
					treeBody();
					}
				}

				setState(541);
				match(RightRoundBracket);
				}
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(542);
				match(LeftSquareBracket);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53572607144363136L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 325L) != 0)) {
					{
					setState(543);
					treeBody();
					}
				}

				setState(546);
				match(RightSquareBracket);
				}
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(547);
				match(LeftCurlyBracket);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53572607144363136L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 325L) != 0)) {
					{
					setState(548);
					treeBody();
					}
				}

				setState(551);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_value);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				typeSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
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
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_attribute);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(558);
				match(Sharp);
				setState(559);
				match(LeftSquareBracket);
				setState(560);
				identifier();
				setState(561);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(563);
				match(Sharp);
				setState(564);
				match(LeftSquareBracket);
				setState(565);
				identifier();
				setState(566);
				match(Equal);
				setState(567);
				value();
				setState(568);
				match(RightSquareBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(570);
				match(Sharp);
				setState(571);
				match(LeftSquareBracket);
				setState(572);
				identifier();
				setState(573);
				treeValue();
				setState(574);
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
		public TerminalNode To() { return getToken(mcdocParserParser.To, 0); }
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
	}

	public final DispatchStatementContext dispatchStatement() throws RecognitionException {
		DispatchStatementContext _localctx = new DispatchStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dispatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(578);
				prelim();
				}
			}

			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(581);
				attribute();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			dispatch();
			setState(588);
			resourceLocation();
			setState(589);
			indexBodyWithOutDynamic();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(590);
				typeParamBlock();
				}
			}

			setState(593);
			match(To);
			setState(594);
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
	}

	public final StructInjectionContext structInjection() throws RecognitionException {
		StructInjectionContext _localctx = new StructInjectionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_structInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			structKeyType();
			setState(597);
			path();
			setState(598);
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
		public TerminalNode Enum() { return getToken(mcdocParserParser.Enum, 0); }
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
	}

	public final EnumInjectionContext enumInjection() throws RecognitionException {
		EnumInjectionContext _localctx = new EnumInjectionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enumInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(Enum);
			setState(601);
			match(LeftRoundBracket);
			setState(602);
			enumType();
			setState(603);
			match(RightRoundBracket);
			setState(604);
			path();
			setState(605);
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
	}

	public final InjectionContext injection() throws RecognitionException {
		InjectionContext _localctx = new InjectionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_injection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			inject();
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Enum:
				{
				setState(608);
				enumInjection();
				}
				break;
			case StructKeyType:
				{
				setState(609);
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
	}

	public final UseStatementContext useStatement() throws RecognitionException {
		UseStatementContext _localctx = new UseStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_useStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			use();
			setState(613);
			path();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(614);
				as();
				setState(615);
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
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
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
	}

	public final TypeParamBlockContext typeParamBlock() throws RecognitionException {
		TypeParamBlockContext _localctx = new TypeParamBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeParamBlock);
		int _la;
		try {
			int _alt;
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(622);
				match(LeftAngleBracket);
				setState(623);
				typeParam();
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(Comma);
						setState(625);
						typeParam();
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(631);
					match(Comma);
					}
				}

				setState(634);
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
		public TerminalNode Equal() { return getToken(mcdocParserParser.Equal, 0); }
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
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(638);
				prelim();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
			typeKey();
			setState(645);
			identifier();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(646);
				typeParamBlock();
				}
			}

			setState(649);
			match(Equal);
			setState(650);
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
		public TerminalNode String() { return getToken(mcdocParserParser.String, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParserParser.Identifier, 0); }
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParserParser.LeftSquareBracket, 0); }
		public TypeSentenceContext typeSentence() {
			return getRuleContext(TypeSentenceContext.class,0);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParserParser.RightSquareBracket, 0); }
		public StructKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structKey; }
	}

	public final StructKeyContext structKey() throws RecognitionException {
		StructKeyContext _localctx = new StructKeyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_structKey);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(String);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(Identifier);
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(654);
				match(LeftSquareBracket);
				setState(655);
				typeSentence();
				setState(656);
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
		public TerminalNode TripleDot() { return getToken(mcdocParserParser.TripleDot, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_structField);
		int _la;
		try {
			int _alt;
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DocCommentary || _la==Commentary) {
					{
					{
					setState(660);
					prelim();
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Sharp) {
					{
					{
					setState(666);
					attribute();
					}
					}
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(672);
				structKey();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(673);
					questionMark();
					}
				}

				setState(676);
				match(ColonMark);
				setState(677);
				typeSentence();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(679);
						attribute();
						}
						} 
					}
					setState(684);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TripleDot) {
					{
					setState(685);
					match(TripleDot);
					}
				}

				setState(688);
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
	}

	public final StructBlockContext structBlock() throws RecognitionException {
		StructBlockContext _localctx = new StructBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_structBlock);
		int _la;
		try {
			int _alt;
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(692);
				match(LeftCurlyBracket);
				setState(693);
				structField();
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(694);
						match(Comma);
						setState(695);
						structField();
						}
						} 
					}
					setState(700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(701);
					match(Comma);
					}
				}

				setState(704);
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
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(708);
				prelim();
				}
			}

			setState(711);
			structKeyType();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(712);
				identifier();
				}
			}

			setState(715);
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
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13510798890512064L) != 0)) {
				{
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(717);
					struct();
					}
					break;
				case 2:
					{
					setState(718);
					enumType();
					}
					break;
				case 3:
					{
					setState(719);
					typeAlias();
					}
					break;
				case 4:
					{
					setState(720);
					useStatement();
					}
					break;
				case 5:
					{
					setState(721);
					injection();
					}
					break;
				case 6:
					{
					setState(722);
					dispatchStatement();
					}
					break;
				}
				}
				setState(727);
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
		"\u0004\u0001I\u02d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00c1\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00c5\b\u0016\u0003\u0016\u00c7\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00cd\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00d5\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00da\b\u001a\n\u001a\f\u001a\u00dd\t\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00e1\b\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00e5\b\u001a"+
		"\n\u001a\f\u001a\u00e8\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00ec"+
		"\b\u001a\n\u001a\f\u001a\u00ef\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u00f3\b\u001a\u0003\u001a\u00f5\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00fd\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u0108\b\u001c\u000b\u001c\f"+
		"\u001c\u0109\u0001\u001c\u0003\u001c\u010d\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0111\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0117\b\u001e\u0001\u001f\u0005\u001f\u011a\b\u001f\n\u001f"+
		"\f\u001f\u011d\t\u001f\u0001\u001f\u0005\u001f\u0120\b\u001f\n\u001f\f"+
		"\u001f\u0123\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u012e\b \n \f \u0131\t \u0001 \u0003"+
		" \u0134\b \u0001 \u0001 \u0003 \u0138\b \u0001!\u0003!\u013b\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0142\b!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0003\"\u0148\b\"\u0001\"\u0003\"\u014b\b\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0158\b%\n%"+
		"\f%\u015b\t%\u0001%\u0003%\u015e\b%\u0001%\u0001%\u0003%\u0162\b%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0005\'\u0168\b\'\n\'\f\'\u016b\t\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0003+\u0177"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0005,\u017d\b,\n,\f,\u0180\t,\u0001,"+
		"\u0003,\u0183\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0005-\u018b"+
		"\b-\n-\f-\u018e\t-\u0001-\u0003-\u0191\b-\u0001-\u0001-\u0001.\u0001."+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u019c\b/\n/\f/\u019f\t/\u0001"+
		"/\u0003/\u01a2\b/\u0001/\u0001/\u0003/\u01a6\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0003"+
		"0\u01b5\b0\u00010\u00030\u01b8\b0\u00011\u00051\u01bb\b1\n1\f1\u01be\t"+
		"1\u00011\u00011\u00011\u00051\u01c3\b1\n1\f1\u01c6\t1\u00012\u00052\u01c9"+
		"\b2\n2\f2\u01cc\t2\u00012\u00052\u01cf\b2\n2\f2\u01d2\t2\u00012\u0005"+
		"2\u01d5\b2\n2\f2\u01d8\t2\u00012\u00052\u01db\b2\n2\f2\u01de\t2\u0001"+
		"2\u00052\u01e1\b2\n2\f2\u01e4\t2\u00013\u00013\u00013\u00014\u00014\u0001"+
		"5\u00015\u00015\u00055\u01ee\b5\n5\f5\u01f1\t5\u00016\u00016\u00036\u01f5"+
		"\b6\u00016\u00016\u00016\u00016\u00016\u00036\u01fc\b6\u00016\u00016\u0003"+
		"6\u0200\b6\u00017\u00017\u00017\u00057\u0205\b7\n7\f7\u0208\t7\u00018"+
		"\u00018\u00038\u020c\b8\u00018\u00018\u00038\u0210\b8\u00018\u00018\u0001"+
		"8\u00018\u00038\u0216\b8\u00038\u0218\b8\u00019\u00019\u00039\u021c\b"+
		"9\u00019\u00019\u00019\u00039\u0221\b9\u00019\u00019\u00019\u00039\u0226"+
		"\b9\u00019\u00039\u0229\b9\u0001:\u0001:\u0003:\u022d\b:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0241\b;\u0001<\u0003"+
		"<\u0244\b<\u0001<\u0005<\u0247\b<\n<\f<\u024a\t<\u0001<\u0001<\u0001<"+
		"\u0001<\u0003<\u0250\b<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001"+
		"?\u0003?\u0263\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u026a\b@\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0273\bB\nB\fB\u0276"+
		"\tB\u0001B\u0003B\u0279\bB\u0001B\u0001B\u0003B\u027d\bB\u0001C\u0005"+
		"C\u0280\bC\nC\fC\u0283\tC\u0001C\u0001C\u0001C\u0003C\u0288\bC\u0001C"+
		"\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0293"+
		"\bD\u0001E\u0005E\u0296\bE\nE\fE\u0299\tE\u0001E\u0005E\u029c\bE\nE\f"+
		"E\u029f\tE\u0001E\u0001E\u0003E\u02a3\bE\u0001E\u0001E\u0001E\u0001E\u0005"+
		"E\u02a9\bE\nE\fE\u02ac\tE\u0001E\u0003E\u02af\bE\u0001E\u0003E\u02b2\b"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u02b9\bF\nF\fF\u02bc\tF\u0001"+
		"F\u0003F\u02bf\bF\u0001F\u0001F\u0003F\u02c3\bF\u0001G\u0003G\u02c6\b"+
		"G\u0001G\u0001G\u0003G\u02ca\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0005H\u02d4\bH\nH\fH\u02d7\tH\u0001H\u0000\u0000I\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0000\u0006\u0001\u000023\u0004\u0000"+
		"3377AACC\u0003\u0000,,..11\u0002\u0000**,1\u0004\u0000\u000e\u0010AAC"+
		"CGG\u0003\u0000\u0011\u0012AACC\u02f8\u0000\u0092\u0001\u0000\u0000\u0000"+
		"\u0002\u0094\u0001\u0000\u0000\u0000\u0004\u0096\u0001\u0000\u0000\u0000"+
		"\u0006\u0098\u0001\u0000\u0000\u0000\b\u009a\u0001\u0000\u0000\u0000\n"+
		"\u009c\u0001\u0000\u0000\u0000\f\u009e\u0001\u0000\u0000\u0000\u000e\u00a0"+
		"\u0001\u0000\u0000\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00a4"+
		"\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00a8"+
		"\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00ac"+
		"\u0001\u0000\u0000\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e\u00b0"+
		"\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b4\u0001"+
		"\u0000\u0000\u0000$\u00b6\u0001\u0000\u0000\u0000&\u00b8\u0001\u0000\u0000"+
		"\u0000(\u00ba\u0001\u0000\u0000\u0000*\u00bc\u0001\u0000\u0000\u0000,"+
		"\u00c6\u0001\u0000\u0000\u0000.\u00c8\u0001\u0000\u0000\u00000\u00ce\u0001"+
		"\u0000\u0000\u00002\u00d0\u0001\u0000\u0000\u00004\u00d6\u0001\u0000\u0000"+
		"\u00006\u00f6\u0001\u0000\u0000\u00008\u0110\u0001\u0000\u0000\u0000:"+
		"\u0112\u0001\u0000\u0000\u0000<\u0116\u0001\u0000\u0000\u0000>\u011b\u0001"+
		"\u0000\u0000\u0000@\u0137\u0001\u0000\u0000\u0000B\u013a\u0001\u0000\u0000"+
		"\u0000D\u0147\u0001\u0000\u0000\u0000F\u014c\u0001\u0000\u0000\u0000H"+
		"\u014e\u0001\u0000\u0000\u0000J\u0161\u0001\u0000\u0000\u0000L\u0163\u0001"+
		"\u0000\u0000\u0000N\u0165\u0001\u0000\u0000\u0000P\u016c\u0001\u0000\u0000"+
		"\u0000R\u016e\u0001\u0000\u0000\u0000T\u0172\u0001\u0000\u0000\u0000V"+
		"\u0176\u0001\u0000\u0000\u0000X\u0178\u0001\u0000\u0000\u0000Z\u0186\u0001"+
		"\u0000\u0000\u0000\\\u0194\u0001\u0000\u0000\u0000^\u01a5\u0001\u0000"+
		"\u0000\u0000`\u01b4\u0001\u0000\u0000\u0000b\u01bc\u0001\u0000\u0000\u0000"+
		"d\u01ca\u0001\u0000\u0000\u0000f\u01e5\u0001\u0000\u0000\u0000h\u01e8"+
		"\u0001\u0000\u0000\u0000j\u01ea\u0001\u0000\u0000\u0000l\u01ff\u0001\u0000"+
		"\u0000\u0000n\u0201\u0001\u0000\u0000\u0000p\u0217\u0001\u0000\u0000\u0000"+
		"r\u0228\u0001\u0000\u0000\u0000t\u022c\u0001\u0000\u0000\u0000v\u0240"+
		"\u0001\u0000\u0000\u0000x\u0243\u0001\u0000\u0000\u0000z\u0254\u0001\u0000"+
		"\u0000\u0000|\u0258\u0001\u0000\u0000\u0000~\u025f\u0001\u0000\u0000\u0000"+
		"\u0080\u0264\u0001\u0000\u0000\u0000\u0082\u026b\u0001\u0000\u0000\u0000"+
		"\u0084\u027c\u0001\u0000\u0000\u0000\u0086\u0281\u0001\u0000\u0000\u0000"+
		"\u0088\u0292\u0001\u0000\u0000\u0000\u008a\u02b1\u0001\u0000\u0000\u0000"+
		"\u008c\u02c2\u0001\u0000\u0000\u0000\u008e\u02c5\u0001\u0000\u0000\u0000"+
		"\u0090\u02d5\u0001\u0000\u0000\u0000\u0092\u0093\u0005$\u0000\u0000\u0093"+
		"\u0001\u0001\u0000\u0000\u0000\u0094\u0095\u0005I\u0000\u0000\u0095\u0003"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005G\u0000\u0000\u0097\u0005\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u0007\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0002\u0000\u0000\u009b\t\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d\u000b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0013\u0000\u0000\u009f\r\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u0011\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5\u0013\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u0015\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u0017\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u0019\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005\u000b\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\r\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005(\u0000\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"8\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005:\u0000"+
		"\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005D\u0000\u0000\u00b7"+
		"%\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005A\u0000\u0000\u00b9\'\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u00055\u0000\u0000\u00bb)\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u00054\u0000\u0000\u00bd+\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0003 \u0010\u0000\u00bf\u00c1\u0005=\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0003\"\u0011\u0000\u00c3\u00c5\u0005>"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00be\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7-\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cc\u0005*\u0000\u0000\u00c9\u00ca\u0003\u0006\u0003\u0000"+
		"\u00ca\u00cb\u0005D\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"/\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d4\u0003\f\u0006\u0000\u00d1\u00d2\u0003\u0006"+
		"\u0003\u0000\u00d2\u00d3\u0003$\u0012\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d53\u0001\u0000\u0000\u0000\u00d6\u00e0\u0007\u0002\u0000\u0000"+
		"\u00d7\u00db\u0003\u0006\u0003\u0000\u00d8\u00da\u0005\u0001\u0000\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0003$\u0012\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d7\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e6\u0005\u0018\u0000\u0000\u00e3"+
		"\u00e5\u0005\u0001\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00f4\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ed\u0003\u0006\u0003\u0000\u00ea"+
		"\u00ec\u0005\u0001\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f2\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0003$\u0012\u0000\u00f1\u00f3"+
		"\u0003 \u0010\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00e9\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f55\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\u0019\u0000\u0000\u00f7\u00f8\u0003b1\u0000"+
		"\u00f8\u00fc\u0005\u001a\u0000\u0000\u00f9\u00fa\u0003\u0006\u0003\u0000"+
		"\u00fa\u00fb\u0003$\u0012\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"7\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0019\u0000\u0000\u00ff\u0100"+
		"\u0003b1\u0000\u0100\u0101\u0005%\u0000\u0000\u0101\u0102\u0005\u001a"+
		"\u0000\u0000\u0102\u0111\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0019"+
		"\u0000\u0000\u0104\u0107\u0003b1\u0000\u0105\u0106\u0005%\u0000\u0000"+
		"\u0106\u0108\u0003b1\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u010d"+
		"\u0005%\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"\u001a\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u00fe\u0001"+
		"\u0000\u0000\u0000\u0110\u0103\u0001\u0000\u0000\u0000\u01119\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0007\u0003\u0000\u0000\u0113;\u0001\u0000\u0000"+
		"\u0000\u0114\u0117\u0003,\u0016\u0000\u0115\u0117\u0003h4\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117"+
		"=\u0001\u0000\u0000\u0000\u0118\u011a\u0003D\"\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u0121\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0120\u0003"+
		"v;\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0003&\u0013\u0000\u0125\u0126\u0005\u0016\u0000\u0000"+
		"\u0126\u0127\u0003<\u001e\u0000\u0127?\u0001\u0000\u0000\u0000\u0128\u0138"+
		"\u0005\u001e\u0000\u0000\u0129\u012a\u0005\u001f\u0000\u0000\u012a\u012f"+
		"\u0003>\u001f\u0000\u012b\u012c\u0005%\u0000\u0000\u012c\u012e\u0003>"+
		"\u001f\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0005%\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005 \u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0128\u0001\u0000\u0000\u0000\u0137\u0129\u0001\u0000\u0000\u0000"+
		"\u0138A\u0001\u0000\u0000\u0000\u0139\u013b\u0003D\"\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0003\u0018\f\u0000\u013d\u013e\u0005"+
		"\u001c\u0000\u0000\u013e\u013f\u0003:\u001d\u0000\u013f\u0141\u0005\u001d"+
		"\u0000\u0000\u0140\u0142\u0003&\u0013\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0003@ \u0000\u0144C\u0001\u0000\u0000\u0000\u0145"+
		"\u0148\u0003*\u0015\u0000\u0146\u0148\u0003(\u0014\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014a\u0001"+
		"\u0000\u0000\u0000\u0149\u014b\u0003v;\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014bE\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005I\u0000\u0000\u014dG\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0003\u0004\u0002\u0000\u014f\u0150\u0003Z-\u0000\u0150I\u0001\u0000"+
		"\u0000\u0000\u0151\u0162\u0005\u001b\u0000\u0000\u0152\u0153\u0005\u001c"+
		"\u0000\u0000\u0153\u0159\u0003b1\u0000\u0154\u0155\u0003\u0000\u0000\u0000"+
		"\u0155\u0156\u0003b1\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0154"+
		"\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015d"+
		"\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015e"+
		"\u0003\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0005\u001d\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0151"+
		"\u0001\u0000\u0000\u0000\u0161\u0152\u0001\u0000\u0000\u0000\u0162K\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0007\u0004\u0000\u0000\u0164M\u0001\u0000"+
		"\u0000\u0000\u0165\u0169\u0003P(\u0000\u0166\u0168\u0003P(\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"O\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0007\u0005\u0000\u0000\u016dQ\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u0019\u0000\u0000\u016f\u0170\u0003N\'\u0000\u0170\u0171\u0005\u001a"+
		"\u0000\u0000\u0171S\u0001\u0000\u0000\u0000\u0172\u0173\u0003L&\u0000"+
		"\u0173U\u0001\u0000\u0000\u0000\u0174\u0177\u0003L&\u0000\u0175\u0177"+
		"\u0003R)\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000"+
		"\u0000\u0000\u0177W\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0019\u0000"+
		"\u0000\u0179\u017e\u0003T*\u0000\u017a\u017b\u0005%\u0000\u0000\u017b"+
		"\u017d\u0003T*\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0005%\u0000\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0005\u001a\u0000\u0000\u0185Y\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0005\u0019\u0000\u0000\u0187\u018c\u0003V+\u0000\u0188"+
		"\u0189\u0005%\u0000\u0000\u0189\u018b\u0003V+\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0190\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0191\u0005"+
		"%\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u001a"+
		"\u0000\u0000\u0193[\u0001\u0000\u0000\u0000\u0194\u0195\u0003Z-\u0000"+
		"\u0195]\u0001\u0000\u0000\u0000\u0196\u01a6\u0005!\u0000\u0000\u0197\u0198"+
		"\u0005\"\u0000\u0000\u0198\u019d\u0003b1\u0000\u0199\u019a\u0005%\u0000"+
		"\u0000\u019a\u019c\u0003b1\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005%\u0000\u0000\u01a1\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005#\u0000\u0000\u01a4\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a5\u0196\u0001\u0000\u0000\u0000\u01a5\u0197\u0001"+
		"\u0000\u0000\u0000\u01a6_\u0001\u0000\u0000\u0000\u01a7\u01b5\u0003\u000e"+
		"\u0007\u0000\u01a8\u01b5\u0003.\u0017\u0000\u01a9\u01b5\u00030\u0018\u0000"+
		"\u01aa\u01b5\u00032\u0019\u0000\u01ab\u01b5\u00034\u001a\u0000\u01ac\u01b5"+
		"\u00036\u001b\u0000\u01ad\u01b5\u00038\u001c\u0000\u01ae\u01b5\u0003B"+
		"!\u0000\u01af\u01b5\u0003\u008eG\u0000\u01b0\u01b5\u0003F#\u0000\u01b1"+
		"\u01b5\u0003H$\u0000\u01b2\u01b5\u0003J%\u0000\u01b3\u01b5\u0003\\.\u0000"+
		"\u01b4\u01a7\u0001\u0000\u0000\u0000\u01b4\u01a8\u0001\u0000\u0000\u0000"+
		"\u01b4\u01a9\u0001\u0000\u0000\u0000\u01b4\u01aa\u0001\u0000\u0000\u0000"+
		"\u01b4\u01ab\u0001\u0000\u0000\u0000\u01b4\u01ac\u0001\u0000\u0000\u0000"+
		"\u01b4\u01ad\u0001\u0000\u0000\u0000\u01b4\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b4\u01af\u0001\u0000\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b8\u0005%\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8a\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\u0003v;\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c4\u0003`0\u0000\u01c0\u01c3\u0003Z-\u0000\u01c1"+
		"\u01c3\u0003^/\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5c\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c9\u0003(\u0014"+
		"\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01d0\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cf\u0003v;\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d6\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003(\u0014\u0000\u01d4\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01dc"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01db"+
		"\u0003&\u0013\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01dd\u01e2\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01df\u01e1\u0003(\u0014\u0000\u01e0\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3e\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003\u0006\u0003"+
		"\u0000\u01e6\u01e7\u0005<\u0000\u0000\u01e7g\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0005C\u0000\u0000\u01e9i\u0001\u0000\u0000\u0000\u01ea\u01ef\u0003"+
		"t:\u0000\u01eb\u01ec\u0005%\u0000\u0000\u01ec\u01ee\u0003t:\u0000\u01ed"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
		"k\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f5"+
		"\u0003&\u0013\u0000\u01f3\u01f5\u0003h4\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0005\u0016\u0000\u0000\u01f7\u01f8\u0003t:\u0000"+
		"\u01f8\u0200\u0001\u0000\u0000\u0000\u01f9\u01fc\u0003&\u0013\u0000\u01fa"+
		"\u01fc\u0003h4\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0003"+
		"r9\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01f4\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fb\u0001\u0000\u0000\u0000\u0200m\u0001\u0000\u0000\u0000"+
		"\u0201\u0206\u0003l6\u0000\u0202\u0203\u0005%\u0000\u0000\u0203\u0205"+
		"\u0003l6\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000"+
		"\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000"+
		"\u0000\u0000\u0207o\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000"+
		"\u0000\u0209\u020b\u0003j5\u0000\u020a\u020c\u0005%\u0000\u0000\u020b"+
		"\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u0218\u0001\u0000\u0000\u0000\u020d\u020f\u0003n7\u0000\u020e\u0210\u0005"+
		"%\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0218\u0001\u0000\u0000\u0000\u0211\u0212\u0003j5\u0000"+
		"\u0212\u0213\u0005%\u0000\u0000\u0213\u0215\u0003n7\u0000\u0214\u0216"+
		"\u0005%\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0209\u0001"+
		"\u0000\u0000\u0000\u0217\u020d\u0001\u0000\u0000\u0000\u0217\u0211\u0001"+
		"\u0000\u0000\u0000\u0218q\u0001\u0000\u0000\u0000\u0219\u021b\u0005\u001c"+
		"\u0000\u0000\u021a\u021c\u0003p8\u0000\u021b\u021a\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021d\u0229\u0005\u001d\u0000\u0000\u021e\u0220\u0005\u0019\u0000\u0000"+
		"\u021f\u0221\u0003p8\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0229"+
		"\u0005\u001a\u0000\u0000\u0223\u0225\u0005\u001f\u0000\u0000\u0224\u0226"+
		"\u0003p8\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0229\u0005 \u0000"+
		"\u0000\u0228\u0219\u0001\u0000\u0000\u0000\u0228\u021e\u0001\u0000\u0000"+
		"\u0000\u0228\u0223\u0001\u0000\u0000\u0000\u0229s\u0001\u0000\u0000\u0000"+
		"\u022a\u022d\u0003b1\u0000\u022b\u022d\u0003r9\u0000\u022c\u022a\u0001"+
		"\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022du\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0005\u0017\u0000\u0000\u022f\u0230\u0005\u0019"+
		"\u0000\u0000\u0230\u0231\u0003&\u0013\u0000\u0231\u0232\u0005\u001a\u0000"+
		"\u0000\u0232\u0241\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0017\u0000"+
		"\u0000\u0234\u0235\u0005\u0019\u0000\u0000\u0235\u0236\u0003&\u0013\u0000"+
		"\u0236\u0237\u0005\u0016\u0000\u0000\u0237\u0238\u0003t:\u0000\u0238\u0239"+
		"\u0005\u001a\u0000\u0000\u0239\u0241\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0005\u0017\u0000\u0000\u023b\u023c\u0005\u0019\u0000\u0000\u023c\u023d"+
		"\u0003&\u0013\u0000\u023d\u023e\u0003r9\u0000\u023e\u023f\u0005\u001a"+
		"\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u022e\u0001\u0000"+
		"\u0000\u0000\u0240\u0233\u0001\u0000\u0000\u0000\u0240\u023a\u0001\u0000"+
		"\u0000\u0000\u0241w\u0001\u0000\u0000\u0000\u0242\u0244\u0003D\"\u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000"+
		"\u0244\u0248\u0001\u0000\u0000\u0000\u0245\u0247\u0003v;\u0000\u0246\u0245"+
		"\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b"+
		"\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u0003\u001c\u000e\u0000\u024c\u024d\u0003\u0004\u0002\u0000\u024d\u024f"+
		"\u0003X,\u0000\u024e\u0250\u0003\u0084B\u0000\u024f\u024e\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\u0005\f\u0000\u0000\u0252\u0253\u0003b1\u0000"+
		"\u0253y\u0001\u0000\u0000\u0000\u0254\u0255\u0003\u0014\n\u0000\u0255"+
		"\u0256\u0003\u0002\u0001\u0000\u0256\u0257\u0003\u008cF\u0000\u0257{\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0005\n\u0000\u0000\u0259\u025a\u0005\u001c"+
		"\u0000\u0000\u025a\u025b\u0003B!\u0000\u025b\u025c\u0005\u001d\u0000\u0000"+
		"\u025c\u025d\u0003\u0002\u0001\u0000\u025d\u025e\u0003@ \u0000\u025e}"+
		"\u0001\u0000\u0000\u0000\u025f\u0262\u0003\u0016\u000b\u0000\u0260\u0263"+
		"\u0003|>\u0000\u0261\u0263\u0003z=\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0263\u007f\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0003\u001a\r\u0000\u0265\u0269\u0003\u0002\u0001\u0000"+
		"\u0266\u0267\u0003\b\u0004\u0000\u0267\u0268\u0003&\u0013\u0000\u0268"+
		"\u026a\u0001\u0000\u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a\u0081\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0005A\u0000\u0000\u026c\u0083\u0001\u0000\u0000\u0000\u026d\u027d"+
		"\u0005!\u0000\u0000\u026e\u026f\u0005\"\u0000\u0000\u026f\u0274\u0003"+
		"\u0082A\u0000\u0270\u0271\u0005%\u0000\u0000\u0271\u0273\u0003\u0082A"+
		"\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0005%\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0005#\u0000\u0000\u027b\u027d\u0001\u0000\u0000\u0000\u027c"+
		"\u026d\u0001\u0000\u0000\u0000\u027c\u026e\u0001\u0000\u0000\u0000\u027d"+
		"\u0085\u0001\u0000\u0000\u0000\u027e\u0280\u0003D\"\u0000\u027f\u027e"+
		"\u0001\u0000\u0000\u0000\u0280\u0283\u0001\u0000\u0000\u0000\u0281\u027f"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0284"+
		"\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0003\u0012\t\u0000\u0285\u0287\u0003&\u0013\u0000\u0286\u0288\u0003"+
		"\u0084B\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0005\u0016"+
		"\u0000\u0000\u028a\u028b\u0003b1\u0000\u028b\u0087\u0001\u0000\u0000\u0000"+
		"\u028c\u0293\u0005C\u0000\u0000\u028d\u0293\u0005A\u0000\u0000\u028e\u028f"+
		"\u0005\u0019\u0000\u0000\u028f\u0290\u0003b1\u0000\u0290\u0291\u0005\u001a"+
		"\u0000\u0000\u0291\u0293\u0001\u0000\u0000\u0000\u0292\u028c\u0001\u0000"+
		"\u0000\u0000\u0292\u028d\u0001\u0000\u0000\u0000\u0292\u028e\u0001\u0000"+
		"\u0000\u0000\u0293\u0089\u0001\u0000\u0000\u0000\u0294\u0296\u0003D\""+
		"\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000"+
		"\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u029d\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000"+
		"\u0000\u029a\u029c\u0003v;\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c"+
		"\u029f\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d"+
		"\u029e\u0001\u0000\u0000\u0000\u029e\u02a0\u0001\u0000\u0000\u0000\u029f"+
		"\u029d\u0001\u0000\u0000\u0000\u02a0\u02a2\u0003\u0088D\u0000\u02a1\u02a3"+
		"\u0003\u0010\b\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005"+
		"\'\u0000\u0000\u02a5\u02a6\u0003b1\u0000\u02a6\u02b2\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a9\u0003v;\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9"+
		"\u02ac\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac"+
		"\u02aa\u0001\u0000\u0000\u0000\u02ad\u02af\u0005)\u0000\u0000\u02ae\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b2\u0003b1\u0000\u02b1\u0297\u0001\u0000"+
		"\u0000\u0000\u02b1\u02aa\u0001\u0000\u0000\u0000\u02b2\u008b\u0001\u0000"+
		"\u0000\u0000\u02b3\u02c3\u0005\u001e\u0000\u0000\u02b4\u02b5\u0005\u001f"+
		"\u0000\u0000\u02b5\u02ba\u0003\u008aE\u0000\u02b6\u02b7\u0005%\u0000\u0000"+
		"\u02b7\u02b9\u0003\u008aE\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9"+
		"\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005%\u0000\u0000\u02be\u02bd"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005 \u0000\u0000\u02c1\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c2\u02b3\u0001\u0000\u0000\u0000\u02c2\u02b4\u0001"+
		"\u0000\u0000\u0000\u02c3\u008d\u0001\u0000\u0000\u0000\u02c4\u02c6\u0003"+
		"D\"\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003\u0014"+
		"\n\u0000\u02c8\u02ca\u0003&\u0013\u0000\u02c9\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0003\u008cF\u0000\u02cc\u008f\u0001\u0000\u0000\u0000"+
		"\u02cd\u02d4\u0003\u008eG\u0000\u02ce\u02d4\u0003B!\u0000\u02cf\u02d4"+
		"\u0003\u0086C\u0000\u02d0\u02d4\u0003\u0080@\u0000\u02d1\u02d4\u0003~"+
		"?\u0000\u02d2\u02d4\u0003x<\u0000\u02d3\u02cd\u0001\u0000\u0000\u0000"+
		"\u02d3\u02ce\u0001\u0000\u0000\u0000\u02d3\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d6\u0091\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"V\u00c0\u00c4\u00c6\u00cc\u00d4\u00db\u00e0\u00e6\u00ed\u00f2\u00f4\u00fc"+
		"\u0109\u010c\u0110\u0116\u011b\u0121\u012f\u0133\u0137\u013a\u0141\u0147"+
		"\u014a\u0159\u015d\u0161\u0169\u0176\u017e\u0182\u018c\u0190\u019d\u01a1"+
		"\u01a5\u01b4\u01b7\u01bc\u01c2\u01c4\u01ca\u01d0\u01d6\u01dc\u01e2\u01ef"+
		"\u01f4\u01fb\u01ff\u0206\u020b\u020f\u0215\u0217\u021b\u0220\u0225\u0228"+
		"\u022c\u0240\u0243\u0248\u024f\u0262\u0269\u0274\u0278\u027c\u0281\u0287"+
		"\u0292\u0297\u029d\u02a2\u02aa\u02ae\u02b1\u02ba\u02be\u02c2\u02c5\u02c9"+
		"\u02d3\u02d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}