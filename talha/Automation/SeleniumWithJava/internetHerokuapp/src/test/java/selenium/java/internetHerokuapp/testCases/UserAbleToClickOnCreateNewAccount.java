package selenium.java.internetHerokuapp.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;

import selenium.java.internetHerokuapp.pages.LogInSignUp;
import selenium.java.internetHerokuapp.utilities.Data;

public class UserAbleToClickOnCreateNewAccount extends BaseClass {

    @Test
    public  void  userAbleToClickOnCreateNewAccount ()  {

        LogInSignUp lisp = new LogInSignUp(driver);
        if ( lisp.getCreateNewAccount().isDisplayed()){
            String createNewAccountText =lisp.getCreateNewAccount().getText();
            Assert.assertEquals(Data.CREATE_NEW_ACCOUNT,createNewAccountText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lisp.getCreateNewAccount().click();
        sleepTest(2000);

    }
}
