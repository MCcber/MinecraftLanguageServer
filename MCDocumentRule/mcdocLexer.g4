lexer grammar mcdocLexer;
options {
    language = Java;
}

//{ !IsReservedWord($text) }?
// RESERVED_WORD:'any'|'boolean'|'byte'|'double'|'enum'|'false'|'float'|'int'|'long'|'short'|'string'|'struct'|'super'|'true';

WS : [ \t\r\n\u000C\u00A0\p{Mn}\p{Mc}\p{Zs}] -> skip;
As:'as';
Dot:'.';
Minus:'-';
Plus:'+';
Remainder:'%';
Equal:'=';
Sharp:'#';

SquareBrackets:'[]';
LeftSquareBracket:'[';
RightSquareBracket:']';

RoundBrackets:'()';
LeftRoundBracket:'(';
RightRoundBracket:')';

CurlyBrackets:'{}';
LeftCurlyBracket:'{';
RightCurlyBracket:'}';

AngleBrackets:'<>';
LeftAngleBracket:'<';
RightAngleBracket:'>';

LogicalOR:'|';
Comma:',';
DoubleColon:'::';
ColonMark: ':';
DoubleDot:'..';
TripleDot:'...';
EnumKeyType:'enum';
StringKeyType:'string';
BooleanKeyType:'boolean';
ByteKeyType:'byte';
ShortKeyType:'short';
IntKeyType:'int';
FloatKeyType:'float';
DoubleKeyType:'double';
LongKeyType:'long';
Any:'any';
BoolValue:'true'|'false';

fragment HexDigit: [0-9a-fA-F];

fragment UnicodeEscape: 'u' HexDigit HexDigit HexDigit HexDigit;

fragment EscapeChar: '\\' (["\\bfnrt] | UnicodeEscape);

DocCommentary : '///' ~[\r\n]* ('\r'? '\n')?;
Commentary : '//' ~[/] ~[\r\n]* ('\r'? '\n')?;
DoubleQuotes:'"';

TypedNumberLexer:(Integer IntTypedUnit)|(Float FloatTypedUnit);

Integer: '0'|([-+]?[1-9][0-9]*);
FloatExponent:[eE]([-+])?[0-9]+;
Float:(([-+])?[0-9]+FloatExponent?)|(([-+])?[0-9]*Dot[0-9]+FloatExponent);
Number: Minus? ([0-9]+ (Dot [0-9]+)?) | (([0-9]+)? (Dot [0-9]+));
PositiveInteger:[0-9]+;
IntTypedUnit:[bBsSlL];
FloatTypedUnit:[dDfF];

//\p{Letter}\p{Letter_Number}\p{Number}\p{Space_Separator}\p{Dash_Punctuation}\p{Other_Punctuation}\p{Connector_Punctuation}
IdentStart:[\p{L}\p{Nl}_%.];
IdentContinue:IdentStart|[\u200C\u200D]|[\p{Mn}\p{Mc}\p{Nd}\p{Pc}];
Identifier:IdentStart IdentContinue*;

SingleStringValue:~["\p{Cc}]|EscapeChar;
String: '"' SingleStringValue* '"';

IntegerRange: (DoubleDot Integer) | (Integer DoubleDot) | (Integer DoubleDot Integer);
FloatRange: (DoubleDot Float) | (Float DoubleDot) | (Float DoubleDot Float);

ResourceLocationChar:[a-z0-9-_.]+;
ResourceLocation: ResourceLocationChar ':' ResourceLocationChar ('/' ResourceLocationChar)*;

PathSegment:'super'|Identifier;
Path: ('::')?PathSegment ('::'PathSegment)*;