package otus;

import ui.components.AssertionsSteps;
import ui.data.DriverData;
import ui.factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.exception.BrowserNotSupportException;
import ui.pages.otus.OtusEducationMenu;
import ui.pages.otus.OtusPageOfTestingCourse;
import ui.pages.otus.OtusQaBasicCoursePage;

public class OtusCheckParamQABasic_Test {

    private WebDriver driver;


    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

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
