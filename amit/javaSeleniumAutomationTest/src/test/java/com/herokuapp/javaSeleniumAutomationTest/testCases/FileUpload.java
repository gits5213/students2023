package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.FileUploadCorrespondingPage;
import com.herokuapp.javaSeleniumAutomationTest.pages.File_Upload;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload extends BaseClass {
    @Test
    public void fileUpload() throws InterruptedException, AWTException {
        Internet ti = new Internet(driver);
        File_Upload fu = new File_Upload(driver);
        FileUploadCorrespondingPage fucp = new FileUploadCorrespondingPage(driver);


        //File_Upload page
        driver.get(Data.FILE_UPLOAD_URL);

        //Testcase 01 - Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link,Data.FILE_UPLOAD_URL);
        System.out.println("Link is Vaild");
        Thread.sleep(1000);

        //TestCase-2 Validate file name after the upload
        fu.getChooseFileButton().sendKeys(Data.FILE_UPLOAD_PATH);
        fu.getUploadButton().click();
        Thread.sleep(1000);

        //Testcase -3 Header Validation
        boolean displayed = fucp.getFileUploadCorrespondingPageHeader().isDisplayed();
        if (displayed){
            String header = fucp.getFileUploadCorrespondingPageHeader().getText();
            Assert.assertEquals(header,Data.FILE_UPLOAD_CORRESPONDING_HEADER);
            System.out.println("Header Text is vaild");
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        Thread.sleep(1000);
        driver.navigate().back();


        //TestCase-4 Drag and Drop Upload
        WebElement inputField = driver.findElement(By.xpath("/html//div[@id='drag-drop-upload']"));
        inputField.click();
        Thread.sleep(1000);

        Robot robot = new Robot();
        //String Selection Class to store the path of the file that why using
        StringSelection filepath = new StringSelection(Data.FILE_UPLOAD_PATH);

        //Copy The stored path from the String selection ,Also Opening the System Clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        //Now press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);

        //Now Press V
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);

        //Now Release V
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);


        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);

        //Now Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        System.out.println("File Uploaded Successfully");

        //Navigate Back to url
        driver.navigate().to(Data.BASE_URL);
        Thread.sleep(1000);

    }
}
