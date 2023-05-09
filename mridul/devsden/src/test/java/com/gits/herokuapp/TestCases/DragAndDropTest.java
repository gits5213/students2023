package com.gits.herokuapp.TestCases;
import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.DragAndDrop;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void dragAndDropTest() {
        LandingPage lp = new LandingPage(driver);
        DragAndDrop dd = new DragAndDrop(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //DragAndDrop button validation
        if (lp.getDragAndDrop().isDisplayed())
        {
            String dragAndDrop = lp.getDragAndDrop().getText();
            Assert.assertEquals("Drag and Drop", dragAndDrop);
            System.out.println("DragAndDrop button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDragAndDrop().click();

        //link Page URL Validation
        String DragAndDropLink = driver.getCurrentUrl();
        System.out.println("Given"+DragAndDropLink);
        Assert.assertEquals(DragAndDropLink, Data.BASE_URL+Data.DRAG_AND_DROP_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (dd.getDragAndDropHeader().isDisplayed()) {
            String DragAndDropHeader = dd.getDragAndDropHeader().getText();
            Assert.assertTrue(true, DragAndDropHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        driver.navigate().back();
        sleepTime(3000);







    }

}
