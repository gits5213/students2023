package com.gits.Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword {

    @Test
    public void invalidPassword() throws InterruptedException {

        //precondition-chorme browser open
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();


        //navigate to the URL
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //click the form authentication link
        WebElement formAuth = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuth.click();
        Thread.sleep(1000);

        //enter valid username
        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("tomsmith");
        Thread.sleep(1000);

        //enter invalid password
        WebElement wrongPass = driver.findElement(By.cssSelector("#password"));
        wrongPass.sendKeys("#password");
        Thread.sleep(1000);

        //click on login link
        WebElement loginBtn = driver.findElement(By.cssSelector("#login > button > i"));
        loginBtn.click();
        Thread.sleep(2000);

        //login button invalid password massage
        WebElement invalidMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = invalidMassage.getText();
        String expectedLoginMassageText = "Your password is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText ,expectedLoginMassageText);

        //browser close
        driver.close();

        //webDriver close
        driver.quit();


    }
}
