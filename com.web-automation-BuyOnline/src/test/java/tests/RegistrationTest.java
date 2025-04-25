package tests;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.PropertyDetailsPage;

public class RegistrationTest extends BaseTest {
   @Test(
      priority = 1
   )
   public void testEnterZipOnLandingPage() throws InterruptedException {
      this.test = this.extent.createTest("Step 1: Enter ZIP on Landing Page");
      this.driver.get("https://staging.pestdefense.com/buy-online/?debug=true#!/landing-page");
      LandingPage landingPage = new LandingPage(this.driver);
      landingPage.handleCookieBanner();
      landingPage.closeChatIfPresent();
      landingPage.enterZipAndContinue("32756");
      this.test.pass("ZIP entered and continued to next step.");
   }

   @Test(priority = 2)
   public void testFillPropertyDetails() throws InterruptedException {
      this.test = this.extent.createTest("Step 2: Fill Property Details");
      PropertyDetailsPage propertyPage = new PropertyDetailsPage(this.driver);
      propertyPage.fillPropertyDetails();
      this.test.pass("Property details filled successfully.");
   }
}