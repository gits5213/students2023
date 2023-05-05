package selenium.java.internetHerokuapp.testCases;


import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import selenium.java.internetHerokuapp.configurations.BaseClass;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class FullPageScreenShot extends BaseClass {

    @Test
    public void fullPageScreenShot() throws InterruptedException, IOException {

        //Modify the path of the GeckoDriver in the below step based on your local system path
     //   System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
        // Instantiation of driver object. To launch Firefox browser
      //  WebDriver driver = new FirefoxDriver();
        // To oepn URL "http://softwaretestingmaterial.com"
       // driver.get("https://www.softwaretestingmaterial.com");

        Thread.sleep(2000);
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(fpScreenshot.getImage(),"PNG",new File("G:\\Talha\\SQA\\Github\\sqabdautomation\\Java\\Talha\\swaglabs\\Images\\Screenshot12.png"));
    }
}
