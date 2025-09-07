lexer grammar mcdocLexer;
options {
    language = Java;
}

//{ !IsReservedWord($text) }?
// RESERVED_WORD:'any'|'boolean'|'byte'|'double'|'enum'|'false'|'float'|'int'|'long'|'short'|'string'|'struct'|'super'|'true';

WS : [ \t\r\n]+ -> skip;
NewLine:'\n';
At:'@ ';
LogicalOR:'|';
Comma:',';
DoubleColon:'::';
ColonMark: ':';
DoubleDot:'..';
StringKeyType:'string';
BooleanKeyType:'boolean';
ByteKeyType:'byte';
ShortKeyType:'short';
IntKeyType:'int';
FloatKeyType:'float';
DoubleKeyType:'double';
LongKeyType:'long';
Use:'use';

// 转义序列
fragment EscapeSequence
    : '\\' [btnfr\\"']            // 标准转义
    | '\\' [0-7]+             // 八进制转义
    | '\\' 'x' HexDigit HexDigit? // 十六进制转义  
    | '\\' 'u' HexDigit HexDigit HexDigit HexDigit        // Unicode转义
    | '\\' 'U' HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit        // 长Unicode转义
    | '\\' 'u{' HexDigit+ '}'     // Unicode码点转义
    ;

fragment UnicodeEscape: 'u' HexDigit HexDigit HexDigit HexDigit;
fragment HexDigit: [0-9a-fA-F];

DocFilePath:[a-zA-Z_]+;
FieldValue: [a-zA-Z_]+;
Commentary : '//' ~[\r\n]* ('\r'? '\n')?;
RegexPattern:[.]+;
DoubleQuotes:'"';
Integer: '0'|([-+]?[1-9][0-9]*);
FloatExponent:[eE]([-+])?[0-9]+;
Float:(([-+])?[0-9]+FloatExponent?)|(([-+])?[0-9]*'.'[0-9]+FloatExponent);
String : DoubleQuotes (EscapeSequence | ~[\\"\r\n])+ DoubleQuotes;
VersionString: '1.' Integer '.' Integer;
DispatcherKeyString: '"' [a-z_:]+ '"';
DispatcherValue: [a-z_]+('['[a-z_:]+']')?;
Number: '-'? ([0-9]+ ('.' [0-9]+)?) | (([0-9]+)? ('.' [0-9]+));
PositiveInteger:[0-9]+;
ResourceLocationChar:[a-z0-9-_.]+;
ResourceLocation:ResourceLocationChar ':' ResourceLocationChar ('/' ResourceLocationChar+)*;

IdentContinue:(EscapeSequence|UnicodeEscape);
IdentStart:(EscapeSequence|UnicodeEscape);
Identifier:IdentStart IdentContinue;

TypedNumber: (Integer([bBsSlL])?)|(Float([dDfF])?);

PathSegment:Identifier|'super';
Path: PathSegment?(DoubleColon DocFilePath)+;

AccessorKey:'%key' | Identifier | String | '%parent';
Accessor:AccessorKey (AccessorKey.)*;
DynamicIndex:'['Accessor']';
StaticIndexKey:'%fallback'| Identifier | String | ResourceLocation | '%none' | '%unknown';