grammar mcdocParser;
options {
    language = Java;
}

import mcdocLexer;

logicalOR:LogicalOR;
path:Path;
resourceLocation: ResourceLocation;
at:'@';
dot:'.';
baseDataType:'string'|'boolean'|'byte'|'short'|'int'|'float'|'double'|'long';
keywordType:(Any|BoolValue);
questionMark: '?';
structKeyType:'struct';
inject:'inject';
enum:'enum';
use:'use';
dispatch:'dispatch';
typeKeyType:'type';
doubleDot:'..';

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

numericType:baseDataType(at integerRange)?;

primitiveArrayType:(('byte'|'int'|'long') (at WS* integerRange)?SquareBrackets WS* (at WS* (integerRange|integer))?);

listType:LeftSquareBracket type RightSquareBracket (at integerRange)?;

tupleType:(LeftSquareBracket type Comma RightSquareBracket)
|(LeftSquareBracket type(Comma type)+Comma?RightSquareBracket);

enumMemberType:'byte'|'short'|'int'|'long'|'string'|'float'|'double';
enumValue:typedNumber|string;
enumField:prelim? attribute* identifier Equal enumValue;
enumBlock:CurlyBrackets|(LeftCurlyBracket enumField(Comma enumField)*Comma?RightCurlyBracket);
enumType:prelim? enum LeftRoundBracket enumMemberType RightRoundBracket identifier?enumBlock;

prelim:(docCommentary|commentary) attribute?;

referenceType:Path;

dispatcherType:resourceLocation indexBodyWithDynamic;

unionType: RoundBrackets
         | (LeftRoundBracket type (logicalOR type)* logicalOR? RightRoundBracket)
         ;

staticIndexKey:'%fallback' | '%none' | '%unknown'| Identifier | String | ResourceLocation;

accessor: accessorKey accessorKey*;
accessorKey: '%parent' | '%key' | Identifier | String;
dynamicIndex : LeftSquareBracket accessor RightSquareBracket;

indexWithOutDynamic:staticIndexKey;
indexWithDynamic:staticIndexKey|dynamicIndex;

indexBodyWithOutDynamic:LeftSquareBracket indexWithOutDynamic (Comma indexWithOutDynamic)* Comma? RightSquareBracket;
indexBodyWithDynamic:LeftSquareBracket indexWithDynamic (Comma indexWithDynamic)* Comma? RightSquareBracket;

indexingOnAType:indexBodyWithDynamic;

typeArgBlock:AngleBrackets | (LeftAngleBracket type (Comma type)* Comma? RightAngleBracket);

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

type:attribute* unAttributedType (indexBodyWithDynamic|typeArgBlock)*;

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

value:type|treeValue;

attribute:(Sharp LeftSquareBracket identifier RightSquareBracket)
|(Sharp LeftSquareBracket identifier Equal value RightSquareBracket)
|(Sharp LeftSquareBracket identifier treeValue RightSquareBracket);

dispatchStatement:prelim? dispatch resourceLocation indexBodyWithOutDynamic typeParamBlock? 'to' type;

structInjection:structKeyType path structBlock;
enumInjection:EnumKeyType LeftRoundBracket enumType RightRoundBracket path enumBlock;
injection:inject (enumInjection | structInjection);

useStatement:use path (As identifier)?;

typeParam:Identifier;

typeParamBlock:AngleBrackets
|(LeftAngleBracket typeParam (Comma typeParam)* Comma? RightAngleBracket);

typeAlias:prelim? typeKeyType identifier typeParamBlock? Equal type;

structKey:String|Identifier|(LeftSquareBracket type RightSquareBracket);
structField:(prelim* attribute* structKey questionMark? ColonMark type)
|(attribute? TripleDot?type);

structBlock:CurlyBrackets
|(LeftCurlyBracket structField(Comma structField)* Comma? RightCurlyBracket);

struct:prelim? structKeyType identifier? structBlock;

file:(struct|enumType|typeAlias|useStatement|injection|dispatchStatement)*;