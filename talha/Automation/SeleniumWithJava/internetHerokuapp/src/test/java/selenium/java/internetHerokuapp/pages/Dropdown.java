package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class Dropdown extends BasePage {
    public Dropdown(WebDriver driver) {
        super(driver);
    }
    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='Dropdown List']")
    public WebElement dropdownHeader;
    public WebElement getDropdownHeader(){
        return dropdownHeader;
    }

    //option
    @FindBy(css = " select#dropdown")
    public WebElement selectOption;
    public WebElement getSelectOption(){
        return selectOption;
    }

    //option1
    @FindBy(xpath = "//select[@id='dropdown']/option[@value='1']")
    public WebElement selectOption1;
    public WebElement getSelectOption1(){
        return selectOption1;
    }

    //option2
    @FindBy(xpath= "//select[@id='dropdown']/option[@value='2']")
    public WebElement selectOption2;
    public WebElement getSelectOption2(){
        return selectOption2;
    }



}
