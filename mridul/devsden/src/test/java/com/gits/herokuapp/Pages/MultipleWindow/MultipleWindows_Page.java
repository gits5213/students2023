package com.gits.herokuapp.Pages.MultipleWindow;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindows_Page extends BasePage {

    public MultipleWindows_Page(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement header1;
    public WebElement getHeader1() {
        return header1;
    }
    //Click Here
    @FindBy(css = "#content > div > a")
    public WebElement clickHere;
    public WebElement getClickHere(){
        return clickHere;
    }
}
