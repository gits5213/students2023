package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class ForgotPasswordPage extends BasePage {

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }


    //Header
    @FindBy(xpath = "//div[@id='content']//h2[.='Forgot Password']")
    public WebElement forgotPasswordHeader;
    public WebElement getForgotPasswordHeader() {
        return forgotPasswordHeader;
    }

    //EmailField
    @FindBy(xpath="/html//input[@id='email']")
    public WebElement emailField;
    public WebElement getEmailField(){
        return emailField;
    }

    //Retrieve Password Button
    @FindBy(xpath = "//button[@id='form_submit']/i[@class='icon-2x icon-signin']")
    public WebElement retrievePasswordButton;
    public WebElement getRetrievePasswordButton() {
        return retrievePasswordButton;
    }
}
