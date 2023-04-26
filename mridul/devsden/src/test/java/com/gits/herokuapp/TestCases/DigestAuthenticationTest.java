package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.DigestAuthentication;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuthenticationTest extends BaseTest {

    @Test
    public void digestAuthenticationTest(){
        LandingPage lp = new LandingPage(driver);
        DigestAuthentication dat = new DigestAuthentication(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //digest Auth button validation
        if (lp.getDigestAuthentication().isDisplayed())
        {
            String digestAuthenticaton = lp.getDigestAuthentication().getText();
            Assert.assertTrue(true, digestAuthenticaton);
            System.out.println("DigestAuth button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDigestAuthentication().click();

        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        //URL = "https://username:password@www.example.com";
        sleepTime(1000);



        //Header Validation
        if (dat.getDigestAuthHeader1().isDisplayed()) {
            String DigestAuthHeader1 = dat.getDigestAuthHeader1().getText();
            Assert.assertTrue(true, DigestAuthHeader1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation
        if (dat.getDigestAuthParagraph1().isDisplayed()) {
            String DigestAuthParagraph1 = dat.getDigestAuthParagraph1().getText();
            Assert.assertTrue(true, DigestAuthParagraph1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        driver.navigate().back();
        sleepTime(1000);






    }

}
