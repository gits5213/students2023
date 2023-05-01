package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginValidationWithExcelDataPage extends BasePage{

    public LoginValidationWithExcelDataPage(WebDriver driver) {
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
    public WebElement message;
    public WebElement message() {
        return message;
    }

}
