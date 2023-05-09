package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisappearingElements extends BasePage {

    public DisappearingElements(WebDriver driver){
        super(driver);
    }

    //Header validation
    @FindBy(css = "#content > div > h3")
    public WebElement disappearingElementsHeader;
    public WebElement getDisappearingElementsHeader() {
        return disappearingElementsHeader;
    }
    //Paragraph validation
    @FindBy(css = "#content > div > p")
    public WebElement disappearingElementsParagraph;
    public WebElement getDisappearingElementsParagraph() {
        return disappearingElementsParagraph;
    }

    //Home button
    @FindBy(css = "#content > div > ul > li:nth-child(1) > a")
    public WebElement homeButton;
    public WebElement getHomeButton() {
        return homeButton;
    }
    //About button
    @FindBy(css = "#content > div > ul > li:nth-child(2) > a")
    public WebElement aboutButton;
    public WebElement getAboutButton() {
        return aboutButton;
    }
    //Contact ua button
    @FindBy(css = "#content > div > ul > li:nth-child(3) > a")
    public WebElement contactUsButton;
    public WebElement getContactUsButton() {
        return contactUsButton;
    }
    //Portfolio button
    @FindBy(css = "#content > div > ul > li:nth-child(4) > a")
    public WebElement portfolioButton;
    public WebElement getPortfolioButton() {
        return portfolioButton;
    }
    //Gallery button
    @FindBy(css = "#content > div > ul > li:nth-child(5) > a")
    public WebElement galleryButton;
    public WebElement getGalleryButton() {
        return galleryButton;
    }





}
