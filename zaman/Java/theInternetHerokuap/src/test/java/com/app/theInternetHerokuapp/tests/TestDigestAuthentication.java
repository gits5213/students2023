package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DigestAuthenticationPage;
import com.app.theInternetHerokuapp.pom.LandingPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Base64;

public class TestDigestAuthentication extends BaseTest{



    @Story("gits-5220-Digest-Authentication")
    @Description("Digest-Authentication")
    @Test
    public void digestAuthentication (){

        DigestAuthenticationPage digestAuthenticationPage = new DigestAuthenticationPage(driver);

        clickOnElement(landingPage.getDigestAuthentication());
        digestAuthenticationAlertInputFieldValidation(landingPage.getDigestAuthentication(), TestData.DIGEST_USERNAME, TestData.DIGEST_PASSWORD);
        sleepTest(5000);

    }
    public void digestAuthenticationAlertInputFieldValidation(WebElement element, String username, String password){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(username + "\t" + password);
        alert.accept();


    }
}
