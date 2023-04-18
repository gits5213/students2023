package com.gits.Herokuapp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(css = "#content > ul > li:nth-child(21) > a")
        public WebElement formAuthentication;
    }
