// Generated from D:/C#Project/MinecraftLanguageServer/MCDocumentRule/mcdocParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mcdocParserParser}.
 */
public interface mcdocParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#logicalOR}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOR(mcdocParserParser.LogicalORContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#logicalOR}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOR(mcdocParserParser.LogicalORContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(mcdocParserParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(mcdocParserParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#resourceLocation}.
	 * @param ctx the parse tree
	 */
	void enterResourceLocation(mcdocParserParser.ResourceLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#resourceLocation}.
	 * @param ctx the parse tree
	 */
	void exitResourceLocation(mcdocParserParser.ResourceLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(mcdocParserParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(mcdocParserParser.AtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(mcdocParserParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(mcdocParserParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#baseDataType}.
	 * @param ctx the parse tree
	 */
	void enterBaseDataType(mcdocParserParser.BaseDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#baseDataType}.
	 * @param ctx the parse tree
	 */
	void exitBaseDataType(mcdocParserParser.BaseDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#keywordType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordType(mcdocParserParser.KeywordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#keywordType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordType(mcdocParserParser.KeywordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#questionMark}.
	 * @param ctx the parse tree
	 */
	void enterQuestionMark(mcdocParserParser.QuestionMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#questionMark}.
	 * @param ctx the parse tree
	 */
	void exitQuestionMark(mcdocParserParser.QuestionMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structKeyType}.
	 * @param ctx the parse tree
	 */
	void enterStructKeyType(mcdocParserParser.StructKeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structKeyType}.
	 * @param ctx the parse tree
	 */
	void exitStructKeyType(mcdocParserParser.StructKeyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#inject}.
	 * @param ctx the parse tree
	 */
	void enterInject(mcdocParserParser.InjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#inject}.
	 * @param ctx the parse tree
	 */
	void exitInject(mcdocParserParser.InjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(mcdocParserParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(mcdocParserParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(mcdocParserParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(mcdocParserParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(mcdocParserParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(mcdocParserParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#typeKeyType}.
	 * @param ctx the parse tree
	 */
	void enterTypeKeyType(mcdocParserParser.TypeKeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#typeKeyType}.
	 * @param ctx the parse tree
	 */
	void exitTypeKeyType(mcdocParserParser.TypeKeyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#doubleDot}.
	 * @param ctx the parse tree
	 */
	void enterDoubleDot(mcdocParserParser.DoubleDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#doubleDot}.
	 * @param ctx the parse tree
	 */
	void exitDoubleDot(mcdocParserParser.DoubleDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(mcdocParserParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(mcdocParserParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(mcdocParserParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(mcdocParserParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#integerRange}.
	 * @param ctx the parse tree
	 */
	void enterIntegerRange(mcdocParserParser.IntegerRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#integerRange}.
	 * @param ctx the parse tree
	 */
	void exitIntegerRange(mcdocParserParser.IntegerRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(mcdocParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(mcdocParserParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#commentary}.
	 * @param ctx the parse tree
	 */
	void enterCommentary(mcdocParserParser.CommentaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#commentary}.
	 * @param ctx the parse tree
	 */
	void exitCommentary(mcdocParserParser.CommentaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#docCommentary}.
	 * @param ctx the parse tree
	 */
	void enterDocCommentary(mcdocParserParser.DocCommentaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#docCommentary}.
	 * @param ctx the parse tree
	 */
	void exitDocCommentary(mcdocParserParser.DocCommentaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#typedNumber}.
	 * @param ctx the parse tree
	 */
	void enterTypedNumber(mcdocParserParser.TypedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#typedNumber}.
	 * @param ctx the parse tree
	 */
	void exitTypedNumber(mcdocParserParser.TypedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(mcdocParserParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(mcdocParserParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(mcdocParserParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(mcdocParserParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(mcdocParserParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(mcdocParserParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#primitiveArrayType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveArrayType(mcdocParserParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#primitiveArrayType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveArrayType(mcdocParserParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(mcdocParserParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(mcdocParserParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(mcdocParserParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(mcdocParserParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enumMemberType}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberType(mcdocParserParser.EnumMemberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enumMemberType}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberType(mcdocParserParser.EnumMemberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(mcdocParserParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(mcdocParserParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enumField}.
	 * @param ctx the parse tree
	 */
	void enterEnumField(mcdocParserParser.EnumFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enumField}.
	 * @param ctx the parse tree
	 */
	void exitEnumField(mcdocParserParser.EnumFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enumBlock}.
	 * @param ctx the parse tree
	 */
	void enterEnumBlock(mcdocParserParser.EnumBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enumBlock}.
	 * @param ctx the parse tree
	 */
	void exitEnumBlock(mcdocParserParser.EnumBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(mcdocParserParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(mcdocParserParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#prelim}.
	 * @param ctx the parse tree
	 */
	void enterPrelim(mcdocParserParser.PrelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#prelim}.
	 * @param ctx the parse tree
	 */
	void exitPrelim(mcdocParserParser.PrelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(mcdocParserParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(mcdocParserParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#dispatcherType}.
	 * @param ctx the parse tree
	 */
	void enterDispatcherType(mcdocParserParser.DispatcherTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dispatcherType}.
	 * @param ctx the parse tree
	 */
	void exitDispatcherType(mcdocParserParser.DispatcherTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(mcdocParserParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(mcdocParserParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#staticIndexKey}.
	 * @param ctx the parse tree
	 */
	void enterStaticIndexKey(mcdocParserParser.StaticIndexKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#staticIndexKey}.
	 * @param ctx the parse tree
	 */
	void exitStaticIndexKey(mcdocParserParser.StaticIndexKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessor(mcdocParserParser.AccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessor(mcdocParserParser.AccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#accessorKey}.
	 * @param ctx the parse tree
	 */
	void enterAccessorKey(mcdocParserParser.AccessorKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#accessorKey}.
	 * @param ctx the parse tree
	 */
	void exitAccessorKey(mcdocParserParser.AccessorKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#dynamicIndex}.
	 * @param ctx the parse tree
	 */
	void enterDynamicIndex(mcdocParserParser.DynamicIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dynamicIndex}.
	 * @param ctx the parse tree
	 */
	void exitDynamicIndex(mcdocParserParser.DynamicIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexWithOutDynamic}.
	 * @param ctx the parse tree
	 */
	void enterIndexWithOutDynamic(mcdocParserParser.IndexWithOutDynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexWithOutDynamic}.
	 * @param ctx the parse tree
	 */
	void exitIndexWithOutDynamic(mcdocParserParser.IndexWithOutDynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexWithDynamic}.
	 * @param ctx the parse tree
	 */
	void enterIndexWithDynamic(mcdocParserParser.IndexWithDynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexWithDynamic}.
	 * @param ctx the parse tree
	 */
	void exitIndexWithDynamic(mcdocParserParser.IndexWithDynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexBodyWithOutDynamic}.
	 * @param ctx the parse tree
	 */
	void enterIndexBodyWithOutDynamic(mcdocParserParser.IndexBodyWithOutDynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexBodyWithOutDynamic}.
	 * @param ctx the parse tree
	 */
	void exitIndexBodyWithOutDynamic(mcdocParserParser.IndexBodyWithOutDynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexBodyWithDynamic}.
	 * @param ctx the parse tree
	 */
	void enterIndexBodyWithDynamic(mcdocParserParser.IndexBodyWithDynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexBodyWithDynamic}.
	 * @param ctx the parse tree
	 */
	void exitIndexBodyWithDynamic(mcdocParserParser.IndexBodyWithDynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexingOnAType}.
	 * @param ctx the parse tree
	 */
	void enterIndexingOnAType(mcdocParserParser.IndexingOnATypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexingOnAType}.
	 * @param ctx the parse tree
	 */
	void exitIndexingOnAType(mcdocParserParser.IndexingOnATypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#typeArgBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgBlock(mcdocParserParser.TypeArgBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#typeArgBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgBlock(mcdocParserParser.TypeArgBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#unAttributedType}.
	 * @param ctx the parse tree
	 */
	void enterUnAttributedType(mcdocParserParser.UnAttributedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#unAttributedType}.
	 * @param ctx the parse tree
	 */
	void exitUnAttributedType(mcdocParserParser.UnAttributedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mcdocParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mcdocParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#attributeSet}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSet(mcdocParserParser.AttributeSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#attributeSet}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSet(mcdocParserParser.AttributeSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(mcdocParserParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(mcdocParserParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(mcdocParserParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(mcdocParserParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#positionalValues}.
	 * @param ctx the parse tree
	 */
	void enterPositionalValues(mcdocParserParser.PositionalValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#positionalValues}.
	 * @param ctx the parse tree
	 */
	void exitPositionalValues(mcdocParserParser.PositionalValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#namedValue}.
	 * @param ctx the parse tree
	 */
	void enterNamedValue(mcdocParserParser.NamedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#namedValue}.
	 * @param ctx the parse tree
	 */
	void exitNamedValue(mcdocParserParser.NamedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#namedValues}.
	 * @param ctx the parse tree
	 */
	void enterNamedValues(mcdocParserParser.NamedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#namedValues}.
	 * @param ctx the parse tree
	 */
	void exitNamedValues(mcdocParserParser.NamedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#treeBody}.
	 * @param ctx the parse tree
	 */
	void enterTreeBody(mcdocParserParser.TreeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#treeBody}.
	 * @param ctx the parse tree
	 */
	void exitTreeBody(mcdocParserParser.TreeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#treeValue}.
	 * @param ctx the parse tree
	 */
	void enterTreeValue(mcdocParserParser.TreeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#treeValue}.
	 * @param ctx the parse tree
	 */
	void exitTreeValue(mcdocParserParser.TreeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(mcdocParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(mcdocParserParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(mcdocParserParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(mcdocParserParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#dispatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterDispatchStatement(mcdocParserParser.DispatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dispatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitDispatchStatement(mcdocParserParser.DispatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structInjection}.
	 * @param ctx the parse tree
	 */
	void enterStructInjection(mcdocParserParser.StructInjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structInjection}.
	 * @param ctx the parse tree
	 */
	void exitStructInjection(mcdocParserParser.StructInjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#enumInjection}.
	 * @param ctx the parse tree
	 */
	void enterEnumInjection(mcdocParserParser.EnumInjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#enumInjection}.
	 * @param ctx the parse tree
	 */
	void exitEnumInjection(mcdocParserParser.EnumInjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#injection}.
	 * @param ctx the parse tree
	 */
	void enterInjection(mcdocParserParser.InjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#injection}.
	 * @param ctx the parse tree
	 */
	void exitInjection(mcdocParserParser.InjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(mcdocParserParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(mcdocParserParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterTypeParam(mcdocParserParser.TypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitTypeParam(mcdocParserParser.TypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#typeParamBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamBlock(mcdocParserParser.TypeParamBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#typeParamBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamBlock(mcdocParserParser.TypeParamBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(mcdocParserParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(mcdocParserParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structKey}.
	 * @param ctx the parse tree
	 */
	void enterStructKey(mcdocParserParser.StructKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structKey}.
	 * @param ctx the parse tree
	 */
	void exitStructKey(mcdocParserParser.StructKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(mcdocParserParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(mcdocParserParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structBlock}.
	 * @param ctx the parse tree
	 */
	void enterStructBlock(mcdocParserParser.StructBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structBlock}.
	 * @param ctx the parse tree
	 */
	void exitStructBlock(mcdocParserParser.StructBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(mcdocParserParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(mcdocParserParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(mcdocParserParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(mcdocParserParser.FileContext ctx);
}