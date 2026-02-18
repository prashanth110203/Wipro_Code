package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchSeleniumScroll {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Step 2: Open Google
        driver.get("https://www.google.com");

        Thread.sleep(2000);

        // Step 3: Locate search box and search Selenium official website
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium official website");
        searchBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        // Step 4: Click Selenium official website link
        driver.findElement(By.partialLinkText("Selenium")).click();

        Thread.sleep(4000);

        // Step 5: Scroll website using Actions (without JavaScript)
        Actions actions = new Actions(driver);

        // Scroll down slowly
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        // Scroll to bottom
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(3000);

        // Scroll up to view menu
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(3000);

        System.out.println("Use case completed successfully.");

        // Browser stays open for viewing
    }
}
