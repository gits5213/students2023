package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.ChallengingDOM;
import com.gits.herokuapp.Pages.LandingPage;
import org.testng.annotations.Test;

public class ChallengingDOMTest extends BaseTest {

    @Test
    public void challengingDOMTest() {
        LandingPage lp = new LandingPage(driver);
        ChallengingDOM cd = new ChallengingDOM(driver);
    }
}
