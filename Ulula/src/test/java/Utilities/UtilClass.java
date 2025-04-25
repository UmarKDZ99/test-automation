package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Common.BaseClass;
import Helper.ConfigReaderHelper;

public class UtilClass extends BaseClass{

	
	public String getScreenshot() throws IOException
	{
		config= new ConfigReaderHelper();
		Date currentDate= new Date();
		String screenshotFileName= currentDate.toString().replace(" ", "-").replace(":","-"); // for date to concatenate with screenshot name
		File screenshotFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(config.getSreenShotPathFromConfig()+screenshotFileName+".png"));
		
		
		return config.getSreenShotPathFromConfig()+screenshotFileName+".png";
	}
	
	
}
