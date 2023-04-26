package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.ContextMenu;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        LandingPage lp = new LandingPage(driver);
        ContextMenu cm = new ContextMenu(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //ContextMenu button validation
        if (lp.getContextMenu().isDisplayed())
        {
            String contextMenu = lp.getContextMenu().getText();
            Assert.assertEquals("Context Menu", contextMenu);
            System.out.println("ContextMenu button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getContextMenu().click();

        //link Page URL Validation
        String ContextMenuLink = driver.getCurrentUrl();
        System.out.println("Given"+ContextMenuLink);
        Assert.assertEquals(ContextMenuLink, Data.BASE_URL+Data.CONTEXT_MENU_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (cm.getContextMenuHeader().isDisplayed()) {
            String ContextMenuHeader = cm.getContextMenuHeader().getText();
            Assert.assertTrue(true, ContextMenuHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph 1 Validation
        if (cm.getContextMenuParagraph1().isDisplayed()) {
            String ContextMenuParagraph1 = cm.getContextMenuParagraph1().getText();
            Assert.assertTrue(true, ContextMenuParagraph1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Paragraph 2 Validation
        if (cm.getContextMenuparagraph2().isDisplayed()) {
            String ContextMenuParagraph2 = cm.getContextMenuparagraph2().getText();
            Assert.assertTrue(true, ContextMenuParagraph2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        //Right Click
        Actions actions = new Actions(driver);
        // WebElement elementLocator = driver.findElement(By.cssSelector("[oncontextmenu]"));
        actions.contextClick(cm.getContextMenuBox()).perform();
        System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);

        //Accept Alert
        driver.switchTo().alert().accept();
        System.out.println(" Alert Accepted");
        sleepTime(2000);
        driver.navigate().back();
        sleepTime(2000);


    }
}
