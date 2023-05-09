package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTesting extends BasePage {

    public ABTesting(WebDriver driver) {
        super(driver);
    }

    // A/B Test Variation 1
    @FindBy(css = "#content > div > h3")
    public WebElement abTestVariation1;
    public WebElement getAbTestVariation1() {
        return abTestVariation1;

    }


    //AB test Control
    @FindBy(css="#content > div > h3")
    public WebElement abTestControl;
    public WebElement getAbTestControl () {

        return abTestControl;
    }

    // Text Paragraph
    @FindBy(css = "#content > div > p")
    public WebElement abTestingParagraph;
    public WebElement getAbTestingParagraph() {
        return abTestingParagraph;
    }



}
