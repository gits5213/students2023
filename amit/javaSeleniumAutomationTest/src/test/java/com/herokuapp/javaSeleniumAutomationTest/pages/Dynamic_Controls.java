package com.herokuapp.javaSeleniumAutomationTest.pages;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dynamic_Controls extends BasePage {
    public Dynamic_Controls(WebDriver driver){
        super(driver);
    }

    //Header Validation
    @FindBy(xpath = "//div[@id='content']//h4[.='Dynamic Controls']")
    public WebElement dynamicControlHeader;
    public WebElement getDynamicControlHeader(){
        return dynamicControlHeader;
    }


    //Paragraph Validation
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement dynamicControlParagraph;
    public WebElement getDynamicControlParagraph(){
        return dynamicControlParagraph;
    }


    //Remove/add Validation
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement removeAdd;
    public WebElement getRemoveAdd() {
        return removeAdd;
    }


    //CheckboxField Validation
    @FindBy(xpath = "//div[@id='checkbox']/input[@label='blah']")
    public WebElement checkBoxButton;
    public WebElement getCheckBoxButton(){
        return checkBoxButton;
    }


    //RemoveButton Validation
    @FindBy(css = "#checkbox-example [autocomplete]")
    public WebElement removeButton;
    public WebElement getRemoveButton(){
        return removeButton;
    }

    //Add button validation
    @FindBy(css = "form#checkbox-example > button[type='button']")
    public WebElement addButton;
    public WebElement getAddButton(){
        return addButton;
    }
    //Add button checkbox click
    @FindBy(css = "#checkbox-example div:nth-child(3)")
    public WebElement checkBoxButton1;
    public WebElement getCheckBoxButton1(){
        return checkBoxButton1;
    }

    //Input Field Validation
    @FindBy(xpath = "//form[@id='input-example']/input[@type='text']")
    public WebElement enableInputField;
    public WebElement getEnableInputField(){
        return enableInputField;
    }


    //Enable Button Validation
    @FindBy(xpath = "//form[@id='input-example']/input[@type='text']")
    public WebElement enableButton;
    public WebElement getEnableButton(){
        return enableButton;
    }
}
