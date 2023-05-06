package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.GeoLocationPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestGeoLocation extends BaseTest {

//    public TestGeoLocation(String incognito) {
//        super("incognito");
//    }

    @Story("gits-5235-Geo-Location")
    @Description("Geo-Location")
    @Test()
    public void geoLocation() {

        GeoLocationPage gp = new GeoLocationPage(driver);

        clickOnElement(landingPage.getGeoLocation());
        sleepTest(2000);
        clickOnElement(gp.getWhereAmIBtn());
        sleepTest(2000);
        switchToAlertAndAccept();
    }
}
