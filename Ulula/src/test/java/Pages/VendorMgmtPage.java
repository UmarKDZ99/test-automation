package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VendorMgmtPage {
	
	WebDriver driver;
	
	public VendorMgmtPage(WebDriver localDriver)
	{
		this.driver=localDriver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@type='search']")
	@CacheLookup
	WebElement txtSearchVendor;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div/section/ul/li/p")
	@CacheLookup
	WebElement selectedVendorinLeftPanel;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/section/div/div/div/div/div[3]/button/span")
	@CacheLookup
	WebElement btnNextRegistrationStep;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/section/div[2]/div/div/div[2]/div[3]/button/span")
	@CacheLookup
	WebElement btnAcceptVendorRegistrationStep;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/section/div[4]/div/div/div[2]/div[3]/button/span")
	@CacheLookup
	WebElement btnAcceptVendorGuidingStep;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/section/div[6]/div/div/div[2]/div[2]/button/span")
	@CacheLookup
	WebElement btnRejectVendorCAPStep;

	@FindBy(how=How.XPATH, using="//footer/button[2]")
	@CacheLookup
	WebElement btnConfirmAcceptApplication;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/nav/ul/li[3]/a/div/span")
	@CacheLookup
	WebElement tabGuidingStep;
	
	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/nav/ul/li[5]/a/div/span")
	@CacheLookup
	WebElement tabCAPStep;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[2]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/div[1]/span[1]")
	@CacheLookup
	WebElement tabReviewRegistrationStep;

	@FindBy(how=How.XPATH, using="(//button[@type='button'])[15]")
	@CacheLookup
	WebElement btnNextGuidingStep;

	@FindBy(how=How.XPATH, using="//div[@id='app']/div/div/main/div/div[2]/section/div[2]/div/section/div/div/div/section/div[5]/div/div/div/div[3]/button/span")
	@CacheLookup
	WebElement btnNextCAPStep;
	

	
	public void funcReviewRegistrationStep()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
	
		driver.get("https://dev.ulula.app/vendors");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(txtSearchVendor));
		txtSearchVendor.click();
		txtSearchVendor.clear();
		txtSearchVendor.sendKeys("Ahmad First Vendor 16th Oct 2020");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(selectedVendorinLeftPanel));
		selectedVendorinLeftPanel.click();
		
	    
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		selectedVendorinLeftPanel.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tabReviewRegistrationStep.click();
		
//		//btnNextRegistrationStep.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		wait.until(ExpectedConditions.elementToBeClickable(btnAcceptVendorRegistrationStep));
		btnAcceptVendorRegistrationStep.click();
		btnConfirmAcceptApplication.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	public void funcReviewGuidingStep()
	{
		driver.navigate().refresh();
		
		// 2
		txtSearchVendor.click();
		txtSearchVendor.clear();
		txtSearchVendor.sendKeys("Ahmad First Vendor 16th Oct 2020");
		selectedVendorinLeftPanel.click();
	    
	    
		tabGuidingStep.click();
		btnNextGuidingStep.click();
	    
		btnAcceptVendorGuidingStep.click();
		btnConfirmAcceptApplication.click();
	
	}
	
	public void funcReviewCAPStep()
	{
		driver.navigate().refresh();
		
		// 3
				txtSearchVendor.click();
				txtSearchVendor.clear();
				txtSearchVendor.sendKeys("Ahmad First Vendor 16th Oct 2020");
				selectedVendorinLeftPanel.click();
			    
			    
				tabCAPStep.click();
				btnNextCAPStep.click();
			    
				btnRejectVendorCAPStep.click();
			    btnConfirmAcceptApplication.click();
	}
	
	
	
}
