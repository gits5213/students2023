package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage{

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".example [target]")
    public WebElement newWindowBtn;
    public WebElement getNewWindowBtn() {
        return newWindowBtn;
    }

    @FindBy(css = "h3")
    public WebElement newWindowText;
    public WebElement getNewWindowText() {
        return newWindowText;
    }
}
