package ui.bspb;

import ui.components.AssertionsSteps;
import ui.data.DriverData;
import ui.factory.WebDriverFactory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import ui.exception.BrowserNotSupportException;
import ui.pages.bspb.BspbMainMenu;
import ui.pages.bspb.BspbYarkoPage;


public class BspbCheckActualDateOffersYarko_Test  {


    private WebDriver driver;

    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME);

    }

    @Test
    @DisplayName("Проверка: дата начала офферов ярко больше текущей")
    public void checkYarkoOffersDate() throws InterruptedException {
        driver.manage().window().maximize();
        BspbMainMenu bspbMainMenu = new BspbMainMenu(driver);
        BspbYarkoPage bspbYarkoPage = new BspbYarkoPage(driver);
        AssertionsSteps assertionsSteps = new AssertionsSteps(driver);
        bspbMainMenu.openSecondUrl();
        bspbMainMenu.navigationDropDownMenu(bspbMainMenu.debitCards, bspbMainMenu.partnersAndDeals);
        assertionsSteps.checkCompareDateYarkoOffers(bspbYarkoPage.yarkoOffers);


    }
    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }


    }
}
