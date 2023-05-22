package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryAd extends BasePage {
    public EntryAd(WebDriver driver){
        super(driver);
    }

    //Header
    @FindBy(css = "#content > div.example > h3")
    public WebElement entryAdHeader;

    public WebElement getEntryAdHeader() {
        return entryAdHeader;
    }
    //Paragraph1
    @FindBy(css = "#content > div.example > p:nth-child(2)")
    public WebElement entryAdPara1;

    public WebElement getEntryAdPara1() {
        return entryAdPara1;
    }
    //Paragraph2
    @FindBy(css = "#content > div.example > p:nth-child(3)")
    public WebElement entryAdPara2;

    public WebElement getEntryAdPara2() {
        return entryAdPara2;
    }
    //Paragraph3
    @FindBy(css = "#content > div.example > p:nth-child(4)")
    public WebElement entryAdPara3;

    public WebElement getEntryAdPara3() {
        return entryAdPara3;
    }
}
