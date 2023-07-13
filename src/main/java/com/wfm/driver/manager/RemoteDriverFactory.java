package com.wfm.driver.manager;

import com.wfm.config.ConfigFactory;
import enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver() {

        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();

        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {

        } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {

        }

         else{

            }

        return null;


    }

}
