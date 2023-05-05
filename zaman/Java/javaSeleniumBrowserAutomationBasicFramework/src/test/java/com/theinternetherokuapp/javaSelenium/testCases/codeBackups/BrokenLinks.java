package com.theinternetherokuapp.javaSelenium.testCases.codeBackups;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BrokenLinks {

    public static void brokenLinks( List<WebElement> links) {

        //the Set method is used to store unique value in a hash set data structure(a method to avoid duplicates)
        Set<String> brokenLinkUrls = new HashSet<>();

        for (WebElement link : links) {

            try{
                String linkURL = link.getAttribute("href");
                URL url = new URL(linkURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                if(httpURLConnection.getResponseCode() != 200)
                {
                    brokenLinkUrls.add(linkURL + " " + httpURLConnection.getResponseCode() + httpURLConnection.getResponseMessage());
                }
                httpURLConnection.disconnect();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        for (String brokenLinkUrl : brokenLinkUrls) {
            System.err.println(brokenLinkUrl);

        }
    }

//    				System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
//                  System.err.println(linkURL + " - " + httpURLConnection.getResponseCode() + " - " + httpURLConnection.getResponseMessage());

    public static void brokenLinksWithProxy( List<WebElement> links) {

        //the Set method is used to store unique value in a hash set data structure(a method to avoid duplicates)
        Set<String> brokenLinkUrls = new HashSet<>();

        for (WebElement link : links) {

            try{
                String linkURL = link.getAttribute("href");
                Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80));
                URL url = new URL(linkURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                if(httpURLConnection.getResponseCode() != 200)
                {
                    brokenLinkUrls.add(linkURL + " " + httpURLConnection.getResponseCode() + httpURLConnection.getResponseMessage());
                }
                httpURLConnection.disconnect();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        for (String brokenLinkUrl : brokenLinkUrls) {
            System.err.println(brokenLinkUrl);

        }
    }
}
