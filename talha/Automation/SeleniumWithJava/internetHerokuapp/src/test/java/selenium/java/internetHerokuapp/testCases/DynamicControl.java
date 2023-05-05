package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.DynamicControlsPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class DynamicControl extends BaseClass {
   @Test

    public void dynamicControl()
   {
       TheInternet ti =new TheInternet(driver);
       DynamicControlsPage dcp =new DynamicControlsPage(driver);

       //TC-1 HOME URL Validation
       String baseLink = driver.getCurrentUrl();
       System.out.println("Given "+baseLink);
       Assert.assertEquals(baseLink, Data.BASE_URL);
       System.out.println("Home URL is validated");
       sleepTest(2000);

       //TC-2 DynamicControl Text validation in Base page
       if(ti.getDynamicControls().isDisplayed()){
           String dynamicControlText = ti.getDynamicControls().getText();
           Assert.assertTrue(true,dynamicControlText);
       }
       else {
           System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
       }

       ti.getDynamicControls().click();

       //TC-3 Corresponding Page URL Validation
       String link = driver.getCurrentUrl();
       System.out.println("Given "+link);
       Assert.assertEquals(link, Data.BASE_URL+Data.DYNAMIC_Control_LINK);
       System.out.println("Link is validated");
       sleepTest(2000);

       //TC-4 Header Validation
       if(dcp.getDynamicControlHeader().isDisplayed()){
           String header =dcp.getDynamicControlHeader().getText() ;
           Assert.assertTrue(true,header);
           System.out.println("Header Text is valid");

       }
       else{
           System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
       }

       sleepTest(3000);

       //TC-5 Paragraph text Validation
       if(dcp. getDynamicControlParagraph().isDisplayed()){
           String paragraph =dcp.getDynamicControlParagraph().getText() ;
           Assert.assertTrue(true,paragraph);
           System.out.println("Paragraph Text is valid");

       }
       else{
           System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
       }
       sleepTest(3000);
       dcp.getCheckBoxButton().click();
       sleepTest(2000);
       //sleepTest(3000);
       //dcp.getRemoveAdd().click();
       //sleepTest(3000);
      // dcp.getAddButton().click();
      //  sleepTest(3000);
       //dcp.getEnableInputField().sendKeys("hello");
       //sleepTest(2000);
       //dcp.getEnableButton().click();
       //sleepTest(2000);
       //dcp.getEnableButton().click();
       //sleepTest(3000);

       driver.navigate().back();
       sleepTest(3000);


   }
}
