package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControls extends BasePage {
    public DynamicControls(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(css = "#content > div.example > h4:nth-child(1)")
    public WebElement dynamicControlHeader;
    public WebElement getDynamicControlHeader(){
        return dynamicControlHeader;
    }
    //Paragraph
    @FindBy(css = "#content > div.example > p")
    public WebElement dynamicControlParagraph;
    public WebElement getDynamicControlParagraph(){
        return dynamicControlParagraph;
    }
    //Remove button
    @FindBy(css = "#checkbox-example > button")
    public WebElement removeButton;
    public WebElement getRemoveButton(){
        return removeButton;
    }
    //Add Button
    @FindBy(css = "#checkbox-example > button")
    public WebElement addButton;
    public WebElement getAddButton(){
        return addButton;
    }
    //CheckBox click
    @FindBy(css = "#checkbox > input[type=checkbox]")
    public WebElement checkBoxClick;
    public WebElement getCheckBoxClick(){
        return checkBoxClick;
    }

    //Inputs field
    @FindBy(css = "#input-example > input[type=text]")
    public WebElement inputsField;
    public WebElement getInputsField(){
        return inputsField;
    }
    //Enable button
    @FindBy(css = "#input-example > button")
    public WebElement enableButton;
    public WebElement getEnableButton(){
        return enableButton;
    }
}