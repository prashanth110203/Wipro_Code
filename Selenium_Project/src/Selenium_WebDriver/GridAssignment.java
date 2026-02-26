package Selenium_WebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class GridAssignment {

    @Parameters("browser")
    @Test
    public void gridTest(String browser) throws Exception {

        // TODO 1: Create DesiredCapabilities object
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // TODO 2: Set platform to WINDOWS
        capabilities.setPlatform(Platform.WINDOWS);

        // TODO 3: Set browser name based on parameter
        if (browser.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            capabilities.setBrowserName("firefox");
        } 
        else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        // TODO 4: Initialize RemoteWebDriver
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                capabilities
        );

        // TODO 5: Navigate to Google
        driver.get("https://www.google.com");

        // TODO 6: Capture page title
        String title = driver.getTitle();

        // TODO 7: Assert title contains "Google"
        Assert.assertTrue(title.contains("Google"),
                "Title does not contain Google. Actual title: " + title);

        // TODO 8: Quit browser
        driver.quit();
    }
}
