package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownload  extends BasePage {

    public FileDownload(WebDriver driver) {
        super(driver);
    }

    //header validation
    @FindBy(css = "#content > div > h3")
    public WebElement fileDownloadHeader;
    public WebElement getFileDownloadHeader() {
        return fileDownloadHeader;
    }
    //Sample Txt File
    @FindBy(linkText = "message.txt")
    public WebElement textFileDownload;
    public WebElement getTextFileDownload(){
        return textFileDownload;
    }

    //CSV File
    @FindBy(linkText = "person.png")
    WebElement pngFileDownload;
    public WebElement getPngFileDownload() {
        return pngFileDownload;
    }

}

