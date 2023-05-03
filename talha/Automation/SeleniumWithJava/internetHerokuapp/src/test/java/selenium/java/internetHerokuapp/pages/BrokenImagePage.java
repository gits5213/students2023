package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class BrokenImagePage extends BasePage {
    public BrokenImagePage(WebDriver driver) {
        super(driver);
    }
    //WebElement abTestingVariation1 = driver.findElement(By.xpath("//div[@id='content']//h3[.='A/B Test Variation 1']"));

    @FindBy(xpath="//div[@id='content']//h3[.='Broken Images']")
    public WebElement header1;
    public WebElement getHeader1() {
        return header1;
    }
}
