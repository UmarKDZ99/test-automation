package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basetest.BaseTest;
import pages.RegistrationPageTaexxRS;

public class RegistrationTestTaexxRS extends BaseTest {

    @Test(priority = 4)
    public void testUserRegistration() {
        test = extent.createTest("User Registration Test");

        String originalUrl = "https://staging.pestdefense.com/taexx-system-registration/";
        driver.get(originalUrl);
        test.log(Status.INFO, "Navigated to registration page");

        RegistrationPageTaexxRS ZM = new RegistrationPageTaexxRS(driver);
        ZM.vR();
        test.log(Status.INFO, "Form filled and submitted");

        String currentUrl = driver.getCurrentUrl();
        boolean isRegistered = !currentUrl.equalsIgnoreCase(originalUrl);

        if (isRegistered) {
            test.log(Status.PASS, "User registered successfully");
        } else {
            test.log(Status.FAIL, "User registration failed");
        }

        Assert.assertTrue(isRegistered, "Registration failed!");
    }
}