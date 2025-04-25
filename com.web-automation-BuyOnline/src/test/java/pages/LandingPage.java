    package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
   private WebDriver driver;
   private WebDriverWait wait;
   @FindBy(
      id = "new_customer_zip"
   )
   private WebElement zipCode;
   @FindBy(
      id = "new_customer_btn"
   )
   private WebElement nextBtn;

   public LandingPage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
      this.wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
   }

   public void handleCookieBanner() {
      try {
         WebElement cookieBanner = (WebElement)this.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".cc-window")));
         ((JavascriptExecutor)this.driver).executeScript("arguments[0].style.display='none';", new Object[]{cookieBanner});
         Thread.sleep(300L);
      } catch (Exception var2) {
      }

   }

   public void closeChatIfPresent() {
      try {
         WebElement closeChatButton = (WebElement)this.wait.until(ExpectedConditions.elementToBeClickable(By.id("cross-btn")));
         ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{closeChatButton});
         closeChatButton.click();
         Thread.sleep(300L);
      } catch (Exception var2) {
         System.out.println("Chat close button not found or already closed.");
      }

   }

   public void enterZipAndContinue(String zip) throws InterruptedException {
      ((WebElement)this.wait.until(ExpectedConditions.visibilityOf(this.zipCode))).sendKeys(new CharSequence[]{"32756"});
      ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", new Object[]{this.nextBtn});
      Thread.sleep(300L);
      ((JavascriptExecutor)this.driver).executeScript("arguments[0].click();", new Object[]{this.nextBtn});
   }
}