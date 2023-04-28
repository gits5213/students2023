package com.app.theInternetHerokuapp.tests.LoginPage;

import com.app.theInternetHerokuapp.pom.LoginPage;
import com.app.theInternetHerokuapp.pom.LoginValidationWithExcelDataPage;
import com.app.theInternetHerokuapp.tests.BaseTest;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestLoginValidationWithExcelData extends BaseTest {


    @Story("gits-5224-Login-Validation-With-ExcelData")
    @Description("Login-Validation-With-ExcelData")
    @Test
    public void LoginValidationWithExcelData() throws IOException {


        LoginValidationWithExcelDataPage loginValidationWithExcelDataPage = new LoginValidationWithExcelDataPage(driver);

        String filePath = "src/test/java/com/app/theInternetHerokuapp/testData/loginData.xlsx";
        clickOnElement(landingPage.getFormAuthentication());
        excelToWebInput(loginValidationWithExcelDataPage.getUsername(), loginValidationWithExcelDataPage.getPassword(),
                loginValidationWithExcelDataPage.getLoginBtn(), loginValidationWithExcelDataPage.errorMessage(),  filePath);
    }
    public  void excelToWebInput(WebElement input1, WebElement input2, WebElement logIn, WebElement message, String excelDirectory) throws IOException {

        FileInputStream inputStream = new FileInputStream(excelDirectory);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Get input fields
        List<WebElement> inputFields = new ArrayList<>();
        inputFields.add(input1);
        inputFields.add(input2);

        int lastRowNum = sheet.getLastRowNum();
        for (int i = 1; i <= lastRowNum; i++) {
            Row row = sheet.getRow(i);
//            System.out.println("Number of cells = " + lastRowNum);
            int lastCellIndex = sheet.getRow(0).getLastCellNum();;
//            System.out.println("Number of cells = " + lastCellIndex);
            for (int j = 0; j < lastCellIndex; j++) {
                Cell cell = row.getCell(j);
                String cellValue = cell.getStringCellValue();
                inputFields.get(j).sendKeys(cellValue);
                sleepTest(250);

            }
            clickOnElement(logIn);
            sleepTest(500);
            printText(message);
            if (Objects.equals(message.getText(), TestData.EXPECTED_LOGIN_SUCCESSFUL_MESSAGE)){
                driver.navigate().back();
                for(WebElement element : inputFields){
                    element.clear();
                    sleepTest(500);

                }
            }
            inputStream.close();
            workbook.close();
        }

    }

}