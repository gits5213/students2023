package com.gits.internetherokuapp.TestCases.FormAuthenticationValidation;

import com.gits.internetherokuapp.TestPages.FormAuthentication;
import com.gits.internetherokuapp.configuration.BaseTest;
import com.gits.internetherokuapp.configuration.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserNamePasswordValidation extends BaseTest {
    @Test
    public void inValidUsernamePassword(){
        LandingPage lp = new LandingPage(driver);
        FormAuthentication fav = new FormAuthentication(driver);


        //click the form authentication link
        lp.formAuthentication.click();
        sleepTime(1000);

        //enter invalid username
        fav.getUsernameField().sendKeys("tomsmith@");
        sleepTime(1000);

        //enter invalid password
        fav.getPasswordInputField().sendKeys("SuperSecretPassword@");
        sleepTime(1000);

        //click on login link
        fav.getLoginButton().click();
        sleepTime(2000);

        //login button valid massage
        WebElement invalidMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = invalidMassage.getText();
        String expectedLoginMassageText = "Your username is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText, expectedLoginMassageText);

    }
}
