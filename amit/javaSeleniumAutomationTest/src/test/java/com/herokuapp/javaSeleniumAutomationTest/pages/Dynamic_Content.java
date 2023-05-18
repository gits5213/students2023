package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dynamic_Content extends BasePage {
    public Dynamic_Content(WebDriver driver){
        super(driver);
    }

    //HeaderText
    @FindBy(xpath = "/html//div[@id='content']//h3[.='Dynamic Content']")
    public WebElement dynamicContentHeader;
    public WebElement getDynamicContentHeader(){
        return dynamicContentHeader;
    }
    //ParagraphText 01
    @FindBy(xpath = "/html//div[@id='content']//h3[.='Dynamic Content']")
    public WebElement paragraphText1;
    public WebElement getParagraphText1(){
        return paragraphText1;
    }

    //Click
    @FindBy(xpath = "/html//div[@id='content']//a[@href='/dynamic_content?with_content=static']")
    public WebElement click;
    public WebElement getClick(){
        return click;
    }
}
