package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContentPages extends BasePage {
    public DynamicContentPages(WebDriver driver){
        super(driver);
    }

    //Header Text
    @FindBy(css = "#content > div > h3")
    public WebElement dynamicContentHeaderText;
    public WebElement getDynamicContentHeaderText(){
        return dynamicContentHeaderText;
    }

    //Paragraph1
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement dynamicContentParagraphText1;
    public WebElement getDynamicContentParagraphText1(){
        return dynamicContentParagraphText1;
    }

    //click here button
    @FindBy(css = "#content > div > p:nth-child(3) > a")
    public WebElement dynamicContentClick;
    public WebElement getDynamicContentClick(){
        return dynamicContentClick;
    }
}
