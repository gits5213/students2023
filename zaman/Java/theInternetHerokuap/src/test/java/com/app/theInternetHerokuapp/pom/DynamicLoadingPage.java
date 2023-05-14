package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DynamicLoadingPage extends BasePage {

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#content > div > a:nth-of-type(1)")
    public WebElement hiddenElement;
    public WebElement getHiddenElement() {
        return hiddenElement;
    }

    @FindBy(css = "div#start > button")
    public WebElement hiddenElementStart;
    public WebElement getHiddenElementStart() {
        return hiddenElementStart;
    }

    @FindBy(css = "div#finish > h4")
    public WebElement hiddenElementText;
    public WebElement getHiddenElementText() {
        return hiddenElementText;
    }

    @FindBy(css = "div#content > div > a:nth-of-type(2)")
    public WebElement renderedElement;
    public WebElement getRenderedElement() {
        return renderedElement;
    }

    @FindBy(css = "div#start > button")
    public WebElement renderedElementStart;
    public WebElement getRenderedElementStart() {
        return renderedElementStart;
    }

    @FindBy(css = "div#finish > h4")
    public WebElement renderedElementText;
    public WebElement getRenderedElementText() {
        return renderedElementText;
    }
}
