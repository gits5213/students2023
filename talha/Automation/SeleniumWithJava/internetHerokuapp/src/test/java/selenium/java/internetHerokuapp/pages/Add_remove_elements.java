package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;


public class Add_remove_elements extends BasePage {
    public Add_remove_elements(WebDriver driver) {
        super(driver);
    }

   // WebElement addRemoveElementsHader = driver.findElement(By.cssSelector("div#content > h3"));


    //Header
    @FindBy(css= "div#content > h3")
    public WebElement addRemoveElementsHeader;
    public WebElement getaddRemoveElementsHeader(){
        return addRemoveElementsHeader;
    }

    //WebElement addElement= driver.findElement(By.xpath("//div[@id='content']//button[.='Add Element']"));

    @FindBy(xpath= "//div[@id='content']//button[.='Add Element']")
    public WebElement addElement;
    public WebElement getaddElement(){
        return addElement;
    }

    //WebElement delete1=driver.findElement(By.xpath("//div[@id='elements']/button[1]"));
    @FindBy(xpath= "//div[@id='elements']/button[2]")
    public WebElement delete1;
    public WebElement getdelete1(){
        return delete1;
    }

    //WebElement delete2=driver.findElement(By.xpath("//div[@id='elements']/button[2]"));
    @FindBy(xpath= "//div[@id='elements']/button[1]")
    public WebElement delete2;
    public WebElement getdelete2(){
        return delete2;
    }

}
