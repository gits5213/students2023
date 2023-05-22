package com.gits.Herokuapp.TestCases;


import com.gits.Herokuapp.Pom.FormAuthenticationValidate;
import com.gits.Herokuapp.Pom.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserName extends BaseTests {
    @Test
    public void invalidUsername(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);

        //Click the Authentication link
        lp.formAuthentication.click();
        sleepTime(1000);

        //Enter invalid username
        fav.getUsername().sendKeys("tomsmith@");
        sleepTime(1000);

        //Enter valid password
        fav.getPassword().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //Click the login link
        fav.getLogBtn().click();
        sleepTime(2000);

        //Login invalid username massage
        WebElement invalidMassageText=driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText=invalidMassageText.getText();
        String expectedLoginMassageText="Your username is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText,expectedLoginMassageText);


    }

}
