package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DynamicControlsPage;
import com.app.theInternetHerokuapp.tests.BaseTest;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDynamicControls extends BaseTest {



    @Story("gits-5225-Test-Dynamic-Controls")
    @Description("Test-Dynamic-Controls")
    @Test
    public void testDynamicContent(){

        DynamicControlsPage dcp = new DynamicControlsPage(driver);

        clickOnElement(landingPage.getDynamicContent());

        //For checkBox
        if(dcp.getCheckBox().isDisplayed()){
            System.out.println("Check Box in visible");
        }
        else {
            System.out.println("Making check Box visible");
            clickOnElement(dcp.getAddRmvCheckBoxBtn());
            waitForElementToBeVisible(dcp.getCheckBox());
            Assert.assertTrue(dcp.getCheckBox().isDisplayed());
        }
        clickOnElement(dcp.getCheckBox());
        clickOnElement(dcp.getAddRmvCheckBoxBtn());
        waitForElementToDisappear(dcp.getCheckBox());
        clickOnElement(dcp.getAddRmvCheckBoxBtn());
        waitForElementToBeVisible(dcp.getCheckBox());
        clickOnElement(dcp.getCheckBox());
        Assert.assertTrue(dcp.getCheckBox().isDisplayed());


        //For TextBox
        if(dcp.getTextBox().isEnabled()){
            System.out.println("Text box in intractable");
        }
        else {
            System.out.println("Making text box intractable");
            clickOnElement(dcp.getEnableDisableTextBoxBtn());
            Assert.assertTrue(true);
        }
        waitForElementToBeClickable(dcp.getTextBox());
        typeText(dcp.getTextBox(), TestData.DYNAMIC_CONTROLS_DEMO_TEXT);
        clickOnElement(dcp.getEnableDisableTextBoxBtn());
        waitForElementToBeDisabled(dcp.getTextBox());
        Assert.assertFalse(dcp.getTextBox().isEnabled());
    }
}
