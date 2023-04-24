package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basic_auth extends BasePage {

    public Basic_auth(WebDriver driver){
        super(driver);
    }

      //WebElement Header1
    @FindBy(css = "#content > div > h3")
    public WebElement basicAuthWebElementHeader1;
    public WebElement getBasicAuthWebElementHeader1(){
        return basicAuthWebElementHeader1;
    }
    //WebElement paragraph
    @FindBy(css = "#content > div > p")
    public WebElement basicAuthWebElementParagraph;
    public WebElement getBasicAuthWebElementParagraph(){
        return basicAuthWebElementParagraph;
    }
}
