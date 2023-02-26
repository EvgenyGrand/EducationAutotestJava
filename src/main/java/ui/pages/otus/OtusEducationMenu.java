package ui.pages.otus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbsBasePages;

public class OtusEducationMenu extends AbsBasePages {

    public OtusEducationMenu(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Обучение']")
    public WebElement firstLevelMenu;

    @FindBy(xpath = "//*[contains(text(),'Тестирование')]")
    public WebElement secondLevelMenu;



}
