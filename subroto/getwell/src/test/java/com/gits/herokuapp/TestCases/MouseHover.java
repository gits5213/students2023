 package com.gits.herokuapp.TestCases;

import com.gits.herokuapp.Configuaration.BaseClass;
import com.gits.herokuapp.Pages.HoverPages;
import com.gits.herokuapp.LandingPageConfiguaration.LandingPage;
import com.gits.herokuapp.Utilites.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseHover extends BaseClass {
    @Test
    public void mouseHover(){

        LandingPage lp = new LandingPage(driver);
        HoverPages hp = new HoverPages(driver);

        lp.getMouseHover().click();
        sleepTime(1000);

        //HOME URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.MOUSE_HOVER_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        //Mouse Hover Validation
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(hp.getImageOne()).perform();
        sleepTime(2000);

//        actionOne.moveToElement(hp.getImageOne());
//        actionOne.build();
//        actionOne.perform();

//        String userNameOne = hp.getNameUserOne().getText();
//        System.out.println(userNameOne);
//
//        String profileViewOne = hp.getViewProfileOne().getText();
//        System.out.println(profileViewOne);
//        sleepTime(2000);
//        System.out.println(" ");


        Actions actionTwo = new Actions(driver);
        actionTwo.moveToElement(hp.getImageTwo()).perform();
        sleepTime(1000);

//        actionTwo.moveToElement(hp.getImageTwo());
//        actionTwo.build();
//        actionTwo.perform();
//        sleepTime(2000);

//        String userNameTwo = hp.getNameUserTwo().getText();
//        System.out.println(userNameTwo);
//        sleepTime(2000);
//
//        String profileViewTwo = hp.getViewProfileTwo().getText();
//        System.out.println(profileViewTwo);
//        sleepTime(2000);
//        System.out.println(" ");


        Actions actionThree = new Actions(driver);
        actionThree.moveToElement(hp.getImageThree()).perform();
        sleepTime(2000);
//        actionThree.moveToElement(hp.getImageThree());
//        actionThree.build();
//        actionThree.perform();
//        sleepTime(2000);

//        String userNameThree = hp.getNameUserThree().getText();
//        System.out.println(userNameThree);
//        sleepTime(2000);
//
//        String profileViewThree = hp.getViewProfileThree().getText();
//        System.out.println(profileViewThree);
//        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);

    }

}
