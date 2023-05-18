package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class File_Downloader extends BasePage {
    public File_Downloader(WebDriver driver){
        super(driver);
    }

    //File Download Header
    @FindBy(css ="h3")
    public WebElement fileDownloadHeader;
    public WebElement getFileDownloadHeader(){
        return fileDownloadHeader;
    }
    //Sample Txt_File
    @FindBy(linkText = "tgkwNGXn1r.txt")
    public WebElement textFileDownload1;
    public WebElement getTextFileDownload1(){
        return textFileDownload1;
    }
    //CSV_File 01
    @FindBy(css = "div#content > div > a:nth-of-type(1)")
    public WebElement csvFileDownload1;
    public WebElement getCsvFileDownload1(){
        return csvFileDownload1;
    }
    //CSV_File 02
    @FindBy(linkText = "Screenshot.png")
    WebElement pngFileDownload;
    public WebElement getPngFileDownload() {
        return  pngFileDownload;
    }

}
