package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='number']")
    public WebElement inputBox;
    public WebElement getInputBox() {
        return inputBox;
    }
}
