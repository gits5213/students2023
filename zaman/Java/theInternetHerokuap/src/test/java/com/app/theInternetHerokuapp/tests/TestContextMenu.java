package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ContextMenuPage;
import com.app.theInternetHerokuapp.pom.LandingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestContextMenu extends BaseTest {


    @Story("gits-5219-Context-Menu")
    @Description("Context-Menu")
    @Test
    public void contextMenu (){

        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        clickOnElement(landingPage.getDigestAuthentication());
        contextMenuValidation(contextMenuPage.getContextMenu());
        sleepTest(3000);

    }
}
