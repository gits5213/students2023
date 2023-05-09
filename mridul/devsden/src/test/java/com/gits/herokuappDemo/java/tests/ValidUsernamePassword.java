package com.gits.herokuappDemo.java.tests;

import com.gits.herokuappDemo.java.pom.LandingPage;
import com.gits.herokuappDemo.java.pom.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidUsernamePassword extends BaseTest {

    String expectedLoginSecureMassage = "You logged into a secure area!\n"+"×";

    @Test
    public void validUserNamePassword() throws InterruptedException {

        LandingPage lp = new LandingPage(driver);
        LoginPage lop = new LoginPage(driver);
        lp.getFormAuthentication().click();
        sleepTime(1000);

        lop.getUsername().sendKeys("tomsmith");
        lop.getPassword().sendKeys("SuperSecretPassword!");
        lop.getLoginbutton().click();

        /*
        //click on form authentication link

        lp.getFormAuthentication().click();
        sleepTime(1000);

        //enter valid username
        lop.getUsername().sendKeys("tomsmith");
        sleepTime(1000);

        //enter valid password
        lop.getPassword().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //click on login button
        lop.getLoginbutton().click();
        sleepTime(1000);

         */

        //validate login secure area massage
        WebElement secureMassage = driver.findElement(By.cssSelector("#flash"));
        String actualSecureMassage = secureMassage.getText();
        Assert.assertEquals(actualSecureMassage ,expectedLoginSecureMassage);

        /*
        //browser close
        driver.close();

        //webDriver close
        driver.quit();

         */
    }

}
