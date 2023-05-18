package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.pages.Basic_Auth;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuth extends BaseClass {
    @Test
    public  void  basicAuth () throws InterruptedException {
        Internet ti = new Internet(driver);
        Basic_Auth ba =new Basic_Auth(driver);

        //TestCase-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        Thread.sleep(1000);

        //TestCase-2 BasicAuth Text validation in Base page
        if (ti.getBasicAuth().isDisplayed()) {
            String basicAuthText = ti.basicAuth.getText();
            Assert.assertTrue(true, basicAuthText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        ti.getBasicAuth().click();
        sleepTest(500);
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        sleepTest(500);




        //TestCase-3 Header Validation
        if (ba.getBasicAuthHeader1().isDisplayed()){
            String basicAuthHeaderText = ba.getBasicAuthHeader1().getText();
            Assert.assertTrue(true,basicAuthHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TestCase-4 Paragraph Validation

        if (ba.getBasicAuthParagraph1().isDisplayed()){
            String basicAuthParagraphText = ba.getBasicAuthParagraph1().getText();
            Assert.assertTrue(true,basicAuthParagraphText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        Thread.sleep(1000);
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(1000);

        System.out.println("Test Run Successfully");
    }
}
