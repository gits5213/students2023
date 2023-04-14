package com.gits.herokuapp.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidUsernamePassword {

    String expectedLoginSecureMassage = "You logged into a secure area!\n"+"×";

    @Test
    public void validUserNamePassword() throws InterruptedException {

        //precondition - chrome driver open
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //click on form authentication link
        WebElement formAuthentication = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuthentication.click();
        Thread.sleep(1000);

        //enter valid username
        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("tomsmith");
        Thread.sleep(1000);

        //enter valid password
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);

        //click on login button
        WebElement loginButton = driver.findElement(By.cssSelector("#login > button > i"));
        loginButton.click();
        Thread.sleep(1000);

        //validate login secure area massage
        WebElement secureMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginSecureMassage = secureMassage.getText();
        Assert.assertEquals(actualLoginSecureMassage ,expectedLoginSecureMassage);

        //browser close
        driver.close();

        //webDriver close
        driver.quit();
    }

}
