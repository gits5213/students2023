package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class AbTestingPage extends BasePage {

    public AbTestingPage(WebDriver driver) {
        super(driver);
    }

    //WebElement abTestingVariation1 = driver.findElement(By.xpath("//div[@id='content']//h3[.='A/B Test Variation 1']"));
    @FindBy(xpath="//div[@id='content']//h3[.='A/B Test Variation 1']")
    public WebElement abTestingVariation1;
    public WebElement getabTestingVariation1(){
        return abTestingVariation1;
    }

    //AB test Control
    @FindBy(css="#content  div  h3")
    public WebElement abTestControl;
    public WebElement getAbTestControl (){

        return abTestControl;
    }
    //Paragraph
    @FindBy(xpath="//div[@id='content']//p")
    public WebElement abTestingParagraph;
    public WebElement getAbTestingParagraph(){
        return  abTestingParagraph;
    }

}
