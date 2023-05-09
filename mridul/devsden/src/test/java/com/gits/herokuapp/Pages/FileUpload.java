package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUpload extends BasePage {
    public FileUpload(WebDriver driver) {
        super(driver);
    }

    //Header Validation
    @FindBy(css = "#content > div.example > h3")
    public WebElement fileUploaderHeader;
    public WebElement getFileUploaderHeader() {
        return fileUploaderHeader;
    }

    //Upload paragraph
    @FindBy(css = "#content > div.example > p")
    public WebElement fileUploadParagraph;
    public WebElement getFileUploadParagraph() {
        return fileUploadParagraph;
    }

    //Choose File Button
    @FindBy(css = "#file-upload")
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton() {
        return chooseFileButton;
    }

    //Upload Button
    @FindBy(css ="#file-submit")
    public WebElement uploadButton;
    public WebElement getUploadButton() {
        return uploadButton;
    }

    //Drag Drop Upload Area
    @FindBy(css = "#drag-drop-upload")
    public WebElement dragDropButton;
    public WebElement dragDropinputField;
    public WebElement getDragDropinputField() {
        return dragDropinputField;
    }
    public WebElement getDragDropButton() {
        return dragDropButton;

    }



}
