package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElements extends BasePage {

    public AddRemoveElements(WebDriver driver) {
        super(driver);
    }
    //header
    @FindBy(css = "#content > h3")
    public WebElement addRemoveElements;
    public WebElement getAddRemoveElements() {
        return addRemoveElements;
    }
    // Add element button
    @FindBy(css = "#content > div > button")
    public WebElement addElementButton;
    public WebElement getAddElementButton() {
        return addElementButton;
    }
    //delete button
    @FindBy(css = "#elements > button")
    public WebElement deleteButton;
    public WebElement getDeleteButton() {
        return deleteButton;
    }


}
