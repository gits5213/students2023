package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.RedirectLinkPages;
import selenium.java.internetHerokuapp.pages.StatusCodePage;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class RedirectLink extends BaseClass {
    @Test
    public void redirectLink(){

        TheInternet ti =new TheInternet(driver);
        RedirectLinkPages rlp =new RedirectLinkPages(driver);
        StatusCodePage scp =new StatusCodePage(driver);

        sleepTest(2000);
        ti.getRedirectLink().click();
        sleepTest(2000);

        //TC-1 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.REDIRECT_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        //TC-2 Header1Text Validation
        if( rlp.getHeader1().isDisplayed()){
            String header1 =rlp.getHeader1().getText() ;
            Assert.assertEquals(header1,Data.REDIRECTION_PAGE_HEADER_1 );
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-3 URL Validation for status code 200
        rlp.getRedirectHere().click();
        sleepTest(2000);
        scp.getRedirect200().click();
        sleepTest(5000);
        String statusCode200link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode200link);
        Assert.assertEquals(statusCode200link, Data.BASE_URL+Data.STATUS_CODE_200_LINK);
        System.out.println("Status Code 200 Link is valid");
        sleepTest(2000);
        scp.getClickHareStatusCodePage().click();
        sleepTest(2000);


        //TC-4 URL Validation for status code 301
        scp.getRedirect301().click();
        sleepTest(5000);
        String statusCode301link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode301link);
        Assert.assertEquals(statusCode301link, Data.BASE_URL+Data.STATUS_CODE_301_LINK);
        System.out.println("Status Code 301 Link is valid");
        sleepTest(2000);
        scp.getClickHareStatusCodePage().click();
        sleepTest(2000);

        //TC-5 URL Validation for status code 404
        scp.getRedirect404().click();
        sleepTest(5000);
        String statusCode404link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode404link);
        Assert.assertEquals(statusCode404link, Data.BASE_URL+Data.STATUS_CODE_404_LINK);
        System.out.println("Status Code 404 Link is valid");
        sleepTest(2000);
        scp.getClickHareStatusCodePage().click();
        sleepTest(2000);


        //TC-6 URL Validation for status code 500
        scp.getRedirect500().click();
        sleepTest(5000);
        String statusCode500link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode500link);
        Assert.assertEquals(statusCode500link, Data.BASE_URL+Data.STATUS_CODE_500_LINK);
        System.out.println("Status Code 500 Link is valid");
        sleepTest(2000);
        scp.getClickHareStatusCodePage().click();
        sleepTest(2000);


        driver.navigate().to(Data.BASE_URL);
        sleepTest(3000);


    }
}
