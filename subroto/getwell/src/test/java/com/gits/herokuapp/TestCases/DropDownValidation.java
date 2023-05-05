package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.DropDown;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownValidation extends BaseClass {
    @Test
    public void dropDown(){
        LandingPage lp = new LandingPage(driver);
        DropDown dd = new DropDown(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(1000);

        //DropDown Text validation in Base page
        if(lp.getDropDown().isDisplayed()){
            String dropDownText = lp.getDropDown().getText();
            Assert.assertTrue(true,dropDownText);

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDropDown().click();

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DROP_DOWN_LINK);
        System.out.println("Link is valid");
        sleepTime(1000);

        //Header Validation
        if(dd.getDropDownHeaderText().isDisplayed()){
            String header =dd.getDropDownHeaderText().getText() ;
            Assert.assertTrue(true,header);
            System.out.println("Header is validate");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //DropDown Validation Using Loop
         driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
         sleepTime(3000);

         List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));

         String option = "Highest to lowest";

         // Iterate the list using for loop

          for (int i = 0; i < allOptions.size(); i++) {

              if (allOptions.get(i).getText().contains(option)) {

              allOptions.get(i).click();
              sleepTime(5000);
              break;}}

        driver.navigate().back();
        sleepTime(1000);




//        //Click on DropDown List Option
//        dd.getDropDownListOption().click();
//        sleepTime(1000);
//
//        //Click on the list and Select Option 1
//        dd.getDropDownListOption1().click();
//        sleepTime(2000);
//
//        //Drop Down option Text Validation
//        if(dd.getDropDownListOption1().isDisplayed()){
//            String dropDownList1Text = dd.getDropDownListOption1().getText();
//            System.out.println("Selected :"+Data.DROP_DOWN_TEXT_OPTION1 );
//            Assert.assertEquals(dropDownList1Text,Data.DROP_DOWN_TEXT_OPTION1);
//        }
//        else {
//            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
//        }
//        dd.getDropDownListOption().click();
//        sleepTime(1000);
//
//        //Click on the list and select option 2
//        dd.getDropDownListOption2().click();
//        sleepTime(1000);
//
//        //Drop Down Option2 Text Validation
//        if(dd.getDropDownListOption2().isDisplayed()){
//            String dropDownList2Text = dd.getDropDownListOption2().getText();
//            System.out.println("Selected :"+Data.DROP_DOWN_TEXT_OPTION2 );
//            Assert.assertEquals(dropDownList2Text,Data.DROP_DOWN_TEXT_OPTION2);
//        }
//        else {
//            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
//        }
//        sleepTime(1000);
//        dd.getDropDownListOption().click();
//        sleepTime(1000);
//
//        driver.navigate().back();
//        sleepTime(1000);



//        // Using Array for creating DropDown
//        String[] array={ Data.DROP_DOWN_TEXT_OPTION1,Data.DROP_DOWN_TEXT_OPTION2};
//       // System.out.println("List Of Dropdown Element"+ Arrays.toString(array));
//        // declaring List
//        List<String> list=new ArrayList<String>();
//        for(String lang:array){
//            list.add(lang);
//        }
//        System.out.println("List Of Dropdown Element: "+list);

//        driver.navigate().back();
//        sleepTime(1000);
        
    }
}
