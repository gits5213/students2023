package com.gits.herokuapp.Pages;

import com.gits.herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSignUp extends BasePage {
    public LoginSignUp(WebDriver driver){
        super(driver);
    }

    //WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
    @FindBy(css = "div:nth-of-type(5) > a[role='button']")
    public WebElement createNewAccount;
    public WebElement getCreateNewAccount(){
        return createNewAccount;
    }

    @FindBy(css = "._6ltj > a")
    public WebElement forgetPassword;
    public WebElement getForgetPassword(){
        return forgetPassword;
    }


}
