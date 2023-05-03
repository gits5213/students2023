package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class DynamicContentPages extends BasePage {
    public DynamicContentPages(WebDriver driver) {
        super(driver);
    }
    //HeaderText
    @FindBy(xpath = "/html//div[@id='content']//h3[.='Dynamic Content']")
    public WebElement dynamicContentHeader;
    public WebElement getDynamicContentHeader(){
        return dynamicContentHeader;
    }

    //ParagraphText1
    @FindBy(xpath = "/html//div[@id='content']//h3[.='Dynamic Content']")
    public WebElement paragraphText1;
    public WebElement getParagraphText1(){
        return paragraphText1;
    }

    //Click
    @FindBy(xpath = "/html//div[@id='content']//a[@href='/dynamic_content?with_content=static']")
    public WebElement click;
    public WebElement getClick(){
        return click;
    }

}
