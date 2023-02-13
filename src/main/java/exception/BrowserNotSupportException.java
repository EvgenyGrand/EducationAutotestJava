package exception;

import data.DriverData;
import org.openqa.selenium.remote.BrowserType;

import java.util.Locale;

public class BrowserNotSupportException extends Exception {
    public BrowserNotSupportException(DriverData browserType) {
        super(String.format("Browser %s not supported", browserType.name().toLowerCase(Locale.ROOT)));
    }
}

