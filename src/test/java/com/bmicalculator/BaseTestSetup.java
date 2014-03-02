package com.bmicalculator;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import static org.junit.Assert.fail;

/**
 * This class contains variables and methods common to the other test classes in this package
 */

public class BaseTestSetup {

    public static WebDriver driver;
    public static StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
