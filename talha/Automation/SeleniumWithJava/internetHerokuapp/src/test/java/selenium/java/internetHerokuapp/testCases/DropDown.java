package selenium.java.internetHerokuapp.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.Dropdown;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

import java.util.ArrayList;
import java.util.List;

public class DropDown extends BaseClass {
    @Test
    public void dropDown(){
        TheInternet ti =new TheInternet(driver);
        Dropdown dd = new Dropdown(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        //TC-2 DropDown Text validation in Base page
        if(ti.getDropdown().isDisplayed()){
            String dropDownText = ti.getDropdown().getText();
            Assert.assertTrue(true,dropDownText);

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getDropdown().click();

        //TC-3 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DROP_DOWN_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        //TC-4 Header Validation
        if(dd.getDropdownHeader().isDisplayed()){
            String header =dd.getDropdownHeader().getText() ;
            Assert.assertTrue(true,header);
            System.out.println("Header is validate");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

       /* //Please select an option validate
        if(dd.getSelectOption().isDisplayed()){
            String  dropDownText=dd.getSelectOption().getText() ;
            System.out.println(dropDownText);
            Assert.assertTrue(true,dropDownText);
            System.out.println("Please select an option Validate");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } */
        dd.getSelectOption().click();
        sleepTest(3000);
        dd.getSelectOption1().click();

        //TC-5 Drop Down Menu Text Validation
        sleepTest(2000);
        if(dd.getSelectOption1().isDisplayed()){
            String dropDownList1Text = dd.getSelectOption1().getText();
            System.out.println("Selected :"+Data.DROP_DOWN_Option1_Text );
            Assert.assertEquals(dropDownList1Text,Data.DROP_DOWN_Option1_Text);

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        dd.getSelectOption().click();
        sleepTest(3000);
        dd.getSelectOption2().click();

        //TC-6 DropDown Menu2 Text Validation
        sleepTest(2000);
        if(dd.getSelectOption2().isDisplayed()){
            String dropDownList2Text = dd.getSelectOption2().getText();
            System.out.println("Selected :"+Data.DROP_DOWN_Option2_Text );
            Assert.assertEquals(dropDownList2Text,Data.DROP_DOWN_Option2_Text);
           // System.out.println("Selected " + dropDownList2Text);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(3000);
        dd.getSelectOption().click();
        sleepTest(3000);
        driver.navigate().back();
        sleepTest(3000);

        //Creating Array
        String[] array={ Data.DROP_DOWN_Option1_Text,Data.DROP_DOWN_Option2_Text};
       // System.out.println("List Of Dropdown Element"+ Arrays.toString(array));
        // declaring List
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("List Of Dropdown Element: "+list);
        
    }
}
