package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frames extends BasePage {
    public Frames(WebDriver driver){
        super(driver);
    }
    @FindBy(css = "#content > div > h3")
    public WebElement framesHeader;

    public WebElement getFramesHeader(){
        return framesHeader;
    }

    //Nested Frame
    @FindBy(css = "#content > div > ul > li:nth-child(1)")
    public WebElement nestedFrames;

    public WebElement getNestedFrames() {
        return nestedFrames;
    }
    //i Frame
    @FindBy(css = "#content > div > ul > li:nth-child(2)")
    public WebElement iFrames;

    public WebElement getIFrames() {
        return iFrames;
    }
}
