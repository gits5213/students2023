package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class File_Upload extends BasePage {
    public File_Upload(WebDriver driver){
        super(driver);
    }

    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='File Uploader']")
    public WebElement fileUploadHeader;
    public WebElement getFileUploadHeader(){
        return fileUploadHeader;
    }

    //ChooseFileButton
    @FindBy( id = "file-upload")
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton(){
        return chooseFileButton;
    }

    //UploadButton
    @FindBy(id = "file-submit")
    public WebElement uploadButton;
    public WebElement getUploadButton(){
        return uploadButton;
    }

    //DragArea
    @FindBy(xpath = "/html//div[@id='drag-drop-upload']")
    public WebElement dragAreaButton;
    public WebElement getDragAreaButton(){
        return dragAreaButton;
    }
}
