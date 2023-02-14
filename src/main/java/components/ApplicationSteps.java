package components;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public abstract class ApplicationSteps {

    private final String hostname = System.getProperty("base.url").toLowerCase(Locale.ROOT);
    private final String secondHostName = System.getProperty("baseSecond.url").toLowerCase(Locale.ROOT);
    private final String explisityWait = System.getProperty("explisityWait").toLowerCase(Locale.ROOT);


    protected WebDriver driver;
    protected int time = 10;
    protected Actions actions;
    protected Select select;

    DateTimeFormatter formats = DateTimeFormatter.ofPattern("d MMMM yyyy");


    public ApplicationSteps(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);

        PageFactory.initElements(driver, this);

    }

    public void openFirstUrl() {
        driver.get(hostname);
    }

    public void openSecondUrl() {
        driver.get(secondHostName);
    }


    public void explicitWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element) {
        explicitWait(element);
        element.click();
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).build().perform();

    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void navigationDropDownMenu(WebElement firstLevel, WebElement secondLevel) throws InterruptedException {
        scrollToElement(firstLevel);
        explicitWait(firstLevel);
        firstLevel.click();
        explicitWait(secondLevel);
        secondLevel.click();


    }
    public void selectDropdownMenu(WebElement element, String value) throws InterruptedException {
        explicitWait(element);
        Select select = new Select(element);
        select.selectByValue(value);


    }

}



