package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage {
    public ForgotPassword(WebDriver driver){
        super(driver);
    }


    //Forgot Password Header
    @FindBy(css = "#content > div > h2")
    public WebElement forgotPasswordHeader;
    public WebElement getForgotPasswordHeader(){
        return forgotPasswordHeader;
    }
    //EmailField
    @FindBy(css = "#email")
    public WebElement emailField;
    public WebElement getEmailField(){
        return emailField;
    }
    //passwordRetrieveButton
    @FindBy(css = "#form_submit > i")
    public WebElement passwordRetrieveButton;
    public WebElement getPasswordRetrieveButton(){
        return passwordRetrieveButton;
    }
    @FindBy(css = "body > h1")
    public WebElement alertText;

    public WebElement getAlertText(){
        return alertText;
    }
}
