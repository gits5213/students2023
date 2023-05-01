package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".demo-frame.lazyloaded")
    public WebElement iFrame;
    public WebElement getIFrame() {
        return iFrame;
    }

    @FindBy(css = "ul#gallery > li:nth-of-type(n)")
    public List<WebElement> galleryPhotos;
    public List<WebElement> getGalleryPhotos() {
        return galleryPhotos;
    }

    @FindBy(css = "#trash .gallery.ui-helper-reset > .ui-widget-content.ui-corner-tr.ui-draggable.ui-draggable-handle:nth-child(n)")
    public List<WebElement> trashPhotos;
    public List<WebElement> getTrashPhotos() {
        return trashPhotos;
    }

    @FindBy(css = "ul#gallery")
    public WebElement gallery;
    public WebElement getGallery() {
        return gallery;
    }

    @FindBy(css = "div#trash")
    public WebElement trash;
    public WebElement getTrash() {
        return trash;
    }
}
