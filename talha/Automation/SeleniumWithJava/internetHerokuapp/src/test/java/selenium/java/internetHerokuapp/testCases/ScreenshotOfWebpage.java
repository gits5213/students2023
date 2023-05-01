package selenium.java.internetHerokuapp.testCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;

import selenium.java.internetHerokuapp.utilities.Data;

import java.io.File;
import java.io.IOException;

public class ScreenshotOfWebpage extends BaseClass {

    @Test
    public void screenshotOfWebpage() throws IOException {

        //Tc-1  Taking Screenshot Full page
        driver.get(Data.BASE_URL + Data.HORIZONTAL_SLIDER_LINK);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("G:\\Talha\\SQA\\Github\\sqabdautomation\\Java\\Talha\\swaglabs\\Images\\Screenshot.png"));
    }
}
