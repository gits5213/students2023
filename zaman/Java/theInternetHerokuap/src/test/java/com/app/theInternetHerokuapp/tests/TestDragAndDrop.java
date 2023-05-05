package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.DragAndDropPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDragAndDrop extends BaseTest {


    @Story("gits-5223-Drag-AndDrop")
    @Description("Drag-AndDrop")
    @Test
    public void dragAndDrop (){

        DragAndDropPage dnd = new DragAndDropPage(driver);
        Actions actions = new Actions(driver);

        navigateTo(TestData.DRAG_AND_DROP_URL);
        switchToFrame(dnd.getIFrame());

        for (WebElement element: dnd.getGalleryPhotos()) {

            int i = dnd.getGalleryPhotos().size();
            actions.dragAndDrop(dnd.getGalleryPhotos().get(i-1), dnd.getTrash()).build().perform();
            sleepTest(500);

            if (dnd.getGalleryPhotos().size() == 0){
                System.out.println("All Images moved to trash");
                Assert.assertEquals(dnd.getGalleryPhotos().size(),0);
            }
        }

        sleepTest(2000);

        for (WebElement element: dnd.getTrashPhotos()){

            int i = dnd.getTrashPhotos().size();
            actions.dragAndDrop(dnd.getTrashPhotos().get(i-1), dnd.getGallery()).build().perform();
            sleepTest(500);

            if (dnd.getTrashPhotos().size() == 0){
                System.out.println("All Images moved to gallery");
                Assert.assertEquals(dnd.getTrashPhotos().size(),0);
            }
        }
    }
}
