package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.JavaScriptAlertsPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestJavaScriptAlerts extends BaseTest{



    @Story("gits-5239-Java-Script-Alerts")
    @Description("Java-Script-Alerts")
    @Test()
    public void javaScriptAlerts(){

        JavaScriptAlertsPage jap = new JavaScriptAlertsPage(driver);
        clickOnElement(landingPage.getJavaScriptAlerts());

        //First alert
        System.out.println("clicking on " + jap.getAlertBtns().get(0).getText() + " alert button");
        clickOnElement(jap.getAlertBtns().get(0));
        switchToAlertAndAccept();
        System.out.println(jap.getAlertConformationMessage().getText());
        assertText(jap.getAlertConformationMessage(), TestData.FIRST_ALERT_TEXT);

    }
}
