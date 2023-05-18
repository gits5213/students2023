package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Disappearing_Elements;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElements extends BaseClass {
    @Test
    public void disappearingElements() throws InterruptedException {

        Internet ti = new Internet(driver);
        Disappearing_Elements de =new Disappearing_Elements(driver);

        // HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(2000);

        // Disappearing Elements Text validation in Base page
        /*
        boolean displayed = ti.getDisappearingElement().isDisplayed();
        if (displayed) {
            String disappearingElementText = ti.getDisappearingElement().getText();
            Assert.assertTrue(disappearingElementText != null && !disappearingElementText.isEmpty());
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }
        */
        if(ti.getDisappearingElement().isDisplayed()){
            String disappearingElementText= ti.getDisappearingElement().getText();
            Assert.assertTrue(true,disappearingElementText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        ti.getDisappearingElement().click();
        sleepTest(2000);

        //Corresponding Page URL Validation
        boolean b = de.getDisappearingElementsHeaderText().isDisplayed();
        if (b) {
            String disappearingElementHeaderText = de.getDisappearingElementsHeaderText().getText();
            Assert.assertTrue(disappearingElementHeaderText != null && !disappearingElementHeaderText.isEmpty());
        } else if (!(b)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }

        //Paragraph Validation
        Thread.sleep(1000);
        boolean i = de.getDisappearingElementsParagraphText().isDisplayed();
        if (i) {
            String disappearingElementParagraphText = de.getDisappearingElementsParagraphText().getText();
            Assert.assertTrue(disappearingElementParagraphText != null && !disappearingElementParagraphText.isEmpty());
        } else if (!(i)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }

        de.getHomeTab().click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        de.getAboutTab().click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        de.getContactUsTab().click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        de.getPortfolioTab().click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
    }
}
