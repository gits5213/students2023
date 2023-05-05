package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.FileDownloadPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileDownload extends BaseClass {
    @Test
    public void fileDownload() throws AWTException {

        TheInternet ti =new TheInternet(driver);
        FileDownloadPage fdp = new FileDownloadPage(driver);

        ti.getFileDownload().click();

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DOWNLOAD_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        /*Downloading, Using linkText Because by using it, its directly download the *sample.txt*
         one From the all other Files. */

        /* WebElement fileDownload = driver.findElement(By.linkText("sample.txt"));
        fileDownload.click(); */
        fdp.getTextFileDownload().click();
        sleepTest(3000);

        //TC-2 File Download Validation
        Robot robot=new Robot();
        //Using String Selection Class to store the path of the file
        //StringSelection filepath =new StringSelection("C:\\Users\\Talha\\Desktop\\new.png");

        //Now Press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        //Now Press J
        robot.keyPress(KeyEvent.VK_J);
        sleepTest(2000);

        //Now Release J
        robot.keyRelease(KeyEvent.VK_J);
        sleepTest(2000);

        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        File filePath = new File(Data.DOWNLOAD_FILE_PATH);
        File[] totalFiles = filePath.listFiles();
        for (File file:totalFiles) {
            if (file.getName().equals("maven project.txt")) {
                //String fileName= fileDownload.getText();
                String fileName = fdp.getTextFileDownload().getText();
                System.out.println(fileName + " File Is Downloaded");
                break;
            }

        }

    }

}
