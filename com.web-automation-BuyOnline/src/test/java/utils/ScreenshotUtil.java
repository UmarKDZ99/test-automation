package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
   public static String captureScreenshot(WebDriver driver, String testName) {
      String timestamp = (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());
      String path = "test-output/screenshots/" + testName + "_" + timestamp + ".png";
      File src = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File dest = new File(path);

      try {
         Files.createDirectories(dest.getParentFile().toPath());
         Files.copy(src.toPath(), dest.toPath());
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return path;
   }
}