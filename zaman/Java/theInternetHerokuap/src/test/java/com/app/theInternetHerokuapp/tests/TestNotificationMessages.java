package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.NotificationMessagesPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestNotificationMessages extends BaseTest {



    @Story("gits-5244-Notification-Messages")
    @Description("Notification-Messages")
    @Test()
    public void notificationMessages() {

        NotificationMessagesPage np = new NotificationMessagesPage(driver);
        clickOnElement(landingPage.getNotificationMessages());

        try {
            assertText(np.getNotificationMessage(), TestData.DEFAULT_NOTIFICATION_MESSAGE);
            System.out.println(np.getNotificationMessage().getText());
        } catch (AssertionError e) {
            e.printStackTrace();
        }
        try {
            assertText(np.getNotificationMessage(), TestData.UNSUCCESSFUL_NOTIFICATION_MESSAGE);
            System.out.println(np.getNotificationMessage().getText());
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }
}
