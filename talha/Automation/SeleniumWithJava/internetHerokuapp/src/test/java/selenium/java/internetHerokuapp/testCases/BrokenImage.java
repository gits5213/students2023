package selenium.java.internetHerokuapp.testCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.BrokenImagePage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

import java.util.List;


public class BrokenImage extends BaseClass {

    @Test
    public void brokenImage(){

        TheInternet ti = new TheInternet(driver);
        BrokenImagePage bip = new BrokenImagePage (driver);

        ti.getBrokenImage().click();
        sleepTest(2000);


        //TC-1 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.BROKEN_IMAGE_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);


        //TC-2 : Header Validation
        if(bip. getHeader1().isDisplayed()){
            String header =bip.getHeader1().getText() ;
            Assert.assertEquals(header, Data.BROKEN_IMAGE_HEADER);
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(3000);


        // TC-3 : Broken Image Validation Including (Http response , Broken Image Link)
        List<WebElement> elementList = driver.findElements(By.tagName("img"));
        for (int i = 0; i < elementList.size(); i++){

           Response response = RestAssured.given().contentType("application/json")
                    .get(elementList.get(i).getAttribute("src"));

            System.out.println("HTTP Response Is: " + response.getStatusCode());

            if ( elementList.get(i).getAttribute("naturalWidth").equals("0")){
                System.out.println( elementList.get(i).getAttribute("src") + " Is Broken." );
            }

            else{
                System.out.println( elementList.get(i).getAttribute("src") + " Is Not Broken." );
            }
        }

        driver.navigate().to(Data.BASE_URL);
        sleepTest(2000);


    }
}
