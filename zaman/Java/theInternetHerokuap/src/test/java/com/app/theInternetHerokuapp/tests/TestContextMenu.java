package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ContextMenuPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestContextMenu extends BaseTest {


    @Story("gits-5219-Context-Menu")
    @Description("Context-Menu")
    @Test
    public void contextMenu (){

        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        clickOnElement(landingPage.getContextMenu());
        contextMenuValidation(contextMenuPage.getContextMenu());
        sleepTest(3000);

    }
}
