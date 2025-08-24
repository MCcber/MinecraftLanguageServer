grammar selector;
options {
    language = CSharp;
}

Misc:[a-z]+;
Integer:'-'?[0-9]+;
int:Integer;
intInterval:(Integer'..')|('..'Integer)|(Integer'..'Integer);
IntInterval:(Integer'..')|('..'Integer)|(Integer'..'Integer);
Number:'-'?([0-9]+('.'[0-9]+)?)|([0-9]+?('.'[0-9]+));
number:Number;
positiveNumber:(' '*? ('dx='|'dy='|'dz=') ' '*?);
Double:'-'?([0-9]+('.'[0-9]+)?)|([0-9]+?('.'[0-9]+));
double:Double;
PositiveDouble:([0-9]+('.'[0-9]+)?)|([0-9]+?('.'[0-9]+));
positiveDouble:PositiveDouble;
doubleInterval:(Double'..')|('..'Double)|(Double'..'Double)|Double;
positiveDoubleInterval:(PositiveDouble'..')|('..'PositiveDouble)|(PositiveDouble'..'PositiveDouble)|PositiveDouble;
TypeValue:'!'?'#'?'minecraft:'?[a-z_]+;
Path:~[ `~!@#$%^&*()=+\\|;'",<>?]+;
gamemodeValues:('survival'|'creative'|'adventure'|'spectator');
EntityId:'minecraft:'?[a-z_]+;
entityId:EntityId;
Bool: '1b' | '0b' | 'true' | 'false';
bool:Bool;
StringValue:('"'.*?'"')|('\''.*?'\'');
MarkValue:'!'?[\-_+.a-zA-Z0-9]+?;
selectorTagValue:MarkValue;
selectorTeamValue:MarkValue;
nameValue:'!'?StringValue;
FileReferrerValue:'!'?NameSpace?[/a-z0-9\-_]+([/a-z0-9\-_]+)*?;
predicateValue:FileReferrerValue;
OpenSquareBrackets:'[';
CloseSquareBrackets:']';
OpenCurlyBrace:'{';
CloseCurlyBrace:'}';
Comma:',';
Equal:'=';
NumberKey:'x='|'y='|'z=';
PositiveNumberKey:'dx='|'dy='|'dz=';
PositiveDoubleIntervalKey: 'distance=';
DoubleIntervalKey:'x_rotation='|'y_rotation=';
IntIntervalKey:'level=';
IntKey:'limit=';
JsonKey:'nbt=';
TagKey:'tag=';
TeamKey:'team=';
AdvancementPath:[/a-z0-9\-_]+([/a-z0-9\-_]+)*?;
NameSpace:[a-z_]+?':';
nameSpace:NameSpace?;
TargetObjective:[$a-z_]+;
targetObjective:TargetObjective;
sortValues:('arbitrary'|'furthest'|'nearest'|'random')|Misc;

jsonValue: Jobject;
Jkey:('"'[a-zA-Z_]+'"')|('"'?[a-zA-Z_]+'"'?);
Jobject: OpenCurlyBrace (Jpair ( Comma Jpair?)*?)? CloseCurlyBrace;
Jpair: Jkey ':' Jvalue?;
Jarray: OpenSquareBrackets (Jvalue (Comma Jvalue)*)? CloseSquareBrackets;
Jvalue: StringValue | Number | Jobject | Jarray | ('true'|'false'|'1b'|'0b');

AdvancementParameter:NameSpace? AdvancementPath Equal Bool;
advancementValue: OpenCurlyBrace AdvancementParameter(Comma AdvancementParameter?)* CloseCurlyBrace;

scoreParameter:targetObjective Equal Integer|IntInterval;
scoresValue:OpenCurlyBrace scoreParameter(Comma scoreParameter?)* CloseCurlyBrace;

selectorParameters:parameter(Comma parameter?)*?;

parameter:(NumberKey number)
|(PositiveNumberKey positiveNumber)
|(DoubleIntervalKey doubleInterval)
|(PositiveDoubleIntervalKey positiveDoubleInterval)
|(IntIntervalKey intInterval)
|('gamemode' gamemodeValues)
|('advancements=' advancementValue)
|('scores=' scoresValue)
|(IntKey int)
|(TagKey selectorTagValue)
|(TeamKey selectorTeamValue)
|('name=' nameValue)
|('type=' entityId)
|('predicate=' predicateValue)
|(JsonKey jsonValue)
|('sort=' sortValues)
;