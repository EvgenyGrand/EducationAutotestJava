package otus;

import components.AssertionsSteps;
import data.DriverData;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.otus.MainPageOtus;

public class OtusCheckCountSpecializationCourse_Test {

    private WebDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void initDriver() throws exception.BrowserNotSupportException {

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
