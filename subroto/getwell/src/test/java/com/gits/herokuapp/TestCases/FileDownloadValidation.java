package com.gits.herokuapp.TestCases;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FileDownloadPage;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileDownloadValidation extends BaseClass {
    @Test
    public void FileDownloadValidation() throws AWTException {

        LandingPage lp = new LandingPage(driver);
        FileDownloadPage fdp = new FileDownloadPage(driver);

        //Click On FileDownLoad URL
        lp.getFileDownLoad().click();

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FILE_DOWNLOAD_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        //File Download Header Validation
        if (fdp.getFileDownloadHeaderText().isDisplayed()){
            String fileDownLoadHeader = fdp.getFileDownloadHeaderText().getText();
            Assert.assertTrue(true, fileDownLoadHeader);
            System.out.println("Header Text is Valid");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


//         WebElement fileDownload = driver.findElement(By.linkText("sample.txt"));
//        fileDownload.click();
//        fdp.getTextFileDownload().click();
//        sleepTime(3000);
//          fdp.getXlsxFileDownload().click();
//          sleepTime(1000);
          fdp.getPngFileDownload().click();
          sleepTime(1000);

        //File Download Validation
        //Using String Selection Class to store the path of the file
        Robot robot=new Robot();

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
                String fileName = fdp.getTextFileDownload().getText();
                //String fileName= fileDownload.getText();
                System.out.println(fileName + " File Is Downloaded");
                break;
            }

        }

    }

}
