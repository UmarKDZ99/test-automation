package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Common.BaseClass;

public class BrowserFactoryHelper extends BaseClass{

	//static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\OneDrive\\Desktop\\Automation\\Ulula Test\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();  // it will maximize the browser window
		driver.get(url);
		
		return driver;
		
	}
	
	
}
