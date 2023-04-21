package com.theinternetherokuapp.javaSelenium.testCases;

import com.theinternetherokuapp.javaSelenium.utilities.driverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;


public class TestSharebusCo {

//    public static WebElement waitForElementToBeVisible(WebDriver driver, By by, int timeoutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//    }



//    public static WebElement waitForElementToBeClickable(WebDriver driver, By by, int timeoutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
//
//        wait.pollingEvery(Duration.ofSeconds(1))
//                .ignoring(StaleElementReferenceException.class)
//                .ignoring(ElementNotInteractableException.class)
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(TimeoutException.class);
//
//        return wait.until(ExpectedConditions.elementToBeClickable(by));
//    }

    public static WebElement waitForElementToBeClickable(WebDriver driver, By by, int timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(TimeoutException.class);

        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
    }

    //custom function for explicit wait time to click
//    public static WebElement waitForElementToBeClickable(WebDriver driver, By by, int timeoutInSeconds) {
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(StaleElementReferenceException.class)
//                .ignoring(ElementNotInteractableException.class)
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(TimeoutException.class);
//
//
//        return wait.until(ExpectedConditions.elementToBeClickable(by));
//    }

    //custom function for explicit wait time for visible
    public static WebElement waitForElementToBeVisible(WebDriver driver, By by, int timeoutInSeconds) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofSeconds(1))

                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(TimeoutException.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

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

    public static void scrollToElement(WebDriver driver, By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center', behavior: 'smooth'});", element);
    }


    @Test

    public void SharebusCo() throws InterruptedException {

        WebDriver driver = new driverManager().getDriver();

        //Global implicit wait time for elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        //Driver window maximize
        driver.manage().window().maximize();

        //navigation to base url
        driver.get("https://test.sharebus.co/");

        //click login
        //Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn.fw-normal.px-3.py-1.rounded-pill.sb-btn-lg.sb-btn-secondary")).click();

        //enter username
        driver.findElement(By.cssSelector("input#email")).sendKeys("brainstation23@yopmail.com");

        //enter password
        driver.findElement(By.cssSelector("input#password")).sendKeys("Pass@1234");

        //Signing click
        driver.findElement(By.cssSelector(".btn.fw-bold.rounded-pill.sb-btn-lg.sb-btn-primary.w-100")).click();

        //dropdown click
        driver.findElement(By.cssSelector(".p-component.p-dropdown.p-inputwrapper.p-inputwrapper-filled.w-50 > div[role='button']")).click();

        //Select Sharelead
        driver.findElement(By.cssSelector("ul[role='listbox'] > li:nth-of-type(2)")).click();

        //Continue Click
        driver.findElement(By.cssSelector(".align-items-center.align-self-center.btn.btn-primary.btn-success.d-flex.fw-bolder.justify-content-between.mt-3.my-3.px-4.rounded-pill.text-white")).click();

        //Set up a share bus click
        //Thread.sleep(2000);
        waitForElementToBeClickable(driver, By.cssSelector("[class='btn btn-primary sb-btn-primary sb-btn-lg px-4 py-1 my-2 rounded-pill border-0 fw-400']"), 20).click();

        //enter From
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input#startPoint")).sendKeys("Oslo, Norway" + Keys.ENTER);
        scrollToElement(driver,By.cssSelector("input#startPoint"));
        sendKeys(driver,By.cssSelector("input#startPoint"), 10, "Oslo, Norway");
        waitForElementToBeClickable(driver, By.cssSelector("div:nth-of-type(2) > span:nth-of-type(3)"), 20).click();

        //enter To
        //Thread.sleep(2000);
        scrollToElement(driver,By.cssSelector("input#destination"));
        sendKeys(driver,By.cssSelector("input#destination"), 10, "Oslo, Norway");
        waitForElementToBeClickable(driver, By.cssSelector("div:nth-of-type(4) > span:nth-of-type(2)"), 10).click();

        //select departure
        //Thread.sleep(2000);
        waitForElementToBeClickable(driver, By.cssSelector("[placeholder='Departure Date']"), 10).click();
        waitForElementToBeClickable(driver, By.cssSelector("tbody tr:nth-of-type(5) td:nth-of-type(6) > span"), 10).click();
        sendKeys(driver,By.cssSelector("[class='row my-3'] [class='col-sm-12 col-md-6']:nth-of-type(1) [placeholder='Time']"), 10, "06:33");


        //select return
        //Thread.sleep(9000);
        scrollToElement(driver,By.cssSelector(".my-4.row .p-component.p-inputtext.pv-datepicker-input"));
        waitForElementToBeClickable(driver, By.cssSelector(".my-4.row .p-component.p-inputtext.pv-datepicker-input"), 10).click();
        waitForElementToBeClickable(driver, By.cssSelector("tr:nth-of-type(5) > td:nth-of-type(7) > span"), 10).click();
        sendKeys(driver,By.cssSelector("[class='row my-4'] [class='col-sm-12 col-md-6']:nth-of-type(1) [placeholder='Time']"),10, "06:33");

        //Click continue
        scrollToElement(driver,By.cssSelector(".align-items-center.border-0.btn.d-flex.fw-bold.justify-content-center.rounded-pill.sb-btn-lg.sb-btn-primary"));
        waitForElementToBeClickable(driver, By.cssSelector(".align-items-center.border-0.btn.d-flex.fw-bold.justify-content-center.rounded-pill.sb-btn-lg.sb-btn-primary"), 10).click();

        //Click Yes Set up a Sharebus
        //Thread.sleep(7000);
        waitForElementToBeClickable(driver, By.cssSelector(".border-light"), 10).click();
        driver.findElement(By.cssSelector(".fi-chevron-down")).click();
        driver.findElement(By.cssSelector(".results > ul > li:nth-of-type(4)")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();

        //Click create share bus
        //Thread.sleep(4000);
        waitForElementToBeClickable(driver, By.cssSelector(".btn.btn-discount-size.gray-white-bg.rounded-end.ship-gray"), 10).click();
        //Thread.sleep(4000);
        scrollToElement(driver,By.cssSelector("[class='discount-ticket-wrapper p-4 light-gray-bg mb-2 mt-2'] .rounded-end"));
        waitForElementToBeClickable(driver, By.cssSelector("[class='discount-ticket-wrapper p-4 light-gray-bg mb-2 mt-2'] .rounded-end"), 10).click();
        //Thread.sleep(4000);
        waitForElementToBeClickable(driver, By.cssSelector("[type='submit']"), 10).click();

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
