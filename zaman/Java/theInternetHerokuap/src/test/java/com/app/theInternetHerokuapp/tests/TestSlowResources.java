package com.app.theInternetHerokuapp.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;


public class TestSlowResources extends BaseTest {


    @Story("gits-5249-SlowResources")
    @Description("Shadow-Dom")
    @Test()
    public void slowResources() {

        clickOnElement(landingPage.getSlowResources());
        waitForAllApiRequestsToComplete(driver, 120);
        sleepTest(2000);
    }
}
