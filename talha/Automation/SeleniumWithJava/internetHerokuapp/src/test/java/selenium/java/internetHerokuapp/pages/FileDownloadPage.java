package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class FileDownloadPage extends BasePage {
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }
    //File Download Header
    @FindBy(xpath = "//div[@id='content']//h3[.='File Downloader']")
    WebElement fileDownloadHeader;
    public WebElement getFileDownloadHeader() {
        return fileDownloadHeader;
    }

    //Sample Txt_File
    @FindBy( linkText = "maven project.txt")
    WebElement textFileDownload;
    public WebElement getTextFileDownload() {
        return textFileDownload;
    }
    //CSV_File
    @FindBy(xpath = "//div[@id='content']//a[@href='download/Test1.txt']")
    WebElement csvFileDownload;
    public WebElement getCsvFileDownload() {
        return  csvFileDownload;
    }

    //div[@id='content']//a[@href='download/sample.png']
    //CSV_File
    @FindBy(linkText = "new.png")
    WebElement pngFileDownload;
    public WebElement getPngFileDownload() {
        return  pngFileDownload;
    }


}
