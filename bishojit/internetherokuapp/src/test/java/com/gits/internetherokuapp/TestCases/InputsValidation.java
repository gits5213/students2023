package com.gits.internetherokuapp.TestCases;

import com.gits.internetherokuapp.TestPages.Inputs;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import com.gits.internetherokuapp.configuration.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsValidation extends BaseTest {
    @Test
    public void input(){

        LandingPage lp = new LandingPage(driver);
        Inputs ip = new Inputs(driver);

        lp.getInputs().click();
        sleepTime(2000);

        //Corresponding Page Url Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.INPUTS_LINK);
        System.out.println("Link is Valid");

        //Entering Values
        ip.getInputField().sendKeys("123456789321654987");
        sleepTime(1000);

        ip.getInputField().clear();
        sleepTime(1000);

        driver.navigate().back();
        sleepTime(2000);
    }
}
