package com.herokuapp.javaSeleniumAutomationTest.testCases;

import com.herokuapp.javaSeleniumAutomationTest.basicJava.BaseClass;
import com.herokuapp.javaSeleniumAutomationTest.basicJava.Internet;
import com.herokuapp.javaSeleniumAutomationTest.pages.Digest_Authentication;
import com.herokuapp.javaSeleniumAutomationTest.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuthentication extends BaseClass {

    @Test
    public void digestAuthentication() throws InterruptedException {
        // reference variable and creating object
        Internet ti = new Internet(driver);
        Digest_Authentication da = new Digest_Authentication(driver);

        //TestCase-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        Thread.sleep(2000);

        //TestCase-2 DigestAuthentication Text validation in Base page
        boolean displayed = ti.getDigestAuthentication().isDisplayed();// handle unexpected case
        if (displayed) {
            String digestAuthText = ti.getDigestAuthentication().getText();
            Assert.assertTrue(!digestAuthText.isEmpty());
            System.out.println(Data.POSETIVE_MASSAGE);
        } else if (!(displayed)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getDigestAuthentication().click();

        //TestCase-3 Value Pass On input Field
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
        Thread.sleep(2000);

        //TestCase-4 Header Validation
        boolean b = da.getHeader().isDisplayed();// handle unexpected case
        if (b) {
            String headerText = da.getHeader().getText();
            Assert.assertTrue(!headerText.isEmpty());
            System.out.println(Data.POSETIVE_MASSAGE);
        } else if (!(b)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        Thread.sleep(2000);

        //TestCase-5 Paragraph Validation
        boolean i = da.getParagraph().isDisplayed();// handle unexpected case
        if (i) {
            String paragraphText = da.getParagraph().getText();
            Assert.assertTrue(!paragraphText.isEmpty());
            System.out.println(Data.POSETIVE_MASSAGE);
        } else if (!(i)) {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        Thread.sleep(2000);

        //I want to navigate back to the previous pages in the browsing history of the current window or tab. In this case, the code navigates back twice, which means it will go back to the page visited two steps ago in the browsing history.
        driver.navigate().back();
        driver.navigate().back();

    }
}
