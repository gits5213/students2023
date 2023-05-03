package com.gits.herokuapp.TestCases.FormAuthentication;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FormAuthenticationValidate;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserNamePassword extends BaseClass {

    @Test
    public void invalidUserNamePassword(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);


        //click on form authentication link
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //Enter invalid Username
        fav.getUserName().sendKeys(Data.FORM_AUTHENTICATION_INVALID_USER_NAME);
        sleepTime(1000);

        //Enter invalid password
        fav.getPassword().sendKeys(Data.FORM_AUTHENTICATION_INVALID_PASSWORD);
        sleepTime(1000);

        //click on login button
        fav.getLoginClick().click();
        sleepTime(1000);

        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginErrorMassageText = errorMassage.getText();
        String expectedLoginErrorMassageText = Data.FORM_AUTHENTICATION_USERNAME_ALERT_TEXT;
        Assert.assertEquals(actualLoginErrorMassageText ,expectedLoginErrorMassageText);

    }

}
