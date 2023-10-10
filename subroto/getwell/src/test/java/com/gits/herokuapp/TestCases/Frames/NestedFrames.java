package com.gits.herokuapp.TestCases.Frames;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FramePage;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrames extends BaseClass {
    @Test
    public void nestedFrames(){

        LandingPage lp = new LandingPage(driver);
        FramePage fp = new FramePage(driver);


        sleepTime(2000);
        lp.getNestedFrames().click();
        sleepTime(2000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FRAMES_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);


        //Switch to Top frame
         driver.switchTo().frame("frame-top");

        //Switch to Left Frame
        driver.switchTo().frame("frame-left");
        String leftFrameText = driver.findElement(By.xpath("/html/body")).getText();
        System.out.println("You are in "+ leftFrameText+" Frame");
        sleepTime(2000);

        //Switch to top frame then middle frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String middleFrameText = driver.findElement(By.xpath("/html//div[@id='content']")).getText();
        System.out.println("You are in "+ middleFrameText+" Frame");
        sleepTime(2000);

        //Switch To Top Frame then switch to Right Frame
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        String rightFrameText = driver.findElement(By.xpath("/html/body")).getText();
        System.out.println("You are in "+ rightFrameText+" Frame");
        sleepTime(2000);

        //Switch to Page(Default Content) then bottom frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        String bottomFrameText=driver.findElement(By.xpath("/html/body")).getText();
        System.out.println("You are in "+ bottomFrameText  +" Frame");
        sleepTime(3000);


        driver.navigate().to(Data.BASE_URL);
        sleepTime(1000);












    }
}
