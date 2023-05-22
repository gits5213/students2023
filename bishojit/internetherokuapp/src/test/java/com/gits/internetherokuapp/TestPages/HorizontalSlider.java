package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSlider extends BasePage {
    public HorizontalSlider(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement horizontalSliderHeader;

    public WebElement getHorizontalSliderHeader(){
        return horizontalSliderHeader;
    }

    //Paragraph
    @FindBy(css = "#content > div > h4")
    public WebElement horizontalSliderParagraph;

    public WebElement getHorizontalSliderParagraph() {
        return horizontalSliderParagraph;
    }
    //Slider
    @FindBy(css = "#content > div > div > input[type=range]")
    public WebElement horizontalSliderVolume;

    public WebElement getHorizontalSliderVolume() {
        return horizontalSliderVolume;
    }
}
