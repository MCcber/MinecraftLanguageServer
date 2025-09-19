namespace MinecraftLanguageServer.Model.MCFunction
{
    /// <summary>
    /// 补全成员属性
    /// </summary>
    public partial class CompletedItemData
    {
        /// <summary>
        /// 是否补全了复合型选择器参数
        /// </summary>
        public bool IsCompoundSelectorParameter = false;

        public object Content
        {
            get;
            set;
        } = "";

        public object Description
        {
            get;
            set;
        } = "";

        public string Text { get; set; } = "";
    }
}
