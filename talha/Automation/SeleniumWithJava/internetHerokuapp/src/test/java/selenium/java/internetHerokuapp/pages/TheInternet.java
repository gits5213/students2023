package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class TheInternet extends BasePage {
   public TheInternet(WebDriver driver){
       super(driver);
   }

    //Header1
    @FindBy(xpath = "//div[@id='content']/h1[@class='heading']")
    public WebElement header1;
    public WebElement getHeader1() {
        return header1;
    }
    //Header2
    @FindBy(xpath = "//div[@id='content']/h2[.='Available Examples']")
    public WebElement header2;
    public WebElement getHeader2(){
        return header2;
    }

    // AbTesting
    @FindBy(css="[href='\\/abtest']")
    public WebElement abTesting;
    public WebElement getAbTesting(){
        return abTesting;

    }

    @FindBy(css="li:nth-of-type(44) > a")
    public WebElement wYSIW;
    public WebElement getwYSIW(){
        return wYSIW;

    }

//    @FindBy(xpath="")
//    public WebElement abTestingVariation1;
//    public WebElement getabTestingVariation1(){
//        return abTestingVariation1;
//    }

    // AddRemoveElements
    @FindBy(css = "[href='\\/add_remove_elements\\/']")
    public WebElement addRemoveElements;
    public WebElement getAddRemoveElements(){
        return addRemoveElements;
    }

    //BasicAuth
    @FindBy(css = "[href='\\/basic_auth'][href='\\/basic_auth']")
    public WebElement basicAuth;
    public WebElement getBasicAuth(){
        return basicAuth;
    }

    //BROKEN IMAGES
    @FindBy(css = "[href='\\/broken_images']")
    public WebElement brokenImage;
    public WebElement getBrokenImage(){
        return brokenImage;
    }

    //CHALLENGING DOM
    @FindBy(css = "[href='\\/challenging_dom']")
    public WebElement challengingDom;
    public WebElement getChallengingDom(){
        return challengingDom;
    }

    //Checkboxex
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/checkboxes']")
    public WebElement checkboxs;
    public WebElement getCheckboxs(){
        return checkboxs;
    }

    //ContextMENU
    @FindBy(css = "[href='\\/context_menu']")
    public WebElement contextMenu;
    public WebElement getContextMenu(){
        return contextMenu;
    }

    //Digest Authentication
    @FindBy(xpath = "//div[@id='content']/ul/li[8]")
    public WebElement digestAuthentication;
    public WebElement getDigestAuthentication() {
        return digestAuthentication;
    }

    //Disappearing Elements
    @FindBy(css = "[href='\\/disappearing_elements']")
    public WebElement disappearingElement;
    public WebElement getDisappearingElement() {
        return disappearingElement;
    }

    //Drag and Drop
    @FindBy(css = "[href='\\/drag_and_drop']")
    public WebElement dragAndDrop;
    public WebElement getDragAndDrop() {
        return dragAndDrop;
    }
    //Dropdown
    @FindBy(css = "[href='\\/dropdown']")
    public WebElement dropdown;
    public WebElement getDropdown() {
        return dropdown;
    }
    //Dynamic Content
    @FindBy(css = "[href='\\/dynamic_content']")
    public WebElement dynamicContent;
    public WebElement getDynamicContent() {
        return dynamicContent;
    }

    //Dynamic Controls
    @FindBy(css = "[href='\\/dynamic_controls']")
    public WebElement dynamicControls;
    public WebElement getDynamicControls() {
        return dynamicControls;
    }

    //File Download
    @FindBy(css = "[href='\\/download']")
    public WebElement fileDownload;
    public WebElement getFileDownload() {
        return fileDownload;
    }

    //File Upload
    @FindBy(css = "[href='\\/upload']")
    public WebElement fileUpload;
    public WebElement getFileUpload() {
        return fileUpload;
    }

    //Forgot Password
    @FindBy(css = "[href='\\/forgot_password']")
    public WebElement forgotPassword;
    public WebElement getForgotPassword() {
        return forgotPassword;
    }

    //Form Authentication
    @FindBy(css = "[href='\\/login']")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    //Frames
    @FindBy(css = "[href='\\/frames']")
    public WebElement frames;
    public WebElement getFrames() {
        return frames;
    }

    //Horizontal Slider
    @FindBy(css = "[href='\\/horizontal_slider']")
    public WebElement horizontalSlider;
    public WebElement getHorizontalSlider() {
        return horizontalSlider;
    }

    //Hover
    @FindBy(css = "[href='\\/hovers']")
    public WebElement hover;
    public WebElement getHover() {
        return hover;
    }

    //Infinite Scroll
    @FindBy(css = "[href='\\/infinite_scroll']")
    public WebElement infiniteScroll;
    public WebElement getInfiniteScroll() {
        return infiniteScroll;
    }

    //Inputs
    @FindBy(css = "[href='\\/inputs']")
    public WebElement input;
    public WebElement getInput() {
        return input;
    }

    //JavaScript Alerts
    @FindBy(css = "[href='\\/javascript_alerts']\n")
    public WebElement javaScriptAlerts;
    public WebElement getJavaScriptAlerts() {
        return javaScriptAlerts;
    }

    //Multiple Windows
    @FindBy(css = "[href='\\/windows']")
    public WebElement multipleWindows ;
    public WebElement getMultipleWindows() {
        return multipleWindows;
    }

    //Notification Messages
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/notification_message']")
    public WebElement notificationMessages ;
    public WebElement getNotificationMessages() {
        return notificationMessages;
    }

    //Redirect Link
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/redirector']")
    public WebElement redirectLink ;
    public WebElement getRedirectLink() {
        return redirectLink;
    }


}
