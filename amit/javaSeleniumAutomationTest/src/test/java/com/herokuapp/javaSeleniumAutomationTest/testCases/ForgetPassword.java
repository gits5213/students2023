package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Forget_Password;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPassword extends BaseClass {
    @Test
    public void forgetPassword() throws InterruptedException {
        Internet ti = new Internet(driver);
        Forget_Password fp = new Forget_Password(driver);

        ti.getForgotPassword().click();
        Thread.sleep(1000);

        //TestCase -01 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+ Data.FORGOT_PASSWORD_LINK);
        System.out.println("Link is valid");
        Thread.sleep(1000);

        //TestCase -2 Header Validation
        boolean displayed = fp.getForgotPasswordHeader().isDisplayed();
        if (displayed){
            String header = fp.getForgotPasswordHeader().getText();
            Assert.assertEquals(header,Data.FORGOT_PASSWORD_HEADER);
            System.out.println("Header Text is vaild");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //testcase -03 Send DATA ON EMAIL FIELD
        //testcase -04 Forget Password
        fp.getEmailField().sendKeys(Data.FORGOT_PASSWORD_PAGE_EMAIL);
        Thread.sleep(1000);
        fp.getRetrievePasswordButton().click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);
    }
}
