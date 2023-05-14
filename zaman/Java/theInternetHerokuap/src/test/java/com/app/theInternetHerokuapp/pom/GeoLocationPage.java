package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeoLocationPage extends BasePage{
    public GeoLocationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='getLocation()']")
    public WebElement whereAmIBtn;
    public WebElement getWhereAmIBtn() {
        return whereAmIBtn;
    }

}
