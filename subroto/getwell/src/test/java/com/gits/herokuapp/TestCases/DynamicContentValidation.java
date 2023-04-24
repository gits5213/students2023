package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.DynamicContentPages;
import com.gits.herokuapp.Pages.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicContentValidation extends BaseClass {
    @Test
    public void dynamicContentValidation(){

        LandingPage lp = new LandingPage(driver);
        DynamicContentPages dcp =new DynamicContentPages(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTime(2000);

        //Home URL Header Validation
        if(lp.getDynamicContent().isDisplayed()){
            String dynamicContentText = lp.getDynamicContent().getText();
            Assert.assertTrue(true,dynamicContentText);
            System.out.println("Header is valid");

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lp.getDynamicContent().click();

        // URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DYNAMIC_CONTENT_LINK);
        System.out.println("Link is validate");
        sleepTime(2000);

        //Click here button
        dcp.getDynamicContentClick().click();
        sleepTime(2000);

        //Row count
        List<WebElement> row = driver.findElements(By.className("row"));
        int numberOfRows = row.size();
        System.out.println("Total rows : " + numberOfRows);

        String beforeXpath = "/html//div[@id='content']/div/div[@class='row']/div[@id='content']/div[";
        String afterXpath = "]";

        driver.navigate().back();
        sleepTime(1000);
        // //*[@id="content"]/div[1]/div[1]
        ///html//div[@id='content']/div/div[@class='row']/div[@id='content']/div[1]/div[2]
    }
}
