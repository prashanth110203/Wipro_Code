package Selenium_WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGrid {

    @Parameters("browser")
    @Test
    public void gridTest(String browser) throws Exception {

        WebDriver driver;

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.setPlatformName("Windows");

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    options
            );

        } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            options.setPlatformName("Windows");

            driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);

        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("Google"),
                "Title does not contain Google. Actual title: " + title);

        driver.quit();
    }
}
