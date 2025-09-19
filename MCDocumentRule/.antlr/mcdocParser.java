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
public class mcdocParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		Commentary=51, DoubleQuotes=52, TypedNumberLexer=53, Integer=54, Float=55, 
		PositiveInteger=56, IntTypedUnit=57, FloatTypedUnit=58, IntegerRange=59, 
		FloatRange=60, Identifier=61, String=62, ResourceLocationChar=63, ResourceLocation=64, 
		PathSegment=65, Path=66;
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
			"Commentary", "DoubleQuotes", "TypedNumberLexer", "Integer", "Float", 
			"PositiveInteger", "IntTypedUnit", "FloatTypedUnit", "IntegerRange", 
			"FloatRange", "Identifier", "String", "ResourceLocationChar", "ResourceLocation", 
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
		public TerminalNode Path() { return getToken(mcdocParser.Path, 0); }
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
		public TerminalNode ResourceLocation() { return getToken(mcdocParser.ResourceLocation, 0); }
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
		public TerminalNode At() { return getToken(mcdocParser.At, 0); }
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
		public TerminalNode As() { return getToken(mcdocParser.As, 0); }
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
		public TerminalNode Dot() { return getToken(mcdocParser.Dot, 0); }
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
	}

	public final BaseDataTypeContext baseDataType() throws RecognitionException {
		BaseDataTypeContext _localctx = new BaseDataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_baseDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		public TerminalNode QuestionMark() { return getToken(mcdocParser.QuestionMark, 0); }
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
		public TerminalNode TypeKey() { return getToken(mcdocParser.TypeKey, 0); }
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
		public TerminalNode StructKeyType() { return getToken(mcdocParser.StructKeyType, 0); }
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
		public TerminalNode Inject() { return getToken(mcdocParser.Inject, 0); }
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
		public TerminalNode Enum() { return getToken(mcdocParser.Enum, 0); }
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
		public TerminalNode Use() { return getToken(mcdocParser.Use, 0); }
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
		public TerminalNode Dispatch() { return getToken(mcdocParser.Dispatch, 0); }
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
		public TerminalNode DoubleDot() { return getToken(mcdocParser.DoubleDot, 0); }
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
		public TerminalNode Integer() { return getToken(mcdocParser.Integer, 0); }
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
		public TerminalNode Float() { return getToken(mcdocParser.Float, 0); }
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
		public TerminalNode IntegerRange() { return getToken(mcdocParser.IntegerRange, 0); }
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
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
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
		public TerminalNode Commentary() { return getToken(mcdocParser.Commentary, 0); }
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
		public TerminalNode DocCommentary() { return getToken(mcdocParser.DocCommentary, 0); }
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
		public TerminalNode IntTypedUnit() { return getToken(mcdocParser.IntTypedUnit, 0); }
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public TerminalNode FloatTypedUnit() { return getToken(mcdocParser.FloatTypedUnit, 0); }
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
		public TerminalNode StringKeyType() { return getToken(mcdocParser.StringKeyType, 0); }
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
		public TerminalNode IntegerRange() { return getToken(mcdocParser.IntegerRange, 0); }
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
		public TerminalNode BoolValue() { return getToken(mcdocParser.BoolValue, 0); }
		public TerminalNode TypedNumberLexer() { return getToken(mcdocParser.TypedNumberLexer, 0); }
		public TerminalNode String() { return getToken(mcdocParser.String, 0); }
		public TerminalNode Identifier() { return getToken(mcdocParser.Identifier, 0); }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6927099176849244160L) != 0)) ) {
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(209);
				at();
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(210);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(211);
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
	}

	public final PrimitiveArrayTypeContext primitiveArrayType() throws RecognitionException {
		PrimitiveArrayTypeContext _localctx = new PrimitiveArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveArrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(217);
				at();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(218);
					match(WS);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(224);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(225);
					integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(230);
			match(SquareBrackets);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(231);
				match(WS);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(237);
				at();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(238);
					match(WS);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(244);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(245);
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
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LeftSquareBracket);
			setState(251);
			typeSentence();
			setState(252);
			match(RightSquareBracket);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(253);
				at();
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerRange:
					{
					setState(254);
					integerRange();
					}
					break;
				case Integer:
					{
					setState(255);
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
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tupleType);
		int _la;
		try {
			int _alt;
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(260);
				match(LeftSquareBracket);
				setState(261);
				typeSentence();
				setState(262);
				match(Comma);
				setState(263);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(265);
				match(LeftSquareBracket);
				setState(266);
				typeSentence();
				setState(269); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(267);
						match(Comma);
						setState(268);
						typeSentence();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(271); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(273);
					match(Comma);
					}
				}

				setState(276);
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
	}

	public final EnumMemberTypeContext enumMemberType() throws RecognitionException {
		EnumMemberTypeContext _localctx = new EnumMemberTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_enumMemberType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enumValue);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				typedNumber();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
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
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(286);
				prelim();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(292);
				attribute();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			identifier();
			setState(299);
			match(Equal);
			setState(300);
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
	}

	public final EnumBlockContext enumBlock() throws RecognitionException {
		EnumBlockContext _localctx = new EnumBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumBlock);
		int _la;
		try {
			int _alt;
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(303);
				match(LeftCurlyBracket);
				setState(304);
				enumField();
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						match(Comma);
						setState(306);
						enumField();
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(312);
					match(Comma);
					}
				}

				setState(315);
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
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(319);
				prelim();
				}
			}

			setState(322);
			enum_();
			setState(323);
			match(LeftRoundBracket);
			setState(324);
			enumMemberType();
			setState(325);
			match(RightRoundBracket);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(326);
				identifier();
				}
			}

			setState(329);
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DocCommentary:
				{
				setState(331);
				docCommentary();
				}
				break;
			case Commentary:
				{
				setState(332);
				commentary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(335);
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
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
			setState(340);
			resourceLocation();
			setState(341);
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
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unionType);
		int _la;
		try {
			int _alt;
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RoundBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(RoundBrackets);
				}
				break;
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(344);
				match(LeftRoundBracket);
				setState(345);
				typeSentence();
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						logicalOR();
						setState(347);
						typeSentence();
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LogicalOR) {
					{
					setState(354);
					logicalOR();
					}
				}

				setState(357);
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
	}

	public final StaticIndexKeyContext staticIndexKey() throws RecognitionException {
		StaticIndexKeyContext _localctx = new StaticIndexKeyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticIndexKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 3096224743817223L) != 0)) ) {
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
			setState(363);
			accessorKey();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917529027641278464L) != 0)) {
				{
				{
				setState(364);
				accessorKey();
				}
				}
				setState(369);
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
	}

	public final AccessorKeyContext accessorKey() throws RecognitionException {
		AccessorKeyContext _localctx = new AccessorKeyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_accessorKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917529027641278464L) != 0)) ) {
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
	}

	public final DynamicIndexContext dynamicIndex() throws RecognitionException {
		DynamicIndexContext _localctx = new DynamicIndexContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dynamicIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(LeftSquareBracket);
			setState(373);
			accessor();
			setState(374);
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
			setState(376);
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
	public static class IndexBodyWithOutDynamicContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public List<IndexWithOutDynamicContext> indexWithOutDynamic() {
			return getRuleContexts(IndexWithOutDynamicContext.class);
		}
		public IndexWithOutDynamicContext indexWithOutDynamic(int i) {
			return getRuleContext(IndexWithOutDynamicContext.class,i);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
			setState(382);
			match(LeftSquareBracket);
			setState(383);
			indexWithOutDynamic();
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(Comma);
					setState(385);
					indexWithOutDynamic();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class IndexBodyWithDynamicContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracket() { return getToken(mcdocParser.LeftSquareBracket, 0); }
		public List<IndexWithDynamicContext> indexWithDynamic() {
			return getRuleContexts(IndexWithDynamicContext.class);
		}
		public IndexWithDynamicContext indexWithDynamic(int i) {
			return getRuleContext(IndexWithDynamicContext.class,i);
		}
		public TerminalNode RightSquareBracket() { return getToken(mcdocParser.RightSquareBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
			setState(396);
			match(LeftSquareBracket);
			setState(397);
			indexWithDynamic();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(Comma);
					setState(399);
					indexWithDynamic();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(405);
				match(Comma);
				}
			}

			setState(408);
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
			setState(410);
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
	}

	public final TypeArgBlockContext typeArgBlock() throws RecognitionException {
		TypeArgBlockContext _localctx = new TypeArgBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeArgBlock);
		int _la;
		try {
			int _alt;
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(413);
				match(LeftAngleBracket);
				setState(414);
				typeSentence();
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(Comma);
						setState(416);
						typeSentence();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(422);
					match(Comma);
					}
				}

				setState(425);
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
	}

	public final UnAttributedTypeContext unAttributedType() throws RecognitionException {
		UnAttributedTypeContext _localctx = new UnAttributedTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unAttributedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(429);
				keywordType();
				}
				break;
			case 2:
				{
				setState(430);
				stringType();
				}
				break;
			case 3:
				{
				setState(431);
				literalType();
				}
				break;
			case 4:
				{
				setState(432);
				numericType();
				}
				break;
			case 5:
				{
				setState(433);
				primitiveArrayType();
				}
				break;
			case 6:
				{
				setState(434);
				listType();
				}
				break;
			case 7:
				{
				setState(435);
				tupleType();
				}
				break;
			case 8:
				{
				setState(436);
				enumType();
				}
				break;
			case 9:
				{
				setState(437);
				struct();
				}
				break;
			case 10:
				{
				setState(438);
				referenceType();
				}
				break;
			case 11:
				{
				setState(439);
				dispatcherType();
				}
				break;
			case 12:
				{
				setState(440);
				unionType();
				}
				break;
			case 13:
				{
				setState(441);
				indexingOnAType();
				}
				break;
			}
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(444);
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
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(447);
				attribute();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			unAttributedType();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6450839552L) != 0)) {
				{
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftSquareBracket:
					{
					setState(454);
					indexBodyWithDynamic();
					}
					break;
				case AngleBrackets:
				case LeftAngleBracket:
					{
					setState(455);
					typeArgBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(460);
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
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					commentary();
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(467);
				attribute();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					commentary();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(479);
				identifier();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Commentary) {
				{
				{
				setState(485);
				commentary();
				}
				}
				setState(490);
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
		public TerminalNode PositiveInteger() { return getToken(mcdocParser.PositiveInteger, 0); }
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
			setState(491);
			at();
			setState(492);
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
		public TerminalNode String() { return getToken(mcdocParser.String, 0); }
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
			setState(494);
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
		public List<TerminalNode> Comma() { return getTokens(mcdocParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(mcdocParser.Comma, i);
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
			setState(496);
			value();
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(497);
					match(Comma);
					setState(498);
					value();
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
	}

	public final NamedValueContext namedValue() throws RecognitionException {
		NamedValueContext _localctx = new NamedValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_namedValue);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(504);
					identifier();
					}
					break;
				case String:
					{
					setState(505);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(508);
				match(Equal);
				setState(509);
				value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(513);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(511);
					identifier();
					}
					break;
				case String:
					{
					setState(512);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(515);
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
	}

	public final NamedValuesContext namedValues() throws RecognitionException {
		NamedValuesContext _localctx = new NamedValuesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_namedValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			namedValue();
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					match(Comma);
					setState(521);
					namedValue();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
	}

	public final TreeBodyContext treeBody() throws RecognitionException {
		TreeBodyContext _localctx = new TreeBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_treeBody);
		int _la;
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(527);
				positionalValues();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(528);
					match(Comma);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				positionalValues();
				setState(536);
				match(Comma);
				setState(537);
				namedValues();
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(538);
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
	}

	public final TreeValueContext treeValue() throws RecognitionException {
		TreeValueContext _localctx = new TreeValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_treeValue);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(543);
				match(LeftRoundBracket);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 774724680439119877L) != 0)) {
					{
					setState(544);
					treeBody();
					}
				}

				setState(547);
				match(RightRoundBracket);
				}
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(548);
				match(LeftSquareBracket);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 774724680439119877L) != 0)) {
					{
					setState(549);
					treeBody();
					}
				}

				setState(552);
				match(RightSquareBracket);
				}
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(553);
				match(LeftCurlyBracket);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 774724680439119877L) != 0)) {
					{
					setState(554);
					treeBody();
					}
				}

				setState(557);
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
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				typeSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
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
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_attribute);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(564);
				match(Sharp);
				setState(565);
				match(LeftSquareBracket);
				setState(566);
				identifier();
				setState(567);
				match(RightSquareBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(569);
				match(Sharp);
				setState(570);
				match(LeftSquareBracket);
				setState(571);
				identifier();
				setState(572);
				match(Equal);
				setState(573);
				value();
				setState(574);
				match(RightSquareBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(576);
				match(Sharp);
				setState(577);
				match(LeftSquareBracket);
				setState(578);
				identifier();
				setState(579);
				treeValue();
				setState(580);
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
	}

	public final DispatchStatementContext dispatchStatement() throws RecognitionException {
		DispatchStatementContext _localctx = new DispatchStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dispatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DocCommentary || _la==Commentary) {
				{
				setState(584);
				prelim();
				}
			}

			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Sharp) {
				{
				{
				setState(587);
				attribute();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			dispatch();
			setState(594);
			resourceLocation();
			setState(595);
			indexBodyWithOutDynamic();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(596);
				typeParamBlock();
				}
			}

			setState(599);
			match(To);
			setState(600);
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
			setState(602);
			structKeyType();
			setState(603);
			path();
			setState(604);
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
	}

	public final EnumInjectionContext enumInjection() throws RecognitionException {
		EnumInjectionContext _localctx = new EnumInjectionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enumInjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(Enum);
			setState(607);
			match(LeftRoundBracket);
			setState(608);
			enumType();
			setState(609);
			match(RightRoundBracket);
			setState(610);
			path();
			setState(611);
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
			setState(613);
			inject();
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Enum:
				{
				setState(614);
				enumInjection();
				}
				break;
			case StructKeyType:
				{
				setState(615);
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
			setState(618);
			use();
			setState(619);
			path();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(620);
				as();
				setState(621);
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
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
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
	}

	public final TypeParamBlockContext typeParamBlock() throws RecognitionException {
		TypeParamBlockContext _localctx = new TypeParamBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeParamBlock);
		int _la;
		try {
			int _alt;
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AngleBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(AngleBrackets);
				}
				break;
			case LeftAngleBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(628);
				match(LeftAngleBracket);
				setState(629);
				typeParam();
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(630);
						match(Comma);
						setState(631);
						typeParam();
						}
						} 
					}
					setState(636);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(637);
					match(Comma);
					}
				}

				setState(640);
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
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(644);
				prelim();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			typeKey();
			setState(651);
			identifier();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AngleBrackets || _la==LeftAngleBracket) {
				{
				setState(652);
				typeParamBlock();
				}
			}

			setState(655);
			match(Equal);
			setState(656);
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
	}

	public final StructKeyContext structKey() throws RecognitionException {
		StructKeyContext _localctx = new StructKeyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_structKey);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(String);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(Identifier);
				}
				break;
			case LeftSquareBracket:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(660);
				match(LeftSquareBracket);
				setState(661);
				typeSentence();
				setState(662);
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
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_structField);
		int _la;
		try {
			int _alt;
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DocCommentary || _la==Commentary) {
					{
					{
					setState(666);
					prelim();
					}
					}
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Sharp) {
					{
					{
					setState(672);
					attribute();
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(678);
				structKey();
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(679);
					questionMark();
					}
				}

				setState(682);
				match(ColonMark);
				setState(683);
				typeSentence();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(685);
						attribute();
						}
						} 
					}
					setState(690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TripleDot) {
					{
					setState(691);
					match(TripleDot);
					}
				}

				setState(694);
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
	}

	public final StructBlockContext structBlock() throws RecognitionException {
		StructBlockContext _localctx = new StructBlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_structBlock);
		int _la;
		try {
			int _alt;
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CurlyBrackets:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(CurlyBrackets);
				}
				break;
			case LeftCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(698);
				match(LeftCurlyBracket);
				setState(699);
				structField();
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(700);
						match(Comma);
						setState(701);
						structField();
						}
						} 
					}
					setState(706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(707);
					match(Comma);
					}
				}

				setState(710);
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
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DocCommentary || _la==Commentary) {
				{
				{
				setState(714);
				prelim();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			structKeyType();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(721);
				identifier();
				}
			}

			setState(724);
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
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699722631104L) != 0)) {
				{
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(726);
					struct();
					}
					break;
				case 2:
					{
					setState(727);
					enumType();
					}
					break;
				case 3:
					{
					setState(728);
					typeAlias();
					}
					break;
				case 4:
					{
					setState(729);
					useStatement();
					}
					break;
				case 5:
					{
					setState(730);
					injection();
					}
					break;
				case 6:
					{
					setState(731);
					dispatchStatement();
					}
					break;
				}
				}
				setState(736);
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
		"\u0004\u0001B\u02e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0019\u00d5\b\u0019\u0003\u0019\u00d7\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u00dc\b\u001a\n\u001a\f\u001a\u00df\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u00e3\b\u001a\u0003\u001a\u00e5\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00e9\b\u001a\n\u001a\f\u001a"+
		"\u00ec\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00f0\b\u001a\n\u001a"+
		"\f\u001a\u00f3\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00f7\b\u001a"+
		"\u0003\u001a\u00f9\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0101\b\u001b\u0003\u001b\u0103\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u010e\b\u001c\u000b"+
		"\u001c\f\u001c\u010f\u0001\u001c\u0003\u001c\u0113\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0117\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u011d\b\u001e\u0001\u001f\u0005\u001f\u0120\b"+
		"\u001f\n\u001f\f\u001f\u0123\t\u001f\u0001\u001f\u0005\u001f\u0126\b\u001f"+
		"\n\u001f\f\u001f\u0129\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0134\b \n \f \u0137"+
		"\t \u0001 \u0003 \u013a\b \u0001 \u0001 \u0003 \u013e\b \u0001!\u0003"+
		"!\u0141\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0148\b!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0003\"\u014e\b\"\u0001\"\u0003\"\u0151\b\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u015e\b%\n%\f%\u0161\t%\u0001%\u0003%\u0164\b%\u0001%\u0001%\u0003%"+
		"\u0168\b%\u0001&\u0001&\u0001\'\u0001\'\u0005\'\u016e\b\'\n\'\f\'\u0171"+
		"\t\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0003+\u017d\b+\u0001,\u0001,\u0001,\u0001,\u0005,\u0183\b,\n,\f,\u0186"+
		"\t,\u0001,\u0003,\u0189\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0005"+
		"-\u0191\b-\n-\f-\u0194\t-\u0001-\u0003-\u0197\b-\u0001-\u0001-\u0001."+
		"\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u01a2\b/\n/\f/\u01a5"+
		"\t/\u0001/\u0003/\u01a8\b/\u0001/\u0001/\u0003/\u01ac\b/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u01bb\b0\u00010\u00030\u01be\b0\u00011\u00051\u01c1\b"+
		"1\n1\f1\u01c4\t1\u00011\u00011\u00011\u00051\u01c9\b1\n1\f1\u01cc\t1\u0001"+
		"2\u00052\u01cf\b2\n2\f2\u01d2\t2\u00012\u00052\u01d5\b2\n2\f2\u01d8\t"+
		"2\u00012\u00052\u01db\b2\n2\f2\u01de\t2\u00012\u00052\u01e1\b2\n2\f2\u01e4"+
		"\t2\u00012\u00052\u01e7\b2\n2\f2\u01ea\t2\u00013\u00013\u00013\u00014"+
		"\u00014\u00015\u00015\u00015\u00055\u01f4\b5\n5\f5\u01f7\t5\u00016\u0001"+
		"6\u00036\u01fb\b6\u00016\u00016\u00016\u00016\u00016\u00036\u0202\b6\u0001"+
		"6\u00016\u00036\u0206\b6\u00017\u00017\u00017\u00057\u020b\b7\n7\f7\u020e"+
		"\t7\u00018\u00018\u00038\u0212\b8\u00018\u00018\u00038\u0216\b8\u0001"+
		"8\u00018\u00018\u00018\u00038\u021c\b8\u00038\u021e\b8\u00019\u00019\u0003"+
		"9\u0222\b9\u00019\u00019\u00019\u00039\u0227\b9\u00019\u00019\u00019\u0003"+
		"9\u022c\b9\u00019\u00039\u022f\b9\u0001:\u0001:\u0003:\u0233\b:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0247\b;\u0001"+
		"<\u0003<\u024a\b<\u0001<\u0005<\u024d\b<\n<\f<\u0250\t<\u0001<\u0001<"+
		"\u0001<\u0001<\u0003<\u0256\b<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0003?\u0269\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0270"+
		"\b@\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0279\bB\n"+
		"B\fB\u027c\tB\u0001B\u0003B\u027f\bB\u0001B\u0001B\u0003B\u0283\bB\u0001"+
		"C\u0005C\u0286\bC\nC\fC\u0289\tC\u0001C\u0001C\u0001C\u0003C\u028e\bC"+
		"\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u0299\bD\u0001E\u0005E\u029c\bE\nE\fE\u029f\tE\u0001E\u0005E\u02a2\b"+
		"E\nE\fE\u02a5\tE\u0001E\u0001E\u0003E\u02a9\bE\u0001E\u0001E\u0001E\u0001"+
		"E\u0005E\u02af\bE\nE\fE\u02b2\tE\u0001E\u0003E\u02b5\bE\u0001E\u0003E"+
		"\u02b8\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u02bf\bF\nF\fF\u02c2"+
		"\tF\u0001F\u0003F\u02c5\bF\u0001F\u0001F\u0003F\u02c9\bF\u0001G\u0005"+
		"G\u02cc\bG\nG\fG\u02cf\tG\u0001G\u0001G\u0003G\u02d3\bG\u0001G\u0001G"+
		"\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u02dd\bH\nH\fH\u02e0"+
		"\tH\u0001H\u0000\u0000I\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0000\u0007\u0001\u0000(/\u0001\u000001\u0003\u00001155=>\u0001\u0000"+
		"(*\u0002\u0000(+-/\u0003\u0000\r\u000f=>@@\u0002\u0000\u0010\u0011=>\u0304"+
		"\u0000\u0092\u0001\u0000\u0000\u0000\u0002\u0094\u0001\u0000\u0000\u0000"+
		"\u0004\u0096\u0001\u0000\u0000\u0000\u0006\u0098\u0001\u0000\u0000\u0000"+
		"\b\u009a\u0001\u0000\u0000\u0000\n\u009c\u0001\u0000\u0000\u0000\f\u009e"+
		"\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00a2"+
		"\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00a6"+
		"\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00aa"+
		"\u0001\u0000\u0000\u0000\u001a\u00ac\u0001\u0000\u0000\u0000\u001c\u00ae"+
		"\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000\u0000 \u00b2\u0001"+
		"\u0000\u0000\u0000\"\u00b4\u0001\u0000\u0000\u0000$\u00b6\u0001\u0000"+
		"\u0000\u0000&\u00b8\u0001\u0000\u0000\u0000(\u00ba\u0001\u0000\u0000\u0000"+
		"*\u00bc\u0001\u0000\u0000\u0000,\u00c6\u0001\u0000\u0000\u0000.\u00c8"+
		"\u0001\u0000\u0000\u00000\u00ce\u0001\u0000\u0000\u00002\u00d0\u0001\u0000"+
		"\u0000\u00004\u00d8\u0001\u0000\u0000\u00006\u00fa\u0001\u0000\u0000\u0000"+
		"8\u0116\u0001\u0000\u0000\u0000:\u0118\u0001\u0000\u0000\u0000<\u011c"+
		"\u0001\u0000\u0000\u0000>\u0121\u0001\u0000\u0000\u0000@\u013d\u0001\u0000"+
		"\u0000\u0000B\u0140\u0001\u0000\u0000\u0000D\u014d\u0001\u0000\u0000\u0000"+
		"F\u0152\u0001\u0000\u0000\u0000H\u0154\u0001\u0000\u0000\u0000J\u0167"+
		"\u0001\u0000\u0000\u0000L\u0169\u0001\u0000\u0000\u0000N\u016b\u0001\u0000"+
		"\u0000\u0000P\u0172\u0001\u0000\u0000\u0000R\u0174\u0001\u0000\u0000\u0000"+
		"T\u0178\u0001\u0000\u0000\u0000V\u017c\u0001\u0000\u0000\u0000X\u017e"+
		"\u0001\u0000\u0000\u0000Z\u018c\u0001\u0000\u0000\u0000\\\u019a\u0001"+
		"\u0000\u0000\u0000^\u01ab\u0001\u0000\u0000\u0000`\u01ba\u0001\u0000\u0000"+
		"\u0000b\u01c2\u0001\u0000\u0000\u0000d\u01d0\u0001\u0000\u0000\u0000f"+
		"\u01eb\u0001\u0000\u0000\u0000h\u01ee\u0001\u0000\u0000\u0000j\u01f0\u0001"+
		"\u0000\u0000\u0000l\u0205\u0001\u0000\u0000\u0000n\u0207\u0001\u0000\u0000"+
		"\u0000p\u021d\u0001\u0000\u0000\u0000r\u022e\u0001\u0000\u0000\u0000t"+
		"\u0232\u0001\u0000\u0000\u0000v\u0246\u0001\u0000\u0000\u0000x\u0249\u0001"+
		"\u0000\u0000\u0000z\u025a\u0001\u0000\u0000\u0000|\u025e\u0001\u0000\u0000"+
		"\u0000~\u0265\u0001\u0000\u0000\u0000\u0080\u026a\u0001\u0000\u0000\u0000"+
		"\u0082\u0271\u0001\u0000\u0000\u0000\u0084\u0282\u0001\u0000\u0000\u0000"+
		"\u0086\u0287\u0001\u0000\u0000\u0000\u0088\u0298\u0001\u0000\u0000\u0000"+
		"\u008a\u02b7\u0001\u0000\u0000\u0000\u008c\u02c8\u0001\u0000\u0000\u0000"+
		"\u008e\u02cd\u0001\u0000\u0000\u0000\u0090\u02de\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\"\u0000\u0000\u0093\u0001\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005B\u0000\u0000\u0095\u0003\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005@\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u0003\u0000\u0000\u0099\u0007\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u0002\u0000\u0000\u009b\t\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0005"+
		"\u0000\u0000\u009d\u000b\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0000"+
		"\u0000\u0000\u009f\r\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0001\u0000"+
		"\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000"+
		"\u0000\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0006\u0000"+
		"\u0000\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0007\u0000"+
		"\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\b\u0000\u0000"+
		"\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\t\u0000\u0000\u00ab"+
		"\u0019\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u001b"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\f\u0000\u0000\u00af\u001d\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\'\u0000\u0000\u00b1\u001f\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u00056\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u00057\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005;\u0000\u0000\u00b7%\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005="+
		"\u0000\u0000\u00b9\'\u0001\u0000\u0000\u0000\u00ba\u00bb\u00053\u0000"+
		"\u0000\u00bb)\u0001\u0000\u0000\u0000\u00bc\u00bd\u00052\u0000\u0000\u00bd"+
		"+\u0001\u0000\u0000\u0000\u00be\u00c0\u0003 \u0010\u0000\u00bf\u00c1\u0005"+
		"9\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c7\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\"\u0011"+
		"\u0000\u00c3\u00c5\u0005:\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c7-\u0001\u0000\u0000\u0000\u00c8\u00cc\u0005+\u0000\u0000\u00c9\u00ca"+
		"\u0003\u0006\u0003\u0000\u00ca\u00cb\u0005;\u0000\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd/\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0002"+
		"\u0000\u0000\u00cf1\u0001\u0000\u0000\u0000\u00d0\u00d6\u0003\f\u0006"+
		"\u0000\u00d1\u00d4\u0003\u0006\u0003\u0000\u00d2\u00d5\u0003$\u0012\u0000"+
		"\u00d3\u00d5\u0003 \u0010\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"3\u0001\u0000\u0000\u0000\u00d8\u00e4\u0007\u0003\u0000\u0000\u00d9\u00dd"+
		"\u0003\u0006\u0003\u0000\u00da\u00dc\u0005\u0001\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e2"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3"+
		"\u0003$\u0012\u0000\u00e1\u00e3\u0003 \u0010\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00d9\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u0016"+
		"\u0000\u0000\u00e7\u00e9\u0005\u0001\u0000\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f8\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f1\u0003\u0006"+
		"\u0003\u0000\u00ee\u00f0\u0005\u0001\u0000\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0003$\u0012"+
		"\u0000\u00f5\u00f7\u0003 \u0010\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f8\u00ed\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f95\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0017\u0000\u0000\u00fb"+
		"\u00fc\u0003b1\u0000\u00fc\u0102\u0005\u0018\u0000\u0000\u00fd\u0100\u0003"+
		"\u0006\u0003\u0000\u00fe\u0101\u0003$\u0012\u0000\u00ff\u0101\u0003 \u0010"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000"+
		"\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00fd\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u01037\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\u0017\u0000\u0000\u0105\u0106\u0003b1\u0000\u0106\u0107"+
		"\u0005#\u0000\u0000\u0107\u0108\u0005\u0018\u0000\u0000\u0108\u0117\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u0017\u0000\u0000\u010a\u010d\u0003"+
		"b1\u0000\u010b\u010c\u0005#\u0000\u0000\u010c\u010e\u0003b1\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0112\u0001\u0000\u0000\u0000\u0111\u0113\u0005#\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0018\u0000\u0000\u0115\u0117"+
		"\u0001\u0000\u0000\u0000\u0116\u0104\u0001\u0000\u0000\u0000\u0116\u0109"+
		"\u0001\u0000\u0000\u0000\u01179\u0001\u0000\u0000\u0000\u0118\u0119\u0007"+
		"\u0004\u0000\u0000\u0119;\u0001\u0000\u0000\u0000\u011a\u011d\u0003,\u0016"+
		"\u0000\u011b\u011d\u0003h4\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011d=\u0001\u0000\u0000\u0000\u011e\u0120"+
		"\u0003D\"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0127\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u0126\u0003v;\u0000\u0125\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0003&\u0013\u0000"+
		"\u012b\u012c\u0005\u0014\u0000\u0000\u012c\u012d\u0003<\u001e\u0000\u012d"+
		"?\u0001\u0000\u0000\u0000\u012e\u013e\u0005\u001c\u0000\u0000\u012f\u0130"+
		"\u0005\u001d\u0000\u0000\u0130\u0135\u0003>\u001f\u0000\u0131\u0132\u0005"+
		"#\u0000\u0000\u0132\u0134\u0003>\u001f\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013a\u0005#\u0000\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u001e\u0000\u0000"+
		"\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u012e\u0001\u0000\u0000\u0000"+
		"\u013d\u012f\u0001\u0000\u0000\u0000\u013eA\u0001\u0000\u0000\u0000\u013f"+
		"\u0141\u0003D\"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0003\u0018\f\u0000\u0143\u0144\u0005\u001a\u0000\u0000\u0144\u0145\u0003"+
		":\u001d\u0000\u0145\u0147\u0005\u001b\u0000\u0000\u0146\u0148\u0003&\u0013"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0003@ \u0000\u014a"+
		"C\u0001\u0000\u0000\u0000\u014b\u014e\u0003*\u0015\u0000\u014c\u014e\u0003"+
		"(\u0014\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0151\u0003v;\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151E\u0001\u0000\u0000\u0000\u0152\u0153\u0005B\u0000\u0000\u0153G"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0003\u0004\u0002\u0000\u0155\u0156"+
		"\u0003Z-\u0000\u0156I\u0001\u0000\u0000\u0000\u0157\u0168\u0005\u0019"+
		"\u0000\u0000\u0158\u0159\u0005\u001a\u0000\u0000\u0159\u015f\u0003b1\u0000"+
		"\u015a\u015b\u0003\u0000\u0000\u0000\u015b\u015c\u0003b1\u0000\u015c\u015e"+
		"\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015e\u0161"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0162\u0164\u0003\u0000\u0000\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u001b\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0157\u0001\u0000\u0000\u0000\u0167\u0158"+
		"\u0001\u0000\u0000\u0000\u0168K\u0001\u0000\u0000\u0000\u0169\u016a\u0007"+
		"\u0005\u0000\u0000\u016aM\u0001\u0000\u0000\u0000\u016b\u016f\u0003P("+
		"\u0000\u016c\u016e\u0003P(\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170O\u0001\u0000\u0000\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0007\u0006\u0000\u0000\u0173Q\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005\u0017\u0000\u0000\u0175\u0176\u0003"+
		"N\'\u0000\u0176\u0177\u0005\u0018\u0000\u0000\u0177S\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0003L&\u0000\u0179U\u0001\u0000\u0000\u0000\u017a"+
		"\u017d\u0003L&\u0000\u017b\u017d\u0003R)\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017dW\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\u0017\u0000\u0000\u017f\u0184\u0003T*\u0000\u0180"+
		"\u0181\u0005#\u0000\u0000\u0181\u0183\u0003T*\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0189\u0005"+
		"#\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0018"+
		"\u0000\u0000\u018bY\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0017\u0000"+
		"\u0000\u018d\u0192\u0003V+\u0000\u018e\u018f\u0005#\u0000\u0000\u018f"+
		"\u0191\u0003V+\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0194\u0001"+
		"\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0195\u0197\u0005#\u0000\u0000\u0196\u0195\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0005\u0018\u0000\u0000\u0199[\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0003Z-\u0000\u019b]\u0001\u0000\u0000\u0000\u019c"+
		"\u01ac\u0005\u001f\u0000\u0000\u019d\u019e\u0005 \u0000\u0000\u019e\u01a3"+
		"\u0003b1\u0000\u019f\u01a0\u0005#\u0000\u0000\u01a0\u01a2\u0003b1\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a8\u0005#\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0005!\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u019c"+
		"\u0001\u0000\u0000\u0000\u01ab\u019d\u0001\u0000\u0000\u0000\u01ac_\u0001"+
		"\u0000\u0000\u0000\u01ad\u01bb\u0003\u000e\u0007\u0000\u01ae\u01bb\u0003"+
		".\u0017\u0000\u01af\u01bb\u00030\u0018\u0000\u01b0\u01bb\u00032\u0019"+
		"\u0000\u01b1\u01bb\u00034\u001a\u0000\u01b2\u01bb\u00036\u001b\u0000\u01b3"+
		"\u01bb\u00038\u001c\u0000\u01b4\u01bb\u0003B!\u0000\u01b5\u01bb\u0003"+
		"\u008eG\u0000\u01b6\u01bb\u0003F#\u0000\u01b7\u01bb\u0003H$\u0000\u01b8"+
		"\u01bb\u0003J%\u0000\u01b9\u01bb\u0003\\.\u0000\u01ba\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ba\u01ae\u0001\u0000\u0000\u0000\u01ba\u01af\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b0\u0001\u0000\u0000\u0000\u01ba\u01b1\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b2\u0001\u0000\u0000\u0000\u01ba\u01b3\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b4\u0001\u0000\u0000\u0000\u01ba\u01b5\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b6\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01be\u0005#\u0000"+
		"\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01bea\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003v;\u0000\u01c0"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5"+
		"\u01ca\u0003`0\u0000\u01c6\u01c9\u0003Z-\u0000\u01c7\u01c9\u0003^/\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cbc\u0001\u0000\u0000\u0000\u01cc"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003(\u0014\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0003v;\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d7\u01dc\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0003(\u0014\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e2\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0003&\u0013\u0000"+
		"\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e8\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0003(\u0014\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9e\u0001\u0000\u0000\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003\u0006\u0003\u0000\u01ec\u01ed"+
		"\u00058\u0000\u0000\u01edg\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005>"+
		"\u0000\u0000\u01efi\u0001\u0000\u0000\u0000\u01f0\u01f5\u0003t:\u0000"+
		"\u01f1\u01f2\u0005#\u0000\u0000\u01f2\u01f4\u0003t:\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6k\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01fb\u0003"+
		"&\u0013\u0000\u01f9\u01fb\u0003h4\u0000\u01fa\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0005\u0014\u0000\u0000\u01fd\u01fe\u0003t:\u0000\u01fe"+
		"\u0206\u0001\u0000\u0000\u0000\u01ff\u0202\u0003&\u0013\u0000\u0200\u0202"+
		"\u0003h4\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0200\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0003r9\u0000"+
		"\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u01fa\u0001\u0000\u0000\u0000"+
		"\u0205\u0201\u0001\u0000\u0000\u0000\u0206m\u0001\u0000\u0000\u0000\u0207"+
		"\u020c\u0003l6\u0000\u0208\u0209\u0005#\u0000\u0000\u0209\u020b\u0003"+
		"l6\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000"+
		"\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000"+
		"\u0000\u020do\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u0003j5\u0000\u0210\u0212\u0005#\u0000\u0000\u0211\u0210"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u021e"+
		"\u0001\u0000\u0000\u0000\u0213\u0215\u0003n7\u0000\u0214\u0216\u0005#"+
		"\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u021e\u0001\u0000\u0000\u0000\u0217\u0218\u0003j5\u0000"+
		"\u0218\u0219\u0005#\u0000\u0000\u0219\u021b\u0003n7\u0000\u021a\u021c"+
		"\u0005#\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001"+
		"\u0000\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u020f\u0001"+
		"\u0000\u0000\u0000\u021d\u0213\u0001\u0000\u0000\u0000\u021d\u0217\u0001"+
		"\u0000\u0000\u0000\u021eq\u0001\u0000\u0000\u0000\u021f\u0221\u0005\u001a"+
		"\u0000\u0000\u0220\u0222\u0003p8\u0000\u0221\u0220\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223\u022f\u0005\u001b\u0000\u0000\u0224\u0226\u0005\u0017\u0000\u0000"+
		"\u0225\u0227\u0003p8\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022f"+
		"\u0005\u0018\u0000\u0000\u0229\u022b\u0005\u001d\u0000\u0000\u022a\u022c"+
		"\u0003p8\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0005\u001e"+
		"\u0000\u0000\u022e\u021f\u0001\u0000\u0000\u0000\u022e\u0224\u0001\u0000"+
		"\u0000\u0000\u022e\u0229\u0001\u0000\u0000\u0000\u022fs\u0001\u0000\u0000"+
		"\u0000\u0230\u0233\u0003b1\u0000\u0231\u0233\u0003r9\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233u\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0005\u0015\u0000\u0000\u0235\u0236\u0005"+
		"\u0017\u0000\u0000\u0236\u0237\u0003&\u0013\u0000\u0237\u0238\u0005\u0018"+
		"\u0000\u0000\u0238\u0247\u0001\u0000\u0000\u0000\u0239\u023a\u0005\u0015"+
		"\u0000\u0000\u023a\u023b\u0005\u0017\u0000\u0000\u023b\u023c\u0003&\u0013"+
		"\u0000\u023c\u023d\u0005\u0014\u0000\u0000\u023d\u023e\u0003t:\u0000\u023e"+
		"\u023f\u0005\u0018\u0000\u0000\u023f\u0247\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0005\u0015\u0000\u0000\u0241\u0242\u0005\u0017\u0000\u0000\u0242"+
		"\u0243\u0003&\u0013\u0000\u0243\u0244\u0003r9\u0000\u0244\u0245\u0005"+
		"\u0018\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0234\u0001"+
		"\u0000\u0000\u0000\u0246\u0239\u0001\u0000\u0000\u0000\u0246\u0240\u0001"+
		"\u0000\u0000\u0000\u0247w\u0001\u0000\u0000\u0000\u0248\u024a\u0003D\""+
		"\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000"+
		"\u0000\u024a\u024e\u0001\u0000\u0000\u0000\u024b\u024d\u0003v;\u0000\u024c"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e"+
		"\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f"+
		"\u0251\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0003\u001c\u000e\u0000\u0252\u0253\u0003\u0004\u0002\u0000\u0253"+
		"\u0255\u0003X,\u0000\u0254\u0256\u0003\u0084B\u0000\u0255\u0254\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0257\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0005\u000b\u0000\u0000\u0258\u0259\u0003"+
		"b1\u0000\u0259y\u0001\u0000\u0000\u0000\u025a\u025b\u0003\u0014\n\u0000"+
		"\u025b\u025c\u0003\u0002\u0001\u0000\u025c\u025d\u0003\u008cF\u0000\u025d"+
		"{\u0001\u0000\u0000\u0000\u025e\u025f\u0005\t\u0000\u0000\u025f\u0260"+
		"\u0005\u001a\u0000\u0000\u0260\u0261\u0003B!\u0000\u0261\u0262\u0005\u001b"+
		"\u0000\u0000\u0262\u0263\u0003\u0002\u0001\u0000\u0263\u0264\u0003@ \u0000"+
		"\u0264}\u0001\u0000\u0000\u0000\u0265\u0268\u0003\u0016\u000b\u0000\u0266"+
		"\u0269\u0003|>\u0000\u0267\u0269\u0003z=\u0000\u0268\u0266\u0001\u0000"+
		"\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269\u007f\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0003\u001a\r\u0000\u026b\u026f\u0003\u0002\u0001"+
		"\u0000\u026c\u026d\u0003\b\u0004\u0000\u026d\u026e\u0003&\u0013\u0000"+
		"\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0081\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0005=\u0000\u0000\u0272\u0083\u0001\u0000\u0000\u0000\u0273"+
		"\u0283\u0005\u001f\u0000\u0000\u0274\u0275\u0005 \u0000\u0000\u0275\u027a"+
		"\u0003\u0082A\u0000\u0276\u0277\u0005#\u0000\u0000\u0277\u0279\u0003\u0082"+
		"A\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000\u0000"+
		"\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027d\u027f\u0005#\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0005!\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282"+
		"\u0273\u0001\u0000\u0000\u0000\u0282\u0274\u0001\u0000\u0000\u0000\u0283"+
		"\u0085\u0001\u0000\u0000\u0000\u0284\u0286\u0003D\"\u0000\u0285\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028a"+
		"\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0003\u0012\t\u0000\u028b\u028d\u0003&\u0013\u0000\u028c\u028e\u0003"+
		"\u0084B\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u0014"+
		"\u0000\u0000\u0290\u0291\u0003b1\u0000\u0291\u0087\u0001\u0000\u0000\u0000"+
		"\u0292\u0299\u0005>\u0000\u0000\u0293\u0299\u0005=\u0000\u0000\u0294\u0295"+
		"\u0005\u0017\u0000\u0000\u0295\u0296\u0003b1\u0000\u0296\u0297\u0005\u0018"+
		"\u0000\u0000\u0297\u0299\u0001\u0000\u0000\u0000\u0298\u0292\u0001\u0000"+
		"\u0000\u0000\u0298\u0293\u0001\u0000\u0000\u0000\u0298\u0294\u0001\u0000"+
		"\u0000\u0000\u0299\u0089\u0001\u0000\u0000\u0000\u029a\u029c\u0003D\""+
		"\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e\u02a3\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a2\u0003v;\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a8\u0003\u0088D\u0000\u02a7\u02a9"+
		"\u0003\u0010\b\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005"+
		"%\u0000\u0000\u02ab\u02ac\u0003b1\u0000\u02ac\u02b8\u0001\u0000\u0000"+
		"\u0000\u02ad\u02af\u0003v;\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b3\u02b5\u0005&\u0000\u0000\u02b4\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003b1\u0000\u02b7\u029d\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b0\u0001\u0000\u0000\u0000\u02b8\u008b\u0001\u0000"+
		"\u0000\u0000\u02b9\u02c9\u0005\u001c\u0000\u0000\u02ba\u02bb\u0005\u001d"+
		"\u0000\u0000\u02bb\u02c0\u0003\u008aE\u0000\u02bc\u02bd\u0005#\u0000\u0000"+
		"\u02bd\u02bf\u0003\u008aE\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c5\u0005#\u0000\u0000\u02c4\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005\u001e\u0000\u0000\u02c7\u02c9"+
		"\u0001\u0000\u0000\u0000\u02c8\u02b9\u0001\u0000\u0000\u0000\u02c8\u02ba"+
		"\u0001\u0000\u0000\u0000\u02c9\u008d\u0001\u0000\u0000\u0000\u02ca\u02cc"+
		"\u0003D\"\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001"+
		"\u0000\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d2\u0003\u0014\n\u0000\u02d1\u02d3\u0003&"+
		"\u0013\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d5\u0003\u008c"+
		"F\u0000\u02d5\u008f\u0001\u0000\u0000\u0000\u02d6\u02dd\u0003\u008eG\u0000"+
		"\u02d7\u02dd\u0003B!\u0000\u02d8\u02dd\u0003\u0086C\u0000\u02d9\u02dd"+
		"\u0003\u0080@\u0000\u02da\u02dd\u0003~?\u0000\u02db\u02dd\u0003x<\u0000"+
		"\u02dc\u02d6\u0001\u0000\u0000\u0000\u02dc\u02d7\u0001\u0000\u0000\u0000"+
		"\u02dc\u02d8\u0001\u0000\u0000\u0000\u02dc\u02d9\u0001\u0000\u0000\u0000"+
		"\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000"+
		"\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u0091\u0001\u0000\u0000\u0000"+
		"\u02e0\u02de\u0001\u0000\u0000\u0000Y\u00c0\u00c4\u00c6\u00cc\u00d4\u00d6"+
		"\u00dd\u00e2\u00e4\u00ea\u00f1\u00f6\u00f8\u0100\u0102\u010f\u0112\u0116"+
		"\u011c\u0121\u0127\u0135\u0139\u013d\u0140\u0147\u014d\u0150\u015f\u0163"+
		"\u0167\u016f\u017c\u0184\u0188\u0192\u0196\u01a3\u01a7\u01ab\u01ba\u01bd"+
		"\u01c2\u01c8\u01ca\u01d0\u01d6\u01dc\u01e2\u01e8\u01f5\u01fa\u0201\u0205"+
		"\u020c\u0211\u0215\u021b\u021d\u0221\u0226\u022b\u022e\u0232\u0246\u0249"+
		"\u024e\u0255\u0268\u026f\u027a\u027e\u0282\u0287\u028d\u0298\u029d\u02a3"+
		"\u02a8\u02b0\u02b4\u02b7\u02c0\u02c4\u02c8\u02cd\u02d2\u02dc\u02de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}