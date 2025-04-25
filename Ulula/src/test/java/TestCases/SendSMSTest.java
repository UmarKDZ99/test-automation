package TestCases;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;

public class SendSMSTest {
	
	//static AndroidDriver<MobileElement> driver;
	private AndroidDriver driver;
    private String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.7.1/TheApp-v1.7.1.apk";
    private String PHONE_NUMBER = "+13474804132";
    
	@BeforeTest
	public void setup()
	{
		try 
		{
			
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		desiredCapabilities.setCapability("deviceName", "Mi A3");
//		//desiredCapabilities.setCapability("udid", "8ec53754a041");
//		desiredCapabilities.setCapability("automationName", "UIAutomator2");
//		desiredCapabilities.setCapability("platformName", "Android");
//		desiredCapabilities.setCapability("platformVersion", "11");
//		desiredCapabilities.setCapability("adbExecTimeout", 0);
//		desiredCapabilities.setCapability("newCommandTimeout", 0);
//		desiredCapabilities.setCapability("appPackage", "com.android.mms");
//		desiredCapabilities.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
//		desiredCapabilities.setCapability("avd", "Pixel_XL_API_30_Ahmad");
//		
//	
		
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "Android Emulator");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		desiredCapabilities.setCapability("app", APP);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
		
		System.out.println("Application started successfully :) ");
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	@Test
    public void testPhoneCall() throws InterruptedException {
        // do something in our app
        driver.findElementByAccessibilityId("Login Screen").click();

        // receive and accept a call
        driver.makeGsmCall("+13474804132", GsmCallActions.CALL);
        Thread.sleep(2000); // pause just for effect
        driver.makeGsmCall("+13474804132", GsmCallActions.ACCEPT);

        // continue to do something in our app
        driver.findElementByAccessibilityId("username").sendKeys("hi");
        Thread.sleep(2000); // pause just for effect

        // end the call
        driver.makeGsmCall("+923454654660", GsmCallActions.CANCEL);
        Thread.sleep(2000); // pause just for effect
    }
	@Test
//	public void mainTEST()
//	{
//		AppiumDriver driver = MobileDriverFactory.getDriver()
//				driver.makeGsmCall("+923454654660", GsmCallActions.CALL);
//
//				driver.sendSMS("+13474804132", "Hey lol");
//	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
