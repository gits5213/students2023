package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digest_Authentication extends BasePage {
    public Digest_Authentication(WebDriver driver) {
        super(driver);
    }

    //header
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement header;
    public WebElement getHeader() {
        return header;
    }

    //paragraph
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement paragraph;
    public WebElement getParagraph(){
        return paragraph;
    }
}
