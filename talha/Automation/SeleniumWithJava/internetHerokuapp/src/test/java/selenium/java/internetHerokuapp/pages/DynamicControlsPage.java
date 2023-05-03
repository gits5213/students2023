package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(xpath = "//div[@id='content']//h4[.='Dynamic Controls']")
    public WebElement dynamicControlHeader;
    public WebElement getDynamicControlHeader(){
        return dynamicControlHeader;
    }

    //Paragraph
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement dynamicControlParagraph;
    public WebElement getDynamicControlParagraph(){
        return dynamicControlParagraph;
    }

    //Remove/add
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement removeAdd;
    public WebElement getRemoveAdd() {
        return removeAdd;
    }

    //CheckboxField
    @FindBy(xpath = "//div[@id='checkbox']/input[@label='blah']")
    public WebElement checkBoxButton;
    public WebElement getCheckBoxButton(){
        return checkBoxButton;
    }

    //AddButton
    @FindBy(xpath = "//form[@id='checkbox-example']/button[@type='button']")
    public WebElement addButton;
    public WebElement getAddButton(){
        return addButton;
    }

    //


    //Input Field
    @FindBy(xpath = "//form[@id='input-example']/input[@type='text']")
    public WebElement enableInputField;
    public WebElement getEnableInputField(){
        return enableInputField;
    }

    //Enable Button
    @FindBy(xpath = "//form[@id='input-example']/input[@type='text']")
    public WebElement enableButton;
    public WebElement getEnableButton(){
        return enableButton;
    }

}
