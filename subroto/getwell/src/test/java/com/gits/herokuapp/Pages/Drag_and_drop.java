package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Drag_and_drop extends BasePage {
    public Drag_and_drop(WebDriver driver){
        super(driver);
    }

    //Header Text
    @FindBy(css = "#content > div > h3")
    public WebElement dragAndDropHeaderText;
    public WebElement getDragAndDropHeaderText(){
        return dragAndDropHeaderText;
    }
}
