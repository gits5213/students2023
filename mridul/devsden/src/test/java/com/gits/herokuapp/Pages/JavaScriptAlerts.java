package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlerts extends BasePage {

    public JavaScriptAlerts(WebDriver driver) {
        super(driver);
    }
    private WebDriverWait wait;
    private Alert alert;

    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement js_Header;
    public WebElement getJs_Header() {
        return js_Header;
    }
    //paragraph
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement js_Paragraph;
    public WebElement getJs_Paragraph() {
        return js_Paragraph;
    }

    //js Alert Button
    @FindBy(css = "#content > div > ul > li:nth-child(1) > button")
    public WebElement clickForJS_Alert;
    public WebElement getClickForJS_Alert() {
        return clickForJS_Alert;
    }

    //JS Confirm Button
    @FindBy(css = "#content > div > ul > li:nth-child(2) > button")
    public WebElement clickForJS_Confirm;
    public WebElement getClickForJS_Confirm() {
        return clickForJS_Confirm;
    }

    //JS Prompt Button
    @FindBy(css = "#content > div > ul > li:nth-child(3) > button")
    public WebElement clickForJS_Prompt;
    public WebElement getClickForJS_Prompt() {
        return clickForJS_Prompt;
    }
    /*

    public void acceptAlert () {
        alert.accept();
    }

    public void dismissAlert () {
        alert.dismiss();
    }

    public String getAlertText () {
        return alert.getText();
    }

    public void typeTextInAlert (String text) {
        alert.sendKeys(text);
    }

     */

    //Result Button

    @FindBy(css = "#result")
    public WebElement resultText;
    public WebElement getResultText() {
        return resultText;
    }


}
