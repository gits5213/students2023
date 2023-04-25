package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inputs extends BasePage {
    public Inputs(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > div > h3")
    public WebElement header;
    public WebElement getHeader(){
        return header;
    }
    //Paragraph
    @FindBy(css = "#content > div > div > div > p")
    public WebElement paragraph;
    public WebElement getParagraph(){
        return paragraph;
    }
    //InputField
    @FindBy(css = "#content > div > div > div > input[type=number]")
    public WebElement inputField;
    public WebElement getInputField(){
        return inputField;
    }
}
