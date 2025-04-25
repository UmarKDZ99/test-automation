package basetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeClass
    public static void setUp() {
        try {
            // Setting up Extent Reports
            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(spark);
            test = extent.createTest("Base Test Setup", "Initializing WebDriver");

            // Setup WebDriver
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*"); // Prevents security restrictions

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();

            test.info("ChromeDriver launched successfully.");
        } catch (Exception e) {
            if (test != null) {
                test.fail("WebDriver setup failed: " + e.getMessage());
            }
            throw new RuntimeException("WebDriver initialization failed.", e);
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
                extent.flush(); // Ensure the report is saved
            }
        }
    }
}
