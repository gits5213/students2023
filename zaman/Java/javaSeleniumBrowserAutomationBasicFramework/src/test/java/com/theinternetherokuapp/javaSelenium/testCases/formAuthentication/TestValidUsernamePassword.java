package com.theinternetherokuapp.javaSelenium.testCases.formAuthentication;

import com.theinternetherokuapp.javaSelenium.utilities.data;
import com.theinternetherokuapp.javaSelenium.utilities.driverManager;
import com.theinternetherokuapp.javaSelenium.utilities.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestValidUsernamePassword {

    /*
    1. Navigate and validate the URL: https://the-internet.herokuapp.com/
    2. Click on the form authentication link
    3. Enter the username
    4. Enter the password
    5. Click on the login button
    6. Validate the successful message.
    7. Click Logout
    8. Validate the Logout message.
     */

    @Test
    public  void ValidUsernamePassword() throws InterruptedException {


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

        driver.findElement(By.cssSelector(locators.locatorUserID)).sendKeys(data.userName);

        driver.findElement(By.cssSelector(locators.locatorPassword)).sendKeys(data.password);

        driver.findElement(By.cssSelector(locators.locatorLoginButton)).click();

        WebElement element = driver.findElement(By.cssSelector(locators.locatorLoginMessage));
        String actualLoginMessage = element.getText();

        System.out.println(actualLoginMessage);

        Assert.assertEquals(data.loginMessage,actualLoginMessage);

        //Adds a sleep time
        //Thread.sleep(2000);

        driver.findElement(By.cssSelector(locators.locatorLogoutButton)).click();

        WebElement element1 = driver.findElement(By.cssSelector(locators.locatorLogoutMessage));
        String actualLogoutMessage = element1.getText();

        System.out.println(actualLogoutMessage);

        // Validating the successful message for logout
        Assert.assertEquals(data.logoutMessage,actualLogoutMessage);

        //Adds a sleep time
        //Thread.sleep(2000);



        driver.quit();


    }


}
