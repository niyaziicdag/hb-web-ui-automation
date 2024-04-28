package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;

public class SearchSteps {
    private WebDriver webDriver = Hooks.webDriver;
    SearchPage searchPage = new SearchPage(webDriver);

    @When("click first product on search page")
    public void clickFirstProduct() {
        searchPage.clickFirstProduct();
    }

    @Then("verify that the successfully search")
    public void clickSearchBar() {
        searchPage.verifySearchPage();
    }
}
