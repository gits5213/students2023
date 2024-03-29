package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class Disappearing_elements extends BasePage {
    public Disappearing_elements(WebDriver driver) {
        super(driver);
    }
    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='Disappearing Elements']")
    public WebElement disappearingElementsHeaderText;
    ;
    public WebElement getDisappearingElementsHeaderText(){
        return disappearingElementsHeaderText;
    }
    //ParagraphText
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement disappearingElementsParagraphText;
    ;
    public WebElement getDisappearingElementsParagraphText(){
        return disappearingElementsParagraphText;
    }
    //Home Tab
    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/']")
    public WebElement homeTab;
    public WebElement getHomeTab(){
        return homeTab;
    }

    //About Tab
    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/about/']")
    public WebElement aboutTab;
    public WebElement getAboutTab(){
        return aboutTab;
    }

    //Contact Us Tab
    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/contact-us/']")
    public WebElement contactUsTab;
    public WebElement getContactUsTab(){
        return contactUsTab;
    }

    //Portfolio Tab
    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/portfolio/']")
    public WebElement portfolioTab;
    public WebElement getPortfolioTab(){
        return portfolioTab;
    }



}
