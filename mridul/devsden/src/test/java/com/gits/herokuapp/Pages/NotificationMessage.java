package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessage extends BasePage {

    public NotificationMessage(WebDriver driver){
        super(driver);
    }

    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement messageHeader1;
    public WebElement getMessageHeader1() {
        return messageHeader1;
    }

    //Paragraph
    @FindBy(css = "#content > div > p")
    public WebElement paragraphText;
    public WebElement getParagraphText() {
        return paragraphText;
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
