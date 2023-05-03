package com.gits.herokuapp.Pages.MultipleWindow;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement header;
    public WebElement getHeader(){
        return header;
    }
    //Click Here
    @FindBy(css = "#content > div > a")
    public WebElement clickHere;
    public WebElement getClickHere(){
        return clickHere;
    }
}
