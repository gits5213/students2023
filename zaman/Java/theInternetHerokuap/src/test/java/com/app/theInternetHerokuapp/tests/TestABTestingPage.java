package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ABTestingPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestABTestingPage extends BaseTest {



    @Story("gits-5216-AB-Testing")
    @Description("AB-Testing")
    @Test
    public void abTesting (){


        ABTestingPage abTestingPage =new ABTestingPage(driver);

        clickOnElement(landingPage.getAbTestingPage());
        sleepTest(2000);
        assertUrl(TestData.AB_TESTING_URL);
        abTestingVersionValidation(abTestingPage.abTestingHeader, TestData.AB_TESTING_HEADER_TEXT,TestData.AB_TESTING_HEADER_TEXT_2);


    }

}
