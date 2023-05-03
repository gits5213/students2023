package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExitIntentPage extends BasePage {

    public ExitIntentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#ouibounce-modal")
    public WebElement exitAds;
    public WebElement getExitAdds() {
        return exitAds;
    }

    @FindBy(css = ".modal-footer > p")
    public WebElement adsCloseBtn;
    public WebElement getAdsCloseBtn() {
        return adsCloseBtn;
    }
}