package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Pages.NotificationMessage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessageTest () {

        LandingPage lp = new LandingPage(driver);
        NotificationMessage nm = new NotificationMessage(driver);




        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        lp.getNotificationMessage().click();
        sleepTime(2000);

        //link Page URL Validation
        String NotificationMessageLink = driver.getCurrentUrl();
        System.out.println("Given"+NotificationMessageLink);
        Assert.assertEquals(NotificationMessageLink, Data.BASE_URL+Data.NOTIFICATION_MESSAGE_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);


        nm.getClickHere().click();
        sleepTime(2000);


        //Header Validation
        if (nm.getMessageHeader1().isDisplayed()) {
            String MessageHeader1 = nm.getMessageHeader1().getText();
            Assert.assertTrue(true, MessageHeader1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation
        if (nm.getParagraphText().isDisplayed()) {
            String ParagraphText = nm.getParagraphText().getText();
            Assert.assertTrue(true, ParagraphText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        //flash alert test validation Page URL
        String flashAlert = nm.getFlashAlert().getText();
        System.out.println(flashAlert);
        // Assert.assertEquals(flashAlert1," Action successful");
        sleepTime(2000);

        nm.getClickHere().click();
        sleepTime(2000);


        driver.navigate().back();
        sleepTime(2200);



        /*
        boolean flag = true;
        while(flag==true) {
            driver.findElement(By.linkText("Click here")).click();
            System.out.println(driver.findElement(By.xpath("//div[@id='flash-messages']/div")).getText());
            if(driver.findElement(By.xpath("//div[@id='flash-messages']/div")).getText().contains("successful")){
                flag=false;
            }
        }

        driver.navigate().back();
        sleepTime(2000);

         */












    }



}
