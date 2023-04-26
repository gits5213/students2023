package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.CheckBoxes;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBoxesTest extends BaseTest {

    @Test
    public void checkBoxesTest() {
        LandingPage lp = new LandingPage(driver);
        CheckBoxes cb = new CheckBoxes(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //checkboxes button validation
        if (lp.getCheckboxes().isDisplayed()) {
            String checkBoxes = lp.getCheckboxes().getText();
            Assert.assertTrue(true, checkBoxes);
            System.out.println("Checkboxes button is visible and clickable");
            sleepTime(1000);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getCheckboxes().click();

        //link Page URL Validation
        String CHECKBOX_LINK = driver.getCurrentUrl();
        System.out.println("Given " + CHECKBOX_LINK);
        Assert.assertEquals(CHECKBOX_LINK, Data.BASE_URL + Data.CHECKBOX_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);


        //Header Validation
        if (cb.getCheckBoxesText().isDisplayed()) {
            String Checkboxes = cb.getCheckBoxesText().getText();
            Assert.assertTrue(true, Checkboxes);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Checkbox1 selection and Checkbox text validation
        if (cb.getCheckbox1().isSelected()) {

            System.out.println(Data.POSITIVE_MASSAGE+ Data.CHECKBOX_SELECTION1);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Checkbox 2 selection and Checkbox text validation
        if (cb.getCheckbox2().isSelected()) {
            System.out.println(Data.POSITIVE_MASSAGE+ Data.CHECKBOX_SELECTION2);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        cb.getCheckbox1().click();
        sleepTime(1000);
        cb.getCheckbox2().click();
        sleepTime(1000);

        driver.navigate().back();
        sleepTime(1000);










    }

}



