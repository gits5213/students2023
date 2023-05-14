package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileCheaker {



    public void checkFiles(List<WebElement> elements, String fileDirectory) {

        String[] webFileList = new String[elements.size()];

        for (int i = 0; i < elements.size(); i++) {
            webFileList[i] = elements.get(i).getText();
        }

        File folder = new File(fileDirectory);
        File[] allFiles = folder.listFiles();
        int fileCounter = 1;

        Assert.assertNotNull(allFiles);
        for (File file : allFiles) {
            if (Arrays.asList(webFileList).contains(file.getName())) {
                System.out.println(fileCounter++ + " File : " + file.getName() + " ------- Has Been Downloaded.");
            }
        }

//        Assert.assertNotNull(allFiles);
//        for (String webFilename : webFileList) {
//
//            for (File file: allFiles){
//                if (file.getName().equals(webFilename)) {
//                    System.out.println(fileCounter++ + " File : " + webFilename + " ------- Has Been Downloaded.");
//                    break;
//                }
//            }
//        }
    }

}
