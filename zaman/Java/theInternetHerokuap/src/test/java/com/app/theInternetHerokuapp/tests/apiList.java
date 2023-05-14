package com.app.theInternetHerokuapp.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class apiList {

    public static void main(String[] args) {

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page
        driver.get("https://www.amazon.com/");

//        // Execute JavaScript code to get network requests
//        List<Object> requests = (List<Object>) ((JavascriptExecutor) driver).executeScript(
//                "var performance = window.performance || window.webkitPerformance || window.mozPerformance || window.msPerformance || {};\n" +
//                        "var network = performance.getEntries() || [];\n" +
//                        "return network;");
//
//        // Iterate through network requests and print name and response time
//        for (Object request : requests) {
//            String name = ((JavascriptExecutor) driver).executeScript("return arguments[0].name;", request).toString();
//            double responseTime = Double.parseDouble(((JavascriptExecutor) driver).executeScript(
//                    "return arguments[0].responseEnd - arguments[0].responseStart;", request).toString());
//            System.out.printf("%s >>> %.2f ms\n", name, responseTime);
//            System.out.println();
//        }

        // Execute JavaScript code to get network requests
        List<Object> requests = (List<Object>) ((JavascriptExecutor) driver).executeScript(
                "var performance = window.performance || window.webkitPerformance || window.mozPerformance || window.msPerformance || {};\n" +
                        "var network = performance.getEntries() || [];\n" +
                        "return network;");

        // Iterate through network requests and print HTTP method, request URL, and response time
        for (Object request : requests) {
            String url = ((JavascriptExecutor) driver).executeScript("return arguments[0].name;", request).toString();
            String method = ((JavascriptExecutor) driver).executeScript("return arguments[0].nextHopProtocol;", request).toString().split("/")[0];
            double responseTime = Double.parseDouble(((JavascriptExecutor) driver).executeScript(
                    "return arguments[0].responseEnd - arguments[0].responseStart;", request).toString());
            System.out.printf("%s >>> %s >>> %.2f ms\n", method, url, responseTime);
        }

        // Quit the driver
        driver.quit();

        // Quit the driver
        driver.quit();
    }
}
