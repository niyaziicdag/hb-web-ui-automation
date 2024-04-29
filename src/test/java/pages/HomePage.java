package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class HomePage extends PageHelper{

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

    @FindBy(css = "#react-autowhatever-1--item-1")
    private WebElement searchResults;

    @FindBy(css = "#react-autowhatever-1")
    private WebElement atLeastCharacters;

    public void clickAcceptCookieButton() {
        clickElement(acceptCookieButton);
        waitUntilElementIsNotDisplayed(acceptCookieButton);
    }

    public void clickSearchBar() {
        clickWithJavaScript(searchBar);
    }

    public void verifyAtLeastCharacters() {
        atLeastCharacters.isDisplayed();
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void fillSearchBar(String searchText) {
        inputSearchBar.sendKeys(searchText);
    }

    public void verifyResultsDisplayed() {
        searchResults.isDisplayed();
    }
}