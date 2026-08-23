cd /d "%~dp0"
java -jar antlr-4.13.2-complete.jar -o .\MCFunctionRuleToken\Lexer\C# %cd%\MCFunctionRule\MCCommandLexer.g4
java -jar antlr-4.13.2-complete.jar -lib .\MCFunctionRuleToken\Lexer\C# -o .\MCFunctionRuleToken\Parser\C# %cd%\MCFunctionRule\MCCommandParser.g4

@REM java -cp ".;.\MCFunctionRuleToken\Lexer\Java;.\MCFunctionRuleToken\Parser\Java;.\antlr-4.13.2-complete.jar;" org.antlr.v4.gui.TestRig mcdoc file -tokens -gui < code.mcdoc