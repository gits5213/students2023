package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.FileUploaderPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class TestFileUploader extends BaseTest{



    @Story("gits-5230-File-Uploader")
    @Description("File-Uploader-Method-One")
    @Test(priority = 1)
    public void fileUploaderMethodOne() throws InterruptedException, AWTException {

        FileUploaderPage fup = new FileUploaderPage(driver);
        Actions actions = new Actions(driver);
        File file = new File(TestData.FILE_UPLOAD_PATH);

        //Method One
        clickOnElement(landingPage.getFileUploader());
        actions.moveToElement(fup.getChooseFileBtn(), 10,10).click().build().perform();
        uploadFile(TestData.FILE_UPLOAD_PATH);
        clickOnElement(fup.getUploadBtn());
        assertText(fup.getFileUploadMessage(), TestData.FILE_UPLOAD_SUCCESSFUL_MESSAGE) ;
        Assert.assertEquals(fup.getUploadedFileName().getText(), file.getName());
        sleepTest(2000);
    }



    @Story("gits-5230-File-Uploader")
    @Description("File-Uploader-Method-Two")
    @Test(priority = 2)
    public void fileUploaderMethodTwo() throws InterruptedException, AWTException {

        FileUploaderPage fup = new FileUploaderPage(driver);
        File file = new File(TestData.FILE_UPLOAD_PATH);

        //Method Two
        clickOnElement(landingPage.getFileUploader());
        uploadFileWithCoordinate(TestData.FILE_UPLOAD_PATH,fup.getDragAndDropArea(),200);
        sleepTest(2000);
        clickOnElement(fup.getUploadBtn());
        assertText(fup.getFileUploadMessage(), TestData.FILE_UPLOAD_SUCCESSFUL_MESSAGE) ;
        Assert.assertEquals(fup.getUploadedFileName().getText(), file.getName());
        sleepTest(5000);
    }
}
