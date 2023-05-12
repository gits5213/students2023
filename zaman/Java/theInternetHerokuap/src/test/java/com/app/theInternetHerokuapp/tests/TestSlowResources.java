package com.app.theInternetHerokuapp.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestSlowResources extends BaseTest {


    @Story("gits-5248-SlowResources")
    @Description("Shadow-Dom")
    @Test()
    public void slowResources() {

        clickOnElement(landingPage.getSlowResources());
        waitForAllRequestsToComplete(driver, 40);
        sleepTest(2000);
    }

    public void waitForAllRequestsToComplete(WebDriver driver, int witTime) {
        new WebDriverWait(driver, Duration.ofSeconds(witTime)).until(ExpectedConditions.jsReturnsValue("return (window.jQuery != null) && (jQuery.active === 0);"));
    }

}
