package basetest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExtentManager;

public class BaseTest {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        extent = ExtentManager.getReport();
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
        if (extent != null) {
            extent.flush(); // 🔄 Flush the report
        }
    }

    // ✅ Added only this for listener access
    public WebDriver getDriver() {
        return driver;
    }
}
