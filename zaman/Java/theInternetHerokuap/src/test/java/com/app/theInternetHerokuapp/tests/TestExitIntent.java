package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ExitIntentPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestExitIntent extends BaseTest{



    @Story("gits-5228-Exit-Intent")
    @Description("Exit-Intent")
    @Test
    public void exitIntent() throws AWTException {

        ExitIntentPage ep = new ExitIntentPage(driver);

        Robot robot = new Robot();

        clickOnElement(landingPage.getExitIntent());
        robot.mouseMove(400,50);

//        //Mouse move with delay
//        for (int x = 0; x <= 10; x++) {
//            robot.mouseMove(x * 40, x * 5);
//            robot.delay(100);
//        }

        waitForElementToBeVisible(ep.getExitAdds());
        Assert.assertTrue(ep.getExitAdds().isDisplayed());
        sleepTest(2000);
        clickOnElement(ep.getAdsCloseBtn());
        sleepTest(2000);
    }
}
