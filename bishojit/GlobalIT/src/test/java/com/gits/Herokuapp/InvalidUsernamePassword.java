package com.gits.Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUsernamePassword {
    @Test
    public void inValidUsernamePassword() throws InterruptedException {

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

        //enter invalid username
        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("tinsmith");
        Thread.sleep(1000);

        //enter invalid password
        WebElement wrongPass = driver.findElement(By.cssSelector("#password"));
        wrongPass.sendKeys("SuperPassword!");
        Thread.sleep(1000);

        //click on login link
        WebElement loginBtn = driver.findElement(By.cssSelector("#login > button > i"));
        loginBtn.click();
        Thread.sleep(2000);

        //login button valid massage
        WebElement invalidMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = invalidMassage.getText();
        String expectedLoginMassageText = "Your username is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText, expectedLoginMassageText);

        //browser close
        driver.close();

        //webDriver close
        driver.quit();
    }
}
