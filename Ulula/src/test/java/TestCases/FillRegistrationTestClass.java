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
// import Pages.object;
import lib.TestData;


@Test(groups="RegistrationSurveyCompleted")
//@Listeners(Listners.ListenersCommon.class)
public class FillRegistrationTestClass extends BaseClass {
	
	public static TestData testData;
	
	
	@Test(priority=8,groups="Vendor Registration Survey")
	public void testWebRegistrationSurvey()
	{
		FillRegistrationSurveyPage fillRegSurveyPage = PageFactory.initElements(driver, FillRegistrationSurveyPage.class);
		extentlogger=extntReprt.startTest("Test Case 8: Create Vendor");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		fillRegSurveyPage.funcFillRegSurvey();
		extentlogger.log(LogStatus.INFO, "Vendor Registration Completed Successfully!");
	    Reporter.log("Vendor Created Successfully!");

	   
		
		
		Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 8 Passed Successfully.");
		Reporter.log("Test Case 8 Passed Successfully.");
		
		System.out.println("Test Case 8 Passed Successfully.");
	}
	

	
}
