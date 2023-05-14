package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    public WebElement slider;
    public WebElement getSlider() {
        return slider;
    }

    @FindBy(css = "span#range")
    public WebElement sliderValue;
    public WebElement getSliderValue() {
        return sliderValue;
    }
}
