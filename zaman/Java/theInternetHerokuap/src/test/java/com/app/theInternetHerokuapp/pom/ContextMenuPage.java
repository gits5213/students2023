package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage{

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[oncontextmenu]")
    public WebElement contextMenu;
    public WebElement getContextMenu() {
        return contextMenu;
    }

}
