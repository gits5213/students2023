package com.herokuapp.javaSeleniumAutomationTest.pages.Frames;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPages extends BasePage {
    public FramesPages(WebDriver driver){
        super(driver);
    }

    //Nested Frames
    @FindBy(linkText = "Nested Frames")
    public WebElement nestedFrame;
    public WebElement getNestedFrame() {
        return nestedFrame;
    }
    //iFrame
    @FindBy(linkText = "iFrame")
    public WebElement iframe;
    public WebElement getIframe() {
        return iframe;
    }
}
