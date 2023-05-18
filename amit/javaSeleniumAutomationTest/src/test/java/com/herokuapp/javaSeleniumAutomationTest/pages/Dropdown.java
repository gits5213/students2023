package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdown extends BasePage{
    public Dropdown(WebDriver driver){
        super(driver);
    }

    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='Dropdown List']")
    public WebElement dropdownHeader;
    public WebElement getDropdownHeader(){
        return dropdownHeader;
    }

    //option
    @FindBy(css = "select#dropdown")
    public WebElement selectOption;
    public WebElement getSelectOption() {
        return selectOption;
    }
    //option01
    @FindBy(xpath = "//select[@id='dropdown']/option[@value='1']")
    public WebElement selectOption01;
    public WebElement getSelectOption01() {
        return selectOption01;
    }
    //option02
    @FindBy(xpath = "//select[@id='dropdown']/option[@value='2']")
    public WebElement selectOption02;
    public WebElement getSelectOption02() {
        return selectOption02;
    }
}
