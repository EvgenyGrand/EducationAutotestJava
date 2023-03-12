package ui.otus;

import ui.components.AssertionsSteps;
import ui.components.credsPrivateAccounts.InputCredsPrivateAccount;
import ui.data.DriverData;
import ui.factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.exception.BrowserNotSupportException;
import ui.pages.otus.MainPageOtus;
import ui.pages.otus.OtusPersonalAccountPage;
import ui.pages.otus.OtusPrivateAccountPage;

public class OtusCheckSignInPersonalAccount_Test {

    private WebDriver driver;


    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME);

    }

    @Test
    @DisplayName("Проверка регистрации в личном кабинете")
    public void CheckSigninPersonalAccount() throws InterruptedException {
        driver.manage().window().maximize();
        MainPageOtus mainPage = new MainPageOtus(driver);
        OtusPrivateAccountPage otusPrivateAccountPage = new OtusPrivateAccountPage(driver);
        OtusPersonalAccountPage otusPersonalAccountPage = new OtusPersonalAccountPage(driver);
        InputCredsPrivateAccount inputCredsPrivateAccount = new InputCredsPrivateAccount(driver);
        AssertionsSteps assertionsSteps = new AssertionsSteps(driver);

        mainPage.openFirstUrl();
        mainPage.jsClick(mainPage.registrationButton);
        inputCredsPrivateAccount.inputCreds(otusPrivateAccountPage.login, otusPrivateAccountPage.password, otusPrivateAccountPage.buttonEnter);
        assertionsSteps.checkContainsTitleElement(otusPersonalAccountPage.accountName, "Bonifatsii");
    }


    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }


    }


}
