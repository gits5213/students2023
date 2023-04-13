package com.gits.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthentication {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a")).click();
        Thread.sleep(1000);


        driver.close();
        driver.quit();


    }
}
