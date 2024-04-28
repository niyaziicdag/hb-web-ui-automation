package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.time.Duration;

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
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Scenario failed.");
        }
        Driver.closeDriver();
    }
}
