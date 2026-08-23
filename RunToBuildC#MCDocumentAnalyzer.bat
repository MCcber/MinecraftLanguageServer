
cd /d "%~dp0"
set "ANTLR_JAR=%~dp0antlr-4.13.2-complete.jar"

del /q /s "..\MCDocumentRuleToken\Lexer\C#\*.*" 2>nul
del /q /s "..\MCDocumentRuleToken\Parser\C#\*.*" 2>nul

cd MCDocumentRule
java -jar "%ANTLR_JAR%" -o "..\MCDocumentRuleToken\Lexer\C#" "mcdocLexer.g4"
java -jar "%ANTLR_JAR%" -lib "..\MCDocumentRuleToken\Lexer\C#" -o "..\MCDocumentRuleToken\Parser\C#" -visitor "mcdocParser.g4"

pause