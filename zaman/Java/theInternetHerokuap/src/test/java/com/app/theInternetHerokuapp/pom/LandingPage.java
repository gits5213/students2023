package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement abTestingPage;
    public WebElement getAbTestingPage() {
        return abTestingPage;
    }

    @FindBy(css = "li:nth-child(2) > a")
    public WebElement addRemoveElementsPage;
    public WebElement getAddRemoveElementsPage() {
        return addRemoveElementsPage;
    }

    @FindBy(css = "li:nth-child(3) > a")
    public WebElement basicAuth;
    public WebElement getBasicAuth() {
        return basicAuth;
    }

    @FindBy(css = "li:nth-of-type(4) > a")
    public WebElement brokenImages;
    public WebElement getBrokenImages() {
        return brokenImages;
    }

    @FindBy(css = "li:nth-of-type(6) > a")
    public WebElement checkBoxes;
    public WebElement getCheckBoxes() {
        return checkBoxes;
    }

    @FindBy(css = "li:nth-of-type(7) > a")
    public WebElement contextMenu;
    public WebElement getContextMenu() {
        return contextMenu;
    }

    @FindBy(css = "li:nth-of-type(8) > a")
    public WebElement digestAuthentication;
    public WebElement getDigestAuthentication() {
        return digestAuthentication;
    }

    @FindBy(css = "li:nth-of-type(9) > a")
    public WebElement disappearingElements;
    public WebElement getDisappearingElements() {
        return disappearingElements;
    }
    @FindBy(css = "li:nth-of-type(10) > a")
    public WebElement dragAndDrop;
    public WebElement getDragAndDrop() {
        return dragAndDrop;
    }

    @FindBy(css = "li:nth-of-type(11) > a")
    public WebElement dropDownPage;
    public WebElement getDropDownPage() {
        return dropDownPage;
    }

    @FindBy(css = "li:nth-of-type(13) > a")
    public WebElement dynamicContent;
    public WebElement getDynamicContent() {
        return dynamicContent;
    }

    @FindBy(css = "li:nth-of-type(14) > a")
    public WebElement dynamicLoading;
    public WebElement getDynamicLoading() {
        return dynamicLoading;
    }

    @FindBy(css = "li:nth-of-type(15) > a")
    public WebElement entryAdd;
    public WebElement getEntryAdd() {
        return entryAdd;
    }

    @FindBy(css = "li:nth-of-type(16) > a")
    public WebElement exitIntent;
    public WebElement getExitIntent() {
        return exitIntent;
    }

    @FindBy(css = "li:nth-of-type(17) > a")
    public WebElement fileDownloader;
    public WebElement getFileDownloader() {
        return fileDownloader;
    }

    @FindBy(css = "li:nth-of-type(18) > a")
    public WebElement fileUploader;
    public WebElement getFileUploader() {
        return fileUploader;
    }

    @FindBy(css = "li:nth-of-type(19) > a")
    public WebElement floatingMenu;
    public WebElement getFloatingMenu() {
        return floatingMenu;
    }

    @FindBy(css = "li:nth-of-type(20) > a")
    public WebElement forgotPassword;
    public WebElement getForgotPassword() {
        return forgotPassword;
    }

    @FindBy(css = "li:nth-of-type(21) > a")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    @FindBy(css = "li:nth-of-type(22) > a")
    public WebElement frames;
    public WebElement getFrames() {
        return frames;
    }

    @FindBy(css = "li:nth-of-type(23) > a")
    public WebElement geoLocation;
    public WebElement getGeoLocation() {
        return geoLocation;
    }

    @FindBy(css = "li:nth-of-type(24) > a")
    public WebElement horizontalSlider;
    public WebElement getHorizontalSlider() {
        return horizontalSlider;
    }

    @FindBy(css = "li:nth-of-type(25) > a")
    public WebElement hovers;
    public WebElement getHovers() {
        return hovers;
    }

    @FindBy(css = "li:nth-of-type(26) > a")
    public WebElement infiniteScroll;
    public WebElement getInfiniteScroll() {
        return infiniteScroll;
    }

    @FindBy(css = "li:nth-of-type(27) > a")
    public WebElement inputs;
    public WebElement getInputs() {
        return inputs;
    }

    @FindBy(css = "li:nth-of-type(28) > a")
    public WebElement jQueryMenus;
    public WebElement getJQueryMenus() {
        return jQueryMenus;
    }

    @FindBy(css = "li:nth-of-type(29) > a")
    public WebElement javaScriptAlerts;
    public WebElement getJavaScriptAlerts() {
        return javaScriptAlerts;
    }

    @FindBy(css = "li:nth-of-type(30) > a")
    public WebElement JavaScriptOnLadEventError;
    public WebElement getJavaScriptOnLadEventError() {
        return JavaScriptOnLadEventError;
    }

    @FindBy(css = "li:nth-of-type(31) > a")
    public WebElement KeyPresses;
    public WebElement getKeyPresses() {
        return KeyPresses;
    }

    @FindBy(css = "li:nth-of-type(32) > a")
    public WebElement largeAndDeepDOMPage;
    public WebElement getLargeAndDeepDOMPage() {
        return largeAndDeepDOMPage;
    }

    @FindBy(css = "li:nth-of-type(33) > a")
    public WebElement multipleWindows;
    public WebElement getMultipleWindows() {
        return multipleWindows;
    }

    @FindBy(css = "li:nth-of-type(35) > a")
    public WebElement notificationMessages;
    public WebElement getNotificationMessages() {
        return notificationMessages;
    }

    @FindBy(css = "li:nth-of-type(36) > a")
    public WebElement redirectLink;
    public WebElement getRedirectLink() {
        return redirectLink;
    }

    @FindBy(css = "li:nth-of-type(37) > a")
    public WebElement secureFileDownload;
    public WebElement getSecureFileDownload() {
        return secureFileDownload;
    }

    @FindBy(css = "li:nth-of-type(38) > a")
    public WebElement shadowDom;
    public WebElement getShadowDom() {
        return shadowDom;
    }

    @FindBy(css = "li:nth-of-type(39) > a")
    public WebElement shiftingContent;
    public WebElement getShiftingContent() {
        return shiftingContent;
    }

    @FindBy(css = "li:nth-of-type(40) > a")
    public WebElement slowResources;
    public WebElement getSlowResources() {
        return slowResources;
    }



}
