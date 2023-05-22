package com.gits.internetherokuapp.TestCases;

import com.gits.internetherokuapp.TestPages.BasicAuth;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthValidation extends BaseTest {
    @Test
    public void basicAuth() {
        LandingPage lp = new LandingPage(driver);
        BasicAuth ba = new BasicAuth(driver);

        //Home Url Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given" + baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL Is Validate");
        sleepTime(2000);

        //BasicAuth Text Validation in Base Page
        if (lp.getBasicAuth().isDisplayed()) {
            String basicAuthText = lp.basicAuth.getText();
            Assert.assertTrue(true, basicAuthText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        lp.getBasicAuth().click();
        sleepTime(2000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        sleepTime(1000);

        //Header Validation
        if (ba.getBasicAuthHeader().isDisplayed()) {
            String basicAuthHeaderText = ba.getBasicAuthHeader().getText();
            Assert.assertTrue(true, basicAuthHeaderText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Paragraph Validation
        if (ba.getBasicAuthPara().isDisplayed()) {
            String basicAuthParagraphText = ba.getBasicAuthPara().getText();
            Assert.assertTrue(true, basicAuthParagraphText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);
        driver.close();
        sleepTime(2000);
        driver.quit();
        sleepTime(2000);
        System.out.println("Test Run Successfully");
    }
}
