package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By languageButton = By.xpath("//*[@id='navbarSupportedContent']//button[contains(@class, 'mx-2') and contains(@class, 'btn') and contains(@class, 'lang-btn')]");
    private By emailField = By.xpath("//input[@placeholder='Email *']");
    private By passwordField = By.xpath("//input[@placeholder='Password *']");
    private By loginButton = By.xpath("//button[contains(@class, 'login--button')]");
    private By otpInput = By.xpath("//input[contains(@class, 'otp-input')]");
    private By otpSubmit = By.xpath("//button[text()='Verify']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void login(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(languageButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void enterOTP(String otp) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(otpInput)).sendKeys(otp);
        wait.until(ExpectedConditions.elementToBeClickable(otpSubmit)).click();
    }
}
