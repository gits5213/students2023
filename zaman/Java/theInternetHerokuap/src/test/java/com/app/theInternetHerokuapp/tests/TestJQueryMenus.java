package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.JQueryMenusPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestJQueryMenus extends BaseTest{



    @Story("gits-5234-JQuery-Menus")
    @Description("JQuery-Menus")
    @Test()
    public void jQueryMenus(){

        JQueryMenusPage jqp = new JQueryMenusPage(driver);

        clickOnElement(landingPage.getJQueryMenus());

        actions.moveToElement(jqp.getEnable(),5,5)
                .pause(Duration.ofSeconds(1))
                .moveToElement(jqp.getDownloads(), 5,5)
                .pause(Duration.ofSeconds(1))
                .moveToElement(jqp.getBackToJqueryUi(),5,5)
                .click()
                .build()
                .perform();
        assertUrl(TestData.JQUERY_UI_LINK);
    }
}
