package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.InfiniteScrollPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInfiniteScroll extends BaseTest {


    @Story("gits-5237-Infinite-Scroll")
    @Description("Infinite-Scroll")
    @Test()
    public void infiniteScroll() {

        InfiniteScrollPage ifp = new InfiniteScrollPage(driver);

        clickOnElement(landingPage.getInfiniteScroll());

        int scrollCount = 0;
        int verticalScroll = 1080;
        int initialElementCount = ifp.getScrollGeneratedElements().size();

        System.out.println("Initial elements = " + initialElementCount);

        for (int i = 0; i < 20; i++) {
            scrollWindow(verticalScroll, 0);
            waitForElementToDisappear(ifp.getPageLoader());
            scrollCount = verticalScroll * i;
        }

        waitForDOMToLoad();
        System.out.println("Total scroll made = " + (scrollCount) + " Pixels");
        int eventualElementCount = ifp.getScrollGeneratedElements().size();
        System.out.println("Eventual elements after scroll = " + eventualElementCount);
        Assert.assertTrue(eventualElementCount > initialElementCount);
    }
}
