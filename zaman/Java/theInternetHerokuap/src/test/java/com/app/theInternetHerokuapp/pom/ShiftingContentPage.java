package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShiftingContentPage extends BasePage{

    public ShiftingContentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#content > div > a:nth-of-type(1)")
    public WebElement menuElementBtn;
    public WebElement getMenuElementBtn() {
        return menuElementBtn;
    }

    @FindBy(css = "div#content > div > a:nth-of-type(2)")
    public WebElement anImageBtn;
    public WebElement getAnImageBtn() {
        return anImageBtn;
    }

    @FindBy(css = "div#content > div > a:nth-of-type(3)")
    public WebElement listBtn;
    public WebElement getListBtn() {
        return listBtn;
    }
}
