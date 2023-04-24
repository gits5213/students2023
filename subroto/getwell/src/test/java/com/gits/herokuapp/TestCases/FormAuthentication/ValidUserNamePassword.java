package com.gits.herokuapp.TestCases.FormAuthentication;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.FormAuthenticationValidate;
import com.gits.herokuapp.Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidUserNamePassword extends BaseClass {

    @Test
    public void validUserNamePassword(){
        LandingPage lp = new LandingPage(driver);
        FormAuthenticationValidate fav = new FormAuthenticationValidate(driver);


        //click on form authentication link
        lp.getFormAuthentication().click();
        sleepTime(1000);

        //enter valid username
        fav.getUserName().sendKeys("tomsmith");
        sleepTime(1000);

        //enter valid password
        fav.getPassword().sendKeys("SuperSecretPassword!");
        sleepTime(1000);

        //click on login button
        fav.getLoginClick().click();
        sleepTime(1000);

        //validate login secure area massage
        WebElement secureMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginSecureMassage = secureMassage.getText();
        String expectedLoginSecureMassage = "You logged into a secure area!\n"+"×";
        Assert.assertEquals(actualLoginSecureMassage ,expectedLoginSecureMassage);

    }

}
