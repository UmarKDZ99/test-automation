package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailLightOTPExtractor {

    public String fetchOTP(WebDriver driver) {
        try {
            driver.get("https://mail.google.com/mail/u/0/#inbox");
            Thread.sleep(5000); // Wait for Gmail to load

            // Locate the latest email (adjust locator based on Gmail UI changes)
            List<WebElement> emails = driver.findElements(By.cssSelector("tr.zA"));
            if (emails.isEmpty()) {
                System.out.println("No emails found.");
                return "";
            }

            emails.get(0).click(); // Open the latest email
            Thread.sleep(3000); // Wait for email content to load

            // Extract OTP using regex
            WebElement emailBody = driver.findElement(By.cssSelector("div.a3s"));
            String emailText = emailBody.getText();

            Pattern otpPattern = Pattern.compile("\\b\\d{6}\\b"); // Looking for a 6-digit OTP
            Matcher matcher = otpPattern.matcher(emailText);

            if (matcher.find()) {
                return matcher.group(0);
            } else {
                System.out.println("No OTP found in email content.");
                return "";
            }

        } catch (Exception e) {
            System.out.println("Error extracting OTP: " + e.getMessage());
            return "";
        }
    }
}
