package com.gits.internetherokuapp.TestCases;

import com.gits.internetherokuapp.TestPages.DisappearingElements;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElementsValidation extends BaseTest {
    @Test

    public void disappearingElements() {

        LandingPage lp = new LandingPage(driver);
        DisappearingElements de = new DisappearingElements(driver);


        //Home URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given" + baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home Url is Valid");
        sleepTime(2000);

        if (lp.getDisappearingElements().isDisplayed()) {
            String disappearingElementText = lp.getDisappearingElements().getText();
            Assert.assertTrue(true, disappearingElementText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDisappearingElements().click();
        sleepTime(1000);

        //Page Url Validation
        String disappearingElementBaseUrl = driver.getCurrentUrl();
        System.out.println(disappearingElementBaseUrl);
        Assert.assertEquals(disappearingElementBaseUrl, Data.BASE_URL + Data.DISAPPEARING_ELEMENTS);

        //Header Validation
        if (de.getDisappearingElementsHeaderText().isDisplayed()) {
            String disappearingElementHeaderText = de.getDisappearingElementsHeaderText().getText();
            System.out.println(disappearingElementHeaderText);
            Assert.assertTrue(true, disappearingElementHeaderText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Paragraph Validation
        if (de.getDisappearingElementsParagraphText().isDisplayed()) {
            String disappearingElementsParagraphText = de.getDisappearingElementsHeaderText().getText();
            Assert.assertTrue(true, disappearingElementsParagraphText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        de.getHomeTab().click();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);

        de.getAboutTab().click();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);

        de.getContactUsTab().click();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);

        de.getPortfolioTab().click();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);

    }
}
