package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControls extends BasePage {
    public DynamicControls(WebDriver driver) {
        super(driver);
    }
    //Header validation
    @FindBy(css = "#content > div.example > h4:nth-child(1)")
    public WebElement dynamicControlsHeader;
    public WebElement getDynamicControlsHeader() {
        return dynamicControlsHeader;
    }
    //Paragraph
    @FindBy(css ="#content > div.example > p")
    public WebElement dynamicControlsParagraph;
    public WebElement getDynamicControlsParagraph() {
        return dynamicControlsParagraph;
    }
    //Remove/add
    @FindBy(css = "#content > div.example > h4:nth-child(3)")
    public WebElement removeAdd;
    public WebElement getRemoveAdd() {
        return removeAdd;
    }
    //CheckboxField
    @FindBy(css = "#checkbox")
    public WebElement checkBoxButton;
    public WebElement getCheckBoxButton() {
        return checkBoxButton;
    }
    //AddButton
    @FindBy(css = "#checkbox-example > button")
    public WebElement addButton;
    public WebElement getAddButton(){
        return addButton;
    }
    //Enable/disable
    @FindBy(css = "#content > div.example > h4:nth-child(8)")
    public WebElement enableDisable;
    public WebElement getEnableDisable() {
        return enableDisable;
    }
    //Input Field
    @FindBy(css = "#input-example > input[type=text]")
    public WebElement enableInputField;
    public WebElement getEnableInputField() {
        return enableInputField;
    }
    //Enable Button
    @FindBy(css = "#input-example > button")
    public WebElement enableButton;
    public WebElement getEnableButton() {
        return enableButton;
    }
}
