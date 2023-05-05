package selenium.java.internetHerokuapp.testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.HoverPages;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class MouseHover extends BaseClass {
    @Test
    public void mouseHover(){

        TheInternet ti = new TheInternet(driver);
        HoverPages hp = new HoverPages(driver);

        ti.getHover().click();


        //TC-1 HOME URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.MOUSE_HOVER_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        //TC-2 Mouse Hover Validation
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(hp.getImageOne()).perform();
        sleepTest(2000);

        String userNameOne = hp.getNameUserOne().getText();
        System.out.println( userNameOne );

        String profileViewOne = hp.getViewProfileOne().getText();
        System.out.println( profileViewOne );
        System.out.println(" ");


        Actions actionTwo = new Actions(driver);
        actionTwo.moveToElement(hp.getImageTwo()).perform();
        sleepTest(2000);

        String userNameTwo = hp.getNameUserTwo().getText();
        System.out.println( userNameTwo );
        sleepTest(2000);

        String profileViewTwo = hp.getViewProfileTwo().getText();
        System.out.println( profileViewTwo );
        sleepTest(2000);
        System.out.println(" ");


        Actions actionThree = new Actions(driver);
        actionThree.moveToElement(hp.getImageThree()).perform();
        sleepTest(2000);

        String userNameThree = hp.getNameUserThree().getText();
        System.out.println( userNameThree );
        sleepTest(2000);

        String profileViewThree = hp.getViewProfileThree().getText();
        System.out.println( profileViewThree );
        sleepTest(2000);
        System.out.println(" ");

        driver.navigate().back();
        sleepTest(2000);

    }

}
