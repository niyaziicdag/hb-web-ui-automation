package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class PageHelper {
    private static WebDriver driver = Driver.getDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));;


    public static void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static String getElementText(WebElement element) {
        return element.getText();
    }

    public static void switchWindow() {
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
