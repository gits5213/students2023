package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShiftingMenuElementPage extends BasePage{

    public ShiftingMenuElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(n) > a")
    public List<WebElement> menuButtons;
    public List<WebElement> getMenuButtons() {
        return menuButtons;
    }

    @FindBy(css = "p:nth-of-type(4) > a")
    public WebElement px100ShiftBtn;
    public WebElement getPx100ShiftBtn() {
        return px100ShiftBtn;
    }
}
