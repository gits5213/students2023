package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.utilities.TestData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        navigateTo(TestData.URL);
        sleepTest(500);
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Test is being executed");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();

    }



    ////////////////////Custom methods///////////////////////


    //==========Sleep time==============
    public static void sleepTest(long sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //==========Highlight web element==============
    public void highlightWebElement(WebElement element) {
        try{
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].setAttribute('style', 'background:#ffffb3; border:3px solid green;');", element);
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }

    //==========Navigate to Url==============
    public void navigateTo(String Url) {
        driver.get(Url);
    }

    //==========Type text in text box==============
    public void typeText(WebElement element, String text){
        element.sendKeys(text);
    }

    //==========Basic click on erb element==============
    public void clickOnElement(WebElement element){
        element.click();
    }

    //==========URL hard assertion==============
    public void verifyAssertUrl(String expectedUrl){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, expectedUrl);
    }

    //==========Verify expected text==============
    public void verifyExpectedText(WebElement element, String text){
        String expectedText = element.getText().trim();
        Assert.assertEquals(expectedText, text);
    }

    //==========clear text box==============
    public void clearTextBox(WebElement element) {
        highlightWebElement(element);
        element.clear();
    }

    //==========Select dropdown by visible text==============
    public void selectDropDownByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    //==========Get text of an web element==============
    public String getText(WebElement element) {
        highlightWebElement(element);
        return element.getText();
    }

    //==========Mouse hover on element==============
    public void mouseHover(WebElement elementToHover) {
        Actions hover = new Actions(driver);
        hover.moveToElement(elementToHover);
        hover.build();
        hover.perform();
    }

    //==========wait for element to be visible==============
    public void waitForElementToBeVisible(WebElement element) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

    }

    //==========wait for element to disappear==============
    public void waitForElementToDisappear(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    //==========wait for element to be clickable and click + scroll to element==============
    public void waitForElementToBeClickableAndClick(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))

                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(WebDriverException.class)
                .ignoring(TimeoutException.class);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElementAndClick(element1);

    }

    //==========Scroll to web element==============
    public void scrollToElementAndClick(WebElement element) {
        // Scroll to the element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        sleepTest(500);
        element.click();
    }

    //==========Click on Hidden element==============
    public void clickHiddenElement(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    //==========Click on body==============
    public void clickOnBody(){

        WebElement click = driver.findElement(By.tagName("body"));
    }











}


