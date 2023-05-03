package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.EntryAddPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEntryAdd extends BaseTest{



    @Story("gits-5227-TestDynamic-Loading")
    @Description("Test-TestDynamic-Loading")
    @Test
    public void entryAdd(){

        EntryAddPage eap = new EntryAddPage(driver);

        clickOnElement(landingPage.getEntryAdd());
        waitForElementToBeVisible(eap.getAddWindow());
        Assert.assertTrue(eap.getAddWindow().isDisplayed(),"Add is displayed");
        clickOnElement(eap.getAddCloseBtn());
        waitForElementToDisappear(eap.getAddWindow());
        Assert.assertFalse(eap.getAddWindow().isDisplayed(),"Add is not displayed");
    }
}
