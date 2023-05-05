package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class InfiniteScrollPage extends BasePage {
    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='Infinite Scroll']")
    public WebElement Header1 ;
    public WebElement getHeader1() {
        return Header1;
    }

}
