package com.theinternetherokuapp.javaSeleniumBrowserAutomationBasicFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

    public static void main(String[] args) {
        //System.out.println("Im up and running");

        // Locators
        String baseUrl = "https://the-internet.herokuapp.com/";
        String locatorFormAuthentication = "#content > ul > li:nth-child(21) > a";
        String locatorUserID = "#username";
        String locatorPassword = "#password";
        String locatorLoginButton = "#login > button";
        String locatorLoginMessage = "#flash";
        String locatorLogoutButton = ".button.radius.secondary";
        String locatorLogoutMessage = "#flash";

        // Data
        String userName = "tomsmith";
        String password = "SuperSecretPassword!";
        String loginMessage ="You logged into a secure area!\n×";
        String logoutMessage ="You logged out of the secure area!\n×";

        //Default initializations
        WebDriver driver = new ChromeDriver();


        // Navigate to the URL method 1
        //driver.get("https://www.example.com");

        // Navigate to the URL method 2
        driver.navigate().to(baseUrl);

        //Get the current URL
        String currentUrl = driver.getCurrentUrl();

        // Validating the URL
        if (currentUrl.equals(baseUrl)) {
            System.out.println("The url is valid");
        }
        else{
            System.out.println("The URL is invalid");
        }

        //Ads a sleep time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the locator of Form authentication and clicks on  it
        driver.findElement(By.cssSelector(locatorFormAuthentication)).click();

        //Ads a sleep time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(locatorUserID)).sendKeys(userName);

        driver.findElement(By.cssSelector(locatorPassword)).sendKeys(password);

        driver.findElement(By.cssSelector(locatorLoginButton)).click();

        WebElement element = driver.findElement(By.cssSelector(locatorLoginMessage));
        String actualMessage = element.getText();

//        System.out.println(actualMessage);
//        System.out.println(loginMessage);

        // Validating the successful message for login
        if (loginMessage.equals(actualMessage)) {
            System.out.println(actualMessage);
            System.out.println("Successful message is valid");
        }
        else{
            System.out.println("Successful message is invalid!!");
        }

        //Ads a sleep time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector(locatorLogoutButton)).click();

        WebElement element1 = driver.findElement(By.cssSelector(locatorLogoutMessage));
        String actualMessage1 = element1.getText();

        // Validating the successful message for logout
        if (logoutMessage.equals(actualMessage1)) {
            System.out.println(actualMessage1);
            System.out.println("Successful message is valid");
        }
        else{
            System.out.println("Successful message is invalid!!");
        }

        //Ads a sleep time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        driver.quit();


    }
}
