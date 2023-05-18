package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Dropdown;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown extends BaseClass {
    @Test
    public void dropDown() throws InterruptedException {
        Internet ti = new Internet(driver);
        Dropdown dd = new Dropdown(driver);


        //Test Case -01 Home Url Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given"+baseLink);
        Assert.assertEquals(baseLink,Data.BASE_URL);
        System.out.println("Home URl is Valid");
        Thread.sleep(1000);

        //Test Case -02 DropDown Text validation in Base page
        boolean displayed = ti.getDropdown().isDisplayed();
        if(displayed){
            String dropDownText = ti.getDropdown().getText();
            Assert.assertTrue(dropDownText != null && !dropDownText.isEmpty());
            ti.getDropdown().click();
        } else if(!(displayed)){
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else{
            System.out.println("Unexpected condition!");
        }

        // TestCase -03 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link,Data.BASE_URL+Data.DROP_DOWN_LINK);
        System.out.println("Link is valid");
        Thread.sleep(1000);

        //TestCase- 04 Header Validation
        boolean b = dd.getDropdownHeader().isDisplayed();
        if(b){
            String dropDownHeadertext = dd.getDropdownHeader().getText();
            Assert.assertTrue(dropDownHeadertext !=null && !dropDownHeadertext.isEmpty());
            Thread.sleep(1000);
        }else if(!(b)){
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }else {
            System.out.println("Unexpected condition!");
        }
        dd.getSelectOption().click();
        Thread.sleep(1000);
        dd.getSelectOption01().click();
        Thread.sleep(1000);

        //TestCase- 05 Dropdown List -Option 01 Validation
        WebElement dropDownList01 = dd.getSelectOption01();
        String dropDownList1Text = null;
        boolean dropDownList01Displayed = dropDownList01.isDisplayed();
        if (dropDownList01Displayed) {
            dropDownList1Text = dropDownList01.getText();
            System.out.println("Selected: " + Data.DROP_DOWN_Option1_Text);
            Assert.assertEquals(dropDownList1Text, Data.DROP_DOWN_Option1_Text);
        } else if (!(dropDownList01Displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }else {
            System.out.println("Unexpected condition!");
        }
        Thread.sleep(2000);
        dd.getSelectOption().click();
        Thread.sleep(2000);
        dd.getSelectOption02().click();
        Thread.sleep(1000);


        //TestCase- 06 Dropdown List -Option 02 Validation
        WebElement dropDownList02 = dd.getSelectOption02();
        if (dropDownList02.isDisplayed()) {
            String dropDownList2Text = dropDownList02.getText();
            System.out.println("Selected: " + Data.DROP_DOWN_Option2_Text);
            Assert.assertEquals(dropDownList2Text, Data.DROP_DOWN_Option2_Text);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        Thread.sleep(2000);
        dd.getSelectOption().click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

    }
}
