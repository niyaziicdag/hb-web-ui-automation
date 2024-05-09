package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseSteps {
    BasePage basePage = new BasePage();

    @When("open the homepage")
    public void openHomePage() {
        basePage.openHomepage();
    }
}
