package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMassagesPage extends BasePage {
    public NotificationMassagesPage(WebDriver driver){
        super(driver);
    }


    //ClickHere
    @FindBy(css = "#content > div > p > a")
    public WebElement clickHere;
    public WebElement getClickHere(){
        return clickHere;
    }
    //Flash Alert
    @FindBy(css = "#flash")
    public WebElement flashAlert;
    public WebElement getFlashAlert(){
        return flashAlert;
    }
}
