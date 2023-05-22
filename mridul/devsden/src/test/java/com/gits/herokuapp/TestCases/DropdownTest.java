package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.Dropdown;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void dropdownTest() {
        LandingPage lp = new LandingPage(driver);
        Dropdown dop = new Dropdown(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //Dropdown button validation
        if (lp.getDropdown().isDisplayed())
        {
            String dropdown = lp.getDropdown().getText();
            Assert.assertEquals("Dropdown", dropdown);
            System.out.println("Dropdown button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDropdown().click();

        //link Page URL Validation
        String DropdownLink = driver.getCurrentUrl();
        System.out.println("Given"+DropdownLink);
        Assert.assertEquals(DropdownLink, Data.BASE_URL+Data.DROPDOWN_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (dop.getDropdownListHeader().isDisplayed()) {
            String DropdownListHeader = dop.getDropdownListHeader().getText();
            Assert.assertTrue(true, DropdownListHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Drop Down Select option1 Validation
        sleepTime(1000);
        if(dop.getSelectOption1().isDisplayed()){
            String dropDownOption1 = dop.getSelectOption1().getText();
            System.out.println("Selected :"+Data.DROPDOWN_OPTION1 );
            Assert.assertEquals(dropDownOption1,Data.DROPDOWN_OPTION1);

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTime(1000);
        dop.getSelectOption1().click();

        // Drop Down Select option2 Validation
        sleepTime(2000);
        if(dop.getSelectOption2().isDisplayed()){
            String dropDownOption2 = dop.getSelectOption2().getText();
            System.out.println("Selected :"+Data.DROPDOWN_OPTION2 );
            Assert.assertEquals(dropDownOption2,Data.DROPDOWN_OPTION2);

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        dop.getSelectOption2().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);





    }
}
