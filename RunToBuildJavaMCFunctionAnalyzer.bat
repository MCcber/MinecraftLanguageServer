set "IsNeedCompile=%~1"

if "%IsNeedCompile%"=="true" (
    java -jar antlr-4.13.2-complete.jar -o .\MCFunctionRuleToken\Lexer\Java %cd%\MCFunctionRule\MCCommandLexer.g4

    java -jar antlr-4.13.2-complete.jar -lib .\MCFunctionRuleToken\Lexer\Java -o .\MCFunctionRuleToken\Parser\Java %cd%\MCFunctionRule\MCCommandParser.g4

    javac -cp ".\antlr-4.13.2-complete.jar;." %cd%\MCFunctionRuleToken\Lexer\Java\*.java

    javac -cp ".\antlr-4.13.2-complete.jar;." %cd%\MCFunctionRuleToken\Parser\Java\*.java
)

java -cp ".;.\MCFunctionRuleToken\Lexer\Java;.\MCFunctionRuleToken\Parser\Java;.\antlr-4.13.2-complete.jar;" org.antlr.v4.gui.TestRig MCCommand executeRadical -tokens -gui < code.mcdoc