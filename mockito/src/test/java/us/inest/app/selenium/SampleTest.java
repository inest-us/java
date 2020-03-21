package us.inest.app.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SampleTest {
    @Test
    public void site_header_is_on_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        try {
            browser.get("https://www.saucelabs.com");
            WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
            assertTrue((href.isDisplayed()));
        } finally {
            browser.close();
        }
    }
}
