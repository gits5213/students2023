package com.app.theInternetHerokuapp.tests.LoginPage;

import com.app.theInternetHerokuapp.pom.LoginValidationWithExcelDataPage;
import com.app.theInternetHerokuapp.tests.BaseTest;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

import org.testng.annotations.Test;

import java.io.IOException;


public class TestLoginValidationWithExcelData extends BaseTest {


    @Story("gits-5224-Login-Validation-With-ExcelData")
    @Description("Login-Validation-With-ExcelData")
    @Test
    public void LoginValidationWithExcelData() throws IOException {


        LoginValidationWithExcelDataPage loginValidationWithExcelDataPage = new LoginValidationWithExcelDataPage(driver);

        clickOnElement(landingPage.getFormAuthentication());
        excelToWebInput(loginValidationWithExcelDataPage.getUsername(), loginValidationWithExcelDataPage.getPassword(),
                loginValidationWithExcelDataPage.getLoginBtn(), loginValidationWithExcelDataPage.errorMessage(),TestData.LOGIN_EXCEL_FILEPATH);
    }
}