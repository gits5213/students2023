package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownload extends BasePage {

    public FileDownload(WebDriver driver){
        super(driver);
    }
    //File Download Header
    @FindBy(css = "#content > div > h3")
    public WebElement fileDownloadHeaderText;
    public  WebElement getFileDownloadHeaderText(){
        return fileDownloadHeaderText;
    }

    //Sample Txt_File
    @FindBy(css = "#content > div > a:nth-child(12)")
    public WebElement textFileDownload;
    public WebElement getTextFileDownload(){
        return textFileDownload;
    }


    //Csv file linkText
    @FindBy(linkText = "logo.png")
    public WebElement pngFileDownload;
    public WebElement getPngFileDownload(){
        return pngFileDownload;
    }

}
