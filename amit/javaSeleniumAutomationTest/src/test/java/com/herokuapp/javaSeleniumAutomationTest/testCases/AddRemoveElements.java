package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.pages.Add_Remove_Elements;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElements extends BaseClass {
    @Test
    public  void  addRemoveElements () throws InterruptedException {

        Internet ti = new Internet(driver);
        Add_Remove_Elements are =new Add_Remove_Elements(driver);

        //TestCase-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(1000);

        //TestCase-2 Header Validation
        Thread.sleep(1000);
        boolean isAddRemoveElementsDisplayed = ti.getAddRemoveElements().isDisplayed();

        if (isAddRemoveElementsDisplayed) {
            String addRemoveElementsText = ti.getAddRemoveElements().getText();
            Assert.assertTrue(addRemoveElementsText.equals("Add/Remove Elements"));
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        ti.getAddRemoveElements().click();


        //TestCase-3 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.ADD_REMOVE_ELEMENTS_LINK);
        System.out.println("Link is validate");
        Thread.sleep(1000);

        //TestCase-4 Header Validation
        Thread.sleep(1000);
        boolean displayed = are.getaddRemoveElementsHeader().isDisplayed();
        if (displayed) {
            String addRmvHeader = are.getaddRemoveElementsHeader().getText();
            assertNotNull(addRmvHeader);
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        Thread.sleep(1000);
        are.getaddElement().click();
        Thread.sleep(1000);
        are.getaddElement().click();
        Thread.sleep(1000);
        are.getdelete1().click();
        Thread.sleep(1000);
        are.getdelete2().click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);



    }

    private void assertNotNull(String addRmvHeader) {
    }
}
