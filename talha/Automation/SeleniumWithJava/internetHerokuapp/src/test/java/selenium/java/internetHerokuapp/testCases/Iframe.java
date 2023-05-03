package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.FramesPages;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class Iframe extends BaseClass {
    @Test
    public void iframe(){

        TheInternet ti =new TheInternet(driver);
        FramesPages fp =new FramesPages(driver);

        sleepTest(2000);
        ti.getFrames().click();

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FRAMES_LINK);
        System.out.println("Link is valid");


        sleepTest(2000);
        fp.getIframe().click();
        sleepTest(2000);

        //Switch to frame
        /*   you can enter in  frame by 3 way :
                1.Index = 0,2,1
                2.ID or Name = ""
                3.Web elements   */

        driver.switchTo().frame("mce_0_ifr");
       // WebElement txt= driver.findElement(By.xpath("//body[@id='tinymce']"));
        WebElement txt= driver.findElement(By.xpath("/html//body[@id='tinymce']"));
        txt.clear();
        sleepTest(3000);
        txt.sendKeys(Data.INPUT_TEXT);
        sleepTest(5000);

        driver.switchTo().defaultContent();
        driver.navigate().to(Data.BASE_URL);
        sleepTest(2000);






    }

}
