package com.app.theInternetHerokuapp.tests.LoginPage;

import com.app.theInternetHerokuapp.pom.LoginPage;
import com.app.theInternetHerokuapp.pom.LandingPage;
import com.app.theInternetHerokuapp.tests.BaseTest;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestInvalidPassword extends BaseTest {



    @Story("gits-5214-Invalid-Password")
    @Description("Invalid Password")
    @Test
    public void invalidPassword() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);

        clickOnElement(landingPage.getFormAuthentication());
        typeText(loginPage.getUsername(), TestData.USERNAME);
        typeText(loginPage.getPassword(), TestData.WRONG_PASSWORD);
        clickOnElement(loginPage.getLoginBtn());
        assertText(loginPage.errorMessage,TestData.EXPECTED_LOGIN_ERROR_MESSAGE);

    }
}