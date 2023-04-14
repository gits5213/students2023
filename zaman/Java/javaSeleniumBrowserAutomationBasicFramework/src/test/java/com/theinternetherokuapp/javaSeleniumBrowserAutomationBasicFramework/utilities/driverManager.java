package com.theinternetherokuapp.javaSeleniumBrowserAutomationBasicFramework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverManager {

    WebDriver driver = null;
    String browser = "chrome"; //change this to switch browser.


    public WebDriver getDriver() {



        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser name: " + browser);
        }

        return driver;



    }

}
