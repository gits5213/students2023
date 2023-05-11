package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.AddRemoveElementsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;


public class TestAddRemoveElements extends BaseTest{



    @Story("gits-5215-Add-remove-Element")
    @Description("Add-remove-Element")
    @Test
    public void addRemoveElements(){

        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);

        clickOnElement(landingPage.getAddRemoveElementsPage());
        addElement(100,addRemoveElementsPage.getAddElementBtn(),addRemoveElementsPage.getTotalBtn());
        removeElements(addRemoveElementsPage.getTotalBtn());
    }
}
