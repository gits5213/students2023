package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.InfiniteScrollPage;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfiniteScroll extends BaseClass {

    @Test
    public void infiniteScroll() {

        LandingPage lp = new LandingPage(driver);
        InfiniteScrollPage isp = new InfiniteScrollPage(driver);

        lp.getInfiniteScroll().click();
        sleepTime(1000);

        //HOME URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given " + link);
        Assert.assertEquals(link, Data.BASE_URL + Data.INFINITE_SCROLL_LINK);
        System.out.println("Link is valid");

        //Header Validation
        if (isp.getHeader().isDisplayed())
        {
            String infiniteScrollPage= isp.getHeader().getText();
            Assert.assertTrue(true, Data.INFINITE_SCROLL_HEADER);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);

        //Infinite Scroll Validation
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,200)", "");
        driver.findElement(By.xpath(".//[@id=content]/ul/li[23]/a")).click();
        sleepTime(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a")).click();


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long initialLength = (long) js.executeScript("return document.body.scrollHeight");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//            sleepTime(1000);
//
//            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
//            if (initialLength == currentLength) {
//                break;
//            }
//
//            initialLength = currentLength;

            driver.navigate().back();
            sleepTime(1000);

        }

    }
}