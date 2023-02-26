package ui.exception;

import ui.data.DriverData;

import java.util.Locale;

public class BrowserNotSupportException extends Exception {
    public BrowserNotSupportException(DriverData browserType) {
        super(String.format("Browser %s not supported", browserType.name().toLowerCase(Locale.ROOT)));
    }
}

