package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver localDriver)
	{
		this.driver=localDriver;
	}

//	@FindBy(id= "user_login") WebElement userLogin;
	
	
	// Note:  @CacheLooup is used to increase performance, on running second time it will not pick these locators from web page again but instead it will pick from cache
	
	@FindBy(how=How.ID, using="inputEmail")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID, using="inputPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID, using="btnSignIn")
	@CacheLookup
	WebElement signIn;
	

	
	public void loginUlula(String uId, String pass)
	{
		username.sendKeys(uId);
		//password.sendKeys(pass);
		password.sendKeys("123456");
		signIn.click();
	}
	
	
	
	
	
	
	
	
}
