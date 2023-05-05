package com.gits.herokuapp.java.tests;

import com.gits.herokuapp.java.utilities.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
//import org.apache.logging.log4j.LogManager;
//  import org.apache.logging.log4j.Logger;
import java.time.Duration;

public class BaseTest {

    //Logger log =    LogManager.getLogger("BaseTest");
    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        navigateTo(TestData.URL);
        sleepTime(500);
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Method is passing");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();

    }

    public static void sleepTime(long sleeptime){
        try{Thread.sleep(sleeptime);
        }catch (Exception e){
        }
    }

    public void highlightWebElement(WebElement element) {
        try{
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].setAttribute('style', 'background:#ffffb3; border:3px solid green;');", element);
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }

    public void navigateTo(String Url) {
        driver.get(Url);
    }

    public void typeText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void verifyAssertUrl(String expectedUrl){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, expectedUrl);
    }

    public void verifyHoveExpectedText(WebElement element, String text){
        String eleText = element.getText().trim();
        Assert.assertEquals(eleText, text);
    }

    public void clearTextBox(WebElement element) {
        highlightWebElement(element);
        element.clear();
    }

    public void selectDropDownByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public String getText(WebElement element) {
        highlightWebElement(element);
        String elementText = element.getText();
        return elementText;
    }

    public void mouseHover(WebElement elementToHover) {
        Actions hover = new Actions(driver);
        hover.moveToElement(elementToHover);
        hover.build();
        hover.perform();
    }
    public void waitForElementVisibility(WebElement webElement, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }











}
