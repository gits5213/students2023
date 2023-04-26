package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage {
    public ForgotPassword(WebDriver driver){
        super(driver);
    }
    //header validation
    @FindBy(css = "#content > div > h2")
    public WebElement forgotPasswordHeader;
    public WebElement getForgotPasswordHeader() {
        return forgotPasswordHeader;
    }
    //Email Input Field
    @FindBy(css = "#email")
    public WebElement emailInputField;
    public WebElement getEmailInputField() {
        return emailInputField;
    }
    //Retrieve Password Button
    @FindBy(css = "#form_submit")
    public WebElement retrievePasswordButton;
    public WebElement getRetrievePasswordButton() {
        return retrievePasswordButton;
    }
}
