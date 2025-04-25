package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertyDetailsPage {
   private WebDriver driver;
   private WebDriverWait wait;
   @FindBy(
      id = "pdStreetAddress"
   )
   private WebElement streetAddress;
   @FindBy(
      name = "pdAptNumber"
   )
   private WebElement aptNumberField;
   @FindBy(
      id = "pdCity"
   )
   private WebElement pdCity;
   @FindBy(
      id = "pdState"
   )
   private WebElement pdState;
   @FindBy(
      id = "pdZipCode"
   )
   private WebElement zipCodeT;
   @FindBy(
      id = "footage"
   )
   private WebElement squareFootageField;
   @FindBy(
      xpath = "//button[contains(@class, 'pest_survey_submit_btn') and text()='Next']"
   )
   private WebElement nextButton;

   public PropertyDetailsPage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
      this.wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
   }

   public void fillPropertyDetails() throws InterruptedException {
      WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
      WebElement streetAddress = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pdStreetAddress")));
      streetAddress.click();
      Actions actions = new Actions(this.driver);
      actions.moveToElement(streetAddress).click().perform();
      String addressInput = "32756";
      char[] var8;
      int var7 = (var8 = addressInput.toCharArray()).length;

      for(int var6 = 0; var6 < var7; ++var6) {
         char ch = var8[var6];
         actions.sendKeys(new CharSequence[]{String.valueOf(ch)}).pause(Duration.ofMillis(300L)).perform();
      }

      WebElement firstSuggestion = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'pac-container')]//div[contains(@class,'pac-item')][1]")));
      firstSuggestion.click();
      Thread.sleep(6000L);
      this.zipCodeT.clear();
      Thread.sleep(2000L);
      ((WebElement)wait.until(ExpectedConditions.visibilityOf(this.zipCodeT))).sendKeys(new CharSequence[]{"32756"});
      ((WebElement)wait.until(ExpectedConditions.visibilityOf(this.squareFootageField))).sendKeys(new CharSequence[]{"2000"});
      Thread.sleep(6000L);
      WebDriverWait Sait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
      Sait.until(ExpectedConditions.elementToBeClickable(this.nextButton));
      ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", new Object[]{this.nextButton});
      ((JavascriptExecutor)this.driver).executeScript("arguments[0].click();", new Object[]{this.nextButton});
   }
}