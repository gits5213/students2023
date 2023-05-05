package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.FileUploadCorrespondingPage;
import selenium.java.internetHerokuapp.pages.FileUploadPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload extends BaseClass {
    @Test
    public void fileUpload () throws AWTException {

        TheInternet ti= new TheInternet(driver);
        FileUploadPage fup = new FileUploadPage(driver);
        FileUploadCorrespondingPage fucp =new FileUploadCorrespondingPage(driver);

        //How "driver.get(Data.FILE_UPLOAD_URL)" redirecting to #File_Upload page ???
        driver.get(Data.FILE_UPLOAD_URL);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.FILE_UPLOAD_URL);
        System.out.println("Link is valid");
        sleepTest(2000);

        // ti.getFileUpload().click();
        //sleepTest(2000);
        //Want to know the locator by this code ???

        //TC-2 Validate file name after the upload
        fup.getChooseFileButton().sendKeys(Data.FILE_UPLOAD_PATH);
        fup.getUploadButton().click();
        sleepTest(3000);

        //TC-3 Header Validation
        if(fucp. getFileUploadCorrespondingPageHeader().isDisplayed()){
            String header =fucp.getFileUploadCorrespondingPageHeader().getText() ;
            Assert.assertEquals(header, Data.FILE_UPLOAD_CORRESPONDING_HEADER);
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(3000);
        driver.navigate().back();

        //TC-4 Drag and Drop Upload
        WebElement inputField = driver.findElement(By.xpath("/html//div[@id='drag-drop-upload']"));
        inputField.click();
        sleepTest(2000);

        Robot robot=new Robot();
        //Using String Selection Class to store the path of the file
        StringSelection filepath =new StringSelection(Data.FILE_UPLOAD_PATH);

        //Copy The stored path from the String selection ,Also Opening the System Clipboard.
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);

        //Now Press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        //Now Press V
        robot.keyPress(KeyEvent.VK_V);
        sleepTest(2000);

        //Now Release V
        robot.keyRelease(KeyEvent.VK_V);
        sleepTest(2000);

        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        //Now Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        sleepTest(2000);
        System.out.println("File Uploaded Successfully");

        //Navigate Back to url
        driver.navigate().to(Data.BASE_URL);
        sleepTest(3000);



    }
}
