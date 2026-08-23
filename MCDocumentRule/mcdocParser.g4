parser grammar mcdocParser;
options {
    language = CSharp;
    tokenVocab = mcdocLexer;
}

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
tripleDot:TripleDot;

integer:Int;
float:Float;

string:String;

integerRange
    : Int
    | Int DoubleDot Int
    | Int DoubleDot
    | DoubleDot Int
    ;
floatRange
    : (Int|Float)
    | (Int|Float) LeftAngleBracket? DoubleDot LeftAngleBracket? (Int|Float)
    | (Int|Float) LeftAngleBracket? DoubleDot
    | DoubleDot LeftAngleBracket? (Int|Float)
    ;

identifier: Identifier | IntTypedUnit | FloatTypedUnit
          | To | As | Use | Inject;

boolValue:BoolValue;
commentary:Commentary;
docCommentary:DocCommentary;
typedNumber:(integer IntTypedUnit?)|(float FloatTypedUnit?);

stringType:StringKeyType (at integerRange)?;

literalType:boolValue|typedNumber|string|identifier;

numericType:baseDataType(at (integerRange|floatRange))? Comma?;

primitiveArrayType:(ByteKeyType|IntKeyType|LongKeyType) (at WS* integerRange)?SquareBrackets WS* (at WS* integerRange)?;

listType:LeftSquareBracket typeSentence RightSquareBracket (at integerRange)?;

tupleType:(LeftSquareBracket typeSentence Comma RightSquareBracket)
|(LeftSquareBracket typeSentence(Comma typeSentence)+Comma?RightSquareBracket);

enumMemberType:StringKeyType|ByteKeyType|ShortKeyType|IntKeyType|LongKeyType|FloatKeyType|DoubleKeyType;
enumValue:typedNumber|string;
enumField:prelim identifier Equal enumValue;
enumBlock:CurlyBrackets
|(LeftCurlyBracket RightCurlyBracket)
|(LeftCurlyBracket enumField(Comma enumField)* Comma? RightCurlyBracket);
enumType:prelim enum LeftRoundBracket enumMemberType RightRoundBracket identifier? enumBlock;

prelim:docCommentary* attribute*;

referenceType:Path | ResourceLocation;

dispatcherType:resourceLocation indexBody;

unionType: RoundBrackets
         | (LeftRoundBracket typeSentence (logicalOR typeSentence)* logicalOR? RightRoundBracket)
         ;

staticIndexKey:RemainderFallback | RemainderNone | RemainderUnknown| Identifier | String | ResourceLocation;

accessor: accessorKey accessorKey*;
accessorKey: RemainderParent | RemainderKey | Identifier | String;
dynamicIndex : LeftSquareBracket accessor RightSquareBracket;

// indexWithOutDynamic:staticIndexKey;
index:staticIndexKey|dynamicIndex;

// indexBodyWithOutDynamic:LeftSquareBracket indexWithOutDynamic (Comma indexWithOutDynamic)* Comma? RightSquareBracket;
// indexBodyWithDynamic:LeftSquareBracket indexWithDynamic (Comma indexWithDynamic)* Comma? RightSquareBracket;
indexBody:LeftSquareBracket index (Comma index)* Comma? RightSquareBracket;

indexingOnAType:indexBody;

typeArgBlock:AngleBrackets
|(LeftAngleBracket RightAngleBracket)
|(LeftAngleBracket typeSentence (Comma typeSentence)* Comma? RightAngleBracket);

unAttributedType:dispatcherType
|struct
|keywordType 
|stringType 
|literalType 
|numericType 
|primitiveArrayType 
|listType 
|tupleType 
|enumType
|referenceType  
|unionType
|indexingOnAType
;

typeSentence:attribute* unAttributedType (indexBody|typeArgBlock)*;

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

value:treeValue|typeSentence;

attribute:(Sharp LeftSquareBracket identifier RightSquareBracket)
|(Sharp LeftSquareBracket identifier Equal value RightSquareBracket)
|(Sharp LeftSquareBracket identifier treeValue RightSquareBracket);

dispatchStatement:prelim dispatch resourceLocation indexBody typeParamBlock? To typeSentence;

structInjection:structKeyType path structBlock;
enumInjection:Enum LeftRoundBracket enumType RightRoundBracket path enumBlock;
injection:inject (enumInjection | structInjection);

useStatement:use path (as identifier)?;

typeParam:Identifier;

typeParamBlock:AngleBrackets
|(LeftAngleBracket typeParam (Comma typeParam)* Comma? RightAngleBracket);

typeAlias:prelim typeKey identifier typeParamBlock? Equal typeSentence;

structKey:String|identifier|(LeftSquareBracket typeSentence RightSquareBracket);
structField:(prelim structKey questionMark? ColonMark typeSentence)
|(prelim tripleDot? typeSentence);

structBlock:CurlyBrackets
|(LeftCurlyBracket RightCurlyBracket)
|(LeftCurlyBracket structField(Comma structField)* Comma? RightCurlyBracket);

struct:prelim structKeyType identifier? structBlock;

file:(struct|enumType|typeAlias|useStatement|injection|dispatchStatement)* EOF;