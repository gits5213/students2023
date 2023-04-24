package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.ForgotPasswordPage;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPassword extends BaseClass {

    @Test
    public void forgotPassword (){

        LandingPage lp = new LandingPage(driver);
        ForgotPasswordPage fpp= new ForgotPasswordPage(driver);

        lp.getForgotPassword().click();
        sleepTime(3000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FORGOT_PASSWORD_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        //TC-2 Header Validation
        if (fpp.getForgotPasswordHeader().isDisplayed()){
            String forgotPasswordHeader = fpp.getForgotPasswordHeader().getText();
            Assert.assertTrue(true, forgotPasswordHeader);
            System.out.println("Header is Valid");
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Send DATA ON EMAIL FIELD
        fpp.getEmailField().sendKeys(Data.FORGOT_PASSWORD_PAGE_EMAIL);
        sleepTime(2000);
        fpp.getPasswordRetrieveButton().click();
        sleepTime(2000);

        driver.navigate().to(Data.BASE_URL);
        sleepTime(3000);

    }
}
