package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DropDownPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestDropDown  extends BaseTest{



    @Story("gits-5223-Drag-AndDrop")
    @Description("Drag-AndDrop")
    @Test
    public void DropDown(){

        DropDownPage dp = new DropDownPage(driver);

        clickOnElement(landingPage.getDropDownPage());
        clickOnElement(dp.getDropdown());
        clickOnElement(dp.getOption1());
        sleepTest(2000);
        clickOnElement(dp.getDropdown());
        clickOnElement(dp.getOption2());
    }
}
