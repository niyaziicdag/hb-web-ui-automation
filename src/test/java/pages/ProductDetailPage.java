package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class ProductDetailPage extends PageHelper {

    public ProductDetailPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "reviewsTabTrigger")
    private WebElement commentsCount;

    @FindBy(xpath = "//div[@itemprop= 'review'][1]//div[contains(@class, 'thumbsUp')]")
    private WebElement likeFirstCommentButton;

    @FindBy(id = "productReviews")
    private WebElement reviewsTab;

    @FindBy(xpath = "//div[@itemprop= 'review'][1]//div[contains(@class, 'ReviewCard-module') and text()='Bildir']//../div[contains(@class, 'ReviewCard-module')][2]")
    private WebElement thanksText;

    public void clickReviewsTab() {
        switchWindow();
        clickElement(reviewsTab);
    }

    public void clickLikeCommentButton() {
        clickElement(likeFirstCommentButton);
    }

    public void checkCommentsAndVerifyMessage() {
        String[] commentCountText = getElementText(commentsCount).split("[^0-9]+");
        int commentCount = Integer.parseInt(commentCountText[1]);
        if (commentCount != 0) {
            clickLikeCommentButton();
            verifyThanksToMessage();
        } else {
            System.out.println("No comments found!");
        }
    }

    public void verifyThanksToMessage() {
        String actualMessage = getElementText(thanksText);
        String expectedMessage = "Teşekkür Ederiz.";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}