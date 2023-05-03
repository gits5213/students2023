package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class HoverPages extends BasePage {
    public HoverPages(WebDriver driver) {
        super(driver);
    }
    @FindBy( xpath = "/html//div[@id='content']/div/div[1]/img[@alt='User Avatar']" )
    public WebElement imageOne;
    public WebElement getImageOne() {
        return imageOne;
    }

    @FindBy ( xpath = "/html//div[@id='content']//h5[.='name: user1']" )
    public WebElement nameUserOne;
    public WebElement getNameUserOne() {
        return nameUserOne;
    }

    @FindBy ( xpath = "/html//div[@id='content']//a[@href='/users/1']" )
    public WebElement viewProfileOne;
    public WebElement getViewProfileOne() {
        return viewProfileOne;
    }



    @FindBy ( xpath = "/html//div[@id='content']/div/div[2]/img[@alt='User Avatar']" )
    public WebElement imageTwo;
    public WebElement getImageTwo() {
        return imageTwo;
    }

    @FindBy ( xpath = "/html//div[@id='content']//h5[.='name: user2']" )
    public WebElement nameUserTwo;
    public WebElement getNameUserTwo() {
        return nameUserTwo;
    }

    @FindBy ( xpath = "/html//div[@id='content']//a[@href='/users/2']" )
    public WebElement viewProfileTwo;
    public WebElement getViewProfileTwo() {
        return viewProfileTwo;
    }



    @FindBy ( xpath = "/html//div[@id='content']/div/div[3]/img[@alt='User Avatar']" )
    public WebElement imageThree;
    public WebElement getImageThree() {
        return imageThree;
    }

    @FindBy ( xpath = "/html//div[@id='content']//h5[.='name: user3']" )
    public WebElement nameUserThree;
    public WebElement getNameUserThree() {
        return nameUserThree;
    }

    @FindBy ( xpath = "/html//div[@id='content']//a[@href='/users/3']" )
    public WebElement viewProfileThree;
    public WebElement getViewProfileThree() {
        return viewProfileThree;
    }
}
