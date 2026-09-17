using System;
using System.Windows;

namespace ExilonTracker
{
    public partial class MainWindow : Window
    {
        private readonly EngineMonitor _monitor;

        public MainWindow()
        {
            InitializeComponent();
            _monitor = new EngineMonitor();
            LoadStudioInfo();
        }

        private void LoadStudioInfo()
        {
            TxtEngineVersion.Text = $"Engine Version: {Config.EngineVersion}";
            TxtStatus.Text = $"Durum: {Config.StudioStatus}";
            TxtArchitecture.Text = $"Mimari: {(Environment.Is64BitProcess ? "x64" : "x32")}";

            LstLogs.Items.Add($"[{DateTime.Now:HH:mm:ss}] Exilon Tracker Başlatıldı.");
            LstLogs.Items.Add($"[{DateTime.Now:HH:mm:ss}] Mimari: {(Environment.Is64BitProcess ? "64-Bit" : "32-Bit")}");
            LstLogs.Items.Add($"[{DateTime.Now:HH:mm:ss}] Resmi Açıklama Yüklendi.");
        }

        private void BtnOpenReadme_Click(object sender, RoutedEventArgs e)
        {
            WebNavigator.OpenUrl(Config.GithubReadmeUrl);
        }

        private void BtnOpenForm_Click(object sender, RoutedEventArgs e)
        {
            WebNavigator.OpenUrl(Config.GoogleFormUrl);
        }
    }
}
