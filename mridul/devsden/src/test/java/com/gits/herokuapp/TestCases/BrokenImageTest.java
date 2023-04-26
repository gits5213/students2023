package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.BrokenImages;
import com.gits.herokuapp.Pages.LandingPage;
import org.testng.annotations.Test;

public class BrokenImageTest extends BaseTest {

    @Test
    public void brokenImageTest() {
        LandingPage lp = new LandingPage(driver);
        BrokenImages bi = new BrokenImages(driver);

    }
}
