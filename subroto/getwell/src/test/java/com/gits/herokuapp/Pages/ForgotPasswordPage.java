package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

    public ForgotPasswordPage(WebDriver driver){
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
}
