package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FloatingMenuPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFloatingMenu extends BaseTest{



    @Story("gits-5231-Floating-Menu")
    @Description("Floating-Menu")
    @Test()
    public void floatingMenu(){

        FloatingMenuPage fm =new FloatingMenuPage(driver);

        clickOnElement(landingPage.getFloatingMenu());

        for(WebElement element: fm.getFloatingMenuList()){
            if (element.isDisplayed()){
                System.out.println(element.getText() + " ---- Element is visible");
                Assert.assertTrue(element.isDisplayed());
            }
            else {
                System.out.println(element.getText() + " ---- Element is missing");
                Assert.assertTrue(element.isDisplayed());
            }
        }
        sleepTest(2000);
        scrollWindow(500,0);
        sleepTest(2000);
        System.out.println();
        for(WebElement element: fm.getFloatingMenuList()){
            if (element.isDisplayed()){
                System.out.println(element.getText() + " ---- Element is visible after scroll");
                Assert.assertTrue(element.isDisplayed());
            }
            else {
                System.out.println(element.getText() + " ---- Element is missing");
                Assert.assertTrue(element.isDisplayed());
            }
        }
    }
}
