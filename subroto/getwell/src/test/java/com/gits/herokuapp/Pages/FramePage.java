package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver){
        super(driver);
    }

    //Nested Frames
    @FindBy(css = "[href='\\/nested_frames']")
    public WebElement nestedFramesText;
    public WebElement getNestedFramesText(){
        return nestedFramesText;
    }

    //iFrame CssSelector
    @FindBy(css = "#content > div > ul > li:nth-child(2) > a")
    public WebElement IFrames;
    public WebElement getIFrames(){
        return IFrames;
    }

    //iFrame
    @FindBy(linkText = "iFrame")
    public WebElement iFrame;
    public WebElement getiFrame(){
        return iFrame;
    }
}
