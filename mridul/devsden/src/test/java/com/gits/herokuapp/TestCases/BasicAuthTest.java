package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.BasicAuth;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BasicAuthTest extends BaseTest {

    @Test
    public void basicAuthTest() {
        LandingPage lp = new LandingPage(driver);
        BasicAuth ba = new BasicAuth(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        // BasicAuth Text validation in Base page
        if (lp.getBasicAuth().isDisplayed())
        {
            String basicAuth = lp.getBasicAuth().getText();
            Assert.assertTrue(true, basicAuth);
            System.out.println("BasicAuth is Visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getBasicAuth().click();
        sleepTime(1000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //URL = "https://username:password@www.example.com";
        sleepTime(1000);



        //Header Validation
        if (ba.getBasicAuthHeader1().isDisplayed()) {
            String BasicAuth = ba.getBasicAuthHeader1().getText();
            Assert.assertEquals(Data.BASIC_AUTH_LINK, BasicAuth);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Paragraph Validation

        if (ba.getBasicAuthParagraph1().isDisplayed()) {
            String Questions= ba.getBasicAuthParagraph1().getText();
            Assert.assertEquals(Data.BASIC_AUTH_PARAGRAPH, Questions);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        driver.navigate().back();
        driver.navigate().back();
        sleepTime(1000);


    }

}
