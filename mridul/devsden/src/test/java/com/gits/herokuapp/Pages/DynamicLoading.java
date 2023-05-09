package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoading extends BasePage {
    public DynamicLoading(WebDriver driver) {
        super(driver);
    }
    //header validation
    @FindBy(css = "#content > div > h3")
    public WebElement dynamicallyLoadedPageElements;
    public WebElement getDynamicallyLoadedPageElements() {
        return dynamicallyLoadedPageElements;
    }
    //paragraph 1
    @FindBy(css = "#content > div > p:nth-child(2)")
    public WebElement dynamicallyParagraph1;
    public WebElement getDynamicallyParagraph1() {
        return dynamicallyParagraph1;
    }
    //paragraph 2
    @FindBy(css = "#content > div > p:nth-child(3)")
    public WebElement dynamicallyParagraph2;
    public WebElement getDynamicallyParagraph2() {
        return dynamicallyParagraph2;
    }
    //Example 1 Button
    @FindBy(css = "#content > div > a:nth-child(5)")
    public WebElement example1Button;
    public WebElement getExample1Button() {
        return example1Button;
    }
    //Example 2 Button
    @FindBy(css = "#content > div > a:nth-child(8)")
    public WebElement example2Button;
    public WebElement getExample2Button() {
        return example2Button;
    }
/*
    //start Button 1
    @FindBy(css = "#start > button")
    public WebElement startButton1;
    public WebElement getStartButton1() {
        return startButton1;
    }
    //start Button 2
    @FindBy(css = "#start > button")
    public WebElement startButton2;
    public WebElement getStartButton2() {
        return startButton2;
    }

 */


}
