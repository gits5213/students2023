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
    //File Download Header
    @FindBy(css = "#content > div > h3")
    public WebElement fileDownloadHeaderText;
    public  WebElement getFileDownloadHeaderText(){
        return fileDownloadHeaderText;
    }

    //Sample Txt_File
//    @FindBy(linkText = "test.txt")
//    public WebElement textFileDownload;

    //Header
//    public WebElement getTextFileDownload(){
//        return textFileDownload;
//    }

    //Csv_File
    @FindBy(linkText = "location.xlsx")
    public WebElement XlsxFileDownload;
    public WebElement getXlsxFileDownload(){
        return XlsxFileDownload;
    }

    //Csv file linkText
    @FindBy(linkText = "LambdaTest.txt")
    public WebElement txtFileDownload;
    public WebElement getTxtFileDownloadFileDownload(){
        return txtFileDownload;
    }

}
