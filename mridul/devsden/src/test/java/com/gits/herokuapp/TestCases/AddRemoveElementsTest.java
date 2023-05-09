package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.AddRemoveElements;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.gits.herokuapp.Utilites.Data.BASE_URL;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElementsTest() {

        LandingPage lp = new LandingPage(driver);
        AddRemoveElements ae = new AddRemoveElements(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //add remove elements button validation
        if (lp.getAddRemoveElements().isDisplayed()) {
            String addRemoveElements = lp.getAddRemoveElements().getText();
            Assert.assertEquals("Add/Remove Elements", addRemoveElements);
            lp.getAddRemoveElements().click();
            System.out.println("AddRemoveElements button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);

            lp.getAddRemoveElements().click();



            //link Page URL Validation
            String AddRemoveElementsLink = driver.getCurrentUrl();
            System.out.println("Given " + AddRemoveElementsLink);
            Assert.assertEquals(AddRemoveElementsLink, BASE_URL + Data.ADD_REMOVE_ElEMENTS_LINK);
            System.out.println("Link is validate");
            sleepTime(1000);



            ae.getAddElementButton().click();
            sleepTime(1000);
            driver.navigate().back();
            sleepTime(1000);
            ae.getDeleteButton().click();
            sleepTime(1000);
            driver.navigate().back();
            sleepTime(1000);


        }
    }
}
