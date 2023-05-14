package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div:nth-of-type(n) > img[alt='User Avatar']")
    public List<WebElement> hoverElements;

    public List<WebElement> getHoverElements() {
        return hoverElements;
    }

    @FindBy(css = "div:nth-of-type(n) > .figcaption > h5")
    public List<WebElement> hoverElementsAttribute;
    public List<WebElement> getHoverElementsAttribute() {
        return hoverElementsAttribute;
    }
}