package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImages extends BasePage {

    public BrokenImages(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement header;
    public WebElement getHeader(){
        return header;
    }
    //Orange Dashed Image
    @FindBy(css = "#content > div > img:nth-child(2)")
    public WebElement orgDashed;
    public WebElement getOrgDashed(){
        return orgDashed;
    }
    //White Dashed Image
    @FindBy(css = "#content > div > img:nth-child(3)")
    public WebElement whiteDashed;
    public WebElement getWhiteDashed(){
        return whiteDashed;
    }
    //Avatar
    @FindBy(css = "#content > div > img:nth-child(4)")
    public WebElement avatar;
    public WebElement getAvatar(){
        return avatar;
    }
}
