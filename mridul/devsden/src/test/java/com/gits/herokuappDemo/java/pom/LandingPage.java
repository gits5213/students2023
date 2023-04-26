package com.gits.herokuappDemo.java.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="li:nth-of-type(21) > a")
    public WebElement formAuthentication;

    @FindBy(css="li:nth-of-type(21) > a")
    public WebElement forgotPassword;

    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    public WebElement getForgotPassword() {
        return forgotPassword;
    }

}
