package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramesPage extends BasePage{
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    ////////////////Nested frames///////////////
    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement nestedFrames;
    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    @FindBy(css = "frame[name='frame-top']")
    public WebElement topFrame;
    public WebElement getTopFrame() {
        return topFrame;
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
    public WebElement bottomFrame;
    public WebElement getBottomFrame() {
        return bottomFrame;
    }

    @FindBy(css = "body")
    public WebElement bottomFrameText;
    public WebElement getBottomFrameText() {
        return bottomFrameText;
    }

    ////////////////Iframe///////////////

    @FindBy(css = "li:nth-of-type(2) > a")
    public WebElement iFrame;
    public WebElement getIFrame() {
        return iFrame;
    }

    @FindBy(css = "div[role='menubar'] > button:nth-of-type(n)")
    public List<WebElement> menuBar;
    public List<WebElement> getMenuBar() {
        return menuBar;
    }

    @FindBy(css = "div[title='formatting'] button:nth-of-type(n)")
    public List<WebElement> textFormatter;
    public List<WebElement> getTextFormatter() {
        return textFormatter;
    }

    @FindBy(css = "div[role='menuitem']")
    public WebElement newDocBtn;
    public WebElement getNewDocBtn() {
        return newDocBtn;
    }

    @FindBy(css = "iframe#mce_0_ifr")
    public WebElement txtBoxFrame;
    public WebElement getTxtBoxFrame() {
        return txtBoxFrame;
    }

    @FindBy(css = "body#tinymce > p")
    public WebElement paragraph;
    public WebElement getParagraph() {
        return paragraph;
    }
}
