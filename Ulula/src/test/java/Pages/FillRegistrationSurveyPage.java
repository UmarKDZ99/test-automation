package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillRegistrationSurveyPage {
	
	WebDriver driver;
	
	public FillRegistrationSurveyPage(WebDriver localDriver)
	{
		this.driver=localDriver;
	}


	@FindBy(how=How.LINK_TEXT, using="Ok")
	@CacheLookup
	WebElement btnStartSurvey;
	
	@FindBy(how=How.ID, using="answer_text_3154")
	@CacheLookup
	WebElement txtFirstQuestion;
	
	@FindBy(how=How.XPATH, using="//div[@id='tab1']/div/div[3]/button")
	@CacheLookup
	WebElement btnSubmitFirstQuestion;
	
	@FindBy(how=How.ID, using="answer_text_3155")
	@CacheLookup
	WebElement txtSecondQuestion;
	
	@FindBy(how=How.XPATH, using="//div[@id='tab2']/div/div[3]/button")
	@CacheLookup
	WebElement btnSubmitSecondQuestion;
	
	@FindBy(how=How.ID, using="answer_text_3156")
	@CacheLookup
	WebElement txtThirdQuestion;
	
	@FindBy(how=How.XPATH, using="//div[@id='tab3']/div/div[3]/button")
	@CacheLookup
	WebElement btnSubmitThirdQuestion;
	
	@FindBy(how=How.XPATH, using="(//li[@id='list-question-2960']/div/div/span)[5]")
	@CacheLookup
	WebElement rdbFourthQuestion;
	
	@FindBy(how=How.XPATH, using="//ul[@id='option-select-4']/button")
	@CacheLookup
	WebElement btnSubmitFourthQuestion;
	
	@FindBy(how=How.XPATH, using="(//li[@id='list-question-3245']/div/div/span)[3]")
	@CacheLookup
	WebElement rdbFifthQuestion1;
	
	@FindBy(how=How.XPATH, using="(//li[@id='list-question-3245']/div/div/span)[5]")
	@CacheLookup
	WebElement rdbFifthQuestion2;
	
	@FindBy(how=How.XPATH, using="(//li[@id='list-question-3245']/div/div/span)[7]")
	@CacheLookup
	WebElement rdbFifthQuestion3;
	
	@FindBy(how=How.XPATH, using="//ul[@id='option-select-5']/button")
	@CacheLookup
	WebElement btnSubmitFifthQuestion;
	
	@FindBy(how=How.XPATH, using="//li[@id='list-question-2975']/div/div/span")
	@CacheLookup
	WebElement rdbSixthQuestion;
	
	@FindBy(how=How.XPATH, using="//ul[@id='option-select-6']/button")
	@CacheLookup
	WebElement btnSubmitSixthQuestion;
	

	
	public void funcFillRegSurvey()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		driver.get("https://dev.ulula.app/survey/8jDp/eng/no");
		
		wait.until(ExpectedConditions.elementToBeClickable(btnStartSurvey));
		btnStartSurvey.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(txtFirstQuestion));
		txtFirstQuestion.click();
		txtFirstQuestion.clear();
		txtFirstQuestion.sendKeys("Ahmad First Vendor 16th Oct 2020");
		btnSubmitFirstQuestion.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(txtSecondQuestion));
		txtSecondQuestion.click();
		txtSecondQuestion.clear();
		txtSecondQuestion.sendKeys("ahmadfakeemailid1@gmail.com");
		btnSubmitSecondQuestion.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(txtThirdQuestion));
		txtThirdQuestion.click();
		txtThirdQuestion.clear();
		txtThirdQuestion.sendKeys("+923458798566434");
		btnSubmitThirdQuestion.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(rdbFourthQuestion));
		rdbFourthQuestion.click();
		btnSubmitFourthQuestion.click();
	    
		wait.until(ExpectedConditions.elementToBeClickable(rdbFifthQuestion1));
		rdbFifthQuestion1.click();
		rdbFifthQuestion2.click();
		rdbFifthQuestion3.click();
		btnSubmitFifthQuestion.click();
	    
		wait.until(ExpectedConditions.elementToBeClickable(rdbSixthQuestion));
		rdbSixthQuestion.click();
		btnSubmitSixthQuestion.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}
