package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;

public class ScrollInACertainSpace extends BaseClass {

    @Test
    public void scrollInACertainSpace (){


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
    }
}
