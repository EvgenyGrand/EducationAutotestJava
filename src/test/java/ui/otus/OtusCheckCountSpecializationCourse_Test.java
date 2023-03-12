package ui.otus;

import ui.components.AssertionsSteps;
import ui.data.DriverData;
import ui.factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.exception.BrowserNotSupportException;
import ui.pages.otus.MainPageOtus;

public class OtusCheckCountSpecializationCourse_Test {

    private WebDriver driver;


    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME);

    }

    @Test
    @DisplayName("Проверка числа курсов со специализацией")
    public void checkCountSpecializationCourse() throws InterruptedException {
        driver.manage().window().maximize();
        MainPageOtus mainPage = new MainPageOtus(driver);
        AssertionsSteps assertionsSteps = new AssertionsSteps(driver);
        mainPage.openFirstUrl();
        assertionsSteps.checkCountCardsOfCourseStartWishValue(mainPage.cardsOFCourse, "Специализация", 13);
    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }
}
