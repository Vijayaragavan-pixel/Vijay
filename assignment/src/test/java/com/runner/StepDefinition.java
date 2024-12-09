package com.runner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.example.PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.URL;
public class StepDefinition {

	private PageObjectModel pageObjectModel;
	//private SetUp SetUp;
	//private AppiumDriver driver;
	
	  public StepDefinition() throws MalformedURLException, URISyntaxException {
	        // Get the driver from Hooks and initialize PageObjectModel
	        this.pageObjectModel = new PageObjectModel(LoginSetup.getDriver());
	    }
 

    
    
    @Given("the user launching calculator application")
    public void openCalculatorApp() throws MalformedURLException, URISyntaxException {
    	
    	pageObjectModel.okButton();
    	pageObjectModel.okButton();
        // You can add logic here to ensure the app is opened (Appium will handle app launch if configured correctly)
        
    }

    @When("the user click on first number")
    public void enterFirstNumber() {
        pageObjectModel.button1();  // click the 1st number
    }
    
    
    @Then("the user click on divide button")
    public void division() {
    	pageObjectModel.divideBt(); // click '/' operator
    }
    
    @When("the user clcik on second number")
    public void enterSecondNumber() {
        pageObjectModel.button2();  // click 2nd number
    }

    
    @And("the user clcik on equal")
    public void equals() {
        pageObjectModel.equalButton();  // click equal button
    }

}
