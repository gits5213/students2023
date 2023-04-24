package com.gits.herokuapp.TestCases.FormAuthentication;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FormAuthenticationValidate;
import com.gits.herokuapp.Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserName extends BaseClass {

    @Test
    public void invalidUserName(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);

        //Click on form authentication button
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //Enter inValid Username
        fav.getUserName().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //Enter valid password
        fav.getPassword().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //click on login button
        fav.getLoginClick().click();
        sleepTime(1000);

        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualErrorMassageText = errorMassage.getText();
        String expectedErrorMassageText = "Your username is invalid!\n "+"×";
        Assert.assertEquals(actualErrorMassageText, expectedErrorMassageText);



    }
}
