package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#columns [draggable='true']:nth-of-type(1)")
    public WebElement elementA;
    public WebElement getElementA() {
        return elementA;
    }

    @FindBy(css = "div#column-a > header")
    public WebElement columnAText;
    public WebElement getColumnAText() {
        return columnAText;
    }

    @FindBy(css = "#columns [draggable='true']:nth-of-type(2)")
    public WebElement elementB;
    public WebElement getElementB() {
        return elementB;
    }

    @FindBy(css = "div#column-b")
    public WebElement columnBText;
    public WebElement getColumnBText() {
        return columnBText;
    }
}
