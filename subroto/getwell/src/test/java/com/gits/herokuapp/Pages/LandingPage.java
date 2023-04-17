package com.gits.herokuapp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > ul > li:nth-child(1) > a")
    public WebElement ABTesting;


    @FindBy(css = "#content > ul > li:nth-child(21) > a")
    public WebElement formAuthentication;

    @FindBy(css = "#content > ul > li:nth-child(2) > a")
    public WebElement addRemoveElement;


    public WebElement getABTesting() {
        return ABTesting;
    }

    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    public WebElement getAddRemoveElement() {
        return addRemoveElement;
    }
}
