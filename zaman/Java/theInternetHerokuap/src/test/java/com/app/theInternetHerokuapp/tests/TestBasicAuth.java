package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.BasicAuthPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestBasicAuth extends BaseTest{


    @Story("gits-5232-Basic-Auth")
    @Description("Basic-Auth")
    @Test
    public void basicAuth(){

        BasicAuthPage bap = new BasicAuthPage(driver);
        clickOnElement(landingPage.getBasicAuth());
        //format to pass username and password within URL
        //https://username:password@the-internet.herokuapp.com/basic_auth

        digestAuthentication(bap.getAuthMessage(),
                TestData.BASIC_AUTH_USERNAME,
                TestData.BASIC_AUTH_PASSWORD,
                TestData.BASIC_AUTH_EDITABLE_URL);
        assertText(bap.getAuthMessage(), TestData.BASIC_AUTH_SUCCESSFUL_MESSAGE);
    }
}
