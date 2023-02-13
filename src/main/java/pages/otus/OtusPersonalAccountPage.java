package pages.otus;

import components.ApplicationSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class OtusPersonalAccountPage extends AbsBasePages {
    public OtusPersonalAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.header3__nav-item.header3__nav-item-learning")
    public WebElement tagLearning;

    @FindBy(css = "span.header3__user-info-name")
    public WebElement accountName;


}
