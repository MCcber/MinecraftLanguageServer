namespace MinecraftLanguageServer.Model.MCFunction
{
    /// <summary>
    /// 自动补全数据上下文
    /// </summary>
    [Serializable]
    public class MCFunctionIntellisenseModel
    {
        /// <summary>
        /// 当前上下文的唯一标记码
        /// </summary>
        public string Uid { get; set; } = "";
        /// <summary>
        /// 命令路径
        /// </summary>
        public string CommandPath { get; set; } = "";
        /// <summary>
        /// 当前代码
        /// </summary>
        public string CurrentCode { get; set; } = "";

        /// <summary>
        /// 编码变量及标记
        /// </summary>
        public Tuple<string, string> IdentifierTuple = new("","");
    }
}
