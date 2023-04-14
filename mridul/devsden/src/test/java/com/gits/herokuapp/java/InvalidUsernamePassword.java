package com.gits.herokuapp.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUsernamePassword {
    String expectedloginErrorMassageText = "Your username is invalid!\n"+"×";

    @Test
    public void invalidUserNamePassword() throws InterruptedException {

        //Precondition -Chrome browser open
        WebDriver driver = new ChromeDriver();

        //navigate the url
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //click on form authentication link
        WebElement formAuthentication = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuthentication.click();
        Thread.sleep(1000);

        //Enter invalid Username
        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);

        //Enter invalid password
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("tomsmith");
        Thread.sleep(1000);

        //click on login button
        WebElement loginButton = driver.findElement(By.cssSelector("#login > button > i"));
        loginButton.click();
        Thread.sleep(1000);

        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualloginErrorMassageText = errorMassage.getText();
        Assert.assertEquals(actualloginErrorMassageText ,expectedloginErrorMassageText);

        //browser close
        driver.close();

        //webDriver close
        driver.quit();
    }

}
