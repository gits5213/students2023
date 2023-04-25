package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.FileDownload;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileDownloadValidation extends BaseTest {
    @Test
    public void fileDownload() throws AWTException {

        LandingPage lp = new LandingPage(driver);
        FileDownload fd = new FileDownload(driver);

        lp.getFileDownload().click();
        sleepTime(1000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DOWNLOAD_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        fd.getPngFileDownload().click();
        sleepTime(2000);

        //TC-2 File Download Validation
        Robot robot=new Robot();
        //Using String Selection Class to store the path of the file

        //Now Press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTime(2000);

        //Now Press J
        robot.keyPress(KeyEvent.VK_J);
        sleepTime(2000);

        //Now Release J
        robot.keyRelease(KeyEvent.VK_J);
        sleepTime(2000);

        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTime(2000);

        File filePath = new File(Data.DOWNLOAD_FILE_PATH);
        File[] totalFiles = filePath.listFiles();
        for (File file:totalFiles) {
            if (file.getName().equals("logo.png")) {
                //String fileName= fileDownload.getText(all okk);
                String fileName = fd.getTextFileDownload().getText();
                System.out.println(fileName + "File Is Downloaded");
                break;
            }
        }
    }
}


