package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.MultipleWindowsPage;
import selenium.java.internetHerokuapp.pages.NewWindowsPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows extends BaseClass {
    @Test
    public void multipleWindows(){

        TheInternet ti =new TheInternet(driver);
        MultipleWindowsPage mwp =new MultipleWindowsPage(driver);
        NewWindowsPage nwp =new NewWindowsPage(driver);


        //Click on The internet and multiple windows page
        ti.getMultipleWindows().click();
        sleepTest(2000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.MULTIPLE_WINDOW);
        System.out.println("Link is valid");
        sleepTest(2000);

        mwp.getClickHere().click();
        sleepTest(2000);


        //New Window Page
       // System.out.println(nwp.getNHeader1().getText());
        String title = driver.getTitle();
        sleepTest(2000);
        System.out.println("Base Window Title : " + title);
        sleepTest(2000);

        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();

       // Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                sleepTest(2000);

                System.out.println( "New window Title : " + driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }

        //switch to the parent window
        driver.switchTo().window(parent);
        sleepTest(3000);
        driver.navigate().to(Data.BASE_URL);
        sleepTest(3000);


    }
}
