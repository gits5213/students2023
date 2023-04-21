package com.theinternetherokuapp.javaSelenium.testCases.formAuthentication;

import com.theinternetherokuapp.javaSelenium.utilities.data;
import com.theinternetherokuapp.javaSelenium.utilities.driverManager;
import com.theinternetherokuapp.javaSelenium.utilities.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInvalidUsernameValidPassword {


    @Test
    public  void invalidUsernameValidPassword() throws InterruptedException {


        //Driver initialization
        WebDriver driver = new driverManager().getDriver();


        // Navigate to the URL method 1
        //driver.get(data.baseUrl);

        // Navigate to the URL method 2
        driver.navigate().to(data.baseUrl);

        //Get the current URL
        String currentUrl = driver.getCurrentUrl();

        // Validating the URL
        Assert.assertEquals(data.baseUrl,currentUrl);

        //Ads a sleep time
        //Thread.sleep(2000);

        // Finds the locator of Form authentication and clicks on it
        driver.findElement(By.cssSelector(locators.locatorFormAuthentication)).click();

        //Adds a sleep time
        //Thread.sleep(2000);

        driver.findElement(By.cssSelector(locators.locatorUserID)).sendKeys(data.invalidUserName);

        driver.findElement(By.cssSelector(locators.locatorPassword)).sendKeys(data.password);

        driver.findElement(By.cssSelector(locators.locatorLoginButton)).click();

        WebElement element = driver.findElement(By.cssSelector(locators.locatorLoginMessage));
        String actualLoginErrorMessage = element.getText();

        System.out.println(actualLoginErrorMessage);

        Assert.assertEquals(data.invalidLoginMessageForUsername,actualLoginErrorMessage);

        //Thread.sleep(2000);

        driver.quit();


    }
}
