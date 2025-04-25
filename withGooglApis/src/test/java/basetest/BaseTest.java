package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;
    protected static List<String> tabs;

    @BeforeClass
    public static void setUp() {
        try {
            // Set up Extent Reports
            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(spark);
            test = extent.createTest("Base Test Setup", "Initializing WebDriver");

            // Attach to existing Chrome session
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("debuggerAddress", "127.0.0.1:9223");
            
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            
            // Initialize tabs list
            tabs = new ArrayList<>(driver.getWindowHandles());

            test.info("Connected to existing Chrome session successfully.");
        } catch (Exception e) {
            if (test != null) {
                test.fail("WebDriver setup failed: " + e.getMessage());
            }
            throw new RuntimeException("WebDriver initialization failed.", e);
        }
    }

    public static void openNewTab(String url) {
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        driver.get(url);
        tabs = new ArrayList<>(driver.getWindowHandles());
    }

    public static void switchToTab(int index) {
        if (index < tabs.size()) {
            driver.switchTo().window(tabs.get(index));
        }
    }

    @AfterClass
    public static void tearDown() {
        try {
            if (driver != null) {
                driver.quit();
                test.info("WebDriver session closed.");
            }
        } catch (Exception e) {
            if (test != null) {
                test.fail("Error while closing WebDriver: " + e.getMessage());
            }
        } finally {
            if (extent != null) {
                extent.flush();
            }
        }
    }
}
