package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage {


    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "select#dropdown")
    public WebElement dropdown;
    public WebElement getDropdown() {
        return dropdown;
    }

    @FindBy(css = "select#dropdown > option[value='1']")
    public WebElement option1;

    public WebElement getOption1() {
        return option1;
    }

    @FindBy(css = "select#dropdown > option[value='2']")
    public WebElement option2;

    public WebElement getOption2() {
        return option2;
    }
}