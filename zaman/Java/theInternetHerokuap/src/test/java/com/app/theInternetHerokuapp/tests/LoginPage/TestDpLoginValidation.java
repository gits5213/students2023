package com.app.theInternetHerokuapp.tests.LoginPage;

import com.app.theInternetHerokuapp.pom.LoginValidationWithExcelDataPage;
import com.app.theInternetHerokuapp.tests.BaseTest;
import com.app.theInternetHerokuapp.utilities.DataProviderForTests;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestDpLoginValidation extends BaseTest {



    @Story("gits-5225-DP-Login-Validation-With-ExcelData")
    @Description("DP-Login-Validation-With-ExcelData")
    @Test(dataProvider = "loginData", dataProviderClass = DataProviderForTests.class)
    public void dpLoginValidation(String username, String password, String validation) throws IOException {

        LoginValidationWithExcelDataPage lv = new LoginValidationWithExcelDataPage(driver);

        clickOnElement(landingPage.getFormAuthentication());
        typeText(lv.getUsername(),username);
        typeText(lv.getPassword(),password);
        clickOnElement(lv.getLoginBtn());

        if (validation.equals("valid")){

            if (lv.message().getText().equals(TestData.EXPECTED_LOGIN_SUCCESSFUL_MESSAGE)){

                System.out.println("Successful Login!!");
                Assert.assertTrue(true);
            }
        }
        else if (validation.equals("invalid")){

            if (lv.message().getText().equals(TestData.EXPECTED_LOGIN_ERROR_MESSAGE_USERNAME)){

                System.out.println("Unsuccessful Login!!\nWrong username!!!");
                Assert.fail();
            }
            else if (lv.message().getText().equals(TestData.EXPECTED_LOGIN_ERROR_MESSAGE_PASSWORD)){

                System.out.println("Unsuccessful Login!!\nWrong Password!!!");
                Assert.fail();
            }
        }
    }
}
