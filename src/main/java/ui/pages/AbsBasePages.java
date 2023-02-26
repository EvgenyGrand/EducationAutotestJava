package ui.pages;

import ui.components.ApplicationSteps;
import org.openqa.selenium.WebDriver;

public abstract class AbsBasePages extends ApplicationSteps {
    public AbsBasePages(WebDriver driver) {
        super(driver);
    }
}
