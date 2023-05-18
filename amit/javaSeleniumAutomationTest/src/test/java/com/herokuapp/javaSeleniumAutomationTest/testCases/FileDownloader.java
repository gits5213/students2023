package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.File_Downloader;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileDownloader extends BaseClass {
    @Test
    public void fileDownload() throws InterruptedException, AWTException {
        Internet ti = new Internet(driver);
        File_Downloader fd = new File_Downloader(driver);


        //Test Case -01 Home URL Validation
        String baselink = driver.getCurrentUrl();
        System.out.println("Given" +baselink);
        Assert.assertEquals(baselink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(1000);


        //Test case -02 Corresponding Page URL Validation
        ti.getFileDownload().click();
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DOWNLOAD_LINK);
        System.out.println("Link is valid");
        Thread.sleep(1000);

        /*Downloading, Using linkText Because by using it, its directly download the *sample.txt*
         one From the all other Files. */
        fd.getCsvFileDownload1().click();
        Thread.sleep(1000);

        //Test case -02 File Download Validation
        Robot robot = new Robot();
        StringSelection filepath =new StringSelection("C:\\Users\\Amit Saha\\Downloads");

        //Test case -03 Now Press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);

        //Test case -04 Download File check
        File filePath = new File(Data.DOWNLOAD_FILE_PATH);
        File[] totalFiles = filePath.listFiles();

        for (File file:totalFiles){
            if (file.getName().equals("tgkwNGXn1r.txt")){
                String fileName = fd.getTextFileDownload1().getText();
                System.out.println(fileName+"File is Downloaded");
            }
        }

    }
}
