package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.BrokenImagesPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

import org.testng.annotations.Test;



public class TestBrokenImages extends BaseTest{



    @Story("gits-5217-Broken-Images")
    @Description("Broken-Images")
    @Test
    public void BrokenImages (){

        BrokenImagesPage brokenImagesPage = new BrokenImagesPage(driver);

        clickOnElement(landingPage.getBrokenImages());
        brokenImageValidation(brokenImagesPage.getListOfBrokenImages());
    }
}
