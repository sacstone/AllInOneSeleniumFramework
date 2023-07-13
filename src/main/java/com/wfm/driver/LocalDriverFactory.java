package com.wfm.driver;

import com.wfm.config.ConfigFactory;
import com.wfm.driver.manager.ChromeManager;
import com.wfm.driver.manager.FirefoxManager;
import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){

        WebDriver driver = null;


        if(isBrowserChrome()) {
            driver = ChromeManager.getDriver();

        } else {

             driver = FirefoxManager.getDriver();

        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig()
                .browser() == BrowserType.CHROME;
    }


}
