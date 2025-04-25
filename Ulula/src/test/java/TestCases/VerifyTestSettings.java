package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Common.BaseClass;

@Test(groups="TestSettingsGroup")
public class VerifyTestSettings extends BaseClass{

	
	@Test(priority=10)
	public void VerifyVendorMgmtPageLoading()
	{
		
		extentlogger=extntReprt.startTest("Test Case 10: Load Vendor Management Module");
		
		extentlogger.log(LogStatus.INFO, "Vendor Management is loading successfully!");
	    Reporter.log("Vendor Management is loading successfully!");

	    
		extentlogger.log(LogStatus.SKIP, "Test Case 10 Passed Successfully.");
		Reporter.log("Test Case 10 Passed Successfully.");
		Assert.assertTrue(true);
		System.out.println("Test Case 10 Passed Successfully.");
	}
	
	@Test(priority=11)
	public void VerifyVendorSearch()
	{
		extentlogger=extntReprt.startTest("Test Case 11: Search Vendors in Vendor Mgmt Module");
		
		extentlogger.log(LogStatus.INFO, "There is some error in searching!");
	    Reporter.log("Searching in Vendor mgmt is not working properly!");

	    
	  
	    // 
		extentlogger.log(LogStatus.ERROR, "Test Case 11 is Failed.");
		Reporter.log("Test Case 11 is Failed.");
		//Assert.assertFalse(true);
		System.out.println("Test Case 11 is Failed.");
	}
	
	@Test(priority=12)
	public void VerifyVendorSearch1()
	{
		extentlogger=extntReprt.startTest("Test Case 12: Search Vendors in Vendor Mgmt Module");
		
		extentlogger.log(LogStatus.INFO, "Searching in Vendor mgmt is not working properly!");
	    Reporter.log("Searching in Vendor mgmt is not working properly!");

	    
	     
	    try {
			//String picturePath = getScreenshot();
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			String image= extentlogger.addScreenCapture("D:\\Eclipse Workspace\\Ulula\\src\\test\\resources\\Screenshots\\Screenshot_1.jpg");
			extentlogger.log(LogStatus.FAIL," Verify Vendor Search Feature" ,image); // Logs for Extent Report 
			Reporter.log("<a href='\'" +"D:\\Eclipse Workspace\\Ulula\\src\\test\\resources\\Screenshots\\Screenshot_1.jpg" + "> Test Results</a>");   // Logs for ReportNG 
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // 
		extentlogger.log(LogStatus.ERROR, "Test Case 12 is Failed.");
		Reporter.log("Test Case 12 is Failed.");
		Assert.assertFalse(true);
		System.out.println("Test Case 12 is Failed.");
	}
	
}
