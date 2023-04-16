package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Pages.FormAuthenticationValidate;
import com.gits.herokuapp.Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        fav.getUserName().sendKeys("tomsmith");
        sleepTime(1000);

        //Enter invalid password
        fav.getPassword().sendKeys("tomsmith");
        sleepTime(500);

        //click on login button
        fav.getLoginClick().click();
        sleepTime(500);

        //validate login error massages
        WebElement errorMassage = driver.findElement(By.cssSelector("div#flash"));
        String actualErrorMassageText = errorMassage.getText();
        String expectedLoginErrorMassage = "Your password is invalid!\n"+ "×";
        Assert.assertEquals(actualErrorMassageText, expectedLoginErrorMassage);






    }
}
