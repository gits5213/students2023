package com.internet.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthentication extends BasePage {

    public FormAuthentication(WebDriver driver) {
        super(driver);
    }
    //Header 1 Validation
    @FindBy(css = "#content > div > h2")
    public WebElement formAuthLoginPageHeader1;
    public WebElement getFormAuthLoginPageHeader1() {
        return formAuthLoginPageHeader1;
    }
    //Sub-Header 2 Validation
    @FindBy(css = "#content > div > h4")
    public WebElement formAuthSubHeader2;
    public WebElement getFormAuthSubHeader2() {
        return formAuthSubHeader2;
    }
    //Username input field Validation
    @FindBy(css = "#username")
    public WebElement userNameInputField;
    public WebElement getUserNameInputField() {
        return userNameInputField;
    }
    //Password input field Validation
    @FindBy(css = "#password")
    public WebElement passwordInputField;
    public WebElement getPasswordInputField() {
        return passwordInputField;
    }
    //Login Button Validation
    @FindBy(css = "#login > button")
    public WebElement loginButton;
    public WebElement getLoginButton() {
        return loginButton;
    }

    //Secure Message Area
    @FindBy(css = "#flash")
    public WebElement secureMessageArea;
    public WebElement getSecureMessageArea() {
        return secureMessageArea;
    }




}
