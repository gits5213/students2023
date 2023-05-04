package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileDownloaderPage extends BasePage{
    public FileDownloaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#content > div > a:nth-of-type(n)")
    public List<WebElement> fileList;
    public List<WebElement> getFileList() {
        return fileList;
    }
}
