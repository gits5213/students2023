package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Frames.FramesPages;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframes extends BaseClass {
    @Test
    public void iframe() throws InterruptedException {
        Internet ti = new Internet(driver);
        FramesPages fp = new FramesPages(driver);

        Thread.sleep(1000);
        ti.getFrames().click();

        //TestCase -01 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FRAMES_LINK);
        System.out.println("Link is valid");

        Thread.sleep(1000);
        fp.getIframe().click();
        Thread.sleep(1000);

        driver.switchTo().frame("mce_0_ifr");
        WebElement txt= driver.findElement(By.xpath("/html//body[@id='tinymce']"));
        txt.clear();
        Thread.sleep(1000);
        txt.sendKeys(Data.INPUT_TEXT);
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.navigate().to(Data.BASE_URL);
        Thread.sleep(1000);
    }
}
