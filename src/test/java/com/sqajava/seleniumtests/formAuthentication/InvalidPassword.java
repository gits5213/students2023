package com.sqajava.seleniumtests.formAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword {

    @Test
    public void invalidPassword() throws InterruptedException {

        //Precondition - Chrome browser open
        WebDriver driver = new ChromeDriver();

        //Navigate to the URL https://the-internet.herokuapp.com/
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(500);

        //Click on Form authentication link
//        driver.findElement(By.cssSelector("li:nth-of-type(21) > a")).click(); // Single element
        WebElement fromAuthentication = driver.findElement(By.cssSelector("li:nth-of-type(21) > a")); // Multiple element
        fromAuthentication.click();
        Thread.sleep(500);

        //Enter valid username
        WebElement username = driver.findElement(By.cssSelector("input#username"));
        username.sendKeys("tomsmith");
        Thread.sleep(500);

        // Enter invalid password
        WebElement password = driver.findElement(By.cssSelector("input#password"));
        password.sendKeys("tomsmith");
        Thread.sleep(500);

        // Click on login button
        WebElement loginButton = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
        loginButton.click();
        Thread.sleep(5000);

        // Validate login error message
        WebElement errorMessage = driver.findElement(By.cssSelector("div#flash"));
        String actualErrorMessageText = errorMessage.getText();
        String expectedLoginErrorMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(actualErrorMessageText,expectedLoginErrorMessage);

        // browser close
        driver.close();

        // WebDriver close
        driver.quit();


    }
}
