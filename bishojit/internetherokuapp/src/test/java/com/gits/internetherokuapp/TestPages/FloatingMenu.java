package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FloatingMenu extends BasePage {
    public FloatingMenu(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement fmHeader;
    public WebElement getFmHeader() {
        return fmHeader;
    }
    //Home Button
    @FindBy(css = "#menu > ul > li:nth-child(1) > a")
    public WebElement fmHome;
    public WebElement getFmHome() {
        return fmHome;
    }
    //News Button
    @FindBy(css = "#menu > ul > li:nth-child(2) > a")
    public WebElement fmNews;
    public WebElement getFmNews() {
        return fmNews;
    }
    //Contract Button
    @FindBy(css = "#menu > ul > li:nth-child(3) > a")
    public WebElement fmContract;
    public WebElement getFmContract() {
        return fmContract;
    }
    //About Button
    @FindBy(css = "#menu > ul > li:nth-child(4) > a")
    public WebElement fmAbout;
    public WebElement getFmAbout() {
        return fmAbout;
    }
    //Paragraph1 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(1)")
    public WebElement fmPara1;
    public WebElement getFmPara1() {
        return fmPara1;
    }
    //Paragraph2 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(2)")
    public WebElement fmPara2;
    public WebElement getFmPara2() {
        return fmPara2;
    }
    //Paragraph3 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(3)")
    public WebElement fmPara3;
    public WebElement getFmPara3() {
        return fmPara3;
    }
    //Paragraph4 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(4)")
    public WebElement fmPara4;
    public WebElement getFmPara4() {
        return fmPara4;
    }
    //Paragraph5 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(5)")
    public WebElement fmPara5;
    public WebElement getFmPara5() {
        return fmPara5;
    }
    //Paragraph6 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(6)")
    public WebElement fmPara6;
    public WebElement getFmPara6() {
        return fmPara6;
    }
    //Paragraph7 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(7)")
    public WebElement fmPara7;
    public WebElement getFmPara7() {
        return fmPara7;
    }
    //Paragraph8 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(8)")
    public WebElement fmPara8;
    public WebElement getFmPara8() {
        return fmPara8;
    }
    //Paragraph9 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(9)")
    public WebElement fmPara9;
    public WebElement getFmPara9() {
        return fmPara9;
    }
    //Paragraph10 Button
    @FindBy(css = "#content > div > div.row > div > p:nth-child(10)")
    public WebElement fmPara10;
    public WebElement getFmPara10() {
        return fmPara10;
    }
}
