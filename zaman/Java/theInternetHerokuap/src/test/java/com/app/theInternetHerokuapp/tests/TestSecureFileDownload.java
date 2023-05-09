package com.app.theInternetHerokuapp.tests;

import com.app.theInternetHerokuapp.pom.SecureFileDownloadPage;
import com.app.theInternetHerokuapp.utilities.TestData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TestSecureFileDownload extends BaseTest{



    @Story("gits-5246-Secure-FileDownload")
    @Description("Secure-FileDownload")
    @Test()
    public void secureFileDownload(){

        SecureFileDownloadPage sfd = new SecureFileDownloadPage(driver);
        clickOnElement(landingPage.getSecureFileDownload());

        digestAuthentication(sfd.getSecureFileDownloadMessage(),
                TestData.BASIC_AUTH_USERNAME,
                TestData.BASIC_AUTH_PASSWORD,
                TestData.SECURE_FILE_DOWNLOAD_LINK);
        assertText(sfd.getSecureFileDownloadMessage(), TestData.SECURE_FILE_DOWNLOAD_MESSAGE);

    }
}
