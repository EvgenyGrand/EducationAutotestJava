package ui.pages.otus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbsBasePages;

import java.util.List;

public class MainPageOtus extends AbsBasePages {

    public MainPageOtus(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.header3__button-sign-in")
    public WebElement registrationButton;

    @FindBy(css = "div.lessons__new-item-title")
    public List<WebElement> cardsOFCourse;












}
