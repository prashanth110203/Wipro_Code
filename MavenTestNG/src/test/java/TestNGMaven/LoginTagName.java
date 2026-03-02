package TestNGMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTagName {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login");

        // get all input elements
        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        // first input = username
        inputs.get(0).sendKeys("student");

        // second input = password
        inputs.get(1).sendKeys("Password123");

        // get button using tag name
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        driver.quit();
    }
}
