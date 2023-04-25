package com.gits.internetherokuapp.TestCases;

import com.gits.internetherokuapp.TestPages.ForgotPassword;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class ForgotPasswordValidation extends BaseTest {
    @Test
    public void forgotPassword() {

        LandingPage lp = new LandingPage(driver);
        ForgotPassword fp = new ForgotPassword(driver);

        lp.getForgetPassword().click();
        sleepTime(2000);

        //Corresponding Page Url Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given" + link);
        Assert.assertEquals(link, Data.BASE_URL + Data.FORGOT_PASSWORD_LINK);
        System.out.println("Link is Valid");

        //Header Validation
        if(fp.getForgotPasswordHeader().isDisplayed()){
            String dropDownHeaderText = fp.getForgotPasswordHeader().getText() ;
            Assert.assertTrue(true,dropDownHeaderText);
            System.out.println("Header is Validate");
        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        fp.getForgotPasswordHeader().click();
        sleepTime(2000);


        //Forgot Password


        fp.getEmailField().sendKeys(Data.FORGOT_PASSWORD_PAGE_EMAIL);
        sleepTime(2000);


        fp.getPasswordRetrieveButton().click();
        sleepTime(2000);

        //Alert Text Validation
        String text = fp.getAlertText().getText();
        System.out.println("alert Text");
        sleepTime(2000);
    }
}