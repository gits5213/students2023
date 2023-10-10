package com.gits.herokuapp.TestCases.Frames;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FramePage;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe extends BaseClass {
    @Test
    public void iframe(){

        LandingPage lp = new LandingPage(driver);
        FramePage fp =new FramePage(driver);


        lp.getFrames().click();
        sleepTime(2000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FRAMES_LINK);
        System.out.println("Link is valid");


        fp.getIFrames().click();
        sleepTime(2000);

        //Switch to frame
        /*   you can enter in  frame by 3 way :
                1.Index = 0,2,1
                2.ID or Name = ""
                3.Web elements   */

        driver.switchTo().frame("mce_0_ifr");
       // WebElement txt= driver.findElement(By.xpath("//body[@id='tinymce']"));
        WebElement txt= driver.findElement(By.xpath("/html//body[@id='tinymce']"));
        txt.clear();
        sleepTime(3000);
        txt.sendKeys(Data.INPUTS_TEXT);
        sleepTime(5000);

        driver.switchTo().defaultContent();
        driver.navigate().to(Data.BASE_URL);
        sleepTime(2000);






    }

}
