package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement horizontalSliderHeader;
    public WebElement getHorizontalSliderHeader(){
        return horizontalSliderHeader;
    }
    //SubHeader
    @FindBy(css = "#content > div > h4")
    public WebElement horizontalSliderSubHeader;
    public WebElement getHorizontalSliderSubHeader(){
        return horizontalSliderSubHeader;
    }
    //Slider
    @FindBy(css = "#content > div > div > input[type=range]")
    public WebElement slider;
    public WebElement getSlider(){
        return slider;
    }
}
