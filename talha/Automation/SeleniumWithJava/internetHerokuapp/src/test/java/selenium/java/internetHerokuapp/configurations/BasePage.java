package selenium.java.internetHerokuapp.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    //Initialize The  webDriver and gave the reference variable  'driver'.
    public WebDriver driver;

    // Creating the constructor and it will be the same name of the class name.
    // This part is for Driver
    public BasePage(WebDriver driver){
        this.driver =driver; // For calling the constructor as a global declaration. USE "This"
        this.inItPage();    // Also called the below methode , because we use the constructor other pages
    }
    // This part is for Web Element. This methode is initialize web element in every page.
    // * Why we initialize a page , and what is the advantage of it.
    public void inItPage(){
        PageFactory.initElements(driver,this); // every page have webElements. so we have to globally declare
        // webElement.That's why we use initElement() methode.Which came from PageFactory package.
        //Also called the Driver from above
    }
}
