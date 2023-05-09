package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.internet.herokuapp.Pages.FormAuthentication;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest {

    @Test
    public void formAuthenticationTest() {
        LandingPage lp = new LandingPage(driver);
        FormAuthentication fan = new FormAuthentication(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //FormAuthentication button validation
        if (lp.getFormAuthentication().isDisplayed())
        {
            String formAuthentication = lp.getFormAuthentication().getText();
            Assert.assertEquals("Form Authentication", formAuthentication);
            System.out.println("FormAuthentication button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getFormAuthentication().click();


        //link Page URL Validation
        String FormAuthenticationLink = driver.getCurrentUrl();
        System.out.println("Given"+FormAuthenticationLink);
        Assert.assertEquals(FormAuthenticationLink, Data.BASE_URL+Data.FORM_AUTHENTICATION_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header 1 Validation
        if (fan.getFormAuthLoginPageHeader1().isDisplayed()) {
            String FormAuthLoginPageHeader1 = fan.getFormAuthLoginPageHeader1().getText();
            Assert.assertTrue(true, FormAuthLoginPageHeader1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Sub_Header 2 Validation
        if (fan.getFormAuthSubHeader2().isDisplayed()) {
            String FormAuthSubHeader2 = fan.getFormAuthSubHeader2().getText();
            Assert.assertTrue(true, FormAuthSubHeader2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Input Fields Validation
        fan.getUserNameInputField().sendKeys(Data.FORM_AUTHENTICATION_USERNAME);
        sleepTime(1000);
        fan.getPasswordInputField().sendKeys(Data.FORM_AUTHENTICATION_PASSWORD);
        sleepTime(1000);

        fan.getLoginButton().click();
        sleepTime(1000);

        //Secure Message Validation
        String text = fan.getSecureMessageArea().getText();
        System.out.println(text);
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);











    }
}
