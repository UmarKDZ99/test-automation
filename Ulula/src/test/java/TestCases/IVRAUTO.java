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
public class IVRAUTO extends BaseClass {
	
	public static TestData testData;
	
	
	@Test(priority=1,groups="Regression Testing")
	public void createIVRSurvey()
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
		    driver.findElement(By.id("title_eng")).sendKeys("NEW IVR Survey");
		    driver.findElement(By.id("description_eng")).click();
		    driver.findElement(By.id("description_eng")).clear();
		    driver.findElement(By.id("description_eng")).sendKeys("NEW IVR Survey");
		    driver.findElement(By.id("channel_ivr")).click();
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
		 
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("participation_file_eng")));
		    driver.findElement(By.id("select2-introduction_option-container")).click();
		    driver.findElement(By.id("menu-eng-ivr")).click();
		    driver.findElement(By.id("participation_file_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\welcome english");
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
		    driver.findElement(By.xpath("//body/div[3]/div/div[1]/div/div[1]/section[2]/div/div[3]/div/article[4]/div[4]/div[1]/article[3]/div/form/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
		    driver.findElement(By.id("goodbye_file_1_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\bye1 english.mp3");
		    
		    driver.findElement(By.xpath("(//a[contains(text(),'2')])[3]")).click();
		    driver.findElement(By.id("goodbye_ivr_tab")).click();
		    driver.findElement(By.id("goodbye_file_2_eng")).click();
		    driver.findElement(By.id("goodbye_file_2_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\bye2 english.mp3");
		    
		    driver.findElement(By.xpath("(//a[contains(text(),'3')])[3]")).click();
		    driver.findElement(By.id("goodbye_ivr_tab")).click();
		    driver.findElement(By.id("goodbye_file_3_eng")).clear();
		    driver.findElement(By.id("goodbye_file_3_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\bye3 english.mp3");
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
		    
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("language_selection_file")));
		    
		    Select val = new Select (driver.findElement(By.id("select2-language-selection-option-container")));
		    val.selectByVisibleText("Default");
		    driver.findElement(By.id("language_selection_file")).sendKeys("C:\\Users\\DELL\\Downloads\\New_nest_validation\\already taken english");
		    driver.findElement(By.id("select2-language-selection-option-container")).click();
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
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("timeout_file_eng")));
		    driver.findElement(By.id("timeout_file_eng")).click();
		    driver.findElement(By.id("timeout_file_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\TOFRNE");
		    driver.findElement(By.id("save_timeout_data")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.xpath("///*[@id=\"config_container\"]/article[8]/header/a/i")).click();
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("///*[@id=\"config_container\"]/article[8]/header/a/i")));
		    driver.findElement(By.id("welcomeback_file_eng")).click();
		    driver.findElement(By.id("welcomeback_file_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\welcome english");
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("welcomeback_file_eng")));
		    driver.findElement(By.id("save_welcome_back_data")).click();
		    
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     {
				// TODO Auto-generated catch block
			}
		    
		    driver.findElement(By.xpath("//*[@id=\"config_container\"]/article[11]/header/a/i")).click();
	
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("(already_taken_file_eng")));
		    driver.findElement(By.id("(already_taken_file_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\welcome english");
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.xpath("//*[@id=\"config_container\"]/article[13]/header/a/i")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("facility_error_file_eng")));
		    driver.findElement(By.id("(facility_error_file_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\welcome english");
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("save_block_wrong_facility")).click();
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("questionnaire_save_and_close")).click();
		    
		    driver.findElement(By.xpath("//*[@id=\"config_container\"]/article[14]/header/a/i")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("reference_error_file_eng")));
		    driver.findElement(By.id("(reference_error_file_eng")).sendKeys("C:\\Users\\DELL\\OneDrive\\Desktop\\Audios LUoLA\\welcome english");
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    driver.findElement(By.id("save_block_wrong_reference")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    
		    
		    driver.findElement(By.id("questionnaire_save_step2")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		    
		    
		    /* driver.findElement(By.xpath("//article[@id='survey-all-tabs']/div[5]/div/div/a/span[2]/strong/i")).click();
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
*/
		    
		    
		    
		    driver.findElement(By.id("//global-preloader")).click();
		    
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
