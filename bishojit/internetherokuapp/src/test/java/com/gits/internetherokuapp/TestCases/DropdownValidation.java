package com.gits.internetherokuapp.TestCases;

import com.gits.internetherokuapp.TestPages.Dropdown;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownValidation extends BaseTest {
    @Test
    public void dropDown(){

        LandingPage lp = new LandingPage(driver);
        Dropdown dd=new Dropdown(driver);

        //Home Url Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given"+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home Url Is Valid");
        sleepTime(2000);

        //DropDown Text Validation in Base Page
        if (lp.getDropDown().isDisplayed()){
            String dropDownText = lp.getDropDown().getText();
            Assert.assertTrue(true,dropDownText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDropDown().click();

        //Corresponding Page Url Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link,Data.BASE_URL+Data.DROP_DOWN_LINK);
        System.out.println("link is Valid");
        sleepTime(2000);

        //Header Validation
        if (dd.getDropDownHeaderText().isDisplayed()){
            String dropDownHeaderText = dd.getDropDownHeaderText().getText();
            Assert.assertTrue(true,dropDownHeaderText);
            System.out.println("Header is Validate");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        dd.getDropDownListOption().click();
        sleepTime(2000);
        dd.getDropDownListOption1().click();


        //Drop Down Menu1 Text Validation
        sleepTime(1000);
        if (dd.getDropDownListOption1().isDisplayed()){
            String dropDownListOption1Text = dd.getDropDownListOption1().getText();
            System.out.println("Selected :"+Data.DROP_DOWN_OPTION1_TEXT);
            Assert.assertEquals(dropDownListOption1Text, Data.DROP_DOWN_OPTION1_TEXT);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        dd.getDropDownListOption1().click();
         sleepTime(1000);
        dd.getDropDownListOption2().click();

        //Drop Down Menu2 Text Validation
        sleepTime(1000);
        if (dd.getDropDownListOption2().isDisplayed()){
            String dropDownList2Text = dd.getDropDownListOption2().getText();
            System.out.println("Selected :"+Data.DROP_DOWN_OPTION2_TEXT);
            Assert.assertEquals(dropDownList2Text,Data.DROP_DOWN_OPTION2_TEXT);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);
        dd.getDropDownListOption().click();
        sleepTime(1000);
        driver.close();
        sleepTime(2000);
        driver.quit();
        sleepTime(2000);
//        //Creating Array
//        String[] array={Data.DROP_DOWN_OPTION1_TEXT+Data.DROP_DOWN_OPTION2_TEXT};
//        List<String> list = new ArrayList<>(Arrays.asList(array));
//        System.out.println("List of DropDown Element:"+list);
    }
}
