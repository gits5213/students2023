package com.gits.herokuapp.TestCases.FormAuthentication;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FormAuthenticationValidate;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword extends BaseClass {

    @Test
    public void invalidPassword(){

        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);


        //click on form authentication link
          lp.formAuthentication.click();
          sleepTime(1000);

        //Enter valid username
        fav.getUserName().sendKeys(Data.FORM_AUTHENTICATION_USER_NAME);
        sleepTime(1000);

        //Enter invalid password
        fav.getPassword().sendKeys(Data.FORM_AUTHENTICATION_INVALID_PASSWORD);
        sleepTime(500);

        //click on login button
        fav.getLoginClick().click();
        sleepTime(500);

        //validate login error massages
        WebElement errorMassage = driver.findElement(By.cssSelector("div#flash"));
        String actualErrorMassageText = errorMassage.getText();
        String expectedLoginErrorMassage = Data.FORM_AUTHENTICATION_PASSWORD_ALERT_TEXT;
        Assert.assertEquals(actualErrorMassageText, expectedLoginErrorMassage);






    }
}
