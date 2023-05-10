package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShadowDomPage extends BasePage{
    public ShadowDomPage(WebDriver driver) {
        super(driver);
    }

    //For js execute
    public String jsShadowRootSlot = "return document.querySelector(\"#content > my-paragraph:nth-child(5)\").shadowRoot.querySelector(\"p > slot\")";
//    public String jsShadowRootSlot = "return document.querySelector(\"#content > my-paragraph:nth-child(5)\").shadowRoot.querySelector(\"p > slot\")";
    public String getJsShadowRootSlot() {
        return jsShadowRootSlot;
    }

    //For js execute
    public String paragraphInsideShadowRoot = "p > slot";
    public String getParagraphInsideShadowRoot() {
        return paragraphInsideShadowRoot;
    }

    @FindBy(css = "span[slot='my-text']")
    public WebElement firstText;
    public WebElement getFirstText() {
        return firstText;
    }

    @FindBy(css = "ul > li:nth-of-type(1)")
    public WebElement secondText;
    public WebElement getsSecondText() {
        return secondText;
    }

    @FindBy(css = "ul > li:nth-of-type(2)")
    public WebElement thirdText;
    public WebElement getsThirdText() {
        return thirdText;
    }
}
