package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FramesPage;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFrames extends BaseTest{



    @Story("gits-5233-Frames")
    @Description("Nested-Frames")
    @Test(priority = 0)
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


    @Story("gits-5233-Frames")
    @Description("IFrames")
    @Test(priority = 1)
    public void iframe(){

        FramesPage fp =new FramesPage(driver);
        clickOnElement(landingPage.getFrames());
        clickOnElement(fp.getIFrame());

        sleepTest(2000);

        clickOnElement(fp.getMenuBar().get(0));
        clickOnElement(fp.getNewDocBtn());
        clickOnElement(fp.getBoldSelector());

        switchToFrame(fp.getTxtBoxFrame());

        typeText(fp.getParagraph(),"dfsgsdfgdsgf");

        boolean isBold = fp.getParagraph().findElement(By.tagName("strong")).getCssValue("font-weight").equals("700");

        Assert.assertTrue(isBold);

        sleepTest(3000);
    }

}
