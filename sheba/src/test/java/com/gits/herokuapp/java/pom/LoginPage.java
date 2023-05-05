package com.gits.herokuapp.java.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input#username")
    public WebElement username;

    @FindBy(css="input#password")
    public WebElement password;

    @FindBy(css=".fa.fa-2x.fa-sign-in")
    public WebElement loginBtn;

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }



}
