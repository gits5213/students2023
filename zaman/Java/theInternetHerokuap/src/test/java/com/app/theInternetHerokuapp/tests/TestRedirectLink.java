package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.RedirectLinkPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

public class TestRedirectLink extends BaseTest{



    @Story("gits-5245-Redirect-Link")
    @Description("Redirect-Link")
    @Test()
    public void redirectLink(){

        RedirectLinkPage rp = new RedirectLinkPage(driver);
        clickOnElement(landingPage.getRedirectLink());
        clickOnElement(rp.getRedirectLinkBtn());
        assertUrl(TestData.REDIRECT_LINK);
        System.out.println("Redirected Link >>> " + TestData.REDIRECT_LINK);

        //URL HTTP status code validation
        for(WebElement element:rp.getStatusCodeLinks()){
            clickOnElement(element);
            pageStatusCodeValidation(getCurrentUrl());
            navigateBack();
        }
    }
}
