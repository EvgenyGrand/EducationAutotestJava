package ui.pages.bspb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.AbsBasePages;

public class BspbMainMenu extends AbsBasePages {


    public BspbMainMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[id='popover-trigger-:Rqkrlj6bqmH1:']")
    public WebElement debitCards;

    @FindBy(xpath = "//*[contains(text(),'Партнеры и акции')]")
    public WebElement partnersAndDeals;
}
