package TestNGMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DBlogin {

    WebDriver driver;

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Using ID locator (NOT CSS Selector)
        WebElement userField = driver.findElement(By.id("username"));
        WebElement passField = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("submit"));

        userField.sendKeys(username);
        passField.sendKeys(password);
        loginBtn.click();

        System.out.println("Login with: " + username + " | " + password);

        Thread.sleep(3000);

        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] getDataFromDatabase() throws Exception {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String dbUser = "root";
        String dbPass = "123456789";

        Connection con = DriverManager.getConnection(url, dbUser, dbPass);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT username, password FROM login_data");

        List<Object[]> list = new ArrayList<>();

        while (rs.next()) {

            String username = rs.getString("username");
            String password = rs.getString("password");

            list.add(new Object[]{username, password});
        }

        con.close();

        Object[][] data = new Object[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }

        return data;
    }
}
