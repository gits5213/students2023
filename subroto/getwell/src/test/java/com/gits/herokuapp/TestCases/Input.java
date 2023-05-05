package com.gits.herokuapp.TestCases;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.InputsPages;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Input extends BaseClass {

    @Test
    public void input(){

        LandingPage lp = new LandingPage(driver);
        InputsPages ip = new InputsPages(driver);

        lp.getInputs().click();
        sleepTime(2000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.INPUTS_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        //Entering values
        ip.getInputField().sendKeys(Data.INPUT_NUMBER);
        sleepTime(2000);
        ip.getInputField().clear();
        sleepTime(2000);

        driver.navigate().to(Data.BASE_URL);
        sleepTime(2000);







    }
}
