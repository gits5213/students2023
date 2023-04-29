package selenium.java.internetHerokuapp.configurations;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void beforeClass() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://the-internet.herokuapp.com/");
        sleepTest(2000);
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("Test Ran Properly");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();

    }

    public static void sleepTest(long sleeptime) {
        try {
            Thread.sleep(sleeptime);
        } catch (Exception e) {

        }
    }

    //Normal Type
    // Click
    // Right Click
    // Mouse hover
    // Navigate Back
    // Navigate Forward
    //


    //   =====  Scroll to an element =====
    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }



    // ============ fluent Wait for an element and perform Click  ==============
    public static void fluentWaitForElementAndClick(WebDriver driver, WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        clickableElement.click();
    }



    // ===================== fluent Wait for an element and Type Data  ====================
    public static void fluentWaitForElementAndType(WebDriver driver, WebElement element, String text) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement typeAbleElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        typeAbleElement.sendKeys(text);
    }


}
