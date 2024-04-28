package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookieButton;

    @FindBy(css = "input[aria-controls='react-autowhatever-1']")
    private WebElement inputSearchBar;

    @FindBy(xpath = "//div[contains(@class, 'searchBoxOld')]/i")
    private WebElement searchBar;

    @FindBy(xpath = "//div[contains(@class, 'searchBoxOld') and text()='ARA']")
    private WebElement searchButton;

    public void clickAcceptCookieButton() {
        PageHelper.clickElement(acceptCookieButton);
    }

    public void clickSearchBar() {
        PageHelper.clickElement(searchBar);
    }

    public void clickSearchButton() {
        PageHelper.clickElement(searchButton);
    }

    public void fillSearchBar(String searchText) {
        inputSearchBar.sendKeys(searchText);
    }
}
