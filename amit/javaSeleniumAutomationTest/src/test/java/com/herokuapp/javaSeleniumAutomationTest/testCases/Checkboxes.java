package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.CheckBoxes;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes extends BaseClass {
    @Test
    public void checkboxes() throws InterruptedException {
        Internet ti = new Internet(driver);
        CheckBoxes cb = new CheckBoxes(driver);

        //TestCase-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(5000);

        //TestCase-2 Header Validation
        boolean displayed = ti.getCheckboxs().isDisplayed();// handle unexpected case
        if (displayed) {
            String checkBoxText = ti.getCheckboxs().getText();
            Assert.assertTrue(true, checkBoxText);
            ti.getCheckboxs().click();
        } else if (!(displayed)) {
            // handle case where checkbox is not displayed
        }
        //TestCase-3 Checkbox 2 selection and Checkbox text validation
        boolean selected = cb.getCheckbox2().isSelected();// handle unexpected case
        if (selected) {
            System.out.println(Data.POSETIVE_MASSAGE + Data.CHECK_BOX2_SELECTED);
        } else if (!(selected)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        Thread.sleep(5000);
        cb.getCheckbox1().click();

        //TestCase-4 Checkbox 1 selection and Checkbox text validation
        boolean b = cb.getCheckbox1().isSelected();// handle unexpected case
        if (b) {
            System.out.println(Data.POSETIVE_MASSAGE + Data.CHECK_BOX1_SELECTED);
        } else if (!(b)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        //TestCase-5 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.CHECK_BOX_LINK);
        System.out.println("Link is valid");
        Thread.sleep(500);

        //Click & UnClick Checkboxes
        Thread.sleep(5000);
        cb.getCheckbox2().click();
        Thread.sleep(5000);
        cb.getCheckbox1().click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
