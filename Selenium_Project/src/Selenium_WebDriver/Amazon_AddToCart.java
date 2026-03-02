package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddToCart {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox"))
              .sendKeys("iPhone 15");

        driver.findElement(By.id("nav-search-submit-button"))
              .click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone')])[1]"))
              .click();

        Thread.sleep(4000);

        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart-button"))
              .click();

        Thread.sleep(4000);

        driver.findElement(By.id("nav-cart"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.name("proceedToRetailCheckout"))
              .click();

        Thread.sleep(5000);

        System.out.println("Reached Checkout Page");

        driver.quit();
    }
}
