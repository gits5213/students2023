package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigestAuthentication extends BasePage {

    public DigestAuthentication(WebDriver driver) {
        super(driver);
    }
    //header Digest Authentication
    @FindBy(css = "#content > div > h3")
    public WebElement digestAuthHeader1;
    public WebElement getDigestAuthHeader1() {
        return digestAuthHeader1;
    }
    //paragraph
    @FindBy(css = "#content > div > p")
    public WebElement digestAuthParagraph1;
    public WebElement getDigestAuthParagraph1() {
        return digestAuthParagraph1;
    }
}
