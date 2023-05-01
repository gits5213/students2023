package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VisibilityCommands {

    public static WebElement WaitForElementToBeVisibleBasic(WebDriver driver, By by) {
        int timeoutInSeconds = 10;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    ////////////////////////////////////////////////////////////////////////////////

    public static WebElement waitForElementToBeVisible(WebDriver driver, By by) {
        int timeoutInSeconds = 10;
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(1000))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    ////////////////////////////////////////////////////////////////////////////////

    public static void waitForElementToDisappear(WebDriver driver, By by) {
        int timeoutInSeconds = 10;
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(1000))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
}
