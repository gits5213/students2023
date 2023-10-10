package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.Drag_and_drop;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropValidation extends BaseClass {

    @Test
    public void dragAndDrop(){

        LandingPage lp = new LandingPage(driver);
        Drag_and_drop dap =new Drag_and_drop(driver);

        //BasicAuth Text validation in Base page
        if(lp.getDragAndDrop().isDisplayed()){
            String dragAndDropText = lp.getDragAndDrop().getText();
            Assert.assertTrue(true,dragAndDropText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDragAndDrop().click();
        sleepTime(1000);

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println(link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DRAG_AND_DROP_LINK);
        System.out.println("Link is Valid");

        //Header Validation
        if(dap.getDragAndDropHeaderText().isDisplayed()){
            String dragAndDropHeaderText = dap.getDragAndDropHeaderText().getText();
            Assert.assertTrue(true,dragAndDropHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Mouse hover Doesn't work properly
        // Locating the Main Menu (Parent element or From Element)
        WebElement mainmenu = driver.findElement(By.xpath("/html//div[@id='column-a']"));
        //WebElement mainmenu = driver.findElement(By.cssSelector("#column-a"));

        //Instantiating Actions class
        Actions act = new Actions(driver);

        //Hovering on main menu
        act.moveToElement(mainmenu);
        sleepTime(1000);

        // Locating the element from Sub Menu or to manu
        WebElement submenu = driver.findElement(By.xpath("/html//div[@id='column-b']"));
        //WebElement submenu = driver.findElement(By.cssSelector("#column-b"));

        //To mouseover on sub menu
        act.moveToElement(submenu);
        sleepTime(1000);

        //build()- used to compile all the actions into a single step
        act.dragAndDrop(mainmenu,submenu).build().perform();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(1000);


/*//        //TC-4 Mouse Hover Validation
//        WebElement from = driver.findElement(By.xpath("/html//div[@id='column-a']"));
//        WebElement to = driver.findElement(By.xpath("/html//div[@id='column-b']"));
//
//        //Drag And Drop Activity Doesn't Work properly
//        Actions act=new Actions(driver);
//        act.dragAndDrop(from,to).build().perform();
//        sleepTime(3000);
//        driver.navigate().back();
//        sleepTime(3000);*/

    }

}
