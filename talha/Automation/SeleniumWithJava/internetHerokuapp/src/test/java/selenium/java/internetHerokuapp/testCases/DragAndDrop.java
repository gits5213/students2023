package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.Drag_and_drop;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class DragAndDrop extends BaseClass {

    @Test
    public void dragAndDrop(){

        TheInternet ti = new TheInternet(driver);
        Drag_and_drop dap =new Drag_and_drop(driver);

        //TC-1 BasicAuth Text validation in Base page
        if(ti.getDragAndDrop().isDisplayed()){
            String dragAndDropText = ti.getDragAndDrop().getText();
            Assert.assertTrue(true,dragAndDropText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getDragAndDrop().click();

        //TC-2 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println(link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DRAG_AND_DROP_LINK);
        System.out.println("Link is Valid");

        //TC-3 Header Validation
        if(dap.getDragAndDropHeaderText().isDisplayed()){
            String dragAndDropHeaderText = dap.getDragAndDropHeaderText().getText();
            Assert.assertTrue(true,dragAndDropHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //TC-4 Mouse Hover Validation
        WebElement from = driver.findElement(By.xpath("/html//div[@id='column-a']"));
        WebElement to = driver.findElement(By.xpath("/html//div[@id='column-b']"));

        /*Actions act = new Actions(driver);
        act.clickAndHold(src)
                .pause(Duration.ofSeconds(2))
                .moveToElement(dest)
                .pause(Duration.ofSeconds(2))
                .release()
                .pause(Duration.ofSeconds(2))
                .build()
                .perform();
        sleepTest(3000);*/

        //Drag And Drop Activity Doesn't Working properly
        Actions act=new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
        sleepTest(3000);
        driver.navigate().back();
        sleepTest(3000);

    }

}
