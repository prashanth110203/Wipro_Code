package StepDef;

import io.cucumber.java.en.*;
import io.cucumber.java.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class DDlogin {

    WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("I open the login page")
    public void i_open_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @And("I enter {string} and {string}")
    public void i_enter_credentials(String username, String password) {
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should see {string}")
    public void i_should_see(String result) {

        if(result.equalsIgnoreCase("success")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        } else {
            Assert.assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
        }
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}