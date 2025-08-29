grammar mcdoc;
options {
	language = CSharp;
}

//共用词法规则(PS:词法规则不支持嵌套，请勿在词法规则中编写子词法规则，这样做大概率会导致分析错误)
Any: [.*];
StringValue: '"' [a-z_]+ '"';
DocFilePath:[a-z_]+;
FieldValue: [a-zA-Z_]+;
QuestionMark: '?';
ColonMark: ':';
Integer: [0-9]+;
VersionString: '1.' Integer '.' Integer;
DispatcherKeyString: '"' [a-z_:]+ '"';
DispatcherValue: [a-z_:]+;
Number: '-'? ([0-9]+ ('.' [0-9]+)?) | (([0-9]+)? ('.' [0-9]+));
NumberRange: (('..' ('<'|'>')? Number) | (Number ('<'|'>')? '..') | (Number ('<'|'>')? '..' ('<'|'>')? Number));
Comma:',';

arrayElementCount:'# 'Integer;
arrayValueRange:'#'NumberRange;

BlankString:(' ')+;

summary:'//'Any;

fieldValue: FieldValue;

tupleType:'('(dataType|attributes)'|'((dataType|attributes)'|')+')';

unknownKey:FieldValue;
unknownValue:FieldValue;
unknownResource:'#['unknownKey'='unknownValue']' 'string';

primitiveArrayType:
    ('bool'
	| 'short'
	| 'int'
	| 'float'
	| 'double'
	| 'long') arrayValueRange?'[]' arrayElementCount?;

dataType:primitiveArrayType|tupleType|unknownResource|'string';

canonical: '#[canonical]' dataType;

color: '#[color=' StringValue ']' dataType;

commandSlashOptions: 'slash=' StringValue;
commandMacroOptions: 'macro=' StringValue;
commandEmptyOptions: 'empty=' StringValue;
commandMaxLength: 'max_length=' Integer;
commandParameters:
	commandSlashOptions
	| commandMacroOptions
	| commandEmptyOptions
	| commandMaxLength;
command:'#[command(' (commandParameters (',' commandParameters*)?) ')' 'string';

deprecated: '#[deprecated=' VersionString ']';

dispatcher_key:'#[dispatcher_key=' DispatcherKeyString ']' 'string';

divisible_by: '#[divisible_by=' Integer ']' 'int';

entityAmount: 'amount=' ('multiple' | 'single');
entityType: 'type=' ('entities' | 'players');
entityParameters: entityAmount | entityType;
entity:
	'#[entity(' (entityParameters (',' entityParameters*)?) ')' 'string';

gameRuleParameter: 'type=' ('"boolean"' | '"int"');
game_rule: '#[game_rule(' gameRuleParameter ')]';

idRegistry: 'registry=' StringValue;
idTags: 'tags=' ('allowed' | 'implicit' | 'required');
idParameters: idRegistry | idTags;
id: '#[id(' (idParameters (',' idParameters*)?) ')] string';

match_regex: '#[match_regex="' Any '"]' 'string';

nbt: '#[nbt=ItemStack]' 'string';

nbt_path: '#[nbt_path]' 'string';

objective: '#[objective]' 'string';

regex_pattern: '#[regex_pattern]' 'string';

score_holder: '#[score_holder]' 'string';

since: '#[since="' VersionString '"]';

until: '#[until="' VersionString '"]';

tag: '#[tag]' 'string';

team: '#[team]' 'string';

text_component: '#[text_component]' 'string';

uuid:'#[uuid]';

usefilePath:('::'DocFilePath)|('super::');
useSentence:BlankString? 'use' usefilePath (usefilePath+)?;

attributes:
	fieldValue
	| canonical
	| color
	| command
	| deprecated
	| dispatcher_key
	| divisible_by
	| entity
	| id
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

dispatchSentence: 'dispatch' DispatcherValue (('to' FieldValue)|());

fields: fieldValue QuestionMark? ColonMark dataType;

structReference:'...'FieldValue;

structName:FieldValue;
structOpenBracket:'{';
structCloseBracket:'}';

superInvoke:'...super::'FieldValue;

structContent:summary+? (superInvoke+?|structReference+?) structReference+?
summary+?
attributes? fields (attributes? fields)*?;

structSentence:BlankString? 'struct' structName BlankString? structOpenBracket structContent structCloseBracket;