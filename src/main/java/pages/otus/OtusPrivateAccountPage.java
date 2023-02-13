package pages.otus;

import components.ApplicationSteps;
import components.credsPrivateAccounts.ICredsPrivateAccounts;
import components.credsPrivateAccounts.InputCredsPrivateAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OtusPrivateAccountPage extends ApplicationSteps {
    public OtusPrivateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='text'][placeholder='Электронная почта']")
    public WebElement login;

    @FindBy(css = "input[type='password']")
    public WebElement password;

    @FindBy(css = "button[class$='new-button_md'][type='submit']")
    public WebElement buttonEnter;




}

