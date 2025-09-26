// Generated from D:/C#Project/MinecraftLanguageServer/MCDocumentRule/mcdocParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mcdocParser}.
 */
public interface mcdocParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mcdocParser#logicalOR}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOR(mcdocParser.LogicalORContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#logicalOR}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOR(mcdocParser.LogicalORContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(mcdocParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(mcdocParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#resourceLocation}.
	 * @param ctx the parse tree
	 */
	void enterResourceLocation(mcdocParser.ResourceLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#resourceLocation}.
	 * @param ctx the parse tree
	 */
	void exitResourceLocation(mcdocParser.ResourceLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(mcdocParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(mcdocParser.AtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(mcdocParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(mcdocParser.AsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(mcdocParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(mcdocParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#baseDataType}.
	 * @param ctx the parse tree
	 */
	void enterBaseDataType(mcdocParser.BaseDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#baseDataType}.
	 * @param ctx the parse tree
	 */
	void exitBaseDataType(mcdocParser.BaseDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#keywordType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordType(mcdocParser.KeywordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#keywordType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordType(mcdocParser.KeywordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#questionMark}.
	 * @param ctx the parse tree
	 */
	void enterQuestionMark(mcdocParser.QuestionMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#questionMark}.
	 * @param ctx the parse tree
	 */
	void exitQuestionMark(mcdocParser.QuestionMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typeKey}.
	 * @param ctx the parse tree
	 */
	void enterTypeKey(mcdocParser.TypeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typeKey}.
	 * @param ctx the parse tree
	 */
	void exitTypeKey(mcdocParser.TypeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#structKeyType}.
	 * @param ctx the parse tree
	 */
	void enterStructKeyType(mcdocParser.StructKeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#structKeyType}.
	 * @param ctx the parse tree
	 */
	void exitStructKeyType(mcdocParser.StructKeyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#inject}.
	 * @param ctx the parse tree
	 */
	void enterInject(mcdocParser.InjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#inject}.
	 * @param ctx the parse tree
	 */
	void exitInject(mcdocParser.InjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(mcdocParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(mcdocParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(mcdocParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(mcdocParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(mcdocParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(mcdocParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#doubleDot}.
	 * @param ctx the parse tree
	 */
	void enterDoubleDot(mcdocParser.DoubleDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#doubleDot}.
	 * @param ctx the parse tree
	 */
	void exitDoubleDot(mcdocParser.DoubleDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(mcdocParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(mcdocParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(mcdocParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(mcdocParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(mcdocParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(mcdocParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#integerRange}.
	 * @param ctx the parse tree
	 */
	void enterIntegerRange(mcdocParser.IntegerRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#integerRange}.
	 * @param ctx the parse tree
	 */
	void exitIntegerRange(mcdocParser.IntegerRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(mcdocParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(mcdocParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(mcdocParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(mcdocParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#commentary}.
	 * @param ctx the parse tree
	 */
	void enterCommentary(mcdocParser.CommentaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#commentary}.
	 * @param ctx the parse tree
	 */
	void exitCommentary(mcdocParser.CommentaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#docCommentary}.
	 * @param ctx the parse tree
	 */
	void enterDocCommentary(mcdocParser.DocCommentaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#docCommentary}.
	 * @param ctx the parse tree
	 */
	void exitDocCommentary(mcdocParser.DocCommentaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typedNumber}.
	 * @param ctx the parse tree
	 */
	void enterTypedNumber(mcdocParser.TypedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typedNumber}.
	 * @param ctx the parse tree
	 */
	void exitTypedNumber(mcdocParser.TypedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(mcdocParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(mcdocParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(mcdocParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(mcdocParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(mcdocParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(mcdocParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#primitiveArrayType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveArrayType(mcdocParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#primitiveArrayType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveArrayType(mcdocParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(mcdocParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(mcdocParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(mcdocParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(mcdocParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enumMemberType}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberType(mcdocParser.EnumMemberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enumMemberType}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberType(mcdocParser.EnumMemberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(mcdocParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(mcdocParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enumField}.
	 * @param ctx the parse tree
	 */
	void enterEnumField(mcdocParser.EnumFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enumField}.
	 * @param ctx the parse tree
	 */
	void exitEnumField(mcdocParser.EnumFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enumBlock}.
	 * @param ctx the parse tree
	 */
	void enterEnumBlock(mcdocParser.EnumBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enumBlock}.
	 * @param ctx the parse tree
	 */
	void exitEnumBlock(mcdocParser.EnumBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(mcdocParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(mcdocParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#prelim}.
	 * @param ctx the parse tree
	 */
	void enterPrelim(mcdocParser.PrelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#prelim}.
	 * @param ctx the parse tree
	 */
	void exitPrelim(mcdocParser.PrelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(mcdocParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(mcdocParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#dispatcherType}.
	 * @param ctx the parse tree
	 */
	void enterDispatcherType(mcdocParser.DispatcherTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#dispatcherType}.
	 * @param ctx the parse tree
	 */
	void exitDispatcherType(mcdocParser.DispatcherTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(mcdocParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(mcdocParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#staticIndexKey}.
	 * @param ctx the parse tree
	 */
	void enterStaticIndexKey(mcdocParser.StaticIndexKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#staticIndexKey}.
	 * @param ctx the parse tree
	 */
	void exitStaticIndexKey(mcdocParser.StaticIndexKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessor(mcdocParser.AccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessor(mcdocParser.AccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#accessorKey}.
	 * @param ctx the parse tree
	 */
	void enterAccessorKey(mcdocParser.AccessorKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#accessorKey}.
	 * @param ctx the parse tree
	 */
	void exitAccessorKey(mcdocParser.AccessorKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#dynamicIndex}.
	 * @param ctx the parse tree
	 */
	void enterDynamicIndex(mcdocParser.DynamicIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#dynamicIndex}.
	 * @param ctx the parse tree
	 */
	void exitDynamicIndex(mcdocParser.DynamicIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(mcdocParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(mcdocParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#indexBody}.
	 * @param ctx the parse tree
	 */
	void enterIndexBody(mcdocParser.IndexBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#indexBody}.
	 * @param ctx the parse tree
	 */
	void exitIndexBody(mcdocParser.IndexBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#indexingOnAType}.
	 * @param ctx the parse tree
	 */
	void enterIndexingOnAType(mcdocParser.IndexingOnATypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#indexingOnAType}.
	 * @param ctx the parse tree
	 */
	void exitIndexingOnAType(mcdocParser.IndexingOnATypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typeArgBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgBlock(mcdocParser.TypeArgBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typeArgBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgBlock(mcdocParser.TypeArgBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#unAttributedType}.
	 * @param ctx the parse tree
	 */
	void enterUnAttributedType(mcdocParser.UnAttributedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#unAttributedType}.
	 * @param ctx the parse tree
	 */
	void exitUnAttributedType(mcdocParser.UnAttributedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typeSentence}.
	 * @param ctx the parse tree
	 */
	void enterTypeSentence(mcdocParser.TypeSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typeSentence}.
	 * @param ctx the parse tree
	 */
	void exitTypeSentence(mcdocParser.TypeSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#positionalValues}.
	 * @param ctx the parse tree
	 */
	void enterPositionalValues(mcdocParser.PositionalValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#positionalValues}.
	 * @param ctx the parse tree
	 */
	void exitPositionalValues(mcdocParser.PositionalValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#namedValue}.
	 * @param ctx the parse tree
	 */
	void enterNamedValue(mcdocParser.NamedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#namedValue}.
	 * @param ctx the parse tree
	 */
	void exitNamedValue(mcdocParser.NamedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#namedValues}.
	 * @param ctx the parse tree
	 */
	void enterNamedValues(mcdocParser.NamedValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#namedValues}.
	 * @param ctx the parse tree
	 */
	void exitNamedValues(mcdocParser.NamedValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#treeBody}.
	 * @param ctx the parse tree
	 */
	void enterTreeBody(mcdocParser.TreeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#treeBody}.
	 * @param ctx the parse tree
	 */
	void exitTreeBody(mcdocParser.TreeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#treeValue}.
	 * @param ctx the parse tree
	 */
	void enterTreeValue(mcdocParser.TreeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#treeValue}.
	 * @param ctx the parse tree
	 */
	void exitTreeValue(mcdocParser.TreeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(mcdocParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(mcdocParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(mcdocParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(mcdocParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#dispatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterDispatchStatement(mcdocParser.DispatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#dispatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitDispatchStatement(mcdocParser.DispatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#structInjection}.
	 * @param ctx the parse tree
	 */
	void enterStructInjection(mcdocParser.StructInjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#structInjection}.
	 * @param ctx the parse tree
	 */
	void exitStructInjection(mcdocParser.StructInjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#enumInjection}.
	 * @param ctx the parse tree
	 */
	void enterEnumInjection(mcdocParser.EnumInjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#enumInjection}.
	 * @param ctx the parse tree
	 */
	void exitEnumInjection(mcdocParser.EnumInjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#injection}.
	 * @param ctx the parse tree
	 */
	void enterInjection(mcdocParser.InjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#injection}.
	 * @param ctx the parse tree
	 */
	void exitInjection(mcdocParser.InjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(mcdocParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(mcdocParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterTypeParam(mcdocParser.TypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitTypeParam(mcdocParser.TypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typeParamBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamBlock(mcdocParser.TypeParamBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typeParamBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamBlock(mcdocParser.TypeParamBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(mcdocParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(mcdocParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#structKey}.
	 * @param ctx the parse tree
	 */
	void enterStructKey(mcdocParser.StructKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#structKey}.
	 * @param ctx the parse tree
	 */
	void exitStructKey(mcdocParser.StructKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(mcdocParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(mcdocParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#structBlock}.
	 * @param ctx the parse tree
	 */
	void enterStructBlock(mcdocParser.StructBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#structBlock}.
	 * @param ctx the parse tree
	 */
	void exitStructBlock(mcdocParser.StructBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(mcdocParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(mcdocParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(mcdocParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(mcdocParser.FileContext ctx);
}