package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver){
        super(driver);
    }
    //Choose File Button
    @FindBy(css = "input#file-upload")
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton(){
        return chooseFileButton;
    }
    //Upload Button
    @FindBy(id = "file-submit")
    public WebElement uploadButton;
    public WebElement getUploadButton(){
        return uploadButton;
    }

}
