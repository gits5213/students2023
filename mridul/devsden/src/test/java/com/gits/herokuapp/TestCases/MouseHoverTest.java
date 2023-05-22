package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Pages.HoverPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MouseHoverTest extends BaseTest {

    @Test
    public void mouseHoverTest() {

        LandingPage lp = new LandingPage(driver);
        HoverPage hp = new HoverPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        lp.getHover().click();
        sleepTime(2000);

        //link Page URL Validation
        String MouseHoverLink = driver.getCurrentUrl();
        System.out.println("Given"+MouseHoverLink);
        Assert.assertEquals(MouseHoverLink, Data.BASE_URL+Data.MOUSE_HOVER_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);


        //Mouse Hover Validation
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(hp.getImageNumOne()).perform();
        sleepTime(2000);



        Actions actionTwo = new Actions(driver);
        actionTwo.moveToElement(hp.getImageNumTwo()).perform();
        sleepTime(1000);



        Actions actionThree = new Actions(driver);
        actionThree.moveToElement(hp.getImageNumThree()).perform();
        sleepTime(2000);


        driver.navigate().back();
        sleepTime(2000);

    }



        /*
        //Hover Validation

        HoverPage hoverPage = new HoverPage(driver);
        hoverPage.hoverOnImage(hoverPage.getImageNumOne());
        assertEquals(hoverPage.getImageNumOne(), "name: imageNumOne");

        hoverPage.hoverOnImage(hoverPage.getImageNumTwo());
        assertEquals(hoverPage.getImageNumTwo(), "name: imageNumTwo");

        hoverPage.hoverOnImage(hoverPage.getImageNumThree());
        assertEquals(hoverPage.getImageNumThree(), "name: imageNumThree");


        driver.navigate().back();
        sleepTime(2000);

         */




}
