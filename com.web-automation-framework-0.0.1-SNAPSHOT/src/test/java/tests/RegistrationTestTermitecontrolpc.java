package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basetest.BaseTest;
import pages.RegistrationPageTermitecontrolpc;

public class RegistrationTestTermitecontrolpc extends BaseTest {

    @Test(priority = 5)
    public void testUserRegistration() {
        test = extent.createTest("User Registration Test");

        String originalUrl = "https://staging.pestdefense.com/termitecontrol/postconstruction/";
        driver.get(originalUrl);
        test.log(Status.INFO, "Navigated to registration page");

        RegistrationPageTermitecontrolpc OM = new RegistrationPageTermitecontrolpc(driver);
        OM.ppR();
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