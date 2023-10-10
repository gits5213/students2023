package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImagePage extends BasePage {

    public BrokenImagePage(WebDriver driver){
        super(driver);
    }
    //WebElement broken Image Validation
    @FindBy(css = "#content > div > h3")
    public WebElement header1;
    public WebElement getHeader1(){
        return header1;
    }
}
