package com.gits.herokuapp.TestCases.FormAuthentication;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FormAuthenticationValidate;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidUserNamePassword extends BaseClass {

    @Test
    public void validUserNamePassword(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);


        //click on form authentication link
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //enter valid username
        fav.getUserName().sendKeys(Data.FORM_AUTHENTICATION_USER_NAME);
        sleepTime(1000);

        //enter valid password
        fav.getPassword().sendKeys(Data.FORM_AUTHENTICATION_PASSWORD);
        sleepTime(1000);

        //click on login button
        fav.getLoginClick().click();
        sleepTime(1000);

        //validate login secure area massage
        WebElement secureMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginSecureMassage = secureMassage.getText();
        String expectedLoginSecureMassage = Data.FORM_AUTHENTICATION_LOGIN_ALERT_TEXT;
        Assert.assertEquals(actualLoginSecureMassage ,expectedLoginSecureMassage);

    }

}
