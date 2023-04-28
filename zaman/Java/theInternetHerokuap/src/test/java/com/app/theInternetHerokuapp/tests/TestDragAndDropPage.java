package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DragAndDropPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestDragAndDropPage extends BaseTest {


    @Story("gits-5223-Drag-AndDrop")
    @Description("Drag-AndDrop")
    @Test
    public void dragAndDrop (){

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        Actions actions = new Actions(driver);

        clickOnElement(landingPage.getDragAndDrop());

//        actions.dragAndDrop(dragAndDrop.getElementA(), dragAndDrop.getElementB());
//
//        actions.clickAndHold(dragAndDrop.getElementA())
//                .pause(Duration.ofSeconds(2))
//                .moveToElement(dragAndDrop.getElementB())
//                .pause(Duration.ofSeconds(2))
//                .release()
//                .build()
//                .perform();
//
//        sleepTest(4000);

//
//        switchToFrame(driver.findElement(By.cssSelector("div#content")));
        actions.dragAndDrop(dragAndDropPage.getElementA(),dragAndDropPage.getElementB()).build().perform();
        sleepTest(3000);
//        Assert.assertEquals(dragAndDrop.getColumnBText().getText(),"A");



    }
}
