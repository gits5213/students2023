package com.herokuapp.javaSeleniumAutomationTest.basicJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    //Method
    public BasePage(WebDriver driver){
        this.driver =driver; // calling constructor as a global declaration.
        this.inItPage();// Also called the below methode ,because we use the constructor other pages
    }
    public void inItPage() {
        PageFactory.initElements(driver,this);
    }
}
