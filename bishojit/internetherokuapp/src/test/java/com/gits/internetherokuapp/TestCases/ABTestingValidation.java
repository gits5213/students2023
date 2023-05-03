package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.ABTesting;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTestingValidation extends BaseTest {
    @Test

    public void aBTestingValidation() {


        LandingPage lp = new LandingPage(driver);
        ABTesting ab=new ABTesting(driver);

        //Landing Page URL validation

        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //validating ABTesting button

        if (lp.getABTesting().isDisplayed())
        {
            String abTesting = lp.getABTesting().getText();
            Assert.assertEquals("A/B Testing", abTesting);
            lp.getABTesting().click();
            System.out.println("ABTesting button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //corresponding page url validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+ link);
        Assert.assertEquals(link,Data.BASE_URL+Data.AB_TEST_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(1000);
    }
}
