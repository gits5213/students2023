package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DigestAuthenticationPage;

import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

import org.testng.annotations.Test;

import java.util.Base64;


public class TestDigestAuthentication extends BaseTest{



    @Story("gits-5220-Digest-Authentication")
    @Description("Digest-Authentication")
    @Test
    public void digestAuthentication (){

        DigestAuthenticationPage digestAuthenticationPage = new DigestAuthenticationPage(driver);

        clickOnElement(landingPage.getDigestAuthentication());
        //format to pass username and password within URL
        //https://username:password@the-internet.herokuapp.com/digest_auth

        digestAuthenticationValidation(digestAuthenticationPage.digestAuthShowedMessage(),
                TestData.DIGEST_USERNAME,
                TestData.DIGEST_PASSWORD,
                TestData.DIGEST_EDITABLE_URL);
    }
}
