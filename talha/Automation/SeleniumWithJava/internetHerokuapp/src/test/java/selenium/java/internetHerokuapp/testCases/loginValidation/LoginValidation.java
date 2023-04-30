package selenium.java.internetHerokuapp.testCases.loginValidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.FormAuthPage;
import selenium.java.internetHerokuapp.pages.TheInternet;

public class LoginValidation extends BaseClass {

    @Test(dataProvider = "loginData")
    public void loginValidation(String Username, String Password) {
        // Creating object
        TheInternet ti =new TheInternet(driver);
        FormAuthPage fp =new FormAuthPage(driver);
        ti.getFormAuthentication().click();


        // Enter the login credentials and submit the form
        fp.userNameField.sendKeys(Username);
        fp.passwordField.sendKeys(Password);
        fp.logInButton.click();

        // Check if the login was successful
        Assert.assertTrue(fp.alert.isDisplayed());

    }



}
