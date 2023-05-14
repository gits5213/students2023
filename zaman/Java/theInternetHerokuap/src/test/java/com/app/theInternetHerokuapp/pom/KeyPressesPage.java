package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage extends BasePage{

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#target")
    public WebElement keyInputBox;
    public WebElement getKeyInputBox() {
        return keyInputBox;
    }
    @FindBy(css = "p#result")
    public WebElement keyMessage;
    public WebElement getKeyMessage() {
        return keyMessage;
    }
}
