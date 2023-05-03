package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Pages.NotificationMassagesPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessage extends BaseClass {

    @Test
    public void notificationMessage (){

        LandingPage lp = new LandingPage(driver);
        NotificationMassagesPage nmp =new NotificationMassagesPage(driver);

        lp.getNotificationMessage().click();
        sleepTime(2000);


        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.NOTIFICATION_MASSAGE_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        nmp.getClickHere().click();
        sleepTime(2000);

        //flash alert test validation Page URL
        String flashAlert1 = nmp.getFlashAlert().getText();
        System.out.println(flashAlert1);
       // Assert.assertEquals(flashAlert1," Action successful");
        sleepTime(2500);

        nmp.getClickHere().click();
        sleepTime(2000);

        String flashAlert3 = nmp.getFlashAlert().getText();
        System.out.println(flashAlert3);
        sleepTime(2500);


        driver.navigate().to(Data.BASE_URL);
        sleepTime(2500);




    }

}
