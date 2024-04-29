package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser() {
        System.out.println("Opening Browser");
        webDriver = Driver.getDriver();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @After
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            Object driver = webDriver;
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
            LocalDateTime now = LocalDateTime.now();
            String timestamp = dtf.format(now);
            String screenshotName = "screenshot_" + timestamp + ".png";
            String screenshotFolderPath = "screenshots/";
            createFolder(screenshotFolderPath);
            String screenshotPath = screenshotFolderPath + screenshotName;
            saveScreenshot(screenshot, screenshotPath);
            scenario.attach(screenshot, "image/png", screenshotName);
        }
        Driver.closeDriver();
    }

    private void createFolder(String folderPath) {
        try {
            Path path = Paths.get(folderPath);
            Files.createDirectories(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveScreenshot(byte[] screenshot, String screenshotPath) {
        try {
            Files.write(Paths.get(screenshotPath), screenshot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
