package com.theinternetherokuapp.javaSeleniumBrowserAutomationBasicFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.theinternetherokuapp.javaSeleniumBrowserAutomationBasicFramework.utilities.driverManager;

import com.theinternetherokuapp.javaSeleniumBrowserAutomationBasicFramework.utilities.data;
import com.theinternetherokuapp.javaSeleniumBrowserAutomationBasicFramework.utilities.locators;


public class FormAuthentication {

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

    public static void main(String[] args) throws InterruptedException {

        //System.out.println("Im up and running");


        //Driver initialization
        WebDriver driver = new driverManager().getDriver();


        // Navigate to the URL method 1
        driver.get(data.baseUrl);

        // Navigate to the URL method 2
        driver.navigate().to(data.baseUrl);

        //Get the current URL
        String currentUrl = driver.getCurrentUrl();

        // Validating the URL
        if (currentUrl.equals(data.baseUrl)) {
            System.out.println("The url is valid");
        }
        else{
            System.out.println("The URL is invalid");
        }

        //Ads a sleep time
        Thread.sleep(2000);

        // Finds the locator of Form authentication and clicks on  it
        driver.findElement(By.cssSelector(locators.locatorFormAuthentication)).click();

        //Ads a sleep time
       Thread.sleep(2000);

        driver.findElement(By.cssSelector(locators.locatorUserID)).sendKeys(data.userName);

        driver.findElement(By.cssSelector(locators.locatorPassword)).sendKeys(data.password);

        driver.findElement(By.cssSelector(locators.locatorLoginButton)).click();

        WebElement element = driver.findElement(By.cssSelector(locators.locatorLoginMessage));
        String actualMessage = element.getText();

        if (data.loginMessage.equals(actualMessage)) {
            System.out.println(actualMessage);
            System.out.println("Successful message is valid");
        }
        else{
            System.out.println("Successful message is invalid!!");
        }

        //Ads a sleep time
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(locators.locatorLogoutButton)).click();

        WebElement element1 = driver.findElement(By.cssSelector(locators.locatorLogoutMessage));
        String actualMessage1 = element1.getText();

        // Validating the successful message for logout
        if (data.logoutMessage.equals(actualMessage1)) {
            System.out.println(actualMessage1);
            System.out.println("Successful message is valid");
        }
        else{
            System.out.println("Successful message is invalid!!");
        }

        //Ads a sleep time
        Thread.sleep(2000);



        driver.quit();


    }
}
