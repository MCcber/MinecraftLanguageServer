grammar commonNBTTrees;
options {
    language = CSharp;
}

Bool:('0b'|'1b')|('true'|'false');
Byte:'-'?[0-9]+'b';
Int:'-'?[0-9]+;
Decimal:'-'?[0-9]+('.'[0-9]+)?;
IdString:'"'[a-z_]*?'"';
Any:'"'.*?'"';
content:Any;

//物品共同标签与实体相关的共同标签
trees:itemCommonTags|
angryCreatureExtraField|
arrowProjectileCommonTags|
breedableMobExtraFields|
commonTagsForMobsSpawnedInRaids|
commonTagsForRideableEntities|
commonTagsForZombies|
containerEntityCommonTags|
entityCommonTags|
fireballProjectileCommonTags|
itemProjectileCommonTags|
livingBodyCommonTags|
mineCartCommonTags|
mobCommonTags|
projectileCommonTags|
tameableMobExtraFields;

//itemCommonTags
itemCommonTags:'{'(count|id|tag|slot)'}';
count:'Count:'Int;
id:'id:'IdString;
slot:'Slot:'Byte;

tag:attributeModifiers|
canDestroy|
customCreativeLock|
customModelData|
damage|
display|
enchantments|
hideFlags|
repairCost|
trim|
unbreakable;

//attributeModifiers
attributeModifiers:attributeModifier;
attributeModifier:amount|attributeName|name|operation|attributeSlot|uuid;
amount:'amount:'Decimal','?;
attributeName:'AttributeName:'IdString','?;
name:'Name:'IdString','?;
operation:'Operation:'Int','?;
attributeSlot:'Slot:'('mainhand'|'offhand'|'head'|'chest'|'legs'|'feet')','?;
uuid:'UUID:['Int','Int','Int','Int']'','?;

//canDestroy
canDestroy:'CanDestroy:['(IdString','?)*?']'','?;
//customCreativeLock
customCreativeLock:'CustomCreativeLock:{}'','?;
//customModelData
customModelData:'CustomModelData:'Int','?;
//damage
damage:'Damage:'Int','?;
//display
display:'display:{'color?lore?name?'}'','?;
color:'color:'Int','?;
lore:'Lore:['(content|(jsonText(','jsonText?)*?))']'','?;
jsonText:'\'[{'Key':'Value'}]\'';
Key:'"text"';
Value:'"'[a-zA-Z_\-0-9]+'"';
//enchantments
enchantments:'Enchantments:['enchantment(','enchantment?)?']'','?;
enchantment:'{'(id','?)|(lvl','?)'}'','?;
lvl:'lvl:'Decimal's';
//hideFlags
hideFlags:'HideFlags:'Int','?;
//repairCost
repairCost:'RepairCost:'Int','?;
//trim
trim:material|pattern;
material:'material:'IdString','?;
pattern:'pattern:'IdString','?;
//unbreakable
unbreakable:'Unbreakable:'Bool','?;

//angryCreatureExtraField
angryCreatureExtraField:angerTime|
angryAt|
cannotEnterHiveTicks|
cropsGrownSincePollination|
flowerPos|
hasNectar|
hasStung|
hivePos|
ticksSincePollination;

angerTime:'AngerTime:'Int','?;
angryAt:'AngryAt:['Int','Int','Int','Int']'','?;
cannotEnterHiveTicks:'CannotEnterHiveTicks:'Int','?;
cropsGrownSincePollination:'CropsGrownSincePollination:'Int','?;
flowerPos:'FlowerPos:['Int','Int','Int']'','?;
hasNectar:'HGasNectar:'Bool','?;
hasStung:'HasStung:'Bool','?;
hivePos:'HivePos:['Int','Int','Int']'','?;
ticksSincePollination:'TicksSincePollination:'Int','?;

//arrowProjectileCommonTags
arrowProjectileCommonTags:crit|shotFromCrossbow|soundEvent|inGround|pickup|pierceLevel|shake|life|arrowDamage|inBlockState;

crit:'crit:'Bool','?;
shotFromCrossbow:'ShotFromCrossbow:'Bool','?;
soundEvent:'SoundEvent:'Bool','?;
inGround:'inGround:'Bool','?;
pickup:'pickup:'Byte','?;
pierceLevel:'PierceLevel:'Byte','?;
shake:'shake:'Byte','?;
life:'life:'Decimal','?;
arrowDamage:'damage:'Decimal','?;
inBlockState:'inBlockState:{'blockStateName|blockStateProperties'}'','?;
blockStateName:'Name:'IdString','?;
blockStateProperties:'Properties:{'(propertiesKeyValuePair(','propertiesKeyValuePair?)?)'}'','?;
propertiesKeyValuePair:propertiesKey':'propertiesValue;
propertiesKey:IdString;
propertiesValue:IdString;

//breedableMobExtraFields
breedableMobExtraFields:age|
forcedAge|
inLove|
loveCause;

age:'Age:'Int','?;
forcedAge:'ForcedAge:'Int','?;
inLove:'InLove:'Int','?;
loveCause:'LoveCause:['Int','Int','Int','Int']'','?;

//commonTagsForMobsSpawnedInRaids
commonTagsForMobsSpawnedInRaids:canJoinRaid|
patrolLeader|
patrolling|
patrolTarget|
raidId|
wave;

canJoinRaid:'CanJoinRaid:'Bool','?;
patrolLeader:'PatrolLeader:'Bool','?;
patrolling:'Patrolling:'Bool','?;
patrolTarget:'PatrolTarget:['Int','Int','Int']'','?;
raidId:'RaidId:'Int','?;
wave:'Wave:'Int','?;

//commonTagsForRideableEntities
commonTagsForRideableEntities:bred|
eatingHaystack|
owner|
tame|
temper;

bred:'Bred:'Bool','?;
eatingHaystack:'EatingHaystack:'Bool','?;
owner:'Owner:['Int','Int','Int','Int']'','?;
tame:'Tame:'Bool','?;
temper:'Temper:'Int','?;

//commonTagsForZombies
commonTagsForZombies:canBreakDoors|
drownedConversionTime|
inWaterTime|
isBaby;

canBreakDoors:'CanBreakDoors:'Bool','?;
drownedConversionTime:'DrownedConversionTime:'Int','?;
inWaterTime:'InWaterTime:'Int','?;
isBaby:'IsBaby:'Bool','?;

//containerEntityCommonTags
containerEntityCommonTags:lootTable|lootTableSeed|containerItems;

lootTable:'LootTable:'IdString','?;
lootTableSeed:'LootTableSeed:'Decimal','?;
containerItems:'Items:['itemCommonTags(','itemCommonTags?)?']'','?;

//entityCommonTags
entityCommonTags:air|
customName|
customNameVisible|
fallDistance|
fire|
glowing|
hasVisualFire|
invulnerable|
motion|
noGravity|
portalCooldown|
rotation|
silent|
tags|
ticksFrozen|
uuid|
passengers;

air:'Air:'Decimal','?;
customName:'CustomName:'IdString','?;
customNameVisible:'CustomNameVisible:'Bool','?;
fallDistance:'FallDistance:'Decimal','?;
fire:'Fire:'Decimal','?;
glowing:'Glowing:'Bool','?;
hasVisualFire:'HasVisualFire:'Bool','?;
invulnerable:'Invulnerable:'Bool','?;
motion:'Motion:['Decimal','Decimal','Decimal']'','?;
noGravity:'NoGravity:'Bool','?;
portalCooldown:'PortalCooldown:'Int','?;
rotation:'Rotation:['Decimal','Decimal']'','?;
silent:'Silent:'Bool','?;
tags:'Tags:['content(','content?)?']'','?;
ticksFrozen:'TicksFrozen:'Int','?;
passengers:'Passengers:['']'','?;
entityData:'{'id','?(angryCreatureExtraField|
arrowProjectileCommonTags|
breedableMobExtraFields|
commonTagsForMobsSpawnedInRaids|
commonTagsForRideableEntities|
commonTagsForZombies|
containerEntityCommonTags|
entityCommonTags|
fireballProjectileCommonTags|
itemProjectileCommonTags|
)'}';

//fireballProjectileCommonTags
fireballProjectileCommonTags:power;
power:'power:['Decimal','Decimal','Decimal']'','?;

//itemProjectileCommonTags
itemProjectileCommonTags:itemProjectileItem;
itemProjectileItem:'Items:['itemCommonTags(','itemCommonTags?)?']'','?;

//livingBodyCommonTags
livingBodyCommonTags:absorptionAmount|
deathTime|
fallFlying|
health|
hurtByTimestamp|
hurtTime|
sleepingX|
sleepingY|
sleepingZ|
livingBodyAttributes|
livingBodyActiveEffects;

absorptionAmount:'AbsorptionAmount:'Decimal','?;
deathTime:'DeathTime:'Decimal','?;
fallFlying:'FallFlying:'Bool','?;
health:'Health:'Decimal','?;
hurtByTimestamp:'HurtByTimestamp:'Int','?;
hurtTime:'HurtTime:'Decimal','?;
sleepingX:'SleepingX:'Int','?;
sleepingY:'SleepingY:'Int','?;
sleepingZ:'SleepingZ:'Int','?;
livingBodyAttributes:'Attributes:['livingBodyAttribute(','livingBodyAttribute?)?']'','?;
livingBodyAttribute:'{'base|livingBodyModifiers|livingBodyName'}';
base:'Base:'Decimal','?;
livingBodyModifiers:'Modifiers['livingBodyModify(','livingBodyModify?)?']';
livingBodyModify:livingBodyAmount|livingBodyModifyName|livingBodyOperation|uuid;
livingBodyAmount:'Amount:'Decimal','?;
livingBodyModifyName:'Name:'IdString','?;
livingBodyOperation:'Operation:'Int','?;
livingBodyName:'Name:'IdString','?;

livingBodyActiveEffects:'active_effects:['livingBodyActiveEffect(','livingBodyActiveEffect?)?']'','?;
livingBodyActiveEffect:ambient|
amplifier|
duration|
factor_calculation_data|
id|
show_icon|
show_particles;

ambient:'ambient:'Bool','?;
amplifier:'amplifier:'Byte','?;
duration:'duration:'Int','?;
factor_calculation_data:effect_changed_timestamp|
factor_current|
factor_previous_frame|
factor_start|
factor_target|
had_effect_last_tick|
padding_duration;

effect_changed_timestamp:'effect_changed_timestamp:'Int','?;
factor_current:'factor_current:'Decimal','?;
factor_previous_frame:'factor_previous_frame:'Decimal','?;
factor_start:'factor_start:'Decimal','?;
factor_target:'factor_target:'Decimal','?;
had_effect_last_tick:'had_effect_last_tick:'Bool','?;
padding_duration:'padding_duration:'Int','?;
show_icon:'show_icon:'Bool','?;
show_particles:'show_particles:'Bool','?;

//mineCartCommonTags
mineCartCommonTags:customDisplayTile|displayOffset|displayState;
customDisplayTile:'CustomDisplayTile:'Bool','?;
displayOffset:'displayOffset:'Int','?;
displayState:'DisplayState:{'blockStateName|blockStateProperties'}'','?;

//mobCommonTags
mobCommonTags:canPickUpLoot|
deathLootTable|
deathLootTableSeed|
leftHanded|
noAI|
persistenceRequired|
leash|
armorItems|
armorDropChances|
handItems|
handDropChances;

canPickUpLoot:'CanPickUpLoot:'Bool','?;
deathLootTable:'DeathLootTable:'IdString','?;
deathLootTableSeed:'DeathLootTableSeed:'Decimal','?;
leftHanded:'LeftHanded:'Bool','?;
noAI:'NoAI:'Bool','?;
persistenceRequired:'PersistenceRequired:'Bool','?;
leash:;
armorItems:'ArmorItems:['itemCommonTags(','itemCommonTags?)?']'','?;
armorDropChances:'ArmorDropChances:['Decimal','Decimal','Decimal','Decimal']'','?;
handItems:'HandItems:['itemCommonTags(','itemCommonTags?)?']'','?;
handDropChances:'HandDropChances:['Decimal','Decimal','Decimal','Decimal']'','?;

//projectileCommonTags
projectileCommonTags:hasBeenShot|leftOwner|owner;
hasBeenShot:'HasBeenShot:'Bool','?;
leftOwner:'LeftOwner:'Bool','?;

//tameableMobExtraFields
tameableMobExtraFields:owner|sitting;
sitting:'Sitting:'Bool','?;