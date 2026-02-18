package TestNGMaven;

import org.testng.annotations.*;

public class AnnotationsDemo {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Executed once before entire suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Executed before <test> tag");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Executed once before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Executed before each @Test");
    }

    @Test
    public void testOne() {
        System.out.println("Test 1 Executed");
    }

    @Test
    public void testTwo() {
        System.out.println("Test 2 Executed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Executed after each @Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Executed once after class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Executed after <test> tag");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Executed once after entire suite");
    }
}
