parser grammar MCCommandParser;
options {
  language = Java;
  tokenVocab = MCCommandLexer;
}

atChar:AtChar;
atLetter:AtLetter;
exclamationMark:ExclamationMark;
leftSquareBracket:LeftSquareBracket;
rightSquareBracket:RightSquareBracket;
leftCurlyBracket:LeftCurlyBracket;
rightCurlyBracket:RightCurlyBracket;
dimensionId:ResourceLocation;
mobAttribute:ResourceLocation;
integer:Integer;
intInterval:IntInterval;
axeValue:Integer | Double;
gameTimeValue:GameTimeValue;
biomeId:ResourceLocation;
bool:BooleanValue;
stringValue:String;
jsonComponent:jsonValue;
uuid:UUID;

jobject: CurlyBrackets | (LeftCurlyBracket jpair(Comma jpair)* RightCurlyBracket);
jarray: SquareBrackets | (LeftSquareBracket jvalue (Comma jvalue)* RightSquareBracket);
jkey:Identifier;
jpair: jkey Colon jvalue;
jsonValue: jobject;
jvalue: stringValue | Double | jobject | jarray | bool;

nbtPath:Identifier(Dot Identifier)*;
dataType:ByteKey|DoubleKey|FloatKey|IntKey|LongKey|ShortKey;

itemId:ResourceLocation;

blockState:BlockStateKey equal BlockStateValue;
blockID:ResourceLocation | (Identifier (leftSquareBracket blockState(Comma  blockState)* rightSquareBracket)?);

blockNBT:jsonValue;
entityNBT:jsonValue;
targetObjective:Identifier;
storageId:Identifier;
storageIdString:Identifier;

coordinateX:Coordinate|Double|Integer;
coordinateY:Coordinate|Double|Integer;
coordinateZ:Coordinate|Double|Integer;

pos3D:coordinateX coordinateY coordinateZ;
pos2D:coordinateX coordinateZ;
gamemodeValue:Identifier;
sortValue:Identifier;
identifier:Identifier;
viewRotationValue:Double|PositiveDouble;
doubleInterval:DoubleInterval;
positiveDouble:PositiveDouble;
positiveDoubleInterval:PositiveDoubleInterval;
levelValue:Integer;
nameValue:Identifier|String;
entityType: Identifier | ResourceLocation;
predicateValue:ResourceLocation;

//匹配选择器，让选择器分析器来解析它
selector:identifier | (atChar selectorName selectorParameter?);
selectorName:SelectorName;
selectorParameter: SquareBrackets | (leftSquareBracket (parameter(Comma parameter)*)? rightSquareBracket);

scorePath:Identifier;
scoreParameter:scorePath equal exclamationMark?(integer|intInterval);
scoresValue: CurlyBrackets | (leftCurlyBracket (scoreParameter(Comma scoreParameter)*)? rightCurlyBracket);

parameter:(axeKey equal axeValue)
|(axeLengthKey equal positiveDouble)
|(viewRotationKey equal (viewRotationValue|doubleInterval))
|(distance equal (positiveDouble|positiveDoubleInterval))
|(level equal (levelValue|intInterval))
|(gamemodeKey equal exclamationMark?gamemodeValue)
|(advancementKey equal advancementValue)
|(scoreKey equal scoresValue)
|(limit equal integer)
|(teamKey equal exclamationMark?teamName?)
|(name equal exclamationMark?nameValue)
|(typeKey equal exclamationMark?entityType)
|(predicate equal exclamationMark?predicateValue)
|(nbtKey equal exclamationMark?jsonValue?)
|(sortKey equal sortValue?)
;

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

axeKey:AxeKey;
star:Star;
advancementKey:AdvancementKey;
attributeKey:AttributeKey;
bossbarKey:BossbarKey;
clearKey:ClearKey;
cloneKey:CloneKey;
damageKey:DamageKey;
dataKey:DataKey;
datapackKey:DatapackKey;
debugKey:DebugKey;
defaultgamemodeKey:DefaultgamemodeKey;
difficultyKey:DifficultyKey;
effectKey:EffectKey;
enchantKey:EnchantKey;
executeKey:ExecuteKey;
experienceKey:ExperienceKey;
fillKey:FillKey;
fillbiomeKey:FillbiomeKey;
forceloadKey:ForceloadKey;
functionKey:FunctionKey;
gamemodeKey:GamemodeKey;
gameruleKey:GameruleKey;
giveKey:GiveKey;
helpKey:HelpKey;
itemKey:ItemKey;
jfrKey:JfrKey;
kickKey:KickKey;
killKey:KillKey;
listKey:ListKey;
locateKey:LocateKey;
lootKey:LootKey;
meKey:MeKey;
msgKey:MsgKey;
particleKey:ParticleKey;
placeKey:PlaceKey;
playsoundKey:PlaysoundKey;
publishKey:PublishKey;
recipeKey:RecipeKey;
reloadKey:ReloadKey;
returnKey:ReturnKey;
rideKey:RideKey;
sayKey:SayKey;
scheduleKey:ScheduleKey;
scoreboardKey:ScoreboardKey;
seedKey:SeedKey;
setblockKey:SetblockKey;
setworldspawnKey:SetworldspawnKey;
spawnpointKey:SpawnpointKey;
spectateKey:SpectateKey;
spreadplayersKey:SpreadplayersKey;
stopsoundKey:StopsoundKey;
summonKey:SummonKey;
tagKey:TagKey;
teamKey:TeamKey;
teammsgKey:TeammsgKey;
teleportKey:TeleportKey;
tellKey:TellKey;
tellrawKey:TellrawKey;
timeKey:TimeKey;
titleKey:TitleKey;
tmKey:TmKey;
tpKey:TpKey;
triggerKey:TriggerKey;
weatherKey:WeatherKey;
worldborderKey:WorldborderKey;
xpKey:XpKey;

axeLengthKey:AxeLengthKey;
viewRotationKey:ViewRotationKey;
level:Level;
scoreKey:ScoreKey;
limit:LimitKey;
typeKey:TypeKey;
nbtKey:NBTKey;
sortKey:SortKey;
divisionEqual:DivisionEqual;
multiplicationEqual:MultiplicationEqual;
additionEqual:AdditionEqual;
subtractionEqual:SubtractionEqual;
remainderEqual:RemainderEqual;
lessThan:LeftAngleBracket;
lessThanOrEqualTo:LessThanOrEqualTo;
equal:Equal;
greaterThan:RightAngleBracket;
greaterThanOrEqualTo:GreaterThanOrEqualTo;
greaterThanLessThan:GreaterThanLessThan;

add:Add;
remove:Remove;
value:Value;
set:Set;
multiply:Multiply;
multiply_base:Multiply_Base;
max:Max;
players:Players;
visible:Visible;
color:Color;
name:Name;
style:Style;
filtered:Filtered;
masked:Masked;
replace:Replace;
force:Force;
move:Move;
normal:Normal;
to:To;
by:By;
merge:Merge;
modify:Modify;
block:Block;
entity:Entity;
storage:Storage;
stringKey:StringKey;
as:As;
grant:Grant;
revoke:Revoke;
everything:Everything;
only:Only;
from:From;
through:Through;
until:Until;
base:Base;
get:Get;
modifier:Modifier;
available:Available;
enable:Enable;
after:After;
before:Before;
first:First;
last:Last;
disable:Disable;
start:Start;
stop:Stop;
infinite:Infinite;
easy:Easy;
hard:Hard;
peaceful:Peaceful;
eyes:Eyes;
feet:Feet;
all:All;
biome:Biome;
blocks:Blocks;
dimension:Dimension;
loaded:Loaded;
predicate:Predicate;
score:Score;
matches:Matches;
attacker:Attacker;
controller:Controller;
leasher:Leasher;
origin:Origin;
owner:Owner;
passengers:Passengers;
target:Target;
vehicle:Vehicle;
motion_blocking:Motion_blocking;
motion_blocking_no_leaves:Motion_blocking_no_leaves;
ocean_floor:Ocean_floor;
world_surface:World_surface;
over:Over;
result:Result;
success:Success;
align:Align;
anchored:Anchored;
if:If;
unless:Unless;
in:In;
on:On;
positioned:Positioned;
rotated:Rotated;
run:Run;
store:Store;
query:Query;
levels:Levels;
points:Points;
destroy:Destroy;
hollow:Hollow;
keep:Keep;
outline:Outline;
uuids:Uuids;
poi:Poi;
structure:Structure;
insert:Insert;
spawn:Spawn;
fish:Fish;
mine:Mine;
feature:Feature;
jigsaw:Jigsaw;
template:Template;
front_back:Front_back;
left_right:Left_right;
none:None;
clockwise_90:Clockwise_90;
counterclockwise_90:Counterclockwise_90;
ambient:Ambient;
hostile:Hostile;
master:Master;
music:Music;
neutral:Neutral;
player:Player;
record:Record;
voice:Voice;
append:Append;
dismount:Dismount;
mount:Mount;
objectives:Objectives;
hearts:Hearts;
rendertype:Rendertype;
setdisplay:Setdisplay;
operation:Operation;
reset:Reset;
under:Under;
actionbar:Actionbar;
subtitle:Subtitle;
times:Times;
fadeIn:FadeIn;
stay:Stay;
fadeOut:FadeOut;
center:Center;
warning:Warning;
amount:Amount;
buffer:Buffer;
facing:Facing;
prepend:Prepend;
with:With;
mainhand:Mainhand;
offhand:Offhand;
take:Take;
always:Always;
never:Never;
pushOtherTeams:PushOtherTeams;
pushOwnTeam:PushOwnTeam;
hideForOtherTeams:HideForOtherTeams;
hideForOwnTeam:HideForOwnTeam;
friendlyFire:FriendlyFire;
nametagVisibility:NametagVisibility;
seeFriendlyInvisibles:SeeFriendlyInvisibles;
rain:Rain;
thunder:Thunder;
day:Day;
midnight:Midnight;
night:Night;
daytime:Daytime;
noon:Noon;
gametime:Gametime;
distance:Distance;
empty:Empty;
join:Join;
leave:Leave;
collisionRule:CollisionRule;
deathMessageVisibility:DeathMessageVisibility;
prefix:Prefix;
suffix:Suffix;
displayName:DisplayName;
booleanValue:BooleanValue;

oneHundredAndEighty:OneHundredAndEighty;

// 进度
advancementRadical: advancementKey (grant|revoke) selector advancementModes;
advancementCriterion:FileReference;
advancementCriterionBlock:advancementCriterion equal (booleanValue | (leftCurlyBracket identifier equal booleanValue rightCurlyBracket));
advancementValue:CurlyBrackets | (leftCurlyBracket advancementCriterionBlock (Comma advancementCriterionBlock)* rightCurlyBracket);
advancementModes:(everything|(only advancementCriterion))|(from advancementCriterion)|(through advancementCriterion)|(until advancementCriterion);

//属性
attributeRadical: attributeKey selector mobAttribute attributeOptions;
attributeOptions: (base baseModifier Double)|(get Double)|(modifier modifierOptions);
baseModifier:get|set;
modifierOptions:(add uuid stringValue Double modifierModes)|(remove uuid)|(value get uuid Double);
modifierModes:add|multiply|multiply_base;

//bossbar
bossbarRadical:bossbarKey bossbarOptions;
bossbarID:ResourceLocation;
bossbarIdString:Identifier;
bossbarOptions:((add bossbarIdString jsonComponent)|(get bossbarID bossbarGetTarget)|listKey|(remove bossbarID)|(set bossbarID bossbarAttributes));
bossbarStyle:Identifier;
bossbarColor:Identifier;
bossbarGetTarget:max|players|value|visible;
bossbarAttributes:(color bossbarColor)|(max integer)|(name jsonComponent)|(players selector)|(style bossbarStyle)|(value integer)|(visible bool);

//clear
clearRadical:clearKey (selector itemId? count?)?;
count:Integer;

//clone
cloneRadical: cloneKey cloneSource cloneDestination cloneMode?;
cloneSource: (from dimensionId)? cloneBegin cloneEnd;
cloneBegin:coordinateX coordinateY coordinateZ;
cloneEnd:coordinateX coordinateY coordinateZ;
cloneDestination: (to dimensionId)? destinationPos;
destinationPos:coordinateX coordinateY coordinateZ;
cloneMode: ((filtered blockID) | (masked | replace)) cloneBehavior?;
cloneBehavior: force | move | normal;

//damage
damageRadical:damageKey selector Double damageType damageOptions;
damageType:Identifier;
damageOptions:(atLetter pos3D)|(by selector from selector);

//data
dataRadical:dataKey dataOptions;

dataStringStart:Integer;
dataStringEnd:Integer;
entityNBTPath:Identifier(Dot Identifier)*;
blockNBTPath:Identifier(Dot Identifier)*;

dataOptions: (get dataGetTarget)|(merge dataMergeTarget)|(modify dataModifyTarget)|(remove dataRemoveTarget);

dataGetTarget:(block pos3D blockNBTPath Double)|(entity selector entityNBTPath Double)|(storage storageIdString nbtPath Double);

dataMergeTarget:(block pos3D blockNBT)|(entity selector entityNBT)|(storage storageId jsonComponent);

dataModifyStringTarget:(block pos3D blockNBTPath dataStringStart dataStringEnd)|(entity selector entityNBTPath dataStringStart dataStringEnd)|(storage storageId nbtPath dataStringStart dataStringEnd);

dataModifyFromTarget:(block pos3D blockNBTPath)|(entity selector entityNBTPath)|(storage storageId nbtPath);

dataModifyBehaviors:(from dataModifyFromTarget)|(stringKey dataModifyStringTarget)|(value jsonComponent);

dataModifyOptions:(append dataModifyBehaviors)|(insert integer dataModifyBehaviors)|(merge dataModifyBehaviors)|(prepend dataModifyBehaviors)|(set dataModifyBehaviors);

dataModifyTarget:(block pos3D blockNBTPath dataModifyOptions)|(entity selector entityNBTPath dataModifyOptions)|(storage storageId nbtPath dataModifyOptions);

dataRemoveTarget:(block pos3D blockNBTPath)|(entity selector entityNBTPath)|(storage storageIdString nbtPath);

//datapack
datapackRadical:datapackKey datapackOptions;
datapackState:available|enable;
datapackId:String;
datapackBehaviors:(after datapackId)|(before datapackId)|first|last;
datapackOptions:(disable datapackId)|(enable datapackId datapackBehaviors)|(listKey datapackState);

//debug
debugRadical:debugKey debugOptions;
debugOptions:(functionKey datapackId)|start|stop;

//defaultgamemode
defaultgamemodeRadical:defaultgamemodeKey gamemodeValue;

//difficulty
difficultyRadical:difficultyKey difficultyValues;
difficultyValues:easy|hard|normal|peaceful;

//effect
effectRadical:effectKey effectOption;
effectOption:(clearKey (selector effectID?)?)|(giveKey selector effectID effectTime|infinite amplifier hideParticles);
effectID:ResourceLocation;
//infinite|
effectTime:Integer;
seconds:Integer;
amplifier:Integer;
hideParticles:BooleanValue;

//enchant
enchantRadical:enchantKey selector enchantID enchantLevel;
enchantLevel:Integer;
enchantID:ResourceLocation;

//execute
executeRadical:executeKey executeOptions;
executeEyesOrFeet:eyes|feet;
axes:Axes;
executeAllOrMasked:all|masked;
executeMaxOrValue:max|value;
executeJudgeDataOptions:
(block pos3D nbtPath)
|(entity selector nbtPath)
|(storage storageId nbtPath);

executeJudgementOptions:
((biome pos3D biomeId)
|(block pos3D blockID)
|(blocks pos3D pos3D pos3D (executeAllOrMasked))
|(dataKey executeJudgeDataOptions)
|(dimension dimensionId)
|(entity selector)
|(loaded pos3D)
|(predicate exclamationMark?predicateValue)
|(score selector targetObjective executeOperations));

executeOperations:((lessThan|lessThanOrEqualTo|equal|greaterThanOrEqualTo) selector targetObjective)|(matches integer|intInterval);

executeOn:attacker|controller|leasher|origin|owner|passengers|target|vehicle;

executeOver:motion_blocking|motion_blocking_no_leaves|ocean_floor|world_surface;

executePositioned:(as selector)|(over executeOver);

executeStoreTarget:(block pos3D nbtPath dataType Double)
|(bossbarKey bossbarID executeMaxOrValue)
|(entity selector nbtPath dataType Double)
|(score selector targetObjective)
|(storage storageId nbtPath dataType Double);

executeStore:(result|success) executeStoreTarget;

executeFacing:(pos3D executeOptions)|(entity selector executeEyesOrFeet executeOptions);

executeOptions:(align axes executeOptions)
|(anchored executeEyesOrFeet executeOptions)
|((as|atLetter) selector executeOptions)
|(facing executeFacing executeOptions)
|((if|unless) executeJudgementOptions executeOptions)
|(in dimensionId executeOptions)
|(on executeOn executeOptions)
|(positioned (pos3D|executePositioned) executeOptions)
|(rotated as selector executeOptions)
|(run commands)
|(store executeStore executeOptions)
|(summonKey entityType executeOptions);

//experience
experienceRadical:experienceKey experienceOptions;
experienceAmount:Integer;
expreienceType:levels|points;
experienceOptions:((add|set) selector experienceAmount expreienceType)|(query selector expreienceType);

//fill
fillRadical:fillKey pos3D pos3D blockID fillOptions;
fillOptions:(destroy|hollow|keep|outline)|(replace blockID);

//fillBiome
fillbiomeRadical:fillbiomeKey pos3D pos3D biomeId fillBiomeOptions;
fillBiomeOptions:replace biomeId;

//forceload
forceloadRadical:forceloadKey forceloadOptions;
forceloadRemoveObjectives:(pos2D pos2D)|all;
forceloadOptions:(add pos2D pos2D)|(query pos2D)|(remove forceloadRemoveObjectives);

//function
functionRadical:functionKey functionId;

// gamemode
gamemodeRadical: gamemodeKey gamemodeValue selector?;

// gamerule
gameruleRadical: gameruleKey gameruleName gameruleValue;
gameruleName: Identifier;
gameruleValue: BooleanValue | Integer;

//give
giveRadical:giveKey selector itemId integer;

//help
helpRadical:helpKey (commandList);
commandList:Identifier;

//item
itemRadical:itemKey itemOptions;
itemSlot:ResourceLocation;
itemModifierFile:ResourceLocation;
itemOptions:(modify itemModifyTarget)|(replace itemReplaceTarget);
itemBehaviors:(from itemModifyTarget)|(with itemId integer);
itemModifyTarget:(block pos3D itemSlot itemModifierFile)|(entity selector itemSlot itemModifierFile);
itemReplaceTarget:(block pos3D itemSlot itemBehaviors)|(entity selector itemSlot itemBehaviors);

//jfr
jfrRadical:jfrKey jfrStartOrStop;
jfrStartOrStop:start|stop;

//kick
kickRadical:kickKey selector reason;
reason:MessageContent;

//kill
killRadical:killKey selector;

//list
listRadical:listKey uuids;

//locate
locateRadical:locateKey locateOptions;
poiId:Identifier;
structureId:Identifier;
locateOptions:(biome biomeId)|(poi poiId)|(structure structureId);

//loot
lootRadical:lootKey lootOptions;
lootFilePath:ResourceLocation;
lootTool:mainhand|offhand|ResourceLocation;
lootOptions:(giveKey selector lootModes)|(insert pos3D lootModes)|(replace lootReplace)|(spawn pos3D lootModes);
lootReplace:(block pos3D itemSlot lootModes)|(entity selector itemSlot lootModes);
lootModes:(fish lootFilePath pos3D lootTool)|(killKey selector)|(lootKey lootFilePath)|(mine pos3D lootTool);

//me
meRadical:meKey action;
action:MessageContent;

//msg
msgRadical:msgKey selector msgMessage;
msgMessage:MessageContent;

//particle
particleRadical:particleKey particleId pos3D particleDelta? particleSpeed? particleCount? particleOptions? selector?;
particleSpeed:Double|Integer;
particleCount:Integer;
particleDelta:coordinateX coordinateY coordinateZ;
particleOptions:force|normal;
particleId:(particleIDString|identifier) jobject?;
particleIDString:ResourceLocation;

//place
placeRadical:placeKey placeModes;
featureId:Identifier;
jigsawTarget:Identifier;
jigsawFilePath:ResourceLocation;
templateFilePath:ResourceLocation;
placeModes:(feature featureId pos3D)|(jigsaw jigsawFilePath jigsawTarget integer pos3D)|(structure structureId pos3D)|(template templateFilePath pos3D placeRotationModes Double integer);
placeMirrorItems:front_back|left_right|none;
placeRotationModes:(oneHundredAndEighty|clockwise_90|counterclockwise_90|none) placeMirrorItems;

//playsound
playsoundRadical:playsoundKey soundId soundTypes selector pos3D volume pitch minVolume;
volume:Double;
pitch:Double;
minVolume:Double;
soundTypes:ambient|hostile|master|music|neutral|player|record|voice|weatherKey;

//publish
publishRadical:publishKey bool gamemodeValue port;
port:Integer;

//recipe
recipeRadical:recipeKey recipeGiveOrTake selector recipeFilePath;
recipeFilePath:ResourceLocation;
recipeGiveOrTake:giveKey|take;

//reload
reloadRadical:reloadKey;

//return
returnRadical:returnKey integer;

//ride
rideRadical:rideKey selector rideModes;
rideModes:dismount|(mount selector);

//say
sayRadical:sayKey sayMessage;
sayMessage:MessageContent;

//schedule
scheduleRadical:scheduleKey scheduleModes;
functionId:ResourceLocation;
scheduleAppendOrReplace:append|replace;
scheduleModes:(clearKey functionId)|(functionKey functionId Double scheduleAppendOrReplace);

//scoreboard
scoreboardRadical:scoreboardKey scoreboardOptions;
scoreboardOptions:(objectives scoreboardObjectivesBehaviors)|(players scoreboardPlayersBehaviors);
scoreboardObjective:ScoreboardObjective;
scoreboardType:ResourceLocation;
scoreboardHeartsOrInteger:hearts|integer;
scoreboardOperator:remainderEqual|multiplicationEqual|additionEqual|subtractionEqual|divisionEqual|lessThan|equal|greaterThan|greaterThanLessThan;
scoreboardSlots:ResourceLocation;
scoreboardObjectivesBehaviors:(add scoreboardObjective scoreboardType jsonComponent)|listKey|(modify targetObjective (displayName jsonComponent)|(rendertype scoreboardHeartsOrInteger))|(remove targetObjective)|(setdisplay scoreboardSlots targetObjective);
scoreboardPlayersBehaviors:(add selector targetObjective value)|(enable selector targetObjective)|(get selector scoreboardObjective)|(listKey selector)|(operation selector targetObjective scoreboardOperator selector targetObjective)|(remove selector scoreboardObjective value)|(reset selector targetObjective)|(set selector targetObjective value);

//seed
seedRadical:seedKey;

//setblock
setblockRadical:setblockKey pos3D blockID setblockModes;
setblockModes:destroy|keep|replace;

//setworldspawn
setworldspawnRadical:setworldspawnKey pos3D Double;

//spawnpoint
spawnpointRadical:spawnpointKey selector pos3D Double;

//spectate
spectateRadical:spectateKey selector selector;

//spreadplayers
spreadplayersRadical:spreadplayersKey pos2D spreadDistance maxRange spreadplayersOptions;
spreadplayersOptions:(booleanValue selector)|(under integer bool selector);
spreadDistance:Double;
maxRange:Double;
respectTeams:BooleanValue;

//stopsound
stopsoundRadical:stopsoundKey selector stopsoundTypes soundId;
soundId:ResourceLocation;
stopsoundTypes:star|ambient|block|hostile|master|music|neutral|player|record|voice|weatherKey;

//summon
summonRadical:summonKey entityType pos3D jsonComponent;

//tag
tagRadical:tagKey selector tagOptions;
tagOptions:(add|remove tagValue)|listKey;
tagValue:Identifier;

//team
teamRadical:teamKey teamOptions;
teamId: Identifier;
teamName: Identifier;
teamCollisionRule:always|never|pushOtherTeams|pushOwnTeam;
teamColor:Identifier;
teamVisibility:always|hideForOtherTeams|hideForOwnTeam|never;
teamOptions:(add teamName jsonComponent)|(empty teamId)|(join teamId selector?)|(leave selector)|(listKey teamId)|(modify teamId teamAttributes)|(remove teamId);
teamAttributes:(collisionRule teamCollisionRule)|(color teamColor)|(deathMessageVisibility teamVisibility)|(displayName jsonComponent)|(friendlyFire bool)|(nametagVisibility teamVisibility)|((prefix|suffix) jsonComponent)|(seeFriendlyInvisibles bool);

//teammsg
teammsgRadical:teammsgKey teamMessage;
teamMessage:MessageContent;

//teleport
teleportRadical:teleportKey teleportOptions;
teleportEyesOrFeet:eyes|feet;
teleportOptions:pos3D|(selector (selector|(pos3D (facing ((entity selector teleportEyesOrFeet)|pos3D))|pos2D)));

//tell
tellRadical:tellKey selector tellMessage;
tellMessage:MessageContent;

//tellraw
tellrawRadical:tellrawKey selector jsonComponent;

//time
timeRadical:timeKey timeOptions;
timeDataTypes:day|daytime|gametime;
timeTimePoints:day|midnight|night|noon;
timeOptions:(add gameTimeValue)|(query timeDataTypes)|(set timeTimePoints|gameTimeValue);

//title
titleRadical:titleKey selector titleBehaviors;
titleBehaviors:((actionbar|subtitle|titleKey) jsonComponent)|(clearKey|reset)|(times fadeIn stay fadeOut);
faedIn:Integer;

//tm
tmRadical:tmKey tmMessage;
tmMessage:MessageContent;

//tp
tpRadical:tpKey teleportOptions;

//trigger
triggerRadical:triggerKey triggerObjective triggerBehaviors value;
triggerObjective:Identifier;
triggerBehaviors:add|set;

//weather
weatherRadical:weatherKey weatherMembers Double;
weatherMembers:clearKey|rain|thunder;

//worldborder
worldborderRadical:worldborderKey worldborderOptions;
worldborderOptions:(add Double integer)|(center pos2D)|(damageKey worldborderModes Double)|get|(set Double integer)|(warning worldborderWarningTypes integer);
worldborderWarningTypes:distance|timeKey;
worldborderModes:amount|buffer;

//xp
xpRadical:xpKey experienceOptions;