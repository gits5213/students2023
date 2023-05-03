package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.HorizontalSliderPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class HorizontalSlider extends BaseClass {
    @Test
    public void horizontalSlider(){

        TheInternet ti =new TheInternet(driver);
        HorizontalSliderPage hsp =new HorizontalSliderPage(driver);

        ti.getHorizontalSlider().click();
        sleepTest(2000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.HORIZONTAL_SLIDER_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);


        //TC-2 Header Validation
        if( hsp.getHeader1().isDisplayed()){
            String header = hsp.getHeader1().getText() ;
            Assert.assertEquals(header,Data.HORIZONTAL_SLIDER_HEADER1 );
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        WebElement slider = driver.findElement(By.xpath("/html//div[@id='content']//input[@value='0']"));

        //Using Action Class TO drag the slider
        //TC-3 Horizontal Slider Validation
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(slider, 20, 0).build();
        action.perform();
        sleepTest(3000);

        //TC-4 Slider Value Validation
        String value =driver.findElement(By.xpath("/html//span[@id='range']")).getText();
        System.out.println( "Dragged Value " +value);
        String val ="3.5";
        Assert.assertEquals(value ,val );





    }
}
