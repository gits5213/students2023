package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DynamicLoadingPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestDynamicLoading extends BaseTest{



    @Story("gits-5226-TestDynamic-Loading")
    @Description("TestDynamic-Loading")
    @Test
    public void dynamicLoading(){

        DynamicLoadingPage dl = new DynamicLoadingPage(driver);

        clickOnElement(landingPage.getDynamicLoading());

        //Hidden element
        clickOnElement(dl.getHiddenElement());
        clickOnElement(dl.getHiddenElementStart());
        waitForElementToBeVisible(dl.getHiddenElementText());
        assertText(dl.getHiddenElementText(), TestData.DYNAMIC_LOADING_SUCCESSFUL_TEXT);

        //Rendered element
        navigateBack();
        clickOnElement(dl.getRenderedElement());
        clickOnElement(dl.getRenderedElementStart());
        waitForElementToBeVisible(dl.getRenderedElementText());
        assertText(dl.getRenderedElementText(),TestData.DYNAMIC_LOADING_SUCCESSFUL_TEXT);
    }
}
