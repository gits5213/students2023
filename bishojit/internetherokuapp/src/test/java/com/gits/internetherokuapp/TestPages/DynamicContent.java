package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContent extends BasePage {
    public DynamicContent(WebDriver driver) {
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

    //click here
    @FindBy(css = "#content > div > p:nth-child(3) > a")
    public WebElement dynamicContentClick;
    public WebElement getDynamicContentClick(){
        return dynamicContentClick;
    }
}