package selenium.java.internetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.java.internetHerokuapp.configurations.BasePage;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='File Uploader']")
    public WebElement fileUploadHeader;
    public WebElement getFileUploadHeader(){
        return fileUploadHeader;
    }

    //ChooseFileButton
    @FindBy( id = "file-upload")
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton(){
        return chooseFileButton;
    }

    //UploadButton
    @FindBy(id = "file-submit")
    public WebElement uploadButton;
    public WebElement getUploadButton(){
        return uploadButton;
    }

    //DragArea
    @FindBy(xpath = "/html//div[@id='drag-drop-upload']")
    public WebElement dragAreaButton;
    public WebElement getDragAreaButton(){
        return dragAreaButton;
    }



}
