package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JavaScriptAlertsPage extends BasePage{

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(n) > button")
    public List<WebElement> alertBtns;
    public List<WebElement> getAlertBtns() {
        return alertBtns;
    }

    @FindBy(css = "p#result")
    public WebElement alertConformationMessage;
    public WebElement getAlertConformationMessage() {
        return alertConformationMessage;
    }
}

