package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDown extends BasePage {
    public DropDown(WebDriver driver){
        super(driver);
    }

    //HeaderText
    @FindBy(css = "#content > div > h3")
    public WebElement dropDownHeaderText;
    public WebElement getDropDownHeaderText(){
        return dropDownHeaderText;
    }

    //option
    @FindBy(css = "#dropdown > option:nth-child(1)")
    public WebElement dropDownListOption;
    public WebElement getDropDownListOption(){
        return dropDownListOption;
    }

    //Option1
    @FindBy(css = "#dropdown > option:nth-child(2)")
    public  WebElement dropDownListOption1;
    public WebElement getDropDownListOption1(){
        return dropDownListOption1;
    }

    //Option2
    @FindBy(css = "#dropdown > option:nth-child(3)")
    public WebElement dropDownListOption2;
    public WebElement getDropDownListOption2(){
        return dropDownListOption2;
    }
}
