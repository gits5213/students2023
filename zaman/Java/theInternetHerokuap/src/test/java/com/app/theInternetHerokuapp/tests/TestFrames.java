package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FramesPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

        //Text Bold validation
        iframeTextBoldItalicSwitcher(
                fp.getMenuBar(),
                0,
                fp.getTextFormatter(),
                0,
                fp.getNewDocBtn(),
                fp.getTxtBoxFrame(),
                fp.getParagraph(),
                TestData.FRAME_DEMO_TEXT);

        System.out.println(textBoldValidation(fp.getParagraph()));
        Assert.assertTrue(textBoldValidation(fp.getParagraph()));

        switchTODefaultContent();

        //Text italic validation
        iframeTextBoldItalicSwitcher(
                fp.getMenuBar(),
                0,
                fp.getTextFormatter(),
                1,
                fp.getNewDocBtn(),
                fp.getTxtBoxFrame(),
                fp.getParagraph(),
                TestData.FRAME_DEMO_TEXT);

        System.out.println(textItalicValidation(fp.getParagraph()));
        Assert.assertTrue(textItalicValidation(fp.getParagraph()));

        switchTODefaultContent();
    }
}
