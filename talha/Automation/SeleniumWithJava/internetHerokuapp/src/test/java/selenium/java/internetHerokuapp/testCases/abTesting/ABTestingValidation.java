package selenium.java.internetHerokuapp.testCases.abTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.AbTestingPage;
import selenium.java.internetHerokuapp.pages.LandingPage;
import selenium.java.internetHerokuapp.utilities.Data;

public class ABTestingValidation extends BaseClass {

    @Test(description = "User Able to visit Landing Page and Validate that AB testing is available and clickable")
    public void aBTestingValidation(){

        LandingPage lnp = new LandingPage(driver); // to use this class in java we have to create new instance
        AbTestingPage atp  = new AbTestingPage(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.LANDING_PAGE_URL);
        System.out.println("Home URL is validate");
        sleepTest(2000);

        //TC-2 Header Validation
//        if (lnp.getAbTesting().isDisplayed())
//        {
//            String abTesting= lnp.getAbTesting().getText();
//            Assert.assertEquals(Data.AB_TESTING,abTesting);
//        }
//
//        else {
//            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
//        }
        lnp.abTesting.click();
        sleepTest(2000);

        //TC-3 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.LANDING_PAGE_URL+Data.AB_Test_LINK);
        System.out.println("Link is validate");
        sleepTest(2000);

        //TC-4 Paragraph Validation
        if (atp.getabTestingVariation1().isDisplayed())
        {
            String header1= atp.getabTestingVariation1().getText();
           // Assert.assertEquals(Data.AB_TEST_VARIATION1,header1);
        } else if (atp.getAbTestControl().isDisplayed()){
            String header2= atp.abTestControl.getText();
            Assert.assertEquals(Data.AB_TEST_Control,header2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(2000);
        driver.navigate().back();
        sleepTest(5000);

    }
}
