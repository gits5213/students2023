package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends BasePage{
    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "p")
    public WebElement authMessage;
    public WebElement getAuthMessage() {
        return authMessage;
    }
}
