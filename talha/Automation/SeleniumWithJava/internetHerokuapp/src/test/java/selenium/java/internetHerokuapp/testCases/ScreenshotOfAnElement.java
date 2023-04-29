package selenium.java.internetHerokuapp.testCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotOfAnElement extends BaseClass {
    @Test
    public void screenshotOfAnElement() throws IOException {

        //Taking Specific web Element Screen Shoot
        WebElement ele = driver.findElement(By.xpath("/html//a[@href='https://github.com/tourdedave/the-internet']/img[@alt='Fork me on GitHub']"));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        Point point = ele.getLocation();

        // Get width and height of the element
        int eleWidth = ele.getSize().getWidth();
        int eleHeight = ele.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
                eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        // Copy the element screenshot to disk
        File screenshotLocation = new File("G:\\Talha\\SQA\\Github\\sqabdautomation\\Java\\Talha\\swaglabs\\Images\\Screenshot1.png");
        FileUtils.copyFile(screenshot, screenshotLocation);

    }

}
