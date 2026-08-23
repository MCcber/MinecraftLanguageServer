using Antlr4.Runtime;

namespace MinecraftLanguageServer.Listener
{
    public class FileErrorListener(string fileName) : BaseErrorListener
    {
        public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            base.SyntaxError(output, recognizer, offendingSymbol, line, charPositionInLine, msg, e);
            Console.WriteLine($"崩溃，位置在文件: {fileName} | 第 {line} 行: {msg}");
            //直接抛出，终止进程
            throw new Exception($"Parsing failed in {fileName}");
        }
    }
}
