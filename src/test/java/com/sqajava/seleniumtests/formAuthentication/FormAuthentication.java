package com.sqajava.seleniumtests.formAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthentication {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("its running");


        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        //driver.wait(500);
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(21) > a)")).click();
        //driver.wait(500);
        //driver.close();
        //driver.quit();
    }
}
