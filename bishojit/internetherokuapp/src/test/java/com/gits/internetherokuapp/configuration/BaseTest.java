package com.gits.internetherokuapp.configuration;
import com.gits.internetherokuapp.Utilities.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(Data.BASE_URL);
        sleepTime(1000);

    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("method is passing");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();


    }

    public static void sleepTime(long sleepTime){
        try {Thread.sleep(sleepTime);
        }catch (Exception e){

        }
    }
}
