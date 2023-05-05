package com.app.theInternetHerokuapp.utilities;

import com.app.theInternetHerokuapp.tests.BaseTest;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderForTests extends BaseTest {

    @DataProvider
    public static Object[][] loginData() throws IOException {

        FileInputStream inputStream = new FileInputStream(TestData.LOGIN_EXCEL_FILEPATH);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int lastRowNum = sheet.getLastRowNum();
        int lastCellIndex = sheet.getRow(0).getLastCellNum();;
        String[][] loginData = new String[lastRowNum][lastCellIndex];

        for (int i = 1; i <= lastRowNum; i++) { // first loop for row iteration
            Row row = sheet.getRow(i);
            for (int j = 0; j < lastCellIndex; j++) { //first loop for column iteration
                Cell cell = row.getCell(j);
                loginData[i-1][j] = cell.getStringCellValue();
            }
        }
        inputStream.close();
        workbook.close();
        return loginData;
    }
}
