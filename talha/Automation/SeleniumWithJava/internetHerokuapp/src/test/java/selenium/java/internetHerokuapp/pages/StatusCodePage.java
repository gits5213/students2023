package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class StatusCodePage extends BasePage {
    public StatusCodePage(WebDriver driver) {
        super(driver);
    }

    //Header1
    @FindBy(xpath = "//div[@id='content']//h3[.='Status Codes']")
    public WebElement header1 ;
    public WebElement getHeader1() {
        return header1;
    }

    //Paragraph
    @FindBy(xpath = "//div[@id='content']/div/p[1]")
    public WebElement paragraph1;
    public WebElement getParagraph1() {
        return paragraph1;
    }

    //Redirect Link 200
    @FindBy(xpath = "//div[@id='content']//ul//a[@href='status_codes/200']")
    public WebElement redirect200;
    public WebElement getRedirect200() {
        return redirect200;
    }

    //Redirect Link 301
    @FindBy(css = "[href='status_codes\\/301']")
    public WebElement redirect301;
    public WebElement getRedirect301() {
        return redirect301;
    }

    //Redirect Link 404
    @FindBy(xpath = "//div[@id='content']//ul//a[@href='status_codes/404']")
    public WebElement redirect404;
    public WebElement getRedirect404() {
        return redirect404;
    }

    //Redirect Link 500
    @FindBy(xpath = "//div[@id='content']//ul//a[@href='status_codes/500']")
    public WebElement redirect500;
    public WebElement getRedirect500() {
        return redirect500;
    }


    //Click Here For Every corresponding  Status code page
    @FindBy(xpath = "/html//div[@id='content']//a[@href='/status_codes']")
    public WebElement clickHareStatusCodePage;
    public WebElement getClickHareStatusCodePage() {
        return clickHareStatusCodePage;
    }

}
