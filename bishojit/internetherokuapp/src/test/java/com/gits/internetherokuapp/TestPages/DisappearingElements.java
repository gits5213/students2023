package com.gits.internetherokuapp.TestPages;

import com.gits.internetherokuapp.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisappearingElements extends BasePage {
    public DisappearingElements(WebDriver driver) {
        super(driver);
    }

    //HeaderText
    @FindBy(css = "#content > div > h3")
    public WebElement disappearingElementsHeaderText;

    public WebElement getDisappearingElementsHeaderText() {
        return disappearingElementsHeaderText;
    }

    //ParagraphText
    @FindBy(css = "#content > div > p")
    public WebElement disappearingElementsParagraphText;

    public WebElement getDisappearingElementsParagraphText() {
        return disappearingElementsParagraphText;
    }

    //Home Tab
    @FindBy(css = "#content > div > ul > li:nth-child(1) > a")
    public WebElement homeTab;

    public WebElement getHomeTab() {
        return homeTab;
    }

    //About Tab
    @FindBy(css = "#content > div > ul > li:nth-child(2) > a")
    public WebElement aboutTab;

    public WebElement getAboutTab() {
        return aboutTab;
    }

    //Contact Us Tab
    @FindBy(css = "#content > div > ul > li:nth-child(3) > a")
    public WebElement contactUsTab;

    public WebElement getContactUsTab() {
        return contactUsTab;
    }

    //Portfolio Tab
    @FindBy(css = "#content > div > ul > li:nth-child(4) > a")
    public WebElement portfolioTab;

    public WebElement getPortfolioTab() {
        return portfolioTab;
    }
}
