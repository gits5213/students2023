package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenu extends BasePage {

    public ContextMenu(WebDriver driver) {
        super(driver);

    }
    //Context Menu Header
    @FindBy(css = "#content > div > h3")
    public WebElement contextMenuHeader;
    public WebElement getContextMenuHeader() {
        return contextMenuHeader;
    }
    //paragraph1
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement contextMenuParagraph1;
    public WebElement getContextMenuParagraph1() {
        return contextMenuParagraph1;
    }
    //paragraph2
    @FindBy(css = "#content > div > p:nth-child(3)")
    public WebElement contextMenuParagraph2;
    public WebElement getContextMenuparagraph2() {
        return contextMenuParagraph2;
    }
    //box
    @FindBy(css = "#hot-spot")
    public WebElement contextMenuBox;
    public WebElement getContextMenuBox() {
        return contextMenuBox;
    }

}
