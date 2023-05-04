package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploaderPage extends BasePage{
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#drag-drop-upload.dz-success-mark.dz-clickable")
    public WebElement dragAndDropArea;
    public WebElement getDragAndDropArea() {
        return dragAndDropArea;
    }

    @FindBy(css = "input#file-upload")
    public WebElement chooseFileBtn;
    public WebElement getChooseFileBtn() {
        return chooseFileBtn;
    }
    @FindBy(css = "input.button")
    public WebElement uploadBtn;
    public WebElement getUploadBtn() {
        return uploadBtn;
    }

    @FindBy(css = "h3")
    public WebElement fileUploadMessage;
    public WebElement getFileUploadMessage() {
        return fileUploadMessage;
    }

    @FindBy(css = "div#uploaded-files")
    public WebElement uploadedFileName;
    public WebElement getUploadedFileName() {
        return uploadedFileName;
    }
}
