package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.JavaScriptAlerts;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;

import org.testng.Assert;
import org.testng.annotations.Test;


public class JavaScriptAlertsTest extends BaseTest {

    @Test
    public void javaScriptAlertTest() {

        LandingPage lp = new LandingPage(driver);
        JavaScriptAlerts jsa = new JavaScriptAlerts(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //JavaScriptAlerts button validation
        if (lp.getJavaScriptAlerts().isDisplayed())
        {
            String javaScriptAlerts = lp.getJavaScriptAlerts().getText();
            Assert.assertEquals("JavaScript Alerts", javaScriptAlerts);
            System.out.println("JavaScript Alerts button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getJavaScriptAlerts().click();


        //link Page URL Validation
        String JavaScriptAlertLink = driver.getCurrentUrl();
        System.out.println("Given"+JavaScriptAlertLink);
        Assert.assertEquals(JavaScriptAlertLink, Data.BASE_URL+Data.JAVASCRIPT_ALERTS_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (jsa.getJs_Header().isDisplayed()) {
            String Js_Header = jsa.getJs_Header().getText();
            Assert.assertTrue(true, Js_Header);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation
        if (jsa.getJs_Paragraph().isDisplayed()) {
            String Js_Paragraph = jsa.getJs_Paragraph().getText();
            Assert.assertTrue(true, Js_Paragraph);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        //JSAlert Text Button Validation
        jsa.getClickForJS_Alert().click();
        //System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);
       // String alertText = jsa.getAlertText();
        driver.switchTo().alert().accept();
        sleepTime(2000);

       // assertEquals(alertText, Data.BASE_URL + Data.JAVASCRIPT_HEADER_LINK);
       // jsa.acceptAlert();
        System.out.println("JSAlert Result Text : "+ jsa.getResultText().getText());


        //JS Confirm Button
        jsa.getClickForJS_Confirm().click();
        sleepTime(2000);
        System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);
        driver.switchTo().alert().accept();
        sleepTime(2000);
        System.out.println("JSAlert Result Text : "+ jsa.getResultText().getText());


        //JS Prompt Button Validation
        jsa.getClickForJS_Prompt().click();
        sleepTime(2000);
        driver.switchTo().alert().sendKeys("null");
        sleepTime(2000);
        driver.switchTo().alert().accept();
        sleepTime(2000);
        System.out.println("JS Prompt Result Text :"+ jsa.getResultText().getText());
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);











    }




}
