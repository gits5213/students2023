package com.gits.herokuapp.Pages;
import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoverPage extends BasePage {

    public HoverPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#content > div > div:nth-child(3) > img")
    public WebElement imageNumOne;

    public WebElement getImageNumOne() {
        return imageNumOne;
    }

    @FindBy(css = "#content > div > div:nth-child(3) > div > h5")
    public WebElement nameUserOne;

    public WebElement getNameUserOne() {
        return nameUserOne;
    }

    @FindBy(css = "#content > div > div:nth-child(3) > div > a")
    public WebElement viewProfileOne;

    public WebElement getViewProfileOne() {
        return viewProfileOne;
    }


    @FindBy(css = "#content > div > div:nth-child(4) > img")
    public WebElement imageNumTwo;

    public WebElement getImageNumTwo() {
        return imageNumTwo;
    }

    @FindBy(css = "#content > div > div:nth-child(4) > div > h5")
    public WebElement nameUserTwo;

    public WebElement getNameUserTwo() {
        return nameUserTwo;
    }

    @FindBy(css = "#content > div > div:nth-child(4) > div > a")
    public WebElement viewProfileTwo;

    public WebElement getViewProfileTwo() {
        return viewProfileTwo;
    }

    @FindBy(css = "#content > div > div:nth-child(5) > img")
    public WebElement imageNumThree;

    public WebElement getImageNumThree() {
        return imageNumThree;
    }

    @FindBy(css = "#content > div > div:nth-child(5) > div > h5")
    public WebElement nameUserThree;

    public WebElement getNameUserThree() {
        return nameUserThree;
    }

    @FindBy(css = "#content > div > div:nth-child(5) > div > a")
    public WebElement viewProfileThree;

    public WebElement getViewProfileThree() {
        return viewProfileThree;
    }

}