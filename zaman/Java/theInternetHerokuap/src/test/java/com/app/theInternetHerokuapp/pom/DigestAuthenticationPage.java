package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigestAuthenticationPage extends BasePage{


    public DigestAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public String editableDigestAuthentication = "the-internet.herokuapp.com/digest_auth";
    public String getDigestAuthentication() {
        return editableDigestAuthentication;
    }

    @FindBy(css = "p")
    public WebElement digestAuthShowedMessage;
    public WebElement digestAuthShowedMessage(){
        return digestAuthShowedMessage;
    }

}
