package com.gits.herokuapp.FormAuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidUserName {

    @Test
    public void invalidUserName() throws InterruptedException {


        //Precondition - chrome driver open
        WebDriver driver = new ChromeDriver();

        //Navigate to the url
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //Click on form authentication button
        WebElement formAuth = driver.findElement(By.cssSelector("li:nth-of-type(21) > a"));
        formAuth.click();
        Thread.sleep(1000);

        //Enter inValid Username
        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);

        //Enter valid password
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("#password");
        Thread.sleep(1000);

        //click on login button
        WebElement logButton = driver.findElement(By.cssSelector("#login > button"));
        logButton.click();
        Thread.sleep(1000);

        //validate login error massage
        WebElement errorMassage = driver.findElement(By.cssSelector("#flash"));
        String actualErrorMassageText = errorMassage.getText();
        String expectedErrorMassageText = "Your username is invalid!\n "+"×";
        Assert.assertEquals(actualErrorMassageText, expectedErrorMassageText);


        //browser close
        driver.close();

        //webDriver close
        driver.quit();


    }
}
