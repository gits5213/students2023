package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoading extends BasePage {
    public DynamicLoading (WebDriver driver){
        super(driver);
    }

    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement dynamicLoadHeader;

    public WebElement getDynamicLoadHeader() {
        return dynamicLoadHeader;
    }
    //Paragraph1
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement dynamicLoadPara1;

    public WebElement getDynamicLoadPara1() {
        return  dynamicLoadPara1;
    }
    //Paragraph2
    @FindBy(css = "#content > div > p:nth-child(3)")
    public WebElement  dynamicLoadPara2;

    public WebElement getDynamicLoadPara2() {
        return  dynamicLoadPara2;
    }
    //Example1
    @FindBy(css = "#content > div > a:nth-child(5)")
    public WebElement dynamicLoadEx1;

    public WebElement getDynamicLoadEx1() {
        return dynamicLoadEx1;
    }
    //Example2
    @FindBy(css = "#content > div > a:nth-child(8)")
    public WebElement dynamicLoadEx2;

    public WebElement getDynamicLoadEx2() {
        return dynamicLoadEx2;
    }
}
