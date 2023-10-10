package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.ContextMenuPage;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuValidation extends BaseClass {

    @Test
    public void contextMenu(){

        // instance create of reference variable
        LandingPage lp = new LandingPage(driver);
        ContextMenuPage cmp =new ContextMenuPage(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(1000);

        //Context Menu Text validation in Base page
        if(lp.getContextMenu().isDisplayed()){
            String contextMenuText= lp.getContextMenu().getText();
            Assert.assertTrue(true,contextMenuText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        lp.getContextMenu().click();
        sleepTime(1000);

        //Header Validation

        if(cmp.getContextMenuHeader().isDisplayed()){
            String contextMenuHeaderText= cmp.getContextMenuHeader().getText();
            Assert.assertTrue(true,contextMenuHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        // Paragraph1 Validation

        if(cmp.getContextMenuParagraph1().isDisplayed()){
            String contextMenuParagraph1Text= cmp.getContextMenuParagraph1().getText();
            Assert.assertTrue(true,contextMenuParagraph1Text);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Paragraph2 Validation

        if(cmp.getContextMenuParagraph2().isDisplayed()){
            String contextMenuParagraph2Text= cmp.getContextMenuParagraph2().getText();
            Assert.assertTrue(true,contextMenuParagraph2Text);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Right Click
        Actions actions = new Actions(driver);
        actions.contextClick(cmp.getBox()).perform();

          //get box right click perform
//        Actions action= new Actions(driver);
//        action.contextClick(productLink).build().perform();
          //another way
//        Actions action = new Actions(driver).contextClick(element);
//        action.build().perform();

       //Accept Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);

        //Accept the popup Alert
        driver.switchTo().alert().accept();
        //for dismiss the popup alert
//        driver.switchTo().alert().dismiss();


        System.out.println(" Alert Accepted");
        sleepTime(1000);
        driver.navigate().back();
        sleepTime(1000);


    }

}
