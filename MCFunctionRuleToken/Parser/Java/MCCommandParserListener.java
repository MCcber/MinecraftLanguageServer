// Generated from D:/C#Project/MinecraftLanguageServer/MCFunctionRule/MCCommandParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MCCommandParser}.
 */
public interface MCCommandParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#atChar}.
	 * @param ctx the parse tree
	 */
	void enterAtChar(MCCommandParser.AtCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#atChar}.
	 * @param ctx the parse tree
	 */
	void exitAtChar(MCCommandParser.AtCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#atLetter}.
	 * @param ctx the parse tree
	 */
	void enterAtLetter(MCCommandParser.AtLetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#atLetter}.
	 * @param ctx the parse tree
	 */
	void exitAtLetter(MCCommandParser.AtLetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#exclamationMark}.
	 * @param ctx the parse tree
	 */
	void enterExclamationMark(MCCommandParser.ExclamationMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#exclamationMark}.
	 * @param ctx the parse tree
	 */
	void exitExclamationMark(MCCommandParser.ExclamationMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#leftSquareBracket}.
	 * @param ctx the parse tree
	 */
	void enterLeftSquareBracket(MCCommandParser.LeftSquareBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#leftSquareBracket}.
	 * @param ctx the parse tree
	 */
	void exitLeftSquareBracket(MCCommandParser.LeftSquareBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rightSquareBracket}.
	 * @param ctx the parse tree
	 */
	void enterRightSquareBracket(MCCommandParser.RightSquareBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rightSquareBracket}.
	 * @param ctx the parse tree
	 */
	void exitRightSquareBracket(MCCommandParser.RightSquareBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#leftCurlyBracket}.
	 * @param ctx the parse tree
	 */
	void enterLeftCurlyBracket(MCCommandParser.LeftCurlyBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#leftCurlyBracket}.
	 * @param ctx the parse tree
	 */
	void exitLeftCurlyBracket(MCCommandParser.LeftCurlyBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rightCurlyBracket}.
	 * @param ctx the parse tree
	 */
	void enterRightCurlyBracket(MCCommandParser.RightCurlyBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rightCurlyBracket}.
	 * @param ctx the parse tree
	 */
	void exitRightCurlyBracket(MCCommandParser.RightCurlyBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dimensionId}.
	 * @param ctx the parse tree
	 */
	void enterDimensionId(MCCommandParser.DimensionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dimensionId}.
	 * @param ctx the parse tree
	 */
	void exitDimensionId(MCCommandParser.DimensionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#mobAttribute}.
	 * @param ctx the parse tree
	 */
	void enterMobAttribute(MCCommandParser.MobAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#mobAttribute}.
	 * @param ctx the parse tree
	 */
	void exitMobAttribute(MCCommandParser.MobAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MCCommandParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MCCommandParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#intInterval}.
	 * @param ctx the parse tree
	 */
	void enterIntInterval(MCCommandParser.IntIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#intInterval}.
	 * @param ctx the parse tree
	 */
	void exitIntInterval(MCCommandParser.IntIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(MCCommandParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(MCCommandParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#axeValue}.
	 * @param ctx the parse tree
	 */
	void enterAxeValue(MCCommandParser.AxeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#axeValue}.
	 * @param ctx the parse tree
	 */
	void exitAxeValue(MCCommandParser.AxeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gameTimeValue}.
	 * @param ctx the parse tree
	 */
	void enterGameTimeValue(MCCommandParser.GameTimeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gameTimeValue}.
	 * @param ctx the parse tree
	 */
	void exitGameTimeValue(MCCommandParser.GameTimeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#biomeId}.
	 * @param ctx the parse tree
	 */
	void enterBiomeId(MCCommandParser.BiomeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#biomeId}.
	 * @param ctx the parse tree
	 */
	void exitBiomeId(MCCommandParser.BiomeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MCCommandParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MCCommandParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(MCCommandParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(MCCommandParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jsonComponent}.
	 * @param ctx the parse tree
	 */
	void enterJsonComponent(MCCommandParser.JsonComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jsonComponent}.
	 * @param ctx the parse tree
	 */
	void exitJsonComponent(MCCommandParser.JsonComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#uuid}.
	 * @param ctx the parse tree
	 */
	void enterUuid(MCCommandParser.UuidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#uuid}.
	 * @param ctx the parse tree
	 */
	void exitUuid(MCCommandParser.UuidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jobject}.
	 * @param ctx the parse tree
	 */
	void enterJobject(MCCommandParser.JobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jobject}.
	 * @param ctx the parse tree
	 */
	void exitJobject(MCCommandParser.JobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jarray}.
	 * @param ctx the parse tree
	 */
	void enterJarray(MCCommandParser.JarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jarray}.
	 * @param ctx the parse tree
	 */
	void exitJarray(MCCommandParser.JarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jkey}.
	 * @param ctx the parse tree
	 */
	void enterJkey(MCCommandParser.JkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jkey}.
	 * @param ctx the parse tree
	 */
	void exitJkey(MCCommandParser.JkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jpair}.
	 * @param ctx the parse tree
	 */
	void enterJpair(MCCommandParser.JpairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jpair}.
	 * @param ctx the parse tree
	 */
	void exitJpair(MCCommandParser.JpairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#sNbt}.
	 * @param ctx the parse tree
	 */
	void enterSNbt(MCCommandParser.SNbtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#sNbt}.
	 * @param ctx the parse tree
	 */
	void exitSNbt(MCCommandParser.SNbtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jDouble}.
	 * @param ctx the parse tree
	 */
	void enterJDouble(MCCommandParser.JDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jDouble}.
	 * @param ctx the parse tree
	 */
	void exitJDouble(MCCommandParser.JDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jFloat}.
	 * @param ctx the parse tree
	 */
	void enterJFloat(MCCommandParser.JFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jFloat}.
	 * @param ctx the parse tree
	 */
	void exitJFloat(MCCommandParser.JFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jvalue}.
	 * @param ctx the parse tree
	 */
	void enterJvalue(MCCommandParser.JvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jvalue}.
	 * @param ctx the parse tree
	 */
	void exitJvalue(MCCommandParser.JvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbtPathItem}.
	 * @param ctx the parse tree
	 */
	void enterNbtPathItem(MCCommandParser.NbtPathItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbtPathItem}.
	 * @param ctx the parse tree
	 */
	void exitNbtPathItem(MCCommandParser.NbtPathItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbtObject}.
	 * @param ctx the parse tree
	 */
	void enterNbtObject(MCCommandParser.NbtObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbtObject}.
	 * @param ctx the parse tree
	 */
	void exitNbtObject(MCCommandParser.NbtObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbtArray}.
	 * @param ctx the parse tree
	 */
	void enterNbtArray(MCCommandParser.NbtArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbtArray}.
	 * @param ctx the parse tree
	 */
	void exitNbtArray(MCCommandParser.NbtArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbtPair}.
	 * @param ctx the parse tree
	 */
	void enterNbtPair(MCCommandParser.NbtPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbtPair}.
	 * @param ctx the parse tree
	 */
	void exitNbtPair(MCCommandParser.NbtPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbtValue}.
	 * @param ctx the parse tree
	 */
	void enterNbtValue(MCCommandParser.NbtValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbtValue}.
	 * @param ctx the parse tree
	 */
	void exitNbtValue(MCCommandParser.NbtValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbtPath}.
	 * @param ctx the parse tree
	 */
	void enterNbtPath(MCCommandParser.NbtPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbtPath}.
	 * @param ctx the parse tree
	 */
	void exitNbtPath(MCCommandParser.NbtPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(MCCommandParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(MCCommandParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemId}.
	 * @param ctx the parse tree
	 */
	void enterItemId(MCCommandParser.ItemIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemId}.
	 * @param ctx the parse tree
	 */
	void exitItemId(MCCommandParser.ItemIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#blockState}.
	 * @param ctx the parse tree
	 */
	void enterBlockState(MCCommandParser.BlockStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#blockState}.
	 * @param ctx the parse tree
	 */
	void exitBlockState(MCCommandParser.BlockStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#blockID}.
	 * @param ctx the parse tree
	 */
	void enterBlockID(MCCommandParser.BlockIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#blockID}.
	 * @param ctx the parse tree
	 */
	void exitBlockID(MCCommandParser.BlockIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#blockNBT}.
	 * @param ctx the parse tree
	 */
	void enterBlockNBT(MCCommandParser.BlockNBTContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#blockNBT}.
	 * @param ctx the parse tree
	 */
	void exitBlockNBT(MCCommandParser.BlockNBTContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#entityNBT}.
	 * @param ctx the parse tree
	 */
	void enterEntityNBT(MCCommandParser.EntityNBTContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#entityNBT}.
	 * @param ctx the parse tree
	 */
	void exitEntityNBT(MCCommandParser.EntityNBTContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#targetObjective}.
	 * @param ctx the parse tree
	 */
	void enterTargetObjective(MCCommandParser.TargetObjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#targetObjective}.
	 * @param ctx the parse tree
	 */
	void exitTargetObjective(MCCommandParser.TargetObjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#storageId}.
	 * @param ctx the parse tree
	 */
	void enterStorageId(MCCommandParser.StorageIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#storageId}.
	 * @param ctx the parse tree
	 */
	void exitStorageId(MCCommandParser.StorageIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#storageIdString}.
	 * @param ctx the parse tree
	 */
	void enterStorageIdString(MCCommandParser.StorageIdStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#storageIdString}.
	 * @param ctx the parse tree
	 */
	void exitStorageIdString(MCCommandParser.StorageIdStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#coordinateX}.
	 * @param ctx the parse tree
	 */
	void enterCoordinateX(MCCommandParser.CoordinateXContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#coordinateX}.
	 * @param ctx the parse tree
	 */
	void exitCoordinateX(MCCommandParser.CoordinateXContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#coordinateY}.
	 * @param ctx the parse tree
	 */
	void enterCoordinateY(MCCommandParser.CoordinateYContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#coordinateY}.
	 * @param ctx the parse tree
	 */
	void exitCoordinateY(MCCommandParser.CoordinateYContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#coordinateZ}.
	 * @param ctx the parse tree
	 */
	void enterCoordinateZ(MCCommandParser.CoordinateZContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#coordinateZ}.
	 * @param ctx the parse tree
	 */
	void exitCoordinateZ(MCCommandParser.CoordinateZContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#pos3D}.
	 * @param ctx the parse tree
	 */
	void enterPos3D(MCCommandParser.Pos3DContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#pos3D}.
	 * @param ctx the parse tree
	 */
	void exitPos3D(MCCommandParser.Pos3DContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#pos2D}.
	 * @param ctx the parse tree
	 */
	void enterPos2D(MCCommandParser.Pos2DContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#pos2D}.
	 * @param ctx the parse tree
	 */
	void exitPos2D(MCCommandParser.Pos2DContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gamemodeValue}.
	 * @param ctx the parse tree
	 */
	void enterGamemodeValue(MCCommandParser.GamemodeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gamemodeValue}.
	 * @param ctx the parse tree
	 */
	void exitGamemodeValue(MCCommandParser.GamemodeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#sortValue}.
	 * @param ctx the parse tree
	 */
	void enterSortValue(MCCommandParser.SortValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#sortValue}.
	 * @param ctx the parse tree
	 */
	void exitSortValue(MCCommandParser.SortValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MCCommandParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MCCommandParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#viewRotationValue}.
	 * @param ctx the parse tree
	 */
	void enterViewRotationValue(MCCommandParser.ViewRotationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#viewRotationValue}.
	 * @param ctx the parse tree
	 */
	void exitViewRotationValue(MCCommandParser.ViewRotationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#doubleInterval}.
	 * @param ctx the parse tree
	 */
	void enterDoubleInterval(MCCommandParser.DoubleIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#doubleInterval}.
	 * @param ctx the parse tree
	 */
	void exitDoubleInterval(MCCommandParser.DoubleIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#positiveDouble}.
	 * @param ctx the parse tree
	 */
	void enterPositiveDouble(MCCommandParser.PositiveDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#positiveDouble}.
	 * @param ctx the parse tree
	 */
	void exitPositiveDouble(MCCommandParser.PositiveDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#positiveDoubleInterval}.
	 * @param ctx the parse tree
	 */
	void enterPositiveDoubleInterval(MCCommandParser.PositiveDoubleIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#positiveDoubleInterval}.
	 * @param ctx the parse tree
	 */
	void exitPositiveDoubleInterval(MCCommandParser.PositiveDoubleIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#levelValue}.
	 * @param ctx the parse tree
	 */
	void enterLevelValue(MCCommandParser.LevelValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#levelValue}.
	 * @param ctx the parse tree
	 */
	void exitLevelValue(MCCommandParser.LevelValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(MCCommandParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(MCCommandParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#entityType}.
	 * @param ctx the parse tree
	 */
	void enterEntityType(MCCommandParser.EntityTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#entityType}.
	 * @param ctx the parse tree
	 */
	void exitEntityType(MCCommandParser.EntityTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#predicateValue}.
	 * @param ctx the parse tree
	 */
	void enterPredicateValue(MCCommandParser.PredicateValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#predicateValue}.
	 * @param ctx the parse tree
	 */
	void exitPredicateValue(MCCommandParser.PredicateValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(MCCommandParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(MCCommandParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorName(MCCommandParser.SelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorName(MCCommandParser.SelectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#selectorParameter}.
	 * @param ctx the parse tree
	 */
	void enterSelectorParameter(MCCommandParser.SelectorParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#selectorParameter}.
	 * @param ctx the parse tree
	 */
	void exitSelectorParameter(MCCommandParser.SelectorParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scorePath}.
	 * @param ctx the parse tree
	 */
	void enterScorePath(MCCommandParser.ScorePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scorePath}.
	 * @param ctx the parse tree
	 */
	void exitScorePath(MCCommandParser.ScorePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreParameter}.
	 * @param ctx the parse tree
	 */
	void enterScoreParameter(MCCommandParser.ScoreParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreParameter}.
	 * @param ctx the parse tree
	 */
	void exitScoreParameter(MCCommandParser.ScoreParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoresValue}.
	 * @param ctx the parse tree
	 */
	void enterScoresValue(MCCommandParser.ScoresValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoresValue}.
	 * @param ctx the parse tree
	 */
	void exitScoresValue(MCCommandParser.ScoresValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MCCommandParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MCCommandParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(MCCommandParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(MCCommandParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#axeKey}.
	 * @param ctx the parse tree
	 */
	void enterAxeKey(MCCommandParser.AxeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#axeKey}.
	 * @param ctx the parse tree
	 */
	void exitAxeKey(MCCommandParser.AxeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(MCCommandParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(MCCommandParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#advancementKey}.
	 * @param ctx the parse tree
	 */
	void enterAdvancementKey(MCCommandParser.AdvancementKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#advancementKey}.
	 * @param ctx the parse tree
	 */
	void exitAdvancementKey(MCCommandParser.AdvancementKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#attributeKey}.
	 * @param ctx the parse tree
	 */
	void enterAttributeKey(MCCommandParser.AttributeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#attributeKey}.
	 * @param ctx the parse tree
	 */
	void exitAttributeKey(MCCommandParser.AttributeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarKey}.
	 * @param ctx the parse tree
	 */
	void enterBossbarKey(MCCommandParser.BossbarKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarKey}.
	 * @param ctx the parse tree
	 */
	void exitBossbarKey(MCCommandParser.BossbarKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#clearKey}.
	 * @param ctx the parse tree
	 */
	void enterClearKey(MCCommandParser.ClearKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#clearKey}.
	 * @param ctx the parse tree
	 */
	void exitClearKey(MCCommandParser.ClearKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneKey}.
	 * @param ctx the parse tree
	 */
	void enterCloneKey(MCCommandParser.CloneKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneKey}.
	 * @param ctx the parse tree
	 */
	void exitCloneKey(MCCommandParser.CloneKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#damageKey}.
	 * @param ctx the parse tree
	 */
	void enterDamageKey(MCCommandParser.DamageKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#damageKey}.
	 * @param ctx the parse tree
	 */
	void exitDamageKey(MCCommandParser.DamageKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataKey}.
	 * @param ctx the parse tree
	 */
	void enterDataKey(MCCommandParser.DataKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataKey}.
	 * @param ctx the parse tree
	 */
	void exitDataKey(MCCommandParser.DataKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#datapackKey}.
	 * @param ctx the parse tree
	 */
	void enterDatapackKey(MCCommandParser.DatapackKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#datapackKey}.
	 * @param ctx the parse tree
	 */
	void exitDatapackKey(MCCommandParser.DatapackKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#debugKey}.
	 * @param ctx the parse tree
	 */
	void enterDebugKey(MCCommandParser.DebugKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#debugKey}.
	 * @param ctx the parse tree
	 */
	void exitDebugKey(MCCommandParser.DebugKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#defaultgamemodeKey}.
	 * @param ctx the parse tree
	 */
	void enterDefaultgamemodeKey(MCCommandParser.DefaultgamemodeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#defaultgamemodeKey}.
	 * @param ctx the parse tree
	 */
	void exitDefaultgamemodeKey(MCCommandParser.DefaultgamemodeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#difficultyKey}.
	 * @param ctx the parse tree
	 */
	void enterDifficultyKey(MCCommandParser.DifficultyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#difficultyKey}.
	 * @param ctx the parse tree
	 */
	void exitDifficultyKey(MCCommandParser.DifficultyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#effectKey}.
	 * @param ctx the parse tree
	 */
	void enterEffectKey(MCCommandParser.EffectKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#effectKey}.
	 * @param ctx the parse tree
	 */
	void exitEffectKey(MCCommandParser.EffectKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#enchantKey}.
	 * @param ctx the parse tree
	 */
	void enterEnchantKey(MCCommandParser.EnchantKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#enchantKey}.
	 * @param ctx the parse tree
	 */
	void exitEnchantKey(MCCommandParser.EnchantKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeKey}.
	 * @param ctx the parse tree
	 */
	void enterExecuteKey(MCCommandParser.ExecuteKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeKey}.
	 * @param ctx the parse tree
	 */
	void exitExecuteKey(MCCommandParser.ExecuteKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#experienceKey}.
	 * @param ctx the parse tree
	 */
	void enterExperienceKey(MCCommandParser.ExperienceKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#experienceKey}.
	 * @param ctx the parse tree
	 */
	void exitExperienceKey(MCCommandParser.ExperienceKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fillKey}.
	 * @param ctx the parse tree
	 */
	void enterFillKey(MCCommandParser.FillKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fillKey}.
	 * @param ctx the parse tree
	 */
	void exitFillKey(MCCommandParser.FillKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fillbiomeKey}.
	 * @param ctx the parse tree
	 */
	void enterFillbiomeKey(MCCommandParser.FillbiomeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fillbiomeKey}.
	 * @param ctx the parse tree
	 */
	void exitFillbiomeKey(MCCommandParser.FillbiomeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#forceloadKey}.
	 * @param ctx the parse tree
	 */
	void enterForceloadKey(MCCommandParser.ForceloadKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#forceloadKey}.
	 * @param ctx the parse tree
	 */
	void exitForceloadKey(MCCommandParser.ForceloadKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#functionKey}.
	 * @param ctx the parse tree
	 */
	void enterFunctionKey(MCCommandParser.FunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#functionKey}.
	 * @param ctx the parse tree
	 */
	void exitFunctionKey(MCCommandParser.FunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gamemodeKey}.
	 * @param ctx the parse tree
	 */
	void enterGamemodeKey(MCCommandParser.GamemodeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gamemodeKey}.
	 * @param ctx the parse tree
	 */
	void exitGamemodeKey(MCCommandParser.GamemodeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gameruleKey}.
	 * @param ctx the parse tree
	 */
	void enterGameruleKey(MCCommandParser.GameruleKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gameruleKey}.
	 * @param ctx the parse tree
	 */
	void exitGameruleKey(MCCommandParser.GameruleKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#giveKey}.
	 * @param ctx the parse tree
	 */
	void enterGiveKey(MCCommandParser.GiveKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#giveKey}.
	 * @param ctx the parse tree
	 */
	void exitGiveKey(MCCommandParser.GiveKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#helpKey}.
	 * @param ctx the parse tree
	 */
	void enterHelpKey(MCCommandParser.HelpKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#helpKey}.
	 * @param ctx the parse tree
	 */
	void exitHelpKey(MCCommandParser.HelpKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemKey}.
	 * @param ctx the parse tree
	 */
	void enterItemKey(MCCommandParser.ItemKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemKey}.
	 * @param ctx the parse tree
	 */
	void exitItemKey(MCCommandParser.ItemKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jfrKey}.
	 * @param ctx the parse tree
	 */
	void enterJfrKey(MCCommandParser.JfrKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jfrKey}.
	 * @param ctx the parse tree
	 */
	void exitJfrKey(MCCommandParser.JfrKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#kickKey}.
	 * @param ctx the parse tree
	 */
	void enterKickKey(MCCommandParser.KickKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#kickKey}.
	 * @param ctx the parse tree
	 */
	void exitKickKey(MCCommandParser.KickKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#killKey}.
	 * @param ctx the parse tree
	 */
	void enterKillKey(MCCommandParser.KillKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#killKey}.
	 * @param ctx the parse tree
	 */
	void exitKillKey(MCCommandParser.KillKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#listKey}.
	 * @param ctx the parse tree
	 */
	void enterListKey(MCCommandParser.ListKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#listKey}.
	 * @param ctx the parse tree
	 */
	void exitListKey(MCCommandParser.ListKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#locateKey}.
	 * @param ctx the parse tree
	 */
	void enterLocateKey(MCCommandParser.LocateKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#locateKey}.
	 * @param ctx the parse tree
	 */
	void exitLocateKey(MCCommandParser.LocateKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootKey}.
	 * @param ctx the parse tree
	 */
	void enterLootKey(MCCommandParser.LootKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootKey}.
	 * @param ctx the parse tree
	 */
	void exitLootKey(MCCommandParser.LootKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#meKey}.
	 * @param ctx the parse tree
	 */
	void enterMeKey(MCCommandParser.MeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#meKey}.
	 * @param ctx the parse tree
	 */
	void exitMeKey(MCCommandParser.MeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#msgKey}.
	 * @param ctx the parse tree
	 */
	void enterMsgKey(MCCommandParser.MsgKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#msgKey}.
	 * @param ctx the parse tree
	 */
	void exitMsgKey(MCCommandParser.MsgKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleKey}.
	 * @param ctx the parse tree
	 */
	void enterParticleKey(MCCommandParser.ParticleKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleKey}.
	 * @param ctx the parse tree
	 */
	void exitParticleKey(MCCommandParser.ParticleKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#placeKey}.
	 * @param ctx the parse tree
	 */
	void enterPlaceKey(MCCommandParser.PlaceKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#placeKey}.
	 * @param ctx the parse tree
	 */
	void exitPlaceKey(MCCommandParser.PlaceKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#playsoundKey}.
	 * @param ctx the parse tree
	 */
	void enterPlaysoundKey(MCCommandParser.PlaysoundKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#playsoundKey}.
	 * @param ctx the parse tree
	 */
	void exitPlaysoundKey(MCCommandParser.PlaysoundKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#publishKey}.
	 * @param ctx the parse tree
	 */
	void enterPublishKey(MCCommandParser.PublishKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#publishKey}.
	 * @param ctx the parse tree
	 */
	void exitPublishKey(MCCommandParser.PublishKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#recipeKey}.
	 * @param ctx the parse tree
	 */
	void enterRecipeKey(MCCommandParser.RecipeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#recipeKey}.
	 * @param ctx the parse tree
	 */
	void exitRecipeKey(MCCommandParser.RecipeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#reloadKey}.
	 * @param ctx the parse tree
	 */
	void enterReloadKey(MCCommandParser.ReloadKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#reloadKey}.
	 * @param ctx the parse tree
	 */
	void exitReloadKey(MCCommandParser.ReloadKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#returnKey}.
	 * @param ctx the parse tree
	 */
	void enterReturnKey(MCCommandParser.ReturnKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#returnKey}.
	 * @param ctx the parse tree
	 */
	void exitReturnKey(MCCommandParser.ReturnKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rideKey}.
	 * @param ctx the parse tree
	 */
	void enterRideKey(MCCommandParser.RideKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rideKey}.
	 * @param ctx the parse tree
	 */
	void exitRideKey(MCCommandParser.RideKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#sayKey}.
	 * @param ctx the parse tree
	 */
	void enterSayKey(MCCommandParser.SayKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#sayKey}.
	 * @param ctx the parse tree
	 */
	void exitSayKey(MCCommandParser.SayKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scheduleKey}.
	 * @param ctx the parse tree
	 */
	void enterScheduleKey(MCCommandParser.ScheduleKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scheduleKey}.
	 * @param ctx the parse tree
	 */
	void exitScheduleKey(MCCommandParser.ScheduleKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardKey}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardKey(MCCommandParser.ScoreboardKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardKey}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardKey(MCCommandParser.ScoreboardKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#seedKey}.
	 * @param ctx the parse tree
	 */
	void enterSeedKey(MCCommandParser.SeedKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#seedKey}.
	 * @param ctx the parse tree
	 */
	void exitSeedKey(MCCommandParser.SeedKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#setblockKey}.
	 * @param ctx the parse tree
	 */
	void enterSetblockKey(MCCommandParser.SetblockKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#setblockKey}.
	 * @param ctx the parse tree
	 */
	void exitSetblockKey(MCCommandParser.SetblockKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#setworldspawnKey}.
	 * @param ctx the parse tree
	 */
	void enterSetworldspawnKey(MCCommandParser.SetworldspawnKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#setworldspawnKey}.
	 * @param ctx the parse tree
	 */
	void exitSetworldspawnKey(MCCommandParser.SetworldspawnKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spawnpointKey}.
	 * @param ctx the parse tree
	 */
	void enterSpawnpointKey(MCCommandParser.SpawnpointKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spawnpointKey}.
	 * @param ctx the parse tree
	 */
	void exitSpawnpointKey(MCCommandParser.SpawnpointKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spectateKey}.
	 * @param ctx the parse tree
	 */
	void enterSpectateKey(MCCommandParser.SpectateKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spectateKey}.
	 * @param ctx the parse tree
	 */
	void exitSpectateKey(MCCommandParser.SpectateKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spreadplayersKey}.
	 * @param ctx the parse tree
	 */
	void enterSpreadplayersKey(MCCommandParser.SpreadplayersKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spreadplayersKey}.
	 * @param ctx the parse tree
	 */
	void exitSpreadplayersKey(MCCommandParser.SpreadplayersKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stopsoundKey}.
	 * @param ctx the parse tree
	 */
	void enterStopsoundKey(MCCommandParser.StopsoundKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stopsoundKey}.
	 * @param ctx the parse tree
	 */
	void exitStopsoundKey(MCCommandParser.StopsoundKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#summonKey}.
	 * @param ctx the parse tree
	 */
	void enterSummonKey(MCCommandParser.SummonKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#summonKey}.
	 * @param ctx the parse tree
	 */
	void exitSummonKey(MCCommandParser.SummonKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tagKey}.
	 * @param ctx the parse tree
	 */
	void enterTagKey(MCCommandParser.TagKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tagKey}.
	 * @param ctx the parse tree
	 */
	void exitTagKey(MCCommandParser.TagKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamKey}.
	 * @param ctx the parse tree
	 */
	void enterTeamKey(MCCommandParser.TeamKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamKey}.
	 * @param ctx the parse tree
	 */
	void exitTeamKey(MCCommandParser.TeamKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teammsgKey}.
	 * @param ctx the parse tree
	 */
	void enterTeammsgKey(MCCommandParser.TeammsgKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teammsgKey}.
	 * @param ctx the parse tree
	 */
	void exitTeammsgKey(MCCommandParser.TeammsgKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teleportKey}.
	 * @param ctx the parse tree
	 */
	void enterTeleportKey(MCCommandParser.TeleportKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teleportKey}.
	 * @param ctx the parse tree
	 */
	void exitTeleportKey(MCCommandParser.TeleportKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tellKey}.
	 * @param ctx the parse tree
	 */
	void enterTellKey(MCCommandParser.TellKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tellKey}.
	 * @param ctx the parse tree
	 */
	void exitTellKey(MCCommandParser.TellKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tellrawKey}.
	 * @param ctx the parse tree
	 */
	void enterTellrawKey(MCCommandParser.TellrawKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tellrawKey}.
	 * @param ctx the parse tree
	 */
	void exitTellrawKey(MCCommandParser.TellrawKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#timeKey}.
	 * @param ctx the parse tree
	 */
	void enterTimeKey(MCCommandParser.TimeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#timeKey}.
	 * @param ctx the parse tree
	 */
	void exitTimeKey(MCCommandParser.TimeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#titleKey}.
	 * @param ctx the parse tree
	 */
	void enterTitleKey(MCCommandParser.TitleKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#titleKey}.
	 * @param ctx the parse tree
	 */
	void exitTitleKey(MCCommandParser.TitleKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tmKey}.
	 * @param ctx the parse tree
	 */
	void enterTmKey(MCCommandParser.TmKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tmKey}.
	 * @param ctx the parse tree
	 */
	void exitTmKey(MCCommandParser.TmKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tpKey}.
	 * @param ctx the parse tree
	 */
	void enterTpKey(MCCommandParser.TpKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tpKey}.
	 * @param ctx the parse tree
	 */
	void exitTpKey(MCCommandParser.TpKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#triggerKey}.
	 * @param ctx the parse tree
	 */
	void enterTriggerKey(MCCommandParser.TriggerKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#triggerKey}.
	 * @param ctx the parse tree
	 */
	void exitTriggerKey(MCCommandParser.TriggerKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#weatherKey}.
	 * @param ctx the parse tree
	 */
	void enterWeatherKey(MCCommandParser.WeatherKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#weatherKey}.
	 * @param ctx the parse tree
	 */
	void exitWeatherKey(MCCommandParser.WeatherKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#worldborderKey}.
	 * @param ctx the parse tree
	 */
	void enterWorldborderKey(MCCommandParser.WorldborderKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#worldborderKey}.
	 * @param ctx the parse tree
	 */
	void exitWorldborderKey(MCCommandParser.WorldborderKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#xpKey}.
	 * @param ctx the parse tree
	 */
	void enterXpKey(MCCommandParser.XpKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#xpKey}.
	 * @param ctx the parse tree
	 */
	void exitXpKey(MCCommandParser.XpKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#axeLengthKey}.
	 * @param ctx the parse tree
	 */
	void enterAxeLengthKey(MCCommandParser.AxeLengthKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#axeLengthKey}.
	 * @param ctx the parse tree
	 */
	void exitAxeLengthKey(MCCommandParser.AxeLengthKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#viewRotationKey}.
	 * @param ctx the parse tree
	 */
	void enterViewRotationKey(MCCommandParser.ViewRotationKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#viewRotationKey}.
	 * @param ctx the parse tree
	 */
	void exitViewRotationKey(MCCommandParser.ViewRotationKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(MCCommandParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(MCCommandParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreKey}.
	 * @param ctx the parse tree
	 */
	void enterScoreKey(MCCommandParser.ScoreKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreKey}.
	 * @param ctx the parse tree
	 */
	void exitScoreKey(MCCommandParser.ScoreKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(MCCommandParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(MCCommandParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#typeKey}.
	 * @param ctx the parse tree
	 */
	void enterTypeKey(MCCommandParser.TypeKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#typeKey}.
	 * @param ctx the parse tree
	 */
	void exitTypeKey(MCCommandParser.TypeKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nbt}.
	 * @param ctx the parse tree
	 */
	void enterNbt(MCCommandParser.NbtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nbt}.
	 * @param ctx the parse tree
	 */
	void exitNbt(MCCommandParser.NbtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#sortKey}.
	 * @param ctx the parse tree
	 */
	void enterSortKey(MCCommandParser.SortKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#sortKey}.
	 * @param ctx the parse tree
	 */
	void exitSortKey(MCCommandParser.SortKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#divisionEqual}.
	 * @param ctx the parse tree
	 */
	void enterDivisionEqual(MCCommandParser.DivisionEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#divisionEqual}.
	 * @param ctx the parse tree
	 */
	void exitDivisionEqual(MCCommandParser.DivisionEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#multiplicationEqual}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationEqual(MCCommandParser.MultiplicationEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#multiplicationEqual}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationEqual(MCCommandParser.MultiplicationEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#additionEqual}.
	 * @param ctx the parse tree
	 */
	void enterAdditionEqual(MCCommandParser.AdditionEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#additionEqual}.
	 * @param ctx the parse tree
	 */
	void exitAdditionEqual(MCCommandParser.AdditionEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#subtractionEqual}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionEqual(MCCommandParser.SubtractionEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#subtractionEqual}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionEqual(MCCommandParser.SubtractionEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#remainderEqual}.
	 * @param ctx the parse tree
	 */
	void enterRemainderEqual(MCCommandParser.RemainderEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#remainderEqual}.
	 * @param ctx the parse tree
	 */
	void exitRemainderEqual(MCCommandParser.RemainderEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(MCCommandParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(MCCommandParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lessThanOrEqualTo}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualTo(MCCommandParser.LessThanOrEqualToContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lessThanOrEqualTo}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualTo(MCCommandParser.LessThanOrEqualToContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MCCommandParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MCCommandParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(MCCommandParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#greaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(MCCommandParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#greaterThanOrEqualTo}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualTo(MCCommandParser.GreaterThanOrEqualToContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#greaterThanOrEqualTo}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualTo(MCCommandParser.GreaterThanOrEqualToContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#greaterThanLessThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanLessThan(MCCommandParser.GreaterThanLessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#greaterThanLessThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanLessThan(MCCommandParser.GreaterThanLessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MCCommandParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MCCommandParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(MCCommandParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(MCCommandParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MCCommandParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MCCommandParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(MCCommandParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(MCCommandParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(MCCommandParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(MCCommandParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#multiply_base}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_base(MCCommandParser.Multiply_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#multiply_base}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_base(MCCommandParser.Multiply_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#max}.
	 * @param ctx the parse tree
	 */
	void enterMax(MCCommandParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#max}.
	 * @param ctx the parse tree
	 */
	void exitMax(MCCommandParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#players}.
	 * @param ctx the parse tree
	 */
	void enterPlayers(MCCommandParser.PlayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#players}.
	 * @param ctx the parse tree
	 */
	void exitPlayers(MCCommandParser.PlayersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#visible}.
	 * @param ctx the parse tree
	 */
	void enterVisible(MCCommandParser.VisibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#visible}.
	 * @param ctx the parse tree
	 */
	void exitVisible(MCCommandParser.VisibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(MCCommandParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(MCCommandParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MCCommandParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MCCommandParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(MCCommandParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(MCCommandParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#filtered}.
	 * @param ctx the parse tree
	 */
	void enterFiltered(MCCommandParser.FilteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#filtered}.
	 * @param ctx the parse tree
	 */
	void exitFiltered(MCCommandParser.FilteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#masked}.
	 * @param ctx the parse tree
	 */
	void enterMasked(MCCommandParser.MaskedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#masked}.
	 * @param ctx the parse tree
	 */
	void exitMasked(MCCommandParser.MaskedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(MCCommandParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(MCCommandParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#force}.
	 * @param ctx the parse tree
	 */
	void enterForce(MCCommandParser.ForceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#force}.
	 * @param ctx the parse tree
	 */
	void exitForce(MCCommandParser.ForceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(MCCommandParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(MCCommandParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#normal}.
	 * @param ctx the parse tree
	 */
	void enterNormal(MCCommandParser.NormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#normal}.
	 * @param ctx the parse tree
	 */
	void exitNormal(MCCommandParser.NormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(MCCommandParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(MCCommandParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#by}.
	 * @param ctx the parse tree
	 */
	void enterBy(MCCommandParser.ByContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#by}.
	 * @param ctx the parse tree
	 */
	void exitBy(MCCommandParser.ByContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#merge}.
	 * @param ctx the parse tree
	 */
	void enterMerge(MCCommandParser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#merge}.
	 * @param ctx the parse tree
	 */
	void exitMerge(MCCommandParser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#modify}.
	 * @param ctx the parse tree
	 */
	void enterModify(MCCommandParser.ModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#modify}.
	 * @param ctx the parse tree
	 */
	void exitModify(MCCommandParser.ModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MCCommandParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MCCommandParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(MCCommandParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(MCCommandParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#storage}.
	 * @param ctx the parse tree
	 */
	void enterStorage(MCCommandParser.StorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#storage}.
	 * @param ctx the parse tree
	 */
	void exitStorage(MCCommandParser.StorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stringKey}.
	 * @param ctx the parse tree
	 */
	void enterStringKey(MCCommandParser.StringKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stringKey}.
	 * @param ctx the parse tree
	 */
	void exitStringKey(MCCommandParser.StringKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(MCCommandParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(MCCommandParser.AsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(MCCommandParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(MCCommandParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(MCCommandParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(MCCommandParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#everything}.
	 * @param ctx the parse tree
	 */
	void enterEverything(MCCommandParser.EverythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#everything}.
	 * @param ctx the parse tree
	 */
	void exitEverything(MCCommandParser.EverythingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#only}.
	 * @param ctx the parse tree
	 */
	void enterOnly(MCCommandParser.OnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#only}.
	 * @param ctx the parse tree
	 */
	void exitOnly(MCCommandParser.OnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(MCCommandParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(MCCommandParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#through}.
	 * @param ctx the parse tree
	 */
	void enterThrough(MCCommandParser.ThroughContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#through}.
	 * @param ctx the parse tree
	 */
	void exitThrough(MCCommandParser.ThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(MCCommandParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(MCCommandParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(MCCommandParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(MCCommandParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(MCCommandParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(MCCommandParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(MCCommandParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(MCCommandParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#available}.
	 * @param ctx the parse tree
	 */
	void enterAvailable(MCCommandParser.AvailableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#available}.
	 * @param ctx the parse tree
	 */
	void exitAvailable(MCCommandParser.AvailableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#enable}.
	 * @param ctx the parse tree
	 */
	void enterEnable(MCCommandParser.EnableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#enable}.
	 * @param ctx the parse tree
	 */
	void exitEnable(MCCommandParser.EnableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#after}.
	 * @param ctx the parse tree
	 */
	void enterAfter(MCCommandParser.AfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#after}.
	 * @param ctx the parse tree
	 */
	void exitAfter(MCCommandParser.AfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#before}.
	 * @param ctx the parse tree
	 */
	void enterBefore(MCCommandParser.BeforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#before}.
	 * @param ctx the parse tree
	 */
	void exitBefore(MCCommandParser.BeforeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#first}.
	 * @param ctx the parse tree
	 */
	void enterFirst(MCCommandParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#first}.
	 * @param ctx the parse tree
	 */
	void exitFirst(MCCommandParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#last}.
	 * @param ctx the parse tree
	 */
	void enterLast(MCCommandParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#last}.
	 * @param ctx the parse tree
	 */
	void exitLast(MCCommandParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#disable}.
	 * @param ctx the parse tree
	 */
	void enterDisable(MCCommandParser.DisableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#disable}.
	 * @param ctx the parse tree
	 */
	void exitDisable(MCCommandParser.DisableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MCCommandParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MCCommandParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(MCCommandParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(MCCommandParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#infinite}.
	 * @param ctx the parse tree
	 */
	void enterInfinite(MCCommandParser.InfiniteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#infinite}.
	 * @param ctx the parse tree
	 */
	void exitInfinite(MCCommandParser.InfiniteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#easy}.
	 * @param ctx the parse tree
	 */
	void enterEasy(MCCommandParser.EasyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#easy}.
	 * @param ctx the parse tree
	 */
	void exitEasy(MCCommandParser.EasyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hard}.
	 * @param ctx the parse tree
	 */
	void enterHard(MCCommandParser.HardContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hard}.
	 * @param ctx the parse tree
	 */
	void exitHard(MCCommandParser.HardContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#peaceful}.
	 * @param ctx the parse tree
	 */
	void enterPeaceful(MCCommandParser.PeacefulContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#peaceful}.
	 * @param ctx the parse tree
	 */
	void exitPeaceful(MCCommandParser.PeacefulContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#eyes}.
	 * @param ctx the parse tree
	 */
	void enterEyes(MCCommandParser.EyesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#eyes}.
	 * @param ctx the parse tree
	 */
	void exitEyes(MCCommandParser.EyesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#feet}.
	 * @param ctx the parse tree
	 */
	void enterFeet(MCCommandParser.FeetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#feet}.
	 * @param ctx the parse tree
	 */
	void exitFeet(MCCommandParser.FeetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(MCCommandParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(MCCommandParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#biome}.
	 * @param ctx the parse tree
	 */
	void enterBiome(MCCommandParser.BiomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#biome}.
	 * @param ctx the parse tree
	 */
	void exitBiome(MCCommandParser.BiomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#blocks}.
	 * @param ctx the parse tree
	 */
	void enterBlocks(MCCommandParser.BlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#blocks}.
	 * @param ctx the parse tree
	 */
	void exitBlocks(MCCommandParser.BlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(MCCommandParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(MCCommandParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#loaded}.
	 * @param ctx the parse tree
	 */
	void enterLoaded(MCCommandParser.LoadedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#loaded}.
	 * @param ctx the parse tree
	 */
	void exitLoaded(MCCommandParser.LoadedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(MCCommandParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(MCCommandParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(MCCommandParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(MCCommandParser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#matches}.
	 * @param ctx the parse tree
	 */
	void enterMatches(MCCommandParser.MatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#matches}.
	 * @param ctx the parse tree
	 */
	void exitMatches(MCCommandParser.MatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#attacker}.
	 * @param ctx the parse tree
	 */
	void enterAttacker(MCCommandParser.AttackerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#attacker}.
	 * @param ctx the parse tree
	 */
	void exitAttacker(MCCommandParser.AttackerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(MCCommandParser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(MCCommandParser.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#leasher}.
	 * @param ctx the parse tree
	 */
	void enterLeasher(MCCommandParser.LeasherContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#leasher}.
	 * @param ctx the parse tree
	 */
	void exitLeasher(MCCommandParser.LeasherContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#origin}.
	 * @param ctx the parse tree
	 */
	void enterOrigin(MCCommandParser.OriginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#origin}.
	 * @param ctx the parse tree
	 */
	void exitOrigin(MCCommandParser.OriginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(MCCommandParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(MCCommandParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#passengers}.
	 * @param ctx the parse tree
	 */
	void enterPassengers(MCCommandParser.PassengersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#passengers}.
	 * @param ctx the parse tree
	 */
	void exitPassengers(MCCommandParser.PassengersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(MCCommandParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(MCCommandParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#vehicle}.
	 * @param ctx the parse tree
	 */
	void enterVehicle(MCCommandParser.VehicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#vehicle}.
	 * @param ctx the parse tree
	 */
	void exitVehicle(MCCommandParser.VehicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#motion_blocking}.
	 * @param ctx the parse tree
	 */
	void enterMotion_blocking(MCCommandParser.Motion_blockingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#motion_blocking}.
	 * @param ctx the parse tree
	 */
	void exitMotion_blocking(MCCommandParser.Motion_blockingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#motion_blocking_no_leaves}.
	 * @param ctx the parse tree
	 */
	void enterMotion_blocking_no_leaves(MCCommandParser.Motion_blocking_no_leavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#motion_blocking_no_leaves}.
	 * @param ctx the parse tree
	 */
	void exitMotion_blocking_no_leaves(MCCommandParser.Motion_blocking_no_leavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#ocean_floor}.
	 * @param ctx the parse tree
	 */
	void enterOcean_floor(MCCommandParser.Ocean_floorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#ocean_floor}.
	 * @param ctx the parse tree
	 */
	void exitOcean_floor(MCCommandParser.Ocean_floorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#world_surface}.
	 * @param ctx the parse tree
	 */
	void enterWorld_surface(MCCommandParser.World_surfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#world_surface}.
	 * @param ctx the parse tree
	 */
	void exitWorld_surface(MCCommandParser.World_surfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#over}.
	 * @param ctx the parse tree
	 */
	void enterOver(MCCommandParser.OverContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#over}.
	 * @param ctx the parse tree
	 */
	void exitOver(MCCommandParser.OverContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(MCCommandParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(MCCommandParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#success}.
	 * @param ctx the parse tree
	 */
	void enterSuccess(MCCommandParser.SuccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#success}.
	 * @param ctx the parse tree
	 */
	void exitSuccess(MCCommandParser.SuccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#align}.
	 * @param ctx the parse tree
	 */
	void enterAlign(MCCommandParser.AlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#align}.
	 * @param ctx the parse tree
	 */
	void exitAlign(MCCommandParser.AlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#anchored}.
	 * @param ctx the parse tree
	 */
	void enterAnchored(MCCommandParser.AnchoredContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#anchored}.
	 * @param ctx the parse tree
	 */
	void exitAnchored(MCCommandParser.AnchoredContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(MCCommandParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(MCCommandParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#unless}.
	 * @param ctx the parse tree
	 */
	void enterUnless(MCCommandParser.UnlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#unless}.
	 * @param ctx the parse tree
	 */
	void exitUnless(MCCommandParser.UnlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(MCCommandParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(MCCommandParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#on}.
	 * @param ctx the parse tree
	 */
	void enterOn(MCCommandParser.OnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#on}.
	 * @param ctx the parse tree
	 */
	void exitOn(MCCommandParser.OnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#positioned}.
	 * @param ctx the parse tree
	 */
	void enterPositioned(MCCommandParser.PositionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#positioned}.
	 * @param ctx the parse tree
	 */
	void exitPositioned(MCCommandParser.PositionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rotated}.
	 * @param ctx the parse tree
	 */
	void enterRotated(MCCommandParser.RotatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rotated}.
	 * @param ctx the parse tree
	 */
	void exitRotated(MCCommandParser.RotatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(MCCommandParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(MCCommandParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#store}.
	 * @param ctx the parse tree
	 */
	void enterStore(MCCommandParser.StoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#store}.
	 * @param ctx the parse tree
	 */
	void exitStore(MCCommandParser.StoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MCCommandParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MCCommandParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#levels}.
	 * @param ctx the parse tree
	 */
	void enterLevels(MCCommandParser.LevelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#levels}.
	 * @param ctx the parse tree
	 */
	void exitLevels(MCCommandParser.LevelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#points}.
	 * @param ctx the parse tree
	 */
	void enterPoints(MCCommandParser.PointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#points}.
	 * @param ctx the parse tree
	 */
	void exitPoints(MCCommandParser.PointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#destroy}.
	 * @param ctx the parse tree
	 */
	void enterDestroy(MCCommandParser.DestroyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#destroy}.
	 * @param ctx the parse tree
	 */
	void exitDestroy(MCCommandParser.DestroyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hollow}.
	 * @param ctx the parse tree
	 */
	void enterHollow(MCCommandParser.HollowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hollow}.
	 * @param ctx the parse tree
	 */
	void exitHollow(MCCommandParser.HollowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#keep}.
	 * @param ctx the parse tree
	 */
	void enterKeep(MCCommandParser.KeepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#keep}.
	 * @param ctx the parse tree
	 */
	void exitKeep(MCCommandParser.KeepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#outline}.
	 * @param ctx the parse tree
	 */
	void enterOutline(MCCommandParser.OutlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#outline}.
	 * @param ctx the parse tree
	 */
	void exitOutline(MCCommandParser.OutlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#uuids}.
	 * @param ctx the parse tree
	 */
	void enterUuids(MCCommandParser.UuidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#uuids}.
	 * @param ctx the parse tree
	 */
	void exitUuids(MCCommandParser.UuidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#poi}.
	 * @param ctx the parse tree
	 */
	void enterPoi(MCCommandParser.PoiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#poi}.
	 * @param ctx the parse tree
	 */
	void exitPoi(MCCommandParser.PoiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(MCCommandParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(MCCommandParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(MCCommandParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(MCCommandParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spawn}.
	 * @param ctx the parse tree
	 */
	void enterSpawn(MCCommandParser.SpawnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spawn}.
	 * @param ctx the parse tree
	 */
	void exitSpawn(MCCommandParser.SpawnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fish}.
	 * @param ctx the parse tree
	 */
	void enterFish(MCCommandParser.FishContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fish}.
	 * @param ctx the parse tree
	 */
	void exitFish(MCCommandParser.FishContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#mine}.
	 * @param ctx the parse tree
	 */
	void enterMine(MCCommandParser.MineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#mine}.
	 * @param ctx the parse tree
	 */
	void exitMine(MCCommandParser.MineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(MCCommandParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(MCCommandParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jigsaw}.
	 * @param ctx the parse tree
	 */
	void enterJigsaw(MCCommandParser.JigsawContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jigsaw}.
	 * @param ctx the parse tree
	 */
	void exitJigsaw(MCCommandParser.JigsawContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(MCCommandParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(MCCommandParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#front_back}.
	 * @param ctx the parse tree
	 */
	void enterFront_back(MCCommandParser.Front_backContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#front_back}.
	 * @param ctx the parse tree
	 */
	void exitFront_back(MCCommandParser.Front_backContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#left_right}.
	 * @param ctx the parse tree
	 */
	void enterLeft_right(MCCommandParser.Left_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#left_right}.
	 * @param ctx the parse tree
	 */
	void exitLeft_right(MCCommandParser.Left_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#none}.
	 * @param ctx the parse tree
	 */
	void enterNone(MCCommandParser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#none}.
	 * @param ctx the parse tree
	 */
	void exitNone(MCCommandParser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#clockwise_90}.
	 * @param ctx the parse tree
	 */
	void enterClockwise_90(MCCommandParser.Clockwise_90Context ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#clockwise_90}.
	 * @param ctx the parse tree
	 */
	void exitClockwise_90(MCCommandParser.Clockwise_90Context ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#counterclockwise_90}.
	 * @param ctx the parse tree
	 */
	void enterCounterclockwise_90(MCCommandParser.Counterclockwise_90Context ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#counterclockwise_90}.
	 * @param ctx the parse tree
	 */
	void exitCounterclockwise_90(MCCommandParser.Counterclockwise_90Context ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#ambient}.
	 * @param ctx the parse tree
	 */
	void enterAmbient(MCCommandParser.AmbientContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#ambient}.
	 * @param ctx the parse tree
	 */
	void exitAmbient(MCCommandParser.AmbientContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hostile}.
	 * @param ctx the parse tree
	 */
	void enterHostile(MCCommandParser.HostileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hostile}.
	 * @param ctx the parse tree
	 */
	void exitHostile(MCCommandParser.HostileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#master}.
	 * @param ctx the parse tree
	 */
	void enterMaster(MCCommandParser.MasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#master}.
	 * @param ctx the parse tree
	 */
	void exitMaster(MCCommandParser.MasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#music}.
	 * @param ctx the parse tree
	 */
	void enterMusic(MCCommandParser.MusicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#music}.
	 * @param ctx the parse tree
	 */
	void exitMusic(MCCommandParser.MusicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#neutral}.
	 * @param ctx the parse tree
	 */
	void enterNeutral(MCCommandParser.NeutralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#neutral}.
	 * @param ctx the parse tree
	 */
	void exitNeutral(MCCommandParser.NeutralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(MCCommandParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(MCCommandParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(MCCommandParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(MCCommandParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#voice}.
	 * @param ctx the parse tree
	 */
	void enterVoice(MCCommandParser.VoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#voice}.
	 * @param ctx the parse tree
	 */
	void exitVoice(MCCommandParser.VoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(MCCommandParser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(MCCommandParser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dismount}.
	 * @param ctx the parse tree
	 */
	void enterDismount(MCCommandParser.DismountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dismount}.
	 * @param ctx the parse tree
	 */
	void exitDismount(MCCommandParser.DismountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#mount}.
	 * @param ctx the parse tree
	 */
	void enterMount(MCCommandParser.MountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#mount}.
	 * @param ctx the parse tree
	 */
	void exitMount(MCCommandParser.MountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#objectives}.
	 * @param ctx the parse tree
	 */
	void enterObjectives(MCCommandParser.ObjectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#objectives}.
	 * @param ctx the parse tree
	 */
	void exitObjectives(MCCommandParser.ObjectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hearts}.
	 * @param ctx the parse tree
	 */
	void enterHearts(MCCommandParser.HeartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hearts}.
	 * @param ctx the parse tree
	 */
	void exitHearts(MCCommandParser.HeartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rendertype}.
	 * @param ctx the parse tree
	 */
	void enterRendertype(MCCommandParser.RendertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rendertype}.
	 * @param ctx the parse tree
	 */
	void exitRendertype(MCCommandParser.RendertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#setdisplay}.
	 * @param ctx the parse tree
	 */
	void enterSetdisplay(MCCommandParser.SetdisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#setdisplay}.
	 * @param ctx the parse tree
	 */
	void exitSetdisplay(MCCommandParser.SetdisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(MCCommandParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(MCCommandParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#reset}.
	 * @param ctx the parse tree
	 */
	void enterReset(MCCommandParser.ResetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#reset}.
	 * @param ctx the parse tree
	 */
	void exitReset(MCCommandParser.ResetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#under}.
	 * @param ctx the parse tree
	 */
	void enterUnder(MCCommandParser.UnderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#under}.
	 * @param ctx the parse tree
	 */
	void exitUnder(MCCommandParser.UnderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#actionbar}.
	 * @param ctx the parse tree
	 */
	void enterActionbar(MCCommandParser.ActionbarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#actionbar}.
	 * @param ctx the parse tree
	 */
	void exitActionbar(MCCommandParser.ActionbarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#subtitle}.
	 * @param ctx the parse tree
	 */
	void enterSubtitle(MCCommandParser.SubtitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#subtitle}.
	 * @param ctx the parse tree
	 */
	void exitSubtitle(MCCommandParser.SubtitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(MCCommandParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(MCCommandParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fadeIn}.
	 * @param ctx the parse tree
	 */
	void enterFadeIn(MCCommandParser.FadeInContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fadeIn}.
	 * @param ctx the parse tree
	 */
	void exitFadeIn(MCCommandParser.FadeInContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stay}.
	 * @param ctx the parse tree
	 */
	void enterStay(MCCommandParser.StayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stay}.
	 * @param ctx the parse tree
	 */
	void exitStay(MCCommandParser.StayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fadeOut}.
	 * @param ctx the parse tree
	 */
	void enterFadeOut(MCCommandParser.FadeOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fadeOut}.
	 * @param ctx the parse tree
	 */
	void exitFadeOut(MCCommandParser.FadeOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(MCCommandParser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(MCCommandParser.CenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#warning}.
	 * @param ctx the parse tree
	 */
	void enterWarning(MCCommandParser.WarningContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#warning}.
	 * @param ctx the parse tree
	 */
	void exitWarning(MCCommandParser.WarningContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#amount}.
	 * @param ctx the parse tree
	 */
	void enterAmount(MCCommandParser.AmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#amount}.
	 * @param ctx the parse tree
	 */
	void exitAmount(MCCommandParser.AmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#buffer}.
	 * @param ctx the parse tree
	 */
	void enterBuffer(MCCommandParser.BufferContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#buffer}.
	 * @param ctx the parse tree
	 */
	void exitBuffer(MCCommandParser.BufferContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#facing}.
	 * @param ctx the parse tree
	 */
	void enterFacing(MCCommandParser.FacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#facing}.
	 * @param ctx the parse tree
	 */
	void exitFacing(MCCommandParser.FacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#prepend}.
	 * @param ctx the parse tree
	 */
	void enterPrepend(MCCommandParser.PrependContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#prepend}.
	 * @param ctx the parse tree
	 */
	void exitPrepend(MCCommandParser.PrependContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#with}.
	 * @param ctx the parse tree
	 */
	void enterWith(MCCommandParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#with}.
	 * @param ctx the parse tree
	 */
	void exitWith(MCCommandParser.WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#mainhand}.
	 * @param ctx the parse tree
	 */
	void enterMainhand(MCCommandParser.MainhandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#mainhand}.
	 * @param ctx the parse tree
	 */
	void exitMainhand(MCCommandParser.MainhandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#offhand}.
	 * @param ctx the parse tree
	 */
	void enterOffhand(MCCommandParser.OffhandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#offhand}.
	 * @param ctx the parse tree
	 */
	void exitOffhand(MCCommandParser.OffhandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#take}.
	 * @param ctx the parse tree
	 */
	void enterTake(MCCommandParser.TakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#take}.
	 * @param ctx the parse tree
	 */
	void exitTake(MCCommandParser.TakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#always}.
	 * @param ctx the parse tree
	 */
	void enterAlways(MCCommandParser.AlwaysContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#always}.
	 * @param ctx the parse tree
	 */
	void exitAlways(MCCommandParser.AlwaysContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#never}.
	 * @param ctx the parse tree
	 */
	void enterNever(MCCommandParser.NeverContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#never}.
	 * @param ctx the parse tree
	 */
	void exitNever(MCCommandParser.NeverContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#pushOtherTeams}.
	 * @param ctx the parse tree
	 */
	void enterPushOtherTeams(MCCommandParser.PushOtherTeamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#pushOtherTeams}.
	 * @param ctx the parse tree
	 */
	void exitPushOtherTeams(MCCommandParser.PushOtherTeamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#pushOwnTeam}.
	 * @param ctx the parse tree
	 */
	void enterPushOwnTeam(MCCommandParser.PushOwnTeamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#pushOwnTeam}.
	 * @param ctx the parse tree
	 */
	void exitPushOwnTeam(MCCommandParser.PushOwnTeamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hideForOtherTeams}.
	 * @param ctx the parse tree
	 */
	void enterHideForOtherTeams(MCCommandParser.HideForOtherTeamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hideForOtherTeams}.
	 * @param ctx the parse tree
	 */
	void exitHideForOtherTeams(MCCommandParser.HideForOtherTeamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hideForOwnTeam}.
	 * @param ctx the parse tree
	 */
	void enterHideForOwnTeam(MCCommandParser.HideForOwnTeamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hideForOwnTeam}.
	 * @param ctx the parse tree
	 */
	void exitHideForOwnTeam(MCCommandParser.HideForOwnTeamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#friendlyFire}.
	 * @param ctx the parse tree
	 */
	void enterFriendlyFire(MCCommandParser.FriendlyFireContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#friendlyFire}.
	 * @param ctx the parse tree
	 */
	void exitFriendlyFire(MCCommandParser.FriendlyFireContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#nametagVisibility}.
	 * @param ctx the parse tree
	 */
	void enterNametagVisibility(MCCommandParser.NametagVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#nametagVisibility}.
	 * @param ctx the parse tree
	 */
	void exitNametagVisibility(MCCommandParser.NametagVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#seeFriendlyInvisibles}.
	 * @param ctx the parse tree
	 */
	void enterSeeFriendlyInvisibles(MCCommandParser.SeeFriendlyInvisiblesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#seeFriendlyInvisibles}.
	 * @param ctx the parse tree
	 */
	void exitSeeFriendlyInvisibles(MCCommandParser.SeeFriendlyInvisiblesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rain}.
	 * @param ctx the parse tree
	 */
	void enterRain(MCCommandParser.RainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rain}.
	 * @param ctx the parse tree
	 */
	void exitRain(MCCommandParser.RainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#thunder}.
	 * @param ctx the parse tree
	 */
	void enterThunder(MCCommandParser.ThunderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#thunder}.
	 * @param ctx the parse tree
	 */
	void exitThunder(MCCommandParser.ThunderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(MCCommandParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(MCCommandParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#midnight}.
	 * @param ctx the parse tree
	 */
	void enterMidnight(MCCommandParser.MidnightContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#midnight}.
	 * @param ctx the parse tree
	 */
	void exitMidnight(MCCommandParser.MidnightContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#night}.
	 * @param ctx the parse tree
	 */
	void enterNight(MCCommandParser.NightContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#night}.
	 * @param ctx the parse tree
	 */
	void exitNight(MCCommandParser.NightContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#daytime}.
	 * @param ctx the parse tree
	 */
	void enterDaytime(MCCommandParser.DaytimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#daytime}.
	 * @param ctx the parse tree
	 */
	void exitDaytime(MCCommandParser.DaytimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#noon}.
	 * @param ctx the parse tree
	 */
	void enterNoon(MCCommandParser.NoonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#noon}.
	 * @param ctx the parse tree
	 */
	void exitNoon(MCCommandParser.NoonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gametime}.
	 * @param ctx the parse tree
	 */
	void enterGametime(MCCommandParser.GametimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gametime}.
	 * @param ctx the parse tree
	 */
	void exitGametime(MCCommandParser.GametimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#distance}.
	 * @param ctx the parse tree
	 */
	void enterDistance(MCCommandParser.DistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#distance}.
	 * @param ctx the parse tree
	 */
	void exitDistance(MCCommandParser.DistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(MCCommandParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(MCCommandParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(MCCommandParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(MCCommandParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#leave}.
	 * @param ctx the parse tree
	 */
	void enterLeave(MCCommandParser.LeaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#leave}.
	 * @param ctx the parse tree
	 */
	void exitLeave(MCCommandParser.LeaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#collisionRule}.
	 * @param ctx the parse tree
	 */
	void enterCollisionRule(MCCommandParser.CollisionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#collisionRule}.
	 * @param ctx the parse tree
	 */
	void exitCollisionRule(MCCommandParser.CollisionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#deathMessageVisibility}.
	 * @param ctx the parse tree
	 */
	void enterDeathMessageVisibility(MCCommandParser.DeathMessageVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#deathMessageVisibility}.
	 * @param ctx the parse tree
	 */
	void exitDeathMessageVisibility(MCCommandParser.DeathMessageVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(MCCommandParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(MCCommandParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(MCCommandParser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(MCCommandParser.SuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#displayName}.
	 * @param ctx the parse tree
	 */
	void enterDisplayName(MCCommandParser.DisplayNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#displayName}.
	 * @param ctx the parse tree
	 */
	void exitDisplayName(MCCommandParser.DisplayNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(MCCommandParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(MCCommandParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#oneHundredAndEighty}.
	 * @param ctx the parse tree
	 */
	void enterOneHundredAndEighty(MCCommandParser.OneHundredAndEightyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#oneHundredAndEighty}.
	 * @param ctx the parse tree
	 */
	void exitOneHundredAndEighty(MCCommandParser.OneHundredAndEightyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#advancementRadical}.
	 * @param ctx the parse tree
	 */
	void enterAdvancementRadical(MCCommandParser.AdvancementRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#advancementRadical}.
	 * @param ctx the parse tree
	 */
	void exitAdvancementRadical(MCCommandParser.AdvancementRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#advancementCriterion}.
	 * @param ctx the parse tree
	 */
	void enterAdvancementCriterion(MCCommandParser.AdvancementCriterionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#advancementCriterion}.
	 * @param ctx the parse tree
	 */
	void exitAdvancementCriterion(MCCommandParser.AdvancementCriterionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#advancementCriterionBlock}.
	 * @param ctx the parse tree
	 */
	void enterAdvancementCriterionBlock(MCCommandParser.AdvancementCriterionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#advancementCriterionBlock}.
	 * @param ctx the parse tree
	 */
	void exitAdvancementCriterionBlock(MCCommandParser.AdvancementCriterionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#advancementValue}.
	 * @param ctx the parse tree
	 */
	void enterAdvancementValue(MCCommandParser.AdvancementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#advancementValue}.
	 * @param ctx the parse tree
	 */
	void exitAdvancementValue(MCCommandParser.AdvancementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#advancementModes}.
	 * @param ctx the parse tree
	 */
	void enterAdvancementModes(MCCommandParser.AdvancementModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#advancementModes}.
	 * @param ctx the parse tree
	 */
	void exitAdvancementModes(MCCommandParser.AdvancementModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#attributeRadical}.
	 * @param ctx the parse tree
	 */
	void enterAttributeRadical(MCCommandParser.AttributeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#attributeRadical}.
	 * @param ctx the parse tree
	 */
	void exitAttributeRadical(MCCommandParser.AttributeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOptions(MCCommandParser.AttributeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#attributeOptions}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOptions(MCCommandParser.AttributeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#baseModifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseModifier(MCCommandParser.BaseModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#baseModifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseModifier(MCCommandParser.BaseModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#modifierOptions}.
	 * @param ctx the parse tree
	 */
	void enterModifierOptions(MCCommandParser.ModifierOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#modifierOptions}.
	 * @param ctx the parse tree
	 */
	void exitModifierOptions(MCCommandParser.ModifierOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#modifierModes}.
	 * @param ctx the parse tree
	 */
	void enterModifierModes(MCCommandParser.ModifierModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#modifierModes}.
	 * @param ctx the parse tree
	 */
	void exitModifierModes(MCCommandParser.ModifierModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarRadical}.
	 * @param ctx the parse tree
	 */
	void enterBossbarRadical(MCCommandParser.BossbarRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarRadical}.
	 * @param ctx the parse tree
	 */
	void exitBossbarRadical(MCCommandParser.BossbarRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarID}.
	 * @param ctx the parse tree
	 */
	void enterBossbarID(MCCommandParser.BossbarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarID}.
	 * @param ctx the parse tree
	 */
	void exitBossbarID(MCCommandParser.BossbarIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarIdString}.
	 * @param ctx the parse tree
	 */
	void enterBossbarIdString(MCCommandParser.BossbarIdStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarIdString}.
	 * @param ctx the parse tree
	 */
	void exitBossbarIdString(MCCommandParser.BossbarIdStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarOptions}.
	 * @param ctx the parse tree
	 */
	void enterBossbarOptions(MCCommandParser.BossbarOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarOptions}.
	 * @param ctx the parse tree
	 */
	void exitBossbarOptions(MCCommandParser.BossbarOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarStyle}.
	 * @param ctx the parse tree
	 */
	void enterBossbarStyle(MCCommandParser.BossbarStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarStyle}.
	 * @param ctx the parse tree
	 */
	void exitBossbarStyle(MCCommandParser.BossbarStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarColor}.
	 * @param ctx the parse tree
	 */
	void enterBossbarColor(MCCommandParser.BossbarColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarColor}.
	 * @param ctx the parse tree
	 */
	void exitBossbarColor(MCCommandParser.BossbarColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarGetTarget}.
	 * @param ctx the parse tree
	 */
	void enterBossbarGetTarget(MCCommandParser.BossbarGetTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarGetTarget}.
	 * @param ctx the parse tree
	 */
	void exitBossbarGetTarget(MCCommandParser.BossbarGetTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#bossbarAttributes}.
	 * @param ctx the parse tree
	 */
	void enterBossbarAttributes(MCCommandParser.BossbarAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#bossbarAttributes}.
	 * @param ctx the parse tree
	 */
	void exitBossbarAttributes(MCCommandParser.BossbarAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#clearRadical}.
	 * @param ctx the parse tree
	 */
	void enterClearRadical(MCCommandParser.ClearRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#clearRadical}.
	 * @param ctx the parse tree
	 */
	void exitClearRadical(MCCommandParser.ClearRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(MCCommandParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(MCCommandParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneRadical}.
	 * @param ctx the parse tree
	 */
	void enterCloneRadical(MCCommandParser.CloneRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneRadical}.
	 * @param ctx the parse tree
	 */
	void exitCloneRadical(MCCommandParser.CloneRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneSource}.
	 * @param ctx the parse tree
	 */
	void enterCloneSource(MCCommandParser.CloneSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneSource}.
	 * @param ctx the parse tree
	 */
	void exitCloneSource(MCCommandParser.CloneSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneBegin}.
	 * @param ctx the parse tree
	 */
	void enterCloneBegin(MCCommandParser.CloneBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneBegin}.
	 * @param ctx the parse tree
	 */
	void exitCloneBegin(MCCommandParser.CloneBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneEnd}.
	 * @param ctx the parse tree
	 */
	void enterCloneEnd(MCCommandParser.CloneEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneEnd}.
	 * @param ctx the parse tree
	 */
	void exitCloneEnd(MCCommandParser.CloneEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneDestination}.
	 * @param ctx the parse tree
	 */
	void enterCloneDestination(MCCommandParser.CloneDestinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneDestination}.
	 * @param ctx the parse tree
	 */
	void exitCloneDestination(MCCommandParser.CloneDestinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#destinationPos}.
	 * @param ctx the parse tree
	 */
	void enterDestinationPos(MCCommandParser.DestinationPosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#destinationPos}.
	 * @param ctx the parse tree
	 */
	void exitDestinationPos(MCCommandParser.DestinationPosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneMode}.
	 * @param ctx the parse tree
	 */
	void enterCloneMode(MCCommandParser.CloneModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneMode}.
	 * @param ctx the parse tree
	 */
	void exitCloneMode(MCCommandParser.CloneModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#cloneBehavior}.
	 * @param ctx the parse tree
	 */
	void enterCloneBehavior(MCCommandParser.CloneBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#cloneBehavior}.
	 * @param ctx the parse tree
	 */
	void exitCloneBehavior(MCCommandParser.CloneBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#damageRadical}.
	 * @param ctx the parse tree
	 */
	void enterDamageRadical(MCCommandParser.DamageRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#damageRadical}.
	 * @param ctx the parse tree
	 */
	void exitDamageRadical(MCCommandParser.DamageRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#damageType}.
	 * @param ctx the parse tree
	 */
	void enterDamageType(MCCommandParser.DamageTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#damageType}.
	 * @param ctx the parse tree
	 */
	void exitDamageType(MCCommandParser.DamageTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#damageOptions}.
	 * @param ctx the parse tree
	 */
	void enterDamageOptions(MCCommandParser.DamageOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#damageOptions}.
	 * @param ctx the parse tree
	 */
	void exitDamageOptions(MCCommandParser.DamageOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataRadical}.
	 * @param ctx the parse tree
	 */
	void enterDataRadical(MCCommandParser.DataRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataRadical}.
	 * @param ctx the parse tree
	 */
	void exitDataRadical(MCCommandParser.DataRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataStringStart}.
	 * @param ctx the parse tree
	 */
	void enterDataStringStart(MCCommandParser.DataStringStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataStringStart}.
	 * @param ctx the parse tree
	 */
	void exitDataStringStart(MCCommandParser.DataStringStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataStringEnd}.
	 * @param ctx the parse tree
	 */
	void enterDataStringEnd(MCCommandParser.DataStringEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataStringEnd}.
	 * @param ctx the parse tree
	 */
	void exitDataStringEnd(MCCommandParser.DataStringEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataOptions}.
	 * @param ctx the parse tree
	 */
	void enterDataOptions(MCCommandParser.DataOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataOptions}.
	 * @param ctx the parse tree
	 */
	void exitDataOptions(MCCommandParser.DataOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataGetTarget}.
	 * @param ctx the parse tree
	 */
	void enterDataGetTarget(MCCommandParser.DataGetTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataGetTarget}.
	 * @param ctx the parse tree
	 */
	void exitDataGetTarget(MCCommandParser.DataGetTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataMergeTarget}.
	 * @param ctx the parse tree
	 */
	void enterDataMergeTarget(MCCommandParser.DataMergeTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataMergeTarget}.
	 * @param ctx the parse tree
	 */
	void exitDataMergeTarget(MCCommandParser.DataMergeTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataModifyStringTarget}.
	 * @param ctx the parse tree
	 */
	void enterDataModifyStringTarget(MCCommandParser.DataModifyStringTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataModifyStringTarget}.
	 * @param ctx the parse tree
	 */
	void exitDataModifyStringTarget(MCCommandParser.DataModifyStringTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataModifyFromTarget}.
	 * @param ctx the parse tree
	 */
	void enterDataModifyFromTarget(MCCommandParser.DataModifyFromTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataModifyFromTarget}.
	 * @param ctx the parse tree
	 */
	void exitDataModifyFromTarget(MCCommandParser.DataModifyFromTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataModifyBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterDataModifyBehaviors(MCCommandParser.DataModifyBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataModifyBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitDataModifyBehaviors(MCCommandParser.DataModifyBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataModifyOptions}.
	 * @param ctx the parse tree
	 */
	void enterDataModifyOptions(MCCommandParser.DataModifyOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataModifyOptions}.
	 * @param ctx the parse tree
	 */
	void exitDataModifyOptions(MCCommandParser.DataModifyOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataModifyTarget}.
	 * @param ctx the parse tree
	 */
	void enterDataModifyTarget(MCCommandParser.DataModifyTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataModifyTarget}.
	 * @param ctx the parse tree
	 */
	void exitDataModifyTarget(MCCommandParser.DataModifyTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#dataRemoveTarget}.
	 * @param ctx the parse tree
	 */
	void enterDataRemoveTarget(MCCommandParser.DataRemoveTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#dataRemoveTarget}.
	 * @param ctx the parse tree
	 */
	void exitDataRemoveTarget(MCCommandParser.DataRemoveTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#datapackRadical}.
	 * @param ctx the parse tree
	 */
	void enterDatapackRadical(MCCommandParser.DatapackRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#datapackRadical}.
	 * @param ctx the parse tree
	 */
	void exitDatapackRadical(MCCommandParser.DatapackRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#datapackState}.
	 * @param ctx the parse tree
	 */
	void enterDatapackState(MCCommandParser.DatapackStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#datapackState}.
	 * @param ctx the parse tree
	 */
	void exitDatapackState(MCCommandParser.DatapackStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#datapackId}.
	 * @param ctx the parse tree
	 */
	void enterDatapackId(MCCommandParser.DatapackIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#datapackId}.
	 * @param ctx the parse tree
	 */
	void exitDatapackId(MCCommandParser.DatapackIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#datapackBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterDatapackBehaviors(MCCommandParser.DatapackBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#datapackBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitDatapackBehaviors(MCCommandParser.DatapackBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#datapackOptions}.
	 * @param ctx the parse tree
	 */
	void enterDatapackOptions(MCCommandParser.DatapackOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#datapackOptions}.
	 * @param ctx the parse tree
	 */
	void exitDatapackOptions(MCCommandParser.DatapackOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#debugRadical}.
	 * @param ctx the parse tree
	 */
	void enterDebugRadical(MCCommandParser.DebugRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#debugRadical}.
	 * @param ctx the parse tree
	 */
	void exitDebugRadical(MCCommandParser.DebugRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#debugOptions}.
	 * @param ctx the parse tree
	 */
	void enterDebugOptions(MCCommandParser.DebugOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#debugOptions}.
	 * @param ctx the parse tree
	 */
	void exitDebugOptions(MCCommandParser.DebugOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#defaultgamemodeRadical}.
	 * @param ctx the parse tree
	 */
	void enterDefaultgamemodeRadical(MCCommandParser.DefaultgamemodeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#defaultgamemodeRadical}.
	 * @param ctx the parse tree
	 */
	void exitDefaultgamemodeRadical(MCCommandParser.DefaultgamemodeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#difficultyRadical}.
	 * @param ctx the parse tree
	 */
	void enterDifficultyRadical(MCCommandParser.DifficultyRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#difficultyRadical}.
	 * @param ctx the parse tree
	 */
	void exitDifficultyRadical(MCCommandParser.DifficultyRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#difficultyValues}.
	 * @param ctx the parse tree
	 */
	void enterDifficultyValues(MCCommandParser.DifficultyValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#difficultyValues}.
	 * @param ctx the parse tree
	 */
	void exitDifficultyValues(MCCommandParser.DifficultyValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#effectRadical}.
	 * @param ctx the parse tree
	 */
	void enterEffectRadical(MCCommandParser.EffectRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#effectRadical}.
	 * @param ctx the parse tree
	 */
	void exitEffectRadical(MCCommandParser.EffectRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#effectOption}.
	 * @param ctx the parse tree
	 */
	void enterEffectOption(MCCommandParser.EffectOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#effectOption}.
	 * @param ctx the parse tree
	 */
	void exitEffectOption(MCCommandParser.EffectOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#effectID}.
	 * @param ctx the parse tree
	 */
	void enterEffectID(MCCommandParser.EffectIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#effectID}.
	 * @param ctx the parse tree
	 */
	void exitEffectID(MCCommandParser.EffectIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#effectTime}.
	 * @param ctx the parse tree
	 */
	void enterEffectTime(MCCommandParser.EffectTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#effectTime}.
	 * @param ctx the parse tree
	 */
	void exitEffectTime(MCCommandParser.EffectTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(MCCommandParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(MCCommandParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#amplifier}.
	 * @param ctx the parse tree
	 */
	void enterAmplifier(MCCommandParser.AmplifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#amplifier}.
	 * @param ctx the parse tree
	 */
	void exitAmplifier(MCCommandParser.AmplifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#hideParticles}.
	 * @param ctx the parse tree
	 */
	void enterHideParticles(MCCommandParser.HideParticlesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#hideParticles}.
	 * @param ctx the parse tree
	 */
	void exitHideParticles(MCCommandParser.HideParticlesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#enchantRadical}.
	 * @param ctx the parse tree
	 */
	void enterEnchantRadical(MCCommandParser.EnchantRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#enchantRadical}.
	 * @param ctx the parse tree
	 */
	void exitEnchantRadical(MCCommandParser.EnchantRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#enchantLevel}.
	 * @param ctx the parse tree
	 */
	void enterEnchantLevel(MCCommandParser.EnchantLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#enchantLevel}.
	 * @param ctx the parse tree
	 */
	void exitEnchantLevel(MCCommandParser.EnchantLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#enchantID}.
	 * @param ctx the parse tree
	 */
	void enterEnchantID(MCCommandParser.EnchantIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#enchantID}.
	 * @param ctx the parse tree
	 */
	void exitEnchantID(MCCommandParser.EnchantIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeRadical}.
	 * @param ctx the parse tree
	 */
	void enterExecuteRadical(MCCommandParser.ExecuteRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeRadical}.
	 * @param ctx the parse tree
	 */
	void exitExecuteRadical(MCCommandParser.ExecuteRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeEyesOrFeet}.
	 * @param ctx the parse tree
	 */
	void enterExecuteEyesOrFeet(MCCommandParser.ExecuteEyesOrFeetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeEyesOrFeet}.
	 * @param ctx the parse tree
	 */
	void exitExecuteEyesOrFeet(MCCommandParser.ExecuteEyesOrFeetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#axes}.
	 * @param ctx the parse tree
	 */
	void enterAxes(MCCommandParser.AxesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#axes}.
	 * @param ctx the parse tree
	 */
	void exitAxes(MCCommandParser.AxesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeAllOrMasked}.
	 * @param ctx the parse tree
	 */
	void enterExecuteAllOrMasked(MCCommandParser.ExecuteAllOrMaskedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeAllOrMasked}.
	 * @param ctx the parse tree
	 */
	void exitExecuteAllOrMasked(MCCommandParser.ExecuteAllOrMaskedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeMaxOrValue}.
	 * @param ctx the parse tree
	 */
	void enterExecuteMaxOrValue(MCCommandParser.ExecuteMaxOrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeMaxOrValue}.
	 * @param ctx the parse tree
	 */
	void exitExecuteMaxOrValue(MCCommandParser.ExecuteMaxOrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeJudgeDataOptions}.
	 * @param ctx the parse tree
	 */
	void enterExecuteJudgeDataOptions(MCCommandParser.ExecuteJudgeDataOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeJudgeDataOptions}.
	 * @param ctx the parse tree
	 */
	void exitExecuteJudgeDataOptions(MCCommandParser.ExecuteJudgeDataOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeJudgementOptions}.
	 * @param ctx the parse tree
	 */
	void enterExecuteJudgementOptions(MCCommandParser.ExecuteJudgementOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeJudgementOptions}.
	 * @param ctx the parse tree
	 */
	void exitExecuteJudgementOptions(MCCommandParser.ExecuteJudgementOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeOperations}.
	 * @param ctx the parse tree
	 */
	void enterExecuteOperations(MCCommandParser.ExecuteOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeOperations}.
	 * @param ctx the parse tree
	 */
	void exitExecuteOperations(MCCommandParser.ExecuteOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeOn}.
	 * @param ctx the parse tree
	 */
	void enterExecuteOn(MCCommandParser.ExecuteOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeOn}.
	 * @param ctx the parse tree
	 */
	void exitExecuteOn(MCCommandParser.ExecuteOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeOver}.
	 * @param ctx the parse tree
	 */
	void enterExecuteOver(MCCommandParser.ExecuteOverContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeOver}.
	 * @param ctx the parse tree
	 */
	void exitExecuteOver(MCCommandParser.ExecuteOverContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executePositioned}.
	 * @param ctx the parse tree
	 */
	void enterExecutePositioned(MCCommandParser.ExecutePositionedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executePositioned}.
	 * @param ctx the parse tree
	 */
	void exitExecutePositioned(MCCommandParser.ExecutePositionedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeStoreTarget}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStoreTarget(MCCommandParser.ExecuteStoreTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeStoreTarget}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStoreTarget(MCCommandParser.ExecuteStoreTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeStore}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStore(MCCommandParser.ExecuteStoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeStore}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStore(MCCommandParser.ExecuteStoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeFacing}.
	 * @param ctx the parse tree
	 */
	void enterExecuteFacing(MCCommandParser.ExecuteFacingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeFacing}.
	 * @param ctx the parse tree
	 */
	void exitExecuteFacing(MCCommandParser.ExecuteFacingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#executeOptions}.
	 * @param ctx the parse tree
	 */
	void enterExecuteOptions(MCCommandParser.ExecuteOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#executeOptions}.
	 * @param ctx the parse tree
	 */
	void exitExecuteOptions(MCCommandParser.ExecuteOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#experienceRadical}.
	 * @param ctx the parse tree
	 */
	void enterExperienceRadical(MCCommandParser.ExperienceRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#experienceRadical}.
	 * @param ctx the parse tree
	 */
	void exitExperienceRadical(MCCommandParser.ExperienceRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#experienceAmount}.
	 * @param ctx the parse tree
	 */
	void enterExperienceAmount(MCCommandParser.ExperienceAmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#experienceAmount}.
	 * @param ctx the parse tree
	 */
	void exitExperienceAmount(MCCommandParser.ExperienceAmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#expreienceType}.
	 * @param ctx the parse tree
	 */
	void enterExpreienceType(MCCommandParser.ExpreienceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#expreienceType}.
	 * @param ctx the parse tree
	 */
	void exitExpreienceType(MCCommandParser.ExpreienceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#experienceOptions}.
	 * @param ctx the parse tree
	 */
	void enterExperienceOptions(MCCommandParser.ExperienceOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#experienceOptions}.
	 * @param ctx the parse tree
	 */
	void exitExperienceOptions(MCCommandParser.ExperienceOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fillRadical}.
	 * @param ctx the parse tree
	 */
	void enterFillRadical(MCCommandParser.FillRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fillRadical}.
	 * @param ctx the parse tree
	 */
	void exitFillRadical(MCCommandParser.FillRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fillOptions}.
	 * @param ctx the parse tree
	 */
	void enterFillOptions(MCCommandParser.FillOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fillOptions}.
	 * @param ctx the parse tree
	 */
	void exitFillOptions(MCCommandParser.FillOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fillbiomeRadical}.
	 * @param ctx the parse tree
	 */
	void enterFillbiomeRadical(MCCommandParser.FillbiomeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fillbiomeRadical}.
	 * @param ctx the parse tree
	 */
	void exitFillbiomeRadical(MCCommandParser.FillbiomeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#fillBiomeOptions}.
	 * @param ctx the parse tree
	 */
	void enterFillBiomeOptions(MCCommandParser.FillBiomeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#fillBiomeOptions}.
	 * @param ctx the parse tree
	 */
	void exitFillBiomeOptions(MCCommandParser.FillBiomeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#forceloadRadical}.
	 * @param ctx the parse tree
	 */
	void enterForceloadRadical(MCCommandParser.ForceloadRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#forceloadRadical}.
	 * @param ctx the parse tree
	 */
	void exitForceloadRadical(MCCommandParser.ForceloadRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#forceloadRemoveObjectives}.
	 * @param ctx the parse tree
	 */
	void enterForceloadRemoveObjectives(MCCommandParser.ForceloadRemoveObjectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#forceloadRemoveObjectives}.
	 * @param ctx the parse tree
	 */
	void exitForceloadRemoveObjectives(MCCommandParser.ForceloadRemoveObjectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#forceloadOptions}.
	 * @param ctx the parse tree
	 */
	void enterForceloadOptions(MCCommandParser.ForceloadOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#forceloadOptions}.
	 * @param ctx the parse tree
	 */
	void exitForceloadOptions(MCCommandParser.ForceloadOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#functionRadical}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRadical(MCCommandParser.FunctionRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#functionRadical}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRadical(MCCommandParser.FunctionRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gamemodeRadical}.
	 * @param ctx the parse tree
	 */
	void enterGamemodeRadical(MCCommandParser.GamemodeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gamemodeRadical}.
	 * @param ctx the parse tree
	 */
	void exitGamemodeRadical(MCCommandParser.GamemodeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gameruleRadical}.
	 * @param ctx the parse tree
	 */
	void enterGameruleRadical(MCCommandParser.GameruleRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gameruleRadical}.
	 * @param ctx the parse tree
	 */
	void exitGameruleRadical(MCCommandParser.GameruleRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gameruleName}.
	 * @param ctx the parse tree
	 */
	void enterGameruleName(MCCommandParser.GameruleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gameruleName}.
	 * @param ctx the parse tree
	 */
	void exitGameruleName(MCCommandParser.GameruleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#gameruleValue}.
	 * @param ctx the parse tree
	 */
	void enterGameruleValue(MCCommandParser.GameruleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#gameruleValue}.
	 * @param ctx the parse tree
	 */
	void exitGameruleValue(MCCommandParser.GameruleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#giveRadical}.
	 * @param ctx the parse tree
	 */
	void enterGiveRadical(MCCommandParser.GiveRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#giveRadical}.
	 * @param ctx the parse tree
	 */
	void exitGiveRadical(MCCommandParser.GiveRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#helpRadical}.
	 * @param ctx the parse tree
	 */
	void enterHelpRadical(MCCommandParser.HelpRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#helpRadical}.
	 * @param ctx the parse tree
	 */
	void exitHelpRadical(MCCommandParser.HelpRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#commandList}.
	 * @param ctx the parse tree
	 */
	void enterCommandList(MCCommandParser.CommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#commandList}.
	 * @param ctx the parse tree
	 */
	void exitCommandList(MCCommandParser.CommandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemRadical}.
	 * @param ctx the parse tree
	 */
	void enterItemRadical(MCCommandParser.ItemRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemRadical}.
	 * @param ctx the parse tree
	 */
	void exitItemRadical(MCCommandParser.ItemRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemSlot}.
	 * @param ctx the parse tree
	 */
	void enterItemSlot(MCCommandParser.ItemSlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemSlot}.
	 * @param ctx the parse tree
	 */
	void exitItemSlot(MCCommandParser.ItemSlotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemModifierFile}.
	 * @param ctx the parse tree
	 */
	void enterItemModifierFile(MCCommandParser.ItemModifierFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemModifierFile}.
	 * @param ctx the parse tree
	 */
	void exitItemModifierFile(MCCommandParser.ItemModifierFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemOptions}.
	 * @param ctx the parse tree
	 */
	void enterItemOptions(MCCommandParser.ItemOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemOptions}.
	 * @param ctx the parse tree
	 */
	void exitItemOptions(MCCommandParser.ItemOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterItemBehaviors(MCCommandParser.ItemBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitItemBehaviors(MCCommandParser.ItemBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemModifyTarget}.
	 * @param ctx the parse tree
	 */
	void enterItemModifyTarget(MCCommandParser.ItemModifyTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemModifyTarget}.
	 * @param ctx the parse tree
	 */
	void exitItemModifyTarget(MCCommandParser.ItemModifyTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#itemReplaceTarget}.
	 * @param ctx the parse tree
	 */
	void enterItemReplaceTarget(MCCommandParser.ItemReplaceTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#itemReplaceTarget}.
	 * @param ctx the parse tree
	 */
	void exitItemReplaceTarget(MCCommandParser.ItemReplaceTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jfrRadical}.
	 * @param ctx the parse tree
	 */
	void enterJfrRadical(MCCommandParser.JfrRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jfrRadical}.
	 * @param ctx the parse tree
	 */
	void exitJfrRadical(MCCommandParser.JfrRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jfrStartOrStop}.
	 * @param ctx the parse tree
	 */
	void enterJfrStartOrStop(MCCommandParser.JfrStartOrStopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jfrStartOrStop}.
	 * @param ctx the parse tree
	 */
	void exitJfrStartOrStop(MCCommandParser.JfrStartOrStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#kickRadical}.
	 * @param ctx the parse tree
	 */
	void enterKickRadical(MCCommandParser.KickRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#kickRadical}.
	 * @param ctx the parse tree
	 */
	void exitKickRadical(MCCommandParser.KickRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#reason}.
	 * @param ctx the parse tree
	 */
	void enterReason(MCCommandParser.ReasonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#reason}.
	 * @param ctx the parse tree
	 */
	void exitReason(MCCommandParser.ReasonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#killRadical}.
	 * @param ctx the parse tree
	 */
	void enterKillRadical(MCCommandParser.KillRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#killRadical}.
	 * @param ctx the parse tree
	 */
	void exitKillRadical(MCCommandParser.KillRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#listRadical}.
	 * @param ctx the parse tree
	 */
	void enterListRadical(MCCommandParser.ListRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#listRadical}.
	 * @param ctx the parse tree
	 */
	void exitListRadical(MCCommandParser.ListRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#locateRadical}.
	 * @param ctx the parse tree
	 */
	void enterLocateRadical(MCCommandParser.LocateRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#locateRadical}.
	 * @param ctx the parse tree
	 */
	void exitLocateRadical(MCCommandParser.LocateRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#poiId}.
	 * @param ctx the parse tree
	 */
	void enterPoiId(MCCommandParser.PoiIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#poiId}.
	 * @param ctx the parse tree
	 */
	void exitPoiId(MCCommandParser.PoiIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#structureId}.
	 * @param ctx the parse tree
	 */
	void enterStructureId(MCCommandParser.StructureIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#structureId}.
	 * @param ctx the parse tree
	 */
	void exitStructureId(MCCommandParser.StructureIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#locateOptions}.
	 * @param ctx the parse tree
	 */
	void enterLocateOptions(MCCommandParser.LocateOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#locateOptions}.
	 * @param ctx the parse tree
	 */
	void exitLocateOptions(MCCommandParser.LocateOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootRadical}.
	 * @param ctx the parse tree
	 */
	void enterLootRadical(MCCommandParser.LootRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootRadical}.
	 * @param ctx the parse tree
	 */
	void exitLootRadical(MCCommandParser.LootRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootFilePath}.
	 * @param ctx the parse tree
	 */
	void enterLootFilePath(MCCommandParser.LootFilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootFilePath}.
	 * @param ctx the parse tree
	 */
	void exitLootFilePath(MCCommandParser.LootFilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootTool}.
	 * @param ctx the parse tree
	 */
	void enterLootTool(MCCommandParser.LootToolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootTool}.
	 * @param ctx the parse tree
	 */
	void exitLootTool(MCCommandParser.LootToolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootOptions}.
	 * @param ctx the parse tree
	 */
	void enterLootOptions(MCCommandParser.LootOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootOptions}.
	 * @param ctx the parse tree
	 */
	void exitLootOptions(MCCommandParser.LootOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootReplace}.
	 * @param ctx the parse tree
	 */
	void enterLootReplace(MCCommandParser.LootReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootReplace}.
	 * @param ctx the parse tree
	 */
	void exitLootReplace(MCCommandParser.LootReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#lootModes}.
	 * @param ctx the parse tree
	 */
	void enterLootModes(MCCommandParser.LootModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#lootModes}.
	 * @param ctx the parse tree
	 */
	void exitLootModes(MCCommandParser.LootModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#meRadical}.
	 * @param ctx the parse tree
	 */
	void enterMeRadical(MCCommandParser.MeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#meRadical}.
	 * @param ctx the parse tree
	 */
	void exitMeRadical(MCCommandParser.MeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MCCommandParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MCCommandParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#msgRadical}.
	 * @param ctx the parse tree
	 */
	void enterMsgRadical(MCCommandParser.MsgRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#msgRadical}.
	 * @param ctx the parse tree
	 */
	void exitMsgRadical(MCCommandParser.MsgRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#msgMessage}.
	 * @param ctx the parse tree
	 */
	void enterMsgMessage(MCCommandParser.MsgMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#msgMessage}.
	 * @param ctx the parse tree
	 */
	void exitMsgMessage(MCCommandParser.MsgMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleRadical}.
	 * @param ctx the parse tree
	 */
	void enterParticleRadical(MCCommandParser.ParticleRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleRadical}.
	 * @param ctx the parse tree
	 */
	void exitParticleRadical(MCCommandParser.ParticleRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleSpeed}.
	 * @param ctx the parse tree
	 */
	void enterParticleSpeed(MCCommandParser.ParticleSpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleSpeed}.
	 * @param ctx the parse tree
	 */
	void exitParticleSpeed(MCCommandParser.ParticleSpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleCount}.
	 * @param ctx the parse tree
	 */
	void enterParticleCount(MCCommandParser.ParticleCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleCount}.
	 * @param ctx the parse tree
	 */
	void exitParticleCount(MCCommandParser.ParticleCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleDelta}.
	 * @param ctx the parse tree
	 */
	void enterParticleDelta(MCCommandParser.ParticleDeltaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleDelta}.
	 * @param ctx the parse tree
	 */
	void exitParticleDelta(MCCommandParser.ParticleDeltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleOptions}.
	 * @param ctx the parse tree
	 */
	void enterParticleOptions(MCCommandParser.ParticleOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleOptions}.
	 * @param ctx the parse tree
	 */
	void exitParticleOptions(MCCommandParser.ParticleOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleId}.
	 * @param ctx the parse tree
	 */
	void enterParticleId(MCCommandParser.ParticleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleId}.
	 * @param ctx the parse tree
	 */
	void exitParticleId(MCCommandParser.ParticleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#particleIDString}.
	 * @param ctx the parse tree
	 */
	void enterParticleIDString(MCCommandParser.ParticleIDStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#particleIDString}.
	 * @param ctx the parse tree
	 */
	void exitParticleIDString(MCCommandParser.ParticleIDStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#placeRadical}.
	 * @param ctx the parse tree
	 */
	void enterPlaceRadical(MCCommandParser.PlaceRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#placeRadical}.
	 * @param ctx the parse tree
	 */
	void exitPlaceRadical(MCCommandParser.PlaceRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#featureId}.
	 * @param ctx the parse tree
	 */
	void enterFeatureId(MCCommandParser.FeatureIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#featureId}.
	 * @param ctx the parse tree
	 */
	void exitFeatureId(MCCommandParser.FeatureIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jigsawTarget}.
	 * @param ctx the parse tree
	 */
	void enterJigsawTarget(MCCommandParser.JigsawTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jigsawTarget}.
	 * @param ctx the parse tree
	 */
	void exitJigsawTarget(MCCommandParser.JigsawTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#jigsawFilePath}.
	 * @param ctx the parse tree
	 */
	void enterJigsawFilePath(MCCommandParser.JigsawFilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#jigsawFilePath}.
	 * @param ctx the parse tree
	 */
	void exitJigsawFilePath(MCCommandParser.JigsawFilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#templateFilePath}.
	 * @param ctx the parse tree
	 */
	void enterTemplateFilePath(MCCommandParser.TemplateFilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#templateFilePath}.
	 * @param ctx the parse tree
	 */
	void exitTemplateFilePath(MCCommandParser.TemplateFilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#placeModes}.
	 * @param ctx the parse tree
	 */
	void enterPlaceModes(MCCommandParser.PlaceModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#placeModes}.
	 * @param ctx the parse tree
	 */
	void exitPlaceModes(MCCommandParser.PlaceModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#placeMirrorItems}.
	 * @param ctx the parse tree
	 */
	void enterPlaceMirrorItems(MCCommandParser.PlaceMirrorItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#placeMirrorItems}.
	 * @param ctx the parse tree
	 */
	void exitPlaceMirrorItems(MCCommandParser.PlaceMirrorItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#placeRotationModes}.
	 * @param ctx the parse tree
	 */
	void enterPlaceRotationModes(MCCommandParser.PlaceRotationModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#placeRotationModes}.
	 * @param ctx the parse tree
	 */
	void exitPlaceRotationModes(MCCommandParser.PlaceRotationModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#playsoundRadical}.
	 * @param ctx the parse tree
	 */
	void enterPlaysoundRadical(MCCommandParser.PlaysoundRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#playsoundRadical}.
	 * @param ctx the parse tree
	 */
	void exitPlaysoundRadical(MCCommandParser.PlaysoundRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#volume}.
	 * @param ctx the parse tree
	 */
	void enterVolume(MCCommandParser.VolumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#volume}.
	 * @param ctx the parse tree
	 */
	void exitVolume(MCCommandParser.VolumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#pitch}.
	 * @param ctx the parse tree
	 */
	void enterPitch(MCCommandParser.PitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#pitch}.
	 * @param ctx the parse tree
	 */
	void exitPitch(MCCommandParser.PitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#minVolume}.
	 * @param ctx the parse tree
	 */
	void enterMinVolume(MCCommandParser.MinVolumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#minVolume}.
	 * @param ctx the parse tree
	 */
	void exitMinVolume(MCCommandParser.MinVolumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#soundTypes}.
	 * @param ctx the parse tree
	 */
	void enterSoundTypes(MCCommandParser.SoundTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#soundTypes}.
	 * @param ctx the parse tree
	 */
	void exitSoundTypes(MCCommandParser.SoundTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#publishRadical}.
	 * @param ctx the parse tree
	 */
	void enterPublishRadical(MCCommandParser.PublishRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#publishRadical}.
	 * @param ctx the parse tree
	 */
	void exitPublishRadical(MCCommandParser.PublishRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MCCommandParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MCCommandParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#recipeRadical}.
	 * @param ctx the parse tree
	 */
	void enterRecipeRadical(MCCommandParser.RecipeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#recipeRadical}.
	 * @param ctx the parse tree
	 */
	void exitRecipeRadical(MCCommandParser.RecipeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#recipeFilePath}.
	 * @param ctx the parse tree
	 */
	void enterRecipeFilePath(MCCommandParser.RecipeFilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#recipeFilePath}.
	 * @param ctx the parse tree
	 */
	void exitRecipeFilePath(MCCommandParser.RecipeFilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#recipeGiveOrTake}.
	 * @param ctx the parse tree
	 */
	void enterRecipeGiveOrTake(MCCommandParser.RecipeGiveOrTakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#recipeGiveOrTake}.
	 * @param ctx the parse tree
	 */
	void exitRecipeGiveOrTake(MCCommandParser.RecipeGiveOrTakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#reloadRadical}.
	 * @param ctx the parse tree
	 */
	void enterReloadRadical(MCCommandParser.ReloadRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#reloadRadical}.
	 * @param ctx the parse tree
	 */
	void exitReloadRadical(MCCommandParser.ReloadRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#returnRadical}.
	 * @param ctx the parse tree
	 */
	void enterReturnRadical(MCCommandParser.ReturnRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#returnRadical}.
	 * @param ctx the parse tree
	 */
	void exitReturnRadical(MCCommandParser.ReturnRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rideRadical}.
	 * @param ctx the parse tree
	 */
	void enterRideRadical(MCCommandParser.RideRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rideRadical}.
	 * @param ctx the parse tree
	 */
	void exitRideRadical(MCCommandParser.RideRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#rideModes}.
	 * @param ctx the parse tree
	 */
	void enterRideModes(MCCommandParser.RideModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#rideModes}.
	 * @param ctx the parse tree
	 */
	void exitRideModes(MCCommandParser.RideModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#sayRadical}.
	 * @param ctx the parse tree
	 */
	void enterSayRadical(MCCommandParser.SayRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#sayRadical}.
	 * @param ctx the parse tree
	 */
	void exitSayRadical(MCCommandParser.SayRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#sayMessage}.
	 * @param ctx the parse tree
	 */
	void enterSayMessage(MCCommandParser.SayMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#sayMessage}.
	 * @param ctx the parse tree
	 */
	void exitSayMessage(MCCommandParser.SayMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scheduleRadical}.
	 * @param ctx the parse tree
	 */
	void enterScheduleRadical(MCCommandParser.ScheduleRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scheduleRadical}.
	 * @param ctx the parse tree
	 */
	void exitScheduleRadical(MCCommandParser.ScheduleRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#functionId}.
	 * @param ctx the parse tree
	 */
	void enterFunctionId(MCCommandParser.FunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#functionId}.
	 * @param ctx the parse tree
	 */
	void exitFunctionId(MCCommandParser.FunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scheduleAppendOrReplace}.
	 * @param ctx the parse tree
	 */
	void enterScheduleAppendOrReplace(MCCommandParser.ScheduleAppendOrReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scheduleAppendOrReplace}.
	 * @param ctx the parse tree
	 */
	void exitScheduleAppendOrReplace(MCCommandParser.ScheduleAppendOrReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scheduleModes}.
	 * @param ctx the parse tree
	 */
	void enterScheduleModes(MCCommandParser.ScheduleModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scheduleModes}.
	 * @param ctx the parse tree
	 */
	void exitScheduleModes(MCCommandParser.ScheduleModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardRadical}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardRadical(MCCommandParser.ScoreboardRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardRadical}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardRadical(MCCommandParser.ScoreboardRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardOptions}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardOptions(MCCommandParser.ScoreboardOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardOptions}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardOptions(MCCommandParser.ScoreboardOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardObjective}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardObjective(MCCommandParser.ScoreboardObjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardObjective}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardObjective(MCCommandParser.ScoreboardObjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardType}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardType(MCCommandParser.ScoreboardTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardType}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardType(MCCommandParser.ScoreboardTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardHeartsOrInteger}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardHeartsOrInteger(MCCommandParser.ScoreboardHeartsOrIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardHeartsOrInteger}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardHeartsOrInteger(MCCommandParser.ScoreboardHeartsOrIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardOperator}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardOperator(MCCommandParser.ScoreboardOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardOperator}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardOperator(MCCommandParser.ScoreboardOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardSlots}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardSlots(MCCommandParser.ScoreboardSlotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardSlots}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardSlots(MCCommandParser.ScoreboardSlotsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardObjectivesBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardObjectivesBehaviors(MCCommandParser.ScoreboardObjectivesBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardObjectivesBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardObjectivesBehaviors(MCCommandParser.ScoreboardObjectivesBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#scoreboardPlayersBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterScoreboardPlayersBehaviors(MCCommandParser.ScoreboardPlayersBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#scoreboardPlayersBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitScoreboardPlayersBehaviors(MCCommandParser.ScoreboardPlayersBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#seedRadical}.
	 * @param ctx the parse tree
	 */
	void enterSeedRadical(MCCommandParser.SeedRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#seedRadical}.
	 * @param ctx the parse tree
	 */
	void exitSeedRadical(MCCommandParser.SeedRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#setblockRadical}.
	 * @param ctx the parse tree
	 */
	void enterSetblockRadical(MCCommandParser.SetblockRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#setblockRadical}.
	 * @param ctx the parse tree
	 */
	void exitSetblockRadical(MCCommandParser.SetblockRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#setblockModes}.
	 * @param ctx the parse tree
	 */
	void enterSetblockModes(MCCommandParser.SetblockModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#setblockModes}.
	 * @param ctx the parse tree
	 */
	void exitSetblockModes(MCCommandParser.SetblockModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#setworldspawnRadical}.
	 * @param ctx the parse tree
	 */
	void enterSetworldspawnRadical(MCCommandParser.SetworldspawnRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#setworldspawnRadical}.
	 * @param ctx the parse tree
	 */
	void exitSetworldspawnRadical(MCCommandParser.SetworldspawnRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spawnpointRadical}.
	 * @param ctx the parse tree
	 */
	void enterSpawnpointRadical(MCCommandParser.SpawnpointRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spawnpointRadical}.
	 * @param ctx the parse tree
	 */
	void exitSpawnpointRadical(MCCommandParser.SpawnpointRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spectateRadical}.
	 * @param ctx the parse tree
	 */
	void enterSpectateRadical(MCCommandParser.SpectateRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spectateRadical}.
	 * @param ctx the parse tree
	 */
	void exitSpectateRadical(MCCommandParser.SpectateRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spreadplayersRadical}.
	 * @param ctx the parse tree
	 */
	void enterSpreadplayersRadical(MCCommandParser.SpreadplayersRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spreadplayersRadical}.
	 * @param ctx the parse tree
	 */
	void exitSpreadplayersRadical(MCCommandParser.SpreadplayersRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spreadplayersOptions}.
	 * @param ctx the parse tree
	 */
	void enterSpreadplayersOptions(MCCommandParser.SpreadplayersOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spreadplayersOptions}.
	 * @param ctx the parse tree
	 */
	void exitSpreadplayersOptions(MCCommandParser.SpreadplayersOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#spreadDistance}.
	 * @param ctx the parse tree
	 */
	void enterSpreadDistance(MCCommandParser.SpreadDistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#spreadDistance}.
	 * @param ctx the parse tree
	 */
	void exitSpreadDistance(MCCommandParser.SpreadDistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#maxRange}.
	 * @param ctx the parse tree
	 */
	void enterMaxRange(MCCommandParser.MaxRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#maxRange}.
	 * @param ctx the parse tree
	 */
	void exitMaxRange(MCCommandParser.MaxRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#respectTeams}.
	 * @param ctx the parse tree
	 */
	void enterRespectTeams(MCCommandParser.RespectTeamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#respectTeams}.
	 * @param ctx the parse tree
	 */
	void exitRespectTeams(MCCommandParser.RespectTeamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stopsoundRadical}.
	 * @param ctx the parse tree
	 */
	void enterStopsoundRadical(MCCommandParser.StopsoundRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stopsoundRadical}.
	 * @param ctx the parse tree
	 */
	void exitStopsoundRadical(MCCommandParser.StopsoundRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#soundId}.
	 * @param ctx the parse tree
	 */
	void enterSoundId(MCCommandParser.SoundIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#soundId}.
	 * @param ctx the parse tree
	 */
	void exitSoundId(MCCommandParser.SoundIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#stopsoundTypes}.
	 * @param ctx the parse tree
	 */
	void enterStopsoundTypes(MCCommandParser.StopsoundTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#stopsoundTypes}.
	 * @param ctx the parse tree
	 */
	void exitStopsoundTypes(MCCommandParser.StopsoundTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#summonRadical}.
	 * @param ctx the parse tree
	 */
	void enterSummonRadical(MCCommandParser.SummonRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#summonRadical}.
	 * @param ctx the parse tree
	 */
	void exitSummonRadical(MCCommandParser.SummonRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tagRadical}.
	 * @param ctx the parse tree
	 */
	void enterTagRadical(MCCommandParser.TagRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tagRadical}.
	 * @param ctx the parse tree
	 */
	void exitTagRadical(MCCommandParser.TagRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tagOptions}.
	 * @param ctx the parse tree
	 */
	void enterTagOptions(MCCommandParser.TagOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tagOptions}.
	 * @param ctx the parse tree
	 */
	void exitTagOptions(MCCommandParser.TagOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tagValue}.
	 * @param ctx the parse tree
	 */
	void enterTagValue(MCCommandParser.TagValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tagValue}.
	 * @param ctx the parse tree
	 */
	void exitTagValue(MCCommandParser.TagValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamRadical}.
	 * @param ctx the parse tree
	 */
	void enterTeamRadical(MCCommandParser.TeamRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamRadical}.
	 * @param ctx the parse tree
	 */
	void exitTeamRadical(MCCommandParser.TeamRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamId}.
	 * @param ctx the parse tree
	 */
	void enterTeamId(MCCommandParser.TeamIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamId}.
	 * @param ctx the parse tree
	 */
	void exitTeamId(MCCommandParser.TeamIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamName}.
	 * @param ctx the parse tree
	 */
	void enterTeamName(MCCommandParser.TeamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamName}.
	 * @param ctx the parse tree
	 */
	void exitTeamName(MCCommandParser.TeamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamCollisionRule}.
	 * @param ctx the parse tree
	 */
	void enterTeamCollisionRule(MCCommandParser.TeamCollisionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamCollisionRule}.
	 * @param ctx the parse tree
	 */
	void exitTeamCollisionRule(MCCommandParser.TeamCollisionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamColor}.
	 * @param ctx the parse tree
	 */
	void enterTeamColor(MCCommandParser.TeamColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamColor}.
	 * @param ctx the parse tree
	 */
	void exitTeamColor(MCCommandParser.TeamColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamVisibility}.
	 * @param ctx the parse tree
	 */
	void enterTeamVisibility(MCCommandParser.TeamVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamVisibility}.
	 * @param ctx the parse tree
	 */
	void exitTeamVisibility(MCCommandParser.TeamVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamOptions}.
	 * @param ctx the parse tree
	 */
	void enterTeamOptions(MCCommandParser.TeamOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamOptions}.
	 * @param ctx the parse tree
	 */
	void exitTeamOptions(MCCommandParser.TeamOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamAttributes}.
	 * @param ctx the parse tree
	 */
	void enterTeamAttributes(MCCommandParser.TeamAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamAttributes}.
	 * @param ctx the parse tree
	 */
	void exitTeamAttributes(MCCommandParser.TeamAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teammsgRadical}.
	 * @param ctx the parse tree
	 */
	void enterTeammsgRadical(MCCommandParser.TeammsgRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teammsgRadical}.
	 * @param ctx the parse tree
	 */
	void exitTeammsgRadical(MCCommandParser.TeammsgRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teamMessage}.
	 * @param ctx the parse tree
	 */
	void enterTeamMessage(MCCommandParser.TeamMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teamMessage}.
	 * @param ctx the parse tree
	 */
	void exitTeamMessage(MCCommandParser.TeamMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teleportRadical}.
	 * @param ctx the parse tree
	 */
	void enterTeleportRadical(MCCommandParser.TeleportRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teleportRadical}.
	 * @param ctx the parse tree
	 */
	void exitTeleportRadical(MCCommandParser.TeleportRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teleportEyesOrFeet}.
	 * @param ctx the parse tree
	 */
	void enterTeleportEyesOrFeet(MCCommandParser.TeleportEyesOrFeetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teleportEyesOrFeet}.
	 * @param ctx the parse tree
	 */
	void exitTeleportEyesOrFeet(MCCommandParser.TeleportEyesOrFeetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#teleportOptions}.
	 * @param ctx the parse tree
	 */
	void enterTeleportOptions(MCCommandParser.TeleportOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#teleportOptions}.
	 * @param ctx the parse tree
	 */
	void exitTeleportOptions(MCCommandParser.TeleportOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tellRadical}.
	 * @param ctx the parse tree
	 */
	void enterTellRadical(MCCommandParser.TellRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tellRadical}.
	 * @param ctx the parse tree
	 */
	void exitTellRadical(MCCommandParser.TellRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tellMessage}.
	 * @param ctx the parse tree
	 */
	void enterTellMessage(MCCommandParser.TellMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tellMessage}.
	 * @param ctx the parse tree
	 */
	void exitTellMessage(MCCommandParser.TellMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tellrawRadical}.
	 * @param ctx the parse tree
	 */
	void enterTellrawRadical(MCCommandParser.TellrawRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tellrawRadical}.
	 * @param ctx the parse tree
	 */
	void exitTellrawRadical(MCCommandParser.TellrawRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#timeRadical}.
	 * @param ctx the parse tree
	 */
	void enterTimeRadical(MCCommandParser.TimeRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#timeRadical}.
	 * @param ctx the parse tree
	 */
	void exitTimeRadical(MCCommandParser.TimeRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#timeDataTypes}.
	 * @param ctx the parse tree
	 */
	void enterTimeDataTypes(MCCommandParser.TimeDataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#timeDataTypes}.
	 * @param ctx the parse tree
	 */
	void exitTimeDataTypes(MCCommandParser.TimeDataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#timeTimePoints}.
	 * @param ctx the parse tree
	 */
	void enterTimeTimePoints(MCCommandParser.TimeTimePointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#timeTimePoints}.
	 * @param ctx the parse tree
	 */
	void exitTimeTimePoints(MCCommandParser.TimeTimePointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#timeOptions}.
	 * @param ctx the parse tree
	 */
	void enterTimeOptions(MCCommandParser.TimeOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#timeOptions}.
	 * @param ctx the parse tree
	 */
	void exitTimeOptions(MCCommandParser.TimeOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#titleRadical}.
	 * @param ctx the parse tree
	 */
	void enterTitleRadical(MCCommandParser.TitleRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#titleRadical}.
	 * @param ctx the parse tree
	 */
	void exitTitleRadical(MCCommandParser.TitleRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#titleBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterTitleBehaviors(MCCommandParser.TitleBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#titleBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitTitleBehaviors(MCCommandParser.TitleBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#faedIn}.
	 * @param ctx the parse tree
	 */
	void enterFaedIn(MCCommandParser.FaedInContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#faedIn}.
	 * @param ctx the parse tree
	 */
	void exitFaedIn(MCCommandParser.FaedInContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tmRadical}.
	 * @param ctx the parse tree
	 */
	void enterTmRadical(MCCommandParser.TmRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tmRadical}.
	 * @param ctx the parse tree
	 */
	void exitTmRadical(MCCommandParser.TmRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tmMessage}.
	 * @param ctx the parse tree
	 */
	void enterTmMessage(MCCommandParser.TmMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tmMessage}.
	 * @param ctx the parse tree
	 */
	void exitTmMessage(MCCommandParser.TmMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#tpRadical}.
	 * @param ctx the parse tree
	 */
	void enterTpRadical(MCCommandParser.TpRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#tpRadical}.
	 * @param ctx the parse tree
	 */
	void exitTpRadical(MCCommandParser.TpRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#triggerRadical}.
	 * @param ctx the parse tree
	 */
	void enterTriggerRadical(MCCommandParser.TriggerRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#triggerRadical}.
	 * @param ctx the parse tree
	 */
	void exitTriggerRadical(MCCommandParser.TriggerRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#triggerObjective}.
	 * @param ctx the parse tree
	 */
	void enterTriggerObjective(MCCommandParser.TriggerObjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#triggerObjective}.
	 * @param ctx the parse tree
	 */
	void exitTriggerObjective(MCCommandParser.TriggerObjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#triggerBehaviors}.
	 * @param ctx the parse tree
	 */
	void enterTriggerBehaviors(MCCommandParser.TriggerBehaviorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#triggerBehaviors}.
	 * @param ctx the parse tree
	 */
	void exitTriggerBehaviors(MCCommandParser.TriggerBehaviorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#weatherRadical}.
	 * @param ctx the parse tree
	 */
	void enterWeatherRadical(MCCommandParser.WeatherRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#weatherRadical}.
	 * @param ctx the parse tree
	 */
	void exitWeatherRadical(MCCommandParser.WeatherRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#weatherMembers}.
	 * @param ctx the parse tree
	 */
	void enterWeatherMembers(MCCommandParser.WeatherMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#weatherMembers}.
	 * @param ctx the parse tree
	 */
	void exitWeatherMembers(MCCommandParser.WeatherMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#worldborderRadical}.
	 * @param ctx the parse tree
	 */
	void enterWorldborderRadical(MCCommandParser.WorldborderRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#worldborderRadical}.
	 * @param ctx the parse tree
	 */
	void exitWorldborderRadical(MCCommandParser.WorldborderRadicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#worldborderOptions}.
	 * @param ctx the parse tree
	 */
	void enterWorldborderOptions(MCCommandParser.WorldborderOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#worldborderOptions}.
	 * @param ctx the parse tree
	 */
	void exitWorldborderOptions(MCCommandParser.WorldborderOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#worldborderWarningTypes}.
	 * @param ctx the parse tree
	 */
	void enterWorldborderWarningTypes(MCCommandParser.WorldborderWarningTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#worldborderWarningTypes}.
	 * @param ctx the parse tree
	 */
	void exitWorldborderWarningTypes(MCCommandParser.WorldborderWarningTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#worldborderModes}.
	 * @param ctx the parse tree
	 */
	void enterWorldborderModes(MCCommandParser.WorldborderModesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#worldborderModes}.
	 * @param ctx the parse tree
	 */
	void exitWorldborderModes(MCCommandParser.WorldborderModesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCCommandParser#xpRadical}.
	 * @param ctx the parse tree
	 */
	void enterXpRadical(MCCommandParser.XpRadicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCCommandParser#xpRadical}.
	 * @param ctx the parse tree
	 */
	void exitXpRadical(MCCommandParser.XpRadicalContext ctx);
}