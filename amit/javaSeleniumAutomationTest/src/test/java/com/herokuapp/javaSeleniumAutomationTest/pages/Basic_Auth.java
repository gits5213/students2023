package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basic_Auth extends BasePage {
    public Basic_Auth(WebDriver driver) {
        super(driver);
    }
    //WebElement header1 = driver.findElement(By.xpath("//div[@id='content']//h3[.='Basic Auth']"));
    @FindBy(xpath= "//div[@id='content']//h3[.='Basic Auth']")
    public WebElement basicAuthHeader1;
    public WebElement getBasicAuthHeader1(){
        return basicAuthHeader1;
    }

    //WebElement paragraph1 = driver.findElement(By.xpath("//div[@id='content']//p"));
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement basicAuthParagraph1;
    public WebElement getBasicAuthParagraph1(){
        return basicAuthParagraph1;
    }

}
