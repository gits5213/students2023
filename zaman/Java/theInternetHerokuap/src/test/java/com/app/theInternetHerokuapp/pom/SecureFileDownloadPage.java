package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureFileDownloadPage extends BasePage{

    public SecureFileDownloadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div .example > h3")
    public WebElement secureFileDownloadMessage;
    public WebElement getSecureFileDownloadMessage() {
        return secureFileDownloadMessage;
    }
}
