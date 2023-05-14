package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.InputsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestInputs extends BaseTest{

    public TestInputs() {
        super("incognito");
    }

    @Story("gits-5238-Input")
    @Description("Input")
    @Test()
    public void input(){

        InputsPage ip = new InputsPage(driver);

        clickOnElement(landingPage.getInputs());

        actions.click(ip.getInputBox()).build().perform();

        for (int i = 0; i < 5; i++) {
            actions.keyDown(Keys.ARROW_UP)
                    .pause(Duration.ofMillis(100))
                    .keyUp(Keys.ARROW_UP)
                    .pause(Duration.ofMillis(100))
                    .build().perform();
        }

        for (int i = 5; i > 0; i--) {
            actions.keyDown(Keys.ARROW_DOWN)
                    .pause(Duration.ofMillis(100))
                    .keyUp(Keys.ARROW_DOWN)
                    .pause(Duration.ofMillis(100))
                    .build().perform();
        }

        sleepTest(2000);
//        Assert.assertTrue(Boolean.parseBoolean(ip.getInputBox().getText()));

    }
}
