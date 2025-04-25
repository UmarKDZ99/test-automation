package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basetest.BaseTest;
import pages.RegistrationPageMosquito;

public class RegistrationTestMosquito extends BaseTest {

    @Test(priority = 3)
    public void testUserRegistration() {
        test = extent.createTest("User Registration Test");

        String originalUrl = "https://staging.pestdefense.com/mosquito-control/";
        driver.get(originalUrl);
        test.log(Status.INFO, "Navigated to registration page");

        RegistrationPageMosquito RM = new RegistrationPageMosquito(driver);
        RM.mR();
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