package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.FileUpload;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUploadTest() throws AWTException {
        LandingPage lp = new LandingPage(driver);
        FileUpload fu = new FileUpload(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //FileUpload button validation
        if (lp.getFileUpload().isDisplayed())
        {
            String fileUpload = lp.getFileUpload().getText();
            Assert.assertEquals("File Upload", fileUpload);
            System.out.println("FileUpload button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getFileUpload().click();

        //link Page URL Validation
        String fileUploadLink = driver.getCurrentUrl();
        System.out.println("Given"+fileUploadLink);
        Assert.assertEquals(fileUploadLink, Data.BASE_URL+Data.FILE_UPLOAD_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (fu.getFileUploaderHeader().isDisplayed()) {
            String FileUploaderHeader = fu.getFileUploaderHeader().getText();
            Assert.assertTrue(true, FileUploaderHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // upload paragraph
        if (fu.getFileUploadParagraph().isDisplayed()) {
            String FileUploaderParagraph = fu.getFileUploadParagraph().getText();
            Assert.assertTrue(true, FileUploaderParagraph);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Upload Choose File Button path validation
        fu.getChooseFileButton().sendKeys(Data.FILE_UPLOAD_PATH);
        fu.getUploadButton().click();
        sleepTime(1000);


        Robot robot = new Robot();
        StringSelection fileUploadpath =new StringSelection(Data.FILE_UPLOAD_PATH);

        //Now Press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTime(2000);

        //Now Press V
        robot.keyPress(KeyEvent.VK_V);
        sleepTime(2000);

        //Now Release V
        robot.keyRelease(KeyEvent.VK_V);
        sleepTime(2000);

        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTime(2000);

        //Now Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        sleepTime(2000);

        //Navigate Back to url
        driver.navigate().back();
        sleepTime(3000);








    }
}
