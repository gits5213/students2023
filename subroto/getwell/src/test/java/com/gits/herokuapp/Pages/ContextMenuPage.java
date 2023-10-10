package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver){
        super(driver);
    }

    //ContextMenuHeader
    @FindBy(css = "#content > div > h3")
    public WebElement ContextMenuHeader;
    public WebElement getContextMenuHeader(){
        return ContextMenuHeader;
    }

    //ContextMenuParagraph1
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement ContextMenuParagraph1;
    public WebElement getContextMenuParagraph1(){
        return ContextMenuParagraph1;
    }
    //ContextMenuParagraph2
    @FindBy(css = "#content > div > p:nth-child(3)")
    public WebElement ContextMenuParagraph2;
    public WebElement getContextMenuParagraph2(){
        return ContextMenuParagraph2;
    }
    //Box
    @FindBy(css = "[oncontextmenu]")
    public WebElement box;
    public WebElement getBox(){
        return box;
    }
}
