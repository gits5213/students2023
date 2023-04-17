package com.gits.herokuapp.java.tests;

import com.gits.herokuapp.java.pom.LandingPage;
import com.gits.herokuapp.java.pom.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword extends BaseTest{

    String expectedLoginErrorMessage = "Your password is invalid!\n" +
            "×";

    @Test
    public void invalidPassword() throws InterruptedException {

        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //=====Page Object with page factory Automation==================
        //landingPage.getFormAuthentication().click();
        //loginPage.getUsername().sendKeys("dfasdfafdsaf");
        //loginPage.getPassword().sendKeys("fdadsfasdfa");
        //loginPage.getLoginBtn().click();

        //======Keyword Driven and DataDriven======
        clickOnElement(landingPage.getFormAuthentication());
        typeText(loginPage.getUsername(), "tomsmith");
        typeText(loginPage.getPassword(), "sfasdfasdfas");
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

