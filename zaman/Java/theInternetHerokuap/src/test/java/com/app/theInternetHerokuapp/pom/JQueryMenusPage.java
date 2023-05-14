package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JQueryMenusPage extends BasePage{
    public JQueryMenusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "ul#menu > li:nth-of-type(2) > a")
    public WebElement enable;
    public WebElement getEnable() {
        return enable;
    }

    @FindBy(css = "li:nth-of-type(2) > ul > li:nth-of-type(1) > a")
    public WebElement downloads;
    public WebElement getDownloads() {
        return downloads;
    }

    @FindBy(css = "li:nth-of-type(2) > ul > li:nth-of-type(2) > a")
    public WebElement backToJqueryUi;
    public WebElement getBackToJqueryUi() {
        return backToJqueryUi;
    }
}
