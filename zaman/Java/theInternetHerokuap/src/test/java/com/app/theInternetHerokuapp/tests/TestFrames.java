package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FramesPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFrames extends BaseTest{



    @Story("gits-5233-Frames")
    @Description("Nested-Frames")
    @Test(priority = 1)
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
    }


    @Story("gits-5233-Frames")
    @Description("IFrames")
    @Test(priority = 2)
    public void iframe(){

        FramesPage fp =new FramesPage(driver);

        clickOnElement(landingPage.getFrames());
        clickOnElement(fp.getIFrame());

        clickOnElement(fp.getMenuBar().get(0));
        clickOnElement(fp.getNewDocBtn());
        clickOnElement(fp.getBoldSelector());

        switchToFrame(fp.getTxtBoxFrame());

        typeText(fp.getParagraph(), TestData.FRAME_DEMO_TEXT);

        boolean isBold = fp.getParagraph().findElement(By.tagName(TestData.FRAME_TEXT_TAG_NAME)).getCssValue(TestData.FRAME_BOLD_TEXT_CSS_VALUE).equals(TestData.FRAME_BOLD_TEXT_NUMERIC_VALUE);

        Assert.assertTrue(isBold);

        switchTODefaultContent();
    }

}
