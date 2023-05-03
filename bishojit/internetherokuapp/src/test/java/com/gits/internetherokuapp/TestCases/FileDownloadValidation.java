package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.FileDownload;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class FileDownloadValidation extends BaseTest {
    @Test
    public void fileDownloadValidation() throws AWTException {

        LandingPage lp = new LandingPage(driver);
        FileDownload fd= new FileDownload(driver);

        //Click On FileDownLoad URL
        lp.getFileDownload().click();

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DOWNLOAD_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        //File Download Header Validation
        if (fd.fileDownloadHeaderText.isDisplayed()){
            String fileDownLoadHeader = fd.getFileDownloadHeaderText().getText();
            Assert.assertTrue(true, fileDownLoadHeader);
            System.out.println("Header Text is Valid");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


         WebElement fileDownload = driver.findElement(By.linkText("sample.png"));
         fileDownload.click();
//        fdp.getTextFileDownload().click();
//        sleepTime(3000);
//          fdp.getXlsxFileDownload().click();
//          sleepTime(1000);
//        fd.getTxtFileDownloadFileDownload().click();
//        sleepTime(1000);

        //File Download Validation
        //Using String Selection Class to store the path of the file
//        Robot robot=new Robot();
//
//        //Now Press CTRL
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        sleepTime(2000);
//
//        //Now Press J
//        robot.keyPress(KeyEvent.VK_J);
//        sleepTime(2000);
//
//        //Now Release J
//        robot.keyRelease(KeyEvent.VK_J);
//        sleepTime(2000);
//
//        //Now Release CTRL
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        sleepTime(2000);
//
//        File filePath = new File(Data.DOWNLOAD_FILE_PATH);
//        File[] totalFiles = filePath.listFiles();
//        for (File file:totalFiles) {
//            if (file.getName().equals("person.png")) {
//                String fileName = fd.getTxtFileDownloadFileDownload().getText();
//                //String fileName= fileDownload.getText();
//                System.out.println(fileName + " File Is Downloaded");
//                break;
//            }

        //navigate to home
        driver.navigate().to(Data.BASE_URL);
        sleepTime(1000);

        }

    }



