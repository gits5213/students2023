package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.DynamicLoading;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest {
    @Test
    public void dynamicLoadingTest() {
        LandingPage lp = new LandingPage(driver);
        DynamicLoading dl = new DynamicLoading(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //DynamicLoading button validation
        if (lp.getDynamicLoading().isDisplayed())
        {
            String dynamicLoading = lp.getDynamicLoading().getText();
            Assert.assertEquals("Dynamic Loading", dynamicLoading);
            System.out.println("DynamicLoading button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDynamicLoading().click();

        //link Page URL Validation
        String dynamicLoadingLink = driver.getCurrentUrl();
        System.out.println("Given"+dynamicLoadingLink);
        Assert.assertEquals(dynamicLoadingLink, Data.BASE_URL+Data.DYNAMIC_LOADING_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (dl.getDynamicallyLoadedPageElements().isDisplayed()) {
            String dynamicallyLoadedPageElements = dl.getDynamicallyLoadedPageElements().getText();
            Assert.assertTrue(true, dynamicallyLoadedPageElements);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation 1
        if (dl.getDynamicallyParagraph1().isDisplayed()) {
            String dynamicallyParagraph1 = dl.getDynamicallyParagraph1().getText();
            Assert.assertTrue(true, dynamicallyParagraph1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation 2
        if (dl.getDynamicallyParagraph2().isDisplayed()) {
            String dynamicallyParagraph2 = dl.getDynamicallyParagraph2().getText();
            Assert.assertTrue(true, dynamicallyParagraph2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        dl.getExample1Button().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);
        dl.getExample2Button().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);






    }
}
