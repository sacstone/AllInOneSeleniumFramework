package com.wfm.driver;


import org.openqa.selenium.WebDriver;


public class Driver {

    public static void initDriver(){ // Local DriverFactory

        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.com");

    }

    public static void quitDriver(){
      //  driver.quit();
    }
}
