package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Dynamic_Controls;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls extends BaseClass {
    @Test
    public void dynamicControls() throws InterruptedException {

        Internet ti = new Internet(driver);
        Dynamic_Controls dc = new Dynamic_Controls(driver);

        //Test Case -01 Home URL Validation
        String baselink = driver.getCurrentUrl();
        System.out.println("Given" +baselink);
        Assert.assertEquals(baselink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(1000);

        //Test Case -02 DynamicControl Text validation
        boolean displayed = ti.getDynamicControls().isDisplayed();
        if(displayed){
            String dynamicControlsText = ti.getDynamicControls().getText();
            Assert.assertTrue(true,dynamicControlsText);
            ti.getDynamicControls().click();
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }

        //Test Case -03 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given" +link);
        Assert.assertEquals(link,Data.BASE_URL + Data.DYNAMIC_Control_LINK);
        System.out.println("link is valid");
        Thread.sleep(1000);


        //Test Case -04 Header Validation
        boolean b = dc.getDynamicControlHeader().isDisplayed();
        if(b){
            String dynamicControlHeaderText = dc.getDynamicControlHeader().getText();
            Assert.assertTrue(true,dynamicControlHeaderText);
            System.out.println("Header is vaild");
        } else if (!(b)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected Condition!");
        }

        //Test Case -05 -Paragraph text Validation
        boolean c = dc.getDynamicControlParagraph().isDisplayed();
        if (c){
            String dynamicControlparagraphText = dc.getDynamicControlParagraph().getText();
            Assert.assertTrue(true,dynamicControlparagraphText);
        } else if (!(c)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }else {
            System.out.println("Unexpected Condition!");
        }
        //Remove/add Validation
        Thread.sleep(1000);
        dc.getCheckBoxButton().click();
        Thread.sleep(1000);
        dc.getRemoveButton().click();
        Thread.sleep(1000);
//        dc.getAddButton().click();

//        Thread.sleep(2000);
//        dc.getCheckBoxButton1().click();
//        Thread.sleep(2000);
//        dc.getRemoveButton().click();

        // Enable/disable Button
//        dc.getEnableInputField().sendKeys("Say hi");
//        Thread.sleep(500);
//        dc.getEnableButton().click();
//        Thread.sleep(2000);

        //Back to Home URL
//        driver.navigate().back();
//        Thread.sleep(2000);
    }
}
