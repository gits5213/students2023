package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdown extends BasePage {
    public Dropdown(WebDriver driver) {
        super(driver);
    }
    //Header Validation
    @FindBy(css = "#content > div > h3")
    public WebElement dropdownListHeader;
    public WebElement getDropdownListHeader(){
        return dropdownListHeader;
    }
    //Select option
    @FindBy(css = "#dropdown")
    public WebElement selectOption;
    public WebElement getSelectOption() {
        return selectOption;
    }
    //select option 1
    @FindBy(css = "#dropdown > option:nth-child(2)")
    public WebElement selectOption1;
    public WebElement getSelectOption1() {
        return selectOption1;
    }
    //select option 2
    @FindBy(css = "#dropdown > option:nth-child(3)")
    public WebElement selectOption2;
    public WebElement getSelectOption2() {
        return selectOption2;
    }


}
