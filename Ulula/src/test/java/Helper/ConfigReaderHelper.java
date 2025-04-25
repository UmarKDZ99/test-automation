package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReaderHelper {

	public Properties pro;
	
	public void configReader()
	{
		try 
		{
			File src = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Automation\\Ulula Test\\src\\test\\java\\Configuration\\config.property");
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Exception is = " + e.getMessage());
		}
		
	}
	
	
	public String getURLFromConfig()   // to get Application URL from config file
	{
		return pro.getProperty("URL");
	}
	
	public String getUsernameFromConfig()   // to get Application Username for login from config file
	{
		return pro.getProperty("UserName");
	}
	
	public String getPasswordFromConfig()   // to get Application Password for login from config file
	{
		return pro.getProperty("Password");
	}
	
	public String getExcelPathFromConfig()   // to get External file path from config file
	{
		return pro.getProperty("ExcelPath");
	}
	
	public String getSreenShotPathFromConfig()   // to get SreenShot folder path from config file
	{
		return pro.getProperty("SreenShotPath");
	}
	
	public String getExtentReportPathFromConfig()   // to get Extent Reports path from config file
	{
		return pro.getProperty("ExtentReportPath");
	}
	
}
