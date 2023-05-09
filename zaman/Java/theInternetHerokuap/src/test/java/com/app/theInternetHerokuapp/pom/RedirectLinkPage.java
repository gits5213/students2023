package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RedirectLinkPage extends BasePage{

    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a#redirect")
    public WebElement redirectLinkBtn;
    public WebElement getRedirectLinkBtn() {
        return redirectLinkBtn;
    }

    @FindBy(css = "li:nth-of-type(n) > a")
    public List<WebElement> statusCodeLinks;
    public List<WebElement> getStatusCodeLinks() {
        return statusCodeLinks;
    }
}
