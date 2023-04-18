package com.gits.Herokuapp.TestCases;

import com.gits.Herokuapp.Pom.FormAuthenticationValidate;
import com.gits.Herokuapp.Pom.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidUserNamePassword extends BaseTests {
    @Test
    public void validUsernamePassword(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);


        //click the form authentication link
        lp.formAuthentication.click();
        sleepTime(1000);

        //enter invalid username
        fav.getUsername().sendKeys("tomsmith");
        sleepTime(1000);

        //enter invalid password
        fav.getPassword().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //click on login link
        fav.getLogBtn().click();
        sleepTime(1000);

        //login button valid massage
        WebElement validMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = validMassage.getText();
        String expectedLoginMassageText = "You logged into a secure area!\n" + "×";
        Assert.assertEquals(actualLoginMassageText, expectedLoginMassageText);

    }
}
