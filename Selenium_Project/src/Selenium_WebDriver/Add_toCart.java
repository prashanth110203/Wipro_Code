package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_toCart {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='user-name']"))
              .sendKeys("performance_glitch_user");

        driver.findElement(By.xpath("//*[@id='password']"))
              .sendKeys("secret_sauce");

        driver.findElement(By.xpath("//*[@id='login-button']"))
              .click();

        Thread.sleep(3000);

        String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("inventory")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[2]"))
              .click();
        
//        driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[2]"))
//        .click();
//        
//        driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[5]"))
//        .click();
//
//        Thread.sleep(3000);

        driver.findElement(By.className("shopping_cart_link"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("checkout"))
              .click();

        Thread.sleep(4000);

        driver.findElement(By.id("first-name"))
              .sendKeys("Prashanth");

        driver.findElement(By.id("last-name"))
              .sendKeys("Kathi");

        driver.findElement(By.id("postal-code"))
              .sendKeys("600001");

        driver.findElement(By.id("continue"))
              .click();

        Thread.sleep(5500);

        driver.findElement(By.id("finish"))
              .click();

        Thread.sleep(6000);

        System.out.println("Order placed successfully!");

        driver.quit();
    }
}
