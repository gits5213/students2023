package com.gits.internetherokuapp.TestCases.FormAuthenticationValidation;
import com.gits.internetherokuapp.TestPages.FormAuthentication;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPasswordValidation extends BaseTest {
    @Test
    public void formAuthentication(){

        LandingPage lp = new LandingPage(driver);
        FormAuthentication fap = new FormAuthentication(driver);

        lp.getFormAuthentication().click();
        sleepTime(1000);

        //Home URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FORM_AUTHENTICATION_LINK);
        System.out.println("Link is Valid");
        sleepTime(1000);

        //Header Validation
        if (fap.getFormAuthenticationHeader().isDisplayed()){
            String header1 = fap.getFormAuthenticationHeader().getText();
            Assert.assertEquals(header1,Data.FORM_AUTHENTICATION_HEADER1);
            System.out.println("Header1 Text is Valid");
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Paragraph Validation
        if (fap.getFormAuthenticationPara().isDisplayed()){
            String header2 = fap.getFormAuthenticationPara().getText();
            Assert.assertEquals(header2,Data.FORM_AUTHENTICATION_HEADER2);
            System.out.println("Paragraph Text Is Valid");
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Sending Values
        fap.getUsernameField().sendKeys(Data.FORM_AUTHENTICATION_USER_NAME);
        sleepTime(1000);

        fap.getPasswordInputField().sendKeys(Data.FORM_AUTHENTICATION_PASSWORD);
        sleepTime(1000);

        fap.getLoginButton().click();
         sleepTime(2000);

        //login button valid massage
        WebElement invalidMassage = driver.findElement(By.cssSelector("#flash"));
        String actualLoginMassageText = invalidMassage.getText();
        String expectedLoginMassageText = "Your username is invalid!\n"+"×";
        Assert.assertEquals(actualLoginMassageText, expectedLoginMassageText);



        //Alert Text Validation
        String text = fap.getAlert().getText();
        System.out.println(text);
        sleepTime(2000);


    }

}


