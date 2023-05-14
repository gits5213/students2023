package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.HoversPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHovers extends BaseTest{



    @Story("gits-5236-Hovers")
    @Description("Hovers")
    @Test()
    public void hovers(){

        HoversPage hvp = new HoversPage(driver);
        clickOnElement(landingPage.getHovers());
        System.out.println("Total Number of hover able elements = " + hvp.getHoverElements().size());
        int attrElements = 0;

        for (WebElement hoverElement: hvp.getHoverElements()) {
            Dimension size = hoverElement.getSize();
            actions.moveToElement(hoverElement,(size.getHeight()/2),(size.getWidth()/2)).build().perform();
            sleepTest(250);
            System.out.println(hvp.getHoverElementsAttribute().get(attrElements).getText());
            WebElement attribute = hvp.getHoverElementsAttribute().get(attrElements);
            Assert.assertTrue(attribute.isDisplayed());
            attrElements++;
        }
    }
}
