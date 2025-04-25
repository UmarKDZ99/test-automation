package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import basetest.BaseTest;
import pages.RegistrationPage;

@Listeners(listeners.TestListener.class)
public class RegistrationTest extends BaseTest {

	@Test(priority = 1)
	public void testUserRegistration() {
	    test = extent.createTest("User Registration Test");

	    String originalUrl = "https://staging.pestdefense.com/twr/";
	    driver.get(originalUrl);
	    test.log(Status.INFO, "Navigated to registration page");

	    RegistrationPage registrationPage = new RegistrationPage(driver);
	    registrationPage.register();
	    test.log(Status.INFO, "Form filled and submitted");

	    // Instead of checking for "success", check if URL has changed
	    String currentUrl = driver.getCurrentUrl();
	    boolean isRegistered = !currentUrl.equalsIgnoreCase(originalUrl);

	    if (isRegistered) {
	        test.log(Status.PASS, "User registered successfully");
	    } else {
	        test.log(Status.FAIL, "User registration failed");
	    }

	    Assert.assertTrue(isRegistered, "Registration failed!");
	}}
