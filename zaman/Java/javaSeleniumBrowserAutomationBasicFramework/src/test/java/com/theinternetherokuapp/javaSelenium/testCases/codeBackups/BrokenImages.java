package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImages {

    public void brokenImageValidation(List<WebElement> elements){
        int totalNumberOfBrokenImage = 0;
        for (WebElement brokenImage : elements) {
            String imageURL = brokenImage.getAttribute("src");
            try{
                URL url = new URL(imageURL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(5000);
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode != 200) {
                    System.out.println("Broken image found at" + imageURL);
                    totalNumberOfBrokenImage++;
                }
                connection.disconnect();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Total number of broken images = " + totalNumberOfBrokenImage );
    }
}
