package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getReport() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/SparkReport.html");
            reporter.config().setDocumentTitle("Automation Test Report");
            reporter.config().setReportName("Web Automation Framework Report");
            reporter.config().setTheme(Theme.DARK); // 🎨 Set dark theme

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Your Name");
        }
        return extent;
    }
}
