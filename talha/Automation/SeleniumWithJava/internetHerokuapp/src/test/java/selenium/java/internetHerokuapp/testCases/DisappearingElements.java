package selenium.java.internetHerokuapp.testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.pages.Disappearing_elements;
import selenium.java.internetHerokuapp.pages.TheInternet;
import selenium.java.internetHerokuapp.utilities.Data;

public class DisappearingElements extends BaseClass {
    @Test
    public void disappearingElements(){
        TheInternet ti = new TheInternet(driver);
        Disappearing_elements de = new Disappearing_elements(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        if(ti.getDisappearingElement().isDisplayed()){
            String disappearingElementText= ti.getDisappearingElement().getText();
            Assert.assertTrue(true,disappearingElementText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        ti.getDisappearingElement().click();
        sleepTest(2000);

        //TC-2 Corresponding Page URL Validation
        String disappearingElementBaseUrl = driver.getCurrentUrl();
        System.out.println(disappearingElementBaseUrl);
        Assert.assertEquals(disappearingElementBaseUrl, Data.BASE_URL+Data.DISAPPEARING_ELEMENTS);

        //TC-3 headerValidation
        if(de.getDisappearingElementsHeaderText().isDisplayed()){
            String disappearingElementHeaderText= de.getDisappearingElementsHeaderText().getText();
            Assert.assertTrue(true,disappearingElementHeaderText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        //TC-4 Paragraph Validation
        sleepTest(2000);
        if(de.getDisappearingElementsParagraphText().isDisplayed()){
            String disappearingElementParagraphText= de.getDisappearingElementsParagraphText().getText();
            Assert.assertTrue(true,disappearingElementParagraphText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        de.getHomeTab().click();
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);
        de.getAboutTab().click();
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);
        de.getContactUsTab().click();
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);
        de.getPortfolioTab().click();
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);
        driver.navigate().back();
        sleepTest(2000);

    }
}
