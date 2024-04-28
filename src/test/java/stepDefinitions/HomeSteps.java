package stepDefinitions;

import config.BaseConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomeSteps {
    private WebDriver webDriver = Hooks.webDriver;
    HomePage homePage = new HomePage(webDriver);

    @When("click search bar on homepage")
    public void clickSearchBar() {
        homePage.clickSearchBar();
    }

    @When("click accept cookie button on homepage")
    public void clickAcceptCookie() {
        homePage.clickAcceptCookieButton();
    }

    @When("click search button on homepage")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @When("fill search bar with {string} on homepage")
    public void clickSearchBar(String search) {
        homePage.fillSearchBar(search);
    }

    @Then("verify that home page is visible successfully")
    public void homepageVisibleSuccessfully() {
        String expectedUrl = webDriver.getCurrentUrl();
        String actualUrl = BaseConfig.getInstance().getUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
