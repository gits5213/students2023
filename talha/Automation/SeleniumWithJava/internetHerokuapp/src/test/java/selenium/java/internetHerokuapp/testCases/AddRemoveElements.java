package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.Add_remove_elements;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class AddRemoveElements extends BaseClass {


    @Test
    public  void  addRemoveElements ()  {


        TheInternet ti = new TheInternet(driver);
        Add_remove_elements are =new Add_remove_elements(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        //TC-2 Header Validation
        sleepTest(2000);
        if (ti.getAddRemoveElements().isDisplayed())
        {
            String addRemoveElementsText =ti.getAddRemoveElements().getText();
            Assert.assertTrue(true, addRemoveElementsText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getAddRemoveElements().click();


        //TC-3 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.ADD_REMOVE_ELEMENTS_LINK);
        System.out.println("Link is validate");
        sleepTest(2000);

        //TC-4 Header Validation
        sleepTest(2000);
        if (are.getaddRemoveElementsHeader().isDisplayed())
        {
            String addRmvHeader= are.getaddRemoveElementsHeader().getText();
            Assert.assertTrue(true,addRmvHeader);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        are.getaddElement().click();
        sleepTest(2000);
        are.getaddElement().click();
        sleepTest(2000);
        are.getdelete1().click();
        sleepTest(2000);
        are.getdelete2().click();
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);



    }
}
