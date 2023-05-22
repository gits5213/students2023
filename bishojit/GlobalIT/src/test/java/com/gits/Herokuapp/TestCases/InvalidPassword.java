package com.gits.Herokuapp.TestCases;


import com.gits.Herokuapp.Pom.FormAuthenticationValidate;
import com.gits.Herokuapp.Pom.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword extends BaseTests {

    @Test
    public void invalidPassword(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);


        //click the form authentication link
        lp.formAuthentication.click();
        sleepTime(1000);

        //enter valid username
        fav.getUsername().sendKeys("tomsmith");
        sleepTime(1000);

        //enter invalid password
        fav.getPassword().sendKeys("SuperSecretPassword");
        sleepTime(1000);

        //click on login link
        fav.getLogBtn().click();
        sleepTime(1000);

        //login button invalid password massage
        WebElement invalidMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = invalidMassage.getText();
        String expectedLoginMassageText = "Your password is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText ,expectedLoginMassageText);



    }
}
