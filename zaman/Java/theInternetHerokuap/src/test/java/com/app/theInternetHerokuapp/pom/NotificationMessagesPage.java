package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagesPage extends BasePage{

    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#flash")
    public WebElement notificationMessage;
    public WebElement getNotificationMessage() {
        return notificationMessage;
    }

    @FindBy(css = "div#content a")
    public WebElement notificationGeneratorBtn;
    public WebElement getNotificationGeneratorBtn() {
        return notificationGeneratorBtn;
    }
}
