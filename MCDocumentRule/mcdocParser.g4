parser grammar mcdocParser;
options {
    language = CSharp;
    tokenVocab = mcdocLexer;
}

// import mcdocLexer;

logicalOR:LogicalOR;
path:Path;
resourceLocation: ResourceLocation;
at:At;
as:As;
dot:Dot;
baseDataType:StringKeyType|BooleanKeyType|ByteKeyType|ShortKeyType|IntKeyType|FloatKeyType|DoubleKeyType|LongKeyType;
keywordType:(Any|BoolValue);
questionMark: QuestionMark;
typeKey:TypeKey;
structKeyType:StructKeyType;
inject:Inject;
enum:Enum;
use:Use;
dispatch:Dispatch;
doubleDot:DoubleDot;

integer:Integer;
float:Float;

integerRange:IntegerRange;
// floatRange:(DoubleDot float) | (float DoubleDot) | (float DoubleDot float) | float;

identifier:Identifier;

commentary:Commentary;
docCommentary:DocCommentary;
typedNumber:(integer IntTypedUnit?)|(float FloatTypedUnit?);

stringType:StringKeyType (at IntegerRange)?;

literalType:BoolValue|TypedNumberLexer|String|Identifier;

numericType:baseDataType(at (integerRange|integer))?;

primitiveArrayType:(ByteKeyType|IntKeyType|LongKeyType) (at WS* (integerRange|integer))?SquareBrackets WS* (at WS* (integerRange|integer))?;

listType:LeftSquareBracket typeSentence RightSquareBracket (at (integerRange|integer))?;

tupleType:(LeftSquareBracket typeSentence Comma RightSquareBracket)
|(LeftSquareBracket typeSentence(Comma typeSentence)+Comma?RightSquareBracket);

enumMemberType:StringKeyType|ByteKeyType|ShortKeyType|IntKeyType|LongKeyType|FloatKeyType|DoubleKeyType;
enumValue:typedNumber|string;
enumField:prelim* attribute* identifier Equal enumValue;
enumBlock:CurlyBrackets|(LeftCurlyBracket enumField(Comma enumField)*Comma?RightCurlyBracket);
enumType:prelim? enum LeftRoundBracket enumMemberType RightRoundBracket identifier? enumBlock;

prelim:(docCommentary|commentary) attribute?;

referenceType:Path;

dispatcherType:resourceLocation indexBodyWithDynamic;

unionType: RoundBrackets
         | (LeftRoundBracket typeSentence (logicalOR typeSentence)* logicalOR? RightRoundBracket)
         ;

staticIndexKey:Fallback | None | Unknown| Identifier | String | ResourceLocation;

accessor: accessorKey accessorKey*;
accessorKey: Parent | Key | Identifier | String;
dynamicIndex : LeftSquareBracket accessor RightSquareBracket;

indexWithOutDynamic:staticIndexKey;
indexWithDynamic:staticIndexKey|dynamicIndex;

indexBodyWithOutDynamic:LeftSquareBracket indexWithOutDynamic (Comma indexWithOutDynamic)* Comma? RightSquareBracket;
indexBodyWithDynamic:LeftSquareBracket indexWithDynamic (Comma indexWithDynamic)* Comma? RightSquareBracket;

indexingOnAType:indexBodyWithDynamic;

typeArgBlock:AngleBrackets | (LeftAngleBracket typeSentence (Comma typeSentence)* Comma? RightAngleBracket);

unAttributedType:(keywordType 
|stringType 
|literalType 
|numericType 
|primitiveArrayType 
|listType 
|tupleType 
|enumType
|struct
|referenceType 
|dispatcherType 
|unionType
|indexingOnAType) Comma?
;

typeSentence:attribute* unAttributedType (indexBodyWithDynamic|typeArgBlock)*;

attributeSet:commentary* attribute* commentary* identifier* commentary*;

arrayLength:at PositiveInteger;

string:String;
positionalValues:value(Comma value)*;

namedValue:((identifier|string)Equal value)
|((identifier|string) treeValue);

namedValues:namedValue (Comma namedValue)*;

treeBody:(positionalValues Comma?)
|namedValues Comma?
|positionalValues Comma namedValues Comma?;

treeValue:(LeftRoundBracket treeBody? RightRoundBracket)
|(LeftSquareBracket treeBody? RightSquareBracket)
|(LeftCurlyBracket treeBody? RightCurlyBracket);

value:typeSentence|treeValue;

attribute:(Sharp LeftSquareBracket identifier RightSquareBracket)
|(Sharp LeftSquareBracket identifier Equal value RightSquareBracket)
|(Sharp LeftSquareBracket identifier treeValue RightSquareBracket);

dispatchStatement:prelim? attribute* dispatch resourceLocation indexBodyWithOutDynamic typeParamBlock? To typeSentence;

structInjection:structKeyType path structBlock;
enumInjection:Enum LeftRoundBracket enumType RightRoundBracket path enumBlock;
injection:inject (enumInjection | structInjection);

useStatement:use path (as identifier)?;

typeParam:Identifier;

typeParamBlock:AngleBrackets
|(LeftAngleBracket typeParam (Comma typeParam)* Comma? RightAngleBracket);

typeAlias:prelim* typeKey identifier typeParamBlock? Equal typeSentence;

structKey:String|Identifier|(LeftSquareBracket typeSentence RightSquareBracket);
structField:(prelim* attribute* structKey questionMark? ColonMark typeSentence)
|(attribute* TripleDot?typeSentence);

structBlock:CurlyBrackets
|(LeftCurlyBracket structField(Comma structField)* Comma? RightCurlyBracket);

struct:prelim* structKeyType identifier? structBlock;

file:(struct|enumType|typeAlias|useStatement|injection|dispatchStatement)*;