package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FramesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestFrames extends BaseTest{



    @Story("gits-5233-Frames")
    @Description("Nested-Frames")
    @Test
    public void frames(){

        FramesPage fp =new FramesPage(driver);

        clickOnElement(landingPage.getFrames());
        clickOnElement(fp.getNestedFrames());

        switchToFrame(fp.getMotherFrame1());

        switchToFrame(fp.getLeftFrame());
        highlightWebElement(fp.getLeftFrameBodyText());
        System.out.println("switching to " + fp.getLeftFrameBodyText().getText() + " frame");
        switchToParentFrame();
        switchToFrame(fp.getMiddleFrame());
        highlightWebElement(fp.getMiddleFrameBodyText());
        System.out.println("switching to " + fp.getMiddleFrameBodyText().getText() + " frame");
        switchToParentFrame();
        switchToFrame(fp.getRightFrame());
        highlightWebElement(fp.getRightFrameBodyText());
        System.out.println("switching to " + fp.getRightFrameBodyText().getText() + " frame");

        switchTODefaultContent();

        switchToFrame(fp.getMotherFrame2());

        highlightWebElement(fp.getBottomFrameText());
        System.out.println("switching to " + fp.getBottomFrameText().getText() + " frame");
        sleepTest(3000);
    }
}
