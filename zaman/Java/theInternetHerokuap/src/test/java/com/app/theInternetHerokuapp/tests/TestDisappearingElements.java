package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DisappearingElementsPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;


public class TestDisappearingElements extends BaseTest{



    @Story("gits-5221-Disappearing-Elements")
    @Description("Disappearing-Elements")
    @Test
    public void disappearingElements (){

        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(driver);

        clickOnElement(landingPage.getDisappearingElements());
        disappearingElementsValidation(TestData.DISAPPEARING_ELEMENTS,disappearingElementsPage.getNumberofelements());
        sleepTest(2000);
    }
}
