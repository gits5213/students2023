package com.gits.herokuapp.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword {

    String expectedLoginErrorMessage = "Your password is invalid!\n" +
            "×";

    @Test
    public void invalidPassword() throws InterruptedException {

        //Precondition - Chrome browser open
        WebDriver driver = new ChromeDriver();

        //Navigate to the URL https://the-internet.herokuapp.com/
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(1000);

        //Click on Form authentication link
        WebElement formAuthentication = driver.findElement(By.cssSelector("li:nth-of-type(21) > a"));
        formAuthentication.click();
        Thread.sleep(1000);

        //Enter valid username
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("tomsmith");
        Thread.sleep(1000);

        // Enter invalid password
        WebElement invalidpassword = driver.findElement(By.cssSelector("#password"));
        invalidpassword.sendKeys("tomsmith");
        Thread.sleep(1000);

        // Click on login button
        WebElement loginbuttonclick = driver.findElement(By.cssSelector("#login > button"));
        loginbuttonclick.click();
        Thread.sleep(1000);

        // Validate login error message
        WebElement errorMessage = driver.findElement(By.cssSelector("#flash"));
        String actualErrorMessageText = errorMessage.getText();
        Assert.assertEquals(actualErrorMessageText, expectedLoginErrorMessage);

        // browser close
        driver.close();

        // WebDriver close
        driver.quit();

    }
}
