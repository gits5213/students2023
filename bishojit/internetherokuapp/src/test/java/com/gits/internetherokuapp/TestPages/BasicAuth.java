package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuth extends BasePage {
    public BasicAuth(WebDriver driver){
        super(driver);
    }
    //header
    @FindBy(css = "#content > div > h3")
    public WebElement BasicAuthHeader;

    public WebElement getBasicAuthHeader() {
        return BasicAuthHeader;
    }
    //paragraph
    @FindBy(css = "#content > div > p")
    public WebElement BasicAuthPara;

    public WebElement getBasicAuthPara() {
        return BasicAuthPara;
    }
}
