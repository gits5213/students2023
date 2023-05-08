package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.HorizontalSliderPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestHorizontalSlider extends BaseTest {



    @Story("gits-5235-Horizontal-lSlider")
    @Description("Horizontal-lSlider")
    @Test()
    public void horizontalSlider(){

        HorizontalSliderPage hp = new HorizontalSliderPage(driver);
        clickOnElement(landingPage.getHorizontalSlider());

        Dimension size = hp.getSlider().getSize();
        int sliderWidth = size.getWidth();
        int sliderHeight = size.getHeight();

        //Method one with mouse
        actions.moveToElement(hp.getSlider(),(0), (sliderHeight/2))
                .clickAndHold()
                .moveByOffset(sliderWidth,(sliderHeight/2))
                .release()
                .build()
                .perform();

        Assert.assertEquals(hp.sliderValue.getText(), TestData.SLIDER_VALUE);

        //Method 2 with keyboard
        reload();
        actions.moveToElement(hp.getSlider(), 0 , sliderHeight/2)
                .click()
                .build()
                .perform();

        int sliderSteps = Integer.parseInt(TestData.SLIDER_STEPS);
        System.out.println(sliderSteps);

        for (int i = 1; i<= sliderSteps ; i++){
            actions.keyDown(Keys.ARROW_RIGHT)
                    .keyUp(Keys.ARROW_RIGHT)
                    .build()
                    .perform();
            System.out.println(i);
        }
        Assert.assertEquals(hp.sliderValue.getText(), TestData.SLIDER_VALUE);
    }
}
