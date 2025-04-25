package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPageTermitecontrolpc {
    private WebDriver driver;
    private WebDriverWait wait;

    public RegistrationPageTermitecontrolpc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // Page Elements
    @FindBy(xpath = "//span[@class='form_pages_close_button']")
    private WebElement englishButton;

    @FindBy(xpath = "//input[@placeholder='First Name *']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name *']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Street Address *']")
    private WebElement cityDropdown;

    @FindBy(xpath = "//input[@placeholder='City*']")
    private WebElement city;

    @FindBy(xpath = "//input[@placeholder='State *']")
    private WebElement state;

    @FindBy(xpath = "//input[@placeholder='Zip Code *']")
    private WebElement zip;

    @FindBy(xpath = "//input[@placeholder='Phone Number *']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='Email *']")
    private WebElement mail;

    @FindBy(id = "input_53_10")
    private WebElement promoCode;

    @FindBy(xpath = "//label[text()='Social Media']")
    private WebElement hear;

    @FindBy(id = "gform_submit_button_53")
    private WebElement registerButton;
    
     


     public void ppR() {
        try {
            // Wait and close English popup
            wait.until(ExpectedConditions.elementToBeClickable(englishButton)).click();
            Thread.sleep(500);

            // Optional: Hide cookie banner
            try {
                WebElement cookieBanner = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cc-window")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none';", cookieBanner);
                Thread.sleep(300);
            } catch (TimeoutException | NoSuchElementException ignored) {}

            // Wait and close chat popup
			/*
			 * try {
			 * 
			 * 
			 * Thread.sleep(8500); // Wait for chat to show WebElement closeChatButton =
			 * wait.until(ExpectedConditions.elementToBeClickable(By.id("cross-btn")));
			 * ((JavascriptExecutor)
			 * driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
			 * closeChatButton); Thread.sleep(200); closeChatButton.click();
			 * Thread.sleep(300); } catch (TimeoutException | NoSuchElementException e) {
			 * System.out.println("Chat close button not found or already closed."); }
			 */
       
            
            

            // Fill First Name
            WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOf(firstName));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", firstNameElement);
            Thread.sleep(300);
            firstNameElement.sendKeys("Test_Name");

            wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys("Test_Name_Last");
            Thread.sleep(300);

            // Scroll to phone field
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", phoneNumber);
            Thread.sleep(300);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", phoneNumber);

            wait.until(ExpectedConditions.visibilityOf(cityDropdown)).sendKeys("32756 Belts Dr");
            Thread.sleep(600);

            wait.until(ExpectedConditions.visibilityOf(phoneNumber)).sendKeys("9715645272");

            // Scroll to and fill City
            WebElement cityElement = wait.until(ExpectedConditions.visibilityOf(city));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", cityElement);
            Thread.sleep(300);
            cityElement.sendKeys("Harrisburg");

            wait.until(ExpectedConditions.visibilityOf(state)).sendKeys("OR");
            Thread.sleep(300);
            wait.until(ExpectedConditions.visibilityOf(zip)).sendKeys("32756");
            Thread.sleep(300);
            wait.until(ExpectedConditions.visibilityOf(mail)).sendKeys("testdeyo@gmail.com");
            Thread.sleep(300);

            wait.until(ExpectedConditions.elementToBeClickable(promoCode)).sendKeys("Test Promo Code");
            Thread.sleep(500);

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", hear);
            Thread.sleep(300);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hear);

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", registerButton);
            Thread.sleep(800);
            registerButton.click();

            wait.until(ExpectedConditions.invisibilityOf(registerButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
