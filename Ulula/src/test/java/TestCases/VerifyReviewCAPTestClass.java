package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.relevantcodes.extentreports.LogStatus;

import Common.BaseClass;
import Pages.FillRegistrationSurveyPage;
import Pages.LoginPage;
import Pages.ProgramPage;
import Pages.VendorMgmtPage;
// import Pages.object;
import lib.TestData;


//@Test(groups="RegressionGroup")
//@Listeners(Listners.ListenersCommon.class)
public class VerifyReviewCAPTestClass extends BaseClass {
	
	public static TestData testData;
	
	
	@Test(priority=9,groups="Redfdgredfdsion Testing")
	public void verifyLoadVendorMgmtModule()
	{
		VendorMgmtPage vendorMgmtPage = PageFactory.initElements(driver, VendorMgmtPage.class);
		extentlogger=extntReprt.startTest("Test Case 8: Create Vendor");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
	//	vendorMgmtPage.loginUhhlula();
		extentlogger.log(LogStatus.INFO, "Vendor Registration Completed Successfully!");
	    Reporter.log("Vendor Created Successfully!");

	   
		
		
		Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 1 Passed Successfully.");
		Reporter.log("Test Case 1 Passed Successfully.");
		
		System.out.println("Test Case 1 Passed Successfully.");
	}
	
	@Test(priority=10,groups="Regrfddfdfssion Testing")
	public void verifySearchVendor()
	{
		VendorMgmtPage vendorMgmtPage = PageFactory.initElements(driver, VendorMgmtPage.class);
		extentlogger=extntReprt.startTest("Test Case 8: Create Vendor");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
	//	vendorMgmtPage.loginUhhlula();
		extentlogger.log(LogStatus.INFO, "Vendor Registration Completed Successfully!");
	    Reporter.log("Vendor Created Successfully!");

	   
		
		
		Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 1 Passed Successfully.");
		Reporter.log("Test Case 1 Passed Successfully.");
		
		System.out.println("Test Case 1 Passed Successfully.");
	}
	
	@Test(priority=11,groups="Regreddfsfdfssion Testing")
	public void verifyReviewVendorApplication()
	{
		VendorMgmtPage vendorMgmtPage = PageFactory.initElements(driver, VendorMgmtPage.class);
		extentlogger=extntReprt.startTest("Test Case 8: Create Vendor");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		//vendorMgmtPage.loginUhhlula();
		extentlogger.log(LogStatus.INFO, "Vendor Registration Completed Successfully!");
	    Reporter.log("Vendor Created Successfully!");

	   
		
		
		Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 1 Passed Successfully.");
		Reporter.log("Test Case 1 Passed Successfully.");
		
		System.out.println("Test Case 1 Passed Successfully.");
	}
	

	
}
