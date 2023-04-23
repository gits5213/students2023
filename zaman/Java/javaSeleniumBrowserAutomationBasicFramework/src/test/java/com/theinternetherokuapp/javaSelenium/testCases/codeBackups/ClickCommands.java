package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ClickCommands {

    ////////////////////////////////////////////////////////////////////////////////

    public static void waitForElementToBeClickableAndClick(WebDriver driver, By by, int timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(1000))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        scrollToElementAndClick(driver, element);
    }

    public static void scrollToElementAndClick(WebDriver driver, WebElement element) {
        // Check if element is clickable
        if (isElementClickable(element)) {
            // Scroll to element to bring it into viewable area
            scrollToElement(driver, element);
            // Click on the element
            element.click();
        } else {
            throw new IllegalStateException("Element is not clickable.");
        }
    }
    //Not absolutely necessary but it makes the validation more strict
    public static boolean isElementClickable(WebElement element) {
        try {
            // Check if element is enabled and displayed
            return element.isEnabled() && element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            return false;
        }
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        // Scroll to the element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    ////////////////////////////////////////////////////////////////////////////////

    public static WebElement waitForElementToBeClickable(WebDriver driver, By by, int timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(1000))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);


        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    ////////////////////////////////////////////////////////////////////////////////

    public static void waitForElementToBeClickableAndClickBasic(WebDriver driver, By by, int timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(1000))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();

    }

    ////////////////////////////////////////////////////////////////////////////////

    public static void clickHiddenElement(WebDriver driver, By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    ////////////////////////////////////////////////////////////////////////////////

    public static void clickOnBody(WebDriver driver){

        WebElement click = driver.findElement(By.tagName("body"));
    }

}
