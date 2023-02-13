package components.credsPrivateAccounts;

import org.openqa.selenium.WebElement;

public interface ICredsPrivateAccounts {

    String inputLogin();
    String inputPassword();
    void inputCreds(WebElement login, WebElement password, WebElement buttonEnter);

}
