package TestNGMaven;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class IframeAssignment {

    @Test
    public void handleAdvancedControls() {

        WebDriver driver = null;
        WebDriverWait wait = null;

        try {

            // ✅ TODO 1: Initialize ChromeDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // ✅ TODO 2: Create WebDriverWait with 10 seconds timeout
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // =========================
            // 🔹 JavaScript Alert Handling
            // =========================

            // ✅ TODO 3: Navigate to JavaScript Alerts page
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // ✅ TODO 4: Click "Click for JS Alert" button
            WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
            alertButton.click();

            // ✅ TODO 5: Wait for alert to be present
            wait.until(ExpectedConditions.alertIsPresent());

            // ✅ TODO 6: Accept the alert
            Alert alert = driver.switchTo().alert();
            alert.accept();

            System.out.println("JS Alert handled successfully.");

            // =========================
            // 🔹 Window Handling
            // =========================

            // ✅ TODO 7: Navigate to Multiple Windows page
            driver.get("https://the-internet.herokuapp.com/windows");

            // ✅ TODO 9: Capture parent window handle
            String parentWindow = driver.getWindowHandle();

            // ✅ TODO 8: Click "Click Here" link
            driver.findElement(By.linkText("Click Here")).click();

            // ✅ TODO 10: Switch to newly opened window
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            Set<String> allWindows = driver.getWindowHandles();

            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

            System.out.println("Switched to new window: " + driver.getTitle());

            // =========================
            // 🔹 Iframe Handling
            // =========================

            // Navigate to iframe page
            driver.get("https://the-internet.herokuapp.com/iframe");

            // Wait until iframe is available and switch
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mce_0_ifr"));

            // Locate text editor inside iframe
            WebElement editor = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("tinymce"))
            );

            // Retrieve and print text content
            String text = editor.getText();
            System.out.println("Iframe Text Content: " + text);

            // Switch back to main content
            driver.switchTo().defaultContent();

            System.out.println("Iframe handled successfully.");

        } catch (Exception e) {

            // ✅ TODO 14: Handle exception
            System.out.println("Test failed due to exception: " + e.getMessage());
            e.printStackTrace();

        } finally {

            // ✅ TODO 15: Quit the browser
            if (driver != null) {
                driver.quit();
            }

            System.out.println("Browser closed successfully.");
        }
    }
}