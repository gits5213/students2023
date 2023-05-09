package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.ForgotPassword;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void forgotPasswordTest() {
        LandingPage lp = new LandingPage(driver);
        ForgotPassword fp = new ForgotPassword(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //ForgotPassword button validation
        if (lp.getForgotPassword().isSelected())
        {
            String forgotPassword = lp.getForgotPassword().getText();
            Assert.assertEquals("Forgot Password", forgotPassword);
            System.out.println("ForgotPassword button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getForgotPassword().click();


        //link Page URL Validation
        String ForgotPasswordLink = driver.getCurrentUrl();
        System.out.println("Given"+ForgotPasswordLink);
        Assert.assertEquals(ForgotPasswordLink, Data.BASE_URL+Data.FORGOT_PASSWORD_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (fp.getForgotPasswordHeader().isDisplayed()) {
            String ForgotPasswordHeader = fp.getForgotPasswordHeader().getText();
            Assert.assertTrue(true, ForgotPasswordHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Email Input field Validation
        fp.getEmailInputField().sendKeys(Data.FORGOT_PASSWORD_EMAIL);
        sleepTime(1000);

        //Forgot Password
        fp.getRetrievePasswordButton().click();
        sleepTime(1000);

        driver.navigate().back();
        sleepTime(1000);






    }
}
