package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class InfiniteScroll extends BaseClass {

    @Test
    public void infiniteScroll() {

        TheInternet ti = new TheInternet(driver);
        //InfiniteScrollPage isp = new InfiniteScrollPage(driver);

        ti.getInfiniteScroll().click();
        sleepTest(2020);

        //TC-1 HOME URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given " + link);
        Assert.assertEquals(link, Data.BASE_URL + Data.INFINITE_SCROLL_LINK);
        System.out.println("Link is valid");

        //TC-2 Infinite Scroll Validation
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long initialLength = (long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            sleepTest(3000);

            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
            if (initialLength == currentLength) {
                break;
            }

            initialLength = currentLength;

            driver.navigate().back();
            sleepTest(3000);

        }

    }
}