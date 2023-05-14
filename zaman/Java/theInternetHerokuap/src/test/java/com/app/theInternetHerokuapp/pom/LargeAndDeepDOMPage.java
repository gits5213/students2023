package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LargeAndDeepDOMPage extends BasePage{

    public LargeAndDeepDOMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#siblings div")
    public List<WebElement> siblings;
    public List<WebElement> getSiblings() {
        return siblings;
    }

    @FindBy(css = "tr > th:nth-of-type(n)")
    public List<WebElement> tableRow;
    public List<WebElement> getTableRow() {
        return tableRow;
    }

    @FindBy(css = "tr >td")
    public List<WebElement> tableData;
    public List<WebElement> getTableData() {
        return tableData;
    }
}
