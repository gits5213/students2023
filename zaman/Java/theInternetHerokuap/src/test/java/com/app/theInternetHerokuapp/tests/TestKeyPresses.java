package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.KeyPressesPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestKeyPresses extends BaseTest {


    @Story("gits-5241-Key-Presses")
    @Description("Key-Presses")
    @Test()
    public void keyPresses() {

        KeyPressesPage kp = new KeyPressesPage(driver);
        clickOnElement(landingPage.getKeyPresses());

        //Validation for character keys
        characterKeysValidation(TestData.CHARACTER_KEYS, kp.getKeyInputBox(), kp.getKeyMessage());
        //Validation ofr function keys
        functionKeysValidation(TestData.FUNCTION_KEYS, kp.getKeyInputBox(), kp.getKeyMessage());
    }

}
