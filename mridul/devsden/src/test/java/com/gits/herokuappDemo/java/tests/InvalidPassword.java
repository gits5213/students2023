package com.gits.herokuappDemo.java.tests;

import com.gits.herokuappDemo.java.pom.LandingPage;
import com.gits.herokuappDemo.java.pom.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.invokers.TestMethodWithDataProviderMethodWorker;
import org.w3c.dom.Text;

import java.awt.*;

import static com.gits.herokuappDemo.java.Utilities.Data.USERNAME;

public class InvalidPassword extends BaseTest {
    String expectedLoginErrorMessage = "Your password is invalid!\n" +
            "×";

    @Test
    public void invalidPassword() throws InterruptedException {

        LandingPage lp = new LandingPage(driver);
        LoginPage lop = new LoginPage(driver);
        lp.getFormAuthentication().click();
        sleepTime(1000);


        /*
        clickOnElement(lp.getFormAuthentication());
        typeText(lop.getUsername(), TestData USERNAME);
        typeText(lop.getPassword(), "tomsmith");
        clickOnElement(lop.getLoginbutton());

         */
        lop.getUsername().sendKeys("tomsmith");
        lop.getPassword().sendKeys("TestData.PASSWORD");
        lop.getLoginbutton().click();

        /*
        //Click on form authentication button
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //Enter valid username
        lop.getUsername().sendKeys("tomsmith");
        sleepTime(1000);

        // Enter invalid password
        lop.getPassword().sendKeys("tomsmith");
        sleepTime(1000);

        // Click on login button
        lop.getLoginbutton().click();
        sleepTime(1000);

         */

        // Validate login error message
        WebElement errorMessage = driver.findElement(By.cssSelector("#flash"));
        String actualErrorMessageText = errorMessage.getText();
        Assert.assertEquals(actualErrorMessageText, expectedLoginErrorMessage);


    }
}
