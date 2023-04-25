package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landingPage extends BasePage {

    public landingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="li:nth-of-type(21) > a")
    public WebElement formAuthentication;

    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    @FindBy(css="li:nth-of-type(20) > a")
    public WebElement forgotPassword;

    public WebElement getForgotPassword() {
        return forgotPassword;
    }
}
