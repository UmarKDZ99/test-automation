package basetest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExtentManager;

@Listeners(listeners.TestListener.class)
public class BaseTest {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        extent = ExtentManager.getReport(); 
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
        if (extent != null) {
            extent.flush(); 
        }
    }

  
    public WebDriver getDriver() {
        return driver;
    }
}
