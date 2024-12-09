package com.example;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PageObjectModel {

    private AppiumDriver driver;

    private By ok = By.id("android:id/button1");
    private By number1 = By.id("com.ulsumobile.calculator:id/iv_8");
    private By divide = By.id("com.ulsumobile.calculator:id/iv_chu");
    private By number2 = By.id("com.ulsumobile.calculator:id/iv_2");
    private By equal = By.id("com.ulsumobile.calculator:id/iv_deng");
    
    
    
    // Constructor to initialize AppiumDriver
    public PageObjectModel(AppiumDriver driver) {
        this.driver = driver;
    }
    
 // Implicit wait (for demo purposes, but explicit wait is recommended in many cases)
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public void okButton() {
    	waitForElementToBeVisible(ok, 20);
    	driver.findElement(ok).click();
    }



    public void button1() {
    	waitForElementToBeVisible(number1, 20); 
    	driver.findElement(number1).click();
    }
    
    public void divideBt() {
    	waitForElementToBeVisible(divide, 20);
    	driver.findElement(divide).click();
    }
    
    public void button2() {
    	waitForElementToBeVisible(number2, 20);
    	driver.findElement(number2).click();
    }
    
    public void equalButton() {
    	waitForElementToBeVisible(equal, 20);
    	driver.findElement(equal).click();
    }

    
}
