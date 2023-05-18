package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.pages.AbTesting;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ABTesting extends BaseClass {
    @Test
    public  void  aBTesting() throws InterruptedException {
        Internet ti = new Internet(driver);
        AbTesting at  = new AbTesting(driver);

        //TestCase-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(1000);

        //TestCase-2 Header Validation
        boolean displayed = ti.getAbTesting().isDisplayed();
        if (displayed) {
            String abTesting = ti.getAbTesting().getText();
            Assert.assertEquals(abTesting,Data.AB_TESTING);
            ti.getAbTesting().click();
            Thread.sleep(1000);
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }


        //TestCase-3 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.AB_Test_LINK);
        System.out.println("Link is validate");
        Thread.sleep(1000);

        //TestCase-4 Paragraph Validation
//        if (at.getabTestingVariation1().isDisplayed())
//        {
//            String header1= at.getabTestingVariation1().getText();
//            Assert.assertEquals(Data.AB_TEST_VARIATION1,header1);
//        } else if (at.getAbTestControl().isDisplayed()){
//            String header2= at.abTestControl.getText();
//            Assert.assertEquals(Data.AB_TEST_Control,header2);
//        } else {
//            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
//        }

        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);


    }
}
