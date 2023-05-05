package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class RedirectLinkPages extends BasePage {
    public RedirectLinkPages(WebDriver driver) {
        super(driver);
    }

    //Header1
    @FindBy(xpath = "//div[@id='content']//h3[.='Redirection']")
    public WebElement header1 ;
    public WebElement getHeader1() {
        return header1;
    }

    //Paragraph
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement paragraph1;
    public WebElement getParagraph1() {
        return paragraph1;
    }

    //Redirect Link
    @FindBy(xpath = "/html//a[@id='redirect']")
    public WebElement redirectHere;
    public WebElement getRedirectHere() {
        return redirectHere;
    }


}
