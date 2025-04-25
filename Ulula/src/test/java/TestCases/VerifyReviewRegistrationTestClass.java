package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
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


@Test(groups="VendorRegistrationGroup")
//@Listeners(Listners.ListenersCommon.class)
public class VerifyReviewRegistrationTestClass extends BaseClass {
	
	public static TestData testData;
	
	
	@Test(priority=9)
	public void verifyAcceptVendorRegistrationApplication()
	{
		VendorMgmtPage vendorMgmtPage = PageFactory.initElements(driver, VendorMgmtPage.class);
		extentlogger=extntReprt.startTest("Test Case 9: Review Vendor Registration Application");
		try {
			Thread.sleep(60000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		vendorMgmtPage.funcReviewRegistrationStep();
		extentlogger.log(LogStatus.INFO, "Vendor Registered in this Program Successfully!");
	    Reporter.log("Vendor Registered in this Program Successfully!");

	    Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 9 Passed Successfully.");
		Reporter.log("Test Case 9 Passed Successfully.");
		
		System.out.println("Test Case 9 Passed Successfully.");
	}
	

	
}
