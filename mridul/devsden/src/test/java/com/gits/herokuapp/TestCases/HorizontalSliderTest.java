package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.HorizontalSlider;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void horizontalSliderTest() {
        LandingPage lp = new LandingPage(driver);
        HorizontalSlider hs = new HorizontalSlider(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //HorizontalSlider button validation
        if (lp.getHorizontalSlider().isDisplayed())
        {
            String horizontalSlider = lp.getHorizontalSlider().getText();
            Assert.assertEquals("Horizontal Slider", horizontalSlider);
            System.out.println("HorizontalSlider button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getHorizontalSlider().click();


        //link Page URL Validation
        String HorizontalSliderLink = driver.getCurrentUrl();
        System.out.println("Given"+HorizontalSliderLink);
        Assert.assertEquals(HorizontalSliderLink, Data.BASE_URL+Data.HORIZONTAL_SLIDER_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);


        //Header 1 Validation
        if (hs.getHorizontalSliderHeader().isDisplayed()) {
            String HorizontalSliderHeader = hs.getHorizontalSliderHeader().getText();
            Assert.assertTrue(true, HorizontalSliderHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Sub_Header 2 Validation
        if (hs.getHorizontalSliderSubHeader2().isDisplayed()) {
            String HorizontalSliderSubHeader2 = hs.getHorizontalSliderSubHeader2().getText();
            Assert.assertTrue(true, HorizontalSliderSubHeader2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        WebElement slider = driver.findElement(By.cssSelector("#content > div > div > input[type=range]"));

        for (int i = 0; i <= 11; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

         /*

        WebElement slider = driver.findElement(By.cssSelector("#content > div > div > input[type=range]"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 20, 0).build();
        ((Actions) action).perform();

          */




    }
}
