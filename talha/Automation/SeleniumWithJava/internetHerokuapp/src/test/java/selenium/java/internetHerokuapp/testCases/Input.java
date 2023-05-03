package selenium.java.internetHerokuapp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.InputsPages;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;
public class Input extends BaseClass {
    @Test

    public void input(){

        TheInternet ti =new TheInternet(driver);
        InputsPages ip =new InputsPages(driver);

        ti.getInput().click();
        sleepTest(2000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.INPUT_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        //TC-2 Entering values
        ip.getInputField().sendKeys("15552588158");
        sleepTest(2000);
        ip.getInputField().clear();
        sleepTest(2000);

        driver.navigate().to(Data.BASE_URL);
        sleepTest(2000);







    }
}
