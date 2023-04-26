package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css="input#username")
    public WebElement username;
    public WebElement getUsername() {
        return username;
    }

    @FindBy(css="input#password")
    public WebElement password;
    public WebElement getPassword() {
        return password;
    }

    @FindBy(css=".fa.fa-2x.fa-sign-in")
    public WebElement loginBtn;
    public WebElement getLoginBtn() {
        return loginBtn;
    }

    @FindBy(css = "div#flash")
    public WebElement errorMessage;
    public WebElement errorMessage() {
        return errorMessage;
    }






}
