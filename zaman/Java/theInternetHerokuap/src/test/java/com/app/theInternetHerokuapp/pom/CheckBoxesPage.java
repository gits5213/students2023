package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxesPage extends BasePage{
    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "form#checkboxes > input:nth-of-type(n)")
    public List<WebElement> numberOfCheckBoxes;
    public List<WebElement> getNumberOfCheckBoxes() {
        return numberOfCheckBoxes;
    }
}
