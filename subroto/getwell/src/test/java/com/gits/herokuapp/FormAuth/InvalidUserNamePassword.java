package com.gits.herokuapp.FormAuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserNamePassword {

    @Test
    public void invalidUserNamePassword() throws InterruptedException {

      //Precondition -Chrome browser open
        WebDriver driver = new ChromeDriver();

        //navigate the url
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //click on form authentication link
        WebElement formAuth = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuth.click();
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
        WebElement logBtn = driver.findElement(By.cssSelector("#login > button"));
        logBtn.click();
        Thread.sleep(1000);

        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginErrorMassageText = errorMassage.getText();
        String expectedLoginErrorMassageText = "Your username is invalid!\n"+"×";
        Assert.assertEquals(actualLoginErrorMassageText ,expectedLoginErrorMassageText);

        //browser close
        driver.close();

        //webDriver close
        driver.quit();
    }

}
