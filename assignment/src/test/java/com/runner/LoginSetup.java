package com.runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LoginSetup {

    private static AppiumDriver driver;

    @Before
    // Initialize the Appium driver
    public static void initializeDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            cap.setCapability(MobileCapabilityType.APP, "C:/Users/vijayaraghavanj/Documents/Mobile Auto/com.ulsumobile.calculator-1.1.apk");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), cap);
            System.out.println("Driver initialized");
        }
    }

    @After
    // Quit the driver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            System.out.println("Driver quit");
        }
    }

    // Get the current driver instance
    public static AppiumDriver getDriver() {
        return driver;
    }
}
