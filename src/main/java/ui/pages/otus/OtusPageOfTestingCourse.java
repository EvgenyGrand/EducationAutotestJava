package ui.pages.otus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbsBasePages;

import java.util.List;

public class OtusPageOfTestingCourse extends AbsBasePages {
    public OtusPageOfTestingCourse(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.icwxwp-0.eHGZyC")
    public List<WebElement> cardsOfCurse;

    @FindBy(xpath = "//button[contains(text(),'Показать еще')]")
    public WebElement buttonPagination;


}
