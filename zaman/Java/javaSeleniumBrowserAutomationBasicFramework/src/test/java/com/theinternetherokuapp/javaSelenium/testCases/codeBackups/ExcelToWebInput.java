package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import com.sun.rowset.internal.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelToWebInput {

    public  void excelToWebInput(WebElement input1, WebElement input2, String excelDirectory) throws IOException {
        // Load Excel file
        String filePath = "excelDirectory";
        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

//        // Initialize WebDriver
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        // Navigate to web page
//        driver.get("http://www.example.com");

        // Get input fields
        List<WebElement> inputFields = new ArrayList<>();
        inputFields.add(input1);
        inputFields.add(input2);


//        int lastCellNum = sheet.getRow(0).getLastCellNum(); // Get number of columns
//        for (int i = 0; i < lastCellNum; i++) {
//            String inputId = "input" + (i + 1);
//            WebElement inputField = driver.findElement(By.id(inputId));
//            inputFields.add(inputField);
//        }

        // Read data from Excel and input into fields
        int lastRowNum = sheet.getLastRowNum(); // Get index of last row with data
        for (int i = 1; i <= lastRowNum; i++) { // Start at row 1 to skip header row
            Row row = sheet.getRow(i);
            int lastCellIndex = row.getLastCellNum() - 1; // Get index of last cell with data
            for (int j = 0; j <= lastCellIndex; j++) {
                Cell cell = row.getCell(j);
                String cellValue = cell.getStringCellValue(); // Get value of current cell
                inputFields.get(j).sendKeys(cellValue);
            }
        }

        // Close browser and Excel file
        driver.quit();
        inputStream.close();
        workbook.close();
    }


}
