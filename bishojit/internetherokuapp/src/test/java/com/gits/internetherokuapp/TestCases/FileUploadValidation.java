package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.FileUpload;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadValidation extends BaseTest {
    @Test
    public void fileUploadValidation() throws AWTException {

        LandingPage lp = new LandingPage(driver);
        FileUpload  fu= new  FileUpload(driver);

        //Corresponding Page Url Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link, Data.BASE_URL);
        System.out.println("Link is Valid");
       sleepTime(2000);

        lp.getFileUpload().click();
        sleepTime(2000);

        //Header Validation
        if (fu.getFileUploadHeader().isDisplayed()){
            String header = fu.getFileUploadHeader().getText();
            Assert.assertEquals(header,Data.FILE_UPLOAD_CORRESPONDING_HEADER);
            System.out.println("Header Text Is Valid");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

       sleepTime(2000);

        //validate file name after the upload
        fu.getFileUploadOption().sendKeys(Data.FILE_UPLOAD_PATH);
        fu.getFileUploadButton().click();
        sleepTime(1000);

        driver.navigate().back();

        //Drag And Drop Upload
        WebElement inputField = driver.findElement(By.xpath("/html//div[@id='drag-drop-upload']"));
        inputField.click();
        sleepTime(2000);

        Robot robot = new Robot();
        //Using String Selection Class To Store the Path of the file
        StringSelection filePath = new StringSelection(Data.FILE_UPLOAD_PATH);

        //Copy the stored path from the string selection, Also Opening the System ClipBoard.
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);

        //Now Press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTime(1000);

        //Now press V
        robot.keyPress(KeyEvent.VK_V);
        sleepTime(1000);


        //Now Release V
        robot.keyRelease(KeyEvent.VK_V);
        sleepTime(1000);

        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTime(1000);

        //Now press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        sleepTime(1000);


        System.out.println("File Uploaded Successfully");

        //Navigate Back To Url
        driver.navigate().to(Data.BASE_URL);

    }
}
