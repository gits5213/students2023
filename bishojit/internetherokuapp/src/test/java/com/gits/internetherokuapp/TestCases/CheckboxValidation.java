package com.gits.internetherokuapp.TestCases;

import com.gits.internetherokuapp.TestPages.CheckBoxes;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxValidation extends BaseTest {
    @Test
    public void checkboxes (){
        LandingPage lp = new LandingPage(driver);
        CheckBoxes cbp = new CheckBoxes(driver);

        //Home Url Validation
        lp.checkBoxes.click();
        sleepTime(1000);

        //Header Validation
        if (cbp.getCheckboxHeader().isDisplayed()){
            String checkBoxText = cbp.getCheckboxHeader().getText();
            Assert.assertTrue(true,checkBoxText);

        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //checkbox 2 selection and checkbox text validation
        if (cbp.getCheckbox2().isDisplayed()){
            System.out.println(Data.POSITIVE_MASSAGE+Data.CHECK_BOX2_SELECTED);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //checkbox 1 selected and checkbox text validation
        if (cbp.getCheckBox1().isDisplayed()){
            System.out.println(Data.POSITIVE_MASSAGE+Data.CHECK_BOX1_SELECTED);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
       sleepTime(1000);

        //Url validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link,Data.BASE_URL+Data.CHECK_BOX_LINK);
        System.out.println("link is valid");
        sleepTime(1000);

        cbp.getCheckbox2().click();
        sleepTime(1000);
        cbp.getCheckBox1().click();
        sleepTime(1000);


        driver.navigate().back();
        sleepTime(1000);
    }
}
