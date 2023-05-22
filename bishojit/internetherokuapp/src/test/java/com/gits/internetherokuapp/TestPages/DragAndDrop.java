package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDrop extends BasePage {
    public DragAndDrop(WebDriver driver) {
        super(driver);
    }
    //HeaderText
    @FindBy(css = "#content > div > h3")
    public WebElement dropDownHeaderText;

    public WebElement getDropDownHeaderText () {
        return dropDownHeaderText;

    }
    //Colum A
    @FindBy(css = "#column-a")
    public WebElement dropDownColumA;

    public WebElement getDropDownColumA() {
        return dropDownColumA;

    }
    //Colum B
    @FindBy(css = "#column-b")
    public WebElement dropDownColumB;

    public WebElement getDropDownColumB() {
        return dropDownColumB;

    }
}