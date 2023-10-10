package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElements extends BasePage {
    public AddRemoveElements(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(css= "div#content > h3")
    public WebElement addRemoveElementsHeader;
    public WebElement getaddRemoveElementsHeader(){
        return addRemoveElementsHeader;
    }

    //css locator can't find add delete button

//    @FindBy(css = "#content > div > button")
//    public WebElement addElement;
//    public WebElement getaddElement(){
//        return addElement;
//    }
//
//    @FindBy(css = "#elements > button:nth-child(1)")
//    public WebElement delete1;
//    public WebElement getdelete1(){
//        return delete1;
//    }
//
//    @FindBy(css = "#elements > button:nth-child(2)")
//    public WebElement delete2;
//    public WebElement getdelete2(){
//        return delete2;
//    }
//
//    @FindBy(css = "#elements > button:nth-child(3)")
//    public WebElement delete3;
//    public WebElement getDelete3(){
//        return delete3;
//    }

    @FindBy(xpath= "//div[@id='content']//button[.='Add Element']")
    public WebElement addElement;
    public WebElement getaddElement(){
        return addElement;
    }

    @FindBy(xpath= "//div[@id='elements']/button[2]")
    public WebElement delete1;
    public WebElement getdelete1(){
        return delete1;
    }

    @FindBy(xpath= "//div[@id='elements']/button[1]")
    public WebElement delete2;
    public WebElement getdelete2(){
        return delete2;
    }


}
