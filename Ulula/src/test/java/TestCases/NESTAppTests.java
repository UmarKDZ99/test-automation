package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

@Test(groups="FillGuidingSurveyFromApp")
public class NESTAppTests extends Main {

	@Test(priority=1,description="This is user journey survey app test")
	public void TestOne() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement start= driver.findElement(By.xpath("//android.widget.Button[@text='Start']"));
		
		start.click();
		
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='']")).sendKeys("ahmad.d@ulula.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']")).click();
		//driver.context("WEBVIEW_io.ionic.owlyfield");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@resource-id='background-content']")));
		    
		//android.app.Dialog
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Image[@text='search sharp']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//android.app.Dialog[@text='']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@text='']")));
		driver.findElement(By.xpath("//android.widget.EditText[@text='']")).sendKeys("14th ");
		driver.findElement(By.xpath("//android.view.View[@text='14th October 2020 Ahmad Guiding survey']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
			//List<MobileElement> li = driver.findElementsByClassName("android.widget.EditText");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//li.get(0).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).click();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("Ahmad First Vendor");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[112,598][1333,714]']")).click();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			//driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();
		
		driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[112,402][1333,518]']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@bounds='[140,392][1312,539]']")));
		driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[140,392][1312,539]']")).click();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.view.View")));
		driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[140,392][1312,539]']")).sendKeys("Ahmad First Vendor");
		Thread.sleep(5000);
		driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[140,392][1312,539]']")).clear();
		driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[140,392][1312,539]']")).sendKeys("Ahmad First Vendor");
		Thread.sleep(1000);
		driver.findElement(By.xpath ("//android.widget.EditText[@bounds='[112,598][1333,714]']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();
		
		
		// Question categories screen
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@bounds='[0,280][1440,472]']")));
		driver.findElement(By.xpath ("//android.view.View[@bounds='[0,280][1440,472]']")).click();  // Click on Categories Question
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text='Q1. Ahmad CAP survey MCQ, 2 options Alpha']")));
		driver.findElement(By.xpath ("//android.view.View[@text='Q1. Ahmad CAP survey MCQ, 2 options Alpha']")).click();
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q1: Ahmad CAP survey MCQ, 2 options Alpha']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Yes']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='No']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='No']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q2: Ahmad CAP survey MCQ with File, 2 options']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='100']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='qwerty']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='100']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q3: Please share your feedback regarding Progress tracker.']") ).isDisplayed() && driver.findElement( By.xpath("//android.widget.EditText[@text='']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.widget.EditText[@text='']")).sendKeys("Ahmad's feeback answer for progress tracker question.");
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q4: Please select one option below:']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='567']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='765']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='657']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='765']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q5: Please share your details regarding your current state']") ).isDisplayed() && driver.findElement( By.xpath("//android.widget.EditText[@text='']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.widget.EditText[@text='']")).sendKeys("Ahmad's current state answer.");
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q6: Please select multiple Performance indicators']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Poor']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Normal']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Good']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Excellent']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Extraordinary']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Phenomenal']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='Normal']")).click();
			driver.findElement(By.xpath ("//android.view.View[@text='Excellent']")).click();
			driver.findElement(By.xpath ("//android.view.View[@text='Extraordinary']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q1: Ahmad Guiding survey MCQ, 3 options']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='23']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='76']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Fourty seven']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='Fourty seven']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q2: Ahmad Guiding survey MCQ with file, 3 options']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='123']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='223']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='332']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='223']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q3: Please select multiple fruits']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Mango']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Orange']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Apple']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Melon']") ).isDisplayed() && driver.findElement( By.xpath("//android.view.View[@text='Banana']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.view.View[@text='Mango']")).click();
			driver.findElement(By.xpath ("//android.view.View[@text='Apple']")).click();
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath ("//android.widget.Button[@text='Next']")).click();
		}
		
		if(driver.findElement( By.xpath("//android.view.View[@text='Q4: Please share your feedback regarding Guiding survey']") ).isDisplayed() && driver.findElement( By.xpath("//android.widget.EditText[@text='']") ).isDisplayed())
		{
			driver.findElement(By.xpath ("//android.widget.EditText[@text='']")).sendKeys("Ahmad's Guiding survey's feedback answer.");
			driver.findElement(By.xpath ("//android.widget.Button[@text='Save']")).click();
			Thread.sleep(1000);
			
		}
		
		driver.navigate().back();
		//driver.findElement(By.xpath ("//android.view.View[@text="+ Var+"]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='cloud upload outline Upload Results']")));
		driver.findElement(By.xpath("//android.widget.Button[@text='cloud upload outline Upload Results']")).click();  // Upload Results button
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='YES, UPLOAD']")));
		driver.findElement(By.xpath("//android.widget.Button[@text='YES, UPLOAD']")).click();
	}
	
}
