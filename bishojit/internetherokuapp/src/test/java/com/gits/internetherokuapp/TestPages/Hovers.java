package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hovers extends BasePage {
    public Hovers(WebDriver driver) {
        super(driver);
    }

    //ImageOne
    @FindBy(css = "#content > div > div:nth-child(3) > img")
    public WebElement imageOne;

    public WebElement getImageOne() {
        return imageOne;
    }

    //Name User One
    @FindBy(css = "#content > div > div:nth-child(3) > div > h5")
    public WebElement nameUserOne;

    public WebElement getNameUserOne() {
        return nameUserOne;
    }

    //view Profile One
    @FindBy(css = "#content > div > div:nth-child(3) > div > a")
    public WebElement viewProfileOne;

    public WebElement getViewProfileOne() {
        return viewProfileOne;
    }

    //ImageTwo
    @FindBy(css = "#content > div > div:nth-child(4) > img")
    public WebElement imageTwo;

    public WebElement getImageTwo() {
        return imageTwo;
    }

    //Name User Two
    @FindBy(css = "#content > div > div:nth-child(4) > div > h5")
    public WebElement nameUserTwo;

    public WebElement getNameUserTwo() {
        return nameUserTwo;
    }

    //View Profile Two
    @FindBy(css = "#content > div > div:nth-child(4) > div > a")
    public WebElement viewProfileTwo;

    public WebElement getViewProfileTwo() {
        return viewProfileTwo;
    }

    //Image three
    @FindBy(css = "#content > div > div:nth-child(5) > img")
    public WebElement imageThree;

    public WebElement getImageThree() {
        return imageThree;
    }

    //Name User Three
    @FindBy(css = "#content > div > div:nth-child(5) > div > h5")
    public WebElement nameUserThree;

    public WebElement getNameUserThree() {
        return nameUserThree;
    }

    //View Profile Three
    @FindBy(css = "#content > div > div:nth-child(5) > div > a")
    public WebElement viewProfileThree;

    public WebElement getViewProfileThree() {
        return viewProfileThree;
    }

}













