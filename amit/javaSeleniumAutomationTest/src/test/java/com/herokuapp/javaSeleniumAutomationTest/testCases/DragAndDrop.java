package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Drag_And_Drop;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass {

    @Test
    public void dragAndDrop() throws InterruptedException {

        Internet ti = new Internet(driver);
        Drag_And_Drop dap = new Drag_And_Drop(driver);

        //BasicAuth Text validation in Base page
        boolean displayed = ti.getDragAndDrop().isDisplayed();
        if (displayed) {
            String dragAndDropText = ti.getDragAndDrop().getText();
            Assert.assertTrue(dragAndDropText != null && !dragAndDropText.isEmpty());
            ti.getDragAndDrop().click();
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }

        //Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println(link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DRAG_AND_DROP_LINK);
        System.out.println("Link is Valid");

        //Header Validation
        boolean b = dap.getDragAndDropHeaderText().isDisplayed();
        if (b) {
            String dragAndDropHeaderText = dap.getDragAndDropHeaderText().getText();
            Assert.assertTrue(dragAndDropHeaderText != null && !dragAndDropHeaderText.isEmpty());
            Thread.sleep(1000);
        } else if (!(b)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        } else {
            System.out.println("Unexpected condition!");
        }
        
        //Mouse Hover Validation
        WebElement from = driver.findElement(By.xpath("/html//div[@id='column-a']"));
        WebElement to = driver.findElement(By.xpath("/html//div[@id='column-b']"));

        //Activity Doesn't Working properly Drag And Drop
        Actions act=new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

    }
}
