package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfiniteScroll extends BasePage {

    public InfiniteScroll(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > h3")
    public WebElement Header1 ;
    public WebElement getHeader1() {
        return Header1;
    }

}
