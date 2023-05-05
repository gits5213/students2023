package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
        this.inItPage();
    }

    public void inItPage(){
        PageFactory.initElements(driver, this);
    }

}
