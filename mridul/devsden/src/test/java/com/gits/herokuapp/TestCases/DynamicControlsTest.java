package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.DynamicControls;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void dynamicControlsTest() {
        LandingPage lp = new LandingPage(driver);
        DynamicControls dic = new DynamicControls(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //Dynamic Controls button validation
        if (lp.getDynamicControls().isDisplayed())
        {
            String dynamicControls = lp.getDynamicControls().getText();
            Assert.assertEquals("Dynamic Controls", dynamicControls);
            System.out.println("DynamicControls button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDynamicControls().click();

        //link Page URL Validation
        String DynamicControlsLink = driver.getCurrentUrl();
        System.out.println("Given"+DynamicControlsLink);
        Assert.assertEquals(DynamicControlsLink, Data.BASE_URL+Data.DYNAMIC_CONTROLS_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (dic.getDynamicControlsHeader().isDisplayed()) {
            String DynamicControlsHeader = dic.getDynamicControlsHeader().getText();
            Assert.assertTrue(true, DynamicControlsHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph Validation
        if (dic.getDynamicControlsParagraph().isDisplayed()) {
            String DynamicControlsParagraph = dic.getDynamicControlsParagraph().getText();
            Assert.assertTrue(true, DynamicControlsParagraph);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        dic.getRemoveAdd().click();
        sleepTime(2000);
        dic.getAddButton().click();
        sleepTime(2000);
        dic.getEnableInputField();
        sleepTime(2000);
        dic.getEnableButton().click();
        sleepTime(2000);
        dic.getEnableButton().click();
        sleepTime(2000);
        driver.navigate().back();
        sleepTime(2000);
        driver.navigate().back();
        sleepTime(2000);

    }

}
