package com.gits.herokuapp.TestCases;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Pages.MultipleWindow.MultipleWindowsPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindows extends BaseClass {
    @Test
    public void multipleWindows(){

        LandingPage lp = new LandingPage(driver);
        MultipleWindowsPage mwp =new MultipleWindowsPage(driver);


        //Click on The internet and multiple windows page
        lp.getMultipleWindow().click();
        sleepTime(2000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.MULTIPLE_WINDOW);
        System.out.println("Link is valid");
        sleepTime(2000);

        //click on new windows button
        mwp.getClickHere().click();
        sleepTime(2000);

        //get window handlers as list
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
         //switch to new tab
        driver.switchTo().window(browserTabs .get(1));
        //check is it correct page opened or not (e.g. check page's title)
        // ...
        //then close tab and get back
        driver.close();
        driver.switchTo().window(browserTabs.get(0));

/*//       // System.out.println(nwp.getNHeader1().getText());
//        String title = driver.getTitle();
//        sleepTime(2000);
//        System.out.println("Base Window Title : " + title);
//        sleepTime(2000);
//
//        // It will return the parent window name as a String
//        String parent=driver.getWindowHandle();
//
//        Set<String> s=driver.getWindowHandles();
//
//       // Now iterate using Iterator
//        Iterator<String> I1= s.iterator();
//
//        while(I1.hasNext())
//        {
//
//            String child_window=I1.next();
//
//
//            if(!parent.equals(child_window))
//            {
//                driver.switchTo().window(child_window);
//                sleepTime(2000);
//
//                System.out.println( "New window Title : " + driver.switchTo().window(child_window).getTitle());
//
//                driver.close();
//            }
//
//        }

        //switch to the parent window
//        driver.switchTo().window(parent);*/
        sleepTime(2000);
        driver.navigate().to(Data.BASE_URL);
        sleepTime(2000);


    }
}
