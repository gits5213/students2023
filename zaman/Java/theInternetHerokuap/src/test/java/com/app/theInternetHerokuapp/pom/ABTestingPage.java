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
}
