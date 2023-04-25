package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExitIntent extends BasePage {
    public ExitIntent(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div.example > h3")
    public WebElement exitInHeader;

    public WebElement getExitInHeader() {
        return exitInHeader;
    }
    //Paragraph
    @FindBy(css = "#content > div.example > p")
    public WebElement exitInPara;

    public WebElement getExitInPara() {
        return exitInPara;
    }
}
