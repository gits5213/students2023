package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class AddRemoveElementsPage extends BasePage{

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#content > div > button")
    public WebElement addElementBtn;
    public WebElement getAddElementBtn(){
        return addElementBtn;
    }

    @FindBy(css = "div#elements > button:nth-of-type(n)")
    public List<WebElement> totalBtn;
    public List<WebElement> getTotalBtn(){
        return totalBtn;
    }



}
