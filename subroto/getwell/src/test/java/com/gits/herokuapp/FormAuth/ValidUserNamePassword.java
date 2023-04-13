package com.gits.herokuapp.FormAuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidUserNamePassword {

    @Test
    public void validUserNamePassword() throws InterruptedException {

        //precondition - chrome driver open
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //click on form authentication link
        WebElement formAuth = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuth.click();
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
        WebElement logBtn = driver.findElement(By.cssSelector("#login > button > i"));
        logBtn.click();
        Thread.sleep(1000);

        //validate login secure area massage
        WebElement secureMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginSecureMassage = secureMassage.getText();
        String expectedLoginSecureMassage = "You logged into a secure area!\n"+"×";
        Assert.assertEquals(actualLoginSecureMassage ,expectedLoginSecureMassage);

        //browser close
        driver.close();

        //webDriver close
        driver.quit();
    }

}
