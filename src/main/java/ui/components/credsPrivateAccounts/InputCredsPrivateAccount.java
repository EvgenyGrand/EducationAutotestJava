package ui.components.credsPrivateAccounts;

import ui.components.ApplicationSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InputCredsPrivateAccount extends ApplicationSteps implements ICredsPrivateAccounts {
    public InputCredsPrivateAccount(WebDriver driver) {
        super(driver);
    }

    private final String login = System.getProperty("login");
    private final String password = System.getProperty("password");

    @Override
    public String inputLogin() {
        System.getProperty(login);
        return login;
    }
    @Override
    public String inputPassword() {
        System.getProperty(password);
        return password;
    }


    public void inputCreds(WebElement login, WebElement password, WebElement buttonEnter) {
        explicitWait(login);
        login.clear();
        login.sendKeys(inputLogin());
        password.clear();
        password.sendKeys(inputPassword());
        buttonEnter.click();


    }
}
