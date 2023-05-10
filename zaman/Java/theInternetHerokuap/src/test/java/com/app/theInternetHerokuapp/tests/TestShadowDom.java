package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ShadowDomPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestShadowDom extends BaseTest{



    @Story("gits-5247-Shadow-Dom")
    @Description("Shadow-Dom")
    @Test()
    public void shadowDom(){

        ShadowDomPage sd = new ShadowDomPage(driver);
        clickOnElement(landingPage.getShadowDom());

        JavascriptExecutor jse = (JavascriptExecutor)driver;
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

//    public WebElement findElementInsideShadowRoot(WebElement shadowHost, WebElement afterShadowHost) {
//        String shadowRoot = shadowHost.toString();
//        String afterShadowRoot = afterShadowHost.toString();
//        JavascriptExecutor jse = ((JavascriptExecutor) driver);
////        return (WebElement) jse.executeScript("document.querySelector('" + shadowRoot + "').shadowRoot.querySelector('" + afterShadowRoot + "')");
//        return (WebElement) jse.executeScript("document.querySelector(\"#content > my-paragraph:nth-child(5)\").shadowRoot.querySelector(\"p\")");
//    }

    public WebElement findElementInsideShadowRoot(String shadowHostElement) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        return (WebElement) jse.executeScript("" + shadowHostElement + "");
    }

}
