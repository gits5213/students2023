package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.FileDownload;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileDownloadTest extends BaseTest {
    @Test
    public void fileDownloadTest() throws AWTException {
        LandingPage lp = new LandingPage(driver);
        FileDownload fd = new FileDownload(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //File Download button validation
        if (lp.getFileDownload().isDisplayed())
        {
            String fileDownload = lp.getFileDownload().getText();
            Assert.assertEquals("File Download", fileDownload);
            System.out.println("File Download button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getFileDownload().click();

        //link Page URL Validation
        String fileDownloadLink = driver.getCurrentUrl();
        System.out.println("Given"+fileDownloadLink);
        Assert.assertEquals(fileDownloadLink, Data.BASE_URL+Data.FILE_DOWNLOAD_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);

        fd.getPngFileDownload().click();
        sleepTime(2000);

        //File download Header Validation
        if (fd.getFileDownloadHeader().isDisplayed()) {
            String FileDownloadHeader = fd.getFileDownloadHeader().getText();
            Assert.assertTrue(true, FileDownloadHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);


        // File Download Validation
        Robot robot = new Robot();

        // Now Press  Key CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTime(2000);


       // String FILES_DIRECTORY = "C:\Users\ACER\Desktop\Downloads";
        File Folder = new File(Data.FILE_DOWNLOAD_PATH);
        File[] allFiles = new File(Folder.getPath()).listFiles();
        for (File file : allFiles) {
            if (file.getName().equals("message.txt")) {
                String fileName = fd.getTextFileDownload().getText();
                System.out.println(fileName + "Has Been Download");

            }
        }









    }

}
