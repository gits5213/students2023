package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.DisappearingElements;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElementsTest extends BaseTest {

    @Test
    public void disappearingElementsTest() {

        LandingPage lp = new LandingPage(driver);
        DisappearingElements die = new DisappearingElements(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //DisappearingElements button validation
        if (lp.getDisappearingElements().isDisplayed())
        {
            String disappearingElements = lp.getDisappearingElements().getText();
            Assert.assertEquals("Disappearing Elements", disappearingElements);
            System.out.println("DisappearingElements button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDisappearingElements().click();

        //link Page URL Validation
        String DisappearingElementsLink = driver.getCurrentUrl();
        System.out.println("Given"+DisappearingElementsLink);
        Assert.assertEquals(DisappearingElementsLink, Data.BASE_URL+Data.DISAPPEARING_ELEMENTS_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (die.getDisappearingElementsHeader().isDisplayed()) {
            String DisappearingElementsHeader = die.getDisappearingElementsHeader().getText();
            Assert.assertTrue(true, DisappearingElementsHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation
        if (die.getDisappearingElementsParagraph().isDisplayed()) {
            String DisappearingElementsParagraph = die.getDisappearingElementsParagraph().getText();
            Assert.assertTrue(true, DisappearingElementsParagraph);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        die.getHomeButton().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);
        die.getAboutButton().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(2000);
        die.getContactUsButton().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);
        die.getPortfolioButton().click();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);




    }
}
