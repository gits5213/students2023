package com.gits.internetherokuapp.TestCases.FormAuthenticationValidation;

import com.gits.internetherokuapp.TestPages.FormAuthentication;
import com.gits.internetherokuapp.configuration.BaseTest;
import com.gits.internetherokuapp.configuration.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserNameValidation extends BaseTest {
    @Test
    public void invalidUsername() {
        LandingPage lp = new LandingPage(driver);
        FormAuthentication fav = new FormAuthentication(driver);

        //Click the Authentication link
        lp.formAuthentication.click();
        sleepTime(1000);

        //Enter invalid username
        fav.getUsernameField().sendKeys("tomsmith@");
        sleepTime(1000);

        //Enter valid password
        fav.getPasswordInputField().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //Click the login link
        fav.getLoginButton().click();
        sleepTime(2000);

        //Login invalid username massage
        WebElement invalidMassageText = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = invalidMassageText.getText();
        String expectedLoginMassageText = "Your username is invalid!\n" + "×";
        Assert.assertEquals(actualLoginMassageText, expectedLoginMassageText);
    }
}