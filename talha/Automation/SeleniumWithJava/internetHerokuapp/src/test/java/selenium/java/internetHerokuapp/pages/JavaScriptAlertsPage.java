package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class JavaScriptAlertsPage extends BasePage {
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='JavaScript Alerts']")
    public WebElement header1;
    public WebElement getHeader1() {
        return header1;
    }

    @FindBy(xpath = "//div[@id='content']/div/p[1]")
    public WebElement paragraph;
    public WebElement getParagraph() {
        return paragraph;
    }

    @FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Alert']")
    public WebElement clickForJSAlertButton;
    public WebElement getClickForJSAlertButton() {
        return clickForJSAlertButton;
    }

    @FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Confirm']")
    public WebElement clickForJSConfirm;
    public WebElement getClickForJSConfirm() {
        return clickForJSConfirm;
    }

    @FindBy(xpath = "//div[@id='content']//ul//button[.='Click for JS Prompt']")
    public WebElement clickForJSPrompt;
    public WebElement getClickForJSPrompt() {
        return clickForJSPrompt;
    }


    @FindBy(xpath = "/html//p[@id='result']")
    public WebElement resultText;
    public WebElement getResultText() {
        return resultText;
    }
}
