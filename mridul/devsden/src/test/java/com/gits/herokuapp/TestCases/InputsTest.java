package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.Inputs;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    @Test
    public void inputsTest() {
        LandingPage lp = new LandingPage(driver);
        Inputs it = new Inputs(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //Inputs button validation
        if (lp.getInputs().isDisplayed())
        {
            String inputs = lp.getInputs().getText();
            Assert.assertEquals("Inputs", inputs);
            System.out.println("Inputs button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getInputs().click();


        //link Page URL Validation
        String InputsLink = driver.getCurrentUrl();
        System.out.println("Given"+InputsLink);
        Assert.assertEquals(InputsLink, Data.BASE_URL+Data.INPUTS_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header 1 Validation
        if (it.getInputsHeader().isDisplayed()) {
            String InputsHeader = it.getInputsHeader().getText();
            Assert.assertTrue(true, InputsHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Paragraph Validation
        if (it.getInputsParagraph().isDisplayed()) {
            String InputsParagraph = it.getInputsParagraph().getText();
            Assert.assertTrue(true, InputsParagraph);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Inputs Values

        it.getInputsNumberFields().sendKeys("0123456789");
        sleepTime(2000);
        it.getInputsNumberFields().clear();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);







    }
}
