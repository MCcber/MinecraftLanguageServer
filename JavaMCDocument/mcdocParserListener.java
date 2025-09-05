// Generated from MCDocument/mcdocParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by {@link mcdocParserParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(mcdocParserParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(mcdocParserParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#booleanKeyType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanKeyType(mcdocParserParser.BooleanKeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#booleanKeyType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanKeyType(mcdocParserParser.BooleanKeyTypeContext ctx);
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
	 * Enter a parse tree produced by {@link mcdocParserParser#floatRange}.
	 * @param ctx the parse tree
	 */
	void enterFloatRange(mcdocParserParser.FloatRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#floatRange}.
	 * @param ctx the parse tree
	 */
	void exitFloatRange(mcdocParserParser.FloatRangeContext ctx);
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
	 * Enter a parse tree produced by {@link mcdocParserParser#versionString}.
	 * @param ctx the parse tree
	 */
	void enterVersionString(mcdocParserParser.VersionStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#versionString}.
	 * @param ctx the parse tree
	 */
	void exitVersionString(mcdocParserParser.VersionStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#positiveInteger}.
	 * @param ctx the parse tree
	 */
	void enterPositiveInteger(mcdocParserParser.PositiveIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#positiveInteger}.
	 * @param ctx the parse tree
	 */
	void exitPositiveInteger(mcdocParserParser.PositiveIntegerContext ctx);
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
	 * Enter a parse tree produced by {@link mcdocParserParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void enterFieldValue(mcdocParserParser.FieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void exitFieldValue(mcdocParserParser.FieldValueContext ctx);
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
	 * Enter a parse tree produced by {@link mcdocParserParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(mcdocParserParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(mcdocParserParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexBody}.
	 * @param ctx the parse tree
	 */
	void enterIndexBody(mcdocParserParser.IndexBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexBody}.
	 * @param ctx the parse tree
	 */
	void exitIndexBody(mcdocParserParser.IndexBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#indexOnAType}.
	 * @param ctx the parse tree
	 */
	void enterIndexOnAType(mcdocParserParser.IndexOnATypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#indexOnAType}.
	 * @param ctx the parse tree
	 */
	void exitIndexOnAType(mcdocParserParser.IndexOnATypeContext ctx);
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
	 * Enter a parse tree produced by {@link mcdocParserParser#documentAttributeSet}.
	 * @param ctx the parse tree
	 */
	void enterDocumentAttributeSet(mcdocParserParser.DocumentAttributeSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#documentAttributeSet}.
	 * @param ctx the parse tree
	 */
	void exitDocumentAttributeSet(mcdocParserParser.DocumentAttributeSetContext ctx);
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
	 * Enter a parse tree produced by {@link mcdocParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(mcdocParserParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(mcdocParserParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#canonical}.
	 * @param ctx the parse tree
	 */
	void enterCanonical(mcdocParserParser.CanonicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#canonical}.
	 * @param ctx the parse tree
	 */
	void exitCanonical(mcdocParserParser.CanonicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(mcdocParserParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(mcdocParserParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#commandSlashOptions}.
	 * @param ctx the parse tree
	 */
	void enterCommandSlashOptions(mcdocParserParser.CommandSlashOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#commandSlashOptions}.
	 * @param ctx the parse tree
	 */
	void exitCommandSlashOptions(mcdocParserParser.CommandSlashOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#commandMacroOptions}.
	 * @param ctx the parse tree
	 */
	void enterCommandMacroOptions(mcdocParserParser.CommandMacroOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#commandMacroOptions}.
	 * @param ctx the parse tree
	 */
	void exitCommandMacroOptions(mcdocParserParser.CommandMacroOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#commandEmptyOptions}.
	 * @param ctx the parse tree
	 */
	void enterCommandEmptyOptions(mcdocParserParser.CommandEmptyOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#commandEmptyOptions}.
	 * @param ctx the parse tree
	 */
	void exitCommandEmptyOptions(mcdocParserParser.CommandEmptyOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#commandMaxLength}.
	 * @param ctx the parse tree
	 */
	void enterCommandMaxLength(mcdocParserParser.CommandMaxLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#commandMaxLength}.
	 * @param ctx the parse tree
	 */
	void exitCommandMaxLength(mcdocParserParser.CommandMaxLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#commandParameters}.
	 * @param ctx the parse tree
	 */
	void enterCommandParameters(mcdocParserParser.CommandParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#commandParameters}.
	 * @param ctx the parse tree
	 */
	void exitCommandParameters(mcdocParserParser.CommandParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(mcdocParserParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(mcdocParserParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#deprecated}.
	 * @param ctx the parse tree
	 */
	void enterDeprecated(mcdocParserParser.DeprecatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#deprecated}.
	 * @param ctx the parse tree
	 */
	void exitDeprecated(mcdocParserParser.DeprecatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#dispatcher_key}.
	 * @param ctx the parse tree
	 */
	void enterDispatcher_key(mcdocParserParser.Dispatcher_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#dispatcher_key}.
	 * @param ctx the parse tree
	 */
	void exitDispatcher_key(mcdocParserParser.Dispatcher_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#divisible_by}.
	 * @param ctx the parse tree
	 */
	void enterDivisible_by(mcdocParserParser.Divisible_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#divisible_by}.
	 * @param ctx the parse tree
	 */
	void exitDivisible_by(mcdocParserParser.Divisible_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#entityAmount}.
	 * @param ctx the parse tree
	 */
	void enterEntityAmount(mcdocParserParser.EntityAmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#entityAmount}.
	 * @param ctx the parse tree
	 */
	void exitEntityAmount(mcdocParserParser.EntityAmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#entityType}.
	 * @param ctx the parse tree
	 */
	void enterEntityType(mcdocParserParser.EntityTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#entityType}.
	 * @param ctx the parse tree
	 */
	void exitEntityType(mcdocParserParser.EntityTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#entityParameters}.
	 * @param ctx the parse tree
	 */
	void enterEntityParameters(mcdocParserParser.EntityParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#entityParameters}.
	 * @param ctx the parse tree
	 */
	void exitEntityParameters(mcdocParserParser.EntityParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(mcdocParserParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(mcdocParserParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#gameRuleParameter}.
	 * @param ctx the parse tree
	 */
	void enterGameRuleParameter(mcdocParserParser.GameRuleParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#gameRuleParameter}.
	 * @param ctx the parse tree
	 */
	void exitGameRuleParameter(mcdocParserParser.GameRuleParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#gameRule}.
	 * @param ctx the parse tree
	 */
	void enterGameRule(mcdocParserParser.GameRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#gameRule}.
	 * @param ctx the parse tree
	 */
	void exitGameRule(mcdocParserParser.GameRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#idRegistry}.
	 * @param ctx the parse tree
	 */
	void enterIdRegistry(mcdocParserParser.IdRegistryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#idRegistry}.
	 * @param ctx the parse tree
	 */
	void exitIdRegistry(mcdocParserParser.IdRegistryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#idTags}.
	 * @param ctx the parse tree
	 */
	void enterIdTags(mcdocParserParser.IdTagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#idTags}.
	 * @param ctx the parse tree
	 */
	void exitIdTags(mcdocParserParser.IdTagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#idParameters}.
	 * @param ctx the parse tree
	 */
	void enterIdParameters(mcdocParserParser.IdParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#idParameters}.
	 * @param ctx the parse tree
	 */
	void exitIdParameters(mcdocParserParser.IdParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(mcdocParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(mcdocParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#match_regex}.
	 * @param ctx the parse tree
	 */
	void enterMatch_regex(mcdocParserParser.Match_regexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#match_regex}.
	 * @param ctx the parse tree
	 */
	void exitMatch_regex(mcdocParserParser.Match_regexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#nbt}.
	 * @param ctx the parse tree
	 */
	void enterNbt(mcdocParserParser.NbtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#nbt}.
	 * @param ctx the parse tree
	 */
	void exitNbt(mcdocParserParser.NbtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#nbt_path}.
	 * @param ctx the parse tree
	 */
	void enterNbt_path(mcdocParserParser.Nbt_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#nbt_path}.
	 * @param ctx the parse tree
	 */
	void exitNbt_path(mcdocParserParser.Nbt_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#objective}.
	 * @param ctx the parse tree
	 */
	void enterObjective(mcdocParserParser.ObjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#objective}.
	 * @param ctx the parse tree
	 */
	void exitObjective(mcdocParserParser.ObjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#regex_pattern}.
	 * @param ctx the parse tree
	 */
	void enterRegex_pattern(mcdocParserParser.Regex_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#regex_pattern}.
	 * @param ctx the parse tree
	 */
	void exitRegex_pattern(mcdocParserParser.Regex_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#score_holder}.
	 * @param ctx the parse tree
	 */
	void enterScore_holder(mcdocParserParser.Score_holderContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#score_holder}.
	 * @param ctx the parse tree
	 */
	void exitScore_holder(mcdocParserParser.Score_holderContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#since}.
	 * @param ctx the parse tree
	 */
	void enterSince(mcdocParserParser.SinceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#since}.
	 * @param ctx the parse tree
	 */
	void exitSince(mcdocParserParser.SinceContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(mcdocParserParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(mcdocParserParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(mcdocParserParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(mcdocParserParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#team}.
	 * @param ctx the parse tree
	 */
	void enterTeam(mcdocParserParser.TeamContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#team}.
	 * @param ctx the parse tree
	 */
	void exitTeam(mcdocParserParser.TeamContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#text_component}.
	 * @param ctx the parse tree
	 */
	void enterText_component(mcdocParserParser.Text_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#text_component}.
	 * @param ctx the parse tree
	 */
	void exitText_component(mcdocParserParser.Text_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#uuid}.
	 * @param ctx the parse tree
	 */
	void enterUuid(mcdocParserParser.UuidContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#uuid}.
	 * @param ctx the parse tree
	 */
	void exitUuid(mcdocParserParser.UuidContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#usefilePath}.
	 * @param ctx the parse tree
	 */
	void enterUsefilePath(mcdocParserParser.UsefilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#usefilePath}.
	 * @param ctx the parse tree
	 */
	void exitUsefilePath(mcdocParserParser.UsefilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#useSentence}.
	 * @param ctx the parse tree
	 */
	void enterUseSentence(mcdocParserParser.UseSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#useSentence}.
	 * @param ctx the parse tree
	 */
	void exitUseSentence(mcdocParserParser.UseSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#documentAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDocumentAttribute(mcdocParserParser.DocumentAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#documentAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDocumentAttribute(mcdocParserParser.DocumentAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(mcdocParserParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(mcdocParserParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(mcdocParserParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(mcdocParserParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structReference}.
	 * @param ctx the parse tree
	 */
	void enterStructReference(mcdocParserParser.StructReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structReference}.
	 * @param ctx the parse tree
	 */
	void exitStructReference(mcdocParserParser.StructReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#superInvoke}.
	 * @param ctx the parse tree
	 */
	void enterSuperInvoke(mcdocParserParser.SuperInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#superInvoke}.
	 * @param ctx the parse tree
	 */
	void exitSuperInvoke(mcdocParserParser.SuperInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structContent}.
	 * @param ctx the parse tree
	 */
	void enterStructContent(mcdocParserParser.StructContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structContent}.
	 * @param ctx the parse tree
	 */
	void exitStructContent(mcdocParserParser.StructContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(mcdocParserParser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(mcdocParserParser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#structSentence}.
	 * @param ctx the parse tree
	 */
	void enterStructSentence(mcdocParserParser.StructSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#structSentence}.
	 * @param ctx the parse tree
	 */
	void exitStructSentence(mcdocParserParser.StructSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcdocParserParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(mcdocParserParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcdocParserParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(mcdocParserParser.DocumentContext ctx);
}