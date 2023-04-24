package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FileUploadPage;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadValidation extends BaseClass {
    @Test
    public void fileUpload () throws AWTException {

        LandingPage lp = new LandingPage(driver);
        FileUploadPage fup = new FileUploadPage(driver);




        //navigate to the file upload page
        lp.getFileUpload().click();
        sleepTime(1000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.FILE_UPLOAD_URL);
        System.out.println("Link is valid");
        sleepTime(2000);


        //Validate file name after the upload
        fup.getChooseFileButton().sendKeys(Data.FILE_UPLOAD_PATH);
        fup.getUploadButton().click();
        sleepTime(3000);

        driver.navigate().back();

        //Drag and Drop Upload
        WebElement inputField = driver.findElement(By.xpath("/html//div[@id='drag-drop-upload']"));
        inputField.click();
        sleepTime(2000);

        Robot robot=new Robot();
        //Using String Selection Class to store the path of the file
        StringSelection filepath =new StringSelection(Data.FILE_UPLOAD_PATH);

        //Copy The stored path from the String selection ,Also Opening the System Clipboard.
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);

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
        System.out.println("File Uploaded Successfully");

        //Navigate Back to url
        driver.navigate().to(Data.BASE_URL);



    }
}
