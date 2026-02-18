package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"user-name\"]"))
              .sendKeys("standard_user");

        driver.findElement(By.xpath("//*[@id=\"password\"]"))
              .sendKeys("secret_sauce");

        driver.findElement(By.xpath("//*[@id=\"login-button\"]"))
              .click();

        Thread.sleep(10000);

        String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("inventory")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}
