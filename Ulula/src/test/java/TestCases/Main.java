package TestCases;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Common.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Main {
	
	static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup()
	{
		try 
		{
			
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "Mi A3");
		//desiredCapabilities.setCapability("udid", "8ec53754a041");
		desiredCapabilities.setCapability("automationName", "UIAutomator2");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "11");
		desiredCapabilities.setCapability("adbExecTimeout", 0);
		desiredCapabilities.setCapability("newCommandTimeout", 0);
		desiredCapabilities.setCapability("appPackage", "io.ionic.owlyfield");
		desiredCapabilities.setCapability("appActivity", ".MainActivity");
		desiredCapabilities.setCapability("avd", "Pixel_XL_API_30_Ahmad");
		// desiredCapabilities.setCapability("avd", "Nexus_9_API_30_Ahmad_Tab");
		desiredCapabilities.setCapability("app", "D:\\Owlyfield.apk");
		// desiredCapabilities.setCapability("automationName", "UIAutomator2");
		// desiredCapabilities.setCapability("avd", "Pixel_XL_API_30_Ahmad_Device");
	//	desiredCapabilities.setCapability("app", "D:\\Owlyfield.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
		
		System.out.println("Application started successfully :) ");
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
