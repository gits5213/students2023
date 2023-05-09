package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.LargeAndDeepDOMPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestLargeAndDeepDOMPage extends BaseTest{


    @Story("gits-5242-Large-And-Deep-DOM-Page")
    @Description("Large-And-Deep-DOM-Page")
    @Test()
    public void largeAndDeepDOMPage(){

        LargeAndDeepDOMPage ld = new LargeAndDeepDOMPage(driver);
        clickOnElement(landingPage.getLargeAndDeepDOMPage());

        //Siblings
        System.out.println(ld.getSiblings().size());
        for (int i= 1; i<ld.getSiblings().size(); i++ ){
            WebElement siblings = ld.getSiblings().get(i);
            System.out.println(i + " >>> element " + siblings.getText());
        }

        //Table row
        System.out.println(ld.getTableRow().size());
        for (WebElement siblings:ld.getTableRow()){
            System.out.print(" " + siblings.getText());
        }

        //Table data
        System.out.println(ld.getTableData().size());
        for (WebElement siblings:ld.getTableData()){
            System.out.print(" " + siblings.getText());
        }

    }
}
