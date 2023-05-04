package com.app.theInternetHerokuapp.tests;


import com.app.theInternetHerokuapp.pom.LandingPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BaseTest {

    public WebDriver driver;
    public SoftAssert softAssert;
    public LandingPage landingPage;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
        landingPage = new LandingPage(driver);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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



    ////////////////////Custom Reusable Methods///////////////////////


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

    //==========GO back a page==============
    public void navigateBack() {
        driver.navigate().back();
    }

    //==========Type text in text box==============
    public void typeText(WebElement element, String text){
        element.sendKeys(text);
    }

    //==========Basic click on web element==============
    public void clickOnElement(WebElement element){
        element.click();
    }
    //==========Print text from web element==============
    public void printText(WebElement element){
        System.out.println(element.getText().trim());
    }

    //==========Assert Expected URL==============
    public void assertUrl(String expectedUrl){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, expectedUrl);
    }

    //==========Assert expected text==============
    public void assertText(WebElement element, String text){
        String expectedText = element.getText().trim();
        Assert.assertEquals(expectedText, text);
    }

    //==========Soft assert expected text==============
    public void SoftAssertText(WebElement element, String text){
        String expectedText = element.getText().trim();
        softAssert.assertEquals(expectedText, text);

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
        return element.getText().trim();
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
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //==========wait for element to disappear==============
    public void waitForElementToDisappear(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    //==========wait for element to be clickable==============
    public void waitForElementToBeClickable(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //==========wait for element to be Disabled==============
    public void waitForElementToBeDisabled(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(element)));
    }

    //==========wait for element to be clickable and click + scroll to element==============
    public void waitForElementToBeClickableAndClick(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));
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
    //==========Switch to frame==============
    public void switchToFrame (WebElement element){
        driver.switchTo().frame(element);
    }


    ////////////////////Page Specific Methods///////////////////////


    //==========AddRemoveElementsPage==============
    public void addElement (int numberOfClicks ,WebElement element, List<WebElement> elements){
        for (int i = 0; i < numberOfClicks; i++) {
            clickOnElement(element);
            sleepTest(25);

        }
        System.out.println(numberOfClicks + " Buttons added");
        Assert.assertEquals(numberOfClicks,elements.size());
    }

    public void removeElements (List<WebElement> elements){
        System.out.println(elements.size() + " Buttons deleted");
        for (int i = elements.size(); i>=1; i--) {
            clickOnElement(elements.get(i-1));
            sleepTest(25);
        }
        Assert.assertEquals(elements.size(),0);
        System.out.println(elements.size() + " Buttons left to delete");
    }
    //=============================================


    //==========ABTestingPage==============
    public void abTestingVesrionValidation(WebElement element, String testData1, String testData2 ){

        try{
            assertText(element, testData1);
        }
        catch (AssertionError e){
            System.out.println(testData2 + " Validated");
            e.printStackTrace();
        }
        try{
            assertText(element, testData2);
        }
        catch (AssertionError e){
            System.out.println(testData1 + " Validated");
            e.printStackTrace();
        }
    }
    //=============================================


    //==========Broken image Validation==============
    public void brokenImageValidation(List<WebElement> elements){
        int totalNumberOfBrokenImage = 0;
        for (WebElement brokenImage : elements) {
            String imageURL = brokenImage.getAttribute("src");
            try{
                URL url = new URL(imageURL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(5000);
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode != 200) {
                    System.out.println("Broken image found at" + imageURL);
                    totalNumberOfBrokenImage++;
                }
                connection.disconnect();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Total number of broken images = " + totalNumberOfBrokenImage );
    }
    //=============================================


    //==========Checkbox validation==============
    public void validateCheckBoxes(List<WebElement> elements){
        int checkboxCounter = 0;
        System.out.println("Number of checkBoxes = " + elements.size());
        for (WebElement checkBox : elements) {
            System.out.println((checkboxCounter + 1) + " Checkbox is Selected = " + checkBox.isSelected());
            if (!checkBox.isSelected()){
                checkBox.click();
                checkboxCounter++;
            }
        }
        if (checkboxCounter == 1){
            System.out.println( checkboxCounter + " checkbox clicked");
        }
        else{
            System.out.println( checkboxCounter + " checkboxes clicked");
        }
    }
    //=============================================


    //==========Context menu==============
    public void contextMenuValidation(WebElement element){

        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        sleepTest(2000);
        alert.accept();
        System.out.println("Alert text: " + alertText);

    }
    //=============================================


    //==========Digest Authentication==============
    public void digestAuthenticationValidation(WebElement element, String username, String password, String url){
        String finaleLink = "https://"+username+":"+password+"@"+url;
        System.out.println(finaleLink);
        navigateTo(finaleLink);
        assertText(element,TestData.DIGEST_SUCCESSFUL_MESSAGE);
        printText(element);
    }
    //=============================================


    //==========Disappearing Elements==============
    public void disappearingElementsValidation(int noOfElements, String[] defaultData, List<WebElement> actualDataList){
        for (int i = 0; i < noOfElements; i++) {
            try{
                WebElement element = actualDataList.get(i);
                String actualData = element.getText().trim();
                if(TestData.DISAPPEARING_ELEMENTS[i].equals(actualData)){
                    System.out.println(actualData + " element is present");
                }
            }
            catch (IndexOutOfBoundsException e){
                System.out.println(TestData.DISAPPEARING_ELEMENTS[i] + " element is missing");
            }
        }
    }
    //=============================================


    //==========excelToWebInput==============
    public  void excelToWebInput(WebElement input1, WebElement input2, WebElement logIn, WebElement message, String excelDirectory) throws IOException {

        FileInputStream inputStream = new FileInputStream(excelDirectory);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        List<WebElement> inputFields = new ArrayList<>();
        inputFields.add(input1);
        inputFields.add(input2);

        int lastRowNum = sheet.getLastRowNum();
        for (int i = 1; i <= lastRowNum; i++) {
            Row row = sheet.getRow(i);
//            System.out.println("Number of cells = " + lastRowNum);
            int lastCellIndex = sheet.getRow(0).getLastCellNum();;
//            System.out.println("Number of cells = " + lastCellIndex);
            for (int j = 0; j < lastCellIndex; j++) { //cell index corresponds to the web element's data fields,
                Cell cell = row.getCell(j);
                String cellValue = cell.getStringCellValue();
                inputFields.get(j).sendKeys(cellValue);
                sleepTest(250);
            }
            clickOnElement(logIn);
            sleepTest(500);
            printText(message);
            if (Objects.equals(message.getText(), TestData.EXPECTED_LOGIN_SUCCESSFUL_MESSAGE)){
                driver.navigate().back();
                for(WebElement element : inputFields){
                    element.clear();
                    sleepTest(500);
                }
            }
            inputStream.close();
            workbook.close();
        }

    }
    //=============================================


    //==========File Uploader==============
    public static void uploadFile(String filePath) throws AWTException, InterruptedException {

        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        sleepTest(2000);
    }

    public void uploadFileWithCoordinate(String filePath, WebElement dropArea, int offset) throws AWTException, InterruptedException {

        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        Point location = dropArea.getLocation();
        int x = location.getX();
        int y = location.getY();

        Robot robot = new Robot();

        robot.mouseMove(x+offset , y+offset);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.setAutoDelay(500);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.setAutoDelay(500);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
    }
    //=============================================


    //==========Next==============

    //=============================================


    //==========Next==============

    //=============================================


    //==========Next==============

    //=============================================


    //==========Next==============

    //=============================================








}


