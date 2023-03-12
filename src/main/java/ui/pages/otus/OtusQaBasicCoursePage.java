package ui.pages.otus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbsBasePages;

public class OtusQaBasicCoursePage extends AbsBasePages {
    public OtusQaBasicCoursePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href=\"/lessons/qa-engineer\"]")
    public WebElement qaBasicCourse;

    @FindBy(css = "h1.sc-1og4wiw-0.s2pydo-1")
    public WebElement titleQaBasicCourse;

    @FindBy(xpath = "//p[contains(text(),'4 месяца')]")
    public WebElement timeOfCourse;

}
