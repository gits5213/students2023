package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Dynamic_Content;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class DynamicContent extends BaseClass {
    @Test
    public void dynamicContent() throws InterruptedException {

        // BaseClass
        Internet ti = new Internet(driver);
        Dynamic_Content dc = new Dynamic_Content(driver);

        //TestCase -01 Home Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given"+baseLink);
        Assert.assertEquals(baseLink,Data.BASE_URL);
        System.out.println("Home URL is Valid");
        Thread.sleep(1000);

        // TestCase -02 Header Validation
        boolean displayed = ti.getDynamicContent().isDisplayed();
        if (displayed) {
            String dynamicContentText = ti.getDynamicContent().getText();
            Assert.assertTrue(true, dynamicContentText);
            System.out.println("Header is valid");
            ti.getDynamicContent().click();
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TestCase -04 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given" +link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DYNAMIC_CONTENT_LINK);
        System.out.println("Link is Validation");
        Thread.sleep(2000);

        dc.getClick().click();
        Thread.sleep(5000);

        //TestCase- 03 Dynamic Content-Row count
        List <WebElement> row = driver.findElements(By.className("row"));
        int numberOfRows = row.size();
        System.out.println("Total rows : " + numberOfRows);

        String beforeXpath = "/html//div[@id='content']/div/div[@class='row']/div[@id='content']/div[";
        String afterXpath = "]";

        driver.navigate().back();
        sleepTest(1000);
    }
}
