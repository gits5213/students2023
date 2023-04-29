package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    //ContextMenuHeader
    @FindBy(xpath = "//div[@id='content']//h3[.='Context Menu']")
    public WebElement contextMenuHeader;
    public WebElement getContextMenuHeader(){
        return contextMenuHeader;
    }
    //ContextMenuParagraph1
    @FindBy(xpath = "//div[@id='content']/div/p[1]")
    public WebElement contextMenuParagraph1;
    public WebElement getContextMenuParagraph1(){
        return contextMenuParagraph1;
    }
    //ContextMenuParagraph2
    @FindBy(xpath = "//div[@id='content']/div/p[2]")
    public WebElement contextMenuParagraph2;
    public WebElement getContextMenuParagraph2(){
        return contextMenuParagraph2;
    }
    //BoX
    @FindBy(xpath = "/html//div[@id='hot-spot']")
    public WebElement box;
    public WebElement getBox(){
        return box;
    }
}
