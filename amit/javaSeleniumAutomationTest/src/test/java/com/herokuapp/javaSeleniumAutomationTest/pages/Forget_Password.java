package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forget_Password extends BasePage {

    public Forget_Password(WebDriver driver){
        super(driver);
    }

    //Header
    @FindBy(xpath = "//div[@id='content']//h2[.='Forgot Password']")
    public WebElement forgotPasswordHeader;
    public WebElement getForgotPasswordHeader() {
        return forgotPasswordHeader;
    }

    //EmailField
    @FindBy(xpath="/html//input[@id='email']")
    public WebElement emailField;
    public WebElement getEmailField(){
        return emailField;
    }

    //Retrieve Password Button
    @FindBy(xpath = "//button[@id='form_submit']/i[@class='icon-2x icon-signin']")
    public WebElement retrievePasswordButton;
    public WebElement getRetrievePasswordButton() {
        return retrievePasswordButton;
    }
}
