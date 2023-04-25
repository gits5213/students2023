package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class FormAuthentication extends BasePage {
    public FormAuthentication(WebDriver driver){
        super(driver);
    }
    //Form Authentication Header
    @FindBy(css = "#content > div > h2")
    public WebElement formAuthenticationHeader;
    public WebElement getFormAuthenticationHeader(){
        return formAuthenticationHeader;
    }
    //Form Authentication Paragraph
    @FindBy(css = "#content > div > h4")
    public WebElement formAuthenticationPara;
    public WebElement getFormAuthenticationPara(){
        return formAuthenticationPara;
    }
    //UserNameField
    @FindBy(css = "#username")
    public WebElement usernameField;
    public WebElement getUsernameField(){
        return usernameField;
    }
    //PasswordInputField
    @FindBy(css = "#password")
    public WebElement passwordInputField;
    public WebElement getPasswordInputField(){
        return passwordInputField;
    }
    //Login Button
    @FindBy(css = "#login > button > i")
    public WebElement LoginButton;
    public WebElement getLoginButton(){
        return LoginButton;
    }
    //Alert
    @FindBy(css = "#flash")
    public WebElement alert;
    public WebElement getAlert(){
        return alert;
    }
}
