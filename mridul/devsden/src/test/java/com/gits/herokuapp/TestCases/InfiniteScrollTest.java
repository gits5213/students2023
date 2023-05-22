package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.InfiniteScroll;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTest {

    @Test
    public void infiniteScrollTest() {

        LandingPage lp = new LandingPage(driver);
        InfiniteScroll is = new InfiniteScroll(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        lp.getInfiniteScroll().click();
        sleepTime(2000);

        //link Page URL Validation
        String InfiniteScrollLink = driver.getCurrentUrl();
        System.out.println("Given"+InfiniteScrollLink);
        Assert.assertEquals(InfiniteScrollLink, Data.BASE_URL+Data.INFINITE_SCROLL_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);


        //TC-2 Infinite Scroll Validation
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lenOfPage = (Long) (js.executeScript("return document.body.scrollHeight"));
        boolean scrolled = true;
        long lastCount = 0;
        System.out.println(lenOfPage);

        while(scrolled==true) {
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            sleepTime(2500);
            lastCount=lenOfPage;
            lenOfPage = (Long) (js.executeScript("return document.body.scrollHeight"));
            System.out.println(lenOfPage);
            if (lastCount==lenOfPage) {
                scrolled=false;
            }

            lastCount=lenOfPage;

            driver.navigate().back();
            sleepTime(2000);

        }





    }



}
