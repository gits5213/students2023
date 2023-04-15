package com.gits.Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUsername {
    String expectedLoginMassageText=" Your username is invalid!/n"+"x";
    @Test
    public void invalidUsername() throws InterruptedException {
        //precondition-Chrome browser open
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the URL
         driver.get("https://the-internet.herokuapp.com/");
         Thread.sleep(1000);

         //Click the Authentication link
        WebElement formAuth = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuth.click();
        Thread.sleep(1000);

        //Enter invalid username
        WebElement userName=driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("tinsmith");
        Thread.sleep(1000);

        //Enter valid password
        WebElement passWord=driver.findElement(By.cssSelector("#password"));
        passWord.sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);

        //Click the login link
        WebElement login=driver.findElement(By.cssSelector("#login > button"));
        login.click();
        Thread.sleep(2000);

        //Login invalid username massage
        WebElement invalidMassageText=driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText=invalidMassageText.getText();
        String expectedLoginMassageText="Your username is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText,expectedLoginMassageText);

        //Browser close
        driver.close();

        //Web driver close
        driver.quit();

    }

}
