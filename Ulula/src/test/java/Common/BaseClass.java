package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Helper.BrowserFactoryHelper;
import Helper.ConfigReaderHelper;
import Pages.LoginPage;


//@Test(groups="RegressionGroup")
//@Listeners(Listners.ListenersCommon.class)
public class BaseClass {
	
	
	public static WebDriver driver=null;
	public static ConfigReaderHelper config;
//	public static ExtentReports extntReprt =new ExtentReports(config.getExtentReportPathFromConfig()); // Extent report path from Config Reader helper;
	public static ExtentReports extntReprt =new ExtentReports("D:\\Eclipse Workspace\\Ulula\\test-output\\FinalExtentReport.html"); // Extent report path from Config Reader helper;
	public static ExtentTest extentlogger;
	
//	@Test(priority=1,description="This is user journey of Web App")
//	public void testWebSkip()
//	{
//		SoftAssert softAssert = new SoftAssert();   // it will not stop execution in case of any statement fails
//		String ActualText="dff";
//		String ExpectedText="dff";
//		softAssert.assertEquals(ActualText, ExpectedText, "Title verification failed.");
//		softAssert.assertEquals(ActualText, ExpectedText, "Title verification failed.");
//		softAssert.assertAll();
//	}
	
	@BeforeSuite
	public void setupApplication() throws Exception
	{
		config= new ConfigReaderHelper();   // Object Repository
		config.configReader();
		Reporter.log("=========== Browser Session Started ==========", true);
		// This will launch Browser and specific URL
		driver= BrowserFactoryHelper.startBrowser("chrome", config.getURLFromConfig());  
		
		Reporter.log("=========== Application Started ==========", true);
		
		// Created Page Object using Page Factory
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  // POM with Factory
		
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("inputEmail")));
		
		// Call the method and Login application
		loginPage.loginUlula(config.getUsernameFromConfig(), config.getPasswordFromConfig());
//		extentlogger=extntReprt.startTest("Application is logged in.");
		
	}
	
	
	
	@AfterSuite
	public void closeApplication() throws Exception
	{
		extntReprt.endTest(extentlogger);
		extntReprt.flush();
		// driver.get(config.getExtentReportPathFromConfig());
		
		//driver.close();
	//	driver.quit();
		
		Reporter.log("=========== Browser Session End ==========", true);
		
	}
	
//	@Test(priority=1,description="This is user journey of Web" ,groups="Regression")
//	public void testWebOne()
//	{
//		
//		
//		System.out.println("Test 1");
//	}
//	
//	@Test(priority=2,description="This is user journey of Web" ,groups="Regression", enabled=false)  // enabled= false (it will skip the test case)
//	public void testWebTwo()
//	{
//		System.out.println("Test 2");
//	}
//	
//	@Test(priority=3,description="This is user journey of Web" ,groups= {"Regression", "Feature"})
//	public void testWebThree()
//	{
//		System.out.println("Test 3");
//	}
//	
//	@Test(priority=4,description="This is user journey of Web" ,groups= "Feature")
//	public void testWebFour()
//	{
//		System.out.println("Test 4");
//	}

}
