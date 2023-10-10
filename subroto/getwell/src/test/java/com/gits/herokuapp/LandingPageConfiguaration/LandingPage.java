package com.gits.herokuapp.LandingPageConfiguaration;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > ul > li:nth-child(1) > a")
    public WebElement ABTesting;
    public WebElement getABTesting() {
        return ABTesting;
    }

    @FindBy(css = "#content > ul > li:nth-child(2) > a")
    public WebElement addRemoveElement;
    public WebElement getAddRemoveElement() {
        return addRemoveElement;
    }


    @FindBy(css = "#content > ul > li:nth-child(3) > a")
    public WebElement BasicAuthentication;
    public WebElement getBasicAuthentication() {
        return BasicAuthentication;
    }


    @FindBy(css = "#content > ul > li:nth-child(3) > a")
    public WebElement BrokenImage;
    public WebElement getBrokenImage(){
        return BrokenImage;
    }


    @FindBy(css = "#content > ul > li:nth-child(6) > a")
    public WebElement CheckBoxes;
    public WebElement getCheckBoxes(){
        return CheckBoxes;
    }

    @FindBy(css = "#content > ul > li:nth-child(7) > a")
    public WebElement ContextMenu;
    public WebElement getContextMenu(){
        return ContextMenu;
    }

    @FindBy(css = "#content > ul > li:nth-child(9) > a")
    public WebElement DisappearingElement;
    public WebElement getDisappearingElement(){
        return DisappearingElement;
    }

    @FindBy(css = "#content > ul > li:nth-child(8) > a")
    public WebElement DigestAuthentication;
    public WebElement getDigestAuthentication(){
        return DigestAuthentication;
    }

    @FindBy(css = "#content > ul > li:nth-child(10) > a")
    public WebElement DragAndDrop;
    public WebElement getDragAndDrop(){
        return DragAndDrop;
    }

    @FindBy(css = "#content > ul > li:nth-child(11) > a")
    public WebElement DropDown;
    public WebElement getDropDown(){
        return DropDown;
    }

    @FindBy(css = "#content > ul > li:nth-child(12) > a")
    public WebElement DynamicContent;
    public WebElement getDynamicContent(){
        return DynamicContent;
    }

    @FindBy(css = "#content > ul > li:nth-child(13) > a")
    public WebElement DynamicControls;
    public WebElement getDynamicControls(){
        return DynamicControls;
    }

    @FindBy(css = "#content > ul > li:nth-child(17) > a")
    public WebElement FileDownLoad;
    public WebElement getFileDownLoad(){
        return FileDownLoad;
    }

    @FindBy(css = "#content > ul > li:nth-child(18) > a")
    public WebElement FileUpload;
    public WebElement getFileUpload(){
        return FileUpload;
    }

    @FindBy(css = "#content > ul > li:nth-child(20) > a")
    public WebElement ForgotPassword;
    public WebElement getForgotPassword(){
        return ForgotPassword;
    }

    @FindBy(css = "#content > ul > li:nth-child(21) > a")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    @FindBy(css = "#content > ul > li:nth-child(24) > a")
    public WebElement HorizontalSlider;
    public WebElement getHorizontalSlider(){
        return HorizontalSlider;
    }

    @FindBy(css = "#content > ul > li:nth-child(34) > a")
    public WebElement NestedFrames;
    public WebElement getNestedFrames(){
        return NestedFrames;
    }

    @FindBy(css = "#content > ul > li:nth-child(22) > a")
    public WebElement Frames;
    public WebElement getFrames(){
        return Frames;
    }

    @FindBy(css = "#content > ul > li:nth-child(26) > a")
    public WebElement InfiniteScroll;
    public WebElement getInfiniteScroll(){
        return InfiniteScroll;
    }

    @FindBy(css = "#content > ul > li:nth-child(25) > a")
    public WebElement MouseHover;
    public WebElement getMouseHover(){
        return MouseHover;
    }

    @FindBy(css = "#content > ul > li:nth-child(27) > a")
    public WebElement Inputs;
    public WebElement getInputs(){
        return Inputs;
    }

    @FindBy(css = "#content > ul > li:nth-child(29) > a")
    public WebElement JavaScriptAlert;
    public WebElement getJavaScriptAlert(){
        return JavaScriptAlert;
    }

    @FindBy(css = "#content > ul > li:nth-child(33) > a")
    public WebElement MultipleWindow;
    public WebElement getMultipleWindow(){
        return MultipleWindow;
    }

    @FindBy(css = "#content > ul > li:nth-child(35) > a")
    public WebElement NotificationMessage;
    public WebElement getNotificationMessage(){
        return NotificationMessage;
    }

    @FindBy(css = "#content > ul > li:nth-child(36) > a")
    public WebElement ReDirectLink;
    public WebElement getReDirectLink(){
        return ReDirectLink;
    }



}
