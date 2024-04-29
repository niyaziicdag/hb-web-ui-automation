package pages;

import config.BaseConfig;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.PageHelper;

public class BasePage extends PageHelper {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void HomePage() {
        String url = System.getProperty("base.url") != null ? System.getProperty("base.url") : BaseConfig.getInstance().getUrl();
        Driver.getDriver().get(url);
    }
}
