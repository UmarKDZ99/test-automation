package tests;

import basetest.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.GmailLightOTPExtractor;

public class LoginTest extends BaseTest {

    @Test(priority = 2, dependsOnMethods = "tests.RegistrationTest.testUserRegistration")
    public void testLoginWithOTP() {
        test = extent.createTest("Login Test with OTP", "Verifying login with extracted OTP");

        try {
            driver.get("https://maas-uat.futurework.com.sa/login");
            LoginPage loginPage = new LoginPage(driver);

            String email = RegistrationTest.getRegisteredEmail();
            String password = RegistrationTest.getRegisteredPassword();
            loginPage.login(email, password);

            Thread.sleep(2000);

            String mainWindowHandle = driver.getWindowHandle();
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://mail.google.com/mail/u/0/#inbox");

            Thread.sleep(8000);
            driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("umardurranix@gmail.com");
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//button//child::span[text() = 'Next']")).click();
            Thread.sleep(120000);
            
          
            
            
            GmailLightOTPExtractor otpExtractor = new GmailLightOTPExtractor();
            String otp = otpExtractor.fetchOTP(driver);

            if (otp.isEmpty()) {
                test.fail("OTP extraction failed!");
                Assert.fail("OTP extraction failed.");
            } else {
                driver.switchTo().window(mainWindowHandle);
                loginPage.enterOTP(otp);
            }

            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed!");
            test.pass("Successfully logged in.");
        } catch (Exception e) {
            test.fail("Test failed due to exception: " + e.getMessage());
            Assert.fail("Login Test failed.");
        }
    }
}
