package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.MultipleWindowsPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class TestMultipleWindows extends BaseTest {


    @Story("gits-5243-Large-And-Deep-DOM-Page")
    @Description("Large-And-Deep-DOM-Page")
    @Test()
    public void multipleWindows() {

        MultipleWindowsPage mp = new MultipleWindowsPage(driver);
        clickOnElement(landingPage.getMultipleWindows());
        String currentWindow = currentWindowHandle();

        //With link click
        for (int i = 0; i < 5; i++) {
            clickOnElement(mp.getNewWindowBtn());
            sleepTest(250);
            switchToWindow(currentWindow);
        }
//        Set<String> windowHandles = driver.getWindowHandles();
//        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        List<String> windowHandlesList = new ArrayList<>(windowHandles());
        for (int i = 1; i < windowHandlesList.size(); i++) {
            switchToWindow(windowHandlesList.get(i));
            sleepTest(250);
            assertText(mp.getNewWindowText(), TestData.NEW_WINDOW_TEXT);
            closeWindow();
        }

        //With new blank tab
        switchToWindow(currentWindow);

        for (int i = 0; i < 5; i++) {
            newBlankTab();
            sleepTest(250);
        }

        List<String> blankWindowHandlesList = new ArrayList<>(driver.getWindowHandles());
        for (int i = 1; i < blankWindowHandlesList.size(); i++) {
            switchToWindow(blankWindowHandlesList.get(i));
            sleepTest(250);
            closeWindow();
        }
    }
}
