package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FileUploadRobotClass {

    public void uploadFileWithCoordinate(String filePath, WebElement dropArea) throws AWTException, InterruptedException {
        // Click on the drop area to make it active
        dropArea.click();

        // Get the location of the drop area element
        Point location = dropArea.getLocation();
        int x = location.getX();
        int y = location.getY();

        // Create a Robot instance
        Robot robot = new Robot();

        // Move the mouse pointer to the drop area element
        robot.mouseMove(x, y);

        // Simulate pressing the left mouse button
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        // Wait for a second for the drag and drop operation to start
        Thread.sleep(1000);

        // Simulate dragging the file to the drop area element
        robot.setAutoDelay(500);
        StringSelection selection = new StringSelection(filePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.setAutoDelay(500);

        // Simulate releasing the left mouse button to drop the file
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void uploadFile(WebDriver driver, By by, String filePath) throws AWTException, InterruptedException {
        driver.findElement(by).click(); // Click on the upload button to trigger the file upload dialog

        // Create a new StringSelection object with the file path
        StringSelection stringSelection = new StringSelection(filePath);

        // Copy the file path to the clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Use Robot class to simulate keyboard events to navigate and perform file upload
        Robot robot = new Robot();

        // Press Enter to focus on the file upload dialog
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000); // Sleep for a short duration to allow the file upload dialog to fully load

        // Press Ctrl+V to paste the file path from the clipboard
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(1000); // Sleep for a short duration to allow the file path to be pasted

        // Press Enter to perform the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000); // Sleep for a short duration to allow the file upload to complete
    }
}
