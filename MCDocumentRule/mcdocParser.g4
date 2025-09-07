grammar mcdocParser;
options {
    language = Java;
}

import mcdocLexer;

logicalOR:LogicalOR;

baseDataType:StringKeyType|BooleanKeyType|ByteKeyType|ShortKeyType|IntKeyType|FloatKeyType|DoubleKeyType|LongKeyType;
keywordType:'any'|booleanType;
booleanType:'true'|'false';
booleanKeyType:'boolean';
questionMark: '?';
integerRange:(DoubleDot? integer) | (integer DoubleDot integer?);
floatRange:(DoubleDot? float) | (float DoubleDot float?);

integer:Integer;

float:Float;

versionString:VersionString;
positiveInteger:PositiveInteger;
identifier:Identifier;

commentary:Commentary;
fieldValue: FieldValue;

stringType:'string' integerRange;
literalType:'false'|'true'|TypedNumber|String;
numericType:('byte'('@'integerRange)?)
            |('short'('@'integerRange)?)
            |('int'('@'integerRange)?)
            |('long'('@'integerRange)?)
            |('float'('@'integerRange)?)
            |('double'('@'integerRange)?);

listType:'['type']' ('@'integerRange)?;

tupleType:('['type',]')|('['type(','type)+','?']');

prelim:commentary;
enumType:'byte'|'short'|'int'|'long'|'string'|'float'|'double';
enumValue:TypedNumber|String;
enumField:prelim identifier '=' enumValue;
enumBlock:'{''}'|'{'enumField(','enumField)*','?'}';
enum:prelim 'enum' '('enumType')'identifier?enumBlock;

referenceType:Path;

dispatcherType:ResourceLocation indexBody;

unionType:('('')')|(type('|'type)*'|'?);

index:StaticIndexKey | DynamicIndex;
indexBody:'[' index ( index',')* ','? ']';
indexOnAType:indexBody;

typeArgBlock:'<''>' | type ( type'<,')* ','?'>';

unAttributedType:keywordType 
|stringType 
|literalType 
|numericType 
|primitiveArrayType 
|listType 
|tupleType 
|enum 
|structSentence
|referenceType 
|dispatcherType 
|unionType
|indexOnAType
;

type:documentAttribute unAttributedType (indexBody|typeArgBlock)*;

// unknownKey:FieldValue;
// unknownValue:FieldValue;
// unknownResource:'#['unknownKey'='unknownValue']';

documentAttributeSet:commentary* documentAttribute* commentary* fieldValue* commentary*;

arrayLength:'@ ' PositiveInteger;

primitiveArrayType:((('byte'|'short'|'int'|'float'|'double'| 'long') (At integerRange)?'[]'))
|(('['('byte'|'short'|'int'|'float'|'double'| 'long')']') (At integerRange)?);

dataType:primitiveArrayType|booleanKeyType|numericType|documentAttributeSet;

canonical: '#[canonical]' dataType;

color: '#[color=' String ']' dataType;

commandSlashOptions: 'slash=' String;
commandMacroOptions: 'macro=' String;
commandEmptyOptions: 'empty=' String;
commandMaxLength: 'max_length=' integer;
commandParameters:
    commandSlashOptions
    | commandMacroOptions
    | commandEmptyOptions
    | commandMaxLength;
command:'#[command(' (commandParameters (',' commandParameters*)?) ') string';

deprecated: '#[deprecated=' versionString ']';

dispatcher_key:'#[dispatcher_key=' DispatcherKeyString '] string';

divisible_by: '#[divisible_by=' integer ']' 'int';

entityAmount: 'amount=' ('multiple' | 'single');
entityType: 'type=' ('entities' | 'players');
entityParameters: entityAmount | entityType;
entity:'#[entity(' (entityParameters (',' entityParameters*)?) ') string';

gameRuleParameter: 'type=' ('"boolean"' | '"int"');
gameRule: '#[game_rule(' gameRuleParameter ')]';

idRegistry: 'registry=' String;
idTags: 'tags=' ('allowed' | 'implicit' | 'required');
idParameters: idRegistry | idTags;
id: '#[id(' (idParameters (',' idParameters*)?) ')] string';

match_regex: '#[match_regex="' RegexPattern? '"] string';

nbt: '#[nbt=ItemStack] string';

nbt_path: '#[nbt_path] string';

objective: '#[objective] string';

regex_pattern: '#[regex_pattern] string';

score_holder: '#[score_holder] string';

since: '#[since="' versionString '"]';

until: '#[until="' versionString '"]';

tag: '#[tag] string';

team: '#[team] string';

text_component: '#[text_component] string';

uuid:'#[uuid]';

usefilePath:Path;

useSentence:'use' usefilePath;

documentAttribute:
    // canonical
     color
    // | command
    | deprecated
    | dispatcher_key
    | divisible_by
    | entity
    | gameRule
    // | id
    // | match_regex
    | nbt
    | nbt_path
    | objective
    | regex_pattern
    | score_holder
    | since
    | tag
    | team
    | text_component
    | until
    | uuid;

field: fieldValue questionMark? ColonMark dataType;
fields: field (Comma commentary* field)* (Comma)?;

structReference:'...'FieldValue;
superInvoke:'...super::' FieldValue;

structContent: (commentary|fields|superInvoke|structReference|documentAttribute)*;

structName:FieldValue;

structSentence: 'struct' structName '{' structContent '}';

document:useSentence* commentary* structSentence;