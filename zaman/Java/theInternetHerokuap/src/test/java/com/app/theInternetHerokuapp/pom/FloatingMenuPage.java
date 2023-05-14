package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FloatingMenuPage extends BasePage{
    public FloatingMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(n) > a")
    public List<WebElement> floatingMenuList;
    public List<WebElement> getFloatingMenuList() {
        return floatingMenuList;
    }
}
