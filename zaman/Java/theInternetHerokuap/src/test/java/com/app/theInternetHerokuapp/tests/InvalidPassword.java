package com.gits.herokuapp.java.tests;

import com.gits.herokuapp.java.pom.LandingPage;
import com.gits.herokuapp.java.pom.LoginPage;
import com.gits.herokuapp.java.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword extends com.gits.herokuapp.java.tests.BaseTest {

    String expectedLoginErrorMessage = "Your password is invalid!\n" +
            "×";

    @Story("gits-5214-Invalid-Password")
    @Description ("Invalid Password")
    @Test
    public void invalidPassword() throws InterruptedException {

        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //=====Page Object with page factory Automation==================
//        landingPage.getFormAuthentication().click();
//        loginPage.getUsername().sendKeys(TestData.USERNAME);
//        loginPage.getPassword().sendKeys(TestData.PASSWORD);
//        loginPage.getLoginBtn().click();

        //======Keyword Driven and DataDriven======
        clickOnElement(landingPage.getFormAuthentication());
        typeText(loginPage.getUsername(), TestData.USERNAME);
        typeText(loginPage.getPassword(), TestData.PASSWORD);
        clickOnElement(loginPage.getLoginBtn());





        //=====Basic Automation==================

        //Click on Form authentication link
//        WebElement formAuthentication = driver.findElement(By.cssSelector("li:nth-of-type(21) > a"));
//        formAuthentication.click();
//        Thread.sleep(500);

        //Enter valid username
//        WebElement username = driver.findElement(By.cssSelector("input#username"));
//        username.sendKeys("tomsmith");
//        Thread.sleep(500);

        // Enter invalid password
//        WebElement password = driver.findElement(By.cssSelector("input#password"));
//        password.sendKeys("tomsmith");
//        Thread.sleep(500);

        // Click on login button
//        WebElement loginBtn = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
//        loginBtn.click();
//        Thread.sleep(5000);

        // Validate login error message
        WebElement errorMessage = driver.findElement(By.cssSelector("div#flash"));
        String actualErrorMessageText = errorMessage.getText();
        Assert.assertEquals(actualErrorMessageText, expectedLoginErrorMessage);




    }
}













//
//
//
//        driver.close();
//        driver.quit();

