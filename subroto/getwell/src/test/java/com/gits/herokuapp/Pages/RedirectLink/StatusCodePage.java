package com.gits.herokuapp.Pages.RedirectLink;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusCodePage extends
        BasePage {
    public StatusCodePage(WebDriver driver){
        super(driver);
    }
    //Header1
    @FindBy(css = "#content > div > h3")
    public WebElement header1;
    public WebElement getHeader1(){
        return header1;
    }
    //Paragraph1
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement paragraph1;
    public WebElement getParagraph1(){
        return paragraph1;
    }
    //RedirectLink 200
    @FindBy(css = "#content > div > ul > li:nth-child(1) > a")
    public WebElement redirectLink200;
    public WebElement getRedirectLink200(){
        return redirectLink200;
    }
    //RedirectLink 301
    @FindBy(css = "#content > div > ul > li:nth-child(2) > a")
    public WebElement redirectLink301;
    public WebElement getRedirectLink301(){
        return redirectLink301;
    }
    //RedirectLink 404
    @FindBy(css = "#content > div > ul > li:nth-child(3) > a")
    public WebElement redirectLink404;
    public WebElement getRedirectLink404(){
        return redirectLink404;
    }
    //RedirectLink 500
    @FindBy(css = "#content > div > ul > li:nth-child(4) > a")
    public WebElement redirectLink500;
    public WebElement getRedirectLink500(){
        return redirectLink500;
    }
    //Click Here For Every Corresponding Status Code Page
    @FindBy(css = "#content > div > p:nth-child(2) > a")
    public WebElement clickHere;
    public WebElement getClickHere(){
        return clickHere;
    }
}
