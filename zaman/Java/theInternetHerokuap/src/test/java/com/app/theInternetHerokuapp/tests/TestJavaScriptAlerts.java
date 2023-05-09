package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.JavaScriptAlertsPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestJavaScriptAlerts extends BaseTest {


    @Story("gits-5239-Java-Script-Alerts")
    @Description("Java-Script-Alerts")
    @Test()
    public void javaScriptAlerts() {`

        JavaScriptAlertsPage jap = new JavaScriptAlertsPage(driver);
        clickOnElement(landingPage.getJavaScriptAlerts());

        //First alert
        System.out.println("clicking on " + jap.getAlertBtns().get(0).getText() + " alert button");
        clickOnElement(jap.getAlertBtns().get(0));
        switchToAlertAndAccept();
        System.out.println(jap.getAlertConformationMessage().getText());
        assertText(jap.getAlertConformationMessage(), TestData.FIRST_ALERT_TEXT);
        sleepTest(2000);

        //Second alert
        System.out.println("clicking on " + jap.getAlertBtns().get(1).getText() + " alert button");
        clickOnElement(jap.getAlertBtns().get(1));
        switchToAlertAndAccept();
        System.out.println(jap.getAlertConformationMessage().getText());
        assertText(jap.getAlertConformationMessage(), TestData.SECOND_ALERT_TEXT);

        //Third alert with input
        System.out.println("clicking on " + jap.getAlertBtns().get(2).getText() + " alert button");
        clickOnElement(jap.getAlertBtns().get(2));
        switchToAlertAndSendText(TestData.THIRD_ALERT_INPUT_TEXT);
        System.out.println(jap.getAlertConformationMessage().getText());
        assertText(jap.getAlertConformationMessage(), TestData.THIRD_ALERT_DEFAULT_TEXT + TestData.THIRD_ALERT_INPUT_TEXT);
    }
}
