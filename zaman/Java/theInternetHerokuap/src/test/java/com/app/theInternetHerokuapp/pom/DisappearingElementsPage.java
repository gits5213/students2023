package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.List;

public class DisappearingElementsPage extends BasePage{

    public DisappearingElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(n) > a")
    public List<WebElement> numberofelements;
    public List<WebElement> getNumberofelements() {
        return numberofelements;
    }
}
