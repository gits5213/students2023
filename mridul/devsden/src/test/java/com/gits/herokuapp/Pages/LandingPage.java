package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }
    //The-Internet Heading1
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement internetHeader;
    public WebElement getInternetHeader() {
        return internetHeader;
    }
    //Available Example Heading2
    @FindBy(xpath = "//*[@id=\"content\"]/h2")
    public WebElement availableExampleHeader;
    public WebElement getAvailableExampleHeader() {
        return availableExampleHeader;
    }
    //Ab TESTING
    @FindBy(css ="#content > ul > li:nth-child(1) > a")
    public WebElement abTesting;
    public WebElement getAbTesting() {
        return abTesting;
    }
    //Add Remove Element
    @FindBy(css ="#content > ul > li:nth-child(2) > a")
    public WebElement addRemoveElements;
    public WebElement getAddRemoveElements() {
        return addRemoveElements;
    }
    //Basic Auth
    @FindBy(css = "#content > ul > li:nth-child(3) > a")
    public WebElement basicAuth;
    public WebElement getBasicAuth() {
        return basicAuth;
    }
    //Broken Image
    @FindBy(css = "#content > ul > li:nth-child(3) > a")
    public WebElement brokenImage;
    public WebElement getBrokenImage() {
        return brokenImage;
    }
    //challenging dom
    @FindBy(css = "#content > ul > li:nth-child(5) > a")
    public WebElement challengingDom;
    public WebElement getChallengingDom() {
        return challengingDom;
    }
    //Checkboxex
    @FindBy(css = "#content > ul > li:nth-child(6) > a")
    public WebElement checkboxes;
    public WebElement getCheckboxes() {
        return checkboxes;
    }
    //Context MENU
    @FindBy(css = "#content > ul > li:nth-child(7) > a")
    public WebElement contextMenu;
    public WebElement getContextMenu() {
        return contextMenu;
    }
    //Digest Authentication
    @FindBy(css = "#content > ul > li:nth-child(8) > a")
    public WebElement digestAuthentication;
    public WebElement getDigestAuthentication() {
        return digestAuthentication;
    }
    // Disappearing Elements
    @FindBy(css ="#content > ul > li:nth-child(9) > a")
    public WebElement disappearingElements;
    public WebElement getDisappearingElements() {
        return disappearingElements;
    }
    //Drag and Drop
    @FindBy(css = "#content > ul > li:nth-child(10) > a")
    public WebElement dragAndDrop;
    public WebElement getDragAndDrop() {
        return dragAndDrop;
    }
    //Drop Down
    @FindBy(css = "#content > ul > li:nth-child(11) > a")
    public WebElement dropdown;
    public WebElement getDropdown() {
        return dropdown;
    }
    //Dynamic controls
    @FindBy(css = "#content > ul > li:nth-child(13) > a")
    public WebElement dynamicControls;
    public WebElement getDynamicControls() {
        return dynamicControls;
    }
    //Dynamic Loading
    @FindBy(css = "#content > ul > li:nth-child(14) > a")
    public WebElement dynamicLoading;
    public WebElement getDynamicLoading() {
        return dynamicLoading;
    }
    //File Download
    @FindBy(css = "#content > ul > li:nth-child(17) > a")
    public WebElement fileDownload;
    public WebElement getFileDownload() {
        return fileDownload;
    }

    //File Upload
    @FindBy(css = "#content > ul > li:nth-child(18) > a")
    public WebElement fileUpload;
    public WebElement getFileUpload() {
        return fileUpload;
    }

    //Forgot Password
    @FindBy(css = "#content > ul > li:nth-child(20) > a")
    public WebElement forgotPassword;
    public WebElement getForgotPassword() {
        return forgotPassword;
    }
    //Form Authentication
    @FindBy(css = "#content > ul > li:nth-child(21) > a")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    // Nested frames
    @FindBy(css = "#content > ul > li:nth-child(34)")
    public WebElement nestedFrames;
    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    //Frames
    @FindBy(css = "#content > ul > li:nth-child(22) > a")
    public WebElement frames;
    public WebElement getFrames() {
        return frames;
    }

    //Horizontal Slider
    @FindBy(css = "#content > ul > li:nth-child(24) > a")
    public WebElement horizontalSlider;
    public WebElement getHorizontalSlider() {
        return horizontalSlider;
    }

    //Inputs
    @FindBy(css = "#content > ul > li:nth-child(27) > a")
    public WebElement inputs;
    public WebElement getInputs() {
        return inputs;
    }
    //Infinite Scroll
    @FindBy(css = "#content > ul > li:nth-child(26) > a")
    public WebElement infiniteScroll;
    public WebElement getInfiniteScroll() {
        return infiniteScroll;
    }
    //JavaScript Alerts
    @FindBy(css = "#content > ul > li:nth-child(29) > a")
    public WebElement javaScriptAlerts;
    public WebElement getJavaScriptAlerts() {
        return javaScriptAlerts;
    }


    //Mouse HOVER
    @FindBy(css = "#content > ul > li:nth-child(25) > a")
    public WebElement hover;
    public WebElement getHover() {
        return hover;
    }

    @FindBy(css = "#content > ul > li:nth-child(33) > a")
    public WebElement MultipleWindow;
    public WebElement getMultipleWindow() {
        return MultipleWindow;

    }
    //Notification Message
    @FindBy(css = "#content > ul > li:nth-child(35) > a")
    public WebElement NotificationMessage;
    public WebElement getNotificationMessage(){
        return NotificationMessage;
    }



}
