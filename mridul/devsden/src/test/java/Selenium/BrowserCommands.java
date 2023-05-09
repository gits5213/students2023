package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.reddit.com/");
        String url = driver.getCurrentUrl();
        driver.wait(1000);
        System.out.println(url);
        driver.findElement(By.cssSelector("<a href=\"https://tastytreatbd.com/fastfood-and-snacks/\" class=\"ty-menu__item-link\">\n" +
                "                        Fast food &amp; Snacks\n" +
                "                    </a>")).click();
        driver.wait(1000);
        String title  = driver.getTitle();
        System.out.println(title);

    }
}
