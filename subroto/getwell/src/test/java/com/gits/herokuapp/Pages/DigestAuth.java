package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigestAuth extends BasePage {
    public DigestAuth(WebDriver driver) {
        super(driver);
    }
    //header validation
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement header;
    public WebElement getHeader() {
        return header;
    }


    //paragraph validation
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement paragraph;
    public WebElement getParagraph(){
        return paragraph;
    }
}
