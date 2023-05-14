package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DigestAuthenticationPage;

import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

import org.testng.annotations.Test;


public class TestDigestAuthentication extends BaseTest{



    @Story("gits-5220-Digest-Authentication")
    @Description("Digest-Authentication")
    @Test
    public void digestAuthentication (){

        DigestAuthenticationPage da = new DigestAuthenticationPage(driver);

        clickOnElement(landingPage.getDigestAuthentication());
        //format to pass username and password within URL
        //https://username:password@the-internet.herokuapp.com/digest_auth

        digestAuthentication(da.digestAuthShowedMessage(),
                TestData.DIGEST_USERNAME,
                TestData.DIGEST_PASSWORD,
                TestData.DIGEST_EDITABLE_URL);
        assertText(da.digestAuthShowedMessage(), TestData.BASIC_AUTH_SUCCESSFUL_MESSAGE);
    }
}
