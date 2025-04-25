package Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.ConfigReaderHelper;
import Utilities.UtilClass;

public class ListenersCommon extends UtilClass implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		System.setProperty("org.uncommons.reportng.title", "Ulula Automation Test Report");
		extentlogger=extntReprt.startTest("Test Method is : " + result.getName()); // Logs for Extent Report 
		Reporter.log("Test Method is : " +  result.getName()); // Logs for ReportNG 
		System.out.println("Test Cases Start through Listener and details are: "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of Test Execution is (Success) : " +  result.getStatus());  // Logs for ReportNG 
		System.out.println("Test Cases Success through Listener and details are: "+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {

		try {
			String picturePath = getScreenshot();
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			String image= extentlogger.addScreenCapture(picturePath);
			extentlogger.log(LogStatus.FAIL,result.getName(),image); // Logs for Extent Report 
			Reporter.log("<a href='\'" +picturePath + "> Test Results</a>");   // Logs for ReportNG 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test Cases Failed through Listener and details are: "+ result.getName() );
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Cases Skipped through Listener and details are: "+ result.getName() );
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
