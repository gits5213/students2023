package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends BasePage{
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=checkbox]")
    public WebElement checkBox;
    public WebElement getCheckBox() {
        return checkBox;
    }

    @FindBy(css = "form#checkbox-example > button[type='button']")
    public WebElement addRmvCheckBoxBtn;
    public WebElement getAddRmvCheckBoxBtn() {
        return addRmvCheckBoxBtn;
    }

    @FindBy(css = "form#input-example > input[type='text']")
    public WebElement textBox;
    public WebElement getTextBox() {
        return textBox;
    }

    @FindBy(css = "form#input-example > button[type='button']")
    public WebElement enableDisableTextBoxBtn;
    public WebElement getEnableDisableTextBoxBtn() {
        return enableDisableTextBoxBtn;
    }









}
