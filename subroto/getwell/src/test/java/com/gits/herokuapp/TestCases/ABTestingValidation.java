package com.gits.herokuapp.TestCases;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.AbTesting;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTestingValidation extends BaseClass {

    @Test
    public void ABTestingValidation() {

        LandingPage lp = new LandingPage(driver);
        AbTesting at = new AbTesting(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        //click on AB Testing Button
        if (lp.getABTesting().isDisplayed()) {
            String abTesting = lp.getABTesting().getText();
            Assert.assertEquals(Data.AB_TESTING, abTesting);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getABTesting().click();
        sleepTime(1000);

        // Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given " + link);
        Assert.assertEquals(link, Data.BASE_URL + Data.AB_TEST_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);

        //Header Validation
        if (at.getabTestingVariation1().isDisplayed()) {
            String header1 = at.getabTestingVariation1().getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION, header1);
        } else if (at.getAbTestControl().isDisplayed()) {
            String header2 = at.abTestControl.getText();
            Assert.assertEquals(Data.AB_TEST_CONTROL, header2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Paragraph Validation
        if (at.getAbTestingParagraph().isDisplayed()){
            String actualParagraph = at.getAbTestingParagraph().getText();
            Assert.assertEquals(actualParagraph ,Data.AB_TEST_PARAGRAPH);
        } else {
            System.out.println("NO PARAGRAPH IS VISIBLE");
        }


        driver.navigate().back();
        sleepTime(5000);


        // another way to validate ab testing
//        //validate Header1 massage
//        at.getabTestingVariation1().isDisplayed();
//        String actualHeader1Massage = at.getabTestingVariation1().getText();
//        String expectedHeader1Massage = "A/B Test Variation 1";
//        Assert.assertEquals(actualHeader1Massage , expectedHeader1Massage);
//
//        //validate paragraph massage
//        at.getAbTestingParagraph().isDisplayed();
//        String actualParagraphMassage = at.getAbTestingParagraph().getText();
//        String expectedParagraphMassage = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
//        Assert.assertEquals(actualParagraphMassage , expectedParagraphMassage);


    }
}


