package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {
    public JavaScriptAlertsPage(WebDriver driver){
        super(driver);
    }

    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement header;
    public WebElement getHeader(){
        return header;
    }
    //Paragraph
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement paragraph;
    public WebElement getParagraph(){
        return paragraph;
    }
    //ClickForJSAlert
    @FindBy(css = "#content > div > ul > li:nth-child(1) > button")
    public WebElement clickForJSAlert;
    public WebElement getClickForJSAlert(){
        return clickForJSAlert;
    }
    //ClickForJSConfirm
    @FindBy(css = "#content > div > ul > li:nth-child(2) > button")
    public WebElement clickForJSConfirm;
    public WebElement getClickForJSConfirm(){
        return clickForJSConfirm;
    }
    //ClickForJSPrompt
    @FindBy(css = "#content > div > ul > li:nth-child(3) > button")
    public WebElement clickForJSPrompt;
    public WebElement getClickForJSPrompt(){
        return clickForJSPrompt;
    }
    //ResultText
    @FindBy(css = "#result")
    public WebElement resultText;
    public WebElement getResultText(){
        return resultText;
    }

}
