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
        digestAuthenticationValidation(TestData.DIGEST_USERNAME,TestData.DIGEST_PASSWORD);
        sleepTest(5000);
        assertText(digestAuthenticationPage.digestAuthShowedMessage,TestData.DIGEST_ACTUAL_MESSAGE);

    }
    public void digestAuthenticationValidation(String username, String password){
        DigestAuthenticationPage digestAuthenticationPage = new DigestAuthenticationPage(driver);
        String finaleLink = "https://"+username+":"+password+"@"+digestAuthenticationPage.editableDigestAuthentication;
        System.out.println(finaleLink);
        navigateTo(finaleLink);

    }

}
