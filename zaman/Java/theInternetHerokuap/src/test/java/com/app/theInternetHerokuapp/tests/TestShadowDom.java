package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ShadowDomPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestShadowDom extends BaseTest {


    @Story("gits-5247-Shadow-Dom")
    @Description("Shadow-Dom")
    @Test()
    public void shadowDom() {

        ShadowDomPage sd = new ShadowDomPage(driver);
        clickOnElement(landingPage.getShadowDom());

        //For getting and setting Js properties
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String jsToGetAttribute = "arguments[0].getAttribute('name')";
        String jsToEetAttribute = "arguments[0].settAttribute('value', 'asdasdasd')";
        String jsToClickOnElement = "arguments[0].click()";

        //This Element is inside single shadow DOM.
        WebElement element = findElementInsideShadowRoot(sd.getJsShadowRootSlot());
        System.out.println(element.getAttribute("name"));

        printText(sd.getFirstText());
        printText(sd.getsSecondText());
        printText(sd.getsThirdText());
    }
}
