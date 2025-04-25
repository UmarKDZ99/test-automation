package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By englishButton = By.xpath("//*[@id='navbarSupportedContent']//button[contains(@class, 'mx-2') and contains(@class, 'btn') and contains(@class, 'lang-btn')]");
    private By fullName = By.xpath("//input[@placeholder='Name *']");
    private By phoneNumber = By.xpath("//input[@placeholder='Phone Number *']");
    private By cityDropdown = By.xpath("//input[@role='combobox']");
    private By citySelect = By.xpath("//span[text()=' Yanbu ']");
    private By mail = By.xpath("//input[@placeholder='Email *']");
    private By password = By.xpath("//input[@placeholder='Password *']");
    private By confirmPassword = By.xpath("//input[@placeholder='Confirm Password *']");
    private By termsCheckbox = By.xpath("//input[@type='checkbox'][contains(@id, 'mat-mdc-checkbox')]");
    private By registerButton = By.xpath("//div[contains(@class, 'submit-btn')]//button");
    private By successMessage = By.xpath("//h2[contains(text(), 'Registration Successful')]");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void register(String name, String phone, String email, String pass, String confirmPass) {
        wait.until(ExpectedConditions.elementToBeClickable(englishButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullName)).sendKeys(name);
        driver.findElement(phoneNumber).sendKeys(phone);
        driver.findElement(cityDropdown).click();
        wait.until(ExpectedConditions.elementToBeClickable(citySelect)).click();
        driver.findElement(mail).sendKeys(email);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
        WebElement checkbox = driver.findElement(termsCheckbox);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
    }

    public boolean isRegistrationSuccessful() {
        try {
            wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(successMessage),
                ExpectedConditions.urlContains("dashboard")
            ));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
