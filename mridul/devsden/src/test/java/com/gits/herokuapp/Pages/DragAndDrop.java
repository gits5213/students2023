package com.gits.herokuapp.Pages;


import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDrop extends BasePage{
    public DragAndDrop(WebDriver driver) {
        super(driver);
    }
    //HEADER VALIDATION
    @FindBy(css = "#content > div > h3")
    public WebElement dragAndDropHeader;
    public WebElement getDragAndDropHeader() {
        return dragAndDropHeader;
    }
/*
    //colum A validation
    @FindBy(css = "#column-a")
    public WebElement coloumA;
    public WebElement getColoumA() {
        return coloumA;
    }

    //colum B validation
    @FindBy(css = "#column-b")
    public WebElement columB;
    public WebElement getColumB() {
        return columB;
    }

 */
}
