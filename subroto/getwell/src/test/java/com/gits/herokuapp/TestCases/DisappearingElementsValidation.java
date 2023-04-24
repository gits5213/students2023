package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.DisapperingElements;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElementsValidation extends BaseClass {
    @Test
    public void disappearingElementsValidation(){
        LandingPage lp = new LandingPage(driver);
        DisapperingElements de = new DisapperingElements(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(1000);

        //Header Validation and click perform
        if(lp.getDisappearingElement().isDisplayed()){
            String disappearingElementText= lp.getDisappearingElement().getText();
            Assert.assertTrue(true,disappearingElementText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDisappearingElement().click();
        sleepTime(2000);

        //Corresponding Page URL Validation
        String disappearingElementBaseUrl = driver.getCurrentUrl();
        System.out.println(disappearingElementBaseUrl);
        Assert.assertEquals(disappearingElementBaseUrl, Data.BASE_URL+Data.DISAPPEARING_ELEMENTS_LINK);

        //TC-3 headerValidation
        if(de.getDisappearingElementsHeaderText().isDisplayed()){
            String disappearingElementHeaderText= de.getDisappearingElementsHeaderText().getText();
            Assert.assertTrue(true,disappearingElementHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        //Paragraph Validation
        sleepTime(2000);
        if(de.getDisappearingElementsParagraphText().isDisplayed()){
            String disappearingElementParagraphText= de.getDisappearingElementsParagraphText().getText();
            Assert.assertTrue(true,disappearingElementParagraphText);
        }
        else {
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
        driver.navigate().back();
        sleepTime(2000);

    }
}
