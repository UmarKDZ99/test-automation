package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Initialize PageFactory elements
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Page Elements
    @FindBy(xpath = "//span[@class='form_pages_close_button']")
    private WebElement englishButton;

    @FindBy(xpath = "//input[@placeholder='Name*']")
    private WebElement fullName;

    @FindBy(id = "choice_3_26_1")
    private WebElement checkBtn;

    @FindBy(xpath = "//input[@placeholder='Street Address*']")
    private WebElement cityDropdown;

    @FindBy(xpath = "//input[@placeholder='City*']")
    private WebElement city;

    @FindBy(xpath = "//input[@placeholder='State*']")
    private WebElement state;

    @FindBy(xpath = "//input[@placeholder='Zip Code*']")
    private WebElement zip;

    @FindBy(xpath = "//input[@placeholder='Phone Number*']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='Email Address*']")
    private WebElement mail;

    @FindBy(xpath = "//input[@placeholder='Closing Date']")
    private WebElement closingDate;

    @FindBy(id = "input_3_12")
    private WebElement promoCode;

    @FindBy(xpath = "//label[text()='Social Media']")
    private WebElement hear;

    @FindBy(id = "gform_submit_button_3")
    private WebElement registerButton;

    public void register() {
        try {
            // Wait and close modal
            wait.until(ExpectedConditions.elementToBeClickable(englishButton)).click();
            Thread.sleep(500);

            // Handle cookie banner if it appears
            try {
                WebElement cookieBanner = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cc-window")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none';", cookieBanner);
                Thread.sleep(300);
            } catch (TimeoutException | NoSuchElementException ignored) {
            }

            // Fill in the form
            wait.until(ExpectedConditions.visibilityOf(fullName)).sendKeys("Test_Name");
            Thread.sleep(300);

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", checkBtn);
            Thread.sleep(300);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBtn);

            wait.until(ExpectedConditions.visibilityOf(cityDropdown)).sendKeys("32756 Belts Dr");
            Thread.sleep(600);

            wait.until(ExpectedConditions.visibilityOf(phoneNumber)).sendKeys("9715645272");
            wait.until(ExpectedConditions.visibilityOf(city)).sendKeys("Harrisburg");
            Thread.sleep(300);
            wait.until(ExpectedConditions.visibilityOf(state)).sendKeys("OR");
            Thread.sleep(300);
            wait.until(ExpectedConditions.visibilityOf(zip)).sendKeys("32756");
            Thread.sleep(300);
            wait.until(ExpectedConditions.visibilityOf(mail)).sendKeys("testdeyo@gmail.com");
            Thread.sleep(300);
            wait.until(ExpectedConditions.visibilityOf(closingDate)).sendKeys("01/01/2025");
            Thread.sleep(300);
            wait.until(ExpectedConditions.elementToBeClickable(promoCode)).sendKeys("Promo Code");
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
