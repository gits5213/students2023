package selenium.java.internetHerokuapp.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.Basic_auth;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;


public class BasicAuth extends BaseClass {
    @Test
    public  void  basicAuth ()
    {
        TheInternet ti = new TheInternet(driver);
        Basic_auth ba =new Basic_auth(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        sleepTest(2000);

        //TC-2 BasicAuth Text validation in Base page
        if(ti.getBasicAuth().isDisplayed()){
            String basicAuthText= ti.basicAuth.getText();
            Assert.assertTrue(true,basicAuthText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        ti.getBasicAuth().click();
        sleepTest(2000);
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        sleepTest(2000);

        //TC-3 Header Validation
        if (ba.getBasicAuthHeader1().isDisplayed()){
            String basicAuthHeaderText = ba.getBasicAuthHeader1().getText();
            Assert.assertTrue(true,basicAuthHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-4 Paragraph Validation

        if (ba.getBasicAuthParagraph1().isDisplayed()){
            String basicAuthParagraphText = ba.getBasicAuthParagraph1().getText();
            Assert.assertTrue(true,basicAuthParagraphText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        driver.navigate().back();
        driver.navigate().back();
        sleepTest(2000);

        System.out.println("Test Ran Successfully ");
    }
}
