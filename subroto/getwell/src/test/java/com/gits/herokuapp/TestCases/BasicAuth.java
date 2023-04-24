package com.gits.herokuapp.TestCases;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.Basic_auth;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuth extends BaseClass {
    @Test
    public  void  basicAuth () {
        LandingPage lp = new LandingPage(driver);
        Basic_auth bauth =new Basic_auth(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        sleepTime(2000);

        //BasicAuth Text validation in Base page
        if(lp.getBasicAuthentication().isDisplayed()){
            String basicAuthText= lp.getBasicAuthentication().getText();
            Assert.assertTrue(true,basicAuthText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getBasicAuthentication().click();
        sleepTime(1000);

        //Value Pass On input Field login popup
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //// ... Get the URL
        //driver.get("https://<username>:<password>@www.example.com/index.html")
        sleepTime(1000);

        //Header Validation
        if (bauth.getBasicAuthWebElementHeader1().isDisplayed()){
            String basicAuthHeaderText = bauth.getBasicAuthWebElementHeader1().getText();
            Assert.assertTrue(true,basicAuthHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Paragraph Validation

        if (bauth.getBasicAuthWebElementParagraph().isDisplayed()){
            String basicAuthParagraphText = bauth.getBasicAuthWebElementParagraph().getText();
            Assert.assertTrue(true,basicAuthParagraphText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(2000);
        System.out.println("Test Run Successfully ");
    }
}
