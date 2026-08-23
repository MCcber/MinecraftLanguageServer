lexer grammar mcdocLexer;
options {
    language = CSharp;
}

WS : [ \t\r\n\u000C\u00A0\p{Mn}\p{Mc}\p{Zs}] -> skip;

// ========== 最长符号（三字符、双字符）优先 ==========
TripleDot : '...';
DoubleDot : '..';
DoubleColon : '::';

// ========== 括号对（两字符）优先于单括号 ==========
SquareBrackets : '[]';
RoundBrackets : '()';
CurlyBrackets : '{}';
AngleBrackets : '<>';

// ========== ResourceLocation 包含冒号，必须在 ColonMark 和 Identifier 之前 ==========
fragment ResourceLocationChar : [a-z0-9-_.];
ResourceLocation : [a-zA-Z0-9_-] ResourceLocationChar* ':' ResourceLocationChar+ ('/' ResourceLocationChar+)*;

// ========== 单字符符号 ==========
ColonMark : ':';
Comma : ',';
Dot : '.';
At : '@';
QuestionMark : '?';
Plus : '+';
Equal : '=';
Sharp : '#';
Remainder : '%';
LeftSquareBracket : '[';
RightSquareBracket : ']';
LeftRoundBracket : '(';
RightRoundBracket : ')';
LeftCurlyBracket : '{';
RightCurlyBracket : '}';
LeftAngleBracket : '<';
RightAngleBracket : '>';
LogicalOR : '|';

// ========== 关键字（字母） ==========
As : 'as';
TypeKey : 'type ';
StructKeyType : 'struct';
Inject : 'inject';
Enum : 'enum';
Use : 'use';
To : 'to';
Dispatch : 'dispatch';
RemainderFallback : '%fallback';
RemainderNone : '%none';
RemainderUnknown : '%unknown';
RemainderParent : '%parent';
RemainderKey : '%key';
Any : 'any';
BoolValue : 'true' | 'false';

// 基本类型关键字
ByteKeyType : 'byte';
IntKeyType : 'int';
LongKeyType : 'long';
StringKeyType : 'string';
BooleanKeyType : 'boolean';
ShortKeyType : 'short';
FloatKeyType : 'float';
DoubleKeyType : 'double';

// ========== 数值单位（必须在 Identifier 之前） ==========
IntTypedUnit : [bBsSlL];
FloatTypedUnit : [dDfF];

// ========== 标识符（最后匹配） ==========
fragment IdentStart : [\p{L}\p{Nl}_%];
fragment IdentContinue : IdentStart | [\u200C\u200D.] | [\p{Mn}\p{Mc}\p{Nd}\p{Pc}];
Identifier : IdentStart IdentContinue*;

// ========== 其余规则保持不变 ==========
fragment HexDigit : [0-9a-fA-F];
fragment UnicodeEscape : 'u' HexDigit HexDigit HexDigit HexDigit;
fragment EscapeChar : '\\' (["\\bfnrt] | UnicodeEscape);

DocCommentary : '///' ~[\r\n]* ('\r'? '\n')?;
Commentary : '//' ~[/] ~[\r\n]* ('\r'? '\n')? -> skip;
DoubleQuotes : '"';

Int : '0' | ([-+]?[1-9][0-9]*);
fragment FloatExponent : [eE]([-+])?[0-9]+;
Float : (([-+])?[0-9]+ FloatExponent?) | (([-+])?[0-9]* Dot [0-9]+ FloatExponent?);
PositiveInteger : [0-9]+;

fragment SingleStringValue : ~["\p{Cc}] | EscapeChar;
String : '"' SingleStringValue* '"';

PathSegment : 'super' | Identifier;
Path : ('::')? PathSegment ('::' PathSegment)*;