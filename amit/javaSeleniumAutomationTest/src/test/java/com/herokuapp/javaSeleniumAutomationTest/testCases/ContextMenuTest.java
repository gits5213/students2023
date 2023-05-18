package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.ContextMenu;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseClass {

    @Test
    public void contextMenu() throws InterruptedException {

        // reference variable and creating object
        Internet ti = new Internet(driver);
        ContextMenu cm =new ContextMenu(driver);

        //TestCase-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(500);

        //TestCase-2 Context Menu Text validation in Base page
        boolean displayed = ti.getContextMenu().isDisplayed();// handle unexpected case
        if (displayed) {
            String contextMenuText = ti.getContextMenu().getText();
            Assert.assertTrue(!contextMenuText.isEmpty());
            System.out.println(Data.POSETIVE_MASSAGE);
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getContextMenu().click();
        Thread.sleep(500);

        // TestCase-3 Header Validation
        boolean contextMenuHeaderDisplayed = cm.contextMenuHeader.isDisplayed();// handle unexpected case
        if (contextMenuHeaderDisplayed) {
            String contextMenuHeaderText = cm.contextMenuHeader.getText();
            Assert.assertTrue(!contextMenuHeaderText.isEmpty());
            System.out.println(Data.POSETIVE_MASSAGE);
        } else if (!(contextMenuHeaderDisplayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TestCase-4 Paragraph Validation
        boolean contextMenuParagraph1Displayed = cm.contextMenuParagraph1.isDisplayed();// handle unexpected case
        if (contextMenuParagraph1Displayed) {
            String contextMenuParagraph1Text = cm.contextMenuParagraph1.getText();
            Assert.assertTrue(!contextMenuParagraph1Text.isEmpty());
            System.out.println(Data.POSETIVE_MASSAGE);
        } else if (!(contextMenuParagraph1Displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Right Click
        Actions actions = new Actions(driver);
        actions.contextClick(cm.getBox()).perform();

        //Accept Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTest(2000);

        //Accept Alert
        driver.switchTo().alert().accept();
        System.out.println("Alert Accepted");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);




    }
}
