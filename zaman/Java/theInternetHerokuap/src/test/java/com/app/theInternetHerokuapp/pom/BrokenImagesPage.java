package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagesPage extends BasePage{

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div > img:nth-of-type(n)")
    public List<WebElement> listOfBrokenImages;
    public List<WebElement> getListOfBrokenImages() {
        return listOfBrokenImages;
    }
}


