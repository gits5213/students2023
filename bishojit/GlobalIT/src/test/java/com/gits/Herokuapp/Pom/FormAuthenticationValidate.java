package com.gits.Herokuapp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthenticationValidate extends BasePage{

    public FormAuthenticationValidate(WebDriver driver) {
        super(driver);
    }

         //Enter username
         @FindBy(css = "#username")
         public WebElement username;

    public WebElement getUsername() {
        return username;
    }

    //Enter  password
    @FindBy(css = "#password")
    public WebElement password;

    public WebElement getPassword() {
        return password;
    }


    //click on login button
    @FindBy(css = "#login > button > i")
    public WebElement logBtn;

    public WebElement getLogBtn() {
        return logBtn;
    }
}
