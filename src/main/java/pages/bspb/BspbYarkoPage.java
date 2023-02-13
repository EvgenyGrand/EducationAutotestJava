package pages.bspb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

import java.util.List;

public class BspbYarkoPage extends AbsBasePages {
    public BspbYarkoPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "p.chakra-text.css-1hmsv1p")
    public List<WebElement> yarkoOffers;

    @FindBy(xpath = "//select[./option[text()='Тип акций']]")
    public WebElement yarkoBonus;

    @FindBy(xpath = "//select[./option[text()='Категории']]")
    public WebElement yarkoCategories;

    @FindBy(xpath = "//select[./option[text()='Партнеры']]")
    public WebElement yarkoPartners;

    @FindBy(xpath = "//select[./option[text()='Город']]")
    public WebElement yarkoCities;

    @FindBy(xpath = "//a[@href=\"/yarko/stoletov-save\"]//*[contains(text(),'Доктор Столетов')]")
    public WebElement yarkoOfferStoletov;






}
