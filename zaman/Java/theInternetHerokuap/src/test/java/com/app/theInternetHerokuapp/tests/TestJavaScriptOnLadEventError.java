package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.JavaScriptOnLadEventErrorPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestJavaScriptOnLadEventError extends BaseTest{



    @Story("gits-5240-Java-Script-OnLad-EventError")
    @Description("Java-Script-OnLad-EventError")
    @Test()
    public void JavaScriptOnLadEventError(){

        JavaScriptOnLadEventErrorPage jsoep = new JavaScriptOnLadEventErrorPage(driver);
        clickOnElement(landingPage.getJavaScriptOnLadEventError());
        findJavaScriptErrorOnPageLoading();
    }
}
