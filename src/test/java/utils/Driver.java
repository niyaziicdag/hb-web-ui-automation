package utils;

import config.BaseConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    static WebDriver driver;
    static ChromeOptions chromeOptions = new ChromeOptions();
    static FirefoxOptions firefoxOptions = new FirefoxOptions();


    public static WebDriver getDriver() {
        if (driver == null) {
            switch (BaseConfig.getInstance().getBrowser()) {
                case "chrome":
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    if (BaseConfig.getInstance().getHeadless()) chromeOptions.addArguments("--headless");
                    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "safari":
                    System.setProperty("webdriver.safari.driver", "path/to/safaridriver");
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                default:
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                    driver = new ChromeDriver(chromeOptions);
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
