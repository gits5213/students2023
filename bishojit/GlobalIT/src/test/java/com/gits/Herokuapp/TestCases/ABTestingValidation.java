package com.gits.Herokuapp.TestCases;

import com.gits.Herokuapp.Pom.ABTesting;
import com.gits.Herokuapp.Pom.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTestingValidation extends BaseTests {


    @Test
    public void ABTestingValidation (){

        LandingPage lp = new LandingPage(driver);
        ABTesting at = new ABTesting(driver);


        //click on ABTesting link
        lp.ABTesting.click();

        //validate Header1 massage
        at.getAbTestVariationHeader1().isDisplayed();
        String actualHeader1Massage = at.getAbTestVariationHeader1().getText();
        String expectedHeader1Massage = "A/B Test Variation 1";
        Assert.assertEquals(actualHeader1Massage , expectedHeader1Massage);

        //validate paragraph massage
        at.getAbTestVariationParagraph().isDisplayed();
        String actualParagraphMassage = at.getAbTestVariationParagraph().getText();
        String expectedParagraphMassage = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        Assert.assertEquals(actualParagraphMassage , expectedParagraphMassage);

    }


}
