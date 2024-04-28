package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ProductDetailPage;

public class ProductDetailSteps {

    private WebDriver webDriver = Hooks.webDriver;
    ProductDetailPage productDetailPage = new ProductDetailPage(webDriver);

    @When("click reviews tab on product detail page")
    public void clickReviewsTab() {
        productDetailPage.clickReviewsTab();
    }

    @Then("verify thank you message on the number of comments on product detail page")
    public void checkCommentsAndVerifyMessage() {
        productDetailPage.checkCommentsAndVerifyMessage();
    }

}
