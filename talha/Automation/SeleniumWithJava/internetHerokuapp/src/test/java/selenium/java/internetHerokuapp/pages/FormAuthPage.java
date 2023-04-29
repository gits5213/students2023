package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class FormAuthPage extends BasePage {
    public FormAuthPage(WebDriver driver) {
        super(driver);
    }
    //Header 1
    @FindBy(xpath = "//div[@id='content']//h2[.='Login Page']")
    public WebElement  formAuthLoginPageHeader1;
    public WebElement getFormAuthLoginPageHeader1() {
        return formAuthLoginPageHeader1;
    }
    //Header 2
    @FindBy(xpath = "//div[@id='content']//h4[@class='subheader']")
    public WebElement formAuthLoginPageHeader2;
    public WebElement getFormAuthLoginPageHeader2() {
        return formAuthLoginPageHeader2;
    }
    //UsernameField
    @FindBy(xpath = "/html//input[@id='username']")
    public WebElement userNameField ;
    public WebElement getUserNameField() {
        return userNameField;
    }
    //PasswordField
    @FindBy (xpath = "/html//input[@id='password']")
    public WebElement passwordField;
    public WebElement getPasswordField() {
        return passwordField;
    }
    //Login Button
    @FindBy (xpath = "//form[@id='login']/button[@class='radius']")
    public WebElement logInButton;
    public WebElement getLogInButton() {
        return logInButton;
    }
    //Alert
    @FindBy (xpath = "/html//div[@id='flash']")
    public WebElement alert;
    public WebElement getAlert() {
        return alert;
    }

}
