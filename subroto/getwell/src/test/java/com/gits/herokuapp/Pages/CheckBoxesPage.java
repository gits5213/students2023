package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends BasePage {

    public CheckBoxesPage(WebDriver driver){
        super(driver);
    }
    //checkbox Header
    @FindBy(css = "#content > div > h3")
    public WebElement checkboxHeader;
    public WebElement getCheckboxHeader(){
        return checkboxHeader;
    }

    //Checkbox1
    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(1)")
    public WebElement checkBox1;
    public WebElement getCheckBox1(){
        return checkBox1;
    }
    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(3)")
    public WebElement checkbox2;
    public WebElement getCheckbox2(){
        return checkbox2;
    }
}
