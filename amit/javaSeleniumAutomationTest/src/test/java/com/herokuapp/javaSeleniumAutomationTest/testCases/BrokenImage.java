package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.pages.Broken_Images;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class BrokenImage extends BaseClass {
    private Object RestAssured;

    @Test
    public void brokenImage() throws InterruptedException {

        Internet ti = new Internet(driver);
        Broken_Images bi = new Broken_Images (driver);

        ti.getBrokenImage().click();
        Thread.sleep(1000);


        //TestCase-1 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.BROKEN_IMAGE_LINK);
        System.out.println("Link is valid");
        Thread.sleep(1000);


        //TestCase-2 : Header Validation
        boolean displayed = bi.getHeader1().isDisplayed();
        if (displayed) {
            String header = bi.getHeader1().getText();
            Assert.assertEquals(header, Data.BROKEN_IMAGE_HEADER);
            System.out.println("Header Text is valid");
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        Thread.sleep(1000);



        // TestCase-3 : Broken Image Validation Including (Http response , Broken Image Link)
        List<WebElement> elementList = driver.findElements(By.tagName("img"));

        elementList.forEach(element -> {
            Response response = io.restassured.RestAssured.given()
                    .contentType("application/json")
                    .get(element.getAttribute("src"));
            int statusCode = response.getStatusCode();
            String src = element.getAttribute("src");
            String message = (element.getAttribute("naturalWidth").equals("0"))
                    ? src + " Is Broken."
                    : src + " Is Not Broken.";
            System.out.println("HTTP Response for " + src + " Is: " + statusCode);
            System.out.println(message);
        });


        driver.navigate().to(Data.BASE_URL);
        Thread.sleep(1000);
        driver.close();
        driver.quit();


    }
}
