package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.BrokenImagesPage;
import com.app.theInternetHerokuapp.pom.CheckBoxesPage;
import com.app.theInternetHerokuapp.pom.LandingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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
