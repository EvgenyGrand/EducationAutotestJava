package bspb;

import components.AssertionsSteps;
import data.DriverData;
import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.bspb.BspbMainMenu;
import pages.bspb.BspbYarkoPage;

public class BspbCheckSelectYarkoOffer_Test {
    private WebDriver driver;


    @BeforeEach
    public void initDriver() throws exception.BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME);

    }
    @Test
    @DisplayName("Проверка: выбор одного оффера в фильтрах")
    public void checkYarkoOffersDate() throws InterruptedException {
        driver.manage().window().maximize();
        BspbMainMenu bspbMainMenu = new BspbMainMenu(driver);
        BspbYarkoPage bspbYarkoPage = new BspbYarkoPage(driver);
        AssertionsSteps assertionsSteps = new AssertionsSteps(driver);
        bspbMainMenu.openSecondUrl();
        bspbMainMenu.navigationDropDownMenu(bspbMainMenu.debitCards, bspbMainMenu.partnersAndDeals);
        bspbYarkoPage.selectDropdownMenu(bspbYarkoPage.yarkoBonus, "SAVE");
        bspbYarkoPage.selectDropdownMenu(bspbYarkoPage.yarkoCategories, "6");
        bspbYarkoPage.selectDropdownMenu(bspbYarkoPage.yarkoPartners, "6");
        bspbYarkoPage.selectDropdownMenu(bspbYarkoPage.yarkoCities, "2");
        assertionsSteps.checkContainsTitleElement(bspbYarkoPage.yarkoOfferStoletov, "Сеть аптек «Доктор Столетов»");
    }
    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }

    }
}
