package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class InputsPages extends BasePage {
    public InputsPages(WebDriver driver) {
        super(driver);
    }

    //Header1
    @FindBy(xpath = "/html//div[@id='content']//h3[.='Inputs']")
    public WebElement header1 ;
    public WebElement getHeader1() {
        return header1 ;
    }

    //Paragraph1
    @FindBy(xpath = "/html//div[@id='content']//p[.='Number']")
    public WebElement paragraph;
    public WebElement getParagraph() {
        return paragraph;
    }

    //inputField
    @FindBy(xpath = "/html//div[@id='content']//input[@type='number']")
    public WebElement inputField;
    public WebElement getInputField() {
        return inputField;
    }
}
