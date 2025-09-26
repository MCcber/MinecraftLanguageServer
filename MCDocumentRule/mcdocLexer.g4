lexer grammar mcdocLexer;
options {
    language = CSharp;
}

//{ !IsReservedWord($text) }?
// RESERVED_WORD:'any'|'boolean'|'byte'|'double'|'enum'|'false'|'float'|'int'|'long'|'short'|'string'|'struct'|'super'|'true';

WS : [ \t\r\n\u000C\u00A0\p{Mn}\p{Mc}\p{Zs}] -> skip;
As:'as';
At:'@';
QuestionMark:'?';
Dot:'.';
TypeKey:'type ';
StructKeyType:'struct';
fragment Minus:'-';
Inject:'inject';
Enum:'enum';
Use:'use';
To:'to';
Dispatch:'dispatch';
Fallback:'%fallback';
None:'%none';
Unknown:'%unknown';
Parent:'%parent';
Key:'%key';
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
TripleDot:'...';
DoubleDot:'..';
ByteKeyType:'byte';
IntKeyType:'int';
LongKeyType:'long';
StringKeyType:'string';
BooleanKeyType:'boolean';
ShortKeyType:'short';
FloatKeyType:'float';
DoubleKeyType:'double';
Any:'any';
BoolValue:'true'|'false';

fragment HexDigit: [0-9a-fA-F];

fragment UnicodeEscape: 'u' HexDigit HexDigit HexDigit HexDigit;

fragment EscapeChar: '\\' (["\\bfnrt] | UnicodeEscape);

DocCommentary : '///' ~[\r\n]* ('\r'? '\n')?;
Commentary : '//' ~[/] ~[\r\n]* ('\r'? '\n')?;
DoubleQuotes:'"';

Integer: '0'|([-+]?[1-9][0-9]*);
fragment FloatExponent:[eE]([-+])?[0-9]+;
Float:(([-+])?[0-9]+FloatExponent?)|(([-+])?[0-9]*Dot[0-9]+FloatExponent);
PositiveInteger:[0-9]+;
IntTypedUnit:[bBsSlL];
FloatTypedUnit:[dDfF];

IntegerRange:(DoubleDot Integer) | (Integer DoubleDot) | (Integer DoubleDot Integer);
FloatRange: (DoubleDot Float) | (Float DoubleDot) | (Float DoubleDot Float);

//\p{Letter}\p{Letter_Number}\p{Number}\p{Space_Separator}\p{Dash_Punctuation}\p{Other_Punctuation}\p{Connector_Punctuation}
fragment IdentStart:[\p{L}\p{Nl}_%.];
fragment IdentContinue:IdentStart|[\u200C\u200D]|[\p{Mn}\p{Mc}\p{Nd}\p{Pc}];
Identifier:IdentStart IdentContinue*;

fragment SingleStringValue:~["\p{Cc}]|EscapeChar;
String: '"' SingleStringValue* '"';

ResourceLocationChar:[a-z0-9-_.]+;
ResourceLocation: ResourceLocationChar ':' ResourceLocationChar ('/' ResourceLocationChar)*;

PathSegment:'super'|Identifier;
Path: ('::')?PathSegment ('::'PathSegment)*;