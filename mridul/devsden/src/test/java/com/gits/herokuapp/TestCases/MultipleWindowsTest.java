package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Pages.MultipleWindow.MultipleWindows_Page;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTest extends BaseTest {

    @Test
    public void multipleWindowsTest() {

        LandingPage lp = new LandingPage(driver);
        MultipleWindows_Page mwp = new MultipleWindows_Page(driver);



        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);


        //Click on The internet and multiple windows page
        lp.getMultipleWindow().click();
        sleepTime(2000);

        //link Page URL Validation
        String MultipleWindowsLink = driver.getCurrentUrl();
        System.out.println("Given"+MultipleWindowsLink);
        Assert.assertEquals(MultipleWindowsLink, Data.BASE_URL+Data.MULTIPLE_WINDOW_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);


        //click on new windows button
        mwp.getClickHere().click();
        sleepTime(2000);


        String MainWindow = driver.getWindowHandle();
        System.out.println("Main window handle is " + MainWindow);

        // To handle all new opened window
        Set<String> s1 = driver.getWindowHandles();
        System.out.println("Child window handle is" + s1);
        Iterator<String> i1 = s1.iterator();

        // Here we will check if child window has other child windows and when child window
        //is the main window it will come out of loop.
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                driver.close();
                System.out.println("Child window closed");
            }
        }











    }


}
