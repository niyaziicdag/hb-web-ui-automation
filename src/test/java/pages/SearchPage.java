package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class SearchPage extends PageHelper {

    public SearchPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "i0")
    private WebElement firstSearchResult;

    public void clickFirstProduct() {
        clickElement(firstSearchResult);
    }

    public void verifySearchPage() {
        firstSearchResult.isEnabled();
    }
}
