package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FileDownloaderPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class TestFileDownloader extends BaseTest{



    @Story("gits-5229-File-Downloader")
    @Description("File-Downloader")
    @Test
    public void fileDownloader(){

        FileDownloaderPage fdp = new FileDownloaderPage(driver);
        clickOnElement(landingPage.getFileDownloader());

        System.out.println("Total file = " + fdp.getFileList().size());

        for (WebElement element: fdp.getFileList()) {
            element.click();
        }
        sleepTest(10000);
        checkFiles(fdp.getFileList(),TestData.FILE_DOWNLOAD_PATH);

    }

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
    }
}

