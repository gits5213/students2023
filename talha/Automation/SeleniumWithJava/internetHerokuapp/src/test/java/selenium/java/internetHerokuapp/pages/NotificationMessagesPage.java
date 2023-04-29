package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class NotificationMessagesPage extends BasePage {
    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(xpath = "//div[@id='content']//h3[.='Notification Message']")
    public WebElement header1;
    public WebElement getHeader1() {
        return header1;
    }

    //Paragraph
    @FindBy(xpath = "//div[@id='content']//p']")
    public WebElement paragraphText;
    public WebElement getParagraphText() {
        return paragraphText;
    }

    //Click hare
    @FindBy(xpath = "/html//div[@id='content']//a[@href='/notification_message']")
    public WebElement clickHare;
    public WebElement getClickHare() {
        return clickHare;
    }

    //Flash Alert
    @FindBy(xpath  = "/html//div[@id='flash']")
    public WebElement flashAlert;
    public WebElement getFlashAlert() {
        return flashAlert;
    }

}
