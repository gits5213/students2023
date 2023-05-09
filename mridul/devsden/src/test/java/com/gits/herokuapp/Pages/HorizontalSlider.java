package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSlider extends BasePage {
    public HorizontalSlider(WebDriver driver) {
        super(driver);
    }
    //Header Validation
    @FindBy(css = "#content > div > h3")
    public WebElement horizontalSliderHeader;
    public WebElement getHorizontalSliderHeader() {
        return horizontalSliderHeader;
    }
    //Sub header
    @FindBy(css = "#content > div > h4")
    public WebElement horizontalSliderSubHeader2;
    public WebElement getHorizontalSliderSubHeader2() {
        return horizontalSliderSubHeader2;
    }
    //Slider
    @FindBy(css = "#content > div > div > input[type=range]")
    public WebElement slider;
    public WebElement getSlider() {
        return slider;
    }
}
