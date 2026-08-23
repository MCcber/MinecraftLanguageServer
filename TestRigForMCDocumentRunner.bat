cd /d "%~dp0"
java -cp ".;.\MCDocumentRuleToken\Parser\Java;.\MCDocumentRuleToken\Lexer\Java;.\antlr-4.13.2-complete.jar;" org.antlr.v4.gui.TestRig mcdocParser file -tokens -gui < code.mcdoc
exit /b 0