package otus;

import components.AssertionsSteps;
import data.DriverData;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.otus.OtusEducationMenu;
import pages.otus.OtusPageOfTestingCourse;
import pages.otus.OtusQaBasicCoursePage;

public class OtusCheckParamQABasic_Test {

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
    @DisplayName("Проверка соответствия основных заголовков карточки курса")
    public void checkOtusCourses() throws InterruptedException {
        driver.manage().window().maximize();
        OtusEducationMenu educationMenu = new OtusEducationMenu(driver);
        OtusPageOfTestingCourse pageOfTestingCourse = new OtusPageOfTestingCourse(driver);
        AssertionsSteps assertionsSteps = new AssertionsSteps(driver);
        OtusQaBasicCoursePage qaBasicCoursePage = new OtusQaBasicCoursePage(driver);


        educationMenu.openFirstUrl();
        educationMenu.navigationDropDownMenu(educationMenu.firstLevelMenu, educationMenu.secondLevelMenu);
        qaBasicCoursePage.jsClick(qaBasicCoursePage.qaBasicCourse);
        assertionsSteps.checkEqualsTitleElement(qaBasicCoursePage.titleQaBasicCourse, "QA Engineer. Basic");
        assertionsSteps.checkContainsTitleElement(qaBasicCoursePage.timeOfCourse, "4 месяца");
    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }


    }

}
