package com.gits.herokuapp.Pages.MultipleWindow;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindow_Page extends BasePage{

    public NewWindow_Page(WebDriver driver){
        super(driver);
    }
    //New Header
    @FindBy(css = "body > div > h3")
    public WebElement newWindowHeader;
    public WebElement getNewWindowHeaderHeader() {
        return newWindowHeader;
    }



}
