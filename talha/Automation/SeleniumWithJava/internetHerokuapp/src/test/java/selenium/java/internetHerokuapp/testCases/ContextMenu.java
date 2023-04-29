package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.ContextMenuPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class ContextMenu extends BaseClass {

    @Test
    public void contextMenu(){

        // reference variable and creating object 
        TheInternet ti = new TheInternet(driver);
        ContextMenuPage cm =new ContextMenuPage(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        //TC-2 Context Menu Text validation in Base page
        if(ti.getContextMenu().isDisplayed()){
            String contextMenuText= ti.getContextMenu().getText();
            Assert.assertTrue(true,contextMenuText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        ti.getContextMenu().click();
        sleepTest(2000);

        //TC-3 Header Validation

        if(cm.contextMenuHeader.isDisplayed()){
            String contextMenuHeaderText= cm.contextMenuHeader.getText();
            Assert.assertTrue(true,contextMenuHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-4 Paragraph Validation

        if(cm.contextMenuParagraph1.isDisplayed()){
            String contextMenuParagraph1Text= cm.contextMenuParagraph1.getText();
            Assert.assertTrue(true,contextMenuParagraph1Text);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-5 Paragraph Validation

        if(cm.contextMenuParagraph2.isDisplayed()){
            String contextMenuParagraph2Text= cm.contextMenuParagraph2.getText();
            Assert.assertTrue(true,contextMenuParagraph2Text);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Right Click
        Actions actions = new Actions(driver);
       // WebElement elementLocator = driver.findElement(By.cssSelector("[oncontextmenu]"));
        actions.contextClick(cm.getBox()).perform();

       //Accept Alert

        System.out.println(driver.switchTo().alert().getText());
        sleepTest(2000);

        //Accept Alert
        driver.switchTo().alert().accept();
        System.out.println(" Alert Accepted");
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);


    }

}
