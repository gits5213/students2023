package com.gits.herokuappDemo.java.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //Enter valid username
    @FindBy(css="#username")
    public WebElement username;

    //Enter valid password
    @FindBy(css="#password")
    public WebElement password;

    //Enter valid LoginButton
    @FindBy(css="#login > button > i")
    public WebElement loginbutton;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginbutton() {
        return loginbutton;
    }

}
