package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage {
    public RedirectLinkPage(WebDriver driver){
        super(driver);
    }
    //Header1
    @FindBy(css = "#content > div > h3")
    public WebElement header1;
    public WebElement getHeader1(){
        return header1;
    }
    //Paragraph1
    @FindBy(css = "#content > div > p")
    public WebElement paragraph1;
    public WebElement getParagraph1(){
        return paragraph1;
    }
    //Click Here
    @FindBy(css = "#redirect")
    public WebElement clickHere;
    public WebElement getClickHere(){
        return clickHere;
    }
}
