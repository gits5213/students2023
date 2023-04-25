package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.ContextMenu;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuValidation extends BaseTest {
    @Test
    public void contextMenuValidation(){

        //Reference Variable And Creating Object
        LandingPage lp = new LandingPage(driver);
        ContextMenu cmp = new ContextMenu(driver);

        //Home Url Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given"+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is Valid");
        sleepTime(2000);

        //Context Menu Text Validation In Base Page
        if (lp.getContextMenu().isDisplayed()){
            String contextMenuText = lp.getContextMenu().getText();
            Assert.assertTrue(true,contextMenuText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getContextMenu().click();
        sleepTime(1000);

        //Header Validation
        if (cmp.getContextMenuHeader().isDisplayed()){
            String contextMenuHeaderText = cmp.getContextMenuHeader().getText();
            Assert.assertTrue(true,contextMenuHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //paragraph1 validation
        if(cmp.getContextMenuParagraph1().isDisplayed()){
            String contextMenuParagraph1Text = cmp.getContextMenuParagraph1().getText();
            Assert.assertTrue(true,contextMenuParagraph1Text);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Paragraph2 Validation
        if (cmp.getContextMenuParagraph2().isDisplayed()){
            String contextMenuParagraph2Text = cmp.getContextMenuParagraph2().getText();
            Assert.assertTrue(true,contextMenuParagraph2Text);
        }
        else {System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Right Click
        Actions act = new Actions(driver);
        act.contextClick(cmp.getBox()).perform();
        sleepTime(2000);

        //Popup Alert
        System.out.println(driver.switchTo().alert().getText());

        //Accept Alert
        driver.switchTo().alert().accept();


        driver.navigate().back();
        sleepTime(2000);
    }
}
