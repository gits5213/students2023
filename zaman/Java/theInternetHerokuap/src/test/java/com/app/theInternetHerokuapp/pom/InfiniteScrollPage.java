package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InfiniteScrollPage extends BasePage {

    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".jscroll-inner > div:nth-of-type(n)")
    public List<WebElement> scrollGeneratedElements;
    public List<WebElement> getScrollGeneratedElements() {
        return scrollGeneratedElements;
    }

    @FindBy(css = ".jscroll-loading > small")
    public WebElement pageLoader;
    public WebElement getPageLoader() {
        return pageLoader;
    }
}

