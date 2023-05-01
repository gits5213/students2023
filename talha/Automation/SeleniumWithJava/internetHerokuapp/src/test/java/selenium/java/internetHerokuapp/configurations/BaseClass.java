package selenium.java.internetHerokuapp.configurations;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.time.Duration;


public class BaseClass {
    public WebDriver driver;


    // ============================ Excel Data read method =======================

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        String filePath = "src/test/java/selenium/java/internetHerokuapp/utilities/testData.xlsx";
        String sheetName = "Login";
        FileInputStream file = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][colCount];
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                XSSFRow row = sheet.getRow(i);
                data[i - 1][j] = row.getCell(j).toString();
            }
        }
        return data;
    }

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
