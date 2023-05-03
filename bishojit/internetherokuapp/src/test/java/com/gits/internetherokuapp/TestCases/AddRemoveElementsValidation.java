package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.AddRemoveElements;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class AddRemoveElementsValidation extends BaseTest {
    @Test
    public void addRemoveElements () {

        LandingPage lp = new LandingPage(driver);
        AddRemoveElements are = new AddRemoveElements(driver);

        //Home URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given" + baseLink);
        assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(2000);

        lp.getAddRemoveElement().click();
         sleepTime(1000);

        //corresponding Page Url Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given" + link);
        assertEquals(link, Data.BASE_URL + Data.ADD_REMOVE_ELEMENT_LINK);
        System.out.println("link is validate");
        sleepTime(1000);

        //Header Validation
        if (are.getAddremoveelementheader().isDisplayed()) {
            String AddRemoveHeader = are.getAddremoveelementheader().getText();
            Assert.assertTrue(true, AddRemoveHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);

        are.getAddremoveelementheader().click();
        sleepTime(2000);

        are.getAddElement().click();
        sleepTime(2000);

        are.getDeleteElement1();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);

    }
}
