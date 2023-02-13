package pages.otus;

import components.ApplicationSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class OtusQaBasicCoursePage extends AbsBasePages {
    public OtusQaBasicCoursePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href=\"/lessons/qa-engineer\"]")
    public WebElement qaBasicCourse;

    @FindBy(css = "h1.sc-182qdc9-1.gjnars")
    public WebElement titleQaBasicCourse;

    @FindBy(xpath = "//p[contains(text(),'4 месяца')]")
    public WebElement timeOfCourse;

}
