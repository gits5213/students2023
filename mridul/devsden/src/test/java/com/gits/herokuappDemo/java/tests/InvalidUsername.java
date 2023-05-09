package com.gits.herokuappDemo.java.tests;

import com.gits.herokuappDemo.java.pom.LandingPage;
import com.gits.herokuappDemo.java.pom.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUsername extends BaseTest {


    @Test
    public void invalidUserName(){

        LandingPage lp = new LandingPage(driver);
        LoginPage lop = new LoginPage(driver);

        //Click on form authentication button
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //Enter inValid Username
        lop.getUsername().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //Enter valid password
        lop.getPassword().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //click on login button
        lop.getLoginbutton().click();
        sleepTime(1000);


        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualErrorMassageText = errorMassage.getText();
        String expectedErrorMassageText = "Your username is invalid!\n"+"×";
        Assert.assertEquals(actualErrorMassageText, expectedErrorMassageText);

        //okk done


    }
}






