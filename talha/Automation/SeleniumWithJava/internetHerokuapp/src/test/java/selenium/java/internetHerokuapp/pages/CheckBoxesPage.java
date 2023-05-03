package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class CheckBoxesPage extends BasePage {
    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    // Checkbox2
    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    public WebElement checkbox2;
    public WebElement getCheckbox2(){
        return checkbox2;
    }
    //CheckBoX1
    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    public WebElement checkbox1;
    public WebElement getCheckbox1(){
        return checkbox1;
    }
}
