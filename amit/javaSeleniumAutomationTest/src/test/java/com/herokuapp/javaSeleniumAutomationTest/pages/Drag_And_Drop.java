package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Drag_And_Drop extends BasePage {

    public Drag_And_Drop(WebDriver driver) {
        super(driver);
    }

    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='Drag and Drop']")
    public WebElement dragAndDropHeaderText;
    public WebElement getDragAndDropHeaderText(){
        return dragAndDropHeaderText;
    }

}
