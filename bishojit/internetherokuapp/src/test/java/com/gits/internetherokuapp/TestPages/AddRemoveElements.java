package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddRemoveElements extends BasePage {
    public AddRemoveElements(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(css = "#content > h3")
    public WebElement Addremoveelementheader;

    public WebElement getAddremoveelementheader() {
        return Addremoveelementheader;
    }

    //Add Element
    @FindBy(css = "#content > div > button")
    public WebElement AddElement;

    public WebElement getAddElement() {
        return AddElement;
    }

    //Delete Element 1
    @FindBy(css = "#elements > button:nth-child(1)")
    public WebElement DeleteElement1;

    public WebElement getDeleteElement1() {
        return DeleteElement1;
    }

    //Delete Element 2
    @FindBy(css = "#elements > button:nth-child(2)")
    public WebElement DeleteElement2;

    public WebElement getDeleteElement2() {
        return getDeleteElement2();
    }

    //Delete Element 3
    @FindBy(css = "#elements > button:nth-child(3)")
    public WebElement DeleteElement3;

    public WebElement getDeleteElement3() {
        return getDeleteElement3();
    }
}
