package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Geolocation extends BasePage {
    public Geolocation(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement glHeader;

    public WebElement getGlHeader(){
        return glHeader;
    }

    //Paragraph
    @FindBy(css = "#demo")
    public WebElement glPara;

    public WebElement getGlPara() {
        return glPara;
    }
    //search button
    @FindBy(css = "##content > div > button")
    public WebElement glSearch;

    public WebElement getGlSearch() {
        return glSearch;
    }
}
