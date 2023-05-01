package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(xpath = "//div[@id='content']//h3[.='Horizontal Slider']")
    public WebElement header1;
    public WebElement getHeader1() {
        return header1;
    }

    //Sub header
    @FindBy(xpath = "//div[@id='content']//h4[@class='subheader']")
    public WebElement header2;
    public WebElement getHeader2() {
        return header2;
    }

    //Slider
    @FindBy(xpath = "/html//div[@id='content']//input[@value='0']")
    public WebElement slider;
    public WebElement getSlider() {
        return slider;
    }
}
