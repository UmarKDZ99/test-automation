package Pages;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;


public class ProgramPage {
	
	WebDriver driver;
	
	public ProgramPage(WebDriver localDriver)
	{
		this.driver=localDriver;
	}

//	@FindBy(id= "user_login") WebElement userLogin;
	
	
	// Note:  @CacheLooup is used to increase performance, on running second time it will not pick these locators from web page again but instead it will pick from cache
	
//	@FindBy(how=How.XPATH, using="//div[@id='app']/div/header/div/div[2]/a/span")
//	@CacheLookup
//	WebElement btnAddNewProgram;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Add new program')]")

	WebElement btnAddNewProgram;
	
	@FindBy(how=How.XPATH, using="//input[@type='text']")
	@CacheLookup
	WebElement txtProgramTitle;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[2]")
	@CacheLookup
	WebElement txtProgramDescription;
	
	@FindBy(how=How.XPATH, using="//header/div[1]/div[1]/button[1]/span[1]/i[1]")
	@CacheLookup
	WebElement btnCreateNewProgram;
	
//	@FindBy(how=How.XPATH, using="//button[contains(text(),'+')]")
//	@CacheLookup
//	WebElement AddNewPhaseButton;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/button")
	WebElement btnAddNewPhase;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Click here to add phase title & description')]")
	@CacheLookup
	WebElement ShowPhaseTitleDescriptionTextBoxes;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtPhaseTitle;
	
	@FindBy(how=How.CSS, using="div.app-wrapper div.main:nth-child(2) div.columns.remove-margin div.column.right-panel-wrap:nth-child(2) section.inner div.tabs-wrapper.phase-wrapper:nth-child(2) div.b-tabs.is-horizontal section.tab-content div.tab-item div.input-switch.margin-adjust div.phase-edit-panel:nth-child(2) div.field:nth-child(2) div.control.is-clearfix > textarea.textarea")
	@CacheLookup
	WebElement txtPhaseDescription;
	
	@FindBy(how=How.CSS, using="div.app-wrapper div.main:nth-child(2) div.columns.remove-margin div.column.right-panel-wrap:nth-child(2) section.inner div.tabs-wrapper.phase-wrapper:nth-child(2) div.b-tabs.is-horizontal section.tab-content div.tab-item div:nth-child(1) div.input-switch.margin-adjust div.phase-edit-panel:nth-child(2) > button.button.is-half-width.is-info.is-outlined:nth-child(3)")
	@CacheLookup
	WebElement btnCreateNewPhase;

	
	// steps
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/button/span/i")
	@CacheLookup
	WebElement btnAddStep;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[3]/div/header/div[2]/span/i")
	@CacheLookup
	WebElement expandRegistrationStep; // for registration step
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[5]/div/header/div[2]/span/i")
	@CacheLookup
	WebElement expandGuidingStep;  // for Guiding step
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[7]/div/header/div[2]/span/i")
	@CacheLookup
	WebElement expandCAPStep;  // for CAP step
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[4]/div/header/div[2]/span/i")
	@CacheLookup
	WebElement expandReviewRegistrationStep;  // for review registration step
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[6]/div/header/div[2]/span/i")
	@CacheLookup
	WebElement expandReviewGuidingStep;  // for review Guiding step
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div/div/div/section/div/div/div[8]/div/header/div[2]/span/i")
	@CacheLookup
	WebElement expandReviewCAPStep;  // for review CAP step

	@FindBy(how=How.XPATH, using="(//input[@type='text'])[4]")
	@CacheLookup
	WebElement txtRegistrationStepTitle;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[12]")
	@CacheLookup
	WebElement txtGuidingStepTitle;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[20]")
	@CacheLookup
	WebElement txtCAPStepTitle;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[8]")
	@CacheLookup
	WebElement txtReviewRegistrationStepTitle;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[16]")
	@CacheLookup
	WebElement txtReviewGuidingStepTitle;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[24]")
	@CacheLookup
	WebElement txtReviewCAPStepTitle;
	
	
	@FindBy(how=How.XPATH, using="//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea")
	@CacheLookup
	WebElement txtRegistrationStepDescription;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[3]")
	@CacheLookup
	WebElement txtGuidingStepDescription;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[5]")
	@CacheLookup
	WebElement txtCAPStepDescription;
	
	
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[2]")
	@CacheLookup
	WebElement txtReviewRegistrationStepDescription;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[4]")
	@CacheLookup
	WebElement txtReviewGuidingStepDescription;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div/div[3]/div/textarea)[6]")
	@CacheLookup
	WebElement txtReviewCAPStepDescription;
	
//	@FindBy(how=How.XPATH, using="//div[@id='contentIdForA11y2']/div/div[2]/div/div[2]/div/label/span")
//	@CacheLookup
//	WebElement chkIsRegistrationStep;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement chkIsRegistrationStep;
	
//	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[2]/div/div/div/label/span)[9]")
//	@CacheLookup
//	WebElement chkCreateUserProfile;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement chkCreateUserProfile;
	
//	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")
//	@CacheLookup
//	WebElement chkIsRemediationStep;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement chkIsRemediationStep;
	
//	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/label[1]/span[1]")
//	@CacheLookup
//	WebElement chkIsCAPStep;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement chkIsCAPStep;
	
		
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[5]")
	@CacheLookup
	WebElement txtSelectRegistrationSurvey;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[13]")
	@CacheLookup
	WebElement txtSelectGuidingSurvey;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[21]")
	@CacheLookup
	WebElement txtSelectCAPSurvey;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[10]")
	@CacheLookup
	WebElement txtSelectRegInputStep;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[18]")
	@CacheLookup
	WebElement txtSelectGuidingInputStep;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[26]")
	@CacheLookup
	WebElement txtSelectCAPInputStep;

	@FindBy(how=How.XPATH, using="//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[3]/div/div/div/div/div/div/label/span")
	@CacheLookup
	WebElement chkDeadlineRegistration;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[3]/div/div/div/div/div/div/label/span)[13]")
	@CacheLookup
	WebElement chkDeadlineGuiding;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[3]/div/div/div/div/div/div/label/span)[25]")
	@CacheLookup
	WebElement chkDeadlineCAP;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[3]/div/div/div/div/div/div/label/span)[3]")
	@CacheLookup
	WebElement chkDeadlineReviewRegistration;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[3]/div/div/div/div/div/div/label/span)[7]")
	@CacheLookup
	WebElement chkDeadlineReviewGuiding;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[3]/div/div/div/div/div/div/label/span)[11]")
	@CacheLookup
	WebElement chkDeadlineReviewCAP;
		
	@FindBy(how=How.XPATH, using="//input[@type='number']")
	@CacheLookup
	WebElement txtDeadlineRegistration;
	
	@FindBy(how=How.XPATH, using="(//input[@type='number'])[7]")
	@CacheLookup
	WebElement txtDeadlineGuiding;
	
	@FindBy(how=How.XPATH, using="(//input[@type='number'])[13]")
	@CacheLookup
	WebElement txtDeadlineCAP;
	
	@FindBy(how=How.XPATH, using="(//input[@type='number'])[5]")
	@CacheLookup
	WebElement txtDeadlineReviewRegistration;
	
	@FindBy(how=How.XPATH, using="(//input[@type='number'])[11]")
	@CacheLookup
	WebElement txtDeadlineReviewGuiding;
	
	@FindBy(how=How.XPATH, using="(//input[@type='number'])[17]")
	@CacheLookup
	WebElement txtDeadlineReviewCAP;

	@FindBy(how=How.XPATH, using="(//button[@type='button'])[3]")
	@CacheLookup
	WebElement btnSaveRegistrationStep;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[4]/div/div/button/span)[7]")
	@CacheLookup
	WebElement btnSaveGuidingStep;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div/div[4]/div/div/button/span)[13]")
	@CacheLookup
	WebElement btnSaveCAPStep;
	
	@FindBy(how=How.XPATH, using="(//button[@type='button'])[7]")
	@CacheLookup 
	WebElement btnSaveReviewRegistrationStep;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/section/div[2]/div[4]/div/div/button/span)[4]")
	@CacheLookup
	WebElement btnSaveReviewGuidingStep;
	
	@FindBy(how=How.XPATH, using="(//button[@type='button'])[19]")
	@CacheLookup
	WebElement btnSaveReviewCAPStep;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[2]")
	@CacheLookup
	WebElement tbReviewRegistrationStep;
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[4]")
	@CacheLookup
	WebElement tbReviewGuidingStep;		
	
	@FindBy(how=How.XPATH, using="(//div[@id='contentIdForA11y2']/div/div[3]/div/nav/ul/li[2]/a/span)[6]")
	@CacheLookup
	WebElement tbReviewCAPStep;	
	
	
	public void AddNewProgram()
	{
		WebDriverWait wait = new WebDriverWait(driver, 80);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewProgram));
	    btnAddNewProgram.click();
	}
	
	public void CreateNewProgram(String prgrmTitle, String prgrmDesc)
	{
		Date currentDate= new Date();
		String dateForConcatenation= currentDate.toString().replace(" ", "_").replace(":","_");
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.elementToBeClickable(txtProgramTitle));
	    
		txtProgramTitle.click();
		txtProgramTitle.clear();
		txtProgramTitle.sendKeys(dateForConcatenation + prgrmTitle);
		
		txtProgramTitle.click();
		txtProgramDescription.click();
		txtProgramDescription.clear();
		txtProgramDescription.sendKeys(dateForConcatenation + prgrmDesc);
		
	    wait.until(ExpectedConditions.elementToBeClickable(btnCreateNewProgram));
	    btnCreateNewProgram.click();
	}
	
	public void AddNewPhase()
	{
		WebDriverWait wait = new WebDriverWait(driver, 80);
		 wait.until(ExpectedConditions.elementToBeClickable(btnAddNewPhase));
		 btnAddNewPhase.click();
	}
	
	public void CreateNewPhase(String phaseTitle, String phaseDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 80);
		ShowPhaseTitleDescriptionTextBoxes.click();
	    wait.until(ExpectedConditions.elementToBeClickable(txtPhaseTitle));
	    txtPhaseTitle.click();
	    txtPhaseTitle.clear();
	    txtPhaseTitle.sendKeys(phaseTitle);
	    
	    txtPhaseDescription.click();
	    txtPhaseDescription.clear();
	    txtPhaseDescription.sendKeys(phaseDesc);
	    
	    btnCreateNewPhase.click();
	}
	
	public void funcCreateRegistrationStep(String stepTitle, String stepDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		btnAddStep.click();
		expandRegistrationStep.click();
		txtRegistrationStepTitle.click();
		txtRegistrationStepTitle.clear();
		txtRegistrationStepTitle.sendKeys(stepTitle);
		txtRegistrationStepDescription.click();
		txtRegistrationStepDescription.clear();
		txtRegistrationStepDescription.sendKeys(stepDesc);
		chkIsRegistrationStep.click();
		txtSelectRegistrationSurvey.click();
	    
		txtSelectRegistrationSurvey.clear();
		txtSelectRegistrationSurvey.sendKeys("14th October 2020 - Ahmad- Web");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    txtSelectRegistrationSurvey.sendKeys(Keys.DOWN);
	    txtSelectRegistrationSurvey.sendKeys(Keys.ENTER);
	    chkDeadlineRegistration.click();
	    txtDeadlineRegistration.click();
	    txtDeadlineRegistration.click();
	    txtDeadlineRegistration.clear();
	    txtDeadlineRegistration.sendKeys("1");
	    btnSaveRegistrationStep.click();
	    
	   // WebElement alert = wait.Until(ExpectedConditions.ElementExists(By.xpath("div.alert.alert-danger")));
	   // String actualAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Successfully Created Step')]"))).getText();
	  
	  //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Successfully Created Step')]")));
	  //  assertEquals(actualAlert, actualAlert);
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void funcCreateReviewRegistrationStep(String stepTitle, String stepDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAddStep);

	
		expandReviewRegistrationStep.click();
		txtReviewRegistrationStepTitle.click();
		txtReviewRegistrationStepTitle.clear();
		txtReviewRegistrationStepTitle.sendKeys(stepTitle);
		txtReviewRegistrationStepDescription.click();
		txtReviewRegistrationStepDescription.clear();
		txtReviewRegistrationStepDescription.sendKeys(stepDesc);
		chkCreateUserProfile.click();
		tbReviewRegistrationStep.click();
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    wait.until(ExpectedConditions.elementToBeClickable(txtSelectRegInputStep));
	    txtSelectRegInputStep.click();
	    txtSelectRegInputStep.clear();
	    txtSelectRegInputStep.sendKeys("Registration");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    txtSelectRegInputStep.sendKeys(Keys.DOWN);
	    txtSelectRegInputStep.sendKeys(Keys.ENTER);
//	    chkDeadlineReviewRegistration.click();
//	    txtDeadlineReviewRegistration.click();
//	    txtDeadlineReviewRegistration.clear();
//	    txtDeadlineReviewRegistration.sendKeys("1");
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    txtReviewRegistrationStepTitle.click();
	    txtReviewRegistrationStepTitle.clear();
	    txtReviewRegistrationStepTitle.sendKeys(stepTitle);
	    txtReviewRegistrationStepDescription.click();
	    txtReviewRegistrationStepDescription.clear();
	    txtReviewRegistrationStepDescription.sendKeys(stepDesc);
	  //  chkCreateUserProfile.click();
	    
	    btnSaveReviewRegistrationStep.click();
	   
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void funcCreateGuidingStep(String stepTitle, String stepDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAddStep);
		
		expandGuidingStep.click();
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    txtGuidingStepTitle.click();
		    txtGuidingStepTitle.clear();
		    txtGuidingStepTitle.sendKeys(stepTitle);
		    txtGuidingStepDescription.click();
		    txtGuidingStepDescription.clear();
		    txtGuidingStepDescription.sendKeys(stepDesc);
		   
		    wait.until(ExpectedConditions.elementToBeClickable(txtSelectGuidingSurvey));
		    txtSelectGuidingSurvey.click();
		    txtSelectGuidingSurvey.clear();
		    txtSelectGuidingSurvey.sendKeys("14th OCtober 2020 Ahmad Guiding");
		    try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    txtSelectGuidingSurvey.sendKeys(Keys.DOWN);
		    txtSelectGuidingSurvey.sendKeys(Keys.ENTER);
//		    chkDeadlineGuiding.click();
//		    txtDeadlineGuiding.click();
//		    txtDeadlineGuiding.clear();
//		    txtDeadlineGuiding.sendKeys("1");
		    
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    txtGuidingStepTitle.click();
		    txtGuidingStepTitle.clear();
		    txtGuidingStepTitle.sendKeys(stepTitle);
		    txtGuidingStepDescription.click();
		    txtGuidingStepDescription.clear();
		    txtGuidingStepDescription.sendKeys(stepDesc);
		    
		    btnSaveGuidingStep.click();
		    
    
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void funcCreateReviewGuidingStep(String stepTitle, String stepDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAddStep);
		
		expandReviewGuidingStep.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(txtReviewGuidingStepTitle));
	    
	    txtReviewGuidingStepTitle.click();
	    txtReviewGuidingStepTitle.clear();
	    txtReviewGuidingStepTitle.sendKeys(stepTitle);
	    txtReviewGuidingStepDescription.click();
	    txtReviewGuidingStepDescription.clear();
	    txtReviewGuidingStepDescription.sendKeys(stepDesc);
	    
	    
	                                 
	    driver.findElement(By.xpath("(//div[@id='contentIdForA11y2']/div/div[3])[4]")).click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(tbReviewGuidingStep));
	    tbReviewGuidingStep.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(chkIsRemediationStep));
	    chkIsRemediationStep.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(txtSelectGuidingInputStep));
	    txtSelectGuidingInputStep.click();
	    txtSelectGuidingInputStep.clear();
	    txtSelectGuidingInputStep.sendKeys("Guiding");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    txtSelectGuidingInputStep.sendKeys(Keys.DOWN);
	    txtSelectGuidingInputStep.sendKeys(Keys.ENTER);
//	    chkDeadlineReviewGuiding.click();
//	    txtDeadlineReviewGuiding.click();
//	    txtDeadlineReviewGuiding.clear();
//	    txtDeadlineReviewGuiding.sendKeys("1");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    txtReviewGuidingStepTitle.click();
	    txtReviewGuidingStepTitle.clear();
	    txtReviewGuidingStepTitle.sendKeys(stepTitle);
	    txtReviewGuidingStepDescription.click();
	    txtReviewGuidingStepDescription.clear();
	    txtReviewGuidingStepDescription.sendKeys(stepDesc);
	    
	    // again
	    wait.until(ExpectedConditions.elementToBeClickable(chkIsRemediationStep));
	    chkIsRemediationStep.click();
	    
	    btnSaveReviewGuidingStep.click();
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void funcCreateCAPStep(String stepTitle, String stepDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAddStep);
		expandCAPStep.click();
	    
		txtCAPStepTitle.click();
		txtCAPStepTitle.clear();
		txtCAPStepTitle.sendKeys(stepTitle);
		txtCAPStepDescription.click();
		txtCAPStepDescription.clear();
		txtCAPStepDescription.sendKeys(stepDesc);
	   
	    
	    wait.until(ExpectedConditions.elementToBeClickable(txtSelectCAPSurvey));
	    txtSelectCAPSurvey.click();	    
	    txtSelectCAPSurvey.clear();
	    txtSelectCAPSurvey.sendKeys("14th OCtober 2020_Ahmad CAP");
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    txtSelectCAPSurvey.sendKeys(Keys.DOWN);
	    txtSelectCAPSurvey.sendKeys(Keys.ENTER);
	    txtCAPStepTitle.click();
	    txtCAPStepTitle.clear();
	    txtCAPStepTitle.sendKeys(stepTitle);
	    txtCAPStepDescription.click();
	    txtCAPStepDescription.clear();
	    txtCAPStepDescription.sendKeys(stepDesc);
	    
//	    chkDeadlineCAP.click();
//	    txtDeadlineCAP.click();
//	    txtDeadlineCAP.clear();
//	    txtDeadlineCAP.sendKeys("1");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    btnSaveCAPStep.click();
	   
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void funcCreateReviewCAPStep(String stepTitle, String stepDesc)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddStep));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAddStep);
		expandReviewCAPStep.click();
	    
		txtReviewCAPStepTitle.click();
		txtReviewCAPStepTitle.clear();
		txtReviewCAPStepTitle.sendKeys(stepTitle);
		txtReviewCAPStepDescription.click();
		txtReviewCAPStepDescription.clear();
		txtReviewCAPStepDescription.sendKeys(stepDesc);
	    
	    
	    
	    tbReviewCAPStep.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(chkIsCAPStep));
	    chkIsCAPStep.click();
	   
	    wait.until(ExpectedConditions.elementToBeClickable(txtSelectCAPInputStep));
	    txtSelectCAPInputStep.click();	    
	    txtSelectCAPInputStep.clear();
	    txtSelectCAPInputStep.sendKeys("CAP");
	    

	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    txtSelectCAPInputStep.sendKeys(Keys.DOWN);
	    txtSelectCAPInputStep.sendKeys(Keys.ENTER);
//	    chkDeadlineReviewCAP.click();
//	    txtDeadlineReviewCAP.click();
//	    txtDeadlineReviewCAP.clear();
//	    txtDeadlineReviewCAP.sendKeys("1");
	    

	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    btnSaveReviewCAPStep.click();
	 
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
