package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseSteps {
    private WebDriver webDriver = Hooks.webDriver;
    BasePage basePage = new BasePage();

    public BaseSteps() {
    }

    @When("open the homepage")
    public void openHomePage() {
        basePage.HomePage();
    }
}
