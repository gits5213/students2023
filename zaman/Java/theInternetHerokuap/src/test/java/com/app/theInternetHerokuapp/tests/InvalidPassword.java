package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.LoginPage;
import com.app.theInternetHerokuapp.pom.landingPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidPassword extends BaseTest {

    String expectedLoginErrorMessage = "Your password is invalid!\n" +
            "×";

    @Story("gits-5214-Invalid-Password")
    @Description("Invalid Password")
    @Test
    public void invalidPassword() throws InterruptedException {

        landingPage landingpage = new landingPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //======Keyword Driven and DataDriven======
        waitForElementToBeVisible(landingpage.formAuthentication);
        clickOnElement(landingpage.getFormAuthentication());
        typeText(loginPage.getUsername(), TestData.USERNAME);
        typeText(loginPage.getPassword(), TestData.PASSWORD);
        clickOnElement(loginPage.getLoginBtn());
    }
}