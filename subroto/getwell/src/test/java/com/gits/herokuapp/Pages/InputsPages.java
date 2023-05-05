package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPages extends BasePage {
    public InputsPages(WebDriver driver){
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
