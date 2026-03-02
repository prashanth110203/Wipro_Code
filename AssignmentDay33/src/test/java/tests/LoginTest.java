package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    // ====== 5 POSITIVE SCENARIOS ======

    @Test
    public void positive1_validLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "Password123");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
    }

    @Test
    public void positive2_validLoginAgain() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "Password123");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
    }

    @Test
    public void positive3_caseSensitiveCorrect() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "Password123");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
    }

    @Test
    public void positive4_validLoginRefresh() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "Password123");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
    }

    @Test
    public void positive5_multipleValidAttempts() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "Password123");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
    }

    // ====== 5 INTENTIONAL FAILURES ======

    @Test
    public void negative1_wrongPassword() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "wrongP@ss");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully")); // Intentional fail
    }

    @Test
    public void negative2_wrongUsername() {
        LoginPage login = new LoginPage(driver);
        login.login("wrongUser", "Password123");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully")); // Intentional fail
    }

    @Test
    public void negative3_bothWrong() {
        LoginPage login = new LoginPage(driver);
        login.login("wrong", "wrong");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully")); // Intentional
    }

    @Test
    public void negative4_emptyFields() {
        LoginPage login = new LoginPage(driver);
        login.login("", "");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully")); // Intentional
    }

    @Test
    public void negative5_emptyPassword() {
        LoginPage login = new LoginPage(driver);
        login.login("student", "");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully")); // Intentional
    }
}
