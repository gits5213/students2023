package com.theinternetherokuapp.javaSelenium.testCases;

import com.theinternetherokuapp.javaSelenium.utilities.driverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class TestSharebusCo {

    //Custom basic function with explicit wait time for element to be visible
    public static WebElement basicWaitForElementToBeVisible(WebDriver driver, By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Custom function with explicit wait time for element to be clickable
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
    //Custom function with explicit wait time for element to be clickable and click
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
        element.click();

    }

    //Custom function with explicit wait time for element to be visible
    public static WebElement waitForElementToBeVisible(WebDriver driver, By by, int timeoutInSeconds) {
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

    //Custom function with explicit wait time for element to be invisible or disappear
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

    //Custom function for sending a string to a text box with default value erasing
    public static void sendKeys(WebDriver driver, By by, int timeoutInSeconds, String text) throws InterruptedException {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.click(element)
                .sendKeys(Keys.CONTROL + "a")
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys(text)
                .click(driver.findElement(By.cssSelector("body")))
                .build()
                .perform();
    }
    //Custom function for scrolling to specific element by locator
    public static void scrollToElement(WebDriver driver, By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center', behavior: 'smooth'});", element);;
    }

    //Custom function for scrolling to specific pixel
    public static void scrollVertically(WebDriver driver, int pixels) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", pixels);
    }

    //JavaScriptExecutor for clicking hidden element
    public static void clickHiddenElement(WebDriver driver, By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public static void clickOnBody(WebDriver driver){

        WebElement click = driver.findElement(By.tagName("body"));
    }


    @Test

    public void SharebusCo() throws InterruptedException {

        WebDriver driver = new driverManager().getDriver();

        //Global implicit wait time for elements
        //driver.manage().timeouts().implicitlyWait(120 , TimeUnit.SECONDS);

        //Driver window maximize
        driver.manage().window().maximize();

        //navigation to base url
        driver.get("https://test.sharebus.co/");

        //click login
        //Thread.sleep(3000);
        //waitForElementToDisappear(driver,By.cssSelector("#app > div.position-absolute.vw-100.vh-100.d-flex.align-items-center.overlay.flex-column.justify-content-center.position-fixed.overlay-primary-background"));
        //waitForElementToBeClickableAndClick(driver,By.cssSelector(".btn.btn-sm.ms-2.sb-btn-md.sb-btn-primary.text-white"),10);
        driver.findElement(By.cssSelector(".btn.btn-sm.ms-2.sb-btn-md.sb-btn-primary.text-white")).click();
        driver.findElement(By.cssSelector(".btn.fw-normal.px-3.py-1.rounded-pill.sb-btn-lg.sb-btn-secondary")).click();

        //enter username
        driver.findElement(By.cssSelector("input#email")).sendKeys("brainstation23@yopmail.com");

        //enter password
        driver.findElement(By.cssSelector("input#password")).sendKeys("Pass@1234");

        //Signing click
        driver.findElement(By.cssSelector(".btn.fw-bold.rounded-pill.sb-btn-lg.sb-btn-primary.w-100")).click();

        //dropdown click
        waitForElementToBeClickableAndClick(driver,By.cssSelector(".p-component.p-dropdown.p-inputwrapper.p-inputwrapper-filled.w-50 > div[role='button']"), 10);

        //Select Sharelead
        driver.findElement(By.cssSelector("ul[role='listbox'] > li:nth-of-type(2)")).click();

        //Continue Click
        driver.findElement(By.cssSelector(".align-items-center.align-self-center.btn.btn-primary.btn-success.d-flex.fw-bolder.justify-content-between.mt-3.my-3.px-4.rounded-pill.text-white")).click();

        //Set up a share bus click
//        Thread.sleep(2000);
        waitForElementToDisappear(driver,By.cssSelector("#app > div.position-absolute.vw-100.vh-100.d-flex.align-items-center.overlay.flex-column.justify-content-center.position-fixed.overlay-primary-background"));
        waitForElementToBeClickableAndClick(driver, By.cssSelector("[class='btn btn-primary sb-btn-primary sb-btn-lg px-4 py-1 my-2 rounded-pill border-0 fw-400']"), 20);
//        driver.findElement(By.cssSelector("[class='btn btn-primary sb-btn-primary sb-btn-lg px-4 py-1 my-2 rounded-pill border-0 fw-400']")).click();

        //enter From
        //Thread.sleep(2000);
        waitForElementToDisappear(driver,By.cssSelector("#app > div.position-absolute.vw-100.vh-100.d-flex.align-items-center.overlay.flex-column.justify-content-center.position-fixed.overlay-primary-background"));
        scrollToElement(driver,By.cssSelector("[class='my-3'] [type]"));
        driver.findElement(By.cssSelector("[class='my-3'] [type]")).sendKeys("Oslo, Norwa");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='my-3'] [type]")).sendKeys(Keys.SPACE);
        waitForElementToBeClickableAndClick(driver, By.cssSelector("body > div:nth-child(6) > div:nth-child(2)"), 20);

        //enter To
        //Thread.sleep(2000);
        scrollToElement(driver,By.cssSelector("form div:nth-child(3) [type='text']"));
        scrollVertically(driver,100);
        waitForElementToBeClickableAndClick(driver,By.cssSelector("form div:nth-child(3) [type='text']"),10);
        driver.findElement(By.cssSelector("form div:nth-child(3) [type='text']")).sendKeys("Kolbotn, Norwa");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("form div:nth-child(3) [type='text']")).sendKeys(Keys.SPACE);
        waitForElementToBeClickableAndClick(driver, By.cssSelector("body > div:nth-child(7) > div:nth-child(1)"), 10);

        //select departure
        //Thread.sleep(2000);
        scrollToElement(driver,By.cssSelector("[placeholder='Departure Date']"));
        scrollVertically(driver,100);
        waitForElementToBeClickableAndClick(driver, By.cssSelector("[placeholder='Departure Date']"), 10);
        clickHiddenElement(driver,By.cssSelector(".p-datepicker-next.p-link"));
        waitForElementToBeClickableAndClick(driver,By.cssSelector("tr:nth-of-type(4) > td:nth-of-type(6)"),10);
        waitForElementToBeClickableAndClick(driver, By.cssSelector("[class='row my-3'] [class='col-sm-12 col-md-6']:nth-of-type(1) [placeholder='Time']"), 10);
        sendKeys(driver,By.cssSelector("[class='row my-3'] [class='col-sm-12 col-md-6']:nth-of-type(1) [placeholder='Time']"), 10, "06:33");


        //select return
        //Thread.sleep(2000);
        scrollToElement(driver,By.cssSelector(".my-4.row .p-component.p-inputtext.pv-datepicker-input"));
        waitForElementToBeClickableAndClick(driver,By.cssSelector(".my-4.row .p-component.p-inputtext.pv-datepicker-input"), 10);
        clickHiddenElement(driver,By.cssSelector(".p-datepicker-next.p-link"));
        waitForElementToBeClickableAndClick(driver,By.cssSelector("tr:nth-of-type(5) > td:nth-of-type(3)"),10);
        waitForElementToBeClickableAndClick(driver, By.cssSelector("[class='row my-4'] [class='col-sm-12 col-md-6']:nth-of-type(1) [placeholder='Time']"), 10);
        sendKeys(driver,By.cssSelector("[class='row my-4'] [class='col-sm-12 col-md-6']:nth-of-type(1) [placeholder='Time']"),10, "06:33");

        //Click continue
        scrollToElement(driver,By.cssSelector(".align-items-center.border-0.btn.d-flex.fw-bold.justify-content-center.rounded-pill.sb-btn-lg.sb-btn-primary"));
        waitForElementToBeClickableAndClick(driver, By.cssSelector(".align-items-center.border-0.btn.d-flex.fw-bold.justify-content-center.rounded-pill.sb-btn-lg.sb-btn-primary"), 10);

        //Click Yes Set up a Sharebus
        //Thread.sleep(7000);
        waitForElementToBeClickableAndClick(driver, By.cssSelector(".border-light"), 20);
        driver.findElement(By.cssSelector(".fi-chevron-down")).click();
        driver.findElement(By.cssSelector(".results > ul > li:nth-of-type(4)")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();

        //Click create share bus
        //Thread.sleep(4000);
        waitForElementToBeClickableAndClick(driver, By.cssSelector(".btn.btn-discount-size.gray-white-bg.rounded-end.ship-gray"), 10);
        //Thread.sleep(4000);
        scrollToElement(driver,By.cssSelector("[class='discount-ticket-wrapper p-4 light-gray-bg mb-2 mt-2'] .rounded-end"));
        waitForElementToBeClickableAndClick(driver, By.cssSelector("[class='discount-ticket-wrapper p-4 light-gray-bg mb-2 mt-2'] .rounded-end"), 10);
        //Thread.sleep(4000);
        waitForElementToBeClickableAndClick(driver, By.cssSelector("[type='submit']"), 10);

        //Click publish
        //Thread.sleep(4000);
        driver.findElement(By.cssSelector(".align-items-center.btn.d-flex.fw-bold.justify-content-center.mt-2.rounded-pill.sb-btn-lg.sb-btn-primary")).click();

        //Click Trip details
        //Thread.sleep(4000);
        sendKeys(driver,By.cssSelector(".col-md-6.col-sm-12.my-4 > .input-group > .form-control.rounded"),10, "AB trip");
        driver.findElement(By.cssSelector("div#other4 > .mb-0")).click();
        driver.findElement(By.cssSelector(".border-light.rounded.ship-gray.w-100")).sendKeys("AB trip");
        driver.findElement(By.cssSelector("div:nth-of-type(2) > .input-group > .form-control.rounded")).sendKeys("https://test.sharebus.co/");
        //Thread.sleep(4000);



        driver.quit();



    }

}
