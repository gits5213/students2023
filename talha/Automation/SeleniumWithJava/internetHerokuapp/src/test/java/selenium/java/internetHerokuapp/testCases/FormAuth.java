package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.FormAuthPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;
public class FormAuth extends BaseClass {
    @Test
    public void formAuth(){
        TheInternet ti = new TheInternet (driver);
        FormAuthPage fap =new FormAuthPage(driver);

        ti.getFormAuthentication().click();
        sleepTest(3000);

        //TC-1 HOME URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FORM_AUTHENTICATION_LINK);
        System.out.println("Link is validated");
        sleepTest(2000);

        //TC-2 Header1 Validation
        if( fap.getFormAuthLoginPageHeader1().isDisplayed()){
            String header1 =fap.getFormAuthLoginPageHeader1().getText() ;
            Assert.assertEquals(header1,Data.FORM_AUTHENTICATION_HEADER_1 );
            System.out.println("Header1 Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-3 Header2 Validation
        if( fap.getFormAuthLoginPageHeader2().isDisplayed()){
            String header2 =fap.getFormAuthLoginPageHeader2().getText() ;
            Assert.assertEquals(header2,Data.FORM_AUTHENTICATION_HEADER_2 );
            System.out.println("Header2 Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-4 Sending Values
        fap.getUserNameField().sendKeys(Data.FORM_AUTHENTICATION_USER_NAME);
        sleepTest(2000);
        fap.getPasswordField().sendKeys(Data.FORM_AUTHENTICATION_PASSWORD);
        sleepTest(2000);

        fap.getLogInButton().click();
        sleepTest(3000);

        //TC-5 Alert Text Validation
        String text = fap.getAlert().getText();
        System.out.println(text);
        sleepTest(3000);
        //Assert.assertEquals(text,Data.FORM_AUTHENTICATION_ALERT_TEXT);
        driver.navigate().to(Data.BASE_URL);
        sleepTest(4000);

    }
}
