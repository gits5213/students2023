package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.ABTesting;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ABTestingTest extends BaseTest {

    @Test
    public void aBTestingTest(){
        LandingPage lp = new LandingPage(driver);
        ABTesting at = new ABTesting(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);



        //AbTesting button validation
        if (lp.getAbTesting().isDisplayed())
        {
            String abTesting = lp.getAbTesting().getText();
            Assert.assertEquals("A/B Testing", abTesting);
            lp.getAbTesting().click();
            System.out.println("ABTesting button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        //link Page URL Validation
        String AB_TEST_LINK = driver.getCurrentUrl();
        System.out.println("Given "+AB_TEST_LINK);
        Assert.assertEquals(AB_TEST_LINK, Data.BASE_URL+Data.AB_TEST_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        /*
        //Header Validation
        if (at.getAbTestingVariation1().isDisplayed()) {
            String ABTestVariation1= at.getAbTestingVariation1().getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION1, ABTestVariation1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);



        //Ab test control Validation
        if (at.getAbTestControl().isDisplayed()) {
            String AbTestControl= at.getAbTestControl().getText();
            Assert.assertEquals(Data.AB_TEST_Control, AbTestControl);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

         */

        // Ab test Header and control Validation
        if (at.getAbTestVariation1().isDisplayed())
        {
            String AbTestHeader1= at.getAbTestVariation1().getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION1,AbTestHeader1);
        } else if (at.getAbTestControl().isDisplayed()){
            String AbtestControl= at.abTestControl.getText();
            Assert.assertEquals(Data.AB_TEST_Control,AbtestControl);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        // Paragraph Validation
        if (at.getAbTestingParagraph().isDisplayed()) {
            String Questions= at.getAbTestingParagraph().getText();
            Assert.assertEquals(Data.AB_TEST_PARAGRAPH, Questions);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        driver.navigate().back();
        sleepTime(1000);


    }
}
