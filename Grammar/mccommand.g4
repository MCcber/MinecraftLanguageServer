grammar mccommand;
options {
    language = CSharp;
}

//共用词法规则(PS:词法规则不支持嵌套，请勿在词法规则中编写子词法规则，这样做大概率会导致分析错误)
// SpaceSkip: [ \t\r\n]+ -> skip;
// BackSlash:'\\' -> skip;
Any:[.*];
DimensionId:([a-z]+':')?[a-z_]+;
dimensionId:DimensionId;
MobAttribute:'minecraft:'?'generic.'[a-z_]+;
mobAttribute:MobAttribute;
Integer:'-'?[0-9]+;
int:Integer;
intInterval:(Integer'..')|('..'Integer)|(Integer'..'Integer);
IntInterval:(Integer'..')|('..'Integer)|(Integer'..'Integer);
Number:'-'?([0-9]+('.'[0-9]+)?)|(([0-9]+)?('.'[0-9]+));
number:Number;
positiveNumber:PositiveNumber;
PositiveNumber:([0-9]+('.'[0-9]+)?)|([0-9]+?('.'[0-9]+));
Int:[0-9]+;
Double:'-'?([0-9]+('.'[0-9]+)?)|([0-9]+?('.'[0-9]+));
PositiveDouble:([0-9]+('.'[0-9]+)?)|([0-9]+?('.'[0-9]+));
DoubleInterval:(Double'..')|('..'Double)|(Double'..'Double);
PositiveDoubleInterval:(PositiveDouble'..')|('..'PositiveDouble)|(PositiveDouble'..'PositiveDouble);
GameTimeValue:([0-9]+('.'[0-9]+)?)[dst]?;
gameTimeValue:GameTimeValue;
IdString:'minecraft:'?[a-z_]+;
ScoreboardSlots:[a-z]+;
SoundId:[a-z:._]+;
EffectId:[a-z:_]+;
BiomeID:('#'[a-z\-_]+':')?[a-z_.\-]+([a-z_.\-]+)*?;
biomeId:BiomeID;
Bool:'true'|'false';
bool:Bool;
jsonValue: jobject | jarray;
jobject: '{'jpair(','jpair)*'}';
StringValue:('"'.*?'"')|('\''.*?'\'');
PlayerName:[a-zA-Z_0-9\-+.]+;
StringKey:[a-z]+|('"'[a-z]+'"');
stringValue:StringValue;
stringKey:StringKey;
jpair: stringKey':'jvalue;
jarray: '[' (jvalue (',' jvalue)*) ']';
jvalue: stringValue | number | jobject | jarray | bool;
jsonComponent:JsonValue;
Uuid:[0-9]+'-'[0-9]+'-'[0-9]+'-'[0-9]+'-'[0-9]+;
uuid:Uuid;
String:[0-9a-zA-Z]+|'"'.*?'"';
stringRule:String;
ScoreboardObjective:[a-zA-Z0-9\-_+.]+;
ScoreboardType:('minecraft.'[a-z_]+':minecraft.'('minecraft:'[a-z_]+)|([a-z_]+)|([a-z]+))
|([a-zA-Z]+'.'[a-z]+)
|([a-z]+'.'[a-z]+)
|([a-z]+)
|([a-zA-Z]+);

LowerString:[0-9a-z]+|'"'.*?'"';
FilePath:([0-9a-z_\-]+':')?[a-z0-9\-_]+('/'[a-z0-9\-_]+)*?;
filePath:FilePath;
//[a-zA-Z0-9\-+=_]+('['([0-9]+)?']')?
NbtPathParameter:[a-zA-Z0-9\-+=_]+('['([0-9]+)?']')?;
nbtPath:NbtPathParameter('.'NbtPathParameter)*?;
dataType:'byte'|'double'|'float'|'int'|'long'|'short';
BlockStateKey:[a-z_]+' '*?'=';
BlockStateValue:[a-z0-9_]+|Bool;
BlockState:BlockStateKey ' '*? BlockStateValue;
BlockId:[a-z_]+('['' '*? BlockState(' '*?Comma ' '*? BlockState)? ' '*?']')?;
itemId:IdString;
blockId:('minecraft:'BlockId)|IdString;
EntityId:'minecraft:'?[a-z_]+|[a-z]+;
entityId:EntityId;
blockNBT:JsonValue;
entityNBT:jsonValue;
targetObjective:IdString;
storageId:IdString;
storageIdString:IdString;
Coordinates:(('~'|'^')Number ' ')|('~ '|'^ ')|(Number ' ');
pos3D:Coordinates Coordinates Coordinates;
pos2D:Coordinates Coordinates;
gamemodeValues:'survival'|'creative'|'adventure'|'spectator';
GamemodeValues:'survival'|'creative'|'adventure'|'spectator';

MarkValue:'!'?[\-_+.a-zA-Z0-9]+?;
NameValue:'!'?[\-_+.a-zA-Z0-9]+?|'!'?'"'.*?'"';
FileReferrerValue:'!'?NameSpace?[/a-z0-9\-_]+([/a-z0-9\-_]+)*?;
PredicateValue:FileReferrerValue;
OpenSquareBrackets:'[';
CloseSquareBrackets:']';
OpenCurlyBrace:'{';
CloseCurlyBrace:'}';
Comma:',';
Equal:'=';
NumberKey: ' '*? ('x'|'y'|'z') ' '*?;
PositiveNumberKey:' '*? ('dx'|'dy'|'dz') ' '*?;
PositiveDoubleIntervalKey:' '*? 'distance' ' '*?;
DoubleIntervalKey: ' '*? ('x_rotation'|'y_rotation') ' '*?;
IntIntervalKey: ' '*? 'level' ' '*?;
IntKey:' '*? 'limit' ' '*?;
JsonKey:' '*? 'nbt' ' '*?;
TagKey:' '*?'tag'' '*?;
TeamKey:' '*?'team'' '*?;
AdvancementPath:[/a-z0-9\-_]+(' '*?[/a-z0-9\-_]+)*?;
NameSpace:[a-z_]+?':';
ScorePath:[$a-z_]+;
SortValue:' '*? ('arbitrary'|'furthest'|'nearest'|'random') ' '*?;

JsonValue: Jobject;
Jkey:('"'[a-zA-Z_]+'"')|('"'?[a-zA-Z_]+'"'?);
Jobject: ' '*? OpenCurlyBrace (' '*? Jpair ( ' '*? Comma ' '*? Jpair? ' '*?)*? ' '*?)? CloseCurlyBrace ' '*?;
Jpair: ' '*? Jkey ' '*? ':' ' '*? Jvalue? ' '*?;
Jarray: ' '*? OpenSquareBrackets ' '*? (' '*? Jvalue ' '*? (' '*? Comma ' '*? Jvalue ' '*?)*)? ' '*? CloseSquareBrackets ' '*?;
Jvalue: StringValue | Number | Jobject | Jarray | ('true'|'false'|'1b'|'0b');

AdvancementParameter:' '*? NameSpace? ' '*? AdvancementPath ' '*? Equal ' '*? Bool ' '*?;
AdvancementValue: ' '*? OpenCurlyBrace ' '*? AdvancementParameter(' '*? Comma ' '*? AdvancementParameter?)* ' '*? CloseCurlyBrace ' '*?;

ScoreParameter:ScorePath ' '*? Equal ' '*? Integer|IntInterval ' '*?;
ScoresValue:' '*? OpenCurlyBrace ' '*? ScoreParameter(' '*? Comma ' '*? ScoreParameter?)* ' '*? CloseCurlyBrace ' '*?;

SelectorParameters:OpenSquareBrackets (' '*? (Parameter' '*?(' '*? Comma Parameter?)*)? ' '*?)? CloseSquareBrackets;

Parameter:(NumberKey Equal ' '*? Number? ' '*?)
|(PositiveNumberKey Equal ' '*? PositiveNumber ' '*?)
|(DoubleIntervalKey Equal ' '*? (Double|DoubleInterval)? ' '*?)
|(PositiveDoubleIntervalKey Equal ' '*? (PositiveDouble|PositiveDoubleInterval)? ' '*?)
|(IntIntervalKey Equal ' '*? IntInterval? ' '*?)
|(' '*? 'gamemode' ' '*? Equal ' '*? GamemodeValues? ' '*?)
|(' '*? 'advancements' ' '*? Equal AdvancementValue?)
|(' '*? 'scores' ' '*? Equal ScoresValue?)
|(IntKey Equal ' '*? Integer? ' '*?)
|(TagKey Equal ' '*? MarkValue? ' '*?)
|(TeamKey Equal ' '*? MarkValue? ' '*?)
|(' '*? 'name' ' '*? Equal ' '*? NameValue? ' '*?)
|(' '*? 'type' ' '*? Equal ' '*? EntityId? ' '*?)
|(' '*? 'predicate' ' '*? Equal ' '*? PredicateValue? ' '*?)
|(JsonKey Equal ' '*? JsonValue? ' '*?)
|(' '*? 'sort' ' '*? Equal SortValue?)
|([a-zA-Z0-9-_+=]+)
;

//匹配选择器，让选择器分析器来解析它
singleSelector:PlayerName
        |('@a'SelectorParameters?)|('@a['' '*?']')|('@a[]')
        |('@e'SelectorParameters?)|('@e['' '*?']')|('@e[]')
        |('@p'SelectorParameters?)|('@p['' '*?']')|('@p[]')
        |('@r'SelectorParameters?)|('@r['' '*?']')|('@r[]')
        |('@s'SelectorParameters?)|('@s['' '*?']')|('@s[]');

selector:PlayerName
        |('@a'SelectorParameters?)|('@a['' '*?']')
        |('@e'SelectorParameters?)|('@e['' '*?']')
        |('@p'SelectorParameters?)|('@p['' '*?']')
        |('@r'SelectorParameters?)|('@r['' '*?']')
        |('@s'SelectorParameters?)|('@s['' '*?']');

optionalSelector:PlayerName
        |('@a'SelectorParameters?)|('@a['' '*?']')|('@a[]')
        |('@e'SelectorParameters?)|('@e['' '*?']')|('@e[]')
        |('@p'SelectorParameters?)|('@p['' '*?']')|('@p[]')
        |('@r'SelectorParameters?)|('@r['' '*?']')|('@r[]')
        |('@s'SelectorParameters?)|('@s['' '*?']')|('@s[]');

// 指令树并集
commands:advancementRadical
| attributeRadical
| bossbarRadical
| clearRadical
| cloneRadical
| damageRadical
| dataRadical
| datapackRadical
| debugRadical
| defaultgamemodeRadical
| difficultyRadical
| effectRadical
| enchantRadical
| executeRadical
| experienceRadical
| fillRadical
| fillbiomeRadical
| forceloadRadical
| functionRadical
| gamemodeRadical
| gameruleRadical
| giveRadical
| helpRadical
| itemRadical
| jfrRadical
| kickRadical
| killRadical
| listRadical
| locateRadical
| lootRadical
| meRadical
| msgRadical
| particleRadical
| placeRadical
| playsoundRadical
| publishRadical
| recipeRadical
| reloadRadical
| returnRadical
| rideRadical
| sayRadical
| scheduleRadical
| scoreboardRadical
| seedRadical
| setblockRadical
| setworldspawnRadical
| spawnpointRadical
| spectateRadical
| spreadplayersRadical
| stopsoundRadical
| summonRadical
| tagRadical
| teamRadical
| teammsgRadical
| teleportRadical
| tellRadical
| tellrawRadical
| timeRadical
| titleRadical
| tmRadical
| tpRadical
| triggerRadical
| weatherRadical
| worldborderRadical
| xpRadical
;

// 进度
advancementRadical: 'advancement' grantOrRevoke selector advancementModes;
grantOrRevoke: 'grant' | 'revoke';
advancementCriterion:IdString;
advancementValue:FilePath;
advancementModes:('everything'|('only' advancementValue advancementCriterion))|('from' advancementValue)|('through' advancementValue)|('until' advancementValue);

//属性
attributeRadical: 'attribute' selector mobAttribute attributeOptions;
attributeOptions: ('base' baseModifier number)|('get' number)|('modifier' modifierOptions);
baseModifier:'get'|'set';
get:'get';
modifierOptions:('add' uuid ' ' stringRule ' ' number modifierModes)|('remove' uuid)|('value' get uuid number);
modifierModes:'add'|'multiply'|'multiply_base';

//bossbar
bossbarRadical:'bossbar' bossbarOptions;
BossbarId:[a-zA-Z0-9_]+;
bossbarId:BossbarId;
bossbarIdString:BossbarId;
bossbarOptions:(('add' bossbarIdString jsonComponent)|('get' bossbarId bossbarGetTarget)|'list'|('remove' bossbarId)|('set' bossbarId bossbarAttributes));
bossbarStyle:IdString;
bossbarColor:IdString;
bossbarGetTarget:'max'|'players'|'value'|'visible';
bossbarAttributes:('color' bossbarColor)|('max' int)|('name' jsonComponent)|('players' selector)|('style' bossbarStyle)|('value' int)|('visible' bool);

//clear
clearRadical:'clear' optionalSelector itemId count;
count:Integer;

//clone
cloneRadical: 'clone' cloneSource cloneDestination cloneMode?;
cloneSource: ('from' fromDimension=dimensionId)? begin=pos3D end=pos3D;
cloneDestination: ('to' toDimension=dimensionId)? end=pos3D;
cloneMode: (('filtered' blockId) | ('masked' | 'replace')) cloneBehavior?;
cloneBehavior: 'force' | 'move' | 'normal';

//damage
damageRadical:'damage' singleSelector number ' ' damageType damageOptions;
damageType:IdString;
from:'from';
damageOptions:('at' pos3D)|('by' singleSelector from singleSelector);

//data
dataRadical:'data' dataOptions;

dataStringStart:Integer;
dataStringEnd:Integer;
entityNBTPath:NbtPathParameter('.'NbtPathParameter)*?;
blockNBTPath:NbtPathParameter('.'NbtPathParameter)*?;

dataOptions: ('get' dataGetTarget)|('merge' dataMergeTarget)|('modify' dataModifyTarget)|('remove' dataRemoveTarget);

dataGetTarget:('block' pos3D blockNBTPath number)|('entity' singleSelector entityNBTPath number)|('storage' storageIdString nbtPath number);

dataMergeTarget:('block' pos3D blockNBT)|('entity' singleSelector entityNBT)|('storage' storageId jsonComponent);

dataModifyStringTarget:('block' pos3D blockNBTPath dataStringStart dataStringEnd)|('entity' singleSelector entityNBTPath dataStringStart dataStringEnd)|('storage' storageId nbtPath dataStringStart dataStringEnd);

dataModifyFromTarget:('block' pos3D blockNBTPath)|('entity' singleSelector entityNBTPath)|('storage' storageId nbtPath);

dataModifyBehaviors:('from' dataModifyFromTarget)|('string' dataModifyStringTarget)|('value' jsonComponent);

dataModifyOptions:('append' dataModifyBehaviors)|('insert' int dataModifyBehaviors)|('merge' dataModifyBehaviors)|('prepend' dataModifyBehaviors)|('set' dataModifyBehaviors);

dataModifyTarget:('block' pos3D blockNBTPath dataModifyOptions)|('entity' singleSelector entityNBTPath dataModifyOptions)|('storage' storageId nbtPath dataModifyOptions);

dataRemoveTarget:('block' pos3D blockNBTPath)|('entity' singleSelector entityNBTPath)|('storage' storageIdString nbtPath);

//datapack
datapackRadical:'datapack' datapackOptions;
datapackState:'available'|'enable';
datapackId:String;
datapackBehaviors:('after' datapackId)|('before' datapackId)|'first'|'last';
datapackOptions:('disable' datapackId)|('enable' datapackId datapackBehaviors)|('list' datapackState);

//debug
debugRadical:'debug' debugOptions;
debugOptions:('function' datapackId)|'start'|'stop';

//defaultgamemode
defaultgamemodeRadical:'defaultgamemode' gamemodeValues;

//difficulty
difficultyRadical:'difficulty' difficultyValues;
difficultyValues:'easy'|'hard'|'normal'|'peaceful';

//effect
effectRadical:'effect' effectOption;
effectOption:('clear' optionalSelector effectID)|('give' selector effectID effectTime|'infinite' ' ' amplifier hideParticles);
effectID:EffectId;
//'infinite'|
effectTime:Integer;
seconds:Integer;
amplifier:Integer;
hideParticles:Bool;

//enchant
enchantRadical:'enchant' selector enchantID enchantLevel;
enchantLevel:Integer;
EnchantID:'minecraft:'?[a-z_]+;
enchantID:EnchantID;

//execute
executeRadical:'execute' executeOptions;
executeEyesOrFeet:'eyes'|'feet';
Axes:[xyz][xyz]?[xyz]?;
axes:Axes;
as:'as';
storage:'storage';
executeAllOrMasked:'all'|'masked';
executeMaxOrValue:'max'|'value';
executeJudgeDataOptions:
('block' pos3D nbtPath executeOptions)
|('entity' singleSelector nbtPath executeOptions)
|('storage' storageId ' ' nbtPath executeOptions);
executeJudgementOptions:
(('biome' pos3D biomeId executeOptions)
|('block' pos3D blockId executeOptions)
|('blocks' pos3D pos3D pos3D (executeAllOrMasked executeOptions))
|('data' executeJudgeDataOptions)
|('dimension' dimensionId executeOptions)
|('entity' selector executeOptions)
|('loaded' pos3D executeOptions)
|('predicate' predicateValue executeOptions)
|('score' singleSelector targetObjective executeOperations executeOptions));
predicateValue:FileReferrerValue;
executeOperations:(('<'|'<='|'='|'>=') singleSelector targetObjective)|('matches' int|intInterval);
executeOn:'attacker'|'controller'|'leasher'|'origin'|'owner'|'passengers'|'target'|'vehicle';
executeOver:'motion_blocking'|'motion_blocking_no_leaves'|'ocean_floor'|'world_surface';
executePositioned:('as' selector)|('over' executeOver);
executeStoreTarget:('block' pos3D nbtPath dataType number)
|('bossbar' bossbarId executeMaxOrValue)
|('entity' singleSelector nbtPath dataType number)
|('score' selector targetObjective)
|('storage' storageId ' ' nbtPath dataType number);
executeStore:('result'|'success') executeStoreTarget;
executeFacing:(pos3D executeOptions)|('entity' selector executeEyesOrFeet executeOptions);
executeOptions:('align' axes executeOptions)|('anchored' executeEyesOrFeet executeOptions)|(('as'|'at') selector executeOptions)|('facing' executeFacing executeOptions)|(('if'|'unless') executeJudgementOptions executeOptions)|('in' dimensionId executeOptions)|('on' executeOn executeOptions)|('positioned' (pos3D|executePositioned) executeOptions)|('rotated' as selector executeOptions)|('run' commands)|('store' executeStore executeOptions)|('summon' entityId executeOptions);

//experience
experienceRadical:'experience' experienceOptions;
query:'query';
experienceAmount:Integer;
expreienceType:'levels'|'points';
experienceOptions:(('add'|'set') selector experienceAmount ' ' expreienceType)|('query' singleSelector expreienceType);

//fill
fillRadical:'fill' pos3D pos3D blockId fillOptions;
fillOptions:('destroy'|'hollow'|'keep'|'outline')|('replace' blockId);

//fillBiome
fillbiomeRadical:'fillbiome' pos3D pos3D biomeId fillBiomeOptions;
fillBiomeOptions:'replace' biomeId;

//forceload
forceloadRadical:'forceload' forceloadOptions;
forceloadRemoveObjectives:(pos2D pos2D)|'all';
forceloadOptions:('add' pos2D pos2D)|('query' pos2D)|('remove' forceloadRemoveObjectives);

//function
functionRadical:'function' functionId;

// gamemode
gamemodeRadical: 'gamemode' gamemodeValues optionalSelector;

// gamerule
gameruleRadical: 'gamerule' gameruleName gameruleValue;
gameruleName: GameruleName;
GameruleName:[a-zA-Z_]+;
gameruleValue: Bool | Integer;

//give
giveRadical:'give' selector itemId int;

//help
helpRadical:'help' (commandList);
commandList:CommandList;
CommandList:[a-z]+;

//item
itemRadical:'item' ' ' itemOptions;
ItemSlot:'minecraft:'?[a-z_.]+;
itemSlot:ItemSlot;
itemModifierFile:FilePath;
itemOptions:('modify' itemModifyTarget)|('replace' itemReplaceTarget);
itemBehaviors:('from' itemModifyTarget)|('with' itemId int);
itemModifyTarget:('block' pos3D itemSlot itemModifierFile)|('entity' selector itemSlot itemModifierFile);
itemReplaceTarget:('block' pos3D itemSlot itemBehaviors)|('entity' selector itemSlot itemBehaviors);

//jfr
jfrRadical:'jfr' jfrStartOrStop;
jfrStartOrStop:'start'|'stop';

//kick
kickRadical:'kick' selector reason;
reason:Any+;

//kill
killRadical:'kill' selector;

//list
listRadical:'list' uuids;
uuids:'uuids';

//locate
locateRadical:'locate' locateOptions;
poiId:IdString;
structureId:IdString;
locateOptions:('biome' biomeId)|('poi' poiId)|('structure' structureId);

//loot
lootRadical:'loot' lootOptions;
lootFilePath:FilePath;
lootTool:'mainhand'|'offhand'|('minecraft:'?IdString);
block:'block';
lootOptions:('give' selector lootModes)|('insert' pos3D lootModes)|('replace' lootReplace)|('spawn' pos3D lootModes);
lootReplace:('block' pos3D itemSlot lootModes)|('entity' selector itemSlot lootModes);
lootModes:('fish' lootFilePath pos3D lootTool)|('kill' singleSelector)|('loot' lootFilePath)|('mine' pos3D lootTool);

//me
meRadical:'me' action;
action:Any;

//msg
msgRadical:'msg' selector message;
message:Any+;

//particle
particleRadical:'particle' particleId pos3D ' ' pos3D ' ' particleSpeedAndCount particleOptions optionalSelector;
rgb:PositiveNumber ' ';
size:PositiveNumber ' ';
particleSpeedAndCount:Number Int ' ';
Gametick:PositiveNumber([sdt])?;
gameTick:Gametick;
particleOptions:'force'|'normal';
absolutePos:Number ' ' Number ' ' Number;
particleId:IdString;

//place
placeRadical:'place' placeModes;
featureId:IdString;
jigsawTarget:IdString;
jigsawFilePath:FilePath;
templateFilePath:FilePath;
placeModes:('feature' featureId pos3D)|('jigsaw' jigsawFilePath jigsawTarget int ' ' pos3D)|('structure' structureId pos3D)|('template' templateFilePath pos3D placeRotationModes number ' ' int);
placeMirrorItems:'front_back'|'left_right'|'none';
placeRotationModes:('180'|'clockwise_90'|'counterclockwise_90'|'none') placeMirrorItems;

//playsound
playsoundRadical:'playsound' soundId soundTypes selector pos3D volume pitch minVolume;
volume:Number;
pitch:Number;
minVolume:Number;
soundTypes:'ambient'|'hostile'|'master'|'music'|'neutral'|'player'|'record'|'voice'|'weather';

//publish
publishRadical:'publish' bool gamemodeValues port;
port:Integer;

//recipe
recipeRadical:'recipe' recipeGiveOrTake selector recipeFilePath;
recipeFilePath:FilePath;
recipeGiveOrTake:'give'|'take';

//reload
reloadRadical:'reload';

//return
returnRadical:'return' int;

//ride
rideRadical:'ride' singleSelector rideModes;
rideModes:'dismount'|('mount' singleSelector);

//say
sayRadical:'say' message;

//schedule
scheduleRadical:'schedule' scheduleModes;
functionId:FilePath;
scheduleAppendOrReplace:'append'|'replace';
scheduleModes:('clear' functionId)|('function' functionId number scheduleAppendOrReplace);

//scoreboard
scoreboardRadical:'scoreboard' scoreboardOptions;
scoreboardOptions:('objectives' scoreboardObjectivesBehaviors)|('players' scoreboardPlayersBehaviors);
scoreboardObjective:ScoreboardObjective;
scoreboardType:ScoreboardType;
value:Integer;
scoreboardHeartsOrInteger:'hearts'|'integer';
scoreboardOperator:'%='|'*='|'+='|'-='|'/='|'<'|'='|'>'|'><';
scoreboardSlots:ScoreboardSlots;
displayname:'displayname';
rendertype:'rendertype';
scoreboardObjectivesBehaviors:('add' scoreboardObjective scoreboardType jsonComponent)|'list'|('modify' targetObjective (displayname jsonComponent)|(rendertype scoreboardHeartsOrInteger))|('remove' targetObjective)|('setdisplay' scoreboardSlots targetObjective);
scoreboardPlayersBehaviors:('add' selector targetObjective value)|('enable' selector targetObjective)|('get' singleSelector scoreboardObjective)|('list' singleSelector)|('operation' selector targetObjective scoreboardOperator selector targetObjective)|('remove' selector scoreboardObjective value)|('reset' selector targetObjective)|('set' selector targetObjective value);

//seed
seedRadical:'seed';

//setblock
setblockRadical:'setblock' pos3D blockId setblockModes;
setblockModes:'destroy'|'keep'|'replace';

//setworldspawn
setworldspawnRadical:'setworldspawn' pos3D number;

//spawnpoint
spawnpointRadical:'spawnpoint' selector pos3D number;

//spectate
spectateRadical:'spectate' singleSelector singleSelector;

//spreadplayers
spreadplayersRadical:'spreadplayers' pos2D spreadDistance ' ' maxRange spreadplayersOptions;
spreadplayersOptions:('true'|'false' selector)|('under' int bool selector);
spreadDistance:Number;
maxRange:Number;
respectTeams:Bool;
under:'under';

//stopsound
stopsoundRadical:'stopsound' selector stopsoundTypes soundId;
soundId:SoundId;
stopsoundTypes:'*'|'ambient'|'block'|'hostile'|'master'|'music'|'neutral'|'player'|'record'|'voice'|'weather';

//summon
summonRadical:'summon' entityId pos3D jsonComponent;

//tag
tagRadical:'tag' selector tagOptions;
tagOptions:('add'|'remove' tagValue)|'list';
tagValue:IdString;

//team
teamRadical:'team' teamOptions;
TeamName:[a-zA-Z_0-9\-+.]+;
teamId:TeamName;
teamName:TeamName;
teamCollisionRule:'always'|'never'|'pushOtherTeams'|'pushOwnTeam';
teamColor:IdString;
teamVisibility:'always'|'hideForOtherTeams'|'hideForOwnTeam'|'never';
teamOptions:('add' teamName jsonComponent)|('empty' teamId)|('join' teamId optionalSelector)|('leave' selector)|('list' teamId)|('modify' teamId teamAttributes)|('remove' teamId);
teamAttributes:('collisionRule' teamCollisionRule)|('color' teamColor)|('deathMessageVisibility' teamVisibility)|('displayName' jsonComponent)|('friendlyFire' bool)|('nametagVisibility' teamVisibility)|(('prefix'|'suffix') jsonComponent)|('seeFriendlyInvisibles' bool);

//teammsg
teammsgRadical:'teammsg' message;

//teleport
teleportRadical:'teleport' teleportOptions;
teleportEyesOrFeet:'eyes'|'feet';
facing:'facing';
entity:'entity';
teleportOptions:pos3D|(selector (singleSelector|(pos3D (facing ((entity singleSelector teleportEyesOrFeet)|pos3D))|pos2D)));

//tell
tellRadical:'tell' selector message;

//tellraw
tellrawRadical:'tellraw' selector jsonComponent;

//time
timeRadical:'time' timeOptions;
timeDataTypes:'day'|'daytime'|'gametime';
timeTimePoints:'day'|'midnight'|'night'|'noon';
timeOptions:('add' gameTimeValue)|('query' timeDataTypes)|('set' timeTimePoints|gameTimeValue);

//title
titleRadical:'title' selector titleBehaviors;
titleBehaviors:(('actionbar'|'subtitle'|'title') jsonComponent)|('clear'|'reset')|('times' fadeIn stay fadeOut);
fadeIn:Integer;
stay:Integer;
fadeOut:Integer;

//tm
tmRadical:'tm' message;

//tp
tpRadical:'tp' teleportOptions;

//trigger
triggerRadical:'trigger' triggerObjective triggerBehaviors value;
triggerObjective:IdString;
triggerBehaviors:'add'|'set';

//weather
weatherRadical:'weather' weatherMembers number;
weatherMembers:'clear'|'rain'|'thunder';

//worldborder
worldborderRadical:'worldborder' worldborderOptions;
worldborderOptions:('add' number int)|('center' pos2D)|('damage' worldborderModes number)|'get'|('set' number int)|('warning' worldborderWarningTypes int);
worldborderWarningTypes:'distance'|'time';
worldborderModes:'amount'|'buffer';

//xp
xpRadical:'xp' experienceOptions;