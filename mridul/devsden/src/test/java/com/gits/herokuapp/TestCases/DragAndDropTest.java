package com.gits.herokuapp.TestCases;
import com.gits.herokuapp.Configuration.BaseTest;
import com.gits.herokuapp.Pages.DragAndDrop;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class DragAndDropTest extends BaseTest {

    @Test
    public void dragAndDropTest() {
        LandingPage lp = new LandingPage(driver);
        DragAndDrop dd = new DragAndDrop(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println(Data.POSITIVE_MASSAGE);

        //DragAndDrop button validation
        if (lp.getDragAndDrop().isDisplayed())
        {
            String dragAndDrop = lp.getDragAndDrop().getText();
            Assert.assertEquals("Drag and Drop", dragAndDrop);
            System.out.println("DragAndDrop button is visible and clickable");
            sleepTime(1000);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDragAndDrop().click();

        //link Page URL Validation
        String DragAndDropLink = driver.getCurrentUrl();
        System.out.println("Given"+DragAndDropLink);
        Assert.assertEquals(DragAndDropLink, Data.BASE_URL+Data.DRAG_AND_DROP_LINK);
        System.out.println("Link is validate");
        sleepTime(1000);

        //Header Validation
        if (dd.getDragAndDropHeader().isDisplayed()) {
            String DragAndDropHeader = dd.getDragAndDropHeader().getText();
            Assert.assertTrue(true, DragAndDropHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        WebElement elementA = driver.findElement(By.cssSelector("div#column-a"));
        System.out.println(elementA.getAttribute("id"));
        WebElement elementB = driver.findElement(By.cssSelector("div#column-b"));
        int x=elementB.getLocation().getX();
        int y=elementB.getLocation().getY();

        Actions actions = new Actions(driver);
//		elementA.click();
        actions.dragAndDrop(elementA, elementB).build().perform();


        driver.navigate().back();
        sleepTime(3000);







    }

}
