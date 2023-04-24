package com.gits.herokuapp.TestCases;


import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.DynamicControlsPage;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsValidation extends BaseClass {
   @Test

    public void dynamicControlValidation()
   {
       LandingPage lp = new LandingPage(driver);
       DynamicControlsPage dcp =new DynamicControlsPage(driver);

       //HOME URL Validation
       String baseLink = driver.getCurrentUrl();
       System.out.println("Given "+baseLink);
       Assert.assertEquals(baseLink, Data.BASE_URL);
       System.out.println("Home URL is validated");
       sleepTime(2000);

       //DynamicControl Text validation in Base page
       if(lp.getDynamicControls().isDisplayed()){
           String dynamicControlText = lp.getDynamicControls().getText();
           Assert.assertTrue(true,dynamicControlText);
       }
       else {
           System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
       }

       //click on Dynamic controls button
       lp.getDynamicControls().click();

       //Corresponding Page URL Validation
       String link = driver.getCurrentUrl();
       System.out.println("Given "+link);
       Assert.assertEquals(link, Data.BASE_URL+Data.DYNAMIC_CONTROL_LINK);
       System.out.println("Link is validated");
       sleepTime(2000);

       //Header Validation
       if(dcp.getDynamicControlHeader().isDisplayed()){
           String header =dcp.getDynamicControlHeader().getText() ;
           Assert.assertTrue(true,header);
           System.out.println("Header Text is valid");

       }
       else{
           System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
       }
       sleepTime(3000);

       //Paragraph text Validation
       if(dcp. getDynamicControlParagraph().isDisplayed()){
           String paragraph =dcp.getDynamicControlParagraph().getText() ;
           Assert.assertTrue(true,paragraph);
           System.out.println("Paragraph Text is valid");

       }
       else{
           System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
       }
       sleepTime(3000);

       dcp.getCheckBoxClick().click();
       sleepTime(2000);
       dcp.getRemoveButton().click();
       sleepTime(3000);
       dcp.getAddButton().click();
        sleepTime(3000);
       dcp.getEnableButton().click();
       sleepTime(3000);
       dcp.getInputsField().sendKeys("Subroto");
       sleepTime(2000);
       dcp.getEnableButton().click();
       sleepTime(2000);


       driver.navigate().back();
       sleepTime(3000);


   }
}
