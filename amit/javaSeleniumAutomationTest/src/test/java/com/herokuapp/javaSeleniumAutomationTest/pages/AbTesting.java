package com.herokuapp.javaSeleniumAutomationTest.pages;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbTesting extends BasePage {

    public AbTesting(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath="//div[@id='content']//h3[.='A/B Test Variation 1']")
    public WebElement abTestingVariation1;
    public WebElement getabTestingVariation1(){

        return abTestingVariation1;
    }

    //AB test Control..........
    @FindBy(css="#content  div  h3")
    public WebElement abTestControl;
    public WebElement getAbTestControl (){

        return abTestControl;
    }
    //Paragraph............
    @FindBy(xpath="//div[@id='content']//p")
    public WebElement abTestingParagraph;
    public WebElement getAbTestingParagraph(){

        return  abTestingParagraph;
    }

}
