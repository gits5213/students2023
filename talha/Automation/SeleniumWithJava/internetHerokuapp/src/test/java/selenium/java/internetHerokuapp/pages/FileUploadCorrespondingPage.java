package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;
public class FileUploadCorrespondingPage extends BasePage {


    public FileUploadCorrespondingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='File Uploaded!']")
    public WebElement  fileUploadCorrespondingPageHeader;
    public WebElement getFileUploadCorrespondingPageHeader() {
        return fileUploadCorrespondingPageHeader;
    }


}
