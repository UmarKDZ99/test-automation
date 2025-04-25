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
import Pages.LoginPage;
import Pages.ProgramPage;
// import Pages.object;
import lib.TestData;


@Test(groups="ProgramSetup")
//@Listeners(Listners.ListenersCommon.class)
public class ProgramTestClass extends BaseClass {
	
	public static TestData testData;
	
	
	@Test(priority=1,groups="Regression Testing")
	public void createProgramAndPhase()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 1: Create a Program & Phase");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://dev.ulula.app/programs");
		
		
		programPage.AddNewProgram();
		programPage.CreateNewProgram(testData.getExcelTestData(0, 1, 1), testData.getExcelTestData(0, 2, 1));
	    extentlogger.log(LogStatus.INFO, "Program Created Successfully!");
	    Reporter.log("Program Created Successfully!");

	    programPage.AddNewPhase();
		programPage.CreateNewPhase(testData.getExcelTestData(0, 4, 1), testData.getExcelTestData(0, 5, 1));
	    
	    extentlogger.log(LogStatus.INFO, "Phase Created Successfully!");
	    Reporter.log("Phase Created Successfully!");
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		
		Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 1 Passed Successfully.");
		Reporter.log("Test Case 1 Passed Successfully.");
		
		System.out.println("Test Case 1 Passed Successfully.");
	}
	
	@Test(priority=2,groups="Regression Testing")
	public void createRegistrationStep()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 2: Create Registration Step");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		// 
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")));
//		 driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")).click();
//		    driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[3]/div/header/div[2]/span/i")).click();
//		    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
//		    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
//		    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Registration Step");
//		    driver.findElement(By.xpath("//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea")).click();
//		    driver.findElement(By.xpath("//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea")).clear();
//		    driver.findElement(By.xpath("//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea")).sendKeys("Registration Step");
//		    driver.findElement(By.xpath("//div[@id='contentIdForA11y2']/div/div[2]/div/div[2]/div/label/span")).click();
//		    driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
//		    
//		    driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
//		    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("14th October 2020 - Ahmad- Web");
//		    try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(Keys.DOWN);
//		    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(Keys.ENTER);
//		    driver.findElement(By.xpath("//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[3]/div/div/div/div/div/div/label/span")).click();
//		    driver.findElement(By.xpath("//input[@type='number']")).click();
//		    driver.findElement(By.xpath("//input[@type='number']")).click();
//		    driver.findElement(By.xpath("//input[@type='number']")).clear();
//		    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
//		    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
			programPage.funcCreateRegistrationStep(testData.getExcelTestData(0, 7, 1), testData.getExcelTestData(0, 8, 1));
		    extentlogger.log(LogStatus.INFO, "Registration Step Created Successfully with all its configuration settings!");
		    Reporter.log("Registration Step Created Successfully with all its configuration settings!");
		   
//		    try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    
//		    
		
		// 
		Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 2 Passed Successfully.");
		Reporter.log("Test Case 2 Passed Successfully.");
		
		System.out.println("Test Case 2 Passed Successfully.");
	}
	
	@Test(priority=3,groups="Regression Testing", dependsOnMethods="createRegistrationStep")
	public void ReviewRegistration()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 3: Create Review Registration Step");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		
	//  REview Registration start
		
		
		
		
//		WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i"));
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//
//	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")));
//	  //  driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")).click();
//	    driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[4]/div/header/div[2]/span/i")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Review Registration");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")).sendKeys("Review Registration");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[2]/div/div/div/label/span)[9]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[2]")).click();
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[10]")));
//	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).click();
//	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Registration");
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(Keys.DOWN);
//	    driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[3]/div/div/div/div/div/div/label/span)[3]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[5]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[5]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='number'])[5]")).sendKeys("1");
//	    
//	    try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Review Registration");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")).sendKeys("Review Registration");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[2]/div/div/div/label/span)[9]")).click();
//	    
//	    
	    
	    
	//    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		programPage.funcCreateReviewRegistrationStep(testData.getExcelTestData(0, 9, 1), testData.getExcelTestData(0, 10, 1));
	    extentlogger.log(LogStatus.INFO, "Review Registration Step Created Successfully with all relevant configurations!");
	    Reporter.log("Review Registration Step Created Successfully with all relevant configurations!");
	    
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
	    
	    Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 3 Passed Successfully.");
		Reporter.log("Test Case 3 Passed Successfully.");
	}

	@Test(priority=4,groups="Regression Testing" , dependsOnMethods="ReviewRegistration")
	public void GuidingStep()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 4: Create Guiding Survey Step");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		
		 // Guiding step starts from here
		  //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[5]/div/header/div[2]/span/i")));
//		WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i"));
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
//		// driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")).click();
//		    driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[5]/div/header/div[2]/span/i")).click();
//		    try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    
//		    driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
//		    driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
//		    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Guiding Step");
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")).click();
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")).clear();
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")).sendKeys("Guiding Step");
//		   
//		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[13]")));
//		    driver.findElement(By.xpath("(//input[@type='text'])[13]")).click();
//		    driver.findElement(By.xpath("(//input[@type='text'])[13]")).clear();
//		    driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("14th OCtober 2020 Ahmad Guiding");
//		    try {
//				Thread.sleep(6000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys(Keys.DOWN);
//		    driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys(Keys.ENTER);
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[3]/div/div/div/div/div/div/label/span)[13]")).click();
//		    driver.findElement(By.xpath("(//input[@type='number'])[7]")).click();
//		    driver.findElement(By.xpath("(//input[@type='number'])[7]")).clear();
//		    driver.findElement(By.xpath("(//input[@type='number'])[7]")).sendKeys("1");
//		    
//		    try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    
//		    driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
//		    driver.findElement(By.xpath("(//input[@type='text'])[12]")).clear();
//		    driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Guiding Step");
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")).click();
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")).clear();
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")).sendKeys("Guiding Step");
//		    
		    
//		    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[4]/div/div/button/span)[7]")).click();
//		    
//		 //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Successfully Created Step')]")));
		
			programPage.funcCreateGuidingStep(testData.getExcelTestData(0, 11, 1), testData.getExcelTestData(0, 12, 1));
		    extentlogger.log(LogStatus.INFO, "Guiding Step Created Successfully with all its configuration settings!");
		    Reporter.log("Guiding Step Created Successfully with all its configuration settings!");
		    
//		    try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		    
		    Assert.assertTrue(true);
			extentlogger.log(LogStatus.PASS, "Test Case 4 Passed Successfully.");
			Reporter.log("Test Case 4 Passed Successfully.");
	}
	
	@Test(priority=5,groups="Regression Testing", dependsOnMethods="GuidingStep")
	public void ReviewGuiding()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 5: Create Review Guiding Step");
//		WebDriverWait wait = new WebDriverWait(driver, 80);
//		
//	//  Review Guiding starts from here
//	    
//		WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i"));
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//		
//	   // driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")).click();
//	    driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[6]/div/header/div[2]/span/i")).click();
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[16]")));
//	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("Review Guiding");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")).sendKeys("Review Guiding");
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")));
//	    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")).click();
//	    
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3])[4]")).click();
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[4]")));
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[4]")).click();
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[18]")));
//	    driver.findElement(By.xpath("(//input[@type='text'])[18]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[18]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys("Guiding");
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys(Keys.DOWN);
//	    driver.findElement(By.xpath("(//input[@type='text'])[18]")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[3]/div/div/div/div/div/div/label/span)[7]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[11]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[11]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='number'])[11]")).sendKeys("1");
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys("Review Guiding");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")).sendKeys("Review Guiding");
//	    
	    // again
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")));
//	    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")).click();
	    
	//    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[4]/div/div/button/span)[4]")).click();
		programPage.funcCreateReviewGuidingStep(testData.getExcelTestData(0, 13, 1), testData.getExcelTestData(0, 14, 1));
		extentlogger.log(LogStatus.INFO, "Review Guiding Step Created Successfully with all required configuration!");
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
	    Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 5 Passed Successfully.");
	}
	
	@Test(priority=6,groups="Regression Testing", dependsOnMethods="ReviewGuiding")
	public void CAPStep()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 6: Create CAP Survey Step");
//		WebDriverWait wait = new WebDriverWait(driver, 80);
//		
//		//CAP Step starts from here
//	   // driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")).click();
//		WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i"));
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//		
//	    driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[7]/div/header/div[2]/span/i")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[20]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[20]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[20]")).sendKeys("CAP Step");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")).sendKeys("CAP Step");
//	   
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[21]")));
//	    driver.findElement(By.xpath("(//input[@type='text'])[21]")).click();	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[21]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[21]")).sendKeys("14th OCtober 2020_Ahmad CAP");
//	    
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    driver.findElement(By.xpath("(//input[@type='text'])[21]")).sendKeys(Keys.DOWN);
//	    driver.findElement(By.xpath("(//input[@type='text'])[21]")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.xpath("(//input[@type='text'])[20]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[20]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[20]")).sendKeys("CAP Step");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")).sendKeys("CAP Step");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[3]/div/div/div/div/div/div/label/span)[25]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[13]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[13]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='number'])[13]")).sendKeys("1");
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
	   // driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[4]/div/div/button/span)[13]")).click();
		programPage.funcCreateCAPStep(testData.getExcelTestData(0, 15, 1), testData.getExcelTestData(0, 16, 1));
		extentlogger.log(LogStatus.INFO, "CAP Step Created Successfully with all relevant configuration settings!");
	    
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
	    Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 6 Passed Successfully.");
	}
	
	@Test(priority=7,groups="Regression Testing", dependsOnMethods="CAPStep")
	public void ReviewCAP()
	{
		ProgramPage programPage = PageFactory.initElements(driver, ProgramPage.class);
		testData = new TestData(config.getExcelPathFromConfig());
		extentlogger=extntReprt.startTest("Test Case 7: Create Review CAP Step");
		//WebDriverWait wait = new WebDriverWait(driver, 80);
		
		 // Review CAP starts from here
	  //  driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")).click();
		
//		WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i"));
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//	    driver.findElement(By.xpath("//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[8]/div/header/div[2]/span/i")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[24]")).click();
//	    driver.findElement(By.xpath("(//input[@type='text'])[24]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[24]")).sendKeys("Review CAP");
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[6]")).click();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[6]")).clear();
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[6]")).sendKeys("Review CAP");
//	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/label[1]/span[1]")));
//	    driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/label[1]/span[1]")).click();
//	    
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[6]")).click();
//	   
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[26]")));
//	    driver.findElement(By.xpath("(//input[@type='text'])[26]")).click();	    
//	    driver.findElement(By.xpath("(//input[@type='text'])[26]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='text'])[26]")).sendKeys("CAP");
//	    
//
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    driver.findElement(By.xpath("(//input[@type='text'])[26]")).sendKeys(Keys.DOWN);
//	    driver.findElement(By.xpath("(//input[@type='text'])[26]")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[3]/div/div/div/div/div/div/label/span)[11]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[17]")).click();
//	    driver.findElement(By.xpath("(//input[@type='number'])[17]")).clear();
//	    driver.findElement(By.xpath("(//input[@type='number'])[17]")).sendKeys("1");
//	    
//
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
//	    driver.findElement(By.xpath("(//button[@type='button'])[19]")).click();
//	    driver.findElement(By.xpath("//div[@id='app']/div/header/div/div[2]/a/span")).click();
		programPage.funcCreateReviewCAPStep(testData.getExcelTestData(0, 17, 1), testData.getExcelTestData(0, 18, 1));
		extentlogger.log(LogStatus.INFO, "Review CAP Step Created Successfully with all required configuration settings!");

//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    Assert.assertTrue(true);
		extentlogger.log(LogStatus.PASS, "Test Case 7 Passed Successfully.");
	}

//	@Test(priority=1,groups="Regression", dataProvider="programConfigurationData",description="This is user journey of Web", retryAnalyzer=Common.Retry.class)
//	public void testWebOne()
//	{
//		
//		extentlogger.log(LogStatus.INFO, "Vendor Page loaded successfully");
//		extentlogger.log(LogStatus.INFO, "Application is up and running");
//		
//		Assert.assertTrue(true);
//		extentlogger.log(LogStatus.PASS, "Bla bla Feature verified");
//		
//		System.out.println("Test 1");
//	}
//	
//	@Test(priority=2,groups="Regression", dataProvider="programConfigurationData", description="This is user journey of Web", retryAnalyzer=Common.Retry.class, dependsOnMethods="testWebOne")  //  dependsOnMethods is used for Hard dependency, this test will be skipped if first test case will fail
//	public void testWebTwo()
//	{
//		
//		
//		System.out.println("Test 1");
//	}
//	
//	@Test(priority=2,groups="Regression",description="This is user journey of Web", retryAnalyzer=Common.Retry.class, dependsOnMethods="testWebOne",alwaysRun=true)  //  "dependsOnMethods" with combination of "alwaysRun=true" is used for soft dependency, this test will still run if first test case will fail. But running of firt test is must either test passes or fail.
//	public void testWebThree()
//	{
//		
//		
//		System.out.println("Test 1");
//	}
	
//	@DataProvider(name="programConfigurationData")             // for data driven testing
//	public Object[][] passExcelTestData()
//	{
//		TestData testData = new TestData(config.getExcelPathFromConfig());
//		int rows =testData.getRowCount(0);
//		Object[][] data= new Object[rows][2];
//		
//		for(int i=0; i< rows; i++)
//		{
//			data[i][0]= testData.getExcelTestData(0, i, 0);
//			data[i][1]= testData.getExcelTestData(0, i, 1);
//		}
//		
//		return data;
//	}
	
}
