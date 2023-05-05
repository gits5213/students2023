package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.ForgotPasswordPage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class ForgotPassword extends BaseClass {
    @Test
    public void forgotPassword (){

        TheInternet ti =new TheInternet(driver);
        ForgotPasswordPage fpp= new ForgotPasswordPage(driver);

        ti.getForgotPassword().click();
        sleepTest(3000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FORGOT_PASSWORD_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        //TC-2 Header Validation
        if( fpp.getForgotPasswordHeader().isDisplayed()){
            String header =fpp.getForgotPasswordHeader().getText() ;
            Assert.assertEquals(header,Data.FORGOT_PASSWORD_HEADER );
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-3 Send DATA ON EMAIL FIELD
        //TC-4 Forgot Password
        fpp.getEmailField().sendKeys(Data.FORGOT_PASSWORD_PAGE_EMAIL);
        sleepTest(2000);
        fpp.getRetrievePasswordButton().click();
        sleepTest(2000);

        driver.navigate().back();
        sleepTest(3000);

    }
}
