package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.AddRemoveElements;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsValidation extends BaseClass {

    @Test
    public  void  addRemoveElements ()  {


        LandingPage lp = new LandingPage(driver);
        AddRemoveElements are =new AddRemoveElements(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(1000);

        //click on Add Remove Element button
        sleepTime(2000);
        if (lp.getAddRemoveElement().isDisplayed())
        {
            String addRemoveElementsText =lp.getAddRemoveElement().getText();
            Assert.assertTrue(true, addRemoveElementsText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getAddRemoveElement().click();


        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.ADD_REMOVE_ELEMENT_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (are.getaddRemoveElementsHeader().isDisplayed())
        {
            String addRmvHeader= are.getaddRemoveElementsHeader().getText();
            /*Assert.assertTrue(true,Data.HEADER);*/
            Assert.assertEquals(addRmvHeader, Data.HEADER);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);
        are.getaddElement().click();
        sleepTime(1000);
        are.getaddElement().click();
        sleepTime(1000);
        are.getdelete1().click();
        sleepTime(1000);
        are.getdelete2().click();
        sleepTime(1000);



        //back to home
        driver.navigate().back();
        sleepTime(2000);



    }
}
