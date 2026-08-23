
using MinecraftLanguageServer.Service;

namespace MinecraftLanguageServer
{
    public class Program
    {
        public static void Main()
        {
            Task.Run(() =>
            {
                _ = new MCDocumentBuildService();
            });
            Task.Run(() =>
            {
                _ = new MCFunctionIntellisenseService();
            });
            Console.ReadKey();
            AppDomain.CurrentDomain.UnhandledException += CurrentDomain_UnhandledException;
        }

        private static void CurrentDomain_UnhandledException(object sender, UnhandledExceptionEventArgs e)
        {
            if (e.ExceptionObject is not Exception exception)
            {
                return;
            }
            Console.WriteLine(exception.Message);
            Console.ReadKey();
        }
    }
}
