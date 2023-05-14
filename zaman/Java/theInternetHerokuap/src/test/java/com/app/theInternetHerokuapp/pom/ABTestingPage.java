package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestingPage extends BasePage{

    public ABTestingPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement abTestingHeader;
    public WebElement getAbTestingHeader() {
        return abTestingHeader;
    }
    @FindBy(css = "html > body > div:nth-of-type(2) > div > div > h3")
    public WebElement h3TestVariation;

    public WebElement getH3TestVariation() {
        return h3TestVariation;
    }
    @FindBy(css = "html > body > div:nth-of-type(2) > div > div > p")
    public WebElement pAlsoKnownSplitTesting;
    public WebElement getpAlsoKnownSplitTesting() {
        return pAlsoKnownSplitTesting;
    }
}
