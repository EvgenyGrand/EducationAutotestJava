package factory;

import data.DriverData;
import exception.BrowserNotSupportException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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