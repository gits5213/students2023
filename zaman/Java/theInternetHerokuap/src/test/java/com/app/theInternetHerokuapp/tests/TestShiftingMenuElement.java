package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.ShiftingContentPage;
import com.app.theInternetHerokuapp.pom.ShiftingMenuElementPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestShiftingMenuElement extends BaseTest {


    @Story("gits-5248-Shifting-Menu-Element")
    @Description("Shifting-Menu-Element")
    @Test()
    public void shiftingMenuElement() {

        ShiftingContentPage sc = new ShiftingContentPage(driver);
        ShiftingMenuElementPage mp = new ShiftingMenuElementPage(driver);

        clickOnElement(landingPage.getShiftingContent());
        clickOnElement(sc.getMenuElementBtn());
//        navigateTo("https://the-internet.herokuapp.com/shifting_content/menu");
        clickOnElement(mp.getPx100ShiftBtn());

        for (int i = 0; i < 10; i++) {

            for (WebElement element : mp.getMenuButtons()) {

                if (element.getCssValue("left").equals("0px") || element.getCssValue("left").equals("auto")) {
                    System.out.println(element.getText() + " is unsifted element, its position >>> " + element.getCssValue("left"));
                    softAssert.assertTrue(true);
                } else {
                    System.err.println("Shifted element is >>> " + element.getText() + ", shifted by >>> " + element.getCssValue("left"));
                    softAssert.assertTrue(element.getCssValue("left").equals("0px"), "Shifted element is >>> " + element.getText());
                }
            }
            reload();
        }
        softAssert.assertAll();
    }
}
