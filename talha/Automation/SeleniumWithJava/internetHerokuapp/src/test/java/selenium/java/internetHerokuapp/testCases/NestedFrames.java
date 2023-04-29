package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.FramesPages;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class NestedFrames extends BaseClass {
    @Test
    public void nestedFrames(){

        TheInternet ti = new TheInternet(driver);
        FramesPages fp = new FramesPages(driver);


        sleepTest(2000);
        ti.getFrames().click();
        sleepTest(2000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FRAMES_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        fp.getNestedFrame().click();
        sleepTest(2000);

        //TC-2 Frame Validation

        //Switch to Top frame
         driver.switchTo().frame("frame-top");

        // Switch to Left Frame
        driver.switchTo().frame("frame-left");
        String leftFrameText = driver.findElement(By.xpath("/html/body")).getText();
        System.out.println("You are in "+ leftFrameText+" Frame");
        sleepTest(2000);

        //Switch to top frame then middle frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String middleFrameText = driver.findElement(By.xpath("/html//div[@id='content']")).getText();
        System.out.println("You are in "+ middleFrameText+" Frame");
        sleepTest(2000);

        //Switch To Top Frame then switch to Right Frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        String rightFrameText = driver.findElement(By.xpath("/html/body")).getText();
        System.out.println("You are in "+ rightFrameText+" Frame");
        sleepTest(2000);

        //Switch to Page(Default Content) then bottom frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        String bottomFrameText=driver.findElement(By.xpath("/html/body")).getText();
        System.out.println("You are in "+ bottomFrameText  +" Frame");
        sleepTest(3000);












    }
}
