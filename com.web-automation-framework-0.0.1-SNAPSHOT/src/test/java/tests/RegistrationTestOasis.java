package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basetest.BaseTest;
import pages.RegistrationPageOasis;

public class RegistrationTestOasis extends BaseTest {

    @Test(priority = 2)
    public void testUserRegistration() {
        test = extent.createTest("User Registration Test");

        String originalUrl = "https://staging.pestdefense.com/oasys/";
        driver.get(originalUrl);
        test.log(Status.INFO, "Navigated to registration page");

        RegistrationPageOasis RP = new RegistrationPageOasis(driver);
        RP.oR();
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