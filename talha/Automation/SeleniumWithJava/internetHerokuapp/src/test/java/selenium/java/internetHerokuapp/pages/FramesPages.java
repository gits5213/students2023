package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class FramesPages extends BasePage {
    public FramesPages(WebDriver driver) {
        super(driver);
    }

    //NestedFrames
    @FindBy (linkText = "Nested Frames")
    public WebElement nestedFrame;
    public WebElement getNestedFrame() {
        return nestedFrame;
    }

    //iframe
    @FindBy(linkText = "iFrame")
    public WebElement iframe;
    public WebElement getIframe() {
        return iframe;
    }


}
