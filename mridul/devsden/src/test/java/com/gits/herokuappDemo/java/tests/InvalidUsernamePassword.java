package com.gits.herokuappDemo.java.tests;

import com.gits.herokuappDemo.java.pom.LandingPage;
import com.gits.herokuappDemo.java.pom.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUsernamePassword extends BaseTest {
    String expectedloginErrorMassageText = "Your username is invalid!\n"+"×";

    @Test
    public void invalidUserNamePassword() throws InterruptedException {

        LandingPage lp = new LandingPage(driver);
        LoginPage lop = new LoginPage(driver);
        lp.getFormAuthentication().click();
        sleepTime(1000);

        lop.getUsername().sendKeys("SuperSecretPassword!");
        lop.getPassword().sendKeys("tomsmith");
        lop.getLoginbutton().click();

        /*
        //click on form authentication link
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //Enter invalid Username
        lop.getUsername().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //Enter invalid password
        lop.getPassword().sendKeys("tomsmith");
        sleepTime(1000);

        //click on login button
        lop.getLoginbutton().click();
        sleepTime(1000);

         */

        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualErrorMassageText = errorMassage.getText();
        Assert.assertEquals(actualErrorMassageText ,expectedloginErrorMassageText);

        /*
        //browser close
        driver.close();

        //webDriver close
        driver.quit();

         */
    }

}
