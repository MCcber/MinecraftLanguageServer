using MinecraftLanguageServer.DataContext;

namespace MinecraftLanguageServer
{
    public class Program
    {
        public static void Main()
        {
            new MCDocumentBuildService();
            AppDomain.CurrentDomain.UnhandledException += CurrentDomain_UnhandledException;
        }

        private static void CurrentDomain_UnhandledException(object sender, UnhandledExceptionEventArgs e)
        {
            Exception? exception = e.ExceptionObject as Exception;
            if (exception is null)
            {
                return;
            }
            Console.WriteLine(exception.Message);
            Console.ReadKey();
        }
    }
}
