package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage{
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement nestedFrames;
    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement iFrame;
    public WebElement getIFrame() {
        return iFrame;
    }

    @FindBy(css = "frame[name='frame-top']")
    public WebElement motherFrame1;
    public WebElement getMotherFrame1() {
        return motherFrame1;
    }

    @FindBy(css = "frame[name='frame-top']")
    public WebElement firstSubFrame;
    public WebElement getFirstSubFrame() {
        return firstSubFrame;
    }

    @FindBy(css = "frame[name='frame-left']")
    public WebElement leftFrame;
    public WebElement getLeftFrame() {
        return leftFrame;
    }

    @FindBy(css = "body")
    public WebElement leftFrameBodyText;
    public WebElement getLeftFrameBodyText() {
        return leftFrameBodyText;
    }

    @FindBy(css = "frame[name='frame-middle']")
    public WebElement middleFrame;
    public WebElement getMiddleFrame() {
        return middleFrame;
    }

    @FindBy(css = "body")
    public WebElement middleFrameBodyText;
    public WebElement getMiddleFrameBodyText() {
        return middleFrameBodyText;
    }

    @FindBy(css = "frame[name='frame-right']")
    public WebElement rightFrame;
    public WebElement getRightFrame() {
        return rightFrame;
    }

    @FindBy(css = "body")
    public WebElement rightFrameBodyText;
    public WebElement getRightFrameBodyText() {
        return rightFrameBodyText;
    }

    @FindBy(css = "frame[name='frame-bottom']")
    public WebElement motherFrame2;
    public WebElement getMotherFrame2() {
        return motherFrame2;
    }

    @FindBy(css = "body")
    public WebElement bottomFrameText;
    public WebElement getBottomFrameText() {
        return bottomFrameText;
    }
}
