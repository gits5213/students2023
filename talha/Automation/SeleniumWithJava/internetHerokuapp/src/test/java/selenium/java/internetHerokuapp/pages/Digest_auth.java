package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class Digest_auth extends BasePage {
    public Digest_auth(WebDriver driver) {
        super(driver);
    }
    //header
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement header;
    public WebElement getHeader() {
        return header;
    }


    //peragraph
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement paragraph;
    public WebElement getParagraph(){
        return paragraph;
    }
}
