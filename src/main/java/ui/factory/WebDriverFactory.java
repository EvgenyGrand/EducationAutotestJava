package ui.factory;

import ui.data.DriverData;
import ui.exception.BrowserNotSupportException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {


    public WebDriver getDriver(DriverData driverData) throws BrowserNotSupportException {


//        switch (driverData) {
//            case CHROME:
////
////                return new ChromeDriver();
//
//            default:
//                throw new BrowserNotSupportException(driverData);
//        }

        switch (driverData) {
            case CHROME:

                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            default:
                throw new BrowserNotSupportException(driverData);
        }
    }
}