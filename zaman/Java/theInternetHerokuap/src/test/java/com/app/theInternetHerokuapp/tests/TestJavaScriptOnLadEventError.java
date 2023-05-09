package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.JavaScriptOnLadEventErrorPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.logging.Level;

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
