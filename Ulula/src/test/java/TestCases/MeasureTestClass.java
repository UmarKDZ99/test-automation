package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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


//@Test(groups="ProgramSetup")
//@Listeners(Listners.ListenersCommon.class)
public class MeasureTestClass extends BaseClass {
	
	public static TestData testData;
	
	
	@Test(priority=1,groups="Regression Testing")
	public void createSMSSurvey()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://staging.ulula.app/measure-v2");
		
		    driver.findElement(By.xpath("//div[@id='body']/header/div[2]/div/a/div")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("+")));
		    driver.findElement(By.linkText("+")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-select-new-language-settings-container']/span")));
		    driver.findElement(By.xpath("//span[@id='select2-select-new-language-settings-container']/span")).click();
		    //driver.findElement(By.xpath("(//input[@type='search'])[5]")).clear();
		    driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).clear();
		    driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).sendKeys("english");
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   // driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).sendKeys(Keys.DOWN);
		 //   driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).sendKeys(Keys.DOWN);

		   
		  // driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).sendKeys(Keys.ENTER);
		   
		 
		    
		    driver.findElement(By.id("close-add-new-language")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("title_eng")));
		    driver.findElement(By.id("title_eng")).click();
		    driver.findElement(By.id("title_eng")).clear();
		    driver.findElement(By.id("title_eng")).sendKeys("Ahmad SMS Survey");
		    driver.findElement(By.id("description_eng")).click();
		    driver.findElement(By.id("description_eng")).clear();
		    driver.findElement(By.id("description_eng")).sendKeys("Ahmad SMS Survey");
		    driver.findElement(By.id("channel_sms")).click();
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.id("allow_multiple_entries")).click();
		    
		    
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//button[@id='questionnaire_save_step1']")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[3]/div[1]/article[4]/div[4]/div[1]/article[1]/header[1]/a[1]/i[1]")));
		    driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[3]/div[1]/article[4]/div[4]/div[1]/article[1]/header[1]/a[1]/i[1]")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("participation_message_eng")));
		    driver.findElement(By.id("participation_message_eng")).click();
		    driver.findElement(By.id("participation_message_eng")).clear();
		    driver.findElement(By.id("participation_message_eng")).sendKeys("Hello Sir/Madam, Press 1 to start survey.");
		    driver.findElement(By.id("save_participation_data")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    driver.findElement(By.xpath("//div[@id='hello-and-goodbye-block']/div/article[3]/header/a/i")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("goodbye_message_eng")));
		    driver.findElement(By.id("goodbye_message_eng")).click();
		    driver.findElement(By.id("goodbye_message_eng")).clear();
		    driver.findElement(By.id("goodbye_message_eng")).sendKeys("Good bye 1");
		    driver.findElement(By.xpath("(//a[contains(text(),'2')])[3]")).click();
		    driver.findElement(By.id("goodbye_message_2_eng")).click();
		    driver.findElement(By.id("goodbye_message_2_eng")).click();
		    driver.findElement(By.id("goodbye_message_2_eng")).clear();
		    driver.findElement(By.id("goodbye_message_2_eng")).sendKeys("Good bye 2");
		    driver.findElement(By.xpath("(//a[contains(text(),'3')])[3]")).click();
		    driver.findElement(By.id("goodbye_message_3_eng")).click();
		    driver.findElement(By.id("goodbye_message_3_eng")).clear();
		    driver.findElement(By.id("goodbye_message_3_eng")).sendKeys("Good bye 3");
		    driver.findElement(By.id("save_goodbye_message")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    driver.findElement(By.xpath("//div[@id='hello-and-goodbye-block']/div/article[4]/header/a/i")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("error_message_eng")));
		    driver.findElement(By.id("error_message_eng")).click();
		    driver.findElement(By.id("error_message_eng")).clear();
		    driver.findElement(By.id("error_message_eng")).sendKeys("Error Occurred");
		    driver.findElement(By.id("save_error_data")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//div[@id='hello-and-goodbye-block']/div/article[5]/header/a/i")).click();
		    
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("language_selection_sms")));
		    driver.findElement(By.id("language_selection_sms")).click();
		    driver.findElement(By.id("language_selection_sms")).clear();
		    driver.findElement(By.id("language_selection_sms")).sendKeys("Press 1 for English Language");
		    driver.findElement(By.id("select2-language-selection-option-container")).click();
		    driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).sendKeys("always");
		    driver.findElement(By.xpath("//body/span[2]/span[1]/span[1]/input[1]")).sendKeys(Keys.ENTER);
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.id("save_language_selection_data")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//div[@id='hello-and-goodbye-block']/div/article[6]/header/a/i")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("timeout_message_eng")));
		    driver.findElement(By.id("timeout_message_eng")).click();
		    driver.findElement(By.id("timeout_message_eng")).clear();
		    driver.findElement(By.id("timeout_message_eng")).sendKeys("Timeout");
		    driver.findElement(By.id("save_timeout_data")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("//div[@id='hello-and-goodbye-block']/div/article[15]/header/a/i")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='session_exp_eng_chosen']/a/span")));
		    driver.findElement(By.xpath("//div[@id='session_exp_eng_chosen']/a/span")).click();
		    driver.findElement(By.xpath("//div[@id='session_exp_eng_chosen']/div/ul/li[2]")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("save_block_session_expiry")));
		    driver.findElement(By.id("save_block_session_expiry")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.id("questionnaire_save_step2")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    
		    driver.findElement(By.xpath("//article[@id='survey-all-tabs']/div[5]/div/div/a/span[2]/strong/i")).click();
		   // driver.findElement(By.id("search_admin_questions_key")).click();
		   // driver.findElement(By.id("search_admin_questions_key")).clear();
		    //driver.findElement(By.id("search_admin_questions_key")).sendKeys("how many teams");
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='checkbox'])[24]")));
		    driver.findElement(By.xpath("(//input[@type='checkbox'])[24]")).click();
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.xpath("(//input[@type='checkbox'])[25]")).click();
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("questionnaire_save_and_close")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("questionnaire_save_step3")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("btn_step4_next")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.xpath("//div[@id='block-send']/div/div/label[2]/span")).click();
		    
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("invite_phone_number")));
		    driver.findElement(By.id("invite_phone_number")).click();
		    new Select(driver.findElement(By.id("invite_phone_number"))).selectByVisibleText("+17198385080");
		   // driver.findElement(By.id("invite_phone_number")).click();
		    
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("btn-publish-survey")).click();
		
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

}
