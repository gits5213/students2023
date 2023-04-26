package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuth extends BasePage {
    public BasicAuth(WebDriver driver) {
        super(driver);
    }
    //header-Basic Auth
    @FindBy(css = "#content > div > h3")
    public WebElement basicAuthHeader1;
    public WebElement getBasicAuthHeader1() {
        return basicAuthHeader1;
    }
    //paragraph
    @FindBy(css = "#content > div > p")
    public WebElement basicAuthParagraph1;
    public WebElement getBasicAuthParagraph1() {
        return basicAuthParagraph1;
    }

}
