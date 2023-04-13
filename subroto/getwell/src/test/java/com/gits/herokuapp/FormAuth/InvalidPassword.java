package com.gits.herokuapp.FormAuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword {

    @Test
    public void invalidPassword() throws InterruptedException {


        //Precondition Chrome browser open
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the url
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(500);

        //click on form authentication link
        WebElement formAuth = driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a"));
        formAuth.click();
        Thread.sleep(500);

        //Enter valid username
        WebElement validName = driver.findElement(By.cssSelector("#username"));
        validName.sendKeys("tomsmith");
        Thread.sleep(500);

        //Enter invalid password
        WebElement invalidPass = driver.findElement(By.cssSelector("#password"));
        invalidPass.sendKeys("tomsmith");
        Thread.sleep(500);

        //click on login button
        WebElement loginClick = driver.findElement(By.cssSelector("#login > button > i"));
        loginClick.click();
        Thread.sleep(2500);

        //validate login error massages
        WebElement errorMassage = driver.findElement(By.cssSelector("div#flash"));
        String actualErrorMassageText = errorMassage.getText();
        String expectedLoginErrorMassage = "Your password is invalid!\n"+ "×";
        Assert.assertEquals(actualErrorMassageText, expectedLoginErrorMassage);



        //browser close
        driver.close();

        //Webdriver close
        driver.quit();




    }
}
