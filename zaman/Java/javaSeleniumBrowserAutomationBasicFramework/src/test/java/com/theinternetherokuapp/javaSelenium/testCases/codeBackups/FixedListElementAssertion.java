package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class FixedListElementAssertion {

    //Fixed list values
    String[] expectedValues = {"Value1", "Value2", "Value3"};

    public void assertFixedDropdownValues(WebDriver driver, By dropdownLocator, String[] expectedValues) {
        List<WebElement> dropdownList = driver.findElements(dropdownLocator);
        List<String> dropdownTexts = new ArrayList<>();
        for (WebElement element : dropdownList) {
            dropdownTexts.add(element.getText());
        }
        for (String expectedValue : expectedValues) {
            Assert.assertTrue(dropdownTexts.contains(expectedValue), "Dropdown value '" + expectedValue + "' is not found");
        }
        for (String text : dropdownTexts) {
            System.out.println("Dropdown value: " + text);
        }
    }
}
