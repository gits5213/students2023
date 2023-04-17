package com.gits.herokuapp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthenticationValidate extends BasePage{

    public FormAuthenticationValidate(WebDriver driver) {
        super(driver);
    }

    //Enter valid username
    @FindBy(css = "#username")
    public WebElement userName;

    //Enter invalid password
    @FindBy(css = "#password")
    public WebElement password;

    //click on login button
    @FindBy(css = "#login > button > i")
    public WebElement loginClick;

    public WebElement getUserName() {
        return userName;
    }
    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginClick() {
        return loginClick;
    }


}
