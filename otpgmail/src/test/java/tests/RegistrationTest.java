package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import java.time.Instant;

public class RegistrationTest extends BaseTest {
    private static String registeredEmail;
    private static String registeredPassword;

    public static String getRegisteredEmail() {
        return registeredEmail;
    }

    public static String getRegisteredPassword() {
        return registeredPassword;
    }

    @Test(priority = 1)
    public void testUserRegistration() {
        test = extent.createTest("User Registration Test", "Verifying successful user registration");

        try {
            driver.get("https://maas-uat.futurework.com.sa/sme-register");
            RegistrationPage registrationPage = new RegistrationPage(driver);

            
            String name = "Umar Test";
            String phone = "00966543029869";
            registeredEmail = "zu914973@gmail.com";
            registeredPassword = "Zum@1122";

            test.info("Registering with Email: " + registeredEmail);

            registrationPage.register(name, phone, registeredEmail, registeredPassword, registeredPassword);

            test.info("Waiting for confirmation...");
            boolean isRegistered = registrationPage.isRegistrationSuccessful();

            if (!isRegistered) {
                test.fail("Registration failed!");
                Assert.fail("User registration was unsuccessful.");
            } else {
                test.pass("User registered successfully with email: " + registeredEmail);
            }
        } catch (Exception e) {
            test.fail("Registration test failed due to exception: " + e.getMessage());
            Assert.fail("Registration Test failed.");
        }
    }
}
