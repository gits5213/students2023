package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.CheckBoxesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;


public class TestCheckBoxes extends BaseTest{


    @Story("gits-5218-Check-Boxes")
    @Description("Check-Boxes")
    @Test
    public void checkBoxes (){

        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);

        clickOnElement(landingPage.getCheckBoxes());
        sleepTest(2000);
        validateCheckBoxes(checkBoxesPage.getNumberOfCheckBoxes());
    }
}
