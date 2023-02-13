package otus;

import components.AssertionsSteps;
import data.DriverData;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.otus.OtusEducationMenu;
import pages.otus.OtusPageOfTestingCourse;

public class OtusCheckCountCurse_Test {


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
    @DisplayName("Проверка количества курсов тестирования")
    public void checkOtusCourses() throws InterruptedException {
        driver.manage().window().maximize();
        OtusEducationMenu educationMenu = new OtusEducationMenu(driver);
        OtusPageOfTestingCourse pageOfTestingCourse = new OtusPageOfTestingCourse(driver);
        AssertionsSteps assertionsSteps = new AssertionsSteps(driver);
        educationMenu.openFirstUrl();
        educationMenu.navigationDropDownMenu(educationMenu.firstLevelMenu, educationMenu.secondLevelMenu);
        pageOfTestingCourse.jsClick(pageOfTestingCourse.buttonPagination);
        assertionsSteps.checkCountCourse(pageOfTestingCourse.cardsOfCurse, 16);


    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }

    }
}
