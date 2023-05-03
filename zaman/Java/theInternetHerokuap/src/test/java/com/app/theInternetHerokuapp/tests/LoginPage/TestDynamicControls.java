package com.app.theInternetHerokuapp.tests.LoginPage;

import com.app.theInternetHerokuapp.pom.DynamicControlsPage;
import com.app.theInternetHerokuapp.tests.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDynamicControls extends BaseTest {



    @Story("gits-Test-Dynamic-Controls")
    @Description("Test-Dynamic-Controls")
    @Test

    public void testDynamicContent(){

        DynamicControlsPage dcp = new DynamicControlsPage(driver);

        clickOnElement(landingPage.getDynamicContent());

        //For checkBox
        if(dcp.getCheckBox().isDisplayed()){
            System.out.println("check Box in visible");
        }
        else {
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
        typeText(dcp.getTextBox(),"sdafsdf");
        clickOnElement(dcp.getEnableDisableTextBoxBtn());
        waitForElementToBeDisabled(dcp.getTextBox());
        Assert.assertFalse(dcp.getTextBox().isEnabled());











    }
}