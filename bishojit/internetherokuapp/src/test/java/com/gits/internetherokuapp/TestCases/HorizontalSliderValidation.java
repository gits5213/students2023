package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.HorizontalSlider;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderValidation extends BaseTest {
    @Test
    public void horizontalSlider(){

        LandingPage lp = new LandingPage(driver);
        HorizontalSlider hsp = new HorizontalSlider(driver);

        lp.getHorizontalSlider().click();
        sleepTime(2000);

        //Corresponding Page Url Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.HORIZONTAL_SLIDER_LINK);
        System.out.println("Link Is Valid");
        sleepTime(2000);

        //Header Validation
        if ( hsp.getHorizontalSliderHeader().isDisplayed()){
            String header1 = hsp.getHorizontalSliderHeader().getText();
            Assert.assertEquals(header1,Data.HORIZONTAL_SLIDER_HEADER1);
            System.out.println("header text is Valid");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        WebElement slider = driver.findElement(By.xpath("/html//div[@id='content']//input[@value='0']"));

        for (int i = 0; i <= 11; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

//        //Using Action Class TO drag the slider
//        //Horizontal slider Validation
//        Actions move = new Actions(driver);
//        Actions action = (Actions) move.dragAndDropBy(slider,20,0).build();
//        action.perform();
//        sleepTime(2000);
//
//        // Slider Value Validation
//        WebElement value =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
//        System.out.println("Dragged Value"+value);
//        String val ="2.5";
//        Assert.assertEquals(value,val );

    }
}
