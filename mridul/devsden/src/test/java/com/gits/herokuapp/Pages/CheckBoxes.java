package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxes extends BasePage {

    public CheckBoxes(WebDriver driver) {
        super(driver);
    }

    //header validation
    @FindBy(css ="#content > div > h3")
    public WebElement CheckBoxesText;
    public WebElement getCheckBoxesText(){
        return CheckBoxesText;
    }


    //checkbox1
    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(1)")
    public WebElement checkBox1;
    public WebElement getCheckbox1() {
        return checkBox1;
    }
    //checkbox2
    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(3)")
    public WebElement checkbox2;
    public WebElement getCheckbox2() {
        return checkbox2;
    }

}
