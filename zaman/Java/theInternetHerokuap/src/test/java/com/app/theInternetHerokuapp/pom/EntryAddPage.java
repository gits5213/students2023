package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryAddPage extends BasePage{
    public EntryAddPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#modal")
    public WebElement addWindow;
    public WebElement getAddWindow() {
        return addWindow;
    }

    @FindBy(css = ".modal-footer > p")
    public WebElement AddCloseBtn;
    public WebElement getAddCloseBtn() {
        return AddCloseBtn;
    }
}
