package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUpload extends BasePage {
    public FileUpload(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div.example > h3")
    public WebElement fileUploadHeader;

    public WebElement getFileUploadHeader() {
        return fileUploadHeader;
    }
    //Paragraph
    @FindBy(css = "#content > div.example > p")
    public WebElement fileUploadParagraph;

    public WebElement getFileUploadParagraph() {
        return fileUploadParagraph;
    }
    //File Upload
    @FindBy(css = "#file-upload")
    public WebElement fileUploadOption;
    public WebElement getFileUploadOption(){
        return fileUploadOption;
    }

    // Upload Button
    @FindBy(css = "#file-submit")
    public WebElement fileUploadButton;
    public WebElement getFileUploadButton() {
        return fileUploadButton;
    }

    //Drag Area Button
    @FindBy(css = "#drag-drop-upload")
    public WebElement fileDragArea;
    public WebElement getFileDragArea() {
        return fileDragArea;
    }
}
